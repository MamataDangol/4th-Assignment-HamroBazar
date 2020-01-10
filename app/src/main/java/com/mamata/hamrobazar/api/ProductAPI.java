package com.mamata.hamrobazar.api;

import com.mamata.hamrobazar.model.Products;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductAPI {

    @GET("products/allProducts")
    Call<List<Products>> getAllProducts();
}
