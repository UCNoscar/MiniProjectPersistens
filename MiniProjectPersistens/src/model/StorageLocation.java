package model;

import java.util.LinkedList;
import java.util.List;

public class StorageLocation {
	private String name;
	private List<StorageLocationLine> SLLs;

	public StorageLocation(String name) {
		super();
		this.name = name;
		SLLs = new LinkedList<>();
	}

}
