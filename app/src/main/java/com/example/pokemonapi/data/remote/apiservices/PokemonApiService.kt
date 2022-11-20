package com.example.pokemonapi.data.remote.apiservices

import com.example.pokemonapi.models.PokemonModel
import com.example.pokemonapi.models.PokemonResponse
import retrofit2.http.GET

interface PokemonApiService {

    @GET("pokemon")
    suspend fun fetchPokemons(): PokemonResponse<PokemonModel>
}
