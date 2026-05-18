package vista;

import javax.swing.*;

public class AdminView extends JFrame {

    public AdminView() {

        setTitle(
                "Administrador");

        setSize(
                600,400);

        setLayout(
                null);

        setLocationRelativeTo(
                null);


        JButton proyectos =
                new JButton(
                        "Proyectos");

        proyectos.setBounds(
                50,50,200,40);


        JButton programadores =
                new JButton(
                        "Programadores");

        programadores.setBounds(
                50,120,200,40);


        JButton tareas =
                new JButton(
                        "Asignar Tareas");

        tareas.setBounds(
                50,190,200,40);


        add(proyectos);
        add(programadores);
        add(tareas);

    }

}
