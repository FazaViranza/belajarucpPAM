
package com.example.belajar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.belajar.ui.theme.BelajarTheme
import com.example.belajar.view.InnputData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BelajarTheme {
                InnputData()
            }
        }
    }
}
