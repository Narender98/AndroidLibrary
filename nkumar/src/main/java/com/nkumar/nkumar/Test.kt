package com.nkumar.nkumar

import android.content.Context
import android.widget.Toast

class Test {
    companion object{
        fun simpleToast(context: Context?, msg: String?) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}