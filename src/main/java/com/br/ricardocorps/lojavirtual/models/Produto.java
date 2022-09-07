package com.br.ricardocorps.lojavirtual.models;

public class Produto {
    private String codigo;
    private String descricao;
    private String valor;

    public int getCodigo() {
        int cod = Integer.parseInt(codigo);
        return cod;
    }

    public String setCodigo(String codigo) {

        return this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        double vlr = Double.parseDouble(valor);
        return vlr;
    
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
