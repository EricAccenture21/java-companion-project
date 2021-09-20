'use strict';

angular.module('GameApp').controller('GameController',
		[ 'GameService', function(GameService) {
			var vm = this;
			vm.game = {
				id : '',
				name : '',
				genre : ''
			};
			vm.games = [];

			vm.fetchAllGames = function(){
				
				
				console.log("fetchAllGamesRan")
				GameService.fetchAllGames().then(function(data){
					vm.games = data;
				}).finally( function(){
					vm.game = {};
				});
			}

			vm.addGame = function(){
				return GameService.createGame(vm.game).then( function(){
				vm.fetchAllGames();
				});
			}
			
			vm.loadUpadate = function(gameToUpdate){
				vm.game = angular.copy(gameToUpdate);
			}
			
			vm.updateGame = function(){
			 return GameService.updateGame(vm.game).then( function(){
				vm.fetchAllGames();
				});
				
			}

			vm.fetchAllGames();
				
		 }]);