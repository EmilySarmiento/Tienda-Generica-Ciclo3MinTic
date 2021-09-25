package co.edu.unbosque.tiendagenerica.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;

import co.edu.unbosque.tiendagenerica.controller.productosController;

public class csvaMySQL {
	
	public static void main(String[] args) {
		List<productoscsv> productos = new ArrayList<productoscsv>();
		productos = importarCSV();
		
		insertarMySQL(productos);
	}
	public static List<productoscsv> importarCSV(){ 
		List<productoscsv> productos = new ArrayList<productoscsv>();
		
		try {
			CsvReader leerProductos = new CsvReader("");//nombre del archivo guardado
			leerProductos.readHeaders();
			
				while (leerProductos.readRecord()) {
					String codigo_producto = leerProductos.get(0);
					String nombre_producto = leerProductos.get(1);
					String nitproveedor = leerProductos.get(2);
					String precio_compra = leerProductos.get(3);
					String ivacompra = leerProductos.get(4);
					String precio_venta = leerProductos.get(5);
					
					productos.add(new productoscsv(codigo_producto, nombre_producto, nitproveedor, precio_compra,  ivacompra, precio_venta));
				}
				
				leerProductos.close();
				
				System.out.println("Listado productos CSV\n");
				for (productoscsv pro : productos) {
					System.out.println(
							pro.getCodigo_producto()+", "+
							pro.getNombre_producto()+", "+
							pro.getNitproveedor()+", "+
							pro.getPrecio_compra()+", "+
							pro.getIvacompra()+", "+
							pro.getPrecio_venta()
					);
				}
				
			
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		return productos;
	
		}
	
	public static void insertarMySQL(List<productoscsv> productos) {
		System.out.println("\nSe van a insertar" +productos.size()+"registro\n");
		productosController sql = new productosController();
		Connection cn = sql.conectarMySQL();
		
		String query = "INSERT INTO productos{codigo_producto, nombre_producto, nitproveedor, precio_compra, ivacompra, precio_venta} VALUES(?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = cn.prepareStatement(query);
			
			for(int i = 0 ; i < productos.size(); i++) {
				ps.setString(1, productos.get(i).getCodigo_producto());
				ps.setString(2, productos.get(i).getNombre_producto());
				ps.setString(3, productos.get(i).getNitproveedor());
				ps.setString(4, productos.get(i).getPrecio_compra());
				ps.setString(5, productos.get(i).getIvacompra());
				ps.setString(6, productos.get(i).getPrecio_venta());
			
				ps.executeUpdate();
				System.out.println("Se inserto el elemento: "+ (i+1)+"/"+productos.size());
				ps.close();
				cn.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
