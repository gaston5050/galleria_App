package com.example.cuadrosapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.pm.ShortcutInfoCompat
import com.example.cuadrosapp.ui.theme.CuadrosAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuadrosAppTheme {
                cuadros()
            }
        }
    }
}

@Composable
fun galeriaApp() {

    cuadros()

}




@Composable
fun cuadros( modifier: Modifier = Modifier) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        shadowElevation = 8.dp,

    ) {
        Column(
            modifier = Modifier.padding(16.dp).
            fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Image(painter = painterResource(id = R.drawable.img_1_01),
                contentDescription = null)
            Box(modifier = Modifier
                .fillMaxWidth().padding(0.dp,8.dp, 0.dp, 8.dp)
                .background(color = Color.LightGray)
               ){
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Titulo de la imagen")
                    Text("Nombre del autor")
                }

            }

            
            Row (modifier = Modifier.fillMaxWidth(),
                ){
                Button(onClick = {println("Boton 1") },modifier = Modifier.weight(1f), shape = RoundedCornerShape(8.dp)) { Text("Atrás")  }
                Spacer(modifier = Modifier.padding(8.dp))
                Button(onClick = {println("Boton 2")},modifier = Modifier.weight(1f), shape = RoundedCornerShape(8.dp) ) { Text("Adelante")  }

            }

        }

    }



}

@Preview(showBackground = true)
@Composable
fun Preview() {
    CuadrosAppTheme {
        cuadros()
    }
}