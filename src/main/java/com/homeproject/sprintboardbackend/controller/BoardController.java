package com.homeproject.sprintboardbackend.controller;


import com.homeproject.sprintboardbackend.model.Story;
import com.homeproject.sprintboardbackend.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class BoardController {

    private final BoardService boardService;

    public BoardController(final BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/stories")
    public List<Story> getAllStories(){
        return boardService.getAllStories();
    }
}
