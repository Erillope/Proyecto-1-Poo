package com.cristian.proyecto1.Implementaciones.ImplementacionDecorator;

import com.cristian.proyecto1.Implementaciones.ImplementacionFactory.MenuPelicula;

public class DecoratorMenuPelicula extends DecoratorMenu{
    public DecoratorMenuPelicula(MenuPelicula menu){super(menu);}

    @Override
    public void mostrarMenu(){
        wrappee.mostrarMenu();
    }
}
