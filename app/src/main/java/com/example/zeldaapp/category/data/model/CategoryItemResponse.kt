package com.example.zeldaapp.category.data.model

import com.example.network.NetworkData
import com.google.gson.annotations.SerializedName

typealias CategoryItemListResponse = NetworkData<List<CategoryItemDto>>

data class CategoryItemDto(
    val id: Int?,
    val name: String?,
    val category: String?,
    val descriptions: String?,
    val image: String?,
    @SerializedName("common_places")
    val commonPlaces: List<String?>?,
)