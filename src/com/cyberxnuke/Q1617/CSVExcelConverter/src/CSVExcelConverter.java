import com.aspose.cells.FileFormatType;
import com.aspose.cells.LoadOptions;
import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

/**
 * 
 */

/**
 * @author CyberxNuke
 *
 */


public class CSVExcelConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Opening CSV Files
		// Creating CSV LoadOptions object
		LoadOptions loadOptions = new LoadOptions(FileFormatType.CSV);
		String dataDir = "/Users/x/Downloads/";
		// Creating an Workbook object with CSV file path and the loadOptions
		// object
		Workbook workbook = null;
		try {
			workbook = new Workbook(dataDir  + "addresses.csv", loadOptions);
			workbook.save(dataDir + "CSVtoExcel.xlsx" , SaveFormat.XLSX);
			System.out.println("Converted CSV to XLSX!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Load the input Excel file
		Workbook workbook2;
		try {
			workbook2 = new Workbook(dataDir + "CSVtoExcel.xlsx");
			// Save output CSV file
			workbook2.save(dataDir + "ExcelToCSV.csv" , SaveFormat.CSV);
			System.out.println("Converted XLSX to CSV!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
