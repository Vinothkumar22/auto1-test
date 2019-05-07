public class Engine extends Object {
	private String type;
	
	public Engine(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public boolean equals(Object engine) {
		if (engine == null) 			 return false;
		if (!(engine instanceof Engine)) return false;
		if (this == engine) 			 return true;
		return this.type.equals(((Engine)engine).type);
	}
	
	@Override
	public int hashCode() {
		return type.hashCode();
	}
	
	@Override
	public String toString() {
		return type;
	}
}
