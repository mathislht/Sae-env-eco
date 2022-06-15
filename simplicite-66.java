package eraser;

import java.util.ArrayList;

public class Eraser {


    /*  Cet algorithme est sans doute l'algorithme le plus intuitif à coder.
        A chaque espace rencontré, il vérifie simplement si le caractère avant ou le caractère après n'est pas un espace, et ajoute un espace selon le cas.
        Cet algorithme est sans doute le moins bien optimisé, car pour chaque caractère ajouté il vérifie celui d'avant et celui d'après.
        De plus, il est assez difficile à lire car il est assez long à écrire. En effet, comme il doit vérifier le caractère d'avant et celui d'après, il doit
        ajouter manuellement le premier caractère et le dernier caractère pour éviter un "index out of bounds".

        Catégorie de l'algorithme : Simplicité

     * 
     * 
     */
    public static String erase(String str) {

        ArrayList<String> arrayList = new ArrayList<String>();
        int len = str.length();
        int i;

        if (str.equals("")) {
            return "";
        }

        //Ajout du premier caractère
        if (Character.toString(str.charAt(0)).equals(" ")) {
            if (! Character.toString(str.charAt(1)).equals(" ")) {
                arrayList.add("");
            } else {
                arrayList.add(" ");
            }
        } else {
            arrayList.add(Character.toString(str.charAt(0)));
        }

        for (i=1 ; i<len-1 ; i++) {

            if (Character.toString(str.charAt(i)).equals(" ")) {
                if (! Character.toString(str.charAt(i+1)).equals(" ") && ! Character.toString(str.charAt(i-1)).equals(" ")) {
                    arrayList.add("");
                } else {
                    arrayList.add(" ");
                }

            } else {
                arrayList.add(Character.toString(str.charAt(i)));
            }
        }

        //Ajout du dernier caractère
        if (Character.toString(str.charAt(i)).equals(" ")) {
            if (! Character.toString(str.charAt(i-1)).equals(" ")) {
                arrayList.add("");
            } else {
                arrayList.add(" ");
            }
        } else {
            arrayList.add(Character.toString(str.charAt(i)));
        }

        return String.join("", arrayList);
    }


    /*  Principe de cet algorithme : On ajoute petit à petit les lettres dans une ArrayList.
        Quand un espace est rencontré, il est ignoré et la variable etaitEspace passe à true.
        Si juste après un espace est trouvé ET que la variable etaitEspace est à true, on ajoute 2 espaces (pour rattraper l'ignorage précédent).
        Si un 3eme espace est trouvé, il est rajouté normalement, jusqu'à ce qu'un caractère non-espace soit rencontré et que etaitEspace repasse à False.
        Cet algorithme est donc optimisé pour les cas où beaucoup d'espaces SEULS sont rencontrés.
        Après avoir effectué plusieurs tests, cet algorithme est le plus rapide des 3 présents ici.

        Catérogie de l'algorithme : Efficacité
     * 
     * 
     */
    public static String erase2(String str) {

        ArrayList<String> arrayList = new ArrayList<String>();
        int len = str.length();
        int indice = 0;

        boolean etaitEspace = false;
        boolean premierPassage = true;

        if (str.equals("")) {
            return "";
        }

        while (indice < len) {

            if (! Character.toString(str.charAt(indice)).equals(" ")) {
                arrayList.add(Character.toString(str.charAt(indice)));
                etaitEspace = false;
            }

            else {
                if (! etaitEspace) {
                    etaitEspace = true;
                    premierPassage = true;
                }
                else {
                    if (premierPassage) {
                        arrayList.add("  ");
                        premierPassage = false;
                    } else {
                        arrayList.add(" ");
                    }
                }
            }
            indice++;
        }
        return String.join("", arrayList);
    }

    /*  Principe de cet algorithme : on ajoute au fur et à mesure les caractères dans une ArrayList avec les des indices croissants.
        Si le caractère ajouté est le même que le précédent, on l'ajoute au même indice de l'ArrayList, ce qui fait qu'un indice de l'ArrayList peut contenir plusieurs mêmes caractères.
        En faisant cela, les espaces SEULS " " et les espaces multiples "  " sont clairement identifiés dans l'ArrayList.
        A la fin, on supprime les cases de l'ArrayList qui contiennent uniquement un seul espace.
        Cet algorithme n'est donc pas très bien optimisé, car il vérifie toujours le caractère précédent, mais il reste mieux que le premier, qui vérifie le caractère suivant ET précédent.

        Catérogie de l'algorithme : Simplicité
     */
    public static String erase3(String str) {

        if (str.equals("")) {
            return "";
        }

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(Character.toString(str.charAt(0)));
        int itab = 0;

        int len = str.length();

        for (int i=1 ; i<len ; i++) {

            String car = Character.toString(str.charAt(i));

            //Si le caractère est égal au caractère précédent
            if (car.equals(Character.toString(arrayList.get(itab).charAt(0)))) {

                arrayList.set(itab,arrayList.get(itab)+car);

            //Si le caractère n'est pas égal au caractère précédent
            } else {
                arrayList.add(car);
                itab++;
            }
        }

        ArrayList<String> aRemove = new ArrayList<String>();
        aRemove.add(" ");

        arrayList.removeAll(aRemove);

        return String.join("", arrayList);
    }
}