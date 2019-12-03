package br.com.fourward.cip.canonical;

import java.io.Serializable;

public class GeneratorFileNameRulesCanonical implements Serializable{

	private static final long serialVersionUID = -5906575905086964771L;

	private String systemDate;
	private String fileType;	
	private String sequenceNumber;
	private String ispb;
	private String cnpjBase;
	
	public GeneratorFileNameRulesCanonical(){
		
	}
	
	public GeneratorFileNameRulesCanonical(final String systemDate, final String fileType, final String sequenceNumber, 
			final String ispb, final String cnpjBase) {
		super();
		this.systemDate = systemDate;
		this.fileType = fileType;
		this.sequenceNumber = sequenceNumber;
		this.ispb = ispb;
		this.cnpjBase = cnpjBase;
	}

	public String getSystemDate() {
		return systemDate;
	}

	public void setSystemDate(final String systemDate) {
		this.systemDate = systemDate;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(final String fileType) {
		this.fileType = fileType;
	}

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(final String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getIspb() {
		return ispb;
	}

	public void setIspb(final String ispb) {
		this.ispb = ispb;
	}
			
	public String getCnpjBase() {
		return cnpjBase;
	}

	public void setCnpjBase(String cnpjBase) {
		this.cnpjBase = cnpjBase;
	}

	public String getFileName(){
		return String.format("%s_%s_%s_%s", fileType, cnpjBase, systemDate, sequenceNumber);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpjBase == null) ? 0 : cnpjBase.hashCode());
		result = prime * result + ((fileType == null) ? 0 : fileType.hashCode());
		result = prime * result + ((ispb == null) ? 0 : ispb.hashCode());
		result = prime * result + ((sequenceNumber == null) ? 0 : sequenceNumber.hashCode());
		result = prime * result + ((systemDate == null) ? 0 : systemDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeneratorFileNameRulesCanonical other = (GeneratorFileNameRulesCanonical) obj;
		if (cnpjBase == null) {
			if (other.cnpjBase != null)
				return false;
		} else if (!cnpjBase.equals(other.cnpjBase))
			return false;
		if (fileType == null) {
			if (other.fileType != null)
				return false;
		} else if (!fileType.equals(other.fileType))
			return false;
		if (ispb == null) {
			if (other.ispb != null)
				return false;
		} else if (!ispb.equals(other.ispb))
			return false;
		if (sequenceNumber == null) {
			if (other.sequenceNumber != null)
				return false;
		} else if (!sequenceNumber.equals(other.sequenceNumber))
			return false;
		if (systemDate == null) {
			if (other.systemDate != null)
				return false;
		} else if (!systemDate.equals(other.systemDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GeneratorFileNameRulesCanonical [systemDate=" + systemDate + ", fileType=" + fileType
				+ ", sequenceNumber=" + sequenceNumber + ", ispb=" + ispb + ", cnpjBase=" + cnpjBase + "]";
	}	
}
