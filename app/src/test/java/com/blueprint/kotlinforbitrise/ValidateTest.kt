package com.blueprint.kotlinforbitrise

/**
 * Creado Por jorgeacostaalvarado el 17-03-18.
 */
import com.blueprint.kotlinforbitrise.utils.Validator
import org.hamcrest.CoreMatchers.`is`
import org.junit.Test

import org.junit.Assert.*


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ValidateTest {
    @Test
    fun testValidateEmail() {

        val validator = Validator()

        assertThat(validator.validateEmail("transmigrado@gmail.com"), `is`(true))
        assertThat(validator.validateEmail("transmigrado"), `is`(false))
        assertThat(validator.validateEmail("transmigrado@"), `is`(false))

    }

    @Test
    fun testValidatePassword() {

        val validator = Validator()

        assertThat(validator.validatePassword("12345678"), `is`(true))
        assertThat(validator.validatePassword("123456"), `is`(false))

    }
}
