package com.tharak.cb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CustomBuilderApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void greetingShown() {
		String bannerString=CustomBuilderApplication.getBanner("ANSI");
		assertTrue(bannerString.contains("Hello from Google Cloud!"));
	}

	@Test
	void emojiGreetingShown() {
		String bannerString=CustomBuilderApplication.getBanner("emoji");
		assertTrue(bannerString.contains("Hello from Google Cloud!"));
	}

}
