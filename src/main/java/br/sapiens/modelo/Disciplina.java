package br.sapiens.modelo;

import java.util.List;

public class Disciplina {

    public Disciplina(String nome, HorasDisciplina horas, List<CursosEnum> cursos) {
        this.nome = nome;
        this.horas = horas;
        this.cursos = cursos;
    }

    public Disciplina(String nome, HorasDisciplina horas) throws Exception {
        setNome(nome);
        this.horas = horas;
    }

    private String nome;
    private final HorasDisciplina horas;

    public List<CursosEnum> cursos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome == null || nome.isEmpty())
            throw new Exception("Nome é obrigatorio");
        this.nome = nome;
    }

    public HorasDisciplina getHoras(){
        return horas;
    }
}
