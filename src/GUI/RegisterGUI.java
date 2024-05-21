package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterGUI extends BaseFrame{
    public RegisterGUI(){
        super("Banking App Register");
    }
    @Override
    protected void addGuiComponents(){
//CRIANDO
        JLabel bankingAppLabel = new JLabel("Banking Application");

        bankingAppLabel.setBounds(0, 20, super.getWidth(), 40);

        //CENTRALIZANDO O TEXTO NA JLABEL
        bankingAppLabel.setFont(new Font("Dialog", Font.BOLD, 32));
        bankingAppLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //ADICIONANDO PARA O GUI
        add(bankingAppLabel);

        //CRIANDO A CAIXA DE USUARIO
        JLabel usernameLabel = new JLabel("Usuario");

        //CONFIGURANDO PARA O GETWIDTH() RETORNA A LARGURA DO FRAME 420
        usernameLabel.setBounds(20, 120, getWidth() - 30, 24);
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(usernameLabel);

        //CRIANDO CAIXA DE TEXTO PARA O USARIO ESCREVER
        JTextField usernameField = new JTextField();
        usernameField.setBounds(20, 160, getWidth() - 50, 40);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 28));
        add(usernameField);

        //CRIANDO CAIXA DA SENHA
        JLabel passwordLabel = new JLabel("Senha");
        passwordLabel.setBounds(20, 220, getWidth() - 50, 24);
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(passwordLabel);

        //CRIANDO A CAIXA PARA O USUARIO ESCREVER A SENHA
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(20, 260, getWidth() - 50, 40);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 28));
        add(passwordField);

        //CRIANDO A CAIXA DE REESCREVER A SENHA
        JLabel rePasswordLabel = new JLabel("Reescreva a senha:");
        rePasswordLabel.setBounds(20, 320, getWidth() - 50, 40);
        rePasswordLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(rePasswordLabel);

        //CRIANDO A CAIXA PARA O USUARIO REESCREVER A SENHA DELE
        JPasswordField rePasswordField = new JPasswordField();
        rePasswordField.setBounds(20, 360, getWidth() - 50, 40);
        rePasswordField.setFont(new Font("Dialog", Font.PLAIN, 28));
        add(rePasswordField);

        //DEFININDO A COR DO BOTÃO NORMAL E HOVER
        Color normalColor = new Color(3, 133, 84); // Cor normal (#038554)
        Color hoverColor = new Color(0, 102, 64); // Cor de hover (um tom mais escuro ou diferente)

        //CRIAÇÃO DO BOTÃO DE LOGIN
        JButton registerButton = new JButton("Registra-se");
        registerButton.setBounds(20, 460, getWidth() - 50, 40);
        registerButton.setFont(new Font("Dialog", Font.BOLD, 20));

        //ADCIONANDO UMA COR PARA O BOTÃO(VERDE AGUA #038554)
        registerButton.setBackground(normalColor);

        //PARA A COR BRANCA NO NOME
        registerButton.setForeground(Color.WHITE);

        //REMOVENDO A BORDA PARA FICAR MAIS SUAVE A TRANSIÇÃO
        registerButton.setBorderPainted(false);
        registerButton.setFocusPainted(false);

        //ADIÇÃO DO MOUSELISTENER PARA DA O EFEITO DE HOVER NO BOTÃO
        registerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                registerButton.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e){
                registerButton.setBackground(normalColor);
            }
        });
        add(registerButton);

        //CRIANDO A REDIRECIOANDO PARA A PAGE DE LOGIN
        JLabel LoginLabel = new JLabel("<html><a style=\"color:black; text-decoration:none;\" href=\"#\">Já possui uma conta? Faça o Login Aqui!</a></html>");
        LoginLabel.setBounds(0, 510, getWidth() - 10, 30);
        LoginLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        LoginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(LoginLabel);
    }
}
