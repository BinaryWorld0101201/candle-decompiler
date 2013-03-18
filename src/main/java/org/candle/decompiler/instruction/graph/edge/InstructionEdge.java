package org.candle.decompiler.instruction.graph.edge;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.graph.DefaultEdge;

public class InstructionEdge extends DefaultEdge {

	protected EdgeType type;
	protected final Map<String, Object> attributes;
	
	public InstructionEdge() {
		attributes = new HashMap<String, Object>();
	}
	
	public Map<String, Object> getAttributes() {
		return attributes;
	}
	
	public EdgeType getType() {
		return type;
	}
	
	public void setType(EdgeType type) {
		this.type = type;
	}
	
	public Object getSource() {
		return super.getSource();
	}
	
	public Object getTarget() {
		return super.getTarget();
	}
	
}
