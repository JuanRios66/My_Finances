package Utils

import android.util.Patterns

fun nameValidator(text: String): Boolean {
    return (text.length >= MIN_LENGHT_USER)
}

fun emailValidator(text: String): Boolean {
    val pattern = Patterns.EMAIL_ADDRESS
    return pattern.matcher(text).matches()
}

fun passValidator(text: String): Boolean {
    return (text.length >= MIN_LENGHT_PASS)
}