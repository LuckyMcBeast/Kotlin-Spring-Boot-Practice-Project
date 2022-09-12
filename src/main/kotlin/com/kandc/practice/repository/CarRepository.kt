package com.kandc.practice.repository

import com.kandc.practice.Car
import org.springframework.stereotype.Repository

@Repository
class CarRepository {

    private var cars = mutableListOf<Car>()

    fun add(car: Car) = cars.add(car)

    fun get(make: String) = cars.filter { car -> car.make == make }

}
