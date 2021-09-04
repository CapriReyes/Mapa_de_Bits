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

# Clase Mapa_Panel

Esta clase es encargada de manejar la imagen original  

![image](https://user-images.githubusercontent.com/71307223/132054358-62f6bff6-ebf3-430c-bed6-4f6f10d73666.png)

El Método coloca_imagen es la encargada de inicializar la imagen para uso de esta clase, ademas de inicializar un arreglo para guardar los datos de los colores

![image](https://user-images.githubusercontent.com/71307223/132054436-6fdd1b59-2dd2-462f-b246-2bbacc493300.png)

En el método guardarColores se hace uso de dos bucles for para recorrer cada pixel de la imagen para conseguir el color que la compone y posteriormente conseguir sus valores en el modelo de colores RGB los cuales son RED, GREEN, BLUE

![image](https://user-images.githubusercontent.com/71307223/132054678-72e4dc25-f85c-4cbc-aadb-bf8e81f609ab.png)

Para dibujar la imagen hacemos uso del método paintComponent donde se imprime cada uno de los pixeles en forma de rectangulos que al final hace la imagen original                  
![image](https://user-images.githubusercontent.com/71307223/132055533-713f6763-3368-430f-a0c7-e82dacb87025.png)

# Clase Panel_Nuevo

La clase Panel_Nuevo es la encargada de manejar cada una de las imagenes que se generen asi como de cambiar sus colores, a esta clase en el constructor se le pasa como parametros la imagen y el arreglos de colores

![image](https://user-images.githubusercontent.com/71307223/132055881-f810907c-d568-43a2-889b-e262a92dfbb5.png)

El método cambioColor como su nombre lo indica en la encargada de realizar el cambio de color de cada pixel de la siguiente manera
1.-conseguir una color auxiliar de manera random para usar cuando el pixel es gris 
2.-Dentro de un for anidado se verifica cuatro variantes 
2.1.-Si es negro se convierte a blanco
2.2.-Si es blanco pasa a negro
2.3.-Si es gris toma el color auxiliar
2.4.-Si no se cumple ninguna de las anteriores se intercabian los valores RGB a GBR 
2.-Se le coloca el nuevo color al pixel

![image](https://user-images.githubusercontent.com/71307223/132056079-4c99542b-d8ba-4c65-bf76-92bb9b1d9bbc.png)
![image](https://user-images.githubusercontent.com/71307223/132056138-d772dfc2-0b7d-48b4-ba48-6b5acc3766e8.png)

Para dibujar la imagen hacemos uso del método paintComponent donde se imprime cada uno de los pixeles en forma de rectangulos que al final hace la imagen resultante

![image](https://user-images.githubusercontent.com/71307223/132056637-0f76a7d7-5dbe-46f0-a6be-be5ce8e5478e.png)

#Resultados

Ventana al iniciar el programa

![image](https://user-images.githubusercontent.com/71307223/132101210-f2b56862-67de-46f8-a37b-adab0345d53c.png)

Carpeta al inicio

![image](https://user-images.githubusercontent.com/71307223/132101232-be7f5fcf-d3ab-4a4c-95d8-4ce844067733.png)

Imagen al presionar el boton

![image](https://user-images.githubusercontent.com/71307223/132101265-152f5f13-fa6c-4cb6-91b4-3ce72da0064e.png)

Imagenes Resultantes

![image](https://user-images.githubusercontent.com/71307223/132101362-99791b5b-91b2-4eda-8d19-8089c52794ce.png)
