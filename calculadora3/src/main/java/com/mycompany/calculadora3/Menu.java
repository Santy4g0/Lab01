/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculadora3;
/**
 *
 * @author Juan David Ruiz Gomez y Elkin Santiago Ruiz Rodriguez.
 Menú tomado del ejemplo proporcionado por el profesor.
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu {
    public static JFrame frame;
    public static JButton[] botones;

    public static void main(String[] args) {
        // *** AJUSTAR EL TITULO DE LA VENTANA (JFRAME) DEL MENU ***
        String titulo = "Lab01: Introducción al lenguaje Java";

        // *** AJUSTAR LOS MENSAJES QUE HAN DE APARECER EN EL MENU ***
        String opciones[] = {"Calculadora consola.", "Calculadora gráfica."};

        final int numop = opciones.length;

        // Crear el marco de la ventana
        frame = new JFrame(titulo);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLocationRelativeTo(null);
        frame.setSize(380, 50 * numop);
        frame.setLayout(new BorderLayout());

        // Crear un panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(numop, 1)); // Disponer los botones en una columna

        // Crear un array de botones
        botones = new JButton[numop];

        // Inicializar los botones y añadir ActionListener
        for (int i = 0; i < numop; i++) {
            final int index = i; // Variable final para usar en el ActionListener
            botones[i] = new JButton(opciones[i]);
            botones[i].addActionListener((ActionEvent e) -> {
                // *** AJUSTAR SEGUN LAS OPCIONES DEL MENU ***
                switch (index) {
                    case 0 -> Calculadora3.main(new String[]{});
                    case 1 -> {
                        botones[index].setEnabled(!botones[index].isEnabled());
                        new frmCalculadora().setVisible(true);
                    }
                }
                // *** FINAL AJUSTES ***
            });
            // Añadir el botón al panel
            panelBotones.add(botones[i]);
        }

        // Añadir el panel de botones al marco
        frame.add(panelBotones, BorderLayout.CENTER);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}

