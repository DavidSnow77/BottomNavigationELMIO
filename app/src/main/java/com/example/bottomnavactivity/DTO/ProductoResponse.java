package com.example.bottomnavactivity.DTO;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;

public class ProductoResponse {
    @SerializedName("producto")  // ← Solo mapea el objeto producto
    private ProductoData data;

    public ProductoResponse() {}

    // Solo getter y setter para data
    public ProductoData getData() { return data; }
    public void setData(ProductoData data) { this.data = data; }

    // ✅ Clase interna para el objeto "producto"
    public static class ProductoData {
        @SerializedName("productoId")
        private String productoId;

        @SerializedName("nombreProducto")
        private String nombreProducto;

        @SerializedName("codigoProducto")
        private String codigoProducto;

        @SerializedName("cantidad")
        private int cantidad;

        @SerializedName("precio")
        private BigDecimal precio;

        public ProductoData() {}

        // Getters y setters
        public String getProductoId() { return productoId; }
        public void setProductoId(String productoId) { this.productoId = productoId; }

        public String getNombreProducto() { return nombreProducto; }
        public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }

        public String getCodigoProducto() { return codigoProducto; }
        public void setCodigoProducto(String codigoProducto) { this.codigoProducto = codigoProducto; }

        public int getCantidad() { return cantidad; }
        public void setCantidad(int cantidad) { this.cantidad = cantidad; }

        public BigDecimal getPrecio() { return precio; }
        public void setPrecio(BigDecimal precio) { this.precio = precio; }
    }
}