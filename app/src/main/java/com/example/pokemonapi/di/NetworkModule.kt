package com.example.pokemonapi.di

import com.example.pokemonapi.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun providePokemonApiService(retrofitClient: RetrofitClient) = retrofitClient.providePokemonApiService()

    @Singleton
    @Provides
    fun provideRetrofitClient() = RetrofitClient()

}