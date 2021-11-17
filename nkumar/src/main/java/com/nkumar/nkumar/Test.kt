package com.nkumar.nkumar

import android.app.Activity
import android.content.Context
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class Test {
    companion object{
        fun simpleToast(context: Context?, msg: String?) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }

        fun longSnack(context: Context, msg: String) {
            val snackbar = Snackbar.make(
                (context as Activity).findViewById(android.R.id.content),
                msg, Snackbar.LENGTH_LONG
            )
            snackbar.show()
        }
    }
}