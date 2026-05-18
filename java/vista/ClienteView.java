package vista;

import javax.swing.*;

public class ClienteView extends JFrame {

    public ClienteView() {

        setTitle(
                "Cliente");

        setSize(
                600,400);

        setLayout(
                null);

        setLocationRelativeTo(
                null);


        JButton avances =
                new JButton(
                        "Consultar avances");

        avances.setBounds(
                50,50,220,40);


        JButton entregables =
                new JButton(
                        "Entregables");

        entregables.setBounds(
                50,120,220,40);


        add(avances);
        add(entregables);

    }

}