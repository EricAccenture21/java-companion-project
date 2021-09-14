package com.organization.mvcproject.repo;

import java.util.ArrayList;
import java.util.List;

import com.organization.mvcproject.model.Game;

public class MockGameDAC {
	private static Long gameId = new Long(0);
	private static Long companyId = new Long(0);
	private static List<Game> games = new ArrayList<Game>();

	static {
		games = populateGames();
	}

	private static List<Game> populateGames() {

		Game game1 = new Game();
		game1.setId(++gameId);
		game1.setGenre("Sport");
		game1.setName("Rocket League");

		Game game2 = new Game();
		game2.setId(++gameId);
		game2.setGenre("Shooter");
		game2.setName("Halo 3");

		Game game3 = new Game();
		game3.setId(++gameId);
		game3.setGenre("MMORPG");
		game3.setName("Runescape");

		games.add(game1);
		games.add(game2);
		games.add(game3);

		return games;
	}
	
	public List<Game> getGames() {
		return games;
	}

	
	public Game saveGame(Game game) {
		if(game.getId() != null);
		Game foundGame = findGameById(game.getId());
		if (foundGame != null) {
			for(int i = 0; i < games.size(); i++) {
				if(game.getId().equals(games.get(i))) {
					return games.set(i,  foundGame);
				}
			}
		}
		game.setId(++gameId);
		games.add( game);
		return game;
	}
	public Game findGameById(Long id) {
		for(Game g: games) {
			if(id.equals(g.getId())) {
				return g;
			}
		}
		return null;
	}

	/**
	 * 
	 * 
	 * @param Id
	 * @return
	 */
	public boolean deleteGame(Long Id) {
		for(int i = 0; i < games.size(); i++) {
			if( gameId.equals(games.get(i).getId())) {
				return games.remove(games.get(i));
			}
		}
		return false;
	}



}
