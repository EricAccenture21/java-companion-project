  package com.organization.mvcproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.mvcproject.model.Game;
import com.organization.mvcproject.repo.MockGameDAO;

@Service
public class GameServiceImpl implements GameService {

		@Autowired
		private MockGameDAO mockGameDAC; 
		


	@Override
	public List<Game> retrieveAllGames(){
		return mockGameDAC.getGames();
	}

	@Override
	public Game saveGame(Game game) {
		return mockGameDAC.saveGame(game);
	}
	
	public boolean deleteGame(Long id) {
		return mockGameDAC.deleteGame(id);
	}
	
	public Game findgameById(Long id) {
		return mockGameDAC.findGameById(id);
	}

}