//package com.example.bottomnavactivity.Mappers;
//
//import com.example.bottomnavactivity.DTO.ProductoResponse;
//import com.example.bottomnavactivity.Models.ProductoModel;
//
//public class ProductoMapper {
//
//    public static ProductoModel fromResponse(ProductoResponse response) {
//        // ✅ Ahora accedes a través de .getData()
//        ProductoResponse.ProductoData producto = response.getData();
//
//        return new ProductoModel(
//                producto.getProductoId(),
//                producto.getNombreProducto(),
//                producto.getCodigoProducto(),
//                producto.getCantidad(),
//                producto.getPrecio()
//        );
//    }
//}
package com.example.bottomnavactivity.Mappers;

import com.example.bottomnavactivity.DTO.ProductoDTO;
import com.example.bottomnavactivity.Models.ProductoModel;

public class ProductoMapper {

    /**
     * Convierte una respuesta DTO a ProductoModel
     * Funciona tanto para respuestas de un producto como de lista de productos
     */
    public static ProductoModel fromResponse(ProductoDTO response) {
        if (response == null) return null;

        // Obtener el primer producto disponible
        ProductoDTO.Producto producto = response.getPrimerProducto();

        if (producto == null) return null;

        return new ProductoModel(
                producto.getProductoId(),
                producto.getNombreProducto(),
                producto.getCodigoProducto(),
                producto.getCantidad(),
                producto.getPrecio()
        );
    }

}
