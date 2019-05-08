package com.xml;


import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXmlFileDemo {

   public static void main(String argv[]) {

		
	   
	   
		  try { 
		  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); DocumentBuilder dBuilder =
		  dbFactory.newDocumentBuilder(); Document doc = dBuilder.newDocument();
		  
		  // root element 
		  Element rootElement = doc.createElement("cars");
		  doc.appendChild(rootElement);
		  
		  // supercars element 
		  Element supercar = doc.createElement("supercars");
		  rootElement.appendChild(supercar);
		  
		  // setting attribute to element 
		  Attr attr = doc.createAttribute("company");
		  attr.setValue("Ferrari"); supercar.setAttributeNode(attr);
		  
		  // carname element 
		  Element carname = doc.createElement("carname"); Attr
		  attrType = doc.createAttribute("type"); attrType.setValue("formula one");
		  carname.setAttributeNode(attrType);
		  carname.appendChild(doc.createTextNode("Ferrari 101"));
		  supercar.appendChild(carname);
		  
		  Element carname1 = doc.createElement("carname"); Attr attrType1 =
		  doc.createAttribute("type"); attrType1.setValue("sports");
		  carname1.setAttributeNode(attrType1);
		  carname1.appendChild(doc.createTextNode("Ferrari 202"));
		  supercar.appendChild(carname1);
		  
		  // write the content into xml file 
		  TransformerFactory transformerFactory =
		  TransformerFactory.newInstance(); 
		  Transformer transformer = transformerFactory.newTransformer();
		  DOMSource source = new DOMSource(doc);
		  StreamResult result = new StreamResult(new File("D:\\cars.xml"));
		  transformer.transform(source, result);
		  
		  // Output to console for testing 
		  StreamResult consoleResult = new
		  StreamResult(System.out); transformer.transform(source, consoleResult); 
		  }
		  catch (Exception e) { e.printStackTrace(); }
		 
	   
		/*
		 * DocumentBuilderFactory documentBuilderFactory =
		 * DocumentBuilderFactory.newInstance(); try { DocumentBuilder documentBuilder =
		 * documentBuilderFactory.newDocumentBuilder(); Document document =
		 * documentBuilder.newDocument();
		 * 
		 * //defining root tag element Element rootElement =
		 * document.createElement("cars"); document.appendChild(rootElement);
		 * 
		 * //Creating subTag called supercars. Element supercars =
		 * document.createElement("supercars"); rootElement.appendChild(supercars);
		 * 
		 * Attr supercarAtt = document.createAttribute("Co.");
		 * supercarAtt.setValue("Ferrari"); supercars.setAttributeNode(supercarAtt);
		 * 
		 * Element carName = document .createElement("carName");
		 * supercars.appendChild(carName);
		 * 
		 * 
		 * Attr carType = document.createAttribute("type");
		 * carType.setValue("formula one"); carName.setAttributeNode(carType);
		 * carName.appendChild(document.createTextNode("Ferrari 101"));
		 * carName.setAttributeNode(carType);
		 * 
		 * 
		 * DOMSource source = new DOMSource(document); StreamResult streamResult = new
		 * StreamResult(System.out);
		 * 
		 * TransformerFactory transformerFactory = TransformerFactory.newInstance();
		 * Transformer transformer = transformerFactory.newTransformer();
		 * 
		 * transformer.transform(source, streamResult);
		 * 
		 * } catch (ParserConfigurationException e) { e.printStackTrace(); } catch
		 * (TransformerException e) { e.printStackTrace(); }
		 */
	   
	   
	   
	   
   }
}
