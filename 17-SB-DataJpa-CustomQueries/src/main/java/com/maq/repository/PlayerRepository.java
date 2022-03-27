package com.maq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maq.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}