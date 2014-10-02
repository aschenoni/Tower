package com.aschenoni.tower.model;



public class GridTile {
	private SpriteValues TileValue;
	
	//Instantiate a tile with a certain value
	GridTile(SpriteValues value) {
		TileValue = value;
	}
	
	GridTile() {
		TileValue = SpriteValues.NOVALUE;
	}
}
