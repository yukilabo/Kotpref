package com.chibatching.kotprefsample.preferencedsl

import com.chibatching.kotpref.KotprefModel

object PreferenceScreenDslSampleSettings : KotprefModel() {

    var sampleSwitch by booleanPref(false)

    var sampleCheckBox by booleanPref(true)

    var sampleEditText by stringPref("Hello world!")

    var sampleDropDown by stringPref("first")

    var sampleList by stringPref("first")

    val sampleMultiSelectList by stringSetPref(setOf("first"))

    val sampleSeekBar by intPref(50)

    enum class Item(val displayName: String, val value: String) {
        FIRST("first item", "first"),
        SECOND("second item", "second"),
        THIRD("third item", "third");

        companion object {
            fun find(value: String) = values().find { it.value == value } ?: FIRST
        }
    }
}
