/*
 * The MIT License
 *
 * Copyright (c) 2010-2025 Jason Priem, Bruno P. Kinoshita
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.tupilabs.human_name_parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>A {@code Name} object that encapsulates a name string, and contains the logic
 * for handling with Regexes.</p>
 *
 * <p>This class is not thread-safe.</p>
 *
 * @since 0.1
 */
public class Name {

    /**
     * Encapsulated string. Not immutable!
     */
    private String str;

    /**
     * Creates a new Name object.
     * @param str encapsulated string.
     */
    public Name(String str) {
        this.str = str;
    }

    /**
     * Gets the encapsulated string.
     * @return encapsulated string
     */
    public String getStr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the encapsulated string value.
     * @param str string value
     */
    public void setStr(String str) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Uses a regex to chop off and return part of the namestring.
     * There are two parts: first, it returns the matched substring,
     * and then it removes that substring from the encapsulated
     * string and normalizes it.
     *
     * @param regex matches the part of the namestring to chop off
     * @param submatchIndex which of the parenthesized submatches to use
     * @return the part of the namestring that got chopped off
     */
    public String chopWithRegex(String regex, int submatchIndex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Flips the front and back parts of a name with one another.
     * Front and back are determined by a specified character somewhere in the
     * middle of the string.
     *
     * @param flipAroundChar the character(s) demarcating the two halves you want to flip.
     * @throws ParseException if a regex fails or a condition is not expected
     */
    public void flip(String flipAroundChar) throws ParseException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>Removes extra whitespace and punctuation from {@code this.str}.</p>
     *
     * <p>Strips whitespace chars from ends, strips redundant whitespace, converts
     * whitespace chars to " ".</p>
     */
    public void norm() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
