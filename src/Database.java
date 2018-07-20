import java.sql.*;

/**
 * Represents a database to interact with.
 * A database can contain multiple tables.
 * The Database object has all the basic SQL commands but in familiar Java semantics.
 * 
 * @author Michael F Zhang
 *
 */
public class Database {
	/* The name of the database. */
	private String name;
	
	/* The database type (MySQL, PostgreSQL, Oracle, etc). */
	private String databaseType;
	
	/* The driver. */
	private String driver;
	
	/* The access URL for the database. */
	private String url;
	
	/* The number of tables in the database. */
	private int numTables;
	
	/* The tables in the database. */
	private Table[] tables;
	
	/**
	 * Create a link between a Database object and the database to fetch data from.
	 */
	public Database(/* need parameters for fetching database */) {
		
	}
	
	/**
	 * Returns the name of the database.
	 * 
	 * @return	the database name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns the database type (MySQL, PostgreSQL, Oracle, etc).
	 * 
	 * @return	the database type
	 */
	public String getDatabaseType() {
		return this.databaseType;
	}
	
	/**
	 * Returns the driver.
	 * 
	 * @return the driver
	 */
	public String getDriver() {
		return this.driver;
	}
	
	/**
	 * Returns the URL to access database.
	 * 
	 * @return the access database URL
	 */
	public String getUrl() {
		return this.url;
	}
	
	/**
	 * Returns the number of tables in the database.
	 * 
	 * @return	the number of tables in database
	 */
	public int getNumTables() {
		return this.numTables;
	}
	
	/**
	 * Returns an array of all the tables in the database.
	 * 
	 * @return	array of table objects in database
	 */
	public Table[] getTables() {
		return this.tables;
	}
	
	/**
	 * Returns specified table.
	 * Pass in arguments to identify a specific table. This method then
	 * returns that specific table object satisfying the arguments.
	 * 
	 * @param args	parameters to identify a table
	 * @return		the table object satisfying parameters
	 */
	public Table getTable(String args[]) {
		return new Table();
	}
	
	/**
	 * Returns database information as a string.
	 * 
	 * @return	database information
	 */
	public String print() {
		return "Database name:<name>; Database type:<type>, etc etc etc";
	}
	
	/**
	 * Create a table within the database.
	 * The table will be created from the specifications listed in args.
	 * 
	 * @param args	specifications for table
	 * @return		the newly created Table object
	 */
	public Table createTable(String args[]) {
		return new Table();
	}
	
	/**
	 * Deletes a specified table.
	 * 
	 * @param tableName	the name of the table to delete
	 * @return			whether deletion was successful (true-yes;false-no)
	 */
	public boolean deleteTable(String tableName) {
		return true;
	}
	
	/**
	 * Deletes the database.
	 * The parameter is there to act as a two step authorization to delete
	 * the database (first: call delete, second: pass in either "YES" or "NO").
	 * 
	 * @param certain	pass in "YES" to delete database, "NO" for the method to do nothing
	 * @return			true if database successfully deleted, false otherwise
	 */
	public boolean delete(String certain) {
		/* delete this object */
		return true;
	}
}
