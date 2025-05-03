package ru.school57.booktracker.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.school57.booktracker.entity.Book

interface BookRepository : JpaRepository<Book, Long> {
    // TODO: добавить метод для фильтрации книг по признаку прочитанности
}