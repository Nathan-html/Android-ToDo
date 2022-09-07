package com.nathanhtml.todo.utils

import android.content.Intent
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.nathanhtml.todo.activities.CreateToDoActivity
import com.nathanhtml.todo.activities.MainActivity
import com.nathanhtml.todo.R

open class LambdaActivity : AppCompatActivity() {

    // statics
    companion object {
        val TAG = "QuizActivity"
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.activity_main -> {
                val intent = Intent(applicationContext, MainActivity::class.java);
                startActivity(intent);
                true
            }
            R.id.activity_create -> {
                val intent = Intent(applicationContext, CreateToDoActivity::class.java);
                startActivity(intent);
                true
            }
            else -> super.onOptionsItemSelected(item);
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() called")
    }
}