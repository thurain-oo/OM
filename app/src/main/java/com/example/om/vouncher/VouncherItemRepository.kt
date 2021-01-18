package com.example.om.vouncher

import androidx.lifecycle.LiveData
import com.example.om.database.VouncherItemDao
import com.example.om.database.VouncherItemEntity

class VouncherItemRepository(private val vouncherItemDao: VouncherItemDao) {
    val getAllVouncherItem : LiveData<List<VouncherItemEntity>> =vouncherItemDao.getAllItems()

    suspend fun addVouncherItem(vouncherItemEntity: VouncherItemEntity){
        vouncherItemDao.insert(vouncherItemEntity)
    }
}
