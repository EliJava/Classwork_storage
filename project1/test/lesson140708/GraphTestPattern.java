package lesson140708;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GraphTestPattern {

	static{
		System.out.println("static init");
	}
	
	{
		System.out.println("instance init");
	}
	
	public GraphTestPattern(){
		System.out.println("constructor");
	}
	
	@BeforeClass
	public static  void setupClass(){
		System.out.println("Before class");
	}

	@Before
	public void setup(){
		System.out.println("Before");
	}
	
	@After
	public void teardown(){
		System.out.println("After");
	}
	
	@Test
	public void test1() {
		System.out.println("test 1");
	}
	@Test
	public void test2() {
		System.out.println("test 2");
	}

	@AfterClass
	public static void teardownClass(){
		System.out.println("After class");
	}
}
