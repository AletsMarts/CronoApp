package com.example.cronoapp.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cronoapp.model.Cronos
import kotlinx.coroutines.flow.Flow


//Interface->repositorio->ViewModel->View
@Dao//Data Access Object
interface CronosDatabaseDao {
    //CRUD
    @Query("SELECT * FROM cronos")
    fun getCronos(): Flow<List<Cronos>>

    @Query("SELECT * FROM cronos WHERE id = :id")
    fun getCronosById(id: Long): Flow<Cronos>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(cronos: Cronos)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(cronos: Cronos)

    @Delete
    suspend fun delete(cronos: Cronos)
}