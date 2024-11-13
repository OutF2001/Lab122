package com.tecsup.petclinic.repositories;

import com.tecsup.petclinic.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {

    List<Owner> findByFirstName(String firstName);

    List<Owner> findByCity(String city);

    List<Owner> findByTelephone(String telephone);

    @Override
    List<Owner> findAll();

}
