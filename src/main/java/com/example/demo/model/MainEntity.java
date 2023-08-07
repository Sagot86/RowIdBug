package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.RowId;

//import javax.persistence.Entity;
//import javax.persistence.Id;
import java.util.UUID;

@Entity
@RowId("rowId")
public class MainEntity {
    @Id
    public UUID id;
    public String status;

    public MainEntity() {
    }

    public MainEntity(UUID id, String status) {
        this.id = id;
        this.status = status;
    }

}
