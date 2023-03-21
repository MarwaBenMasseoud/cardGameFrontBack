package com.project.cardGame.Carte;

import com.project.cardGame.Carte.Couleur;
import com.project.cardGame.Carte.Valeur;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Carte {
    private Couleur couleur;
    private Valeur valeur;


}
