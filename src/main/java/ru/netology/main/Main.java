package ru.netology.main;

import ru.netology.FormDate;
import ru.netology.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Вася";
        post.patronymic = "Иванович";
        post.surname = "Пупкин";
        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 4;
        post.birthday.year = 1990;
        post.passport = "2569 № 010203";
        post.phone = "+7 (777)-777-77-77";
        post.subscription = true;
    }
}