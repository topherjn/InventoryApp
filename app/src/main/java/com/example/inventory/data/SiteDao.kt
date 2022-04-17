package com.example.inventory.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface SiteDao {

    @Query("SELECT * FROM site WHERE arrondissement = :arrondissement ORDER BY name")
    fun getSites(arrondissement: Int): Flow<List<Site>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(site: Site)

    @Update
    suspend fun update(site: Site)

    @Delete
    suspend fun delete(site: Site)
}