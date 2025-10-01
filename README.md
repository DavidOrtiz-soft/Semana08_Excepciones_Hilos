# Semana08_Excepciones_Hilos

## Descripción

Este proyecto simula una cuenta bancaria compartida por varios cajeros (hilos), donde cada uno intenta retirar dinero simultáneamente. Se utiliza una excepción personalizada para manejar retiros con saldo insuficiente y se demuestra el uso de sincronización (`synchronized`) en los métodos de la cuenta.

## ¿Qué ocurre al sincronizar vs. no sincronizar?

- **Sin sincronizar:**  
  Si los métodos `depositar` y `retirar` no son `synchronized`, pueden ocurrir condiciones de carrera. Por ejemplo, dos hilos pueden leer el mismo saldo antes de que uno de ellos lo actualice, permitiendo retiros que exceden el saldo real y generando inconsistencias.

- **Con sincronización:**  
  Al marcar los métodos como `synchronized`, solo un hilo puede ejecutar `depositar` o `retirar` a la vez sobre la misma cuenta. Esto garantiza que el saldo se actualice correctamente y que no se permitan retiros simultáneos que excedan el saldo disponible.

## Ejecución

Al ejecutar el programa, se observa en consola cada intento de retiro y el saldo final, demostrando que la sincronización previene errores de concurrencia.
