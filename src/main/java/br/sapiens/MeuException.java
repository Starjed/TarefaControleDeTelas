package br.sapiens;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class MeuException extends Exception {
    private static Label LABEL;

    public MeuException(String msg) {
        super(msg);
    }

    public static void setLabel(Label label) {
        MeuException.LABEL = label;
    }

    public void mostrarAlert(){
        String msg = "Ocorreu um erro! "+this.getMessage();
        var alerta = new Alert(Alert.AlertType.ERROR,msg);
        alerta.setTitle("Erro ao cadastrar pessoa");
        alerta.show();
        LABEL.setText(msg);
    }

    public void mostrarSucesso(){
        String msg = "Ocorreu um erro! "+this.getMessage();
        var alerta = new Alert(Alert.AlertType.ERROR,msg);
        alerta.setTitle("Erro ao cadastrar pessoa");
        alerta.show();
        LABEL.setText(msg);
    }
}
