package hw2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomStringTest {

	//declare custom string for testing
	CustomString myCustomString;

	@BeforeEach
	public void setUp() throws Exception {
		//initialize custom string for testing
		this.myCustomString = new CustomString();
	}

	@Test
	void testGetString() {
		
		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());
		
		this.myCustomString.setString("hello");
		assertEquals("hello", this.myCustomString.getString());
		
		// TODO write at least 3 additional test cases 
		
		this.myCustomString.setString("This is a Custom String");
		assertEquals("This is a Custom String", this.myCustomString.getString());
		
		this.myCustomString.setString("Hello World!");
		assertEquals("Hello World!", this.myCustomString.getString());
		
		this.myCustomString.setString("Last test for GetString");
		assertEquals("Last test for GetString", this.myCustomString.getString());
	}
	
	@Test
	void testSetString() {
		
		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());
		
		this.myCustomString.setString("Good-bye!");
		assertEquals("Good-bye!", this.myCustomString.getString());
		
		// TODO write at least 3 additional test cases 
		
		this.myCustomString.setString("This is a custom string!");
		assertEquals("This is a custom string!", this.myCustomString.getString());
		
		this.myCustomString.setString("Good-Bye World!");
		assertEquals("Good-Bye World!", this.myCustomString.getString());
		
		this.myCustomString.setString("Last Test for SetString");
		assertEquals("Last Test for SetString", this.myCustomString.getString());
		
	}
	
	@Test
	void testRemove() {
		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbes e 6, 8, nd 19.", this.myCustomString.remove("ra6"));
		
		// TODO write at least 3 additional test cases 
		
		this.myCustomString.setString("How much wood could a woodchuck chuck if a woodchuck could chuck wood?");
		assertEquals("Ho muh ood ould a oodhuk huk if a oodhuk ould huk ood?", this.myCustomString.remove("cw9"));
		
		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbers are 6, 8, and 19.", this.myCustomString.remove(""));
		
		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbers are 6, 8, and 19.",this.myCustomString.remove("6.,"));
	}

	@Test
	void testReverse() {
		assertEquals("", this.myCustomString.reverse(""));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.reverse(""));
		
		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("aBC, xyz; 123.", this.myCustomString.reverse("bcdxyz@3210."));
		
		// TODO write at least 3 additional test cases 
		
		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("abc, XYZ; 123.", this.myCustomString.reverse("6,."));
		
		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("abc, XYZ; 123.", this.myCustomString.reverse(""));
		
		this.myCustomString.setString("hello WORLD! 321");
		assertEquals("heLLo WORld! 321", this.myCustomString.reverse("ld"));
		
		
	}

	@Test
	void testFilterLetters() {
		assertEquals("", this.myCustomString.filterLetters('E', false));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.filterLetters('E', false));
		
		// TODO write at least 3 additional test cases 
		
		this.myCustomString.setString("Hello 90, bye 2");
		assertEquals("llo 90, y 2", this.myCustomString.filterLetters('h', false));
		
		this.myCustomString.setString("Hello 90, bye 2");
		assertEquals("e 90, be 2", this.myCustomString.filterLetters('h', true));
		
		this.myCustomString.setString("Abcdefg");
		assertEquals("defg", this.myCustomString.filterLetters('c', false));
		
		this.myCustomString.setString("Abcdefg");
		assertEquals("Ab", this.myCustomString.filterLetters('c', true));
		
	}

}
