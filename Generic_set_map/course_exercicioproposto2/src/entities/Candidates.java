package entities;

import java.util.Objects;

public class Candidates {

	private String name;
	private Integer votes;
	
	public Candidates(String name) {
		this.name = name;
		this.votes = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVotes() {
		return votes;
	}

	public void addVotes(String votes) {
		this.votes += Integer.parseInt(votes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidates other = (Candidates) obj;
		return Objects.equals(name, other.name);
	}
	
}
