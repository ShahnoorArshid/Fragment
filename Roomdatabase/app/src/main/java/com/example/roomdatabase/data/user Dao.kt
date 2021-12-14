package com.example.roomdatabase.data

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface UserDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(user: User)

    @Query("SELECT * FROM user_table ORDER BY uid ASC")
    fun  readAllData():LiveData<List<User>>

    @Delete
    fun deleteData(user: User)

}