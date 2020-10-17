package com.ahead.school.util;

import com.ahead.school.entity.Student;
import com.ahead.school.entity.StudentScoreExcelEntity;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileExcelUtil {

    public static List<StudentScoreExcelEntity> scoreManage(MultipartFile file) {
        XSSFWorkbook wb = null;
        try {
            wb = new XSSFWorkbook(file.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet = wb.getSheetAt(0);
        XSSFRow row = null;
        List<StudentScoreExcelEntity> result = new ArrayList<StudentScoreExcelEntity>();
        for (int i = 2; i < sheet.getPhysicalNumberOfRows(); i++){
            row = sheet.getRow(i);
            result.add(new StudentScoreExcelEntity(
                    row.getCell(0).getStringCellValue(),
                    row.getCell(1).getStringCellValue(),
                    row.getCell(2).getStringCellValue(),
                    row.getCell(3).getStringCellValue(),
                    row.getCell(4).getStringCellValue(),
                    row.getCell(5).getStringCellValue(),
                    row.getCell(6).getStringCellValue(),
                    row.getCell(7).getNumericCellValue(),
                    row.getCell(8).getNumericCellValue(),
                    row.getCell(9).getNumericCellValue(),
                    row.getCell(13).getColumnIndex(),
                    row.getCell(14).getStringCellValue(),
                    row.getCell(15).getStringCellValue(),
                    row.getCell(16).getStringCellValue()
            ));
        }
        return result;
    }
}
