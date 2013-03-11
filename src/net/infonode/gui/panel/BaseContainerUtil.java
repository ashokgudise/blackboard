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


// $Id: BaseContainerUtil.java,v 1.3 2011-09-07 19:56:10 mpue Exp $
package net.infonode.gui.panel;

import java.awt.Color;
import java.awt.Font;

public class BaseContainerUtil {

  public static void setForcedOpaque(BaseContainer c, boolean opaque) {
    c.setForcedOpaque(opaque);
  }

  public static void setOverridedBackground(BaseContainer c, Color color) {
    c.setOverridedBackground(color);
  }

  public static void setOverridedForeground(BaseContainer c, Color color) {
    c.setOverridedForeround(color);
  }

  public static void setOverridedFont(BaseContainer c, Font font) {
    c.setOverrideFont(font);
  }
}
