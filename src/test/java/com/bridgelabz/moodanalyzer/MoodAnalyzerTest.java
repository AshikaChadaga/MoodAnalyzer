package com.bridgelabz.moodanalyzer;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws Exception {
		
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyzeMood("This is a sad message");
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}
	
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() throws Exception {
		
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyzeMood("This is a happy message");
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}
}
