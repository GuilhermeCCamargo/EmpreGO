/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprego.model;

import java.sql.Date;

/**
 *
 * @author gcamargo
 */
public class Solicitacao {
    private int idsolicitacao;
    private int idprofissional;
    private int idsolicitante;
    private String Descricao;
    private int dataInicio;//Data que o profissional aceita a solicitacao
    private Date dataPedido;//data do pedido de servico
    private int resposta;//resposta do profissional ao receber uma solicitacao de servico
    private int avaliacao;//disponivel apenas apos o termino do servico
    private int dataFim;
    private int acabado;//valor sera 0, 1 ou 2. 0 = acabado, 1=nao acabado 
    private int ciente;
    /**
     * @return the idprofissional
     */
    public int getIdprofissional() {
        return idprofissional;
    }

    /**
     * @param idprofissional the idprofissional to set
     */
    public void setIdprofissional(int idprofissional) {
        this.idprofissional = idprofissional;
    }

    /**
     * @return the idsolicitante
     */
    public int getIdsolicitante() {
        return idsolicitante;
    }

    /**
     * @param idsolicitante the idsolicitante to set
     */
    public void setIdsolicitante(int idsolicitante) {
        this.idsolicitante = idsolicitante;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the dataInicio
     */
    public int getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(int dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataPedido
     */
    public Date getDataPedido() {
        return dataPedido;
    }

    /**
     * @param dataPedido the dataPedido to set
     */
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    /**
     * @return the resposta
     */
    public int getResposta() {
        return resposta;
    }

    /**
     * @param resposta the resposta to set
     */
    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    /**
     * @return the avaliacao
     */
    public int getAvaliacao() {
        return avaliacao;
    }

    /**
     * @param avaliacao the avaliacao to set
     */
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    /**
     * @return the dataFim
     */
    public int getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(int dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * @return the acabado
     */
    public int getAcabado() {
        return acabado;
    }

    /**
     * @param acabado the acabado to set
     */
    public void setAcabado(int acabado) {
        this.acabado = acabado;
    }

    /**
     * @return the idsolicitacao
     */
    public int getIdsolicitacao() {
        return idsolicitacao;
    }

    /**
     * @param idsolicitacao the idsolicitacao to set
     */
    public void setIdsolicitacao(int idsolicitacao) {
        this.idsolicitacao = idsolicitacao;
    }

    /**
     * @return the ciente
     */
    public int getCiente() {
        return ciente;
    }

    /**
     * @param ciente the ciente to set
     */
    public void setCiente(int ciente) {
        this.ciente = ciente;
    }
    
}
