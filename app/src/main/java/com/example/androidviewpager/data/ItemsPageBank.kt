package com.example.androidviewpager.data

import com.example.androidviewpager.R
import java.io.Serializable

class ItemsPageBank(
    val name: String,
    val image: Int,
) : Serializable {
    companion object {
        val listItems = arrayListOf(
            ItemsPageBank("Наш", R.drawable.on_a_holiday),
            ItemsPageBank("Банк", R.drawable.boatmen_on_the_volga),
            ItemsPageBank("Лучший", R.drawable.polenov_golden_autumn),
            ItemsPageBank("Нажмите на экран", R.drawable.morning_in_the_pine_forest)
        )
    }
}