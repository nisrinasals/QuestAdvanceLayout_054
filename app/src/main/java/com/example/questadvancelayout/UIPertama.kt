package com.example.questadvancelayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier){
    Column(modifier = Modifier.padding(top=100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        Text(stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)
        Text(stringResource(R.string.univ),
            fontSize= 20.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(25.dp))
        Card(modifier = Modifier
            .fillMaxWidth(1f)
            .padding(12.dp),
            colors = CardDefaults.cardColors(
            containerColor = Color.DarkGray
            )){
            Row() {
                val gambar = painterResource(R.drawable.logo)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(5.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column() {
                    Text(
                        stringResource(R.string.namaBox1),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top=15.dp)
                    )
                    Text(
                        stringResource(R.string.alamatBox1),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top=10.dp)
                    )
                }
            }
        }
        Card(modifier = Modifier
            .fillMaxWidth(1f)
            .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Blue
            )){
            Row() {
                val gambar = painterResource(R.drawable.logo)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(115.dp).padding(10.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column() {
                    Text(
                        stringResource(R.string.namaBox2),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(top=15.dp)
                    )
                    Text(
                        stringResource(R.string.telp),
                        fontSize = 20.sp,
                        color = Color.Cyan,
                        modifier = Modifier.padding(top=5.dp)
                    )
                    Text(
                        stringResource(R.string.alamatBox2),
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(top=5.dp, bottom = 10.dp)
                    )
                }
            }
        }
        Card(modifier = Modifier
            .fillMaxWidth(1f)
            .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.DarkGreen)
            )){
            Row() {
                val gambar = painterResource(R.drawable.logo)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(115.dp).padding(10.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column() {
                    Text(
                        stringResource(R.string.namaBox3),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(top=15.dp)
                    )
                    Text(
                        stringResource(R.string.telp),
                        fontSize = 20.sp,
                        color = Color.Cyan,
                        modifier = Modifier.padding(top=5.dp)
                    )
                    Text(
                        stringResource(R.string.alamatBox3),
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(top=5.dp, bottom = 10.dp)
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                stringResource(R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}