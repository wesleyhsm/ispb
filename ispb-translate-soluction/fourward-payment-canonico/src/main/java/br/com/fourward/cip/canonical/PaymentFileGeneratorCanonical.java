package br.com.fourward.cip.canonical;

import java.io.Serializable;

public class PaymentFileGeneratorCanonical implements  Serializable{

	private static final long serialVersionUID = 3522851243011780262L;
	
	private GeneratorFileNameRulesCanonical generatorFileNameRulesCanonical;
	private PaymentFileCanonical paymentFileCanonical;
	private BankIspbTranslateCanonical bankIspbTranslateCanonicalSubAcquirer;
	private BankIspbTranslateCanonical bankIspbTranslateCanonicalPontoVenda;
	
	public PaymentFileGeneratorCanonical(){
		
	}

	public PaymentFileGeneratorCanonical(GeneratorFileNameRulesCanonical generatorFileNameRulesCanonical,
			PaymentFileCanonical paymentFileCanonical, BankIspbTranslateCanonical bankIspbTranslateCanonicalSubAcquirer,
			BankIspbTranslateCanonical bankIspbTranslateCanonicalPontoVenda) {
		super();
		this.generatorFileNameRulesCanonical = generatorFileNameRulesCanonical;
		this.paymentFileCanonical = paymentFileCanonical;
		this.bankIspbTranslateCanonicalSubAcquirer = bankIspbTranslateCanonicalSubAcquirer;
		this.bankIspbTranslateCanonicalPontoVenda = bankIspbTranslateCanonicalPontoVenda;
	}

	public GeneratorFileNameRulesCanonical getGeneratorFileNameRules() {
		return generatorFileNameRulesCanonical;
	}

	public void setGeneratorFileNameRules(GeneratorFileNameRulesCanonical generatorFileNameRulesCanonical) {
		this.generatorFileNameRulesCanonical = generatorFileNameRulesCanonical;
	}

	public PaymentFileCanonical getPaymentFileCanonical() {
		return paymentFileCanonical;
	}

	public void setPaymentFileCanonical(PaymentFileCanonical paymentFileCanonical) {
		this.paymentFileCanonical = paymentFileCanonical;
	}

	public BankIspbTranslateCanonical getBankIspbTranslateCanonicalSubAcquirer() {
		return bankIspbTranslateCanonicalSubAcquirer;
	}

	public void setBankIspbTranslateCanonicalSubAcquirer(BankIspbTranslateCanonical bankIspbTranslateCanonicalSubAcquirer) {
		this.bankIspbTranslateCanonicalSubAcquirer = bankIspbTranslateCanonicalSubAcquirer;
	}

	public BankIspbTranslateCanonical getBankIspbTranslateCanonicalPontoVenda() {
		return bankIspbTranslateCanonicalPontoVenda;
	}

	public void setBankIspbTranslateCanonicalPontoVenda(BankIspbTranslateCanonical bankIspbTranslateCanonicalPontoVenda) {
		this.bankIspbTranslateCanonicalPontoVenda = bankIspbTranslateCanonicalPontoVenda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankIspbTranslateCanonicalPontoVenda == null) ? 0
				: bankIspbTranslateCanonicalPontoVenda.hashCode());
		result = prime * result + ((bankIspbTranslateCanonicalSubAcquirer == null) ? 0
				: bankIspbTranslateCanonicalSubAcquirer.hashCode());
		result = prime * result
				+ ((generatorFileNameRulesCanonical == null) ? 0 : generatorFileNameRulesCanonical.hashCode());
		result = prime * result + ((paymentFileCanonical == null) ? 0 : paymentFileCanonical.hashCode());
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
		PaymentFileGeneratorCanonical other = (PaymentFileGeneratorCanonical) obj;
		if (bankIspbTranslateCanonicalPontoVenda == null) {
			if (other.bankIspbTranslateCanonicalPontoVenda != null)
				return false;
		} else if (!bankIspbTranslateCanonicalPontoVenda.equals(other.bankIspbTranslateCanonicalPontoVenda))
			return false;
		if (bankIspbTranslateCanonicalSubAcquirer == null) {
			if (other.bankIspbTranslateCanonicalSubAcquirer != null)
				return false;
		} else if (!bankIspbTranslateCanonicalSubAcquirer.equals(other.bankIspbTranslateCanonicalSubAcquirer))
			return false;
		if (generatorFileNameRulesCanonical == null) {
			if (other.generatorFileNameRulesCanonical != null)
				return false;
		} else if (!generatorFileNameRulesCanonical.equals(other.generatorFileNameRulesCanonical))
			return false;
		if (paymentFileCanonical == null) {
			if (other.paymentFileCanonical != null)
				return false;
		} else if (!paymentFileCanonical.equals(other.paymentFileCanonical))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentFileGeneratorCanonical [generatorFileNameRulesCanonical=" + generatorFileNameRulesCanonical
				+ ", paymentFileCanonical=" + paymentFileCanonical + ", bankIspbTranslateCanonicalSubAcquirer="
				+ bankIspbTranslateCanonicalSubAcquirer + ", bankIspbTranslateCanonicalPontoVenda="
				+ bankIspbTranslateCanonicalPontoVenda + "]";
	}	
}
