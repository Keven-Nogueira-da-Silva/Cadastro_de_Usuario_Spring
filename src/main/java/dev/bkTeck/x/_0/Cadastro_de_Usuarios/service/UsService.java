package dev.bkTeck.x._0.Cadastro_de_Usuarios.service;

import dev.bkTeck.x._0.Cadastro_de_Usuarios.model.CadastroModel;
import dev.bkTeck.x._0.Cadastro_de_Usuarios.repository.UsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsService {

    private final UsRepository usRepository;

    public UsService(UsRepository usRepository) {
        this.usRepository = usRepository;
    }

    public List<CadastroModel> getAll() {return usRepository.findAll();}

    public CadastroModel save(CadastroModel UsCadastro) {return usRepository.save(UsCadastro);}

    public void Delity(long id) {usRepository.deleteById(id);}
}
