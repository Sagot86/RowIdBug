package com.example.demo;

import com.example.demo.model.MainEntity;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

//import javax.persistence.EntityManager;
import java.util.UUID;

@DataJpaTest
class DemoApplicationTests {

	@Autowired
	public EntityManager em;

	@Test
	void reproduceBug() {
		var ent = new MainEntity(UUID.randomUUID(), "TestVal");

		em.persist(ent);
		em.flush();

		ent.status = "NEW STATUS";

		em.flush();

	}

}
