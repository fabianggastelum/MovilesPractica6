package mx.edu.itson.potros.practica6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class detalle_pelicula : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val iv_pelicula_image: ImageView =findViewById(R.id.iv_pelicula_imagen)
        val tv_nombre_pelicula:TextView = findViewById(R.id.tv_nombre_pelicula)
        val tv_pelicula_desc: TextView = findViewById(R.id.tv_pelicula_desc)
        val tv_seats: TextView = findViewById(R.id.seatLeft)
        val buy_button: Button = findViewById(R.id.buyTickets)

        val bundle=intent.extras
        if(bundle != null){
            iv_pelicula_image.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("titulo"))
            tv_pelicula_desc.setText(bundle.getString("sinopsis"))
        }
        buy_button.setOnClickListener {
            var intent: Intent = Intent( this, SeatSelection::class.java)
            startActivity(intent)
        }
    }
}