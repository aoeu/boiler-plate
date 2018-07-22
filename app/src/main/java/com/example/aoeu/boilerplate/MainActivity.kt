package com.example.aoeu.boilerplate

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.greeting).setText(
                resources.getString(R.string.greeting, resources.getString(R.string.defaultName))
        )
        findViewById<Button>(R.id.submitButton).setOnClickListener {
            findViewById<TextView>(R.id.greeting).setText(
                    resources.getString(R.string.greeting,
                            findViewById<EditText>(R.id.nameInput).text ?: resources.getString(R.string.defaultName)
                    )
            )
        }
    }
}
