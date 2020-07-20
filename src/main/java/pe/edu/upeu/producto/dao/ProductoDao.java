package pe.edu.upeu.producto.dao;

import java.util.List;

import pe.edu.upeu.producto.entity.Producto;


public interface ProductoDao {
	List<Producto> readAll();
	int create(Producto pro);
	int edit(Producto pro);
	int delete(int id);
	Producto read(int id);
}
