package com.example.ricardo.fragmentsexercicio1;

import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements VermelhoFragment.OnFragmentInteractionListener{

    VermelhoFragment vermelhoFragment;
    TextView txtCor2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       vermelhoFragment = new VermelhoFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transactionManager = fragmentManager.beginTransaction();

        transactionManager.add(R.id.fragment2, vermelhoFragment);

        transactionManager.commit();



    }

    public void carregarVermelho(View view){

        int vermCor = Color.RED;
        vermelhoFragment.getView().setBackgroundColor(vermCor);

        vermelhoFragment.setTxtCor2("Vermelho");

    }

    public  void carregarVerde(View view){

        int verCor = Color.GREEN;
        vermelhoFragment.getView().setBackgroundColor(verCor);

        vermelhoFragment.setTxtCor2("Verde");
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
