package ru.school57.booktracker.service

import com.ninjasquad.springmockk.MockkBean
import io.mockk.MockKAnnotations
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import ru.school57.booktracker.repository.BookRepository

// TODO: тестирует BookService в изоляции от базы
// TODO: использует замоканный BookRepository
// Пример: https://github.com/Monax111/school57kotlin2/blob/1766125ad22d5e2b45af3f9e8e55244a552986d2/lesson13/src/test/kotlin/school57kotlin2/demo/ServiceTest.kt

@SpringBootTest
class BookServiceIntegrationTest {

    @MockkBean
    lateinit var bookRepository: BookRepository

    @Autowired
    lateinit var bookService: BookService

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)
    }

    // TODO: проверить, что книга сохраняется через репозиторий
    @Test
    fun testCreateBook() {
        TODO("реализовать тест создания книги")
    }

    // TODO: проверить получение книги по ID
    @Test
    fun testGetBookById() {
        TODO("реализовать тест получения по id")
    }

    // TODO: проверить обновление книги
    @Test
    fun testUpdateBook() {
        TODO("реализовать тест обновления книги")
    }

    // TODO: проверить удаление книги
    @Test
    fun testDeleteBook() {
        TODO("реализовать тест удаления книги")
    }

    // TODO: проверить фильтрацию по флагу read
    @Test
    fun testFilterByRead() {
        TODO("реализовать тест фильтрации")
    }

    // TODO: проверить исключение при отсутствии книги
    @Test
    fun testGetNonExistentBookThrows() {
        TODO("реализовать тест выброса EntityNotFoundException")
    }
}
