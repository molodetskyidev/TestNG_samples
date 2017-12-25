package dataProviders;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	private static XSSFWorkbook ExcelWbook;
	private static XSSFSheet ExcelSheet;

	public static void setExcelFile(String path, String sheetName) throws Exception {

		try {
			FileInputStream fs = new FileInputStream(path); // open file
			ExcelWbook = new XSSFWorkbook(fs); // put file to workbook object
			ExcelSheet = ExcelWbook.getSheet(sheetName); // get sheet with
															// sheetName from
															// workbook

		} catch (Exception e) { // if there is exception while opening file or
								// getting sheet
			System.out.println(e.getMessage()); // put error message to output
		}
	}

	/*
	 * ************ first variant of ExcelDataProvider *************
	 */

	public static Object[][] getTestDataVar1(String testName) {
		// gets testName as input, will be used to find start and end for test
		// data in sheet
		String[][] testData = null; // initiate testData variable

		try {
			DataFormatter formatter = new DataFormatter();// not sure why it's
			// needed
			XSSFCell[] boundaryCells = findCells(testName); // taking begin and
															// end cells for
															// test data using
															// function
															// findCells and
															// testName variable
			XSSFCell startCell = boundaryCells[0]; // set start cell as
													// element[0] from array of
													// begin and end cells
			XSSFCell endCell = boundaryCells[1]; // set end cell as element[1]
													// from array of begin and
													// end cells
			int startRow = startCell.getRowIndex() + 1; // first row should be
														// read below row with
														// start cell
			int endRow = endCell.getRowIndex() - 1; // last row should be read
													// above row with end cell
			int startCol = startCell.getColumnIndex() + 1; // first column
															// should be read
															// next to column
															// with start cell
			int endCol = endCell.getColumnIndex() - 1; // last column should be
														// read before column
														// with end cell
			// so test data is between start and end cell and can contain
			// different number of rows and columns
			// start and end cell are defined by value in these cells which
			// should equals to testName variable
			testData = new String[endRow - startRow + 1][endCol - startCol + 1];
			// in array we go through array of cells defined in testData
			for (int i = startRow; i < endRow + 1; i++) {
				for (int j = startCol; j < endCol + 1; j++) {

					Cell cell = ExcelSheet.getRow(i).getCell(j); // get cell
					testData[i - startRow][j - startCol] = formatter.formatCellValue(cell); // store
																							// value
																							// from
																							// cell
																							// to
																							// testData
																							// array
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testData; // return array of testData
	}

	public static XSSFCell[] findCells(String testName) {
		DataFormatter formatter = new DataFormatter(); // not sure why it's
														// needed
		String pos = "begin"; // variable to define that it's first appearance
								// of testName
		XSSFCell[] cells = new XSSFCell[2];

		for (Row row : ExcelSheet) {
			for (Cell cell : row) { // go through all rows of sheet
				if (testName.equals(formatter.formatCellValue(cell))) { // if
																		// there
																		// is
																		// testName
																		// in
																		// the
																		// cell
					if (pos.equalsIgnoreCase("begin")) { // if pos is not
															// changed, so it's
															// the first
															// appearance of
															// testName
						cells[0] = (XSSFCell) cell; // set position of cell to
													// array which we return, so
													// it's the first element
													// which is start of
													// testData
						pos = "end"; // change pos, so when we find testName
										// again we know that it's not first
										// appearance of testName
					} else {
						cells[1] = (XSSFCell) cell; // if it's not the first
													// appearance of testName,
													// so we add second element
													// to our cells array which
													// is end of testData
					}
				}
			}
		}
		return cells; // return array of cells from 2 cells: start of testData
						// and end of testData
	}
}
