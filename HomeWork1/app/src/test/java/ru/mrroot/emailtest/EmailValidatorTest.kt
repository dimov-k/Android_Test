package ru.mrroot.emailtest

import org.junit.Assert
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        Assert.assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        Assert.assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_Test1() {
        Assert.assertFalse(EmailValidator.isValidEmail("name.com"))
    }

    @Test
    fun emailValidator_Test2() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@com"))
    }

    @Test
    fun emailValidator_Test3() {
        Assert.assertFalse(EmailValidator.isValidEmail("@@.com"))
    }

    @Test
    fun emailValidator_Test4() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email.name@.email.com"))
    }
    @Test
    fun emailValidator_NoDomen_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email."))
    }

    @Test
    fun emailValidator_LongDomen1_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email.aaaaaaaaaaaaaaaaaaaaaaaaaaa"))
    }

    @Test
    fun emailValidator_LongDomen2_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.a"))
    }

    @Test
    fun emailValidator_LongName_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("nameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee@w.a"))
    }

    @Test
    fun emailValidator_NotDog_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name&email.ru"))
    }

    @Test
    fun emailValidator_OnlyDog_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("@"))
    }

    @Test
    fun emailValidator_Rus_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("имя&email.ru"))
    }

    @Test
    fun autoboxing_ReturnsSame127() {
        Assert.assertSame(127, 127)
    }

    @Test
    fun autoboxing_ReturnsNotSame128() {
        Assert.assertNotSame(128, 128)
    }
}
