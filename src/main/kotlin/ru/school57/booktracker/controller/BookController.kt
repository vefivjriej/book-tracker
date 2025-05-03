package ru.school57.booktracker.controller

import ru.school57.booktracker.dto.BookDto
import ru.school57.booktracker.service.BookService

// TODO: добавить @RestController
// TODO: добавить @RequestMapping("/books")
class BookController(private val bookService: BookService) {

    // TODO: добавить аннотацию @PostMapping
    // TODO: добавить @RequestBody к параметру dto
    fun create(dto: BookDto): BookDto {
        // TODO: вызвать bookService.create(dto)
        // TODO: вернуть результат с HTTP 200
        TODO("")
    }

    // TODO: добавить аннотацию @GetMapping("/{id}")
    // TODO: добавить @PathVariable к параметру id
    fun get(id: Long): BookDto {
        // TODO: вызвать bookService.getById(id)
        // TODO: вернуть результат с HTTP 200
        TODO("")
    }

    // TODO: добавить аннотацию @PutMapping("/{id}")
    // TODO: добавить @PathVariable и @RequestBody к параметрам
    fun update(id: Long, dto: BookDto): BookDto {
        // TODO: вызвать bookService.update(id, dto)
        // TODO: вернуть результат с HTTP 200
        TODO("")
    }

    // TODO: добавить аннотацию @DeleteMapping("/{id}")
    // TODO: добавить @PathVariable к параметру id
    fun delete(id: Long): Unit {
        // TODO: вызвать bookService.delete(id)
        // TODO: вернуть HTTP 200 без тела
        TODO("")
    }

    // TODO: добавить аннотацию @GetMapping
    // TODO: добавить @RequestParam(read) к параметру
    fun list(read: Boolean?): List<BookDto> {
        // TODO: вызвать bookService.list(read)
        // TODO: вернуть список книг с HTTP 200
        TODO("")
    }
}

