package ru.school57.booktracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookTrackerApplication

fun main(args: Array<String>) {
    runApplication<BookTrackerApplication>(*args)
}