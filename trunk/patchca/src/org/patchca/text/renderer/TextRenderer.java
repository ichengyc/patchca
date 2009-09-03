/*
 * Copyright (c) 2009 Piotr Piastucki
 * 
 * This file is part of Patcha CAPTCHA library.
 * 
 *  Patcha is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  Patcha is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *  
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with Patcha. If not, see <http://www.gnu.org/licenses/>.
 */
package org.patchca.text.renderer;

import java.awt.image.BufferedImage;

import org.patchca.color.ColorFactory;
import org.patchca.font.FontFactory;

public interface TextRenderer {

	void setLeftMargin(int leftMargin);

	void setRightMargin(int rightMargin);

	void setTopMargin(int topMargin);

	void setBottomMargin(int bottomMargin);

	void draw(String text, BufferedImage canvas, FontFactory fontFactory, ColorFactory colorFactory);

}