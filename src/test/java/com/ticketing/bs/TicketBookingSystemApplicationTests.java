package com.ticketing.bs;

import com.ticketing.bs.repo.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class TicketBookingSystemApplicationTests {


	@Autowired
	UserRepo userRepo;
	@Test
	void contextLoads() {
		System.out.println("Hi");
	}

	@Test
	 void testAll() {
		log.info("Running retrieveAll () ");
		Assertions.assertEquals(1-1,userRepo.findAll().size());
	}

	@Test
	void testAll1() {
		log.info("Running retrieveAll1 () ");
		Assertions.assertEquals(1-1,userRepo.findAll().size());
	}

	@Test
	void testAll2() {
		log.info("Running retrieveAll2 () ");
		Assertions.assertEquals(1-1,userRepo.findAll().size());
	}
}
