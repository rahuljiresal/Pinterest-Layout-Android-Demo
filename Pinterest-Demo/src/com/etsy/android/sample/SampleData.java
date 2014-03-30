package com.etsy.android.sample;

import java.util.ArrayList;
import java.util.Random;

public class SampleData {

	public static final int SAMPLE_DATA_ITEM_COUNT = 10;

public static ArrayList<Data> generateSampleData() {
	String repeat = " repeat";
	final ArrayList<Data> datas = new ArrayList<Data>();
	for (int i = 0; i < SAMPLE_DATA_ITEM_COUNT; i++) {
		Data data = new Data();
		data.imageUrl = "https://jiresal-test.s3.amazonaws.com/deal3.png";
		data.title = "Pinterest Card";
		data.description = "Super awesome description";
		Random ran = new Random();
		int x = ran.nextInt(i + SAMPLE_DATA_ITEM_COUNT); 
		for (int j = 0; j < x; j++)
			data.description += repeat;
		datas.add(data);
	}
	return datas;
}

}
