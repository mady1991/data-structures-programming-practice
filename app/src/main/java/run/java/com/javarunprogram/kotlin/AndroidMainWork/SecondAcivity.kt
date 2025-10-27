package run.java.com.javarunprogram.kotlin.AndroidMainWork

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import run.java.com.javarunprogram.R

class SecondAcivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val bundle = intent.extras
        Toast.makeText(this, bundle?.get("AB").toString(), Toast.LENGTH_SHORT).show()

    }
}