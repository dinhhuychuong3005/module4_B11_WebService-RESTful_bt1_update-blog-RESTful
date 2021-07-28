package com.codegym.service.impl.blog;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService extends IGeneralService<Blog> {
    Iterable<Blog> findAllByCategory(Category category);

    Page<Blog> findAllByTitleContaining(String title,Pageable pageable);
}
