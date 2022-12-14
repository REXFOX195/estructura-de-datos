<h1 align="center"> PORTAFOLIO ESTRUCTURA DE DATOS  </h1>

<img align="right" src="https://www.cloudsigma.com/wp-content/uploads/Feature-MariaDB-MySQL-Auto-%D0%A1lustering-with-Load-Balancing-and-Replication-for-High-Availability-and-Performance-1163x590.jpg" height="400" width="1000">


<h1 align="center"> PORTAFOLIO</h1>

![snake gif](https://raw.githubusercontent.com/avinash-218/avinash-218/output/github-contribution-grid-snake.svg)


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
<h2 align='center'> Thank you⭐ </h2>
<br>
<p align='center'>
<img src="https://media.giphy.com/media/O51MQ3DduOcGW6ofR3/giphy.gif" width="200" height="200" frameBorder="0" class="giphy-embed" allowFullScreen></img></p>
<br>
