package tdd;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicContainer.*;
import static org.junit.jupiter.api.DynamicTest.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

class GameTest {
	
	private Game game;
	@BeforeEach
	void setUp() throws Exception {
		game = new Game();
	}

	@Test
	void test_vide() {
		assertEquals(0, game.score());
	}
	
	@Test
	void test_aucune_quille() {
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertEquals(0,game.score());
	}
	
	@Test
	void testVingtFoisUn() {
		for (int i = 0; i < 20; i++) {
			game.roll(1);
		}
		assertEquals(20, game.score());
	}
	
}
