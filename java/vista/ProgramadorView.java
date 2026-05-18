package vista;

import javax.swing.*;

public class ProgramadorView extends JFrame {

    public ProgramadorView() {

        setTitle(
                "Kanban Programador");

        setSize(
                700,400);

        setLayout(
                null);

        setLocationRelativeTo(
                null);


        JLabel pendiente =
                new JLabel(
                        "Pendiente");

        pendiente.setBounds(
                80,40,100,30);


        JLabel proceso =
                new JLabel(
                        "En Proceso");

        proceso.setBounds(
                300,40,100,30);


        JLabel terminado =
                new JLabel(
                        "Terminado");

        terminado.setBounds(
                520,40,100,30);


        add(pendiente);
        add(proceso);
        add(terminado);

    }

}
