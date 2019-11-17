# GestionCompte
Modèle d'application de gestion de Compte en JAVA
# Cahier des charges
Nous voulons créer une application orientée objet JAVA permettant de modéliser le fonctionnement des comptes bancaires de la Meck-Moroni. 
Un compte bancaire est identifié par son numéro, son solde et la date de la dernière opération de retrait effectuée sur le compte.
La variable représentant la dernière opération de retrait effectuée sur le compte sera mise à jour à chaque fois qu’une opération de 
retrait sera effectuée. Un compte est associé à une personne titulaire du compte. Le titulaire étant décrit par son 
nin (numéro d’identification national), son nom, et son prénom (les personnes morales ne sont pas prises en comptes). 
Les principales opérations qui peuvent être effectuées dans un compte sont : verser/retirer un montant et afficher l’état du compte.

Il existe deux types de comptes : compte Dharura et compte Ankiba. Un compte Dharura, est compte courant. 
On peut y effectuer les opérations de versement et de retrait sans aucune restriction. 
Le compte Ankiba est un compte d’épargne. Il se distingue du compte Dharura par un taux d’intérêt fixé à 3%. 
De plus, les opérations de retrait doivent être espacées de 15 jours au minimum.

Tous les comptes qui seront créés, seront stockés dans un objet de type Banque.
La classe Banque contiendra alors une liste de comptes. 
Elle implémentera l’interface IBanque qui caracterise l’ensemble des opérations pouvant être effectuées dans le système. 
Ces opérations sont :

-Ajouter un compte,

-Retrouver un compte à travers son numéro,

-Verser un montant dans un compte

-Retirer un montant dans un compte

-Effectuer un virement d’un compte à un autre

-Retrouver la totalité du montant épargné à la banque

# Travail demandé
![alt text](https://github.com/bassam269/GestionCompte/blob/master/model.png)
