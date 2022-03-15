/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author daffaz
 */
public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListIsEmptyAtInit() {
        assertEquals(0, this.management.exerciseList().size());
    }

    @Test
    public void addExerciseByOne() {
        this.management.add("Push up");
        assertEquals(1, this.management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList() {
        this.management.add("Sit up");
        assertTrue(this.management.exerciseList().contains("Sit up"));
    }
}
