package com.homeproject.sprintboardbackend.model;

public enum StoryState {
    OPEN("Open"),
    READY("Ready"),
    IMPLEMENTATION("Implementation"),
    DONE("Done");

    private final String state;

    StoryState(final String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
