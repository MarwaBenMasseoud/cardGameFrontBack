package com.project.cardGame.Carte;

import java.util.ArrayList;

public enum Valeur {
    AS,
    DEUX,
    TROIS,
    QUATRE,
    CINQ,
    SIX,
    SEPT,
    HUIT,
    NEUF,
    DIX,
    DAME,
    VALET,
    ROI;

    public static ArrayList<Valeur> getOrdreValeur() {

        ArrayList<Valeur> ordre = new ArrayList<>();
        ordre.add(DEUX);
        ordre.add(CINQ);
        ordre.add(DIX);
        ordre.add(HUIT);
        ordre.add(SIX);
        ordre.add(SEPT);
        ordre.add(QUATRE);
        ordre.add(AS);
        ordre.add(TROIS);
        ordre.add(NEUF);
        ordre.add(DAME);
        ordre.add(ROI);
        ordre.add(VALET);

        return ordre;
    }

}
