package com.lakrista.cycle.controller;

import com.lakrista.cycle.exception.HttpNotFoundException;
import com.lakrista.cycle.model.List;
import com.lakrista.cycle.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class ListController {

    @Autowired
    ListService listService;

    @GetMapping("/lists")
    public java.util.List<List> getAllList() {
        return listService.getAll();
    }

    @PostMapping("/lists")
    public List createList(@Valid @RequestBody List list) {
        return listService.save(list);
    }

    @GetMapping("/lists/{id}")
    public List getListById(@PathVariable(value = "id") Long listId) {
        return listService.getList(listId).orElseThrow(() -> new HttpNotFoundException("List", "id", listId));
    }

    @PutMapping("/lists/{id}")
    public List updateList(@PathVariable(value = "id") Long listId, @Valid @RequestBody List listObject) {
        List list = listService.getList(listId).orElseThrow(() -> new HttpNotFoundException("List", "id", listId));
        list.setTitle(listObject.getTitle());
        list.setItems(listObject.getItems());

        return listService.save(list);
    }

    @DeleteMapping("/lists/{id}")
    public ResponseEntity<?> deleteList(@PathVariable(value = "id") Long listId) {
        List list = listService.getList(listId).orElseThrow(() -> new HttpNotFoundException("List", "id", listId));
        listService.delete(list);

        return ResponseEntity.ok().build();
    }
}
