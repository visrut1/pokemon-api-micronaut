package com.example.pokemon;

import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class PokemonRepository {
    private final List<Pokemon> store;

    public PokemonRepository() {
        store = new ArrayList<>();
        store.add(new Pokemon(1, "Pikachu", "https://abc.com", "Thunder"));
        store.add(new Pokemon(1, "Bulbasaur", "https://abc.com", "Thunder"));
    }

    public List<Pokemon> get() {
        return store;
    }
}
