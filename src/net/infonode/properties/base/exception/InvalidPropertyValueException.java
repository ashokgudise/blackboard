/*
 * Copyright (C) 2004 NNL Technology AB
 * Visit www.infonode.net for information about InfoNode(R) 
 * products and how to contact NNL Technology AB.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, 
 * MA 02111-1307, USA.
 */


// $Id: InvalidPropertyValueException.java,v 1.2 2011-08-26 15:10:42 mpue Exp $
package net.infonode.properties.base.exception;

import net.infonode.properties.base.Property;

/**
 * An invalid property value was given.
 *
 * @author $Author: mpue $
 * @version $Revision: 1.2 $
 */
public class InvalidPropertyValueException extends PropertyException {
  private Object value;

  /**
   * Constructor.
   *
   * @param property the property that was assigned a value
   * @param value    the value
   */
  public InvalidPropertyValueException(Property property, Object value) {
    super(property, "Property '" + property + "' can't be assigned the value '" + value + "'!");
    this.value = value;
  }

  /**
   * Returns the value.
   *
   * @return the value
   */
  public Object getValue() {
    return value;
  }
}
