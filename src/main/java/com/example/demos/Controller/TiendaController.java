package com.example.demos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demos.Model.Tienda;
import com.example.demos.Service.TiendaService;

import java.util.List;

@RestController
@RequestMapping("/tiendas")
public class TiendaController {
    @Autowired
    private TiendaService tiendaService;

    @GetMapping
    public List<Tienda> getAll() {
        return tiendaService.listarTiendas();
    }

    @PostMapping
    public Tienda save(@RequestBody Tienda T) {
        return tiendaService.guardarTienda(T);
    }

    @GetMapping("/{idT}")
    public ResponseEntity<Tienda> obtenerPorId(@PathVariable Long idT) {
        return tiendaService.obtenerTiendaPorId(idT)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{idT}")
    public ResponseEntity<Tienda> actualizar(@PathVariable Long idT, @RequestBody Tienda tienda) {
        try {
            Tienda actualizada = tiendaService.actualizarTienda(idT, tienda);
            return ResponseEntity.ok(actualizada);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{idT}")
    public ResponseEntity<Void> eliminar(@PathVariable Long idT) {
        tiendaService.eliminarTienda(idT);
        return ResponseEntity.noContent().build();
    }
}
