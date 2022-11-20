package com.example.pokemonapi.ui.adapters.pokemon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.loadAny
import com.example.pokemonapi.base.BaseDiffUtilItemCallback
import com.example.pokemonapi.databinding.ItemPokemonBinding
import com.example.pokemonapi.models.PokemonModel

class PokemonListAdapter :
    ListAdapter<PokemonModel, PokemonListAdapter.PokemonViewHolder>(BaseDiffUtilItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder =
        PokemonViewHolder(
            ItemPokemonBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    class PokemonViewHolder(private val binding: ItemPokemonBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: PokemonModel) {
            binding.pokemonNameTv.text = model.name
        }

    }
}