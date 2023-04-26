package com.example.zeldaapp.category.domain.usecase

import com.example.zeldaapp.category.data.repository.ICategoryRepository
import com.example.zeldaapp.category.domain.mapper.toCategoryItemList
import com.example.zeldaapp.category.domain.model.CategoryItem

class CategoryItemListUseCase(
    private val repository: ICategoryRepository
) {

    suspend operator fun invoke(
        category: String
    ) = repository.getCategoryItemList(category).toCategoryItemList()

}