package com.facu.LucasAPITp.repositories;



import com.facu.LucasAPITp.entities.Persona;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long>{



    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);


    @Query(value = "Select p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro% ")
    List<Persona> search(@Param("filtro") String filtro);

    @Query(value = "Select p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro% ")
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);

    @Query(value = "Select * FROM Persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro% ",
            nativeQuery = true
    )
    List<Persona> searchNativo(@Param("filtro")  String filtro);

    @Query(value = "Select * FROM Persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro% ",
            countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true
    )
    Page<Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);


}
