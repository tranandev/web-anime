package com.anime.service;

import java.util.List;

import com.anime.model.BlogModel;
import com.anime.paging.Pageble;

public interface IBlogService {

	List<BlogModel> findAll();

	List<BlogModel> findAll(Pageble pageble);
}
