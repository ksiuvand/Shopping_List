package com.example.shoppinglist.domain

interface ShopListRepository {

    fun getShopList(): List<ShopItem>

    fun editShopItem(shopItem: ShopItem)

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun getShopItemId(shopItemId: Int): ShopItem

}