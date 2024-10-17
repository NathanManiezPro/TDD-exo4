package org.example.exercicetdd.Exercice4;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public class RechercheVille {
    private List<String> villes = List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver",
            "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok",
            "Hong Kong", "Dubaï", "Rome", "Istanbul");

    public List<String> rechercher(String mot) throws NotFoundException {
        if (mot.length() < 2) {
            throw new NotFoundException("Le texte de la recherche doit contenir au moins 2 caractères.");
        }
        return List.of();
    }
}
