
# Proyecto: Contenido Audiovisual

Este proyecto consiste en un sistema de gestión de contenidos audiovisuales que maneja información sobre **Películas**, **Series de TV**, **Documentales**, **Actores**, **Temporadas** e **Investigadores**. El sistema implementa **principios de código limpio**, el patrón de diseño **MVC**, y sigue los **principios SOLID**. Además, se incluye la funcionalidad de **manejo de archivos CSV** para almacenar y leer datos.

## Descripción del Proyecto

El sistema permite al usuario gestionar información sobre contenidos audiovisuales, agregar nuevos contenidos, visualizar detalles y persistir la información en archivos. El proyecto está diseñado para ser fácil de mantener y extender, siguiendo las mejores prácticas de programación y asegurando una alta calidad de código mediante pruebas unitarias.

## Funcionalidades Implementadas

1. **Manejo de Archivos**:
   - Lectura y escritura de archivos CSV para guardar y cargar datos de **Películas**, **Series de TV**, **Documentales**, **Actores**, **Temporadas** e **Investigadores**.
   
2. **Principios de Código Limpio**:
   - Nombres claros, métodos pequeños y eliminación de código duplicado.
   - Comentarios solo cuando son necesarios y útiles.

3. **Principios SOLID**:
   - **SRP (Principio de Responsabilidad Única)**: Cada clase tiene una responsabilidad única.
   - **OCP (Principio de Abierto/Cerrado)**: El sistema está diseñado para ser extendido sin modificar el código existente.
   - **LSP (Principio de Sustitución de Liskov)**: Las subclases pueden sustituir a sus clases base sin afectar la funcionalidad del sistema.
   - **ISP (Principio de Segregación de Interfaces)**: Interfaces pequeñas y específicas.
   - **DIP (Principio de Inversión de Dependencias)**: Uso de abstracciones en lugar de implementaciones concretas.

4. **Patrón de Diseño MVC**:
   - **Modelo**: Las clases que representan los datos de los contenidos audiovisuales.
   - **Vista**: Interfaz de usuario en consola.
   - **Controlador**: Lógica que conecta el modelo y la vista.

5. **Pruebas Unitarias**:
   - Pruebas con **JUnit** para asegurar la calidad y fiabilidad del código.

## Estructura del Código

El proyecto está organizado en las siguientes carpetas y clases principales:

- **`src/`**: Contiene el código fuente del proyecto.
  - **`ContenidoAudiovisual.java`**: Representa el contenido general (películas, series, etc.).
  - **`Pelicula.java`**: Representa una película con su nombre, género y año.
  - **`Serie.java`**: Representa una serie de TV con nombre y número de temporadas.
  - **`ArchivoUtil.java`**: Proporciona métodos para leer y escribir datos en archivos CSV.
  - **`Modelo/`**: Contiene las clases relacionadas con el modelo de negocio.
  - **`Vista/`**: Contiene las clases que implementan la interfaz de usuario en consola.
  - **`Controlador/`**: Contiene las clases que gestionan la lógica del sistema.

- **`test/`**: Contiene las pruebas unitarias.
  - **`PeliculaTest.java`**: Pruebas unitarias para la clase `Pelicula`.
  - **`GestorDeArchivosTest.java`**: Pruebas unitarias para el manejo de archivos CSV.

- **`README.md`**: Este archivo, que documenta el proyecto.

## Diagrama de Clases

A continuación se muestra el diagrama de clases actualizado para representar las relaciones entre las principales entidades del sistema:

[![Captura-de-pantalla-2024-12-01-000742.png](https://i.postimg.cc/JhfLDzPG/Captura-de-pantalla-2024-12-01-000742.png)](https://postimg.cc/wtQPngKp)



## Cómo Clonar el Proyecto

Para clonar este repositorio en tu máquina local, puedes usar el siguiente comando:

```bash
git clone https://github.com/tu-usuario/nombre-del-repositorio.git

