package controlador;

import vista.LoginView;

public class Main {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {

            LoginView login =
                    new LoginView();

            login.setVisible(true);

        });

    }

}
