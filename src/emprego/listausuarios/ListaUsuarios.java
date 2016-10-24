/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprego.listausuarios;

import emprego.model.Profissional;
import emprego.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gcamargo
 */
public class ListaUsuarios implements InterfaceUsuarios{

    private List<Usuario> listausuarios = new ArrayList();
    
    
    
    @Override
    public boolean incluirUsuario(Usuario user) {
        if(listausuarios.add(user)){
            return true;
        }else{
            return false;
        }
    }

   

    @Override
    public boolean editarUsuario(int codigo, Usuario User) {
       for (Usuario usuarioAnterior : listausuarios) {
            if (usuarioAnterior.getIdUsuario()== codigo) {
                int index = listausuarios.indexOf(usuarioAnterior);
                listausuarios.set(index, User);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean excluir(int codigo) {
        for (Usuario user : listausuarios) {
            if (user.getIdUsuario()== codigo) {
                listausuarios.remove(user);
                return true;
            }
        }
        return false;
    }
 

    @Override
    public Usuario consultar(String nome, String email) {
        for (Usuario user : listausuarios) {
            if (nome == user.getNome()) {
                return user;
            }
        }

        return null;
    }
    
}
