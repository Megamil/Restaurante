package net.megamil.restaurante;

import java.util.ArrayList;
import java.util.List;

public class ObjetoPrato {

    private String img;
    private String nome;
    private String acompanhamento;
    private double preco;

    public static List<ObjetoPrato> JsonChamada(){


        List<ObjetoPrato> pratos = new ArrayList<>();

        pratos.add(new ObjetoPrato("frago_frito","Frango Frito","Coca cola 2L",15.00));
        pratos.add(new ObjetoPrato("calabresa","Calabresa","",9.00));
        pratos.add(new ObjetoPrato("file_frango","File de frango","Suco laranja 200ml",10.00));
        pratos.add(new ObjetoPrato("frango_molho","Frango ao molho","Coca cola 600ml",13.00));

        return pratos;

    }

    public ObjetoPrato(String imagem, String nome, String acompanhamento, double prexo) {
        this.img = imagem;
        this.nome = nome;
        this.acompanhamento = acompanhamento;
        this.preco = prexo;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double prexo) {
        this.preco = prexo;
    }
}
