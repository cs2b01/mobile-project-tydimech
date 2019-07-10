package cs2901.utec.chat_mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TableLayout;

import java.util.ArrayList;

public class Teblo extends AppCompatActivity {
    private TableLayout tableLayout;
    private EditText txtName;
    private EditText txtLastName;
    private String[]header={"N","local","visitante"};
    private  ArrayList<String[]>rows=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teblo);
        tableLayout=(TableLayout)findViewById(R.id.table);
        txtName=(EditText)findViewById(R.id.txtName);
        txtLastName=(EditText)findViewById(R.id.txtLastname);
        TableDynamic tableDynamic=new TableDynamic(tableLayout,getApplicationContext());
        tableDynamic.addHeader(header);
        tableDynamic.addData(getClients());
    }
    private ArrayList<String[]> getClients(){
        rows.add(new String[]{"1","peru","brasil"});
        rows.add(new String[]{"1","venezuela","españa"});
        return rows;
    }


}
