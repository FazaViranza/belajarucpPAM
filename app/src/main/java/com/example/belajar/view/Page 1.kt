package com.example.belajar.view

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@Composable
fun InnputData(
){
    Scaffold (
        column{
            judul
            spacer
            deskripsi
                box{
                    column(
                        kotak buat input nama
                        spacer
                        kotak buat input email
                        spacer
                        row(
                            pilihan radio button
                        )
                        spacer
                        row(
                            text "setuju ngga?"
                            spacer
                            radiobutton
                        )
                        spacer
                        button konfir
                    )
                }
        }

    )