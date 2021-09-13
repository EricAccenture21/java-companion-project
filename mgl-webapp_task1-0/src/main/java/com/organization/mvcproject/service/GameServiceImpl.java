  package com.organization.mvcproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.organization.mvcproject.model.Game;

@Service
public class GameServiceImpl implements GameService {

		@Autowired
		private MockGmaeDAC mockGameDAC; 
		


	@Override
	public List<Game> retrieveAllGames() {
		return games;
	}

	@Override
	public Game saveGame(Game game) {
		return mockGameDAC.saveGame(game);
	}
	
	public boolean deleteGame(Long gameID) {
		return 
	}

}