package com.montaury.pokebagarre.metier;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PokemonTest {

    // Version avec asset that
    @Test
    void test_est_vainqueur_contre_deuxieme_pokemon_devrait_gagner_avec_attaque_v2() {
        // Given
        Pokemon pokemonUn = new Pokemon("PokemonUn", "", new Stats(10,20));
        Pokemon pokemonDeux = new Pokemon("PokemonDeux", "", new Stats(30,5));

        // When
        boolean pokemonDeuxGagnant = pokemonDeux.estVainqueurContre(pokemonUn);

        // Then
        assertThat(pokemonDeuxGagnant).isTrue();
    }
    @Test
    void test_est_vainqueur_contre_deuxieme_pokemon_devrait_gagner_avec_defence_v2() {
        // Given
        Pokemon pokemonUn = new Pokemon("PokemonUn", "", new Stats(10,10));
        Pokemon pokemonDeux = new Pokemon("PokemonDeux", "", new Stats(10,5));

        // When
        boolean pokemonUnGagnant = pokemonUn.estVainqueurContre(pokemonDeux);

        // Then
        assertThat(pokemonUnGagnant).isTrue();
    }
    @Test
    void test_est_vainqueur_contre_deuxieme_pokemon_devrait_gagner_grace_a_sa_position_v2() {
        // Given
        Pokemon pokemonUn = new Pokemon("PokemonUn", "", new Stats(30,20));
        Pokemon pokemonDeux = new Pokemon("PokemonDeux", "", new Stats(30,20));

        // When
        boolean pokemonUnGagnant = pokemonUn.estVainqueurContre(pokemonDeux);

        // Then
        assertThat(pokemonUnGagnant).isTrue();
    }

    // Négatif
    @Test
    void test_est_vainqueur_contre_deuxieme_pokemon_devrait_perdre_attaque_v2() {
        // Given
        Pokemon pokemonUn = new Pokemon("PokemonUn", "", new Stats(10,20));
        Pokemon pokemonDeux = new Pokemon("PokemonDeux", "", new Stats(30,5));

        // When
        boolean pokemonUnGagnant = pokemonUn.estVainqueurContre(pokemonDeux);

        // Then
        assertThat(pokemonUnGagnant).isFalse();
    }
    @Test
    void test_est_vainqueur_contre_deuxieme_pokemon_devrait_perdre_a_cause_de_defencev2() {
        // Given
        Pokemon pokemonUn = new Pokemon("PokemonUn", "", new Stats(10,10));
        Pokemon pokemonDeux = new Pokemon("PokemonDeux", "", new Stats(10,5));

        // When
        boolean pokemonDeuxGagnant = pokemonDeux.estVainqueurContre(pokemonUn);

        // Then
        assertThat(pokemonDeuxGagnant).isFalse();
    }
}


