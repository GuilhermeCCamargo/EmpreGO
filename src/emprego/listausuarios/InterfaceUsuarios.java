/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprego.listausuarios;

import emprego.model.Profissional;
import emprego.model.Usuario;

/**
 *
 * @author gcamargo
 */
public interface InterfaceUsuarios {
     /**
     * Inclui um imóvel na lista de imóveis.
     *
     * @param im Imóvel a ser incluído.
     * @return True se a inclusão foi bem sucedida ou False em caso contrário.
     */
    public boolean incluirUsuario(Usuario user);

    /**
     * Consulta o imóvel com o código informado.
     *
     * @param codigo Código a ser consultado.
     * @return Imovel com o código informado ou null em caso de não existir
     * imóvel com o código informado.
     */
    public Usuario consultar(String nome, String email);
    
    /**
     * Edita o imóvel com o código informado.
     *
     * @param código Código do imóvel a ser editado.
     * @param im Imóvel com as novas informações.
     * @return True se o imóvel com o código informado for editado e False caso
     * nenhum imóvel com o código infornado for encontrado.
     */
    public boolean editarUsuario(int codigo, Usuario User);

    /**
     * Exclui o imóvel com o código informado.
     *
     * @param codigo Código do imóvel a ser excluído.
     * @return True se o imóvel com o código informado for excluído e False caso
     * nenhum imóvel com o código infornado for encontrado.
     */
    public boolean excluir(int codigo);
   

}
