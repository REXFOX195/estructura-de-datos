package ColaDeClientes;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Carlos", "cabrera", 30, "Masculino", "Bolivia", "Gold");
        Cliente cliente2 = new Cliente("Stefanny", "Silva", 18, "Femenino", "Bolivia", "Silver");
        Cliente cliente3 = new Cliente("Samanta", "Valdez", 26, "Femenino", "Argentina", "Gold");
        Cliente cliente4 = new Cliente("Jose", "Peredes", 70, "Masculino", "Brazil", "Vip");
        Cliente cliente5 = new Cliente("Saul", "Mena", 35, "Masculino", "Salvador", "Vip");

        ColaDeClientes colaA = new ColaDeClientes(5);

        colaA.insertar(cliente1);
        colaA.insertar(cliente2);
        colaA.insertar(cliente3);
        colaA.insertar(cliente4);
        colaA.insertar(cliente5);

        //pregunta 12
        //colaA.mostrar();
        //pregunta 13
        //cambio_de_clase(colaA,"Bolivia","Gold");
        //pregunta 14
        //mover_edad_mayor(colaA,60);

        //parte de la pregunta 15

        Cliente cliente6 = new Cliente("Rodrigo", "Cevallos", 40, "Masculino", "Peru", "Silver");
        Cliente cliente7 = new Cliente("Daniel", "Condori", 22, "Masculino", "Bolivia", "Gold");
        Cliente cliente8 = new Cliente("Mireya", "Apaza", 24, "Femenino", "Ecuador", "Vip");
        Cliente cliente9 = new Cliente("Elizabeth", "Gomez", 65, "Femenino", "Bolivia", "Vip");
        Cliente cliente10 = new Cliente("Silverio", "Sanchez", 33, "Masculino", "Argentina", "Gold");

        ColaDeClientes colaB = new ColaDeClientes(5);

        colaB.insertar(cliente6);
        colaB.insertar(cliente7);
        colaB.insertar(cliente8);
        colaB.insertar(cliente9);
        colaB.insertar(cliente10);

       // pregunta 15
       //mover_cliente(colaA,colaB);

    }

    //13.Promoción para usuarios de Bolivia.
    // En el mes de diciembre a todos los clientes de Bolivia se les dará una promoción
    // en cuanto a precios en viajes a nivel nacional.
    // A todos los clientes que sean de nacionalidad boliviana y además el tipo
    //de cliente GOLD, convertir a estos clientes en VIP
    //Es decir si es de Bolivia y es GOLD deberá ser ahora un cliente VIP
    // El método estático dentro de la clase MAIN recibe 3 atributos
    // La cola de clientes
    //El tipo de cliente
    //La nacionalidad del cliente.

    public static void cambio_de_clase(ColaDeClientes colaCli, String nacionalidad, String tipoCliente) {
        ColaDeClientes colaAux = new ColaDeClientes(100);
        while (!colaCli.esVacio()) {
            Cliente c = colaCli.eliminar();
            if (c.getPais().equals(nacionalidad) && c.getTipo().equals(tipoCliente)) {
                c.setTipo("VIP");
                colaAux.insertar(c);
            } else {
                colaAux.insertar(c);
            }
        }
        while (!colaAux.esVacio()) {
            colaCli.insertar(colaAux.eliminar());
        }
        colaCli.mostrar();
    }
    //14.Moviendo clientes en la cola.
    //Mover al inicio todos los clientes mayores a 60 años.
    //Es decir si el cliente es mayor a 60 deberá de moverlo al inicio de la cola.
    //El método recibe 2 parámetros
    //La Cola de Clientes
    //El valor(int) de la edad.

    public static void mover_edad_mayor(ColaDeClientes colaCli, int edad) {
        ColaDeClientes colaAux = new ColaDeClientes(100);
        ColaDeClientes colaAux2 = new ColaDeClientes(100);
        while (!colaCli.esVacio()) {
            Cliente c = colaCli.eliminar();
            if (c.getEdad() > edad) {
                colaAux.insertar(c);
            } else {
                colaAux2.insertar(c);
            }
        }
        while (!colaAux.esVacio()) {
            colaCli.insertar(colaAux.eliminar());
        }
        while (!colaAux2.esVacio()) {
            colaCli.insertar(colaAux2.eliminar());
        }
        colaCli.mostrar();
    }
    //15..Moviendo clientes entre 2 colas
    // Por razones de promociones de vuelo, es necesario cambiar de vuelo a ciertos
    //clientes.
    //Crear 2 colas con 5 clientes.
    //Todos los clientes cuyo nombre sea Saul deberán ser agregados a la
    //cola B al inicio.

    public static void mover_cliente(ColaDeClientes colaCli, ColaDeClientes colaCli2) {
        ColaDeClientes colaAux = new ColaDeClientes(100);
        ColaDeClientes colaAux2 = new ColaDeClientes(100);
        while (!colaCli.esVacio()) {
            Cliente c = colaCli.eliminar();
            if (c.getNombres().equals("Saul")) {
                colaAux.insertar(c);
            } else {
                colaAux2.insertar(c);
            }
        }
        while (!colaAux.esVacio()) {
            colaCli.insertar(colaAux.eliminar());
        }
        while (!colaAux2.esVacio()) {
            colaCli.insertar(colaAux2.eliminar());
        }
        colaCli.mostrar();
    }



}
