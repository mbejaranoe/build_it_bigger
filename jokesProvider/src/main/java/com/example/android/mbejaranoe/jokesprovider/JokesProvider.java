package com.example.android.mbejaranoe.jokesprovider;

public class JokesProvider {

    public String jokes[] = {"+Adios tocayo \n -Adios, mmmmmm, adios...",
            "Repetir no vale...",
            "Coherlo ahi", "Con los cuernos, capitan, con los cuernos",
            "Pues yo no juego...",
            "Me parece a mi que tu no vienes aqui a cazar..."};

    public String getJoke(){

        int randomIndex = 0;
        boolean found = false;
        while (!found){
            randomIndex = (int)(Math.random() * ((jokes.length) + 1));
            if ((randomIndex < jokes.length) && (randomIndex >= 0)) {
                found = true;
            }
        }
        return jokes[randomIndex];
    }
}
