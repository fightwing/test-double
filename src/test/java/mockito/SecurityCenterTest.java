package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

/**
 * @author Boyu Yuan
 * @date 2020/9/15 23:59
 */
public class SecurityCenterTest {
    @Test
    public void shouldVerifyDoorIsClosed() {
        DoorPanel mockDoorPanel = mock(DoorPanel.class);
        doNothing().when(mockDoorPanel).close();
        SecurityCenter securityCenter = new SecurityCenter(mockDoorPanel);
        securityCenter.switchOn();
        verify(mockDoorPanel,times(1));
    }
}
