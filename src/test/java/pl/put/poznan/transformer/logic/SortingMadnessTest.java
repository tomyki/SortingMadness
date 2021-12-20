package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;
import pl.put.poznan.transformer.rest.SortingMadnessController;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SortingMadnessTest {

    @Test
    public void testMock() throws Exception {
        SortingMadnessController mockObject = mock(SortingMadnessController.class);
        when(mockObject.post(anyString(), anyString(), anyString(), anyString(), anyString(), anyString(), anyString(), new String[] {anyString()})).thenReturn("cokolwiek");

    }
}