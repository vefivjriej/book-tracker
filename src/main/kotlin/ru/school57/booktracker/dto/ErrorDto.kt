package ru.school57.booktracker.dto

// TODO: использовать этот DTO для возврата ошибок
data class ErrorDto(
    val code: String,
    val message: String
)