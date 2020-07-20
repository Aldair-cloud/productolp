package pe.edu.upeu.producto.daoImp;

import java.sql.JDBCType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.producto.dao.ProductoDao;
import pe.edu.upeu.producto.entity.Producto;

@Repository
public class ProductoDaoImp implements ProductoDao{
	@Autowired
	private JDBCType jdbcTemplate;
	
	@Override
	public List<Producto> readAll() {
		return jdbcTemplate.query("select * from producto", BeanPropertyRowMapper.newInstance(Producto.class));
	}

	@Override
	public int create(Producto pro) {
		String sql = "INSERT INTO producto (nomproc,precio.cantidad) VALUES (?,?,?)";
		return jdbcTemplate.update(sql, new Object[] {pro.getNomproc(),pro.getPrecio(),pro.getCantidad()});		
	}

	@Override
	public int edit(Producto pro) {
		String sql = "UPDATE producto SET nomproc = ?, precio = ?, cantidad = ? WHERE (idproducto = ?)";
		return jdbcTemplate.update(sql, pro.getNomproc(),pro.getPrecio(),pro.getCantidad());
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM producto WHERE (idproducto = ?)";		
		return jdbcTemplate.update(sql,new Object[] {id});
	}

	@Override
	public Producto read(int id) {
		String sql = "select * from producto WHERE idproducto = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, BeanPropertyRowMapper.newInstance(Producto.class));
	}
	
}
