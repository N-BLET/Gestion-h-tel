import java.util.Scanner;

public class Logiciel {

	public static void main(String[] args) {
		
		// Scanner et variables
		Scanner sc = new Scanner(System.in);
		int [] roomNumber = {1, 2, 3, 4, 5};
		int [] occupancy = {0, 2, 1, 0, 0};
		boolean useSoftware=false, checkIn=false;
		int bedroom, nbTravelers, answerSoftware, answerCheckIn, surBooking;
		
		// Choix entre utiliser le programme ou le quitter
		while(true) {
			do {	
			System.out.println("Taper '1' pour effectuer une mise � jour ou bien '0' pour quitter le programme : ");
			answerSoftware=sc.nextInt();	
			
			// Gestion de la r�ponse
			if (answerSoftware<0 || answerSoftware>1) {
				System.out.println("Erreur, vous n'avez pas saisi '1' ou '0'.");
				continue;
			}else if (answerSoftware==0) {
				System.out.println("Bonne continuation et merci d'avoir utilis� notre programme.");
				sc.close();
				return;		
			}else {
				useSoftware=true;	
			}
			}while (!useSoftware);
			
			affichageChambre(roomNumber);
			affichageRemplissage(occupancy);
			
			//Mise � jour d�part ou arriv�e		
			do {
			System.out.println("Taper '1' pour enregistrer une nouvelle r�servation ou bien '0' pour lib�rer une chambre : ");
			answerCheckIn=sc.nextInt();
			
			// Gestion de la r�ponse 
			if (answerCheckIn<0 || answerCheckIn>=2) {
				System.out.println("Erreur, vous n'avez pas saisi '1' ou '0'.");			
				continue;
			}if (answerCheckIn==0) {
				if (occupancy[0]==0 && occupancy[1]==00 && occupancy[2]==0 && occupancy[3]==0 && occupancy[4]==0){
					System.out.println("Erreur: toutes vos chambres sont libres.");
					break;
				}
				
				System.out.println("Veuillez entrer le num�ro de la chambre lib�r�e : ");
				bedroom=sc.nextInt();
				if (bedroom<1 || bedroom>5) {
					System.out.println("Erreur: Veuillez entrer un num�ro entre 1 et 5 : ");
					break;
			
				// Lib�ration d'une chambre	
				}else if (bedroom>0 && bedroom<6) {
					bedroom=bedroom-1;
					if (occupancy[bedroom]==0) {
						System.out.println("Erreur: cette chambre est d�j� libre.");
						break;
					
					}else {
						occupancy[bedroom]=0;
						System.out.println("Vous avez bien lib�r� la chambre n� "+roomNumber[bedroom]);			
						break;
					}
				}
			}if (answerCheckIn==1) {
				if(occupancy[0]!=0 && occupancy[1]!=0 && occupancy[2]!=0 && occupancy[3]!=0 && occupancy[4]!=0) {
					System.out.println("Impossible d'ajouter une r�servation car toutes vos chambres sont r�serv�es.");
					break;
				}
			
				// Gestion du nombre de voyageurs
				System.out.println("Veuillez saisir le nombre de voyageurs (min. 1 � max. 4) : ");
				nbTravelers=sc.nextInt();	
				if (nbTravelers<=0 || nbTravelers>4) {
					System.out.println("Erreur : votre nombre de voyageurs n'est pas compris entre 1 et 4.");
					break;
						
				// Modif. tableau pour 1 ou 2 voyageurs		
				}if (nbTravelers<=2) {
					if (occupancy[1]==0) {
						occupancy[1]=nbTravelers;
						System.out.println("Vous avez bien enregist� votre nouvelle r�servation.");
						break;
					}if (occupancy[1]!=0 && occupancy[3]==0) {
						occupancy[3]=nbTravelers;
						System.out.println("Vous avez bien enregist� votre nouvelle r�servation.");
						break;
						
					// Gestion surbooking si pas de chambres paires disponibles
					}else if (occupancy[1]!=0 && occupancy[3]!=0) {
						System.out.println("Il ne reste plus de chambres pour 2 personnes.");
						System.out.println("Voulez-vous remplir une chambre de 4 personnes? (Taper '1' pour oui ou '0' pour non) ");
						surBooking=sc.nextInt();
						if (surBooking==1) {
							if (occupancy[0]==0) {
								occupancy[0]=nbTravelers;
								System.out.println("Vous avez bien enregist� votre nouvelle r�servation.");
								break;
							}else if (occupancy[2]==0) {
								occupancy[2]=nbTravelers;
								System.out.println("Vous avez bien enregist� votre nouvelle r�servation.");
								break;
							}else if (occupancy[4]==0) {
								occupancy[4]=nbTravelers;
								System.out.println("Vous avez bien enregist� votre nouvelle r�servation.");
								break;
							}
						}else {		
							System.out.println("Nous avons bien pris en compte votre choix.");
							break;
						}
					}
				
				// Modif. tableau pour 3 ou 4 voyageurs	
				}if (nbTravelers>2 || nbTravelers<5) {	
					if (occupancy[0]==0) {
						occupancy[0]=nbTravelers;
						System.out.println("Vous avez bien enregist� votre nouvelle r�servation.");
						break;
					}else if (occupancy[0]!=0 && occupancy[2]==0) {
						occupancy[2]=nbTravelers;
						System.out.println("Vous avez bien enregist� votre nouvelle r�servation.");
						break;
					}else if (occupancy[0]!=0 && occupancy[2]!=0 && occupancy[4]==0) {
						occupancy[4]=nbTravelers;			
						System.out.println("Vous avez bien enregist� votre nouvelle r�servation.");
						break;
					}
				}
			}else {
				checkIn=true;
			}
			}while(!checkIn);
			// Affichage du tableau
			System.out.print("Chambre N� | ");
			for (int i=0; i<roomNumber.length; i++) {
				System.out.print(roomNumber[i]+ " | ");
			}
			System.out.println();
			System.out.print("Occupation | ");
			for (int i=0; i<occupancy.length; i++) {
				System.out.print(occupancy[i]+" | ");
			}		
			System.out.println();
		}
	}
	// Affichage du tableau des chambres
	public static void affichageChambre(int tab1[]) {
		// Affichage du tableau
		System.out.print("Chambre N� | ");
		for (int i=0; i<tab1.length; i++) {
			System.out.print(tab1[i]+ " | ");
		}
		System.out.println();
	}
	
	// Affichage du tableau de remplissage
	public static void affichageRemplissage(int tab2[]) {
		System.out.print("Occupation | ");
		for (int i=0; i<tab2.length; i++) {
			System.out.print(tab2[i]+" | ");
		}		
		System.out.println();
	}
}