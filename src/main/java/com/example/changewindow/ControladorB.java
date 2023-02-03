package com.example.changewindow;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControladorB {

    @FXML
    private TextField fieldApellido;

    @FXML
    private TextField fieldDNI;

    @FXML
    private TextField fieldNombre;


    public void initialize(){

        UserHolder holder = UserHolder.getInstance();
        Usuario usuario = holder.getUser();
        System.out.println(usuario.toString());

        fieldNombre.setText(usuario.getNombre());
        fieldApellido.setText(usuario.getApellido());
        fieldDNI.setText(usuario.getDni());
    }


}
