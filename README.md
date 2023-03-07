# Gроект по тестированию сайта NASA (https://www.nasa.gov/)

## Содержание:

- [Технологии и инструменты](#gear-технологии-и-инструменты)
- [Тест кейсы](#heavy_check_mark-Тест-кейсы)
- [Запуск тестов](#computer-запуск-тестов-из-терминала)
- [Примеры использования](#примеры-использования)
- [Запуск тестов в Jenkins](#-запуск-тестов-из-jenkins)
- [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-Allure-report)
- [Видео прохождения тестов](#movie_camera-видео-с-прогоном-тестов)

## :gear: Технологии и инструменты

<p align="left">
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://selenide.org/"><img src="media/logo/Selenide.svg" width="50" height="50" alt="Selenide" title="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="media/logo/Selenoid.svg" width="50" height="50" alt="Selenoid" title="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logo/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
</p>

В данном проекте автотесты написаны на **Java** с использованием фреймворка для тестирования **Selenide**. Для сборки проекта в среде **IntelliJ IDEA** используется **Gradle**.
**JUnit5** задействован в качестве фреймворка модульного тестирования. Запуск тестов выполняется из **Jenkins**. **Selenoid** используется для запуска браузеров в контейнерах **Docker**.

**Allure Report**, **AllureTestOps** и **Telegram Bot** используются для визуализации результатов тестирования.

## :heavy_check_mark: Тест кейсы

- Проверка добавление товара в корзину
- Проверка аутентификации пользователя
- Проверка наличия заголовков главной страницы
- Проверка наличия разделов на главной странице
- Проверка наличия рекламного слогана
- Проверка наличия блока c социальными сетями в подвале страницы
- Проверка поиска заданного товара
