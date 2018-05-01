package com.lakrista.cycle.service;

import com.lakrista.cycle.model.List;
import com.lakrista.cycle.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListService {

    @Autowired
    ListRepository listRepository;

    public java.util.List<List> getAll() {
        return listRepository.findAll();
    }

    public List save(List list) {
        return listRepository.save(list);
    }

    public void delete(List list) {
        listRepository.delete(list);
    }

    public Optional<List> getList(Long id) {
        return listRepository.findById(id);
    }

}
