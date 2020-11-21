package com.example.afinal;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Signup_Form extends AppCompatActivity {
    EditText ed_name,ed_email,ed_phone,ed_password;
    String str_name,str_email,str_phone,str_password;
    String url="https://varunbhardwajmysql.000webhostapp.com/Signup.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup__form);
        getSupportActionBar().setTitle("Signup");

        ed_email = findViewById(R.id.ed_email);
        ed_name = findViewById(R.id.ed_name);
        ed_phone = findViewById(R.id.ed_phone);
        ed_password = findViewById(R.id.ed_password);
    }


    public void Register(View view) {

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please Wait..");


        if(ed_name.getText().toString().equals("")){
            Toast.makeText(this, "Enter Name", Toast.LENGTH_SHORT).show();
        }
        else if(ed_email.getText().toString().equals("")){
            Toast.makeText(this, "Enter Email", Toast.LENGTH_SHORT).show();
        }
        else if(ed_phone.getText().toString().equals("")){
            Toast.makeText(this, "Enter Phone Number", Toast.LENGTH_SHORT).show();
        }
        else if(ed_password.getText().toString().equals("")){
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
        }
        else{

            progressDialog.show();
            str_name = ed_name.getText().toString().trim();
            str_email = ed_email.getText().toString().trim();
            str_phone = ed_phone.getText().toString().trim();
            str_password = ed_password.getText().toString().trim();


            StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    progressDialog.dismiss();
                    ed_name.setText("");
                    ed_email.setText("");
                    ed_phone.setText("");
                    ed_password.setText("");
                    Toast.makeText(Signup_Form.this, response, Toast.LENGTH_SHORT).show();
                }
            },new Response.ErrorListener(){

                @Override
                public void onErrorResponse(VolleyError error) {
                    progressDialog.dismiss();
                    try {
                        Toast.makeText(Signup_Form.this, error.getMessage().toString(), Toast.LENGTH_SHORT).show();
                    }catch(NullPointerException igonored)
                    { }
                }
            }

            ){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String,String> params = new HashMap<String, String>();

                    params.put("Name",str_name);
                    params.put("Email",str_email);
                    params.put("Phone_Number",str_phone);
                    params.put("Password",str_password);
                    return params;

                }
            };

            RequestQueue requestQueue = Volley.newRequestQueue(Signup_Form.this);
            requestQueue.add(request);


        }

    }

}