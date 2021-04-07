package com.example.tv2newsapp;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.tv2newsapp.businessLogic.Nyhedsindslag;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Nyhedsindslag nyhedsindslag = new Nyhedsindslag("Et eller andet", "Hello", "billede.png");

    Date tid = Calendar.getInstance().getTime();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy", Locale.getDefault());
    String formatTid = simpleDateFormat.format(tid);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("constructor", " Overskrift: " + nyhedsindslag.getOverskrift() + " Teaser tekst: " + nyhedsindslag.getTeaserTekst() + " Billede: " + nyhedsindslag.getLinkTillStillBillede());
        VisNyhedsindslag();

    }

    public void VisNyhedsindslag() {


        nyhedsindslag.setOverskrift("Datamatiker uddannelsen");
        nyhedsindslag.setLinkTillStillBillede("");
        nyhedsindslag.setSlettet(false);
        nyhedsindslag.setTeaserTekst("Datamatiker uddannelsen er den bedste!");
        nyhedsindslag.setUdgivelsesDato(formatTid);
        nyhedsindslag.setUdgivelsesStatus(true);

        Log.d("hey", " Overskift: " + nyhedsindslag.getOverskrift() + " Teaser tekst: " + nyhedsindslag.getTeaserTekst() + " Billede: " + nyhedsindslag.getLinkTillStillBillede() + " Tid:" + nyhedsindslag.getUdgivelsesDato() + " udgivelses status: " + nyhedsindslag.udgivelsesStatus() + " slettet: " + nyhedsindslag.slettet());

    }

}