package com.example.ejercicio2compose

import com.example.ejercicio2compose.ui.theme.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.ejercicio2compose.ui.theme.Ejercicio2ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio2ComposeTheme {

            }
        }
    }
}

@Preview
@Composable
fun ConstraintExample() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        val (boxBlack, boxCyan1, boxCyan2, boxCyan3, boxCyan4, boxPurple1, boxPurple2, boxPurple3, boxPurple4) = createRefs()
        Box(modifier = Modifier
            .size(40.dp)
            .background(Color.Black)
            .constrainAs(boxBlack) {

                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)

            })
        Box(modifier = Modifier
            .size(40.dp)
            .background(CyanMio)
            .constrainAs(boxCyan1) {

                bottom.linkTo(boxBlack.top)
                end.linkTo(boxBlack.start)

            })
        Box(modifier = Modifier
            .size(40.dp)
            .background(CyanMio)
            .constrainAs(boxCyan2) {

                bottom.linkTo(boxBlack.top)
                start.linkTo(boxBlack.end)

            })
        Box(modifier = Modifier
            .size(40.dp)
            .background(CyanMio)
            .constrainAs(boxCyan3) {

                top.linkTo(boxBlack.bottom)
                end.linkTo(boxBlack.start)

            })
        Box(modifier = Modifier
            .size(40.dp)
            .background(CyanMio)
            .constrainAs(boxCyan4) {

                top.linkTo(boxBlack.bottom)
                start.linkTo(boxBlack.end)

            })
        Box(modifier = Modifier
            .size(40.dp)
            .background(Purple40)
            .constrainAs(boxPurple1) {
                bottom.linkTo(boxCyan1.top)
                start.linkTo(boxCyan1.end)
            })
        Box(modifier = Modifier
            .size(40.dp)
            .background(Purple40)
            .constrainAs(boxPurple2) {
                top.linkTo(boxCyan3.bottom)
                end.linkTo(boxCyan3.start)
            })
        Box(modifier = Modifier
            .size(40.dp)
            .background(Purple40)
            .constrainAs(boxPurple3) {
                top.linkTo(boxCyan3.bottom)
                end.linkTo(boxCyan4.start)
            })
        Box(modifier = Modifier
            .size(40.dp)
            .background(Purple40)
            .constrainAs(boxPurple4) {
                top.linkTo(boxCyan3.bottom)
                start.linkTo(boxCyan4.end)
            })
    }
}