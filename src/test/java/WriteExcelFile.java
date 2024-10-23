import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {

    public static void main(String[] args) {
        String excelFilePath = "D:\\project\\excelsheet\\categories.xlsx"; // Replace with your file path

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");

        // Create a row and put some cells in it.
        Row row = sheet.createRow(0); // Row at index 0 (first row)

        // Create cells
        Cell cell1 = row.createCell(0); // First column
        cell1.setCellValue("Name");

        Cell cell2 = row.createCell(1); // Second column
        cell2.setCellValue("Age");

        // Add more rows and cells
        Row row1 = sheet.createRow(1); // Second row
        row1.createCell(0).setCellValue("John Doe");
        row1.createCell(1).setCellValue(25);

        Row row2 = sheet.createRow(2); // Third row
        row2.createCell(0).setCellValue("Jane Smith");
        row2.createCell(1).setCellValue(30);

        // Write the output to a file
        try (FileOutputStream fos = new FileOutputStream(excelFilePath)) {
            workbook.write(fos);
            System.out.println("Excel file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Closing the workbook after writing
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
