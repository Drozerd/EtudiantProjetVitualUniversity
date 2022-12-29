package org.mycompany.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement (name="ListeCours")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListeCours {
	
	
	@XmlElement(name="Cours")
	private List<Cours> listeCours;

	public ListeCours() {
		super();
	}

	public ListeCours(List<Cours> listeCoursEtudiant) {
		super();
		this.listeCoursEtudiant = listeCoursEtudiant;
	}

	public List<Cours> getListeCoursEtudiant() {
		return listeCoursEtudiant;
	}

	public void setListeCoursEtudiant(List<Cours> listeCoursEtudiant) {
		this.listeCoursEtudiant = listeCoursEtudiant;
	}

	@Override
	public String toString() {
		return "ListeCours [listeCoursEtudiant=" + listeCoursEtudiant + "]";
	}

	
	
}