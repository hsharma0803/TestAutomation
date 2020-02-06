package demoMavenPackage;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestClass1 {
	
	@Test
	public static void sum() {
		
		int a=10;
		int b=20; 
		int c= a+b;
		Assert.assertEquals(30, a+b);
		
	}
	
	@Test
	public static void subtraction() {
		
		int p=20;
		int q=10; 
		int r= p-q;
		Assert.assertEquals(10, p-q);
		
	}
	
	@Test
	public static void multiply() {
		
		int m=10;
		int n=20; 
		int k= m*n;
		Assert.assertEquals(200, m*n);
		
	}
	
	@Test
	public static void division() {
		
		int x=20;
		int y=10; 
		int z= x/y;
		Assert.assertEquals(2, x/y);
		
	}

	
	

}
