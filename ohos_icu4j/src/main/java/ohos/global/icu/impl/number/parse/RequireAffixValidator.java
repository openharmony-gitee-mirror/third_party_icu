/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2017 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
package ohos.global.icu.impl.number.parse;

/**
 * @author sffc
 * @hide exposed on OHOS
 *
 */
public class RequireAffixValidator extends ValidationMatcher {

    @Override
    public void postProcess(ParsedNumber result) {
        if (result.prefix == null || result.suffix == null) {
            // We saw a prefix or a suffix but not both. Fail the parse.
            result.flags |= ParsedNumber.FLAG_FAIL;
        }
    }

    @Override
    public String toString() {
        return "<RequireAffix>";
    }

}
