package com.hht.miapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.hht.miapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val miNumero:EditText=findViewById(R.id.editTextText2)
        val miBoton:Button=findViewById(R.id.button2)
        val textResultado:TextView=findViewById(R.id.textView)

        miBoton.setOnClickListener {
            val numeroResultado=miNumero.text.toString().toIntOrNull()
            textResultado.text= if (numeroResultado == null) "Introduce algo, hombre"
            else if(numeroResultado < 18) "eres menor de edad!!"
            else if (numeroResultado> 18) "eres mayor de edad!!!"
            else "Tienes justo 18 años!!!"

        }

    }

}