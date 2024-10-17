package org.example.exercicetdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class FibTest {

    @Test
    public void whenRangeEst1_thenResultatContientUniquement0() {
        // Arrange (Préparation)
        Fib fib = new Fib(1);

        // Act (Action)
        List<Integer> resultat = fib.getFibSeries();

        // Assert (Vérification)
        assertFalse(resultat.isEmpty(), "Le résultat ne doit pas être vide.");
        assertEquals(List.of(0), resultat, "Le résultat doit contenir uniquement {0}.");
    }

    @Test
    public void whenRangeEst6_thenResultatContientValeursAttendues() {
        // Arrange (Préparation)
        Fib fib = new Fib(6);

        // Act (Action)
        List<Integer> resultat = fib.getFibSeries();

        // Assert (Vérification)
        assertTrue(resultat.contains(3), "Le résultat doit contenir le chiffre 3.");
        assertEquals(6, resultat.size(), "Le résultat doit contenir exactement 6 éléments.");
        assertFalse(resultat.contains(4), "Le résultat ne doit pas contenir le chiffre 4.");
        assertEquals(List.of(0, 1, 1, 2, 3, 5), resultat, "Le résultat doit être {0, 1, 1, 2, 3, 5}.");
    }

    @Test
    public void whenRangeEst6_thenResultatEstTrieParOrdreCroissant() {
        // Arrange (Préparation)
        Fib fib = new Fib(6);

        // Act (Action)
        List<Integer> resultat = fib.getFibSeries();

        // Assert (Vérification)
        for (int i = 0; i < resultat.size() - 1; i++) {
            assertTrue(resultat.get(i) <= resultat.get(i + 1), "Le résultat doit être trié par ordre croissant.");
        }
    }
}

