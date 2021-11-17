package com.nkumar.androidlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.nkumar.androidlibrary.ui.theme.AndroidLibraryTheme
import com.nkumar.nkumar.Test

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLibraryTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                }
            }
        }
    }
}
