package com.javarush.lectures.databaseschool.repository;

import com.javarush.lectures.databaseschool.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer>  {
}