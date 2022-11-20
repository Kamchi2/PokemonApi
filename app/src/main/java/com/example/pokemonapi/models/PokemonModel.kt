package com.example.pokemonapi.models

import com.example.pokemonapi.base.IBaseDiffModel
import com.google.gson.annotations.SerializedName

data class PokemonModel(
    @SerializedName("id")
    override val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String,
): IBaseDiffModel<Int>