package com.example.translator_kmm.core.presentation

import com.example.translator_kmm.core.domain.languaje.Language

expect class UiLanguage {

    expect val language: Language

    companion object {
        fun byCode(langCode: String): UiLanguage
        val allLanguages: List<UiLanguage>
    }
}