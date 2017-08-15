/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author (name=Marcos Michelmann, date=2017-07-08)
 */
public class Carro {
    
    private int id, renavam;
    private short anoFabricacao, anoLancamento, tipoPneu;
    private byte quantidadePortas, quantidadeBatidas;
    private String nome, cor, fabricante, placa, chassi, descricao;
    private float quilometragem, potencia;
    private Date dataCompra;
    private boolean estaFuncional, permitidaCirculacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(short anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public short getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(short anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public short getTipoPneu() {
        return tipoPneu;
    }

    public void setTipoPneu(short tipoPneu) {
        this.tipoPneu = tipoPneu;
    }

    public byte getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(byte quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public byte getQuantidadeBatidas() {
        return quantidadeBatidas;
    }

    public void setQuantidadeBatidas(byte quantidadeBatidas) {
        this.quantidadeBatidas = quantidadeBatidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRenavan() {
        return renavam;
    }

    public void setRenavan(int renavan) {
        this.renavam = renavan;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public boolean isEstaFuncional() {
        return estaFuncional;
    }

    public void setEstaFuncional(boolean estaFuncional) {
        this.estaFuncional = estaFuncional;
    }

    public boolean isPermitidaCirculacao() {
        return permitidaCirculacao;
    }

    public void setPermitidaCirculacao(boolean permitidaCirculacao) {
        this.permitidaCirculacao = permitidaCirculacao;
    }
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", renavam=" + renavam + ", anoFabricacao=" + anoFabricacao + ", anoLancamento=" + anoLancamento + ", tipoPneu=" + tipoPneu + ", quantidadePortas=" + quantidadePortas + ", quantidadeBatidas=" + quantidadeBatidas + ", nome=" + nome + ", cor=" + cor + ", fabricante=" + fabricante + ", placa=" + placa + ", chassi=" + chassi + ", descricao=" + descricao + ", quilometragem=" + quilometragem + ", potencia=" + potencia + ", dataCompra=" + dataCompra + ", estaFuncional=" + estaFuncional + ", permitidaCirculacao=" + permitidaCirculacao + '}';
    }
    
}
