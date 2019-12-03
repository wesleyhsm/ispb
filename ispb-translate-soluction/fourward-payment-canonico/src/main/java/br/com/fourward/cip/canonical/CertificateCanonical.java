package br.com.fourward.cip.canonical;

import java.io.Serializable;

public class CertificateCanonical implements Serializable{
	
	private static final long serialVersionUID = -6607704912653588168L;
	
	private String localeCertificate;	
	private String passwordCertificate;	
	private String ispb;
		
	public CertificateCanonical(String localeCertificate, String passwordCertificate, String ispb) {
		super();
		this.localeCertificate = localeCertificate;
		this.passwordCertificate = passwordCertificate;
		this.ispb = ispb;
	}	

	public String getLocaleCertificate() {
		return localeCertificate;
	}

	public void setLocaleCertificate(String localeCertificate) {
		this.localeCertificate = localeCertificate;
	}

	public String getPasswordCertificate() {
		return passwordCertificate;
	}

	public void setPasswordCertificate(String passwordCertificate) {
		this.passwordCertificate = passwordCertificate;
	}

	public String getIspb() {
		return ispb;
	}

	public void setIspb(String ispb) {
		this.ispb = ispb;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ispb == null) ? 0 : ispb.hashCode());
		result = prime * result + ((localeCertificate == null) ? 0 : localeCertificate.hashCode());
		result = prime * result + ((passwordCertificate == null) ? 0 : passwordCertificate.hashCode());
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
		CertificateCanonical other = (CertificateCanonical) obj;
		if (ispb == null) {
			if (other.ispb != null)
				return false;
		} else if (!ispb.equals(other.ispb))
			return false;
		if (localeCertificate == null) {
			if (other.localeCertificate != null)
				return false;
		} else if (!localeCertificate.equals(other.localeCertificate))
			return false;
		if (passwordCertificate == null) {
			if (other.passwordCertificate != null)
				return false;
		} else if (!passwordCertificate.equals(other.passwordCertificate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CertificateCanonical [localeCertificate=" + localeCertificate + ", passwordCertificate="
				+ passwordCertificate + ", ispb=" + ispb + "]";
	}	
}
