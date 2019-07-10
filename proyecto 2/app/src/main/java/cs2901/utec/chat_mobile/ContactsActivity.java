package cs2901.utec.chat_mobile;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
public class ContactsActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        mRecyclerView = findViewById(R.id.main_recycler_view);
        setTitle("@" + getIntent().getExtras().get("username").toString());
    }

    public void sigac(View v) {

        Intent inte = new Intent(this, Tabla.class);
        startActivity(inte);
    }

    public void sigoc(View v) {

        Intent inten = new Intent(this, Teblo.class);
        startActivity(inten);
    }
}


