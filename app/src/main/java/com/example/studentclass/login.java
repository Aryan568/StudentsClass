package com.example.studentclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.studentclass.classes.eighth;
import com.example.studentclass.classes.nineth;
import com.example.studentclass.classes.seventh;
import com.example.studentclass.classes.sixth;
import com.example.studentclass.classes.tenth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity {

    EditText mail, passw;
    Button logbtn;
    TextView logtoreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mail= findViewById(R.id.mail);
        passw= findViewById(R.id.passw);
        logbtn= findViewById(R.id.logbtn);
        logtoreg= findViewById(R.id.logToreg);

        logtoreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login.this, MainActivity.class));
            }
        });

        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mail.getText().toString().equals("")){
                    mail.setError("Enter email");
                } else if (passw.getText().toString().equals("")) {
                    passw.setError("Enter password");
                }
                else {
                    String mails= mail.getText().toString().trim();
                    String passws= passw.getText().toString().trim();

                    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

                    firebaseAuth.signInWithEmailAndPassword(mails, passws).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()) {
                                FirebaseUser user = firebaseAuth.getCurrentUser();
                                String id = user.getUid();

                                DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("Students").child(id);
                                databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        String classfromDB= snapshot.child("Class").getValue(String.class);

                                        if (classfromDB.equals("6")){
                                            startActivity(new Intent(login.this, sixth.class));
                                        } else if (classfromDB.equals("7")) {
                                            startActivity(new Intent(login.this, seventh.class));
                                        } else if (classfromDB.equals("8")) {
                                            startActivity(new Intent(login.this, eighth.class));
                                        } else if (classfromDB.equals("9")) {
                                            startActivity(new Intent(login.this, nineth.class));
                                        } else {
                                            startActivity(new Intent(login.this, tenth.class));
                                        }
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError error) {

                                    }
                                });
                            } else {
                                // Login failed, handle the error
                                Toast.makeText(login.this, "Login failed.", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }
}

//if (classs.equals("6")){
//        startActivity(new Intent(login.this, sixth.class));
//        } else if (classs.equals("7")) {
//        startActivity(new Intent(login.this, seventh.class));
//        } else if (classs.equals("8")) {
//        startActivity(new Intent(login.this, eighth.class));
//        } else if (classs.equals("9")) {
//        startActivity(new Intent(login.this, nineth.class));
//        } else {
//        startActivity(new Intent(login.this, tenth.class));
//        }