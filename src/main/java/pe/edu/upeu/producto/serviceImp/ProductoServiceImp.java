package pe.edu.upeu.producto.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.producto.dao.ProductoDao;

import pe.edu.upeu.producto.entity.Producto;
import pe.edu.upeu.producto.service.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService{

	@Autowired
	private ProductoDao productoDao;
	@Override
	public List<Producto> readAll() {
		return productoDao.readAll();
	}

	@Override
	public int create(Producto pro) {
		return productoDao.create(pro);
	}

	@Override
	public int edit(Producto pro) {
		return productoDao.edit(pro);
	}

	@Override
	public int delete(int id) {
		return productoDao.delete(id);
	}

	@Override
	public Producto read(int id) {
		return productoDao.read(id);
	}
	
}
