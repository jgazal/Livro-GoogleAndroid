package br.com.livroandroid.cap19.actionbar_compartilhamento_carros.domain;

import java.io.Serializable;

public class Carro implements Serializable {
    private static final long serialVersionUID = 6601006766832473959L;

    public long id;
    public String tipo;
    public String nome;
    public String desc;
    public String urlFoto;
    public String urlInfo;
    public String urlVideo;
    public String latitude;
    public String longitude;

    // Flag para a action bar de contexto
    public boolean selected;

    @Override
    public String toString() {
        return "Carro{" + "nome='" + nome + '}';
    }
}
