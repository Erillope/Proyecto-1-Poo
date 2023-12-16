package com.cristian.proyecto1.Implementaciones.ImplementacionDecorator;

import com.cristian.proyecto1.Implementaciones.ImplementacionFactory.MenuBoleto;

public class DecoratorMenuBoleto extends DecoratorMenu{
    public DecoratorMenuBoleto(MenuBoleto menu){super(menu);}

    @Override
    public void mostrarMenu(){
        wrappee.mostrarMenu();
    }
}
