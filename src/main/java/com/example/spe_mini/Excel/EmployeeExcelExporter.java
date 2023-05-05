package com.example.spe_mini.Excel;

import com.example.spe_mini.Models.*;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmployeeExcelExporter {
    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

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

    private XSSFSheet writeHeaderLine(int activityNumber, String arr[]) {
        XSSFSheet sheet;
        if(activityNumber==1)
            sheet = workbook.createSheet("1.Conferences, Seminars, Workshops conducted");
        else if (activityNumber==2) {
            sheet = workbook.createSheet("2.Research Publications");
        } else if (activityNumber==3) {
            sheet = workbook.createSheet("3.Research Projects undertaken");
        } else if (activityNumber==4) {
            sheet = workbook.createSheet("4.Staff achievement");
        }
        else {
            sheet = workbook.createSheet("5.Student achievement");
        }
        Row row = sheet.createRow(0);

        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);

        int i = 0;
        for(String s:arr) {
            createCell(sheet, row, i, s, style);
            i++;
        }
        return sheet;
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

    private void writeDataLines(int activityNumber, XSSFSheet sheet) {
        if(activityNumber==1) {
            int rowCount = 1;

            CellStyle style = workbook.createCellStyle();
            XSSFFont font = workbook.createFont();
            font.setFontHeight(14);
            style.setFont(font);

            for (Activity1 activity1 : activity1s) {
                Row row = sheet.createRow(rowCount++);
                int columnCount = 0;

                createCell(sheet, row, columnCount++, activity1.getA1_id(), style);
                createCell(sheet, row, columnCount++, activity1.getEvent(), style);
                createCell(sheet, row, columnCount++, activity1.getTitle(), style);
                createCell(sheet, row, columnCount++, dateFormatter.format(activity1.getDate()), style);
                createCell(sheet, row, columnCount++, activity1.getNoOfParticipants(), style);
                createCell(sheet, row, columnCount++, activity1.getRemark(), style);

            }
        } else if (activityNumber==2) {
            int rowCount = 1;

            CellStyle style = workbook.createCellStyle();
            XSSFFont font = workbook.createFont();
            font.setFontHeight(14);
            style.setFont(font);

            for (Activity2 activity2 : activity2s) {
                Row row = sheet.createRow(rowCount++);
                int columnCount = 0;

                createCell(sheet, row, columnCount++, activity2.getA2_id(), style);
                createCell(sheet, row, columnCount++, activity2.getAuthor(), style);
                createCell(sheet, row, columnCount++, activity2.getTitle(), style);
                createCell(sheet, row, columnCount++, dateFormatter.format(activity2.getDate()), style);
                createCell(sheet, row, columnCount++, activity2.getRemark(), style);
                createCell(sheet, row, columnCount++, activity2.getPublication(), style);

            }
        }  else if (activityNumber==3) {
            int rowCount = 1;

            CellStyle style = workbook.createCellStyle();
            XSSFFont font = workbook.createFont();
            font.setFontHeight(14);
            style.setFont(font);

            for (Activity3 activity3 : activity3s) {
                Row row = sheet.createRow(rowCount++);
                int columnCount = 0;

                createCell(sheet, row, columnCount++, activity3.getA3_id(), style);
                createCell(sheet, row, columnCount++, activity3.getTitleOfResearch(), style);
                createCell(sheet, row, columnCount++, dateFormatter.format(activity3.getDate()), style);
                createCell(sheet, row, columnCount++, activity3.getNameOfResearchers(), style);

            }
        } else if (activityNumber==4) {
            int rowCount = 1;

            CellStyle style = workbook.createCellStyle();
            XSSFFont font = workbook.createFont();
            font.setFontHeight(14);
            style.setFont(font);

            for (Activity4 activity4 : activity4s) {
                Row row = sheet.createRow(rowCount++);
                int columnCount = 0;

                createCell(sheet, row, columnCount++, activity4.getA4_id(), style);
                createCell(sheet, row, columnCount++, activity4.getName(), style);
                createCell(sheet, row, columnCount++, activity4.getAchievement(), style);
                createCell(sheet, row, columnCount++, dateFormatter.format(activity4.getDate()), style);
                createCell(sheet, row, columnCount++, activity4.getRemark(), style);

            }
        } else {
            int rowCount = 1;

            CellStyle style = workbook.createCellStyle();
            XSSFFont font = workbook.createFont();
            font.setFontHeight(14);
            style.setFont(font);

            for (Activity5 activity5 : activity5s) {
                Row row = sheet.createRow(rowCount++);
                int columnCount = 0;

                createCell(sheet, row, columnCount++, activity5.getA5_id(), style);
                createCell(sheet, row, columnCount++, activity5.getStudentName(), style);
                createCell(sheet, row, columnCount++, activity5.getStandard(), style);
                createCell(sheet, row, columnCount++, dateFormatter.format(activity5.getDate()), style);
                createCell(sheet, row, columnCount++, activity5.getAchievement(), style);
                createCell(sheet, row, columnCount++, activity5.getRemark(), style);

            }
        }
    }

    public void export(HttpServletResponse response) throws IOException {

        String header1[] = {"Activity no.","Event","Title","Date","No. of Participants","Remarks"};
        String header2[] = {"Activity no.","Author","Title","Date","Remarks","Publication"};
        String header3[] = {"Activity no.","Title of Research","Date","Name of Researchers"};
        String header4[] = {"Activity no.","Name","Achievement","Date","Remarks"};
        String header5[] = {"Activity no.","Student Name","Standard","Date","No. of Achievement","Remarks"};

        XSSFSheet sheet1, sheet2, sheet3, sheet4, sheet5;

        sheet1 = writeHeaderLine(1, header1);
        sheet2 = writeHeaderLine(2, header2);
        sheet3 = writeHeaderLine(3, header3);
        sheet4 = writeHeaderLine(4, header4);
        sheet5 = writeHeaderLine(5, header5);

        writeDataLines(1, sheet1);
        writeDataLines(2, sheet2);
        writeDataLines(3, sheet3);
        writeDataLines(4, sheet4);
        writeDataLines(5, sheet5);

        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();

        outputStream.close();

    }
}
