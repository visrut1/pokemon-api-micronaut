package com.example.pokemon;

import io.micronaut.http.annotation.Get;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class PokemonService {
    PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> get() {
        return pokemonRepository.get();
    }
}
