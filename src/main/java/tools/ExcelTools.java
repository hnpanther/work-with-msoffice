package tools;

import model.DataModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;

public class ExcelTools {


    public void writeToExcel(Map<Integer, DataModel> data) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data");

        int rowNum = 0;
        Set<Integer> keys = data.keySet();
        for(Integer i: keys) {
            Row row = sheet.createRow(rowNum++);
            DataModel dataModel = data.get(i);
            Cell cell1 = row.createCell(0);
            cell1.setCellValue(dataModel.getId());
            Cell cell2 = row.createCell((1));
            cell2.setCellValue(dataModel.getFirstName());
            Cell cell3 = row.createCell(2);
            cell3.setCellValue(dataModel.getLastName());

        }

        try(FileOutputStream out = new FileOutputStream(new File("data.xlsx"))) {
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
