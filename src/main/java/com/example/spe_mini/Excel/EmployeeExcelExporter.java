package com.example.spe_mini.Excel;

import com.example.spe_mini.Models.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.List;

public class EmployeeExcelExporter {

    private XSSFWorkbook workbook;
    private List<Activity1> activity1s;
    private List<Activity2> activity2s;
    private List<Activity3> activity3s;
    private List<Activity4> activity4s;
    private List<Activity5> activity5s;

    public EmployeeExcelExporter(List<Activity1> activity1s, List<Activity2> activity2s, List<Activity3> activity3s, List<Activity4> activity4s, List<Activity5> activity5s) {
        this.activity1s = activity1s;
        this.activity2s = activity2s;
        this.activity3s = activity3s;
        this.activity4s = activity4s;
        this.activity5s = activity5s;
        workbook = new XSSFWorkbook();
    }

    private void createCell(XSSFSheet sheet, Row row, int columnCount, Object value, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);
    }


}
