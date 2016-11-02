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

    /**
     *Este Metodo Verifica se existe Algum Usuario cadastrado no banco com
     * a senha e o email iguais aos recebidos por parametro, 
     * caso tenha retorna o objeto com alguns atributos
     * @param email
     * @param senha
     * @return
     */
    public Usuario Login(String email, String senha);

    /**
     *Este metodo executa o cadastro de um novo usuário, recebe como parametro as tres variaveis ,
     * e salvam no banco, true se conseguir, false se não conseguir.
     * caso encontre é montado o objeto Usuairo com todos 
     * os seus atributos e retornado para quem chamou o método, caso não tenha
     * é retornado um objeto nulo.
     * @param nome
     * @param email
     * @param senha
     * @return
     * @throws Exception
     */
    public boolean Cadastro(String nome, String email, String senha)throws Exception; 

    /**
     *Verifica se o cadastro do usuario esta completo
     * atraves de uma query, é buscado no banco o campo completo 
     * do usuario onde o codigo eh igual ao codigo passado por parametro
     * caso encontre retorna true, e entao deve informar o usuario pra completar o cadastro
     * caso nao encontre retorna false , e o tratamento esta na implmentacao
     * @param codigo
     * @return
     * @throws Exception
     */
    public boolean verificarCadastro(int codigo)throws Exception; 
     
    /**
     *Este metodo recebe como parametro os dados que faltavam para completar o cadastro de um usuario, apos a insercao dos dados o metodo registra no banco que esta completo o cadastro
     * atraves da setagem do campo completo para o valor 1
     * que por default seria 0
     * @param nome
     * @param dataNascimento
     * @param email
     * @param endereco
     * @param telefone
     * @param codigo
     * @return
     * @throws Exception
     */
    public boolean completarCadastroUsuario(String nome, String dataNascimento, String email, String endereco, int telefone,int codigo)throws Exception;

    /**
     *Faz exatamente o mesmo que o metodo anterior mas para um profissional, recebe as variaveis que apenas o profissional tem
     * e seta elças na tabela Profissional
     * ps: 
     * @param experiencia
     * @param profissao
     * @param codigo //codigo do usuario logado que chamou este metodo
     * @return
     * @throws Exception
     */
    public boolean completarCadastroProfissional(String experiencia, String profissao,int codigo)throws Exception;
    
    /**
     *este metodo busca um profissional pelo codigo e monta as informacoes que a query resulta
     * @param codigo
     * @return
     * @throws Exception
     */
    public Profissional montarProfissional(int codigo)throws Exception;
        
    /**
     *este metodo recebe as informacoes necessarias para registra uma solicitacao de servico como parametro e seta no banco
     * @param idProfissional
     * @param descricao
     * @param codigo //idusuario do usuario que esta logado, no caso quem chamou o metodo
     * @return
     * @throws Exception
     */
    public boolean contratarProfissional(int idProfissional, String descricao, int codigo)throws Exception;
    
    /**
     *Este metodo busca na tabela Profissional do banco todos os profissionais cadastrados e retorna uma lista com os profissionais
     * @return
     * @throws Exception
     */
    public List<Profissional> listaprofissionais()throws Exception;
    
    /**
     *Este metodo recebe uma lista de profissionais e um codigo, entao percorre a lista toda em busca de um profissional com o codigo passado como parametro
     * se encontrar retorna o usuario encontrado
     * @param lista
     * @param codigo
     * @return
     */
    public Profissional procuraProfissional(List<Profissional> lista, int codigo);
    
    /**
     *metodo utilizado para auxiliar na recuperacao de senha
     * @param email
     * @param senha
     * @param dataNascimento
     * @return
     */
    public Usuario veficaUsuario(String email, String senha, String dataNascimento);
    
    /**
     *Auxiliar para completar o cadastro de um usuario que é profissional, setando o valor isUsuario e completando o cadastro em seguida setando o profissional 
     * @param nome nome do usuario 
     * 
     * @param dataNascimento data de nascimento
     * @param email
     * @param endereco
     * @param telefone
     * @param codigo
     * @return
     * @throws Exception
     */
    public boolean completarCadastroUsuarioPro(String nome, String dataNascimento, String email, String endereco, int telefone,int codigo) throws Exception;
}
