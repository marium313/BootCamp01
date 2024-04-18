package JavaIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class ExportPostgresData {
    public static void main(String[] args) {
        exportPostgreData();
    }
    public static void exportPostgreData(){
        String jdbcURL = "jdbc:postgresql://localhost:5432/2024Class";
        String username = "postgres";
        String password = "Chickybeebz1";
        String sqlQuery = "SELECT * FROM myClass";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            try (XSSFWorkbook workbook = new XSSFWorkbook()) {
                // Create a new sheet
                var sheet = workbook.createSheet("ExportedData");

                // Iterate through the result set and write data to the Excel sheet
                int rowNum = 0;
                while (resultSet.next()) {
                    Row row = sheet.createRow(rowNum++);
                    int colNum = 0;
                    while (colNum < resultSet.getMetaData().getColumnCount()) {
                        Cell cell = row.createCell(colNum);
                        cell.setCellValue(resultSet.getString(colNum + 1)); // Column indices are 1-based in JDBC
                        colNum++;
                    }
                }
                try (FileOutputStream outputStream = new FileOutputStream("/Users/mariumfiles/Desktop/exported_data.xlsx")) {
                    workbook.write(outputStream);
                    System.out.println("Data exported to Excel successfully.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
