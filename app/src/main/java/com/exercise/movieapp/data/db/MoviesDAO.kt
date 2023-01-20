package com.exercise.movieapp.data.db

import androidx.room.*
import com.exercise.movieapp.data.model.Movies
import kotlinx.coroutines.flow.Flow

@Dao
interface MoviesDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(movies: Movies)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(movies: List<Movies>)

    @Query("SELECT * FROM Movies")
    fun getAllMovies(): Flow<List<Movies>>

    @Delete
    suspend fun deleteMovies(Movies: Movies)



}