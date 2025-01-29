package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        return Arrays.asList(new Post("Ура я в Майами!", new Date(125, 4, 5)), new Post("Грустно. в холодильнике кончились сырники", new Date()), new Post("Кран", new Date(177, 6, 7)));
    }
}
