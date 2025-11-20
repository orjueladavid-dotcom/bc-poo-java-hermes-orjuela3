# Análisis Orientado a Objetos - Agencia de Viajes Corporativos "Travel Business"

## 1. Identificación del Dominio

**Nombre del negocio:** Travel Business  
**Tipo:** Agencia de viajes corporativos  
**Descripción:**  
La agencia *Travel Business* se dedica a organizar y gestionar viajes empresariales para compañías que envían a sus empleados a destinos nacionales e internacionales. Su objetivo es ofrecer comodidad, eficiencia y control sobre los costos de viaje, brindando soluciones personalizadas a cada cliente corporativo.

---

## 2. Objetos Identificados

### Objeto Principal: ViajeCorporativo
**¿Qué es?:**  
Representa un viaje contratado por una empresa cliente. Contiene la información esencial de cada desplazamiento, como destino, número de empleados y costos.

**Atributos identificados:**
- `codigoViaje`: String - Identificador único del viaje.
- `destino`: String - Lugar al que se dirigen los empleados.
- `empresaCliente`: String - Nombre de la empresa que contrata el viaje.
- `numeroEmpleados`: int - Cantidad de empleados incluidos en el viaje.
- `costoPorPersona`: double - Valor del viaje por cada empleado.
- `confirmado`: boolean - Indica si el viaje está confirmado o pendiente.

**Métodos identificados:**
- `mostrarInformacion()`: Muestra todos los datos del viaje en consola.
- `calcularCostoTotal()`: Calcula el costo total multiplicando el número de empleados por el costo por persona.
- `getCodigoViaje()`: Devuelve el código único del viaje.
- `setConfirmado(boolean)`: Permite confirmar o cancelar el viaje.

---

### Objeto Secundario: ClienteCorporativo
**¿Qué es?:**  
Representa a una empresa que contrata servicios de viajes. Contiene información sobre su identificación, contacto y el historial de viajes realizados.

**Atributos identificados:**
- `nitEmpresa`: String - Identificación tributaria de la empresa.
- `nombreEmpresa`: String - Nombre de la empresa cliente.
- `representante`: String - Persona encargada de gestionar los viajes.
- `correoContacto`: String - Correo para comunicación directa.
- `viajesContratados`: int - Número de viajes realizados con la agencia.

**Métodos identificados:**
- `mostrarInformacion()`: Muestra los datos completos del cliente.
- `registrarViaje()`: Incrementa el contador de viajes contratados por el cliente.
- `esClienteFrecuente()`: Determina si el cliente es considerado frecuente (5 o más viajes).

---

## 3. Relación entre Objetos

**Tipo de relación:** Asociación (1 a muchos)

**Descripción:**  
Cada *ClienteCorporativo* puede contratar múltiples *ViajeCorporativo*, ya que una empresa puede realizar varios viajes durante el año.  
Por otro lado, cada *ViajeCorporativo* está asociado a un solo cliente, identificado por el nombre de la empresa que lo contrata.

**Ejemplo:**  
“Un cliente corporativo puede tener múltiples viajes contratados. Cada viaje requiere conocer a qué empresa pertenece para generar la factura y la confirmación del servicio.”

---

## 4. Justificación del Diseño

**¿Por qué elegí estos objetos?**  
Se eligieron estos objetos porque representan las entidades principales del dominio: los clientes y los viajes que contratan. Ambos son esenciales para el funcionamiento de una agencia de viajes corporativos.

**¿Por qué estos atributos son importantes?**
- `codigoViaje` permite identificar de manera única cada viaje.
- `destino` y `empresaCliente` son datos básicos de la operación.
- `numeroEmpleados` y `costoPorPersona` permiten calcular costos totales.
- `confirmado` refleja el estado operativo del viaje.
- En el cliente, `nitEmpresa`, `nombreEmpresa`, `representante` y `correoContacto` son necesarios para la gestión administrativa y comunicación.
- `viajesContratados` es útil para determinar si la empresa es cliente frecuente.

**¿Por qué estos métodos son necesarios?**
- `mostrarInformacion()` permite visualizar los datos para control o reporte.
- `calcularCostoTotal()` automatiza un cálculo esencial del negocio.
- `registrarViaje()` y `esClienteFrecuente()` apoyan la lógica de fidelización de clientes.
- Los getters y setters mantienen el principio de encapsulamiento y control del estado de los objetos.

---

## 5. Comparación: POO vs Programación Estructurada

**Sin POO (Estructurado):**  
En un enfoque estructurado, el programa se escribiría con variables globales y funciones separadas. Por ejemplo, se tendría una función `calcularCosto(viaje)` que recibe muchos parámetros, lo que aumentaría la posibilidad de errores. No habría una estructura clara para representar los clientes ni los viajes, y el código sería difícil de mantener y escalar.

**Con POO:**  
Usando clases, se encapsulan los datos y comportamientos en objetos. Cada objeto *sabe* cómo realizar sus operaciones (mostrar, calcular, registrar). Esto facilita la reutilización del código, el mantenimiento y la expansión del sistema.

**Ventajas específicas en mi dominio:**
1. Organización del sistema en entidades reales (clientes y viajes).
2. Reutilización de código para crear nuevos tipos de viajes o clientes.
3. Facilidad para escalar el sistema (por ejemplo, agregar clases para facturación, itinerarios o reportes).

---

✅ **Conclusión:**  
El diseño orientado a objetos permitió modelar de manera clara y realista el funcionamiento de la agencia “Travel Business”, reflejando tanto la relación entre los clientes y sus viajes, como las operaciones más comunes del negocio.
