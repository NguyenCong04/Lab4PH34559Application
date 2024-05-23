package com.example.lab4ph34559application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //AppNavigation()
        }
    }
}

//@Composable
//fun AppNavigation() {
//    val navController = rememberNavController()
//    NavHost(navController = navController, startDestination = "main") {
//        composable("main") { HomeScreen(navController) }
//        composable("example_one") { GetLayoutExampleOne() }
//        composable("example_two") { GetLayoutExampleTwo() }
//        composable("example_three") { GetLayoutExampleThree() }
//
//    }
//
//
//}
//
//@Composable
//fun HomeScreen(navController: NavController) {
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//
//        Button(
//            onClick = {
//                navController.navigate("example_one")
//            },
//            shape = RoundedCornerShape(10.dp),
//            modifier = Modifier
//                .width(150.dp)
//                .height(45.dp),
//            colors = ButtonDefaults.buttonColors(
//                containerColor = Color.Black
//            )
//
//        ) {
//            Text(
//                text = "Example 1", fontFamily = FontFamily.Serif
//            )
//        }
//        CommonSpacer()
//        Button(
//            onClick = {
//                navController.navigate("example_two")
//
//            },
//            shape = RoundedCornerShape(10.dp),
//            modifier = Modifier
//                .width(150.dp)
//                .height(45.dp),
//            colors = ButtonDefaults.buttonColors(
//                containerColor = Color.Black
//            )
//
//        ) {
//            Text(
//                text = "Example 2", fontFamily = FontFamily.Serif
//            )
//        }
//        CommonSpacer()
//        Button(
//            onClick = {
//                navController.navigate("example_three")
//
//                      },
//            shape = RoundedCornerShape(10.dp),
//            modifier = Modifier
//                .width(150.dp)
//                .height(45.dp),
//            colors = ButtonDefaults.buttonColors(
//                containerColor = Color.Black
//            )
//
//        ) {
//            Text(
//                text = "Example 3", fontFamily = FontFamily.Serif
//            )
//        }
//
//
//    }
//
//}

@Composable
fun CommonSpacer() {
    Spacer(modifier = Modifier.height(10.dp))
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {

    //AppNavigation()

}