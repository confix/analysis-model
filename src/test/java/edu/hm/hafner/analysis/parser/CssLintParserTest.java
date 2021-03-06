package edu.hm.hafner.analysis.parser;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import edu.hm.hafner.analysis.AbstractParser;
import edu.hm.hafner.analysis.Issues;
import static edu.hm.hafner.analysis.assertj.Assertions.*;

/**
 * Tests the class {@link JSLintParser}.
 *
 * @author Ullrich Hafner
 */
public class CssLintParserTest extends ParserTester {
    /**
     * Tests parsing of CSS-Lint files.
     *
     * @throws IOException in case of an error
     */
    @Test
    public void testCssLint() throws IOException {
        Issues results = createParser().parse(openFile());
        assertThat(results).hasSize(51);
    }

    /**
     * Creates the parser.
     *
     * @return the warnings parser
     */
    protected AbstractParser createParser() {
        return new CssLintParser();
    }

    @Override
    protected String getWarningsFile() {
        return "jslint/csslint.xml";
    }
}
