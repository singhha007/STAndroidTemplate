package com.example.standroidtemplate.persistence

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ServiceTitan(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val example: String
)