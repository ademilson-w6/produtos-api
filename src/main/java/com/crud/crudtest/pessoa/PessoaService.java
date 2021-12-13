package com.crud.crudtest.pessoa;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PessoaService {

    private PessoaRepository pessoaRepository;

    public void salvar (Pessoa pessoa) {
        log.info("Salvando pessoa de ID {}", pessoa.getId());
        this.pessoaRepository.save(pessoa);
    }

    public Pessoa editar(Pessoa pessoa){
        log.info("Editando pessoa com ID {}", pessoa.getId());
        return this.pessoaRepository.save(pessoa);
    }

    public void deletar(Long id){
        log.info("Deletando pessoa de ID {}", id);
        this.pessoaRepository.deleteById(id);
    }

    public Pessoa pesquisarPorId(Long id){
        log.info("Pesquisando pessoa de ID {}", id);
        return this.pessoaRepository.getById(id);
    }


}