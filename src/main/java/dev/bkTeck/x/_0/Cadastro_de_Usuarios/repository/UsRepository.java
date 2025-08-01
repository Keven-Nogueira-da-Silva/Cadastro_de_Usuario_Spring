package dev.bkTeck.x._0.Cadastro_de_Usuarios.repository;

import dev.bkTeck.x._0.Cadastro_de_Usuarios.model.CadastroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsRepository extends JpaRepository<CadastroModel, Long> {
}
