package com.oxytech.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataClass {
    

   public static String username;
   public static String passwrd;
   public static String Query;
   public static String buyer_first_name;
   public static String buyer_last_name;
   public static String buyer_email;
   public static Integer phone_number;
   public static Integer plot_number;
   public static String filePath = "C:\\Work";
    
    
    public static void  readExcel(String filePath,String fileName,String sheetName) throws IOException{

        //Create an object of File class to open xlsx file

        File file =    new File(filePath+"\\"+fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook data = null;
        List<Object> value = new  ArrayList<Object>();

        //Find the file extension by splitting file name in substring  and getting only extension name

        String fileExtensionName = fileName.substring(fileName.indexOf("."));

        //Check condition if the file is xlsx file

        if(fileExtensionName.equals(".xlsx")){

        //If it is xlsx file then create object of XSSFWorkbook class

        data = new XSSFWorkbook(inputStream);

        }

        //Check condition if the file is xls file

        else if(fileExtensionName.equals(".xls")){

            //If it is xls file then create object of HSSFWorkbook class

            data = new HSSFWorkbook(inputStream);

        }

        //Read sheet inside the workbook by its name

        Sheet dataSheet = data.getSheet(sheetName);

        //Find number of rows in excel file

        int rowCount = dataSheet.getLastRowNum()-dataSheet.getFirstRowNum();

        //Create a loop over all the rows of excel file to read it

        for (int i = 0; i < rowCount; i++) {

            Row row = dataSheet.getRow(i+1);

            //Create a loop to print cell values in a row

            for (int j = 0; j < row.getLastCellNum()-1; j++) {

                //Print Excel data in console
                   
                System.out.print(row.getCell(j).getStringCellValue()+"|| ");
                value.add(row.getCell(j).getStringCellValue());

            }
            
                System.out.print((int)row.getCell(2).getNumericCellValue()+"|| ");
                plot_number=(int)row.getCell(2).getNumericCellValue();
                value.add(row.getCell(2).getNumericCellValue());
              
            
            username = value.get(0).toString();
           passwrd = value.get(1).toString();
//           Query = value.get(2).toString();
           
      } 

   }  
    
    public static void  readBuyerDetails(String filePath,String fileName,String sheetName) throws IOException{

        //Create an object of File class to open xlsx file

        File file =    new File(filePath+"\\"+fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook data = null;
        List<Object> value = new  ArrayList<Object>();

        //Find the file extension by splitting file name in substring  and getting only extension name

        String fileExtensionName = fileName.substring(fileName.indexOf("."));

        //Check condition if the file is xlsx file

        if(fileExtensionName.equals(".xlsx")){

        //If it is xlsx file then create object of XSSFWorkbook class

        data = new XSSFWorkbook(inputStream);

        }

        //Check condition if the file is xls file

        else if(fileExtensionName.equals(".xls")){

            //If it is xls file then create object of HSSFWorkbook class

            data = new HSSFWorkbook(inputStream);

        }

        //Read sheet inside the workbook by its name

        Sheet dataSheet = data.getSheet(sheetName);

        //Find number of rows in excel file

        int rowCount = dataSheet.getLastRowNum()-dataSheet.getFirstRowNum();

        //Create a loop over all the rows of excel file to read it

        for (int i = 0; i < rowCount; i++) {

            Row row = dataSheet.getRow(i+1);

            //Create a loop to print cell values in a row

            for (int j = 0; j < row.getLastCellNum()-1; j++) {

                //Print Excel data in console
                   
                System.out.print(row.getCell(j).getStringCellValue()+"|| ");
                value.add(row.getCell(j).getStringCellValue());

            }
            
                System.out.print((int)row.getCell(3).getNumericCellValue()+"|| ");
                phone_number=(int)row.getCell(3).getNumericCellValue();
                value.add(row.getCell(3).getNumericCellValue());
              
            
            
            buyer_first_name = value.get(0).toString();
           buyer_last_name = value.get(1).toString();
           buyer_email = value.get(2).toString();
           
           
      } 

   }  
    
    
    public static void  readClientDetails(String filePath,String fileName,String sheetName) throws IOException{

        //Create an object of File class to open xlsx file

        File file =    new File(filePath+"\\"+fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook data = null;
        List<Object> value = new  ArrayList<Object>();

        //Find the file extension by splitting file name in substring  and getting only extension name

        String fileExtensionName = fileName.substring(fileName.indexOf("."));

        //Check condition if the file is xlsx file

        if(fileExtensionName.equals(".xlsx")){

        //If it is xlsx file then create object of XSSFWorkbook class

        data = new XSSFWorkbook(inputStream);

        }

        //Check condition if the file is xls file

        else if(fileExtensionName.equals(".xls")){

            //If it is xls file then create object of HSSFWorkbook class

            data = new HSSFWorkbook(inputStream);

        }

        //Read sheet inside the workbook by its name

        Sheet dataSheet = data.getSheet(sheetName);

        //Find number of rows in excel file

        int rowCount = dataSheet.getLastRowNum()-dataSheet.getFirstRowNum();

        //Create a loop over all the rows of excel file to read it

        for (int i = 0; i < rowCount; i++) {

            Row row = dataSheet.getRow(i+1);

            //Create a loop to print cell values in a row

            for (int j = 0; j < row.getLastCellNum()-1; j++) {

                //Print Excel data in console
                   
                System.out.print(row.getCell(j).getStringCellValue()+"|| ");
                value.add(row.getCell(j).getStringCellValue());

            }
            
              
            
            buyer_first_name = value.get(0).toString();
           buyer_last_name = value.get(1).toString();
           buyer_email = value.get(2).toString();
           
           
      }
    }

   
    @Test
    public static void data() throws IOException{
        
        readExcel(filePath, "Data.xlsx", "Login Data");
        readBuyerDetails(filePath, "Data.xlsx", "Buyer Details");
//        readClientDetails(filePath, "Data.xlsx", "Client Details");
        
    }
    
             
 }