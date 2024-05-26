package com.homeproject.sprintboardbackend.repository;

import com.homeproject.sprintboardbackend.model.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Story, Long> {
}
