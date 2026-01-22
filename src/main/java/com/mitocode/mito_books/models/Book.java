package com.mitocode.mito_books.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

// import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @JacksonXmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Book {
    @Id
    private int idBook;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @ManyToOne
    @JoinColumn(name = "id_category", nullable = false)
    private Category category;
    
    @Column(name = "enabled", nullable = false)
    private boolean enabled;
}

