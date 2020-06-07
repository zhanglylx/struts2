package cn.tedu.web;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.*;

@Controller
@Scope("prototype")
public class ExcelAction {
    private InputStream excel;

    public InputStream getExcel() {
        return excel;
    }

    public void setExcel(InputStream excel) {
        this.excel = excel;
    }


    public String execute() throws IOException {
//        在内存中创建excel文件
        Workbook workbook = new HSSFWorkbook();

//        在工作簿创建一个表
        Sheet sheet = workbook.createSheet();
//        在工作表创建一行
        Row row = sheet.createRow(0);
//        在一行中创建一个单元格
        Cell cell = row.createCell(0);
//        在单元中添加字符串
        cell.setCellValue("Hello World!");
//        保存到byte数组
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        workbook.write(out);
        workbook.close();
//        返回流
        byte[] buf = out.toByteArray();
        this.excel = new ByteArrayInputStream(buf);
        return "success";
    }
}
