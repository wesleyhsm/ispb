package br.com.fourward.cip.canonical.builder;

import br.com.fourward.cip.canonical.BankIspbTranslateCanonical;
import br.com.fourward.cip.canonical.GeneratorFileNameRulesCanonical;
import br.com.fourward.cip.canonical.PaymentFileCanonical;
import br.com.fourward.cip.canonical.PaymentFileGeneratorCanonical;

public class PaymentFileGeneratorCanonicalBuilder {

	private GeneratorFileNameRulesCanonical generatorFileNameRulesCanonical;
	private PaymentFileCanonical paymentFileCanonical;
	private BankIspbTranslateCanonical bankIspbTranslateCanonicalSubAcquirer;
	private BankIspbTranslateCanonical bankIspbTranslateCanonicalPontoVenda;
	
	public static PaymentFileGeneratorCanonicalBuilder create(){
		return new PaymentFileGeneratorCanonicalBuilder();
	}

	private PaymentFileGeneratorCanonicalBuilder(){

	}
	
	public PaymentFileGeneratorCanonicalBuilder setGeneratorFileNameRulesCanonical(final GeneratorFileNameRulesCanonical generatorFileNameRulesCanonical){
		this.generatorFileNameRulesCanonical = generatorFileNameRulesCanonical;
		return this;
	}

	public PaymentFileGeneratorCanonicalBuilder setPaymentFileCanonical(final PaymentFileCanonical paymentFileCanonical){
		this.paymentFileCanonical = paymentFileCanonical;
		return this;
	}

	public PaymentFileGeneratorCanonicalBuilder setBankIspbTranslateCanonicalSubAcquirer(final BankIspbTranslateCanonical bankIspbTranslateCanonicalSubAcquirer){
		this.bankIspbTranslateCanonicalSubAcquirer = bankIspbTranslateCanonicalSubAcquirer;
		return this;
	}

	public PaymentFileGeneratorCanonicalBuilder setBankIspbTranslateCanonicalPontoVenda(final BankIspbTranslateCanonical bankIspbTranslateCanonicalPontoVenda){
		this.bankIspbTranslateCanonicalPontoVenda = bankIspbTranslateCanonicalPontoVenda;
		return this;
	}
	
	public PaymentFileGeneratorCanonical build(){
		return new PaymentFileGeneratorCanonical(generatorFileNameRulesCanonical, paymentFileCanonical, bankIspbTranslateCanonicalSubAcquirer, bankIspbTranslateCanonicalPontoVenda);
	}
}