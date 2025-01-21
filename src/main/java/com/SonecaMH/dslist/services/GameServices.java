package com.SonecaMH.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SonecaMH.dslist.dto.GameMinDTO;
import com.SonecaMH.dslist.entities.Game;
import com.SonecaMH.dslist.repositories.GameRepository;

@Service
public class GameServices {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	

}
