# Mapa_de_Bits
En el siguiente programa se encarga de cargar una imagen BitMap y posteriormente hace un cambio de color a cada uno de los pixeles

# Clase Imagen_Pantalla

Primero creamos una pantalla con la clase JFrame donde se van a presentar las imagenes misma que tiene atributos los cuales son tamaño, titulo, visibilidad y posicion, a la pantalla le agregamos un panel donde iran los componentes.
![1](https://user-images.githubusercontent.com/71307223/132049544-97d3d961-5931-48d4-8fee-0de5e1d6d836.png)

# Clase Panel_Imagen

Posteriormente se creo una clase llamada Panel_Imagen misma que hereda metodos y atributos de la clase JPanel, esta clase es la encargada de manejar los componentes como los paneles para cada imagen y los botones ademas de declarar variables que posteriormente van a ser utilizadas
![image](https://user-images.githubusercontent.com/71307223/132052711-c4f76bea-8691-45b8-8a87-9e53a3c9f025.png)

El método recursos es el encargado de una unica tarea y es cargar la imagen original, la cual vamos a cambiar sus colores
![image](https://user-images.githubusercontent.com/71307223/132053212-31fb1ab9-5aa2-44df-b9c0-fa1af1d71706.png)

El método componentes es encargado de los componentes que se van a presentar en la ventana, dandole posicion y tamaño, ademas de añadirle al boton una accion al ser presionado y imprimir la imagen original
![image](https://user-images.githubusercontent.com/71307223/132053481-20dc20c0-d3c2-4738-8af2-2c51532f3365.png)

El método imprimir se encarga de imprimir la nueva imagen en un panel de la clase Panel_Nuevo
![image](https://user-images.githubusercontent.com/71307223/132053748-9bcded4e-6d02-4aa4-99ad-6d867d02b95a.png)

El método guardar es el encargado de guardar la imagen resultante en el ordenador, cambiando el numero de la imagen dependiendo de las veces que sea llamado
![image](https://user-images.githubusercontent.com/71307223/132053878-a32f63b8-3d73-4e49-96b4-0c9a08819469.png)
