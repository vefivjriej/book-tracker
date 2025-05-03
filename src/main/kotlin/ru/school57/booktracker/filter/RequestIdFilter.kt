package ru.school57.booktracker.filter

import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.web.filter.OncePerRequestFilter

// TODO: добавить аннотацию @Component, чтобы фильтр был зарегистрирован в контексте Spring
class RequestIdFilter : OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        // TODO: сгенерировать уникальный requestId (можно через UUID)
        // TODO: положить его в MDC (контекст логов)
        // TODO: выполнить цепочку фильтров
        // TODO: очистить MDC в блоке finally
        TODO("")
    }
}