package com.example.eventin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var pl:Place

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* var usuarioUno:User = User("Reynaldo","Carapie","Gómez", 7224986002)
        println(usuarioUno.getName()) */

    }

    fun createNewPlace(v: View){

        var etNamePlace     = findViewById<EditText>(R.id.etNamePlace)
        var etStreet        = findViewById<EditText>(R.id.etStreet)
        var etPostalCode    = findViewById<EditText>(R.id.etPostalCode)
        var etCity          = findViewById<EditText>(R.id.etCity)
        var etState         = findViewById<EditText>(R.id.etState)
        var etReference     = findViewById<EditText>(R.id.etReference)

        pl = Place()

        if (!etNamePlace.text.isNullOrEmpty() && !etStreet.text.isNullOrEmpty() && !etPostalCode.text.isNullOrEmpty()
            && !etCity.text.isNullOrEmpty()   && !etState.text.isNullOrEmpty()  && !etReference.text.isNullOrEmpty() )
        {
            pl.setPlace(
                etNamePlace.text.toString(),
                etStreet.text.toString(),
                etPostalCode.text.toString().toInt(),
                etCity.text.toString(),
                etState.text.toString(),
                etReference.text.toString()
            )
        }

        var ivPlace = findViewById<ImageView>(R.id.ivPlace)
        ivPlace.setImageResource(R.mipmap.ic_launcher)

        var tvPlace = findViewById<TextView>(R.id.tvPlace)
        loadDataPlace(tvPlace, pl)

    }

    private fun loadDataPlace(tv: TextView, p: Place){

        var description:String = ""

        description += p.getNamePlace() + " ("
        description += p.getCity() + ", "
        description += p.getState() + ")"

        tv.text = description

    }

}