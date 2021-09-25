package co.edu.unbosque.tiendagenerica.model;

public class productos {
	private String name;
	private String documento;
	
	public productos() {
	
	}

	public productos(String name,String documento) {
		this.name = name;
		this.documento = documento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	
}
