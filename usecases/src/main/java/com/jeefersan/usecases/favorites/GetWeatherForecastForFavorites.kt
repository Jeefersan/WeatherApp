package com.jeefersan.usecases.favorites

import com.jeefersan.domain.Favorite
import com.jeefersan.domain.FavoriteForecast
import com.jeefersan.util.Result

/**
 * Created by JeeferSan on 3-5-20.
 */
interface GetWeatherForecastForFavorites {

    suspend operator fun invoke(favorites: List<Favorite>): Result<List<FavoriteForecast>>

}