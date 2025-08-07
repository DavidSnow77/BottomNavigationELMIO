//package com.example.bottomnavactivity.Services;
//
//import com.example.bottomnavactivity.DTO.ProductoDTO;
//import com.example.bottomnavactivity.DTO.ProductoRequest;
//import com.example.bottomnavactivity.DTO.ProductoResponse;
//
//import java.util.List;
//
//import retrofit2.Call;
//import retrofit2.http.Body;
//import retrofit2.http.DELETE;
//import retrofit2.http.GET;
//import retrofit2.http.POST;
//import retrofit2.http.PUT;
//import retrofit2.http.Path;
//
//public interface ProductoService {
//    @GET("Producto")
//    Call<List<ProductoResponse>> getListaProductos();
//
//    @GET("Producto/getProducto/{id}")
//    Call<ProductoResponse> getProductoPorId(@Path("id") int id);
//
//    @GET("Producto/getProductoPorCodigo/{codigo}")
//    Call<ProductoResponse> getProductoPorCodigo(@Path("codigo") String codigo);
//
//    @POST("Producto")
//    Call<ProductoResponse> registrarProducto(@Body ProductoRequest producto);
//
//    @PUT("Producto/putProducto/{id}")
//    Call<ProductoResponse> actualizarProducto(@Path("id") int id, @Body ProductoRequest producto);
//
//    @DELETE("Producto/deleteProducto/{id}")
//    Call<Void> eliminarProducto(@Path("id") int id);
//}
//
////package com.example.bottomnavactivity.Services;
////
////import com.example.bottomnavactivity.DTO.ProductoDTO;
////
////import java.util.List;
////
////import retrofit2.Call;
////import retrofit2.http.Body;
////import retrofit2.http.DELETE;
////import retrofit2.http.GET;
////import retrofit2.http.POST;
////import retrofit2.http.PUT;
////import retrofit2.http.Path;
////
////public interface ProductoService {
////    @GET("Producto")
////    Call<List<ProductoDTO>> getListaProductos();
////
////    @GET("Producto/getProducto/{id}")
////    Call<ProductoDTO> getProductoPorId(@Path("id") int id);
////
////    @GET("Producto/getProductoPorCodigo/{codigo}")
////    Call<ProductoDTO> getProductoPorCodigo(@Path("codigo") String codigo);
////
////    @POST("Producto")
////    Call<ProductoDTO> registrarProducto(@Body ProductoDTO producto);
////
////    @PUT("Producto/putProducto/{id}")
////    Call<ProductoDTO> actualizarProducto(@Path("id") int id, @Body ProductoDTO producto);
////
////    @DELETE("Producto/deleteProducto/{id}")
////    Call<Void> eliminarProducto(@Path("id") int id);
////}
package com.example.bottomnavactivity.Services;

import com.example.bottomnavactivity.DTO.ProductoDTO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ProductoService {
    @GET("Producto")
    Call<ProductoDTO> getListaProductos();  //RETORRNA MENSAJE MAS LISTA PRODUCTOS

    @GET("Producto/getProducto/{id}")
    Call<ProductoDTO> getProductoPorId(@Path("id") int id);  // RETORNA UN PRODUCTO

    @GET("Producto/getProductoPorCodigo/{codigo}")
    Call<ProductoDTO> getProductoPorCodigo(@Path("codigo") String codigo);  //RETORNA UN PRODUCTO

    @POST("Producto")
    Call<ProductoDTO> registrarProducto(@Body ProductoDTO.Producto producto);

    @PUT("Producto/putProducto/{id}")
    Call<ProductoDTO> actualizarProducto(@Path("id") int id, @Body ProductoDTO.Producto producto);

    @DELETE("Producto/deleteProducto/{id}")
    Call<Void> eliminarProducto(@Path("id") int id);
}