package com.techelevator;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssingmentTest {
	private HomeworkAssignment testHomeworkMarks;
	@Before
	public void setUp() {
		testHomeworkMarks = new HomeworkAssignment(80);
	}

	@Test
	public void get_iniatlize() {
		HomeworkAssignment testHomework = new HomeworkAssignment(100, 80, "Ryan");
		testHomework.setSubmitterName("Ryan");
	    int successTotalMarks = testHomework.getTotalMarks();
	    Assert.assertEquals(100, successTotalMarks);
	    int successPossibleMarks = testHomework.getPossibleMarks();
	    Assert.assertEquals(80, successPossibleMarks);
	    String successSubmitter = testHomework.getSubmitterName();
	    Assert.assertEquals("Ryan", successSubmitter);
	}
	@Test
	public void get_Letter_grade() {
		testHomeworkMarks.setSubmitterName("Ryan");
		testHomeworkMarks.setTotalMarks(100);
	}
	@Test
	public void get_Letter_grade_testb() {
		HomeworkAssignment testHomework = new HomeworkAssignment(100, 80, "Ryan");
		
		testHomework.setTotalMarks(100);
		//testHomework.getPossibleMarks();
		//testHomeworkMarks.setTotalMarks(100);
//		String success = testHomework.getLetterGrade();
		String success = testHomework.getLetterGrade(0.8);
		//int percetangeMarks = 
//		Assert.assertTrue("B", success);
		Assert.assertEquals("B", success);
	}
	@Test
	public void get_Letter_grade_testA() {
		HomeworkAssignment testHomework = new HomeworkAssignment(100, 80, "Ryan");
		String success = testHomework.getLetterGrade(0.9);
		Assert.assertEquals("A", success);
	}
	@Test
	public void get_Letter_grade_testc() {
		//HomeworkAssignment testHomework = new HomeworkAssignment(100, 0, "Ryan");
		HomeworkAssignment testHomework = new HomeworkAssignment(100, 70, "Ryan");
		testHomework.setTotalMarks(100);
		String success = testHomework.getLetterGrade(0.7);
		Assert.assertEquals("C", success);
	}
	@Test
	public void get_Letter_grade_testd() {
		HomeworkAssignment testHomework = new HomeworkAssignment(100, 60, "Ryan");
		String success = testHomework.getLetterGrade(0.6);
		Assert.assertEquals("D", success);
	}
	@Test
	public void get_Letter_grade_test7() {
		HomeworkAssignment testHomework = new HomeworkAssignment(100, 50, "Ryan");
		String success = testHomework.getLetterGrade(0.5);
		Assert.assertEquals("F", success);
	}
	/*
	UnsortedArray s = new UnsortedArray(10);

	int score;

	for( int i=1; i<=10; i++ )
	{ 
	    score = 50 + (int)(Math.random()*50)+1;
	    s.insert( new Data(score) );
	}
		*/
	
}
