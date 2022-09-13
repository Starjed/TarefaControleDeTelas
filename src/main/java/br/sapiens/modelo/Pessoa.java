package br.sapiens.modelo;

import java.util.List;

public class Pessoa {
    private final String nome;
    private final String sobreNome;
    private final String email;
    private ProfissaoEnum profissao;

    private List<Disciplina> disciplinas;

    private Boolean bolsa;

    private CursosEnum cursos;

    public Pessoa(String nome, String sobreNome, String email){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.profissao = ProfissaoEnum.Nenhum;
        this.disciplinas = getDisciplinas();
        this.bolsa = false;
        this.cursos = CursosEnum.ESQUERDO;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public ProfissaoEnum getProfissao() {
        return profissao;
    }

    public void setProfissao(ProfissaoEnum profissao) {
        this.profissao = profissao;
    }

    public List<Disciplina> getDisciplinas() {
        if (getDisciplinas() != null) {
            return disciplinas;
        }
        return null;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return nome+" "+sobreNome+" | "+email + disciplinas + bolsa + cursos;
    }

    public boolean getBolsa() {
        return false;
    }

    public boolean setBolsa() {
        return true;
    }

    public CursosEnum getCurso() throws Exception {
        if(cursos == null)
            throw new Exception("O curso tem que ser é obrigatorio");
        return cursos;
    }

    public CursosEnum setCurso() {
        return CursosEnum.SISTEMA;
    }
}
