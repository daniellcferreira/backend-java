package dio.myfirst_web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.myfirst_web_api.handler.BusinessException;
import dio.myfirst_web_api.model.Usuario;

@Repository
public class UserRepository {
    public void save(Usuario usuario) {
        
        if(usuario.getLogin() == null)
            throw new BusinessException("O campo login é obrigadorio");

        if(usuario.getId() == null) {
            System.out.println("SAVE - Recebendo o usuario na camada de repositorio");
        } else {
            System.out.println("UPDATE - Recebendo o usuario na camada de repositorio");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuario", id));
    }

    public List<Usuario> findAll() {
       System.out.println("LIST - Listando os usuarios de sistema");
       List<Usuario> usuarios = new ArrayList<>();
       usuarios.add(new Usuario("joão", "password"));
       usuarios.add(new Usuario("frank", "materpass"));
       return usuarios; 
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuario", id));
        return new Usuario("joão", "password");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar o usuario", username));
        return new Usuario("joão", "password");
    }
}
