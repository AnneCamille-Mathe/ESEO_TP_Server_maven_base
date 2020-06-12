package com.blo;

import java.util.ArrayList;

import com.dto.Ville;

public interface VilleBLO {
	public ArrayList<Ville> getInfoVille(String monParam);
	public void creerVille(Ville ville);
	public void mettreAJour(Ville ville);

}