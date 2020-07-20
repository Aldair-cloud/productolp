package pe.edu.upeu.producto.service;

import java.util.List;

import pe.edu.upeu.producto.entity.Producto;


public interface ProductoService {
	List<Producto> readAll();
	int create(Producto pro);
	int edit(Producto pro);
	int delete(int id);
	Producto read(int id);
}
