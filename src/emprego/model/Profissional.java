/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprego.model;

/**
 *
 * @author gcamargo
 */
public class Profissional extends Usuario {

    @Override
    public String toString() {
        return getIdUsuario()+" - "+"Nome: " + getNome()+" - "+"Profissão: " + getProfissao();
    }
    
    private int idProfissional;
    private String experienciaProfissional;
    private String profissao;

    

    /**
     * @return the experienciaProfissional
     */
    public String getExperienciaProfissional() {
        return experienciaProfissional;
    }

    /**
     * @param experienciaProfissional the experienciaProfissional to set
     */
    public void setExperienciaProfissional(String experienciaProfissional) {
        this.experienciaProfissional = experienciaProfissional;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the idProfissional
     */
    public int getIdProfissional() {
        return idProfissional;
    }

    /**
     * @param idProfissional the idProfissional to set
     */
    public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
    }

}
