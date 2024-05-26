package com.homeproject.sprintboardbackend.service;

import com.homeproject.sprintboardbackend.model.Story;
import com.homeproject.sprintboardbackend.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(final BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<Story> getAllStories(){
        return boardRepository.findAll();
    }
}
