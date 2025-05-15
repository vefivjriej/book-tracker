# 📘 Book Tracker

## 📌 User Story

> Как пользователь  
> Я хочу добавлять, просматривать, редактировать и удалять книги в своей библиотеке  
> Чтобы удобно отслеживать прочитанные и планируемые к чтению книги

---

## 📈 DDL — SQL-схема таблицы `book`

```sql
CREATE TABLE book (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR NOT NULL,
    author VARCHAR NOT NULL,
    year INT NOT NULL,
    read BOOLEAN NOT NULL
);
```