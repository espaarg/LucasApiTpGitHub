package com.facu.LucasAPITp.services;

import com.facu.LucasAPITp.entities.Autor;
import com.facu.LucasAPITp.repositories.BaseRepository;
import com.facu.LucasAPITp.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
