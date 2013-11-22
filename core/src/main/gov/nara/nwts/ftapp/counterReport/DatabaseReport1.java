package gov.nara.nwts.ftapp.counterReport;

import gov.nara.nwts.ftapp.counter.CounterData;
import gov.nara.nwts.ftapp.counter.REV;
import gov.nara.nwts.ftapp.counter.ReportType;

public class DatabaseReport1 extends ReportType {
	public static final String NAME = "Database Report 1";
	public DatabaseReport1(REV rev, String title) {
		super(NAME, rev, title);
	}
	public DatabaseReport1() {
		super(NAME, REV.R3, "Total Searches and Sessions by Month and Database");
	}
	
	public static String[] FIELDS = {"Total searches run","Searches-federated and automated","Total sessions","Sessions-federated and automated"};
	public static String[] COLS = {"","Publisher","Platform",""};
	public String[] getCols() {return COLS;}
	
	@Override public void initCustom(CounterData data) {
		checkFields(data, getDataRow(), getFirstDataCol()-1, FIELDS);
		this.checkColHeader(data);
	}
	
	public boolean isSupported() {
		return true;
	}
	public boolean hasTotalRow() {
		return false;
	}
}