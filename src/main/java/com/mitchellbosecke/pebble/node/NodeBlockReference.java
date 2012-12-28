/*******************************************************************************
 * This file is part of Pebble.
 * 
 * Copyright (c) 2012 Mitchell Bosecke.
 * 
 * This work is licensed under the Creative Commons Attribution-ShareAlike 3.0 
 * Unported License. To view a copy of this license, visit 
 * http://creativecommons.org/licenses/by-sa/3.0/
 ******************************************************************************/
package com.mitchellbosecke.pebble.node;

import com.mitchellbosecke.pebble.compiler.Compiler;

public class NodeBlockReference extends AbstractNode implements DisplayableNode{

	private final String name;

	public NodeBlockReference(int lineNumber, String name) {
		super(lineNumber);
		this.name = name;
	}

	@Override
	public void compile(Compiler compiler) {
		compiler.raw("\n").write(String.format(
				"block_%s(context);\n", this.name));
	}

}