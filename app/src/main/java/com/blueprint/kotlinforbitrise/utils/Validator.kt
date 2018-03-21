package com.blueprint.kotlinforbitrise.utils

import java.util.regex.Pattern

/**
 * Creado Por jorgeacostaalvarado el 17-03-18.
 */
class Validator {

    fun validateEmail(email:String) : Boolean {

        val pattern = Pattern.compile(".+@.+\\.[a-z]+")
        val matcher = pattern.matcher(email)
        return  matcher.matches()

    }

    fun validatePassword(password: String) : Boolean{
        if (password.length < 8) {
            return false
        } else {
            return true
        }
    }

}