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

import org.apache.commons.lang3.StringUtils;
import java.util.List;

/**
 * <p>
 * A parser capable of parsing name parts out of a single string.
 * </p>
 *
 * <p>
 * The code works by basically applying several Regexes in a certain order and
 * removing (chopping) tokens off the original string. The parser consumes the
 * tokens during its creation.
 * </p>
 *
 * <p>
 * This class is not thread-safe.
 * </p>
 *
 * @since 0.1
 */
public class HumanNameParserParser {

    /**
     * The input name object.
     */
    private final Name name;

    // other helpful values
    List<String> salutations;

    List<String> postnominals;

    List<String> prefixes;

    List<String> suffixes;

    // parsed values
    private String leadingInit;

    private String first;

    private String nicknames;

    private String middle;

    private String last;

    private String suffix;

    private String salutation;

    private String postnominal;

    HumanNameParserParser(final Name name, List<String> salutations, List<String> postnominals, List<String> prefixes, List<String> suffixes) {
        this.name = name;
        this.salutations = salutations;
        this.postnominals = postnominals;
        this.prefixes = prefixes;
        this.suffixes = suffixes;
    }

    /**
     * Gets the {@code Name} object.
     *
     * @return the {@code Name} object
     */
    public Name getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // getters for parsed values
    public String getLeadingInit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFirst() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getNicknames() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getMiddle() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLast() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSuffix() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getPostnominal() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSalutation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Consumes the string and creates the name parts.
     *
     * @throws ParseException
     *             if the parser fails to retrieve the name parts
     */
    void parse() throws ParseException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
