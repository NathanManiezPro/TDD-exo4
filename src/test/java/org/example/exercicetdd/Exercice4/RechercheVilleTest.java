package org.example.exercicetdd.Exercice4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import java.util.List;


public class RechercheVilleTest {

    @Test
    public void whenRechercheTextEstInferieurA2Carac_thenThrowNotFoundException() {
        // Arrange
        RechercheVille rechercheVille = new RechercheVille();

        // Act & Assert
        assertThrows(NotFoundException.class, () -> rechercheVille.rechercher("A"),
                "Une exception doit être levée pour une recherche de moins de 2 caractères.");
    }
    @Test
    public void whenTexteRechercheAAuMoins2Caractères_thenReturnVille() throws NotFoundException {
        // Arrange
        RechercheVille rechercheVille = new RechercheVille();

        // Act
        List<String> result = rechercheVille.rechercher("Va");

        // Assert
        assertEquals(List.of("Valence", "Vancouver"), result, "La recherche 'Va' doit retourner Valence et Vancouver.");
    }

}
