{
 "cells": [
  {
   "cell_type": "code",
   "execution_count": 33,
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "v  joure\n"
     ]
    }
   ],
   "source": [
    "def erase (chaine) :\n",
    "    res = \"\"\n",
    "    var = \"\"\n",
    "    cpt = 0\n",
    "    for i in range (len(chaine)) :\n",
    "        if chaine [i] == \" \" :\n",
    "            var += \" \"\n",
    "            cpt += 1\n",
    "            pass\n",
    "        else :\n",
    "            if cpt > 1 :\n",
    "                res += var\n",
    "            cpt = 0\n",
    "            var = \"\"\n",
    "            res += chaine [i]\n",
    "    if cpt > 1:\n",
    "        res += var\n",
    "    return res"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": []
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.7.3"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 4
}
