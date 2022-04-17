package com.maq.repository;

import org.springframework.data.repository.CrudRepository;

import com.maq.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer>{
}