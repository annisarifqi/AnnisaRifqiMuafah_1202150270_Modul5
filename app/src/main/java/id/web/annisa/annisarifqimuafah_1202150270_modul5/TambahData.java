package id.web.annisa.annisarifqimuafah_1202150270_modul5;

import android.support.v7.app.AppCompatActivity;

public class TambahData extends AppCompatActivity {
    //deklarasi variable
    String todo, desc, priority;

    //konstruktor
    public TambahData(String todo, String desc, String prior){
        this.todo=todo;
        this.desc=desc;
        this.priority=prior;
    }

    //method setter dan getter untuk to do , description dan priority
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return priority;
    }

    public void setPrior(String prior) {
        this.priority = prior;
    }
}
