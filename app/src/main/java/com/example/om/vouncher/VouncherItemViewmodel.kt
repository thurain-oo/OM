package com.example.om.vouncher

import android.app.Application
import androidx.lifecycle.*
import com.example.om.database.VouncherItemDao
import com.example.om.database.VouncherItemDatabase
import com.example.om.database.VouncherItemEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class VouncherItemViewmodel(
    private val repository: VouncherItemRepository,application: Application
) : AndroidViewModel(application) {


    init{
        VouncherItemDatabase.getInstance(application)
        val getAllItems: LiveData<List<VouncherItemEntity>> = repository.getAllVouncherItem
    }


    fun addVouncherItem(vouncherItemEntity: VouncherItemEntity) {
        viewModelScope.launch {
            repository.addVouncherItem(vouncherItemEntity)
        }
    }

}

