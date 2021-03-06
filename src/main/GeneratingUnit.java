package main;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class GeneratingUnit {

	private String rdfID;
	private String name;
	private String maxP;
	private String minP;
	private String equipmentContainer_rdfID;

	// --------Return rdfID------//
	public String rdfID(Node node) {
		search(node);
		return rdfID;
	}

	// --------Return name-------//
	public String name(Node node) {
		search(node);
		return name;
	}

	// --------Return maxP-------//
	public String maxP(Node node) {
		search(node);
		return maxP;
	}
	
	// --------Return minP-------//
	public String minP(Node node) {
		search(node);
		return minP;
	}
	
	// -Return equipmentContainer_rdfID- //
	public String equipmentContainer_rdfID(Node node) {
		search(node);
		return equipmentContainer_rdfID;
	}
	

	// ---Load text of node------//
	public Element search(Node node) {
		Element element = (Element) node;
		this.rdfID = element.getAttribute("rdf:ID");
		this.name = element.getElementsByTagName("cim:IdentifiedObject.name").item(0).getTextContent();
		this.maxP = element.getElementsByTagName("cim:GeneratingUnit.maxOperatingP").item(0).getTextContent();
		this.minP = element.getElementsByTagName("cim:GeneratingUnit.minOperatingP").item(0).getTextContent();
		this.equipmentContainer_rdfID = element.getElementsByTagName("cim:Equipment.EquipmentContainer").item(0).getAttributes().item(0).getTextContent();
		// System.out.println("rdfID: " + rdfID + "\n" + "objectName: " + name + "\n" +
		// "region_rdf:ID: " + region_rdfID + "\n");
		return element;
	}

}

