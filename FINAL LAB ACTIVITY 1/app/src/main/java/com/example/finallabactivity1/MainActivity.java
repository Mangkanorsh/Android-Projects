package com.example.finallabactivity1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText, editTextAddress, editTextBirthdate, editTextAge;
    private Button submitButton, btnReset;
    private TextView nameOutputTextView, votersInfotxtview, txtvwAddressOutput, txtvwBirthdateOutput, txtvwAgeOutput, txtvwGenderOutput, txtvwStatusOutput, txtvwWorkingOutput;
    private RadioGroup rdogrpGenders, rdogrpStatuses;
    private RadioButton rdoMale, rdoFemale, rdoSingle, rdoMarried;

    private CheckBox checkBoxWorking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nameEditText = findViewById(R.id.nameEditText);
        nameOutputTextView = findViewById(R.id.nameOutputTextView);

        editTextAddress = findViewById(R.id.editTextAddress);
        txtvwAddressOutput = findViewById(R.id.txtvwAddressOutput);

        editTextBirthdate = findViewById(R.id.editTextBirthdate);
        txtvwBirthdateOutput = findViewById(R.id.txtvwBirthdateOutput);

        editTextAge = findViewById(R.id.editTextAge);
        txtvwAgeOutput = findViewById(R.id.txtvwAgeOutput);

        rdogrpGenders = findViewById(R.id.rdogrpGenders);
        rdoMale = findViewById(R.id.rdoMale);
        rdoFemale = findViewById(R.id.rdoFemale);
        txtvwGenderOutput = findViewById(R.id.txtvwGenderOutput);

        rdogrpStatuses = findViewById(R.id.rdogrpStatuses);
        rdoSingle = findViewById(R.id.rdoSingle);
        rdoMarried = findViewById(R.id.rdoMarried);
        txtvwStatusOutput = findViewById(R.id.txtvwStatusOutput);

        checkBoxWorking = findViewById(R.id.checkBoxWorking);
        txtvwWorkingOutput = findViewById(R.id.txtvwWorkingOutput);


        votersInfotxtview = findViewById(R.id.votersInfotxtview);
        submitButton = findViewById(R.id.submitButton);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                votersInfotxtview.setText("VOTERS' INFORMATION");

                String name = nameEditText.getText().toString();
                nameOutputTextView.setText("Name: " + name);

                String address = editTextAddress.getText().toString();
                txtvwAddressOutput.setText("Address: " + address);

                String bday = editTextBirthdate.getText().toString();
                txtvwBirthdateOutput.setText(" Birthdate: " + bday);

                String age = editTextAge.getText().toString();
                txtvwAgeOutput.setText("Age: " + age);

                String selectedGender = "";
                if(rdoMale.isChecked()){
                    selectedGender = "Male";
                }else if (rdoFemale.isChecked()){
                    selectedGender = "Female";
                }
                txtvwGenderOutput.setText("Gender: " + selectedGender);
                
                String selectedStatus = "";
                if(rdoSingle.isChecked()){
                    selectedStatus = "Single";
                } else if (rdoMarried.isChecked()) {
                    selectedStatus = "Married";
                }
                txtvwStatusOutput.setText("Status: " + selectedStatus);

                String working = "";
                if(checkBoxWorking.isChecked()){
                    working = "yes";
                }else {
                    working = "no";
                }
                txtvwWorkingOutput.setText("Working: " + working);
            }
        });

        btnReset = findViewById(R.id.btnReset);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameEditText.setText("");
                editTextAddress.setText("");
                editTextBirthdate.setText("");
                editTextAge.setText("");
                nameOutputTextView.setText("");
                votersInfotxtview.setText("");
                txtvwAddressOutput.setText("");
                txtvwBirthdateOutput.setText("");
                txtvwAgeOutput.setText("");
                txtvwGenderOutput.setText("");
                rdogrpGenders.clearCheck();
                txtvwStatusOutput.setText("");
                rdogrpStatuses.clearCheck();
                txtvwWorkingOutput.setText("");
                checkBoxWorking.setChecked(false);

            }
        });
    }
}