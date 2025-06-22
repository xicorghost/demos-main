
package com.example.demo.Service;

import com.example.demos.Model.Producto;
import com.example.demos.Repository.ProductoRepository;
import com.example.demos.Service.ProductoService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

class ProductoServiceTest {

    @Mock
    private ProductoRepository productoRepository;

    @InjectMocks
    private ProductoService productoService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    /* Test para guardar producto en la capa servicio */
    @Test
    void testGuardarProducto() {
        Producto producto = new Producto(null, "Shampoo ecológico", 50, 3990.0, "Higiene");
        Producto productoGuardado = new Producto(1L, "Shampoo ecológico", 50, 3990.0, "Higiene");
        when(productoRepository.save(producto)).thenReturn(productoGuardado);

        Producto resultado = productoService.guardarProducto(producto);
        assertThat(resultado.getId()).isEqualTo(1L);
        verify(productoRepository).save(producto);
    }
}