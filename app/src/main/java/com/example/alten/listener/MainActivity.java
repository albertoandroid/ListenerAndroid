package com.example.alten.listener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/*
El Patrón Listener se utiliza para realizar tareas después de que ocurra un determinado evento.
Esto nos ofrece libertad de definir la tarea que se va a ejecutar justo despues de que el evento haya finalizado
y podemos definir diferentes escenarios para el mismo evento.
Ejemplo tipico en Android de este patrón es el setOnClickListener, que una vez hemos pulsado por ejemplo
un botón somos nostros los que decidimos que tarea tiene que ser ejecutada.
 */

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LongTask longTask = new LongTask();
        longTask.setOnTaskListener(new OnTaskListener() {
            @Override
            public void onComplete() {
                Log.d("TAG", "onCompleteLongTask");
            }
        });
        longTask.runTask();
        Log.d("TAG", "onStartLongTask");
    }

}
