package com.example.standroidtemplate.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import io.reactivex.Single

@Dao
interface ServiceTitanDao {

    @Insert
    fun saveServiceTitan(serviceTitan: ServiceTitan): Single<Long>

    @Query("SELECT * FROM ServiceTitan WHERE id = :id")
    fun getServiceTitan(id: Long): Single<ServiceTitan>

    @Query("DELETE FROM ServiceTitan WHERE id = :id")
    fun removeServiceTitan(id: Long): Single<Int>
}