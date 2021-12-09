/* 
 * RouteType.java
 * Copyright (C) 2010 Kimmo Tuukkanen
 * 
 * This file is part of Java Marine API.
 * <http://ktuukkan.github.io/marine-api/>
 * 
 * Java Marine API is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Java Marine API is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Java Marine API. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.marineapi.nmea.util;

import net.sf.marineapi.nmea.parser.NoStatementValues;

/**
 * Defines the supported route types.
 * 
 * @author Kimmo Tuukkanen
 * @see net.sf.marineapi.nmea.sentence.RTESentence
 */
public enum RouteType {

	/**
	 * Active route: complete, all waypoints in route order.
	 */
	ACTIVE('c'),

	/**
	 * Working route: the waypoint you just left, the waypoint you're heading to
	 * and then all the rest.
	 */
	WORKING('w'),

	/**
	 * No data available for RouteType field.
	 */
	NONE(Character.MIN_VALUE);

	private final char chr;

	RouteType(char c) {
		chr = c;
	}

	/**
	 * Get the corresponding char indicator of enum.
	 * 
	 * @return Char
	 */
	public char toChar() {
		if (chr == Character.MIN_VALUE) {
			return NoStatementValues.charNoStatement;
		}
		return chr;
	}

	/**
	 * Get the char indicator corresponding to enum.
	 * 
	 * @param ch Char
	 * @return ReturnType corresponding to specified char.
	 */
	public RouteType valueOf(char ch) {
		for (RouteType type : values()) {
			if (type.toChar() == ch) {
				return type;
			}
		}
		return valueOf(String.valueOf(ch));
	}

}
