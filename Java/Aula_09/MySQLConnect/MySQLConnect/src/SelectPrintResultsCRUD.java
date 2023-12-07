import java.util.*;
import java.sql.*;

public class SelectPrintResultsCRUD {
    public static void main(String[] args) {
        String status = "Nada aconteceu!";
        try {
            Scanner scnUsuario = new Scanner(System.in);
            Scanner scnSenha = new Scanner(System.in);

            Connection conn = MySQLConnector.conectar();
            
            System.out.println("Digite o usuario e tecle Enter");
            String txtUsuario = scnUsuario.nextLine();
            System.out.println("Digite a senha e tecle Enter");
            String txtSenha = scnSenha.nextLine();
            
            String strgSqlSelector = "SELECT * from `teste`.`tbl_usuarios` WHERE `usuario` = '" + txtUsuario
                    + "'AND `senha` = '" + txtSenha + "';";
            Statement stmSql = null;
            stmSql = conn.createStatement();
            ResultSet rsSql = stmSql.executeQuery(strgSqlSelector);
            int qtdResultado = 0;
            while (rsSql.next()) {
                qtdResultado++;
                int id = rsSql.getInt("id");
                String firstName = rsSql.getString("usuario");
                String lastName = rsSql.getString("senha");
                status = String.format("Resultado %s, id %s, usuario %s, senha %s\n", qtdResultado, id, firstName,
                        lastName);
            }
            stmSql.close();
            rsSql.close();
            scnSenha.close();
            scnUsuario.close();
        } catch (SQLException e) {
            status = "Erro SQLException";
        } catch (Exception e) {
            status = "Erro Exception";
        }
        System.out.println(status);
    }
}