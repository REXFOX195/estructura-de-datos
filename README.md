<h1 align="center"> ESTRUCTURA DE DATOS</h1>
<h1 align="center"> PORTAFOLIO</h1>

➤ enlace de repositorio: **[hito 3](https://github.com/REXFOX195/bhttps://github.com/REXFOX195/estructura-de-datos/tree/master/hito%203/procesual)**
```javascript
ejemplo
package pilaclientes;

    public class Main
    {
        public static void main(String[] args) {
            Cliente cliente1 = new Cliente("MIGUEL", "RAMIREZ", "HORIZONTES", 20, "Masculino");
            Cliente cliente2 = new Cliente("SECILIA", "CONDORI", "12 DE OCTUBRE", 23, "Femenino");
            Cliente cliente3 = new Cliente("FABIO", "MENA", "SATELITE", 34, "Masculino");
            Cliente cliente4 = new Cliente("PAMELA", "PLATA", "SANTA ROSA", 45, "Femenino");
            Cliente cliente5 = new Cliente("LUIS", "SANDOVAL", "RIO SECO", 19, "Masculino");


            PilaCliente pila = new PilaCliente(5);
            pila.insertar(cliente1);
            pila.insertar(cliente2);
            pila.insertar(cliente3);
            pila.insertar(cliente4);
            pila.insertar(cliente5);
            //pila.mostrar();
            //mayoresCiertaEdad(pila,20);
            //moverKesimo(pila,cliente2);
            //asignarDireccion(pila,"Ceja");
            mayoresCiertaEdad(pila,20);
        }
Determinar cuántos CLIENTES son mayores de 20 años
public static void mayoresCiertaEdad(PilaCliente pila, int edadMayor){
            int contador = 0;
            Cliente elem = null;
            if(pila.estaVacia()){
                System.out.println("La pila esta vacia");
            } else {
                while(!pila.estaVacia()){
                    elem = pila.eliminar();
                    if(elem.getEdad() > edadMayor){
                        contador++;
                    }
                }
            }
            System.out.println("La cantidad de clientes con mas de " + edadMayor +" son: " + contador);
        }


```







---
<img align='right' src='https://user-images.githubusercontent.com/5713670/87202985-820dcb80-c2b6-11ea-9f56-7ec461c497c3.gif' width='200"'>

- 🔭 docente LIC. WILLIAM BARRA**
- 🌱 MATERIA BASE DE DATOS II**
- 👯 UNIVERSIDAD UNIFRANZ
