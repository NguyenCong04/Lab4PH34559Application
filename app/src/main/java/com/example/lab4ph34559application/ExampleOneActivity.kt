package com.example.lab4ph34559application

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ExampleOneActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GetLayoutExampleOne()
        }


    }
}

@Composable
fun GetLayoutExampleOne() {
    val context = LocalContext.current
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var isShowHidePass by remember {
        mutableStateOf(false)
    }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = ""
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = username, onValueChange = {
            username = it
        }, label = {
            Text(
                text = "Username", fontFamily = FontFamily.Serif
            )
        }, modifier = Modifier.width(350.dp), textStyle = TextStyle(
            fontFamily = FontFamily.Serif
        )

        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(
                text = "Password", fontFamily = FontFamily.Serif
            )
        }, modifier = Modifier.width(350.dp), textStyle = TextStyle(
            fontFamily = FontFamily.Serif
        ), trailingIcon = {
            IconButton(onClick = {
                isShowHidePass = !isShowHidePass
            }) {
                Image(
                    painterResource(
                        id = if (isShowHidePass) R.drawable.an else R.drawable.show
                    ),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp, 20.dp)
                )
            }
        }, visualTransformation = if (isShowHidePass) VisualTransformation.None
        else PasswordVisualTransformation()

        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                if (username.isNotBlank() && password.isNotBlank()) Toast
                    .makeText(context, "Login successfully", Toast.LENGTH_SHORT)
                    .show()
                else Toast
                    .makeText(
                        context,
                        "Please enter you username and password",
                        Toast.LENGTH_SHORT
                    )
                    .show()
            },
            modifier = Modifier.width(200.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black
            )
        ) {
            Text(text = "Login", fontFamily = FontFamily.Serif)
        }

    }


}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreviewExampleOne() {
    GetLayoutExampleOne()
}