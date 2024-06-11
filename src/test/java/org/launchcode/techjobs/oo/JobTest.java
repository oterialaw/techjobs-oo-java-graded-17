package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.assertEquals;

public class JobTest {
    //TODO: Create your unit tests here
//    @Test
//    public void testJob() {
//    }
    @Test
    public void testSettingJobId() {
        Job job = new Job();
        Job newJob = new Job();
//        assertNotEquals(job, newJob);
        org.junit.Assert.assertNotEquals(job.getId(), newJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        org.junit.Assert.assertTrue(testJob.getName(), true);
        org.junit.Assert.assertTrue(testJob.getEmployer().getValue(), true);
        org.junit.Assert.assertTrue(testJob.getLocation().getValue(), true);
        org.junit.Assert.assertTrue(testJob.getPositionType().getValue(), true);
        org.junit.Assert.assertTrue(testJob.getCoreCompetency().getValue(), true);

        org.junit.Assert.assertEquals(testJob.getName(), "Product tester");
        org.junit.Assert.assertEquals(testJob.getEmployer().getValue(),"ACME");
        org.junit.Assert.assertEquals(testJob.getLocation().getValue(), "Desert");
        org.junit.Assert.assertEquals(testJob.getPositionType().getValue(), "Quality control");
        org.junit.Assert.assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job tesJob = new Job();
        Job anotherJob = new Job();
        org.junit.Assert.assertNotEquals(tesJob.getId(), anotherJob.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job justNewLineJob = new Job(
                "Name Value",
                new Employer("Employer Value"),
                new Location("Location Value"),
                new PositionType("Position Value"),
                new CoreCompetency("Competency Value")
        );
        String firstCharacter = String.valueOf(justNewLineJob.toString().charAt(0));
        String lastCharacter = String.valueOf(justNewLineJob.toString().charAt(justNewLineJob.toString().length()-1));
        assertEquals(firstCharacter, lineSeparator());
        assertEquals(lastCharacter, lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job hasLabelsAndDataJob = new Job(
                "Name Value",
                new Employer("Employer Value"),
                new Location("Location Value"),
                new PositionType("Position Value"),
                new CoreCompetency("Competency Value")
        );
        String expected =
                System.lineSeparator() + "ID: " + hasLabelsAndDataJob.getId() + System.lineSeparator() +
                        "Name: " + hasLabelsAndDataJob.getName() + System.lineSeparator() +
                        "Employer: " + hasLabelsAndDataJob.getEmployer().getValue() + System.lineSeparator() +
                        "Location: " + hasLabelsAndDataJob.getLocation().getValue() + System.lineSeparator() +
                        "Position Type: " + hasLabelsAndDataJob.getPositionType().getValue() + System.lineSeparator() +
                        "Core Competency: " + hasLabelsAndDataJob.getCoreCompetency().getValue() + System.lineSeparator();
        org.junit.Assert.assertEquals(expected, hasLabelsAndDataJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
//        Job emptyJob = new Job();
//        org.junit.Assert.a("", emptyJob.toString());
    }
}
