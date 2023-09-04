package com.ali.joblisting.repository;

import com.ali.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}