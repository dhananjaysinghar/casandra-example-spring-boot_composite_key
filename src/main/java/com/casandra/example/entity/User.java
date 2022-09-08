package com.casandra.example.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table()
public class User {

    @PrimaryKey
    private CompositeKey key;
    private String name;
    private String address;

}