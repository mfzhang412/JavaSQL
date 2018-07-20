import java.sql.*;

public class Record {
	private int index;
	private int PKval;
	private List[] contents;
	
	public Record(/* need parameters for locating record */) {
		
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public int getPK() {
		return this.PKval;
	}
	
	public List[] getContents() {
		return this.contents;
	}
	
	public Type get(String args[]) {
		return contents[i];
	}
	
	public String print() {
		return "<Stuff>";
	}
	
	public boolean delete(String certain) {
		/* delete this object */
		return true;
	}
}
