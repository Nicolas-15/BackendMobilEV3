package com.backendmobil.backend.controller;

import com.backendmobil.backend.model.Producto;
import com.backendmobil.backend.repository.ProductoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*") // importante para permitir conexión desde Android
public class ProductoController {

    private final ProductoRepository repository;

    public ProductoController(ProductoRepository repository) {
        this.repository = repository;
    }

    // GET /productos
    @GetMapping
    public List<Producto> getAllProductos() {
        return repository.findAll();
    }

    // GET /productos/{id}
    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    // POST /productos
    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return repository.save(producto);
    }

    // PUT /productos/{id}
    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable Integer id, @RequestBody Producto producto) {
        Producto existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        existing.setNombre(producto.getNombre());
        existing.setDescripcion(producto.getDescripcion());
        existing.setPrecio(producto.getPrecio());
        existing.setCategoria(producto.getCategoria());
        existing.setImagen(producto.getImagen());

        return repository.save(existing);
    }

    // DELETE /productos/{id}
    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}