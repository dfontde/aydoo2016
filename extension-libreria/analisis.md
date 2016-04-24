Analisis de las cuestiones relevantes para la implementacion de la nueva funcionalidad:

Clases: Producto - Libro

- Si bien utilizo Herencia (clase padre Producto, clase hija Libro), no utiliza Polimorfismo para calcular el precio. No obstante la manera en que calcula el monto a cobrar a un cliente en el mes me permitio utilizarlo para los alquileres.
- La clase producto no tiene descripcion. Es un atributo que tienen todos sus hijos. Podria haber sido parte de la super clase, particularmente de Libro.
- El parametro del constructor productoAsignaPrecio podria tener un nombre mas claro. Se le asigna al precio del producto.
- El atributo tieneSuscripcionAnual lo heredan hijos, en particular la clase Libro, que no tienen la posibilidad de tener suscripcion anual.

Clase Compra: 

- Tiene como atributos tanto Producto como Suscripcion, es reiterativo.
- Como no tiene una coleccion de productos, por cada producto nuevo debe instanciarse una compra.

Clase Kiosco:

- Nombres poco claros.
- Dos atributos sumarPrecio y precioTotal que no deberian ser atributos de la clase. Lo mismo que listaDeProductosDeClientes por lo siguiente. 
- En el atributo listaDeProductosDeClientes guarda importes y no productos de clientes, lo cual es confuso.
- En el atributo comprasMensuales guarda compras y clientes pero no los productos que compro. Para el calculo utiliza los importes guardados en listaDeProductosDeClientes.
- El metodo aplicoDescuentoAClientes tenia un error. Solo macheaba por mes en caso de ser una suscripcion anual.
- Con el metodo aplicoDescuentoAClientes recorre el mapa de compras y guarda en listaDeProductosDeClientes los importes que finalmente suma en el metodo precioFinalDelCliente. Este ultimo metodo solo itera y suma el monto final a retornar.

Test: 

- En general escuetos, no testean casos de borde.

Acciones tomadas:

1) Inclusion de archivo .gitignore.
2) Correccion del metodo aplicoDescuentoAClientes, macheaba siempre por cliente pero por mes solo en el caso de ser una suscripcion anual.
3) Escritura de AlquilerLibroTest esto llevo a:
- Nueva clase AlquilerLibro hija de Producto, la idea es sobreescribir el metodo obtenerPrecioDelProducto que utiliza el metodo 		aplicoDescuentoAClientes.
- Nueva clase TipoAlquiler.
- Sobreescritura del metodo obtenerPrecioDelProducto para que considere los alquileres.
- Inclusion de nuevos test en la clase LibreriaTest que es una clase para test de integracion para corroborrar que todo funcione.
4) Redisenio para que el codigo quede cerrado para modificar pero abierto para extender.
- Creacion de las clases AlquilerLibroDiario, AlquilerLibroMensual, AlquilerLibroCuatrimestral que implementan la interfaz AlquilerLibro obligando a sobreescribir el metodo obtenerPrecioDelProducto.

CONCLUSION: Buena, no tuve que tocar el codigo existente, solo extendi. Ademas en el proceso me di cuenta de como hacer que mi extension permita a su vez dejar un codigo cerrado pero extendible.




 



