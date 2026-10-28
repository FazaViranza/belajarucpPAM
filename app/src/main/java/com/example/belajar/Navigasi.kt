
package com.example.belajar

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.belajar.view.InnputData
import com.example.belajar.view.Page2

enum class Navigasi {
    FormulirSaya,
    Detail
}


@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var kategori by remember { mutableStateOf("") }

    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirSaya.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Navigasi.FormulirSaya.name) {
                InnputData(
                    onSubmit = { inputNama, inputEmail, inputKategori ->
                        nama = inputNama
                        email = inputEmail
                        kategori = inputKategori

                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }

            composable(route = Navigasi.Detail.name) {
                Page2(
                    nama = nama,
                    email = email,
                    kategori = kategori,
                    onBack = {
                        navController.popBackStack()
                    }
                )
            }
        }
    }
}
