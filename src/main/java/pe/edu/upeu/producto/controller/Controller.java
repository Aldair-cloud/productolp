package pe.edu.upeu.producto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.producto.entity.Producto;
import pe.edu.upeu.producto.service.ProductoService;


@RestController
public class Controller {
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/")
	public List<Producto> jaja() {
		return productoService.readAll();
	}
	@GetMapping("/producto/{id}")
		public Producto read(@PathVariable int id) {
			return productoService.read(id);
		}
	@GetMapping("/producto")
	public int create(@RequestBody Producto pro) {
		return productoService.create(pro);
	}
	@GetMapping("/delete/{id}")
	public int del(@PathVariable int id){
		
		return productoService.delete(id);
	}
	@PutMapping("/usuario/{id}")
	public int edit(@RequestBody Producto pro, @PathVariable int id) {
		return productoService.edit(pro);
	}
}
