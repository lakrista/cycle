package com.lakrista.cycle.controller;

import com.lakrista.cycle.exception.HttpNotFoundException;
import com.lakrista.cycle.model.Note;
import com.lakrista.cycle.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    NoteService noteService;

    @GetMapping("/notes")
    public List<Note> getAllNotes() {
        return noteService.getAll();
    }

    @PostMapping("/notes")
    public Note createNote(@Valid @RequestBody Note note) {
        return noteService.save(note);
    }

    @GetMapping("/notes/{id}")
    public Note getNoteById(@PathVariable(value = "id") Long noteId) {
        return noteService.getNote(noteId).orElseThrow(() -> new HttpNotFoundException("Note", "id", noteId));
    }

    @PutMapping("/notes/{id}")
    public Note updateNote(@PathVariable(value = "id") Long noteId, @Valid @RequestBody Note noteObject) {
        Note note = noteService.getNote(noteId).orElseThrow(() -> new HttpNotFoundException("Note", "id", noteId));
        note.setTitle(noteObject.getTitle());
        note.setText(noteObject.getText());

        return noteService.save(note);
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
        Note note = noteService.getNote(noteId).orElseThrow(() -> new HttpNotFoundException("Note", "id", noteId));
        noteService.delete(note);

        return ResponseEntity.ok().build();
    }
}
