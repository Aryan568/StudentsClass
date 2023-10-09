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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText name, email,pass, classs;
    Button regBtn;
    TextView regtolog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        name= findViewById(R.id.name);
        email= findViewById(R.id.email);
        pass= findViewById(R.id.password);
        classs= findViewById(R.id.classes);
        regBtn= findViewById(R.id.registerbtn);
        regtolog= findViewById(R.id.regTolog);

        regtolog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, login.class));
            }
        });

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equals("")){
                    name.setError("Enter name");
                } else if (email.getText().toString().equals("")) {
                    email.setError("Enter email");
                } else if (pass.getText().toString().equals("")) {
                    pass.setError("Enter password");
                } else if (classs.getText().toString().equals("")) {
                    classs.setError("Enter class");
                }
                else {

                    String names= name.getText().toString().trim();
                    String emails= email.getText().toString().trim();
                    String passs= pass.getText().toString().trim();
                    String classes= classs.getText().toString().trim();

//                    DatabaseReference reff= FirebaseDatabase.getInstance().getReference("Students").child(names);
//
//                    reff.child("Name").setValue(names);
//                    reff.child("Email").setValue(emails);
//                    reff.child("Password").setValue(passs);
//                    reff.child("Class").setValue(classes);
//
//                    Toast.makeText(MainActivity.this, "Student added successfully", Toast.LENGTH_SHORT).show();
                    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

                    firebaseAuth.createUserWithEmailAndPassword(emails, passs).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                FirebaseUser user = firebaseAuth.getCurrentUser();
                                String id = user.getUid();

                                DatabaseReference databaseReference = firebaseDatabase.getReference("Students").child(id);
                                databaseReference.child("Name").setValue(names);
                                databaseReference.child("Email").setValue(emails);
                                databaseReference.child("Class").setValue(classes);

                                if (classs.getText().toString().equals("6")){
                                    startActivity(new Intent(MainActivity.this, sixth.class));
                                } else if (classs.getText().toString().equals("7")) {
                                    startActivity(new Intent(MainActivity.this, seventh.class));
                                } else if (classs.getText().toString().equals("8")) {
                                    startActivity(new Intent(MainActivity.this, eighth.class));
                                } else if (classs.getText().toString().equals("9")) {
                                    startActivity(new Intent(MainActivity.this, nineth.class));
                                } else {
                                    startActivity(new Intent(MainActivity.this, tenth.class));
                                }

                                // Registration successful, navigate to the main activity or login screen
                            }
                            else {
                                // Registration failed, handle the error
                                Toast.makeText(MainActivity.this, "Registration failed.", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                }
            }
        });
    }
}