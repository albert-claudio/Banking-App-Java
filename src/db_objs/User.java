package db_objs;
import java.math.BigDecimal;
import java.math.RoundingMode;

//ARQUIVO DESTIADO A GUARDAR E ARMAZENAR AS INFORMAÇÕES DO USUARIO COMO(I.E E ID, USERNAME, PASSWORD E O SALDO ATUAL)

public class User {
    private final int id;
    private final String username, password;
    private BigDecimal currentBalance;

    public User(int id, String username, String password, BigDecimal currentBalance){
        this.id = id;
        this.username = username;
        this.password = password;
        this.currentBalance = currentBalance;
    }

    public int getId() {
        return id;
    }

    public String getUsername(){
        return password;
    }

    public BigDecimal getCurrentBalance(){
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal newBalance){
        //ARMAZENAR NOVO VALOR NO 2ª LUGAR DECIMAL
        currentBalance =  newBalance.setScale(2, RoundingMode.FLOOR);
    }
}
