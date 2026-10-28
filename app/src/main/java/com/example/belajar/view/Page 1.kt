package com.example.belajar.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.belajar.R
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment


@Composable
fun InnputData() {
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var kategori by remember { mutableStateOf("") }
    var setuju by remember { mutableStateOf(false) }
    val formValid = nama.isNotBlank() &&
            email.isNotBlank() &&
            kategori.isNotBlank() &&
            setuju

    Scaffold { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = stringResource(R.string.judul_pendaftaran)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = stringResource(R.string.deskripsi_pendaftaran)
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = nama,
                onValueChange = { nama = it },
                label = {
                    Text(text = stringResource(R.string.label_nama))
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = {
                    Text(text = stringResource(R.string.label_email))
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = stringResource(R.string.android)
                )
                Spacer(modifier = Modifier.height(8.dp))
                RadioButton(
                    selected = kategori == "Android",
                    onClick = { kategori = "Android" }
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = stringResource(R.string.web)
                )
                Spacer(modifier = Modifier.height(8.dp))
                RadioButton(
                    selected = kategori == "Web",
                    onClick = { kategori = "Web" }
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = stringResource(R.string.uiux)
                )
                Spacer(modifier = Modifier.height(8.dp))
                RadioButton(
                    selected = kategori == "UI/UX",
                    onClick = { kategori = "UI/UX" }
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.se7)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Checkbox(
                    checked = setuju,
                    onCheckedChange = { setuju = it }
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* aksi nanti */ },
                enabled = formValid
            ) {
                Text(text = stringResource(R.string.daftar))
            }
        }
    }
}