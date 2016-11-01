/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprego;

import emprego.model.Profissional;
import emprego.model.Usuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author gcamargo
 */
public interface InterfaceBanco {


    public Usuario Login(String email, String senha);

    public boolean Cadastro(String nome, String email, String senha)throws Exception; 

    public boolean verificarCadastro(int codigo)throws Exception; 
       
    public boolean completarCadastroUsuario(String nome, String dataNascimento, String email, String endereco, int telefone,int codigo)throws Exception;

    public boolean completarCadastroProfissional(String experiencia, String profissao,int codigo)throws Exception;
    
    public Profissional montarProfissional(int codigo)throws Exception;
        
    public boolean contratarProfissional(int idProfissional, String descricao, int codigo)throws Exception;
    
    public List<Profissional> listaprofissionais()throws Exception;
    
    public Profissional procuraProfissional(List<Profissional> lista, int codigo);
    
    public Usuario veficaUsuario(String email, String senha, String dataNascimento);
    
   public boolean completarCadastroUsuarioPro(String nome, String dataNascimento, String email, String endereco, int telefone,int codigo) throws Exception;
}
