/**
 *
 * $Id$
 */
package metamodeloNewsletter.validation;

import metamodeloNewsletter.Element;
import metamodeloNewsletter.Table;

import metamodeloNewsletter.enums.Color;
import metamodeloNewsletter.enums.VerticalAlign;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link metamodeloNewsletter.Cell}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CellValidator {
	boolean validate();

	boolean validateTable(Table value);
	boolean validateElements(EList<Element> value);
	boolean validateWidth(int value);

	boolean validateWidth(String value);
	boolean validateBackgroundColor(Color value);
	boolean validateVerticalAlignment(VerticalAlign value);
}
