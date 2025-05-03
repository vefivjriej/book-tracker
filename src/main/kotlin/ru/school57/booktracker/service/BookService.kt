package ru.school57.booktracker.service

import ru.school57.booktracker.dto.BookDto
import ru.school57.booktracker.repository.BookRepository

// TODO: добавить аннотацию @Service
class BookService(
    private val bookRepository: BookRepository
) {
    fun create(bookDto: BookDto): BookDto {
        // TODO: залогировать входящие параметры (DEBUG-уровень)
        // TODO: сохранить книгу в базу через bookRepository
        // TODO: залогировать факт создания (INFO-уровень), включая ID
        // TODO: вернуть созданную книгу как BookDto
    }

    fun getById(id: Long): BookDto {
        // TODO: залогировать входящий id (DEBUG)
        // TODO: попытаться получить книгу по id через bookRepository
        // TODO: если книга не найдена — выбросить EntityNotFoundException с понятным сообщением
        // TODO: залогировать успешное получение (INFO)
        // TODO: вернуть найденную книгу как BookDto
    }

    fun update(id: Long, dto: BookDto): BookDto {
        // TODO: залогировать входящие параметры (DEBUG): id и dto
        // TODO: найти книгу по id
        // TODO: если не найдена — выбросить EntityNotFoundException
        // TODO: обновить поля книги на основе dto
        // TODO: сохранить обновлённую книгу
        // TODO: залогировать обновление (INFO), включая id
        // TODO: вернуть обновлённую книгу как BookDto
    }

    fun delete(id: Long) {
        // TODO: залогировать входящий id (DEBUG)
        // TODO: проверить наличие книги через existsById
        // TODO: если не найдена — выбросить EntityNotFoundException
        // TODO: удалить книгу
        // TODO: залогировать удаление (INFO), включая id
        // TODO: метод ничего не возвращает
    }

    fun list(read: Boolean?): List<BookDto> {
        // TODO: залогировать параметр read (DEBUG)
        // TODO: если read == null — вернуть все книги
        // TODO: если read != null — вернуть отфильтрованные книги
        // TODO: залогировать количество возвращённых записей (INFO)
        // TODO: вернуть список книг как List<BookDto>
    }
}