package com.example.pokemonapi.data.repositorys

import com.example.pokemonapi.base.BaseRepository
import com.example.pokemonapi.data.remote.apiservices.PokemonApiService
import javax.inject.Inject

class PokemonRepository @Inject constructor(private val service: PokemonApiService): BaseRepository() {

    fun fetchPokemons() = doRequest {
        service.fetchPokemons()
    }

}