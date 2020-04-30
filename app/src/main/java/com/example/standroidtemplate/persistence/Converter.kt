package com.example.standroidtemplate.persistence

import androidx.room.TypeConverter
import java.math.BigDecimal

class Converter {

    @TypeConverter
    fun exampleBigDecimalToDouble(value: BigDecimal?) =
        value?.toDouble() ?: 0.0

    @TypeConverter
    fun exampleDoubleToBigDecimal(value: Double?): BigDecimal =
        value?.let { BigDecimal.valueOf(it) } ?: BigDecimal.ZERO
}