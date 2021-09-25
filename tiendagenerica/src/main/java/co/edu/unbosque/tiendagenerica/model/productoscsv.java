package co.edu.unbosque.tiendagenerica.model;

public class productoscsv {
	String nombre_producto;
	String nitproveedor;
	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getNitproveedor() {
		return nitproveedor;
	}

	public void setNitproveedor(String nitproveedor) {
		this.nitproveedor = nitproveedor;
	}

	public String getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(String precio_compra) {
		this.precio_compra = precio_compra;
	}

	public String getIvacompra() {
		return ivacompra;
	}

	public void setIvacompra(String ivacompra) {
		this.ivacompra = ivacompra;
	}

	public String getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(String precio_venta) {
		this.precio_venta = precio_venta;
	}

	public String getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(String codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	String precio_compra;
	String ivacompra;
	String precio_venta;
	String codigo_producto;
	
	public productoscsv(String codigo_producto, String nombre_producto, String nitproveedor, String precio_compra,
			String ivacompra, String precio_venta) {
		super();
		this.codigo_producto = codigo_producto;
		this.nombre_producto = nombre_producto;
		this.nitproveedor = nitproveedor;
		this.precio_compra = precio_compra;
		this.ivacompra = ivacompra;
		this.precio_venta = precio_venta;
	}
	
	
	
}
