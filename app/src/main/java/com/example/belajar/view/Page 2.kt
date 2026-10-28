
package com.example.belajar.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.belajar.R

@Composable
fun Page2(
    nama: String,
    email: String,
    kategori: String,
    onBack: () -> Unit
) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = stringResource(R.string.konfirmasi))

            Text(text = "${stringResource(R.string.label_nama)}: $nama")
            Text(text = "${stringResource(R.string.label_email)}: $email")
            Text(text = "${stringResource(R.string.kategori_workshop)}: $kategori")

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = onBack) {
                Text(text = stringResource(R.string.kembali))
            }
        }
    }
}
