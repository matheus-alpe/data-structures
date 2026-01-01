package org.example.algorithms.hashmap;

import org.example.algorithms.algorithms.hashmap.FirstUniqueCharacter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterTest {
    @ParameterizedTest
    @CsvSource({
            "leetcode, 0",
            "loveleetcode, 2",
            "aabb, -1"
    })
    void testFirstUniqChar(String input, int expected) {
        assertEquals(expected, FirstUniqueCharacter.firstUniqChar(input));
    }

    @ParameterizedTest
    @CsvSource({
            "leetcode, 0",
            "loveleetcode, 2",
            "aabb, -1"
    })
    void testFirstUniqCharFastest(String input, int expected) {
        assertEquals(expected, FirstUniqueCharacter.firstUniqCharFastest(input));
    }
}