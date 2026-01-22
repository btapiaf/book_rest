package com.mitocode.mito_books.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @JacksonXmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Category {

    @Id
    private Integer idCategory;
    @Column(name = "name", nullable = false, length = 50)
    private String name;

}
