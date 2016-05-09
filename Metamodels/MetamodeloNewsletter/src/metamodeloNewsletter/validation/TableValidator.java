/**
 *
 * $Id$
 */
package metamodeloNewsletter.validation;

import metamodeloNewsletter.Row;

import metamodeloNewsletter.enums.Color;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link metamodeloNewsletter.Table}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TableValidator {
	boolean validate();

	boolean validateRows(EList<Row> value);
	boolean validateWidth(String value);
	boolean validateBackgroundColor(Color value);
}
