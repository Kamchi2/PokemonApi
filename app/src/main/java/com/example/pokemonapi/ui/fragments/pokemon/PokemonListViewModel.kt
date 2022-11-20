package com.example.pokemonapi.ui.fragments.pokemon

import com.example.pokemonapi.base.BaseViewModel
import com.example.pokemonapi.data.repositorys.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor(private val repository: PokemonRepository) :
    BaseViewModel() {

    fun fetchPokemonName() = repository.fetchPokemons()

}
