# Actividad 07 Entornos de Desarollo
----------------------------------------------------------------------------------------------------------------------------
## Actividad 1: Sistema de Gestión de un Centro Deportivo (Casos de Uso y Actividades)

**Contexto**: Un centro deportivo quiere digitalizar su reserva de pistas de pádel y clases dirigidas.
#### **Parte A (Casos de Uso):**
- Los Socios pueden identificarse, reservar una pista y apuntarse a clases.
- Para reservar una pista, el sistema siempre debe verificar si el socio tiene pagos pendientes
(**include**).
Al apuntarse a una clase, el socio puede, si quiere, contratar un seguro de lesiones opcional
(**extend**).
- El **Administrador** puede dar de alta nuevas clases y gestionar los pagos de los socios.
- Tarea: Dibuja el diagrama de casos de uso incluyendo actores, relaciones de inclusión, extensión
y herencia si fuera necesario.
#### **Parte B (Actividades):**
- Dibuja el diagrama de actividades del proceso "Reservar una pista".
- El proceso comienza con el socio eligiendo fecha y hora. El sistema comprueba disponibilidad. Si
no hay pista, el socio puede elegir otra fecha o salir. Si hay pista, se comprueba si tiene pagos
pendientes. Si debe dinero, se le deniega la reserva; si está al día, se confirma la reserva y se le
envía un email de confirmación.
----------------------------------------------------------------------------------------------------------------------------

## Actividad 2: Máquina Expendedora de Billetes de Metro (Actividades y Estados)
**Contexto**: Vamos a modelar la lógica de una máquina automática donde el comportamiento depende mucho
del estado del objeto "Billete" y de la lógica del proceso.
#### **Parte A (Actividades):**
- Representa el flujo de "Comprar Billete". El usuario selecciona destino, el sistema calcula el
precio. El usuario introduce monedas o tarjeta. Si es tarjeta, hay que conectar con el banco y
validar el PIN. Si es efectivo, hay que comprobar si la máquina tiene cambio. Una vez pagado, se
imprime el billete y se entrega el cambio si corresponde.
#### **Parte B (Estados):**
- Dibuja el diagrama de estados del objeto "**Billete**".
- Estados sugeridos: *No emitido, Emitido/Activo, Validado (en uso), Agotado, Caducado*.
- *Tarea*: Indica qué eventos provocan el cambio (ej: el evento "picar en el torno" pasa de *Emitido* a
*Validado*).

## Actividad 3: Sistema de Control de una Alarma Inteligente (Estados y Casos de Uso)
**Contexto**: Un sistema de alarma para el hogar que tiene un comportamiento dinámico complejo.
#### **Parte A (Estados):**
- El objeto "Sistema de Alarma" puede estar en los siguientes estados: *Desarmado, Armado, En
Espera (retardo de entrada), Alarma Sonando y Mantenimiento*.
- Si el sistema está *Armado* y se detecta movimiento, pasa a *En Espera* durante 30 segundos. Si en
ese tiempo no se introduce el código, pasa a Alarma Sonando. Si se introduce el código correcto,
pasa a *Desarmado*.
- Desde cualquier estado, si el técnico introduce una llave especial, pasa a Mantenimiento.
Tarea: Crea el diagrama de estados detallando los eventos y las acciones (ej: al entrar en Alarma
Sonando, la acción es llamar_policia()).
#### **Parte B (Casos de Uso):**
- Define los actores (Propietario, Sensor de Movimiento, Central de Policía, Técnico).
- Identifica los casos de uso principales (Armar sistema, Desarmar sistema, Configurar sensores,
Recibir alerta de intrusión).
