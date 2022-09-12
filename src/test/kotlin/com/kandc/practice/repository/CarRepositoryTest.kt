package com.kandc.practice.repository

import com.kandc.practice.Car
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarRepositoryTest {

    private val carRepository = CarRepository();

    @Test
    fun `stores some cars`() {

        val outback = Car("Subaru", "Outback", 2019)
        val sportage = Car("Kia", "Sportage", 2022)
        val sorrento = sportage.copy(model = "Sorrento")

        carRepository.add(outback)
        carRepository.add(sportage)
        carRepository.add(sorrento)

        val retrievedCars:List<Car> = carRepository.get("Kia")

        assertThat(retrievedCars).containsExactlyInAnyOrder(sorrento, sportage)
    }
}