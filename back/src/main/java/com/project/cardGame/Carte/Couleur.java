package com.project.cardGame.Carte;

import java.util.ArrayList;

public enum Couleur {
    CARREAUX,
    COEUR,
    PIQUE,
    TREFLE;

    public static ArrayList<Couleur> getOrdreCouleur() {

        ArrayList<Couleur> ordre = new ArrayList<>();
        ordre.add(CARREAUX);
        ordre.add(COEUR);
        ordre.add(PIQUE);
        ordre.add(TREFLE);
        return ordre;
    }

}
