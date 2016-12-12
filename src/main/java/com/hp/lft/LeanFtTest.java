package com.hp.lft;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import unittesting.*;

//@RunWith(Cucumber.class)
@RunWith(OctaneCucumber.class)
@CucumberOptions(plugin = {"junit:leanftResults.xml"}, features="classpath:advantage.feature")//the feature to execute
public class LeanFtTest extends UnitTestClassBase {

	public LeanFtTest() {
		//Change this constructor to private if you supply your own public constructor
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new LeanFtTest();
		globalSetup(LeanFtTest.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		globalTearDown();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() throws GeneralLeanFtException {
		
	}

}