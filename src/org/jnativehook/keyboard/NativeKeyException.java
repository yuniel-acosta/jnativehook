/* Copyright (c) 2006-2010 - Alexander Barker (alex@1stleg.com)
 *
 * JNativeHook is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jnativehook.keyboard;

//Imports

/**
 * Signals that a Native Key Exception has occurred.
 * 
 * @author	Alexander Barker (<a href="mailto:alex@1stleg.com">alex@1stleg.com</a>)
 * @version	1.0
 * @since	1.0
 * 
 * @see java.lang.Exception
 */
public class NativeKeyException extends Exception {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6239432803200521634L;

	/**
	 * Instantiates a new <code>NativeKeyException</code> with null as its 
	 * detail message.
	 */
	public NativeKeyException() {
		super();
	}
	
	/**
	 * Instantiates a new <code>NativeKeyException</code> with a specified 
	 * detail message.
	 *
	 * @param message the detail message
	 */
	public NativeKeyException(String message) {
		super(message);
	}
	
	/**
	 * Instantiates a new <code>NativeKeyException</code> with a specified 
	 * detail message and cause.
	 *
	 * @param message the detail message
	 * @param cause the cause of the exception (A null value is permitted, 
	 * and indicates that the cause is nonexistent or unknown.)
	 */
	public NativeKeyException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * Instantiates a new <code>NativeKeyException</code> with a specified 
	 * cause.
	 *
	 * @param cause the cause of the exception (A null value is permitted, 
	 * and indicates that the cause is nonexistent or unknown.)
	 */
	public NativeKeyException(Throwable cause) {
		super(cause);
	}
}
