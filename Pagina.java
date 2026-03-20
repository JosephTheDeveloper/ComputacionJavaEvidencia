package app;

import javax.swing.*;
import java.awt.*;

public class Pagina extends JFrame {

    public Pagina() {
        setTitle("Página Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel titulo = new JLabel("Bienvenido al Sistema", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));

        add(titulo);
    }
}
