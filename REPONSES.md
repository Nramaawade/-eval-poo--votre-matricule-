# Réponses — Évaluation POO : héritage, polymorphisme, transtypage

- Matricule :47491202619
- Nom et prénom :   Wade Ndeye Rama
- N (deux derniers chiffres du matricule) :19

> Rédigez vos justifications **avec vos propres mots**. Elles serviront de base à l'échange oral.

## Exercice 1 — A. Affichage prédit

Écrivez ci-dessous, entre les deux lignes de trois accents graves, **une ligne par ligne affichée**, dans l'ordre.
Ne modifiez pas les lignes de trois accents graves.

```text
A vehicule
B vehicule 
Moto100
vehicule
Moto100
c1
c3
D-moto
false
true
3
```

## Exercice 1 — A. Justifications

1. Ligne qui commence par « F » :Fmoto100 s'affiche l
2. Ligne « C3 » :
3. Ligne « C2 » :
4. Ligne qui commence par « D- » :
5. Pourquoi des lignes « A », « F », « E » apparaissent avant « true false » :

## Exercice 1 — B. Transtypage

Colonne « Compile ? » : `oui` ou `non`. Colonne « Exécution » : `OK`, `exception` (en précisant laquelle), ou `-` si le code ne compile pas.

| n° | Compile ? | Exécution | Justification |
|----|-----------|-----------|---------------|
| 1  |oui        |    ok       |c est de type Moto qui herite 
vehicule              |
| 2  |     non      |           |   a est declarer de type vehicule            |
| 3  | oui          |  ok         |       a reference un objet de type Moto en memoire        |
| 4  |  oui         |  exeption         |    b est declarer instancier comme un camion           |
| 5  |   non        |           |        c est de type moto       |
| 6  |       oui    |   exception        |    b est un camion compilateur autorise le cast d'un objet vers string par compatinilite           |
| 7  |      oui     |  ok         |     b est de type statique objet           |
| 8  |   oui        |  ok         |           transtypé explicitemment en vehicule    |
