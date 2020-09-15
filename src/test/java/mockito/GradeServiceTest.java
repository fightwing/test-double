package mockito;

import mock.DoorPanel;

import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Boyu Yuan
 * @date 2020/9/15 23:59
 */
public class GradeServiceTest {

    @Test
    public void shouldVerifyDoorIsClosed() {
        DoorPanel mockDoorPanel = mock(DoorPanel.class);
        doNothing().when(mockDoorPanel).close();
        SecurityCenter securityCenter = new SecurityCenter(mockDoorPanel);
        securityCenter.switchOn();
        verify(mockDoorPanel,times(1));
    }
}
