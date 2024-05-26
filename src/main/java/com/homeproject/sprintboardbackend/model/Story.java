package com.homeproject.sprintboardbackend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "stories", schema = "sprintboard")
public class Story {

    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "story_state")
    private StoryState storyState;

    @Column(name = "title")
    private String title;
}
