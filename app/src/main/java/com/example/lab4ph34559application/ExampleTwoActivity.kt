package com.example.lab4ph34559application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ExampleTwoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GetLayoutExampleTwo()
        }


    }
}


@Composable
fun GetLayoutExampleTwo() {
    val listImage = mutableListOf(
        R.drawable.image_one,
        R.drawable.image_two,
        R.drawable.image_one,
        R.drawable.image_two,
        R.drawable.image_one,
        R.drawable.image_two,

    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        HorizontalImageList(list = listImage)
        Spacer(modifier = Modifier.height(20.dp))
        VerticalImageList(list = listImage)

    }

}

@Composable
fun HorizontalImageList(list: List<Int>) {
    val scrollState = rememberScrollState()

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(scrollState)
    ) {
        list.forEachIndexed { _, image ->
            Image(
                painter = painterResource(id = image), contentDescription = null,
                modifier = Modifier
                    .padding(end = 15.dp)
                    .clip(
                        shape = RoundedCornerShape(10.dp)
                    )
            )
        }
    }


}

@Composable
fun VerticalImageList(list: List<Int>) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        list.forEachIndexed { _, image ->
            Image(
                painter = painterResource(id = image), contentDescription = null,
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(10.dp))

            )
            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewExampleTwo() {
    GetLayoutExampleTwo()
}
