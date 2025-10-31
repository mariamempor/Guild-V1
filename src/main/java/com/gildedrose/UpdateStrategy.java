package com.gildedrose;

/**
 * Interface para estratégias de atualização de itens.
 * Permite extensibilidade sem modificar código existente.
 */
public interface UpdateStrategy {
    void update(Item item);

    // Método default para validação comum
    default void validate(Item item) {
        if (item.quality < 0) item.quality = 0;
        if (item.quality > 50 && !item.name.equals(ItemNames.SULFURAS)) item.quality = 50;
    }
}