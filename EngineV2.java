public enum EngineV2 {
	DIESEL("diesel"),
	PETROL("petrol"),
	ELECTRICAL("electrical"),
	HYBRID("hybrid");
	
	private String value;
	
	EngineV2(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
