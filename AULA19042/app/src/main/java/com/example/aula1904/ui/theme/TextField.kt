package com.example.aula1904.ui.theme

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Preview
@Composable

fun SimpleTextField(){
    var text by remember { mutableStateOf("") }
var isError by remember { mutableStateOf("0")
}
    TextField(value = text, onValueChange ={}, label = { Text(text= "Nome")} )

    //TextField(text = text, onValueChange = { novoValue -> text = novoValue}) label = { Text(text = "Nome")}

}