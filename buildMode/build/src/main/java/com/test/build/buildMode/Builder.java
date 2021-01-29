package com.test.build.buildMode;

import com.test.build.commoMode.celling.LevelOneCeiling;
import com.test.build.commoMode.celling.LevelTwoCeiling;
import com.test.build.commoMode.coat.DuluxCoat;
import com.test.build.commoMode.coat.LiBangCoat;
import com.test.build.commoMode.floor.ShengXiangFloor;
import com.test.build.commoMode.tile.DongPengTile;
import com.test.build.commoMode.tile.MarcoPoloTile;

public class Builder {

	public IMenu levelOne(Double area) {
		
		return new DecorationPackageMenu(area,"豪华欧式")
				.appendCeiling(new LevelTwoCeiling())
				.appendCoat(new DuluxCoat())
				.appendFloor(new ShengXiangFloor());
	}
	
	public IMenu levelTwo(Double area) {
		
		return new DecorationPackageMenu(area,"轻奢田园")
				.appendCeiling(new LevelTwoCeiling())
				.appendCoat(new LiBangCoat())
				.appendFloor(new MarcoPoloTile());
	}
	
	public IMenu levelThree(Double area) {
		
		return new DecorationPackageMenu(area,"现代简约")
				.appendCeiling(new LevelOneCeiling())
				.appendCoat(new LiBangCoat())
				.appendFloor(new DongPengTile());
	}
}
