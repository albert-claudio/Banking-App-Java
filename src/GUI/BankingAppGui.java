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

        Color green = new Color(34, 139, 34);
        Color ligthGreen = new Color(144, 238, 144);

        //BOTÃO DE DEPOSITO
        JButton depositButton = new JButton("Deposito");
        depositButton.setBounds(15, 180, getWidth() - 50, 50);
        depositButton.setFont( new Font("Dialog", Font.BOLD, 22));
        depositButton.setBackground(green);
        depositButton.setForeground(Color.WHITE);

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

        Color orange = new Color(255, 165, 0);
        Color ligthOrange = new Color(255, 183,77);

        //BOTÃO DE RETIRADA
        JButton withdrawButton = new JButton("Retirar");
        withdrawButton.setBounds(15, 250, getWidth() - 50, 50);
        withdrawButton.setFont( new Font("Dialog", Font.BOLD, 22));
        withdrawButton.setBackground(orange);
        withdrawButton.setForeground(Color.WHITE);

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

        Color Blue = new Color(37,151,151);


        //BOTÃO DE TRANSAÇÕES ANTERIORES
        JButton pastTransaction = new JButton("Transações Anteriores");
        pastTransaction.setBounds(15, 250, getWidth() - 50, 50);
        pastTransaction.setFont( new Font("Dialog", Font.BOLD, 22));
        pastTransaction.setBackground(orange);
        pastTransaction.setForeground(Color.WHITE);

        pastTransaction.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                pastTransaction.setBackground(ligthOrange);
            }

            @Override
            public void mouseExited(MouseEvent e){
                pastTransaction.setBackground(orange);
            }
        });
        add(pastTransaction);
    }
}
