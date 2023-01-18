package com.junit.test;

import com.junit.test.model.User;
import com.junit.test.repository.UserRepository;
import com.junit.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class TestApplicationTests {

	@Autowired
	private UserService service;

	@MockBean
	private UserRepository repository;

	@Test
	void twoPlusTwoShouldEqualOneFour(){
		var calculator = new Calculator();
		assertEquals(4, calculator.add(2,2));

	}

	@Test
	void threePlusSevenShouldEqualTen(){
		var calculator = new Calculator();
		assertEquals(10, calculator.add(3,7));
	}

	@org.junit.Test
	public void getUsersTest() {
		when(repository.findAll()).thenReturn(Stream.of(new User(101, "ashish", "user")).collect(Collectors.toList()));
		assertEquals(1, service.getAllUsers().size());
	}

	@org.junit.Test
	public void addUserTest() {
		User user = new User(201, "bhagat", "superAdmin");

		when(repository.save(user)).thenReturn(user);
		assertEquals(user, service.saveUser(user));
	}

	@org.junit.Test
	public void deleteUser() {
		User user = new User(201, "bhagat", "superAdmin");
		service.deleteUSerById(user.getId());
		verify(repository, times(1)).deleteById(user.getId());
	}

}
