package av01;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class Day01Test {

    Day01 d = new Day01();

    @Test
    public void checkResultDay01 () {


        assertThat(d.getFuelt(12),is (2));
        assertThat(d.getFuelt(14),is (2));
        assertThat(d.getFuelt(1969),is (654));
        assertThat(d.getFuelt(100756),is (33583));

    }

}