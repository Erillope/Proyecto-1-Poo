package com.cristian.proyecto1.Implementaciones.ImplementacionFactory;

public class CreatorMenuBoleto extends CreatorMenu{
    @Override
    public Menu createMenu(){
        return new MenuBoleto();
    }
}
