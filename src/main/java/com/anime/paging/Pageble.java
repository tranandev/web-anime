package com.anime.paging;

import com.anime.sort.Sorter;

public interface Pageble {
	
	Integer getPage();

	Integer getOffset();

	Integer getLimit();

	Sorter getSorter();
}
