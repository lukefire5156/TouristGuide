package com.lukefire.touristguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {

    private EditText suemail;
    private EditText suname;
    private EditText sureg;
    //private EditText suphone;
    private EditText supwd;
    private EditText confirmpwd;
    private Button register;
    private FirebaseAuth sAuth;
    private DatabaseReference mDatabase;
    private FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        suemail= (EditText) findViewById(R.id.suemail);
        suname= (EditText) findViewById(R.id.suname);
        sureg= (EditText) findViewById(R.id.sureg);
        //suphone= (EditText) findViewById(R.id.suphone);
        supwd= (EditText) findViewById(R.id.supwd);
        confirmpwd= (EditText) findViewById(R.id.confirmpwd);
        register= (Button) findViewById(R.id.register);
        sAuth = FirebaseAuth.getInstance();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registeruser();
            }
        });
    }

    private void registeruser(){
        final String mail= suemail.getText().toString();
        final String username= suname.getText().toString();
        final String userreg= sureg.getText().toString();
        //final String phno= suphone.getText().toString();
        String userpwd= supwd.getText().toString();
        String usercpwd= confirmpwd.getText().toString();

        if(TextUtils.isEmpty(mail)||TextUtils.isEmpty(username)||TextUtils.isEmpty(userreg)||TextUtils.isEmpty(userpwd)||TextUtils.isEmpty(usercpwd)){
            Toast.makeText(signup.this,"fill up the details completely",Toast.LENGTH_SHORT).show();
        }
        else {
            if (userpwd.length() < 6) {
                Toast.makeText(signup.this, "password must contain atleast 6 character", Toast.LENGTH_SHORT).show();
            } else {
                if (userpwd.equals(usercpwd)) {
                    sAuth.createUserWithEmailAndPassword(mail, userpwd)
                            .addOnCompleteListener(signup.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                                        String uid = user.getUid();
                                        database = FirebaseDatabase.getInstance();
                                        mDatabase = database.getReference();
                                        //mDatabase.child(uid);
                                        DatabaseReference emid = mDatabase.child("students").child(uid);
                                        emid.child("email").setValue(mail);
                                        emid.child("name").setValue(username);
                                        emid.child("Aadhar card").setValue(userreg);

                                        //emid.child("mobile").setValue(phno);
                                        Toast.makeText(signup.this, "SUCCESSFULLY REGISTERED!!", Toast.LENGTH_SHORT).show();
                                        FirebaseAuth.getInstance().signOut();
                                        startActivity(new Intent(signup.this,MainActivity.class));
                                    } else {
                                        // If sign in fails, display a message to the user.
                                        Toast.makeText(signup.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
                else {
                    Toast.makeText(signup.this, "password confirmation failed", Toast.LENGTH_SHORT).show();
                }

            }
        }
    }

}