package com.example.demo.service;

import com.example.demo.model.Post;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts;

    @PostConstruct
    public void init() {
        posts = new ArrayList<>();
        // Инициализация начальных данных
        posts.add(new Post("Ура я в Майами!", new Date(125, 4, 5)));
        posts.add(new Post("Грустно. в холодильнике кончились сырники", new Date()));
        posts.add(new Post("Кран", new Date(177, 6, 7)));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}

