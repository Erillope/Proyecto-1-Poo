package com.cristian.proyecto1.Implementaciones.ImplementacionFactory;

public class CreatorMenuPelicula extends CreatorMenu{
    @Override
    public Menu createMenu(){
        return new MenuPelicula();
    }
}
