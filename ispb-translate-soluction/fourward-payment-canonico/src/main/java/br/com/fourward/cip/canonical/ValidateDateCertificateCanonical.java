package br.com.fourward.cip.canonical;

import java.io.Serializable;
import java.util.Date;

public class ValidateDateCertificateCanonical implements Serializable{
	
	private static final long serialVersionUID = 4167168231804721314L;
	
	private Date activation;
	private Date expiration;
	
	public ValidateDateCertificateCanonical(){
		
	}
	
	public ValidateDateCertificateCanonical(Date activation, Date expiration) {
		super();
		this.activation = activation;
		this.expiration = expiration;
	}

	public Date getActivation() {
		return activation;
	}

	public void setActivation(Date activation) {
		this.activation = activation;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activation == null) ? 0 : activation.hashCode());
		result = prime * result + ((expiration == null) ? 0 : expiration.hashCode());
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
		ValidateDateCertificateCanonical other = (ValidateDateCertificateCanonical) obj;
		if (activation == null) {
			if (other.activation != null)
				return false;
		} else if (!activation.equals(other.activation))
			return false;
		if (expiration == null) {
			if (other.expiration != null)
				return false;
		} else if (!expiration.equals(other.expiration))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ValidateDateCertificateCanonical [activation=" + activation + ", expiration=" + expiration + "]";
	}	
}
