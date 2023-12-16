package com.cristian.proyecto1.Implementaciones.ImplementacionFactory;

public class CreatorMenuSala extends CreatorMenu{
    @Override
    public Menu createMenu(){
        return new MenuSala();
    }
    
}
