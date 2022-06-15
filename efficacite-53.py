# return string without spaces


def erase(ancien):
    newString = ""
    compteur = 0
    j = 0

    for i in ancien :
        if i == ' ' :
            compteur += 1
        else :
            if compteur >= 2 :
                while j < compteur :
                    j += 1
                    newString += " "

            compteur = 0
            newString += i
            j = 0
    return newString