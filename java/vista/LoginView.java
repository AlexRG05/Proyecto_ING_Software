package vista;

import javax.swing.*;

public class LoginView extends JFrame {

    public LoginView() {

        setTitle("Login");
        setSize(400,300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JLabel usuarioLabel =
                new JLabel("Usuario:");

        usuarioLabel.setBounds(
                50,50,100,30);


        JTextField usuarioField =
                new JTextField();

        usuarioField.setBounds(
                150,50,150,30);


        JLabel rolLabel =
                new JLabel("Rol:");

        rolLabel.setBounds(
                50,100,100,30);


        String roles[] = {
                "Administrador",
                "Programador",
                "Cliente"
        };


        JComboBox<String> rolBox =
                new JComboBox<>(roles);

        rolBox.setBounds(
                150,100,150,30);


        JButton loginButton =
                new JButton(
                        "Entrar");

        loginButton.setBounds(
                120,170,120,40);


        add(usuarioLabel);
        add(usuarioField);
        add(rolLabel);
        add(rolBox);
        add(loginButton);


        loginButton.addActionListener(e -> {

            String rol =
                    rolBox.getSelectedItem()
                            .toString();


            switch (rol) {

                case "Administrador":

                    new AdminView()
                            .setVisible(true);

                    break;


                case "Programador":

                    new ProgramadorView()
                            .setVisible(true);

                    break;


                case "Cliente":

                    new ClienteView()
                            .setVisible(true);

                    break;

            }

            dispose();

        });

    }

}
