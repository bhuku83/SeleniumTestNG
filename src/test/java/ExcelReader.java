
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Development\\Java\\exceldataProvider\\NewExcelUtil2020_ApachePOI\\src\\main\\java\\com\\excel\\lib\\util\\SampleExcel.xlsx";
       // File f = new File(path);
        FileInputStream file = new FileInputStream(path);

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getLastRowNum();
        int columnCount = sheet.getRow(0).getLastCellNum();

        System.out.println("RowCount " + rowCount + "Column Count " + columnCount);



    }
}
