package webapp;

import java.util.Objects;

public class todos {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public todos(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "todos [name=" + name + "]";
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
		todos other = (todos) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
