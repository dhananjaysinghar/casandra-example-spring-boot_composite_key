package com.casandra.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

@Data
@AllArgsConstructor
@Builder
@PrimaryKeyClass
public class CompositeKey {

    @PrimaryKeyColumn(name = "USERID", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String userId;

    @PrimaryKeyColumn(name = "PROFILEID", ordinal = 0, type = PrimaryKeyType.CLUSTERED)
    private String profileId;

}
