package com.bridgelabz.indianstatescensusanalyser;

import com.opencsv.bean.CsvBindByName;

public class IndianStateCodeCSV {
	 @CsvBindByName(column = "State", required = true)
	    public int state;

	    @CsvBindByName(column = "StateCode", required = true)
	    public int statecode;

	    @Override
	    public String toString() {
	        return "IndiaCensusCSV{" +
	                "State='" + state + '\'' +
	                ", Population='" + statecode + '\'' +
	                '}';
}
}