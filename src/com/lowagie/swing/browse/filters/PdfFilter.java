/*
 * $Id: PdfDocument.java 2884 2007-08-15 09:28:41Z blowagie $
 * Copyright (c) 2007 Bruno Lowagie
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lowagie.swing.browse.filters;

import java.io.File;

import javax.swing.filechooser.FileFilter;

/**
 * Filters PDF files in a JFileChooser.
 */
public class PdfFilter extends FileFilter {

	public static PdfFilter INSTANCE = new PdfFilter();
	
    /**
     *
     * @see javax.swing.filechooser.FileFilter#accept(java.io.File)
     * @param f File
     * @return boolean
     */
    public boolean accept(File f) {
		if (f.isDirectory()) return true;
		if (f.getName().toLowerCase().endsWith(".pdf")) return true;
		return false;
	}

    /**
     *
     * @see javax.swing.filechooser.FileFilter#getDescription()
     * @return String
     */
    public String getDescription() {
		return "*.pdf PDF files";
	}

}
