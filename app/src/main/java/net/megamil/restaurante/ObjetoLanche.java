package net.megamil.restaurante;

import java.util.ArrayList;
import java.util.List;

public class ObjetoLanche {
    
    private String img;
    private String nome;
    private String acompanhamento;
    private double preco;

    public static List<ObjetoLanche> JsonChamada(){


        List<ObjetoLanche> lanches = new ArrayList<>();

        lanches.add(new ObjetoLanche("pizza","Pizza","Coca cola 2L",20.00));
        lanches.add(new ObjetoLanche("bolo","Bolo","",21.00));
        lanches.add(new ObjetoLanche("coxinha","Coxinhas","",1.00));
        lanches.add(new ObjetoLanche("doces","Doces","Coca cola 600ml",13.00));
        lanches.add(new ObjetoLanche("enrolado_salsicha","Enroladinho de Salsicha","",4.40));
        lanches.add(new ObjetoLanche("humburguer","Hamburguer","Coca cola 1L",5.00));
        lanches.add(new ObjetoLanche("misto_quente","Misto Quente","Pepsi 300ml",6.50));
        lanches.add(new ObjetoLanche("lanches","Salgados","",1.00));
        lanches.add(new ObjetoLanche("pao_queijo","Pães de queijo 10 unit","",3.00));

        return lanches;

    }

    public ObjetoLanche(String imagem, String nome, String acompanhamento, double prexo) {
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
