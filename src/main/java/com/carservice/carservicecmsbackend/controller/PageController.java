package com.carservice.carservicecmsbackend.controller;

import com.carservice.carservicecmsbackend.dto.PageDetailsDto;
import com.carservice.carservicecmsbackend.dto.PageDto;
import com.carservice.carservicecmsbackend.service.PageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pages")
public class PageController {
    private final PageService pageService;

    public PageController(PageService pageService) {
        this.pageService = pageService;
    }

    @GetMapping
    public List<PageDto> getAllPages() {
        return pageService.getAllPages();
    }

    @GetMapping("/details")
    public List<PageDetailsDto> getAllPagesDetails() {
        return pageService.getAllPagesDetails();
    }

    @GetMapping("/visible")
    public List<PageDto> getAllVisiblePages() {
        return pageService.getAllVisiblePages();
    }

    @GetMapping("/visible/details")
    public List<PageDetailsDto> getAllVisiblePagesDetails() {
        return pageService.getAllVisiblePagesDetails();
    }

    @GetMapping("/{id}")
    public PageDto getPageById(@PathVariable Long id) {
        return pageService.getPageById(id);
    }

    @PostMapping
    public PageDto createPage(@RequestBody PageDto pageDto) {
        return pageService.savePage(pageDto);
    }
}
