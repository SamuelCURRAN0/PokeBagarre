package com.montaury.pokebagarre.metier;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PokemonTest {
    @Test
    void test_est_vainqueur_contre_deuxieme_pokemon_devrait_gagner_avec_attaque() {
        // Given
        Pokemon pokemonUn = new Pokemon("PokemonUn", "", new Stats(10,20));
        Pokemon pokemonDeux = new Pokemon("PokemonDeux", "", new Stats(30,5));

        // When
        boolean pokemonDeuxGagnant = pokemonDeux.estVainqueurContre(pokemonUn);

        // Then
        assert pokemonDeuxGagnant;
    }

    @Test
    void test_est_vainqueur_contre_deuxieme_pokemon_devrait_gagner_avec_defence() {
        // Given
        Pokemon pokemonUn = new Pokemon("PokemonUn", "", new Stats(10,10));
        Pokemon pokemonDeux = new Pokemon("PokemonDeux", "", new Stats(10,5));

        // When
        boolean pokemonUnGagnant = pokemonUn.estVainqueurContre(pokemonDeux);

        // Then
        assert pokemonUnGagnant;
    }

    @Test
    void test_est_vainqueur_contre_deuxieme_pokemon_devrait_gagner_grace_a_sa_position() {
        // Given
        Pokemon pokemonUn = new Pokemon("PokemonUn", "", new Stats(30,20));
        Pokemon pokemonDeux = new Pokemon("PokemonDeux", "", new Stats(30,20));

        // When
        boolean pokemonUnGagnant = pokemonUn.estVainqueurContre(pokemonDeux);

        // Then
        assert pokemonUnGagnant;
    }

}


