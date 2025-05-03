package ru.school57.booktracker.service

import io.mockk.junit5.MockKExtension
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.InjectMockKs
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import ru.school57.booktracker.repository.BookRepository

// TODO: юнит-тест для BookService
// TODO: мокируем только BookRepository, без запуска Spring
// Пример: https://github.com/Monax111/school57kotlin2/blob/1766125ad22d5e2b45af3f9e8e55244a552986d2/lesson13/src/test/kotlin/school57kotlin2/demo/service/UserServiceTest.kt

@ExtendWith(MockKExtension::class)
class BookServiceUnitTest {

    // TODO: замоканный репозиторий
    @MockK
    lateinit var bookRepository: BookRepository

    // TODO: BookService с внедрённым моком
    @InjectMockKs
    lateinit var bookService: BookService

    @BeforeEach
    fun setUp() {
        // TODO: инициализировать моки (если необходимо вручную)
    }

    // TODO: протестировать создание книги
    // Проверьте, что bookRepository.save(...) вызывается
    @Test
    fun testCreateBook() {
        TODO("реализовать тест создания")
    }

    // TODO: протестировать получение книги по ID
    // Проверьте, что возвращается DTO при наличии книги
    @Test
    fun testGetById() {
        TODO("реализовать тест получения по id")
    }

    // TODO: протестировать обновление книги
    // Проверьте, что книга обновляется и сохраняется
    @Test
    fun testUpdateBook() {
        TODO("реализовать тест обновления")
    }

    // TODO: протестировать удаление книги
    // Проверьте, что вызывается deleteById, и выбрасывается исключение, если книга не найдена
    @Test
    fun testDeleteBook() {
        TODO("реализовать тест удаления")
    }

    // TODO: протестировать фильтрацию по read
    // Проверьте вызов findAll() или findByRead(true/false)
    @Test
    fun testListBooks() {
        TODO("реализовать тест списка книг")
    }

    // TODO: протестировать выброс EntityNotFoundException при отсутствии книги
    @Test
    fun testGetNotFound() {
        TODO("реализовать поведение при отсутствии книги")
    }
}
