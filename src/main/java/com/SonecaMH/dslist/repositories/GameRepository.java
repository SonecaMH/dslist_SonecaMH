package com.SonecaMH.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SonecaMH.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	List<Game> findAll();

}
