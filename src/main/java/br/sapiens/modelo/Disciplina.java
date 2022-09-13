package br.sapiens.modelo;

import java.util.List;

public class Disciplina {

  private int matricula = 0;
   public String aluno = new Pessoa("Gabriel", "Albuquerque", "Biel123@hotmail.com").toString();

    public Disciplina(String nome, HorasDisciplina horas, List<CursosEnum> cursos, String aluno) {
        this.nome = nome;
        this.horas = horas;
        this.cursos = cursos;
        this.aluno = aluno;

    }

    public Disciplina(String nome, HorasDisciplina horas) throws Exception {
        setNome(nome);
        this.horas = horas;
    }

    private String nome;
    private final HorasDisciplina horas;

    private List<CursosEnum> cursos;

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
