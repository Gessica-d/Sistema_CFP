
package Modelo;

/**
 *
 * @author Géssica
 */
public class UsuarioDTO {
   private int id;
   private String nome, senha;

    
    public int getId() {
        return id;
    }

 
    public void setId(int id) {
        this.id = id;
    }

   
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }

   
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
