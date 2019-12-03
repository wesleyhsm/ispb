package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.GeneratorFileNameRulesCanonical;

public class GeneratorFileNameRulesCanonicalBuilder {

	private String systemDate;
	private String fileType;
	private String sequenceNumber;
	private String ispb;
	private String cnpjBase;
	
	public static GeneratorFileNameRulesCanonicalBuilder create(){
		return new GeneratorFileNameRulesCanonicalBuilder();
	}

	private GeneratorFileNameRulesCanonicalBuilder(){

	}
	
	public GeneratorFileNameRulesCanonicalBuilder setSystemDate(final String systemDate){
		this.systemDate = systemDate;
		return this;
	}

	public GeneratorFileNameRulesCanonicalBuilder setFileType(final String fileType){
		this.fileType = fileType;
		return this;
	}

	public GeneratorFileNameRulesCanonicalBuilder setSequenceNumber(final String sequenceNumber){
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public GeneratorFileNameRulesCanonicalBuilder setIspb(final String ispb){
		this.ispb = ispb;
		return this;
	}

	public GeneratorFileNameRulesCanonicalBuilder setCnpjBase(final String cnpjBase){
		this.cnpjBase = cnpjBase;
		return this;
	}

	public GeneratorFileNameRulesCanonical build(){
		return new GeneratorFileNameRulesCanonical(systemDate, fileType, sequenceNumber, ispb, cnpjBase);
	}
}