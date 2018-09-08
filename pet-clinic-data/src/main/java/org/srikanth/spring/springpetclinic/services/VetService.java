package org.srikanth.spring.springpetclinic.services;

import org.srikanth.spring.springpetclinic.model.Pet;
import org.srikanth.spring.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
