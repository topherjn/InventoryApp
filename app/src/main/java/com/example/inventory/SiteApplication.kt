package com.example.inventory

import android.app.Application
import com.example.inventory.data.ItemRoomDatabase
import com.example.inventory.data.SiteRoomDatabase

class SiteApplication: Application() {

    val database: SiteRoomDatabase by lazy { SiteRoomDatabase.getDatabase(this) }
}