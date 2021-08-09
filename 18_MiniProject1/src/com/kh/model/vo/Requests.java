package com.kh.model.vo;

public class Requests {

	private String requests; // 요청사항
	
	public Requests() {}
	
	public Requests(String requests) {
		super();
		this.requests = requests;
	}

	public String getRequests() {
		return requests;
	}

	public void setRequests(String requests) {
		requests = requests;
	}
	
	

	@Override
	public String toString() {
		return "Requests [requests=" + requests + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((requests == null) ? 0 : requests.hashCode());
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
		Requests other = (Requests) obj;
		if (requests == null) {
			if (other.requests != null)
				return false;
		} else if (!requests.equals(other.requests))
			return false;
		return true;
	}

	
}
