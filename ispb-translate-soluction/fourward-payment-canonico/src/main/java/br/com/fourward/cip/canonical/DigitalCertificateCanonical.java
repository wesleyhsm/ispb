package br.com.fourward.cip.canonical;

import java.io.Serializable;

public class DigitalCertificateCanonical implements  Serializable{
	
	private static final long serialVersionUID = -655271526776813284L;
	
	private CertificateCanonical certificateCanonical;
	private ValidateDateCertificateCanonical validateDateCertificateCanonical;
	
	public DigitalCertificateCanonical(){
		
	}
	
	public DigitalCertificateCanonical(CertificateCanonical certificateCanonical,
			ValidateDateCertificateCanonical validateDateCertificateCanonical) {
		super();
		this.certificateCanonical = certificateCanonical;
		this.validateDateCertificateCanonical = validateDateCertificateCanonical;
	}

	public CertificateCanonical getCertificateCanonical() {
		return certificateCanonical;
	}

	public void setCertificateCanonical(CertificateCanonical certificateCanonical) {
		this.certificateCanonical = certificateCanonical;
	}

	public ValidateDateCertificateCanonical getValidateDateCertificateCanonical() {
		return validateDateCertificateCanonical;
	}

	public void setValidateDateCertificateCanonical(ValidateDateCertificateCanonical validateDateCertificateCanonical) {
		this.validateDateCertificateCanonical = validateDateCertificateCanonical;
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((certificateCanonical == null) ? 0 : certificateCanonical.hashCode());
		result = prime * result
				+ ((validateDateCertificateCanonical == null) ? 0 : validateDateCertificateCanonical.hashCode());
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
		DigitalCertificateCanonical other = (DigitalCertificateCanonical) obj;
		if (certificateCanonical == null) {
			if (other.certificateCanonical != null)
				return false;
		} else if (!certificateCanonical.equals(other.certificateCanonical))
			return false;
		if (validateDateCertificateCanonical == null) {
			if (other.validateDateCertificateCanonical != null)
				return false;
		} else if (!validateDateCertificateCanonical.equals(other.validateDateCertificateCanonical))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DigitalCertificateCanonical [certificateCanonical=" + certificateCanonical
				+ ", validateDateCertificateCanonical=" + validateDateCertificateCanonical + "]";
	}	
}
