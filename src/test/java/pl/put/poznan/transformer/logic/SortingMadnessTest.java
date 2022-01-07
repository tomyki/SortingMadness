package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;
import pl.put.poznan.transformer.rest.SortingMadnessController;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SortingMadnessTest {

    @Test
    public void testMock() throws Exception {
        SortingMadnessController mockObject = mock(SortingMadnessController.class);
        SortingMadness obiekt = new SortingMadness(new String[] {"anyString()"});
        String[] test = new String[] {"anyString()"};
        when(mockObject.post(anyString(), anyString(), anyString(), anyString(), anyString(), anyString(), anyString(),any(String[].class))).thenReturn(obiekt.transform("2,1,3","a","int","0","b","desc","0"));
        String wynik = mockObject.post("a","a","a","a","a","a","a",test);
        verify(mockObject);
        assertEquals(wynik, "[3, 2, 1]");
    }
}