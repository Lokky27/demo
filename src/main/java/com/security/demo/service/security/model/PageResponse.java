package com.security.demo.service.security.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.Collection;

@Data
@AllArgsConstructor
@Builder
public class PageResponse <T> {
    private final Collection<T> data;
    private final long total;
    private final int pageSize;
    private final int pageNumber;

    public PageResponse(Page<T> page) {
        this(page.getContent(), page.getTotalElements(), page.getSize(), page.getNumber());
    }

    public PageResponse(PageResponse<?> pageResponse, Collection<T> data) {
        this(data, pageResponse.getTotal(),pageResponse.getPageSize(), pageResponse.getPageNumber());
    }



}
