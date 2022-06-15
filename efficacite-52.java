package main.java.eraser;

public class Eraser {
	
	
	/**
     * méthode qui prend en paramètre une chaine de caractères et qui renvoie une nouvelle chaine de caractère 
     * sans les espaces simples mais conserve les espaces multiples
     * @param str IN : chaine de caractère,le message à modifier
     * @return : la nouvelle chaine de caractère sans les espaces simples 
     */
    public static String erase(String str) {
    	
        int length = str.length(); // initialisation de la taille de la chaine de caractère
        int compteur = 0; // initialisation du compteur d'espaces 
        String texte = ""; // initialisation du texte à reconstituer caractère par caractère 
        
        
        
        for (int i = 0 ; i<length; i++) { // boucle qui va parcourir toute la chaine
            char caractere = str.charAt(i); // caractère à l'emplacement i dans la chaine
            if (caractere == ' ') { // vérification si le caractère à i est un espace
                compteur += 1; // +1 au compteur si c'est le cas
                
            }else { // si ce n'est pas un espace
                if ( compteur >= 2) { // si le compteur à compter deux espaces ou plus ils sont ajoutés à la suite du texte
                    for ( int j = 0 ; j < compteur ; j++) {
                        texte += ' ';
                    }
                }
                
                compteur = 0; 
                texte += caractere; // ajout du caractère si ce n'est pas un espace
            }
        }
        
        str = texte; // la chaine devient le nouveau texte
        return str; //on retourne la nouvelle chaine sans les espaces simples
    }
}
