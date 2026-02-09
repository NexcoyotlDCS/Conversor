<h1 align="center"> Proyecto </h1>
<h2 align="center"> Conversor de monedas </h2>
<img width="1550" height="491" alt="Diseño sin título" src="https://github.com/user-attachments/assets/79df60ce-0956-488d-932c-67cb4e9aa8ff" />

![Logotipo](https://img.shields.io/badge/github-repo-blue?logo=github)
![Badge en Desarollo](https://img.shields.io/badge/STATUS-Terminado-green)
![Version](https://img.shields.io/badge/Version-V1.0-blue)
![Static Badge](https://img.shields.io/badge/Release_date-February_2026-blue?style=flat&logo=googlecalendar&logoColor=green&color=blue&cacheSeconds=https%3A%2F%2Fwww.flaticon.es%2Ficono-gratis%2Fcalendario_2693507%3Fterm%3Dcalendario%26page%3D1%26position%3D8%26origin%3Dsearch%26related_id%3D2693507)

<h2 aling="center"> Descripción del Proyecto </h2>

Este proyecto utiliza Java y la biblioteca Gson para crear un conversor de monedas interactivo en consola. Permite convertir entre diferentes monedas (USD, ARS, MXN, BRL, COP) usando tasas de cambio actualizadas obtenidas desde la API pública ExchangeRate-API.

El usuario selecciona la conversión deseada, ingresa el monto y el sistema realiza la consulta a la API, almacena la respuesta en un archivo JSON y muestra el resultado de la conversión. El flujo es sencillo, seguro y rápido, ideal para quienes necesitan convertir valores entre monedas latinoamericanas y el dólar.

Características principales:
- Consulta de tasas de cambio en tiempo real.
- Conversión entre varias monedas (dólar, peso argentino, peso mexicano, real brasileño, peso colombiano).
- Almacenamiento local de las tasas en archivos JSON.
- Interfaz de consola amigable y fácil de usar.
- Manejo de errores para entradas inválidas o problemas de conexión.

## 🛠️ Funcionalidades del proyecto
- `Funcionalidad 1`: Conversión de monedas en tiempo real entre USD, ARS, MXN, BRL y COP usando tasas actualizadas desde una API pública.
- `Funcionalidad 2`: Almacenamiento local de tasas de cambio en archivos JSON para referencia rápida y persistencia temporal.
- `Funcionalidad 3`: Interfaz de consola interactiva para seleccionar monedas y monto a convertir.
- `Funcionalidad 4`: Manejo de errores para entradas inválidas y problemas de conexión a la API.

## 🚀 Cómo descargar y ejecutar el proyecto

1. **Clona el repositorio:**
	```bash
	git clone https://github.com/NexcoyotlDCS/Conversor.git
	```

2. **Abre el proyecto en tu IDE favorito** (por ejemplo, IntelliJ IDEA o VS Code).

3. **Asegúrate de tener Java instalado** (Java 17 recomendado).

4. **Compila los archivos fuente:**
	```bash
	javac -cp .:gson-2.8.9.jar src/*.java
	```
	> Asegúrate de tener la librería Gson en el mismo directorio o ajusta la ruta según corresponda.

5. **Ejecuta el programa principal:**
	```bash
	java -cp .:gson-2.8.9.jar src/Principal
	```

¡Listo! Ahora puedes utilizar el conversor de monedas desde la consola.

## 🧰 Tecnologías utilizadas

- Java 17
- API ExchangeRate-API
- Gson (Google) para manejo de JSON
- Consola/Terminal

<h2 align="center">Autor</h2>
<div align="center">
	<a href="https://github.com/NexcoyotlDCS">
		<img src="https://avatars.githubusercontent.com/u/125529664?v=4" width="115"><br>
		<sub>NexcoyotlDCS</sub>
	</a>
</div>