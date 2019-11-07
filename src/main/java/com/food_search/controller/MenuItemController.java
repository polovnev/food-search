package com.food_search.controller;

import com.food_search.dto.MenuItemDto;
import com.food_search.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuItemController {

    private MenuItemService menuItemService;

    public MenuItemController(@Autowired MenuItemService menuItemService) {
        this.menuItemService = menuItemService;
    }

    @GetMapping("/menu-item")
    public MenuItemDto getSlot() {
        return menuItemService.getSlot();
    }
}
