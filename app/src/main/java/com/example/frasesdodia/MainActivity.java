package com.example.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Atributos
    String[] frases = {
            "Não viva para que a sua presença seja notada, mas para que a sua falta seja sentida.",
            "Desejar algo maior pra sua vida não significa que você está insatisfeito com o que tem.",
            "É importante agradecer pelo hoje sem nunca desistir do amanhã!",
            "Seja feliz do jeito que você é, não mude sua rotina pelo que os outros exigem de você. Simplesmente viva de acordo com o seu modo de viver",
            "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas, acima de tudo, seja você sempre",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view) {

        TextView texto = findViewById(R.id.textFrase);
        int numeroAleatorio = new Random().nextInt(5);
        String frase = frases[numeroAleatorio];

        texto.setText(frase);
    }

    public void exibirTodas(View view) {

        TextView texto = findViewById(R.id.textFrase);

        String textoFrase = "";

        for (String frase : frases){
            textoFrase = textoFrase + frase + "\n";
        }

        texto.setText(textoFrase);
    }
}