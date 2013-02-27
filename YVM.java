

import java.io.OutputStream;

public class YVM {
	protected OutputStream o;

	public YVM(String nomFich) {
		o = Ecriture.ouvrir(nomFich+".yvm");
	}
	
	public YVM(String nomFich,String extention) {
		o = Ecriture.ouvrir(nomFich+extention);
	}

	public void entete() {
		Ecriture.ecrireStringln(o, "entete");
	}

	public void iadd() {
		Ecriture.ecrireStringln(o, "iadd");
	}

	public void isub() {
		Ecriture.ecrireStringln(o, "isub");
	}

	public void imul() {
		Ecriture.ecrireStringln(o, "imul");
	}

	public void idiv() {
		Ecriture.ecrireStringln(o, "idiv");
	}

	public void inot() {
		Ecriture.ecrireStringln(o, "inot");
	}

	public void ior() {
		Ecriture.ecrireStringln(o, "ior");
	}

	public void iand() {
		Ecriture.ecrireStringln(o, "iand");
	}

	public void ineg() {
		Ecriture.ecrireStringln(o, "ineg");
	}

	public void iinf() {
		Ecriture.ecrireStringln(o, "iinf");
	}

	public void isup() {
		Ecriture.ecrireStringln(o, "isup");
	}

	public void iinfegal() {
		Ecriture.ecrireStringln(o, "iinfegal");
	}

	public void isupegal() {
		Ecriture.ecrireStringln(o, "isupegal");
	}

	public void iegal() {
		Ecriture.ecrireStringln(o, "iegal");
	}

	public void idiff() {
		Ecriture.ecrireStringln(o, "idiff");
	}

	public void iload(int offset) {
		Ecriture.ecrireStringln(o, "iload " + offset);
	}

	public void istore(int offset) {
		Ecriture.ecrireStringln(o, "istore " + offset);
	}

	public void iconst(int valeur) {
		Ecriture.ecrireStringln(o, "iconst " + valeur);
	}

	public void ifeq(String etiquette) {
		Ecriture.ecrireStringln(o, "ifeq " + etiquette);
	}

	public void igoto(int etiquette) {
		Ecriture.ecrireStringln(o, "goto " + etiquette);
	}

	public void ouvrePrinc(int offset) {
		Ecriture.ecrireStringln(o, "ouvrePrinc " + offset);
	}

	public void queue() {
		Ecriture.ecrireStringln(o, "queue");
	}
	
	public void ecrireEnt() {
		Ecriture.ecrireStringln(o, "ecrireEnt");
	}
	
	public void ecrireChaine(String s) {
		Ecriture.ecrireStringln(o, "ecrireChaine \""+s+"\"");
	}
	
	public void ecrireBool() {
		Ecriture.ecrireStringln(o, "ecrireBool");
	}
	
	public void lireEnt(int offset) {
		Ecriture.ecrireStringln(o, "lireEnt "+offset);
	}
	
	public void aLaLigne(String s) {
		Ecriture.ecrireStringln(o, "aLaLigne");
	}

}
