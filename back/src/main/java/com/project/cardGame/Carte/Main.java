package com.project.cardGame.Carte;

import java.util.ArrayList;

public class Main {
    ArrayList<Carte> main = new ArrayList<>();

    public void ajouter(Carte carte) {
        main.add(carte);
    }

    public ArrayList<Carte> afficherMain() {
        return main;
    }


}
