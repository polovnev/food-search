package com.food_search.service;

import com.food_search.dto.MenuItemDto;
import com.food_search.entity.Currency;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;

@Service
public class MenuItemService {

    public MenuItemDto getSlot() {
        MenuItemDto menuItemDto = new MenuItemDto();
        menuItemDto.setName("Пюре");
        menuItemDto.setItems(Arrays.asList("Картошка", "Молоко"));
        menuItemDto.setPrice(new BigDecimal(25));
        menuItemDto.setCurrency(Currency.UAH.getSymbol());
        return menuItemDto;
    }


}
