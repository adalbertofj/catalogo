package com.adalberto.catalogo.service.serviceimpl;

import java.util.List;

import com.adalberto.catalogo.model.Musica;

public interface CatalogoService {
    List<Musica> findAll();
    Musica findById(long id);
    Musica save(Musica musica);
    void excluir(long id);
    }
