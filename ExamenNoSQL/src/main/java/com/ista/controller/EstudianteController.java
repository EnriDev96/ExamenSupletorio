package com.ista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.model.Estudiante;
import com.ista.service.EstudianteService;

@ComponentScan
@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {
	@Autowired
	EstudianteService EstudianteService;

    @GetMapping("/listar")
    public ResponseEntity<List<Estudiante>> listar() {
        return new ResponseEntity<>(EstudianteService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Estudiante> crear(@RequestBody Estudiante obj) {
        return new ResponseEntity<>(EstudianteService.save(obj), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Estudiante> actualizar(@PathVariable Long id, @RequestBody Estudiante obj) {
    	Estudiante objEncontrado = EstudianteService.findById(id);
        if (objEncontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
            	objEncontrado.setNombre(obj.getNombre());
            	objEncontrado.setApellido(obj.getApellido());
            	objEncontrado.setCelular(obj.getCelular());
            	objEncontrado.setCorreo(obj.getCorreo());
            	objEncontrado.setDireccion(obj.getDireccion());
            	objEncontrado.setListCiclo(obj.getListCiclo());
                return new ResponseEntity<>(EstudianteService.save(obj), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Estudiante> eliminar(@PathVariable Long id) {
    	EstudianteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
