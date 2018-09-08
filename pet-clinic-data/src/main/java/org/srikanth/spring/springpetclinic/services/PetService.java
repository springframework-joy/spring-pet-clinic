package org.srikanth.spring.springpetclinic.services;

import org.srikanth.spring.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
