package com.mynotes.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Repository
@RequestMapping("/")
public class NoteController {

    private final Logger LOG = LoggerFactory.getLogger(NoteController.class);

    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository){
        this.noteRepository = noteRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Note> getAllNotes(){
        LOG.info("Getting all notes");
        return noteRepository.findAll();
    }
}
