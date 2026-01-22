package com.mitocode.mito_books.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.mito_books.models.UserIfo;

public interface UserRepo extends JpaRepository<UserIfo, Integer> {
    UserIfo findByUsername(String username);

}
