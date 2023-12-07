import java.sql.*;

public class CreateTableAllTypesCRUD {
    public static void main(String[] args) {
        String status = "Nada aconteceu!";
        try{
            Connection conn = MySQLConnector.conectar();
            String strSqlCreate = "CREATE TABLE `teste`.`tbl_tipos_dados` (`id` INT NOT NULL AUTO_INCREMENT , ``varchar) VARCHAR(255) NULL, `text` TEXT NULL, `date` DATE NULL, `tinyint` TINYINT NULL , `smallint` SMALLINT NULL , `   mediumint` MEDIUMINT NULL , `bigint` BIGINT NULL , `deciaml` DECIMAL NULL , ` float` FLOAT NULL , `double` DOUBLE NULL , `real` REAL NULL , `bit` BIT NULL , `bollean` BOOLEAN NULL , `serial` SERIAL NULL , `datetime` DATETIME NULL  , `timestamp` TIMESTAMP NULL , `time` TIME NULL , `year` YEAR NULL , `char` CHAR NULL , `tinytext` TINYTEXT NULL , `mediumtext` MEDIUMTEXT NULL , `longtext` , LONGTEXT NULL , `binary` BINARY NULL , `varbinary` VARBINARY NULL , `tinyblob` TINYBLOB NULL , `blolb` BLOLB NULL , `mediumblob` MEDIUMBLOB NULL , `longblob` LONGBLOB NULL , `enum` ENUM NULL , `set` SET NULL , `geometry` GEOMETRY NULL , `point` POINT NULL , `linestring` LINESTRING NULL , `polygon` POLYGON NULL , `multipoint` MULTIPOINT NULL , `multilinestring` MULTILINESTRING NULL , `multipolygon` MULTIPOYGON NULL , `geometrycollection` GEOMETRYCOLLECTION NULL , `json` JSON NULL, PRIMARYKEY (`id`));";
            Statement stmSql = null;
            stmSql = conn.createStatement();
            stmSql.addBatch(strSqlCreate);
            stmSql.executeBatch();
            status = "Ok! Tabela criada!";
            stmSql.close();
        } catch(SQLException e){
            status = "Erro SQLExcection";
        
        } catch(Exception e){
            status = "Erro Excection";
        }
        System.out.println(status);
    }

}