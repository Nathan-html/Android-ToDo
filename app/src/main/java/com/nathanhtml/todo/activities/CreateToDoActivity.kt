package com.nathanhtml.todo.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.nathanhtml.todo.R
import com.nathanhtml.todo.utils.LambdaActivity

class CreateToDoActivity : LambdaActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)
        // create
        val createBtn : Button = findViewById(R.id.create_btn);
        val cancelBtn : Button = findViewById(R.id.cancel_btn);
        createBtn.setOnClickListener{

        }
        cancelBtn.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity::class.java);
            startActivity(intent);
        }
        createSpinner();
    }

    private fun createSpinner() {
        val spinner: Spinner = findViewById(R.id.priority)
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.priority,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
    }
}