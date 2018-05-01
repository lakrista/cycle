package com.lakrista.cycle.repository;

import com.lakrista.cycle.model.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListRepository extends JpaRepository<List, Long> {

    List findByTitle(String title);
}
