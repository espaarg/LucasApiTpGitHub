package com.facu.LucasAPITp.services;

import com.facu.LucasAPITp.entities.Persona;
import com.facu.LucasAPITp.repositories.BaseRepository;
import com.facu.LucasAPITp.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;


    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
