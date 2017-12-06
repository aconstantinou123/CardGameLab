import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestArrayList {
    ArrayListExample arrayListExample;

    @Before
    public void before() {
        arrayListExample = new ArrayListExample();
    }

    @Test
    public void hasNumberOfEntries() {
        assertEquals(0, arrayListExample.getWordCount());
    }

    @Test
    public void canAddWordsToArray() {
        arrayListExample.addWord("Hello");
        assertEquals(1, arrayListExample.getWordCount());
    }
}
