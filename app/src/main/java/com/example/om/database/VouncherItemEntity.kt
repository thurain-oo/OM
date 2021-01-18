package com.example.om.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName= "vouncher_item_table")
data class VouncherItemEntity (
    @PrimaryKey(autoGenerate = true)
    var itemId: Long = 0L , //no in table
    @ColumnInfo(name="item_name")
    var   itemName:String ,
    @ColumnInfo(name="price")
    var price: Int ,
    @ColumnInfo(name="quantity")
    var quantity: Int ,
    @ColumnInfo(name="amount")
    var amount : Int)