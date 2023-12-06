
import java.sql.*;

public class insertCRUD{
    public static void main(String[] args) {
        String status = "Nada aconteceu";
        
        try {
            Connection conn = App.conectar();
            String strSqlCreate = "INSERT INTO `teste`.`tbl_usuarios` (`usuario`, `senha`) VALUES ('teste', 'teste');";
            Statement stmSql = null;
            stmSql = conn.createStatement();
            stmSql.addBatch(strSqlCreate);
            stmSql.executeBatch();
            status = "Ok! Registro inserido.";
            stmSql.close();
        } catch (SQLException e){
            status ="Erro SQLException: " + e;
        } catch(Exception e){
            status = "Erro Exception: " + e;
        }
        System.out.println(status);
    }
}

