package com.api.helprback.domain;

import com.api.helprback.domain.enums.Perfil;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Pessoa {

    protected Integer id;
    protected Integer nome;
    protected Integer cpf;
    protected Integer email;
    protected Integer senha;
    protected Set<Integer> perfis = new HashSet<>();
    protected LocalDate dataCriacao = LocalDate.now();

    public Pessoa() {
        super();
        addPerfis(Perfil.CLIENTE);
    }

    public Pessoa(Integer id, Integer nome, Integer cpf, Integer email, Integer senha) {
       super();
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        addPerfis(Perfil.CLIENTE);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNome() {
        return nome;
    }

    public void setNome(Integer nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getEmail() {
        return email;
    }

    public void setEmail(Integer email) {
        this.email = email;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public Set<Perfil> getPerfis() {
        return perfis.stream().map(x -> Perfil.toEnum((x))).collect(Collectors.toSet());
    }

    public void setPerfis(Set<Integer> perfis) {
        this.perfis = perfis;
    }

    public void addPerfis(Perfil perfis) {
        this.perfis.add(perfis.getCodigo());
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Pessoa other = (Pessoa) obj;
        if (cpf == null) {
            if (other.cpf == null) return false;
        } else if (!cpf.equals(other.cpf)) return false;
        if (id == null) {
            if (other.id != null) return false;
        } else if (!id.equals(other.id)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
}
