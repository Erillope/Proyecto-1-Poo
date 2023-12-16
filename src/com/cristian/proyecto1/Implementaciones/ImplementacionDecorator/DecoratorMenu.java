package com.cristian.proyecto1.Implementaciones.ImplementacionDecorator;

import com.cristian.proyecto1.Implementaciones.ImplementacionFactory.Menu;

public class DecoratorMenu implements Menu{
    Menu wrappee;

    public DecoratorMenu(Menu menu){wrappee = menu;}

    @Override
    public void mostrarMenu(){
        wrappee.mostrarMenu();
    }
}
