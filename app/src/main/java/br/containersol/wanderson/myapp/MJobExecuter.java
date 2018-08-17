package br.containersol.wanderson.myapp;

import android.os.AsyncTask;

public class MJobExecuter extends AsyncTask<Void, Void, String> {

    @Override
    protected String doInBackground(Void... voids){
        return "Background task esta rodando...";
    }
}
