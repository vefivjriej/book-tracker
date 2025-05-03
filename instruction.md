# Домашнее задание: Book Tracker

## Цель

Реализовать промышленное веб-приложение на Kotlin + Spring Boot для хранения информации о книгах.  
В проекте уже содержатся шаблоны с комментариями `TODO`. Ваша задача — реализовать функциональность согласно этим подсказкам.

## Что нужно реализовать

### Сущность `Book`
- Класс сущности с полями: `id`, `title`, `author`, `year`, `read`
- Аннотации JPA: `@Entity`, `@Id`, `@GeneratedValue`, `@Column`
- SQL-миграция в `resources/db/changelog/001-init.sql`

### DTO `BookDto`
- Те же поля, кроме `id`
- Методы `toEntity()` и `fromEntity(...)`

### Репозиторий `BookRepository`
- Интерфейс JPA
- Метод `findByRead(read: Boolean): List<Book>`

### Сервис `BookService`
- Методы: `create`, `getById`, `update`, `delete`, `list`
- Обработка исключений (например, при отсутствии книги)
- Логирование:
    - входные параметры — уровень DEBUG
    - успешные действия — уровень INFO

### Контроллер `BookController`
- Методы:
    - `POST /books`
    - `GET /books/{id}`
    - `PUT /books/{id}`
    - `DELETE /books/{id}`
    - `GET /books?read=true/false`
- Все методы возвращают HTTP 200
- Используйте аннотации: `@RestController`, `@RequestMapping`, `@PostMapping`, `@GetMapping`, `@PutMapping`, `@DeleteMapping`, `@RequestBody`, `@PathVariable`, `@RequestParam`

### Обработка ошибок (`GlobalExceptionHandler`)
- Обрабатывать:
    - `EntityNotFoundException` → 404
    - `MethodArgumentNotValidException` → 400
    - все остальные ошибки → 500
- Возвращать `ErrorDto(code, message)`
- Логировать ошибки (warn и error)

### Логирование `RequestIdFilter`
- Генерация `requestId` на каждый запрос
- Сохранение в MDC
- Очистка после завершения запроса

### Тесты
- `BookControllerTest` — `@SpringBootTest`, `@MockkBean`, `MockMvc`
- `BookServiceUnitTest` — юнит-тест с MockK
- `BookServiceIntegrationTest` — тест с поднятием контекста Spring

Функции тестов заданы, реализацию нужно написать самостоятельно.

## Примеры

Основной шаблон:  
https://github.com/rkarabash/book-tracker

Примеры реализации:  
https://github.com/rkarabash/to-do-list

## Как запустить

1. Запустить PostgreSQL:
   ```
   docker-compose up
   ```

2. Запустить приложение:
   ```
   ./gradlew bootRun
   ```

3. Открыть Swagger:  
   http://localhost:8080/swagger-ui.html

## Как сдавать

Работы принимаются **только в виде Pull Request** из форка основного репозитория.

### Пошаговая инструкция:

1. Перейдите в репозиторий: https://github.com/rkarabash/book-tracker
2. Нажмите кнопку **Fork** в правом верхнем углу
3. Откройте свой форк и склонируйте его к себе:
   ```
   git clone https://github.com/ВАШ_ЛОГИН/book-tracker.git
   ```
4. Реализуйте все `TODO` в проекте
5. Зафиксируйте изменения и отправьте их в свой форк:
   ```
   git add .
   git commit -m "Выполнено ДЗ Book Tracker"
   git push origin main
   ```
6. Перейдите на страницу своего репозитория и нажмите кнопку **Compare & pull request**
7. Откройте Pull Request в основной репозиторий
8. В описании PR напишите: "Готово"

## Дедлайн

Работа должна быть сдана **до 16 мая 12:00 по московскому времени.**

После указанного времени работы **не принимаются. Без исключений.**