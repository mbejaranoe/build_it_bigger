package com.example.android.mbejaranoe.jokesprovider;

public class JokesProvider {

    public String jokes[] = {"¡Adiós tocayo! \n -¡Adiós!, mmmmmm, adios...",
            "Repetir no vale...", "¡Coherlo ahí!", "¡¡Con los cuernos, capitán, con los cuernos!!",
            "Pues yo no juego...", "Me parece a mi que tú no vienes aquí a cazar..."};

    public String getJoke(){

        int randomIndex = (int) (Math.random() * jokes.length) + 1;
        return jokes[randomIndex];
    }
}
