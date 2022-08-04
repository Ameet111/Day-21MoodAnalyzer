package com.bridgelabctreateobject;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelab.junit1.MoodAnalyzer;

public class MoodAnalyzeTest {
	
	@Test
	public void given_AnyMood_Should_Return_HAPPY() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.MoodAnalyzerr("I am In Any Mood");
		Assert.assertEquals("HAPPY", mood);
}

}
