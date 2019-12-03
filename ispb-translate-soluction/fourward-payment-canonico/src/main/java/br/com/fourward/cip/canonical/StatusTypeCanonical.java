package br.com.fourward.cip.canonical;

import java.util.Arrays;

public enum StatusTypeCanonical {	
	Received("Received"),
	Processing("Processing"),
	Approved("Approved"),
	Egen0043("Egen0043"),
	Egen0085("Egen0085"),
	Eslc0006("Eslc0006"),
	Eslc0007("Eslc0007"),
	Eslc0029("Eslc0029"),
	Eslc0088("Eslc0088"),
	Eslc0089("Eslc0089"),
	Eslc0090("Eslc0090"),
	Eslc0091("Eslc0091"),
	Eslc0102("Eslc0102"),
	Eslc0103("Eslc0103"),
	Eslc0104("Eslc0104"),
	Eslc0105("Eslc0105"),
	Eslc0106("Eslc0106"),
	Eslc0107("Eslc0107"),
	Eslc0108("Eslc0108"),
	Eslc0112("Eslc0112"),
	Eslc0117("Eslc0117"),
	Eslc0118("Eslc0118"),
	Eslc0119("Eslc0119"),
	Eslc0121("Eslc0121"),
	Eslc0122("Eslc0122"),
	Eslc0123("Eslc0123"),
	Eslc0124("Eslc0124"),
	Eslc0125("Eslc0125"),
	Eslc0126("Eslc0126"),
	Eslc0127("Eslc0127"),
	Eslc0131("Eslc0131"),
	Eslc0132("Eslc0132"),
	Eslc0133("Eslc0133"),
	Eslc0138("Eslc0138"),
	Eslc0139("Eslc0139"),
	Eslc0140("Eslc0140"),
	Eslc0141("Eslc0141"),
	Eslc0142("Eslc0142"),
	Eslc0143("Eslc0143"),
	Eslc0144("Eslc0144"),
	Eslc0145("Eslc0145"),
	Eslc0042("Eslc0042"),
	Eslc0110("Eslc0110"),
	Eslc0111("Eslc0111"),
	Eslc0114("Eslc0114");
	
	private final String value;
	
	private StatusTypeCanonical(final String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	public static StatusTypeCanonical create(final String value){
		return Arrays.asList(StatusTypeCanonical.values()).parallelStream().filter(predicate->predicate.value.equals(value)).findFirst().orElseThrow(()->new RuntimeException("StatusType not found"));
	}
}
