//Camada de Serviço
package com.michelotavio.springcurse.services;

import com.michelotavio.springcurse.domain.Categoria;
import com.michelotavio.springcurse.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {
       Optional<Categoria> obj = repo.findById(id);
       return  obj.orElse(null);
    }
}
