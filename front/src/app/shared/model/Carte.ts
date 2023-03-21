export interface Carte {
  couleur: Couleur,
  valeur: Valeur
}

enum Couleur {
  CARREAUX,
  COEUR,
  PIQUE,
  TREFLE
}

enum Valeur {
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
  ROI
}
