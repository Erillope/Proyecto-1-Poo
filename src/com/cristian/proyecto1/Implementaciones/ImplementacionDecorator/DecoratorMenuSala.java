package com.cristian.proyecto1.Implementaciones.ImplementacionDecorator;

import com.cristian.proyecto1.Implementaciones.ImplementacionFactory.MenuSala;

public class DecoratorMenuSala extends DecoratorMenu{
    public DecoratorMenuSala(MenuSala menu){super(menu);}

    @Override
    public void mostrarMenu(){
        wrappee.mostrarMenu();
    }
}
