package br.sapiens.controllers;

import br.sapiens.MeuException;
import br.sapiens.modelo.CursosEnum;
import br.sapiens.modelo.Pessoa;
import br.sapiens.modelo.ProfissaoEnum;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CadastroPessoaController {

    @FXML
    public void initialize()  {
        var abrirCurso = CursosEnum.values();
        choiceBoxCurso.getItems().addAll(abrirCurso);


        var abrirProfissao = ProfissaoEnum.values();
        choiceBoxProfissao.getItems().addAll(abrirProfissao);

    }

    @FXML
    private TextField nome;
    @FXML
    private TextField sobreNome;
    @FXML
    private TextField email;

    @FXML
    public ChoiceBox<CursosEnum> choiceBoxCurso;

    public ChoiceBox<ProfissaoEnum> choiceBoxProfissao;
    @FXML
    public CheckBox bolsa;


    public void salvar() {
        Pessoa pessoa = null;
        try {
            pessoa = new Pessoa(nome.getText(), sobreNome.getText(), email.getText(), pegaChoiceBoxCursos(), pegaChoiceBoxProfissao(), selecionaBolsa());


        } catch (MeuException e) {
            e.mostrarAlert();
        }
    }

    @FXML
    public void abrirChoiceBoxCursos(ActionEvent event) {
        var abrirCurso = CursosEnum.values();
        choiceBoxCurso.getItems().addAll(abrirCurso);
    }
    @FXML
    public void abrirChoiceBoxProfissao(ActionEvent event) {
        var abrirProfissao = ProfissaoEnum.values();
        choiceBoxProfissao.getItems().addAll(abrirProfissao);
    }

    public ChoiceBox <CursosEnum> pegaChoiceBoxCursos() {
            choiceBoxCurso.setOnAction(this::abrirChoiceBoxProfissao);
            return choiceBoxCurso;
    }
    public ChoiceBox<ProfissaoEnum> pegaChoiceBoxProfissao() {
        choiceBoxProfissao.setOnAction(this::abrirChoiceBoxProfissao);
        return choiceBoxProfissao;
    }
    public boolean selecionaBolsa() {
        if (bolsa.isSelected()) {
            return true;
        }
        return false;
    }

}
