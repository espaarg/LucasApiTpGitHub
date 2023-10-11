package com.facu.LucasAPITp.controllers;

import com.facu.LucasAPITp.entities.Autor;
import com.facu.LucasAPITp.entities.Persona;
import com.facu.LucasAPITp.services.AutorServiceImpl;
import com.facu.LucasAPITp.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "*")
@RequestMapping(path = "ap1/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{

}
