package org.example.exercicetdd;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradingCalculatorTest {

	@Test
	public void whenScore_95_Attendance_90_then_A() {
		// Arrange
		GradingCalculator calculator = new GradingCalculator(95, 90);

		// Act
		char grade = calculator.getGrade();

		// Assert
		assertEquals('A', grade);
	}
	@Test
	public void whenScore_85_Attendance_90_then_B() {
		// Arrange
		GradingCalculator calculator = new GradingCalculator(85, 90);

		// Act
		char grade = calculator.getGrade();

		// Assert
		assertEquals('B', grade);
	}
	@Test
	public void whenScore_65_Attendance_90_then_C() {
		// Arrange
		GradingCalculator calculator = new GradingCalculator(65, 90);

		// Act
		char grade = calculator.getGrade();

		// Assert
		assertEquals('C', grade);
	}
	@Test
	public void whenScore_95_Attendance_65_then_B() {
		// Arrange
		GradingCalculator calculator = new GradingCalculator(95, 65);

		// Act
		char grade = calculator.getGrade();

		// Assert
		assertEquals('B', grade);
	}
	@Test
	public void whenScore_95_Attendance_55_then_F() {
		// Arrange
		GradingCalculator calculator = new GradingCalculator(95, 55);

		// Act
		char grade = calculator.getGrade();

		// Assert
		assertEquals('F', grade);
	}
	@Test
	public void whenScore_65_Attendance_55_then_F() {
		// Arrange
		GradingCalculator calculator = new GradingCalculator(65, 55);

		// Act
		char grade = calculator.getGrade();

		// Assert
		assertEquals('F', grade);
	}
	@Test
	public void whenScore_50_Attendance_90_then_F() {
		// Arrange
		GradingCalculator calculator = new GradingCalculator(50, 90);

		// Act
		char grade = calculator.getGrade();

		// Assert
		assertEquals('F', grade);
	}

}