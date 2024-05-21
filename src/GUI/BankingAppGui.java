package GUI;

import db_objs.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BankingAppGui extends BaseFrame{

    private JTextField currentBalanceField;
    public JTextField getCurrentBalanceField(){ return currentBalanceField; }

    public BankingAppGui(User user){
        super("Banking App", user);
    }
    @Override
    protected void addGuiComponents(){
        //MESSAGEM DE BEM-VINDO
        String welcomeMessage = "<html>" + "<body style='text-align:center'>" + "<b>Olá " + user.getUsername() + "</b><br>" +
                "O que você quer fazer hoje?</body></html>";
        JLabel welcomeMessageLabel = new JLabel (welcomeMessage);
        welcomeMessageLabel.setBounds(0, 20, getWidth() - 10, 40);
        welcomeMessageLabel.setFont( new Font("Dialog", Font.PLAIN, 16));
        welcomeMessageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(welcomeMessageLabel);

        //CRIAÇÃO DA CAIXA DO SALDO ATUAL
        JLabel currentBalanceLabel = new JLabel("Current Balance");
        currentBalanceLabel.setBounds(0, 80, getWidth() - 10, 30);
        currentBalanceLabel.setFont( new Font("Dialog", Font.BOLD, 22));
        currentBalanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(currentBalanceLabel);

        //CRIAÇÃO DA CAMPO DO SALDO ATUAL
        currentBalanceField = new JTextField("$" + user.getCurrentBalance());
        currentBalanceField.setBounds(15, 120, getWidth() - 50, 40);
        currentBalanceField.setFont( new Font("Dialog", Font.BOLD, 28));
        currentBalanceField.setHorizontalAlignment(SwingConstants.RIGHT);
        currentBalanceField.setEditable(false);
        add(currentBalanceField);

        Color ligthGreen = new Color(8, 141, 86);
        Color  green = new Color(5, 82, 50);

        //BOTÃO DE DEPOSITO
        JButton depositButton = new JButton("Deposito");
        depositButton.setBounds(15, 180, getWidth() - 50, 50);
        depositButton.setFont( new Font("Dialog", Font.BOLD, 22));
        depositButton.setBackground(green);
        depositButton.setForeground(Color.WHITE);

        depositButton.setBorderPainted(false);
        depositButton.setFocusPainted(false);

        depositButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                depositButton.setBackground(ligthGreen);
            }

            @Override
            public void mouseExited(MouseEvent e){
                depositButton.setBackground(green);
            }
        });
        add(depositButton);

        Color orange = new Color(147, 91, 18);
        Color ligthOrange = new Color(206, 128,25);

        //BOTÃO DE RETIRADA
        JButton withdrawButton = new JButton("Retirar");
        withdrawButton.setBounds(15, 250, getWidth() - 50, 50);
        withdrawButton.setFont( new Font("Dialog", Font.BOLD, 22));
        withdrawButton.setBackground(orange);
        withdrawButton.setForeground(Color.WHITE);

        withdrawButton.setBorderPainted(false);
        withdrawButton.setFocusPainted(false);

        withdrawButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                withdrawButton.setBackground(ligthOrange);
            }

            @Override
            public void mouseExited(MouseEvent e){
                withdrawButton.setBackground(orange);
            }
        });
        add(withdrawButton);

        Color Blue = new Color(7,130,224);
        Color ligthBlue = new Color( 4, 79, 137);


        //BOTÃO DE TRANSAÇÕES ANTERIORES
        JButton pastTransaction = new JButton("Transações Anteriores");
        pastTransaction.setBounds(15, 320, getWidth() - 50, 50);
        pastTransaction.setFont( new Font("Dialog", Font.BOLD, 22));
        pastTransaction.setBackground(Blue);
        pastTransaction.setForeground(Color.WHITE);

        pastTransaction.setBorderPainted(false);
        pastTransaction.setFocusPainted(false);

        pastTransaction.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                pastTransaction.setBackground(Blue);
            }

            @Override
            public void mouseExited(MouseEvent e){
                pastTransaction.setBackground(ligthBlue);
            }
        });
        add(pastTransaction);

        Color White = new Color(255, 255, 255);
        Color Grey = new Color(168, 168, 168);

        //BOTÃO DE TRANFERENCIA
        JButton transferButton = new JButton("Transferencia");
        transferButton.setBounds(15, 390, getWidth() - 50, 50);
        transferButton.setFont( new Font("Dialog", Font.BOLD, 22));
        transferButton.setBackground(White);
        transferButton.setForeground(Color.BLACK);

        transferButton.setBorderPainted(false);
        transferButton.setFocusPainted(false);

        transferButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                transferButton.setBackground(Grey);
            }

            @Override
            public void mouseExited(MouseEvent e){
                transferButton.setBackground(White);
            }
        });
        add(transferButton);

        Color  red = new Color(167, 23,15);
        Color ligthRed = new Color(195,  26, 18);

        //BOTÃO DE SAIR
        JButton logoutButton = new JButton("Sair");
        logoutButton.setBounds(15, 500, getWidth() - 50, 50);
        logoutButton.setFont( new Font("Dialog", Font.BOLD, 22));
        logoutButton.setBackground(red);
        logoutButton.setForeground(Color.WHITE);

        logoutButton.setBorderPainted(false);
        logoutButton.setFocusPainted(false);

        logoutButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                logoutButton.setBackground(ligthRed);
            }

            @Override
            public void mouseExited(MouseEvent e){
                logoutButton.setBackground(red);
            }
        });
        add(logoutButton);


    }
}
