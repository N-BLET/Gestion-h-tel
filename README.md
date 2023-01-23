# Gestion_Hotel
Petit programme de gestion des résevations de chambres.
Premier projet java pour apprendre à gérer les tableaux, les boucles et les conditions.
L'étude de cas se portait sur la gestion d'une chambre d'hôtel.

VOICI LE SUJET :
L’hôtel de la Mésange souhaite un programme qui lui permettra de gérer l’occupation de ses chambres. 

SPÉCIFICATION
  1.	Le nombre de chambres de l’hôtel est de 5 et leurs numéros vont de 1 à 5. 
  2.	Les chambres paires sont des chambres de 2 personnes, les chambres impaires des chambres de 4 personnes. 
  3.	Si une chambre est déjà occupée, elle ne peut pas être choisie pour les nouveaux arrivants. (chambre non occupée = chambre avec 0 voyageurs) 
  4.	Une fois le logiciel lancé, l’utilisateur pourra au choix : 
      • Mettre à jour le statut d’une chambre (départ ou arrivée) 
      • Quitter le programme 
  5.	À chaque mise à jour, vous afficherez le tableau d’occupation des chambres
      un tableau contenant le numéro de la chambre ainsi que le nombre de voyageurs dans cette chambre. 

Remarque 1 : votre programme ne gérera pas les groupes de plus de 4 personnes et devra savoir gérer les cas à 1 ou 3 voyageurs et remplir le tableau en conséquence. 
Remarque 2 : c’est le programme qui choisit d’affecter telle ou telle chambre et non vous qui donnez la possibilité à l’utilisateur de choisir la chambre à remplir.

À VOUS DE JOUER !

1.	ANALYSE & CONCEPTION 
  a.	Définir les entrées et les sorties de la fonctionnalité « Mise à jour de l’occupation d’une chambre » 
  b.	Donner un jeu de test pour cette fonctionnalité. Votre jeu de test devra être constitué des entrées que vous avez défini à la question 1
      et devra dire quel est le résultat prévu pour chaque valeur. 
  c.	Écrivez en quelques lignes, les étapes clés du programme. 

2.	CODAGE 
Passons maintenant au développement de notre programme.
Comme tous les exercices réalisés jusqu’à présent, nous coderons tout notre programme au sein de la méthode main et l’interface sera la console. 

Initialement, le remplissage de l’hôtel est le suivant : 
Chambres:	  1	2	3	4	5
Occupation:	0	2	1	0	0
	
Remarque : un tableau à 1 dimension fera l’affaire pour gérer l’occupation des chambres.
Chaque case correspondant à une chambre. Faites attention toutefois au décalage entre le numéro de la chambre et l’indice dans le tableau.
