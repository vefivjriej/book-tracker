package ru.school57.booktracker.error

import jakarta.persistence.EntityNotFoundException
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import ru.school57.booktracker.dto.ErrorDto

// TODO: добавить аннотацию @RestControllerAdvice
class GlobalExceptionHandler {

    // TODO: создать logger через LoggerFactory
    private val logger: Logger = LoggerFactory.getLogger(GlobalExceptionHandler::class.java)

    // TODO: обработать EntityNotFoundException
    // TODO: логировать на уровне WARN
    // TODO: вернуть ResponseEntity с ErrorDto и статусом 404
    @ExceptionHandler(EntityNotFoundException::class)
    fun handleNotFound(ex: EntityNotFoundException): ResponseEntity<ErrorDto> {
        // TODO: logger.warn(...)
        // TODO: вернуть ErrorDto(code = "NOT_FOUND", message = ...)
        TODO("")
    }

    // TODO: обработать ошибки валидации
    // TODO: логировать на уровне WARN
    // TODO: вернуть ResponseEntity с ErrorDto и статусом 400
    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidation(ex: MethodArgumentNotValidException): ResponseEntity<ErrorDto> {
        // TODO: logger.warn(...)
        // TODO: извлечь первое сообщение об ошибке и вернуть ErrorDto(code = "VALIDATION_FAILED", ...)
        TODO("")
    }

    // TODO: обработать все остальные исключения
    // TODO: логировать на уровне ERROR с трейсом
    // TODO: вернуть ResponseEntity с ErrorDto и статусом 500
    @ExceptionHandler(Exception::class)
    fun handleUnexpected(ex: Exception): ResponseEntity<ErrorDto> {
        // TODO: logger.error(...)
        // TODO: вернуть ErrorDto(code = "INTERNAL_ERROR", message = ...)
        TODO("")
    }
}