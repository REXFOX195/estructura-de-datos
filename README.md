<h1 align="center"> PORTAFOLIO ESTRUCTURA DE DATOS  </h1>

<img align="right" src="https://i.ytimg.com/vi/jVQy1QzgnwM/maxresdefault.jpg" height="400" width="1000">


<h1 align="center"> PORTAFOLIO</h1>

![snake gif](https://acegif.com/wp-content/uploads/2022/07/pac-man-ghosts-title.gif)


## ➤ HITO 3 
## ➤ FUNCTIONS
- 📝 Repositorio del  [Hito 3](https://github.com/REXFOX195/estructura-de-datos/tree/master/hito%203)
### [LABORATORIOS](https://github.com/REXFOX195/estructura-de-datos/tree/master/hito%203/laborat)
### [EVALUACION PROCESUAL](https://github.com/REXFOX195/estructura-de-datos/tree/master/hito%203/procesual) 

## ➤ Code SQL 

```javascript
public class PilaNumeros {
    private int max;
    private int[] PilaNums;
    private int tope;

    //----------------------------------------------
    public PilaNumeros(int max)
    {
        this.tope = 0;
        this.max = max;
        PilaNums = new int[this.max +1];
    }

    //------------------------------------------------
//Metodos
    public boolean esVacio()
    {
        if(tope == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean esllena()
    {
        if(tope == max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int nroElementos()
    {
        return this.tope;
    }

    public void adicionar(int nuevoItem)
    {
        if (this.esllena() == false)
        {
            this.tope = this.tope +1;
            this.PilaNums[this.tope] = nuevoItem;

        }
        else
        {
            System.out.println("La pila de los numeros esta llena.");
        }

    }

    public int eliminar()
    {

        int elementosEliminados = 0;

        if (this.esllena() == false)
        {
            elementosEliminados = this.PilaNums[this.tope];
            this.tope = this.tope -1;
        }
        else
        {
            System.out.println("No se puede eliminar una pila vacia.");
        }
        return elementosEliminados;
    }

    public void llenar()
    {


    }

    public void mostrar()
    {
        int elem;
        if(esVacio())
            System.out.println("Pila vacia");
        else{
            System.out.println("\n Datos de la Pila");
            PilaNumeros aux = new PilaNumeros(10);
            while (!esVacio())
            {
                elem = eliminar();
                aux.adicionar(elem);
                System.out.println("Elemento: "+ elem);
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaNumeros a)
    {
        while (!a.esVacio())
            adicionar(a.eliminar());
    }
}
```



## ➤ HITO 4  
##  MANEJOS DE ESTRUCTURAS DE CONTROL
- 📝 Repositorio del  [Hito 4](https://github.com/REXFOX195/estructura-de-datos/tree/master/hito%204)
### [LABORATORIOS](https://github.com/REXFOX195/estructura-de-datos/tree/master/hito%204/laboratorios)
### [PROCESUAL](https://github.com/REXFOX195/estructura-de-datos/tree/master/hito%204/procesual) 

## ➤ Code   
```javascript
package ManejoDeColasHito4.ColaNumeros;

public class Numeros {
    private int max;
    private int fin;
    private int ini;
    private int cNum[];

    public Numeros(int max){
        this.max = max;
        this.cNum= new int[this.max+1];
        this.ini = 0;
        this.fin = 0;
    }

    public boolean esVacio(){
        if(this.ini==0 && this.fin==0){
            return true;
        }else {
            return false;
        }
    }

    public boolean esLleno(){
        if(this.fin==this.max){
            return true;
        }else {
            return false;
        }
    }

    public int nroElementos(){
        return fin-ini;
    }

    public void insertar(int elemento){
        if(!esLleno()){
            fin++;
            cNum[fin]=elemento;
        }else{
            System.out.println("La cola esta llena");
        }
    }
    // inicio = 0        1,2,3,4,5              final=5

    public int eliminar(){
        int elemento=0;
        if(!esVacio()){
            ini++;
            elemento=cNum[ini];
            if (ini==fin){
                ini=0;
                fin=0;
            }
        }else{
            System.out.println("La cola esta vacia");
        }
        return elemento;
    }

    public void mostrar(){
        if(esVacio()){
            System.out.println("La cola esta vacia");
        }else{
            int elementoEliminado=0;
            System.out.println("Mostrando datos de la cola");
            Numeros aux= new Numeros(this.max);
            while(!esVacio()){
                elementoEliminado=eliminar();
                System.out.println("valor: " + elementoEliminado);
                aux.insertar(elementoEliminado);
            }
            vaciar(aux);
        }
    }

    public void vaciar(Numeros aux) {
        int elementoEliminado=0;
        while(!aux.esVacio()){
            elementoEliminado=aux.eliminar();
            insertar(elementoEliminado);
        }
    }

}
```
## ➤ HITO 5  
##  MANEJOS DE ESTRUCTURAS DE CONTROL
- 📝 Repositorio del  [Hito 5](https://github.com/REXFOX195/estructura-de-datos/tree/master/hito%205)

## ➤ Code   
```javascript
import 'package:flutter/material.dart';
import 'package:flutter_memory_game/constants.dart';
import 'package:flutter_memory_game/pages/nivel_page.dart';
import 'package:flutter_memory_game/theme.dart';
import 'package:flutter_memory_game/widgets/logo.dart';
import 'package:flutter_memory_game/widgets/recordes.dart';
import 'package:flutter_memory_game/widgets/start_button.dart';

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);

  selecionarNivel(Modo modo, BuildContext context) async { //async es necesario para usar await
    await Navigator.push( //Navigator es un widget que administra una pila de rutas
      // y proporciona métodos para gestionar la pila, como Navigator.push y Navigator.pop.
      // Navigator.push es un método que se usa para navegar a una nueva ruta y esperar a que se complete.
      //Navigator.pop es un método que se usa para volver a la ruta anterior.
      context,
      MaterialPageRoute( //MaterialPageRoute es una clase que implementa la transición de una página a otra.
        builder: (context) => NivelPage(modo: modo), //builder es un método que se usa para construir una nueva ruta.
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold( //Scaffold es un widget que implementa la estructura visual básica de Material Design.
      body: Padding( //Padding es un widget que inserta un borde alrededor.
        padding: const EdgeInsets.all(24.0), //EdgeInsets es un widget que representa los bordes de un rectángulo.
        child: Column( //Column es un widget que implementa una columna vertical.
          mainAxisAlignment: MainAxisAlignment.center, //alinea sus objetos en el eje principal
          crossAxisAlignment: CrossAxisAlignment.center, // alinea sus objetos en el eje transversal
          children: [ //children es una lista de widgets
            const Logo(), //Logo es un widget que muestra el logo de la app
            StartButton( //StartButton es un widget que muestra un botón de inicio
              title: 'Modo Normal', //title es el titulo del boton
              color: Colors.white, //color es el color del boton
              action: () => selecionarNivel(Modo.normal, context), //action es la accion que se ejecuta al presionar el boton
            ),
            StartButton(
              title: 'Modo Insano',
              color: ShitpostThemeColor.color, //color es el color del boton
              action: () => selecionarNivel(Modo.dificil, context), //action es la accion que se ejecuta al presionar el boton
            ),
            const SizedBox(height: 60), //SizedBox le da un tamaño fijo
            const Recordes(), //Recordes es un widget que muestra los recordes
          ],
        ),
      ),
    );
  }
}
```
<h2 align='center'> Thank you⭐ </h2>
<br>
<p align='center'>
<img src="https://media.giphy.com/media/O51MQ3DduOcGW6ofR3/giphy.gif" width="200" height="200" frameBorder="0" class="giphy-embed" allowFullScreen></img></p>
<br>
