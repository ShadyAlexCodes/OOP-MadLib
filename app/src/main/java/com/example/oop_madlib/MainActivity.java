package com.example.oop_madlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * @author Xander Endre
 * @name Madlib Labs
 * @project_description A simple Madlib game that utilizes three different input boxes
 * @date 13 October 2021
 * @class CSC110
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * TODO LIST:
     *  [x] Create a UI that allows the user to enter each field required by your madlib
     *  [x] The UI should have buttons that the user cna click to signal they are entering balues.
     *  [x] Button should have a click handler:
     *      [x] Grabs the entered values
     *      [x] Converts them to appropriate value by casting or parsing
     *      [x] Use values with any String literals
     *      [x] Place the MadLib in Text Control visible to user
     *  [x]  For added fun, and to be sure we're correctly parsing numeric inputs, double any number
     *        provided by the user before putting in the finished version of your mad lib output.
     *
     * Got checked off by Robert
     *
     */

    public void onClick(View view) {

        // Capture all of the inputs
        MadLib madlib = new MadLib();

        // Grab Animal
        EditText etAnimal = (EditText) findViewById(R.id.etAnimal);
        // Save the string
        madlib.setAnimal(etAnimal.getText().toString());
        // Modify the visibility to be hidden
        etAnimal.setVisibility(View.GONE);

        // Grab Name
        EditText etName = (EditText) findViewById(R.id.etName);
        madlib.setName(etName.getText().toString());
        etName.setVisibility(View.GONE);

        // Grab Food
        EditText etFood = (EditText) findViewById(R.id.etFood);
        madlib.setFood(etFood.getText().toString());
        etFood.setVisibility(View.GONE);

        // Grab Place
        EditText etPlace = (EditText) findViewById(R.id.etPlace);
        madlib.setPlace(etPlace.getText().toString());
        etPlace.setVisibility(View.GONE);

        // Grab Second Place
        EditText etPlaceTwo = (EditText) findViewById(R.id.etPlace2);
        madlib.setSecondPlace(etPlaceTwo.getText().toString());
        etPlaceTwo.setVisibility(View.GONE);

        // Grab Adjective
        EditText etAdjective = (EditText) findViewById(R.id.etAdjective);
        madlib.setAdjective(etAdjective.getText().toString());
        etAdjective.setVisibility(View.GONE);

        // Grab Second Name
        EditText etNameTwo = (EditText) findViewById(R.id.etName2);
        madlib.setSecondName(etNameTwo.getText().toString());
        etNameTwo.setVisibility(View.GONE);

        // Grab Numbers
        EditText etNumber = (EditText) findViewById(R.id.etNumber);
        // Parse the number as an Integer
        madlib.setNumber(Integer.parseInt(etNumber.getText().toString()));
        // Multiply it by two
        etNumber.setVisibility(View.GONE);

        // Grab the button
        Button btn = (Button) findViewById(R.id.button);
        // Hide the button
        btn.setVisibility(View.GONE);

        // Grab the paragraph
        TextView finalParagraph = (TextView) findViewById(R.id.paragraph);
        // Set the text
        finalParagraph.setText(madlib.toString());
        // Change the visibility to visible
        finalParagraph.setVisibility(View.VISIBLE);
    }
}