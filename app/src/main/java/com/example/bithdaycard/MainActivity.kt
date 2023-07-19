package com.example.bithdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.bithdaycard.ui.theme.BithdayCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BithdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayGreetingWithText(message= "Happy Birthday To Me!!", from = "- from Tony")
                }
            }
        }
    }
}

@Composable
// function that display in UI.
fun BirthdayGreetingWithText(message: String, from: String){
    //column will put them in different level. Row will but them side by side.
    Column{
        //sp controls the size of the font.
        Text(text = message, fontSize = 36.sp)
        Text(text = from, fontSize = 40.sp)
    }
}


//preview of the function
@Preview(showBackground = true)
@Composable
fun BirthdayGreetingWithTextPreview(){
    BithdayCardTheme {
        BirthdayGreetingWithText(message= "Happy Birthday To Me!!", from = "- from Tony")
    }
}