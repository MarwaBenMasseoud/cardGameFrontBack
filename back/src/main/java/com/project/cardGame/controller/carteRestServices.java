package com.project.cardGame.controller;

import com.project.cardGame.Carte.Carte;
import com.project.cardGame.Carte.Couleur;
import com.project.cardGame.Carte.Main;
import com.project.cardGame.Carte.Valeur;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.stream.Collectors;
@CrossOrigin("*")
@RestController
public class carteRestServices {

    @GetMapping(value = "/main", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Carte> listCarteNonTriee() {
        Main main = new Main();
        main.ajouter(new Carte(Couleur.CARREAUX, Valeur.SIX));
        main.ajouter(new Carte(Couleur.PIQUE, Valeur.DIX));
        main.ajouter(new Carte(Couleur.COEUR, Valeur.DEUX));
        main.ajouter(new Carte(Couleur.TREFLE, Valeur.HUIT));
        main.ajouter(new Carte(Couleur.COEUR, Valeur.SIX));
        main.ajouter(new Carte(Couleur.CARREAUX, Valeur.DIX));
        main.ajouter(new Carte(Couleur.TREFLE, Valeur.DEUX));
        main.ajouter(new Carte(Couleur.CARREAUX, Valeur.HUIT));
        main.ajouter(new Carte(Couleur.PIQUE, Valeur.AS));
        return main.afficherMain();

    }

    @GetMapping(value = "/mainTriee", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Carte> listCarteTriee() {

        ArrayList<Carte> mainTriee = new ArrayList<>();
        ArrayList<Valeur> ordreValeur = Valeur.getOrdreValeur();
        ArrayList<Couleur> ordreCouleur = Couleur.getOrdreCouleur();

        for (Valeur valeur : ordreValeur) {
            ArrayList<Carte> mainTrieeValeur = (ArrayList<Carte>) listCarteNonTriee().stream().filter(carte -> carte.getValeur() == valeur).collect(Collectors.toList());

            for (Couleur couleur : ordreCouleur) {
                mainTrieeValeur.stream().filter(carte -> carte.getCouleur() == couleur).collect(Collectors.toCollection(() -> mainTriee));

            }
        }
        return mainTriee;
    }

}
