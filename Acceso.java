package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Acceso extends JFrame {

    private JTextField txtusuario;
    private JPasswordField txtcontrasena;
    private JButton btningresar;

    public Acceso() {
        setTitle("Ingreso al Sistema");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4,2,10,10));

        add(new JLabel("Usuario:"));
        txtusuario = new JTextField();
        add(txtusuario);

        add(new JLabel("Contraseña:"));
        txtcontrasena = new JPasswordField();
        add(txtcontrasena);

        btningresar = new JButton("Ingresar");
        add(new JLabel()); // espacio vacío
        add(btningresar);

        // Evento botón
        btningresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String usuario = "admin";
                String contrasena = "123";

                String pass = new String(txtcontrasena.getPassword());
                String user = txtusuario.getText();

                if (user.equals(usuario) && pass.equals(contrasena)) {
                    Pagina p = new Pagina();
                    p.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Acceso().setVisible(true);
    }
}
