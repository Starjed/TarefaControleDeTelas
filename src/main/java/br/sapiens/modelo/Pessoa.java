package br.sapiens.modelo;

import br.sapiens.MeuException;
import javafx.scene.control.ChoiceBox;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Pessoa {
    private final String nome;
    private final String sobreNome;
    private final String email;
    private final List<Matricula> matriculas;
    private CursosEnum curso;
    private ProfissaoEnum profissao;

    public List<Disciplina>  disciplinas;
    private boolean bolsa;

    public Pessoa(String nome, String sobreNome, String email, ChoiceBox<CursosEnum> cursosEnum, ChoiceBox<ProfissaoEnum> profissao, boolean bolsa) throws MeuException {
        this.nome = nome;
        if(nome.isEmpty())
            throw new MeuException("Nome não pode ser null");
        if(sobreNome.isEmpty())
            throw new MeuException("Sobre nome não pode ser null");
        this.sobreNome = sobreNome;
        this.email = email;
        if(!Pattern.compile("^(.+)@(\\S+)$")
                .matcher(email)
                .matches())
            throw new MeuException("Email invalido");
        
        this.curso = cursosEnum.getValue();

        this.profissao = profissao.getValue();
        
        this.matriculas = new ArrayList<>();
        
//        this.curso = cursosEnum;
//        if (curso == null)
//        throw new MeuException("O Curso nao pode ser nulo");
        
        this.bolsa = bolsa;
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

    public boolean getBolsa() {
        return bolsa;
    }


    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public CursosEnum[] getCurso() {
        return new CursosEnum[]{curso};
    }

    @Override
    public String toString() {
        return nome + " " + sobreNome + " | Email: " + email + " | Profissão: " + profissao + " | Curso: " + curso + " | Possui bolsa: " +  bolsa;
    }
}
