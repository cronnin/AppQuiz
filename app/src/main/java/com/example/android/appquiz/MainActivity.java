package com.example.android.appquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.duration;
import static com.example.android.appquiz.R.id.resposta1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarRespostas(View v) {
        String toastMsg = "";
        int pontos = 0;

        RadioButton respost1 = (RadioButton) findViewById(resposta1);
        if (respost1.isChecked()) {
            toastMsg = getString(R.string.resposta1C);
            pontos++;
        } else
            toastMsg = getString(R.string.resposta1E);

        getMensagem(toastMsg);

        CheckBox cb1P2 = (CheckBox) findViewById(R.id.cb1p2);
        CheckBox cb2P2 = (CheckBox) findViewById(R.id.cb2p2);
        CheckBox cb3P2 = (CheckBox) findViewById(R.id.cb3p2);
        CheckBox cb4P2 = (CheckBox) findViewById(R.id.cb4p2);
        if (cb1P2.isChecked() && cb2P2.isChecked() && cb3P2.isChecked() && cb4P2.isChecked()) {
            toastMsg = getString(R.string.resposta2C);
            pontos++;
        } else
            toastMsg = getString(R.string.resposta2E);

        getMensagem(toastMsg);


        RadioButton respost3 = (RadioButton) findViewById(R.id.resposta3);
        if (respost3.isChecked()) {
            toastMsg = getString(R.string.resposta3C);
            pontos++;
        } else
            toastMsg = getString(R.string.resposta3E);

        getMensagem(toastMsg);


        CheckBox cb1P4 = (CheckBox) findViewById(R.id.cb1p4);
        CheckBox cb2P4 = (CheckBox) findViewById(R.id.cb2p4);
        CheckBox cb3P4 = (CheckBox) findViewById(R.id.cb3p4);
        if (cb1P4.isChecked() && cb2P4.isChecked() && cb3P4.isChecked()) {
            toastMsg = getString(R.string.resposta4C);
            pontos++;
        } else
            toastMsg = getString(R.string.resposta4E);

        getMensagem(toastMsg);

        RadioButton resposta5 = (RadioButton) findViewById(R.id.resposta5);
        if (resposta5.isChecked()) {
            toastMsg = getString(R.string.resposta5C);
            pontos++;
        } else
            toastMsg = getString(R.string.resposta5E);

        getMensagem(toastMsg);

        EditText resposta6 = (EditText) findViewById(R.id.resposta6);
        String res = resposta6.getText().toString();

        if (res.equals(getString(R.string.op1p6))) {
            toastMsg = getString(R.string.resposta6C);
            pontos++;
        } else
            toastMsg = getString(R.string.resposta6E);

        getMensagem(toastMsg);

        toastMsg = getString(R.string.pontuacao, String.valueOf(pontos));
        getMensagem(toastMsg);

        toastMsg = getString(R.string.fim);
        getMensagem(toastMsg);
    }

    public void getMensagem(String msg) {
        Context context = getApplicationContext();

        Toast toast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
        toast.show();
    }

}
