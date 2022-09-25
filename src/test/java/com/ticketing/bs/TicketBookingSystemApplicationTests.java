package com.ticketing.bs;

import com.ticketing.bs.repo.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
//@Slf4j
@ExtendWith(MockitoExtension.class)
 class TicketBookingSystemApplicationTests {

//	@Mock
//	@Autowired
//	UserRepo userRepo;
//	@Test
//	void contextLoads() {
//		System.out.println("Hi");
//	}
//
//	@Test
//	void testAll() {
//		log.info("Running retrieveAll () ");
//		Assertions.assertEquals(1-1,userRepo.findAll().size());
//	}
//
//	@Test
//	void testAll1() {
//		log.info("Running retrieveAll1 () ");
//		Assertions.assertEquals(1-1,userRepo.findAll().size());
//	}
//
//	@Test
//	void testAll2() {
//		log.info("Running retrieveAll2 () ");
//		Assertions.assertEquals(1-1,userRepo.findAll().size());
//	}


	@Test
	void test2(){
		Assertions.assertTrue(true);
	}
}
