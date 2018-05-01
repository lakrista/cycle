package com.lakrista.cycle.service;

import com.lakrista.cycle.model.Note;
import com.lakrista.cycle.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    @Autowired
    NoteRepository noteRepository;

    public List<Note> getAll() {
        return noteRepository.findAll();
    }

    public Note save(Note note) {
        return noteRepository.save(note);
    }

    public void delete(Note note) {
        noteRepository.delete(note);
    }

    public Optional<Note> getNote(Long id) {
        return noteRepository.findById(id);
    }
}
