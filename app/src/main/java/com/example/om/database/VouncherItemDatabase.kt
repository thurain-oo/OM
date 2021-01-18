package com.example.om.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.CoroutineScope

@Database(entities = [VouncherItemEntity::class], version = 1, exportSchema = false)
abstract class VouncherItemDatabase : RoomDatabase() {
    abstract fun vouncherItemDao(): VouncherItemDao

    companion object {
        @Volatile
        private var INSTANCE: VouncherItemDatabase? = null
        fun getInstance(context: Context): VouncherItemDatabase {
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this) {

                val instance = Room.databaseBuilder(
                        context.applicationContext,VouncherItemDatabase::class.java,
                        "vouncher_item_database"
                    ).build()
                    INSTANCE=instance
                return instance
                }
            }
        }
    }
