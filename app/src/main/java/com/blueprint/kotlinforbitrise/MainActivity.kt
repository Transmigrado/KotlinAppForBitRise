package com.blueprint.kotlinforbitrise

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import com.blueprint.kotlinforbitrise.utils.Validator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valid = Validator()

        mybutton.setOnClickListener {
            if (valid.validateEmail(email.text.toString())) {

                val simpleAlert = AlertDialog.Builder(this@MainActivity).create()
                simpleAlert.setTitle("Alert")
                simpleAlert.setMessage("Show simple Alert")

                simpleAlert.setButton(AlertDialog.BUTTON_POSITIVE, "OK", {
                    dialogInterface, i ->
                    Toast.makeText(applicationContext, "You clicked on OK", Toast.LENGTH_SHORT).show()
                })

                simpleAlert.show()

            }
        }

    }
}
