import java.sql.*;

/**
 * Represents a table within a database.
 * A table can contain multiple records.
 * The Table object has all the basic SQL commands but in familiar Java semantics.
 * 
 * @author Michael F Zhang
 *
 */
public class Table {
	private String name;
	private String[] desc;
	private int numRows;
	private int numCols;
	private String[] headers;
	private Record[] records;
	private String PK;
	
	/**
	 * Locate an existing table in the database and represent it.
	 */
	public Table(/* need parameters for locating table */) {
		
	}
	
	/**
	 * Returns the name of the table.
	 * 
	 * @return	the name of the table
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns the data layout of the table.
	 * The data layout of the table includes the column headers and their data types.
	 * 
	 * @return	the table data layout
	 */
	public String[] getDesc() {
		return this.desc;
	}
	
	/**
	 * Returns the number of records in the table.
	 * 
	 * @return	the number of records
	 */
	public int getNumRows() {
		return this.numRows;
	}
	
	/**
	 * Returns the number of columns in the table.
	 * 
	 * @return	the number of columns
	 */
	public int getNumCols() {
		return this.numCols;
	}
	
	/**
	 * Returns all the headers in the table.
	 * 
	 * @return	an array of table headers
	 */
	public String[] getHeaders() {
		return this.headers;
	}
	
	/**
	 * Returns all the records in the table.
	 * 
	 * @return	an array of records
	 */
	public Record[] getRecords() {
		return this.records;
	}
	
	/**
	 * Returns the name of the header holding the primary key.
	 * 
	 * @return	the primary key header
	 */
	public String getPK() {
		return this.PK;
	}
	
	/**
	 * Returns table information as a string.
	 * 
	 * @return	table information
	 */
	public String print() {
		return "<Stuff>";
	}
	
	/**
	 * Returns one record of the table.
	 * This method will return a record specific to the parameters given. If
	 * there are multiple records satisfying the parameters, this method will
	 * return the first one.
	 * 
	 * @param args	search parameters
	 * @return		a record adhering to parameters
	 */
	public Record getRecord(String args[]) {
		return new Record();
	}
	
	/**
	 * Returns a new table with records pertaining to the parameters.
	 * This method will return a new table object with records that only have
	 * columns and values specified in the parameters.
	 * 
	 * @param args	search parameters
	 * @return		a new table adhering to parameters
	 */
	public Type[] getCols(String args[]) {
		return new Type[0];
	}
	
	/**
	 * Returns all records pertaining to the parameters.
	 * This method will return all records that satisfy the parameters.
	 * 
	 * @param args	search parameters
	 * @return		an array of records adhering to parameters
	 */
	public Record[] getRecords(String args[]) {
		return new Record[0];
	}
	
	/**
	 * Insert a record with the values pass in.
	 * 
	 * @param args	record values
	 * @return		the record just created
	 */
	public Record insertRecord(String args[]) {
		return new Record();
	}
	
	/**
	 * Update an existing record with the values passed in.
	 * 
	 * @param args	values to update to
	 * @return		the record after updating
	 */
	public Record updateRecord(String args[]) {
		return new Record();
	}
	
	public boolean deleteRecord(String args[]) {
		return true;
	}
	
	public boolean alterTable(String args[]) {
		return true;
	}
	
	public boolean delete(String certain) {
		/* delete this object */
		return true;
	}
}
