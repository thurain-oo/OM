package com.example.om.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface VouncherItemDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(vouncherItem :VouncherItemEntity)

    // TODO: 1/17/2021 Need to add Update funtion for editing item

//    @Query("SELECT * from vouncher_item_table WHERE itemId = :key")
//    suspend fun getThisItem(key: Long): VouncherItemEntity?

    @Query("SELECT * From vouncher_item_table ORDER BY itemId ASC")
    fun getAllItems(): LiveData<List<VouncherItemEntity>>

//    @Query("DELETE FROM vouncher_item_table")
//    suspend fun deleteAll()
}