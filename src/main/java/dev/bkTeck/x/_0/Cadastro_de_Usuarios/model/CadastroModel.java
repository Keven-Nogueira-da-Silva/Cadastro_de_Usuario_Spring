package dev.bkTeck.x._0.Cadastro_de_Usuarios.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_Usuário")
public class CadastroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private Integer idade;

    public CadastroModel(long id, String email, String name, Integer idade) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.idade = idade;
    }

    public CadastroModel() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
