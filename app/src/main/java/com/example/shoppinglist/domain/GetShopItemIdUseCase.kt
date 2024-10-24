package com.example.shoppinglist.domain

class GetShopItemIdUseCase (private val shopListRepository: ShopListRepository){
    fun getShopItemId(shopItemId: Int): ShopItem{
        return shopListRepository.getShopItemId(shopItemId)
    }
}