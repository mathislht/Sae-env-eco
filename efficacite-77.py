# return string without spaces
def erase(str):

    str_erased = '' # initialisation du nouveau string
    size = len(str)
    # Pour parcourir le string donné en paramètre, nous sommes
    # obligés de passer par une boucle while, car les boucles for
    # ne permettent pas d'incrémenter i à l'intérieur de celle-ci
    i = 0
    while i < size:
        # On vérifie si le caractère à l'emplacement i est un espace
        if str[i] == ' ':
            # Si c'est le cas, on va chercher à récupérer la suite 
            # d'espaces s'il y en a une 
            compteur = 1
            while i+compteur < size and str[i+compteur] == ' ':
                # On continue de parcourir le String en vérifiant 
                # de ne pas dépasser, tant que le caractère suivant 
                # est un espace
                str_erased += ' ' # On ajoute un espace au String à retourner
                compteur+=1 # On compte le nombre d'espaces trouvés
            # On vérifie si on a trouvé au moins un autre espace suivant
            if compteur != 1:
                # Il y a eu au moins un autre espace suivant, on ajoute donc 
                # l'espace correspondant au premier trouvé à i
                str_erased += ' '
                # On incrémente i de compteur - 1 afin de "sauter" les étapes 
                # qui consisteraient à tester chaque espace un par un
                # On avance ainsi jusqu'au prochain caractère différent d'un espace.
                i = i + compteur-1
            # On ne fait rien si on n'a pas trouvé d'espace suivant : 
            # il n'y a qu'un donc on souhaite l'enlever
        else:
            # On ne traite pas un espace, on ajoute donc le caractère normalement
            str_erased += str[i]
        i+=1
    return str_erased

    