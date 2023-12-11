package br.com.alura.reprodutormusica.principal;

import br.com.alura.reprodutormusica.modelos.MinhasPreferidas;
import br.com.alura.reprodutormusica.modelos.Musica;
import br.com.alura.reprodutormusica.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Best Part");
        minhaMusica.setCantor("Daniel Caesar");

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Podpah");
        meuPodcast.setApresentador("Igão e Mítico");

        for (int i = 0; i < 50; i++){
            minhaMusica.reproduzir();
            minhaMusica.curtir();
            meuPodcast.reproduzir();
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);




    }


}
