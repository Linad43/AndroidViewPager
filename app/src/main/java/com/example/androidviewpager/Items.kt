package com.example.androidviewpager

import java.io.Serializable

class Items(
    val name:String,
    val image: Int,
    val author:String
):Serializable {
    companion object{
        val listItems = arrayListOf(
            Items("В праздник", R.drawable.on_a_holiday,"КУЗНЕЦОВ Николай"),
            Items("Бурлаки на Волге", R.drawable.boatmen_on_the_volga,"РЕПИН Илья"),
            Items("Золотая осень", R.drawable.polenov_golden_autumn,"ПОЛЕНОВ Василий"),
            Items("Золотая осень", R.drawable.golden_autumn,"ЛЕВИТАН Исаак"),
            Items("Утро в сосновом лесу", R.drawable.morning_in_the_pine_forest,"ШИШКИН Иван"),
            Items("Алёнушка", R.drawable.alyonushka,"ВАСНЕЦОВ Виктор"),
            Items("Над вечным покоем", R.drawable.above_eternal_rest,"ЛЕВИТАН Исаак"),
            Items("Цветы и плоды ГТГ", R.drawable.flowers_and_fruits,"Хруцкий Иван"),
            Items("Девочка с персиками", R.drawable.the_girl_with_peaches,"СЕРОВ Валентин"),
            Items("Богатыри (Три богатыря)", R.drawable.bogatyrs,"ВАСНЕЦОВ Виктор")
        )
    }
}