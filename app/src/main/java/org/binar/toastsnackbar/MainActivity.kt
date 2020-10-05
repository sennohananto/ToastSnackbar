package org.binar.toastsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToastShort.setOnClickListener {
            Toast.makeText(this,"Ini Toast LENGTH_SHORT",Toast.LENGTH_SHORT).show()
        }

        btnToastLong.setOnClickListener {
            Toast.makeText(this,"Ini Toast LENGTH_LONG",Toast.LENGTH_LONG).show()
        }

        btnSnackbarShort.setOnClickListener {
            Snackbar.make(it,"Ini Snackbar Short",Snackbar.LENGTH_SHORT).show()
        }

        btnSnackbarLong.setOnClickListener {
            Snackbar.make(it,"Ini Snackbar Long",Snackbar.LENGTH_LONG).show()
        }

        btnSnackbarIndefinite.setOnClickListener {
            val snackBar = Snackbar.make(it,"Ini Snackbar Indefinite. Gak bakal pergi kalo gak klik Dismiss / Ada Snackbar lainnya",Snackbar.LENGTH_INDEFINITE)

            snackBar.setAction("Dismiss"){
                snackBar.dismiss()
            }

            snackBar.show()
        }

        btnSnackbarAction.setOnClickListener {
            Snackbar.make(it,"Ini Snackbar Long dengan Action",Snackbar.LENGTH_LONG)
                .setAction("Text Action") {
                    Toast.makeText(this, "Toast dari Action Snackbar", Toast.LENGTH_LONG).show()
                }
                .show()
        }
    }
}