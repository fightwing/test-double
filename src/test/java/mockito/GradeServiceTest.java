package mockito;

import mock.DoorPanel;

import mock.SecurityCenter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import stub.GradeService;
import stub.GradeSystem;

import static org.mockito.Mockito.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Boyu Yuan
 * @date 2020/9/15 23:59
 */
public class GradeServiceTest {

    @Test
    void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100(){
        GradeSystem mockGradeSystem = mock(GradeSystem.class);
        GradeService gradeService = new GradeService(mockGradeSystem);
        when(mockGradeSystem.gradesFor(123L)).thenReturn(Arrays.asList(90.0, 80.0, 100.0));
        double result = gradeService.calculateAverageGrades(123L);
        Assertions.assertEquals(90,result);

    }

}
