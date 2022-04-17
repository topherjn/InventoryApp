package com.example.inventory.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities=[Site::class], version = 1, exportSchema = false)
abstract class SiteRoomDatabase : RoomDatabase() {

    abstract fun SiteDao(): SiteDao

    companion object {
        @Volatile
        private var INSTANCE: SiteRoomDatabase? = null

        fun getDatabase(context: Context): SiteRoomDatabase {

            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext, SiteRoomDatabase::class.java,
                    "site_database"
                        )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }
}