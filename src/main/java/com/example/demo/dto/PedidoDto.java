package com.example.demo.dto;

public class PedidoDto {
    public Integer status;
    public Double valor;
    public Integer numero;
    public String acao;

    public PedidoDto() {
    }

    //public PedidoDto(Pedido entity) {
    //    this.acao = entity.getAcao();
    //  this.numero = entity.getNumero();
    //  this.status = entity.getStatus();
    //  this.valor = entity.getValor();
    //}
    //public Pedido toEntity() {
    //   Pedido entity = new Pedido();
    //  entity.setAcao(this.getAcao());
    //  entity.setNumero(this.getNumero());
    //  entity.setValor(this.getValor());
    //  entity.setStatus(this.getStatus());
    //  return entity;
    //}
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double mensagem) {
        this.valor = mensagem;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "Pedido{" +
                "status=" + status +
                ", valor=" + valor +
                ", numero=" + numero +
                ", acao='" + acao + '\'' +
                '}';
    }
}