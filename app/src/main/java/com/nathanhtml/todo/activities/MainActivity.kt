package com.nathanhtml.todo.activities

import android.os.Bundle
import com.nathanhtml.todo.R
import com.nathanhtml.todo.utils.LambdaActivity

class MainActivity : LambdaActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}