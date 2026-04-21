# Actividad 07 Entornos de Desarollo
-------------------------------------------------------------------------------------------------------------------------------
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
