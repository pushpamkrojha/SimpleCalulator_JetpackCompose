package com.example.calculatorappjetpack

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var num1 by remember {
                mutableStateOf("0")
            }

            var num2 by remember {
                mutableStateOf("0")
            }
            Column {
                TextField(value = num1, onValueChange = {
                    num1 = it

                })
                TextField(value = num2, onValueChange = {
                    num2 = it
                })

                Row {
                    Button(onClick = { /*TODO*/
                        val result = num1.toInt() + num2.toInt()
                        Toast.makeText(applicationContext,"Result is $result",Toast.LENGTH_LONG).show()
                    }) {
                        Text(text = "Add")
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Button(onClick = {
                        val result = num1.toInt() - num2.toInt()
                        Toast.makeText(applicationContext,"Result is $result",Toast.LENGTH_LONG).show()
                    }) {
                        Text(text = "Sub")
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Button(onClick = {
                        val result = num1.toInt() * num2.toInt()
                        Toast.makeText(applicationContext,"Result is $result",Toast.LENGTH_LONG).show()
                    }) {
                        Text(text = "Multi")
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Button(onClick = {
                        val result = num1.toInt() / num2.toInt()
                        Toast.makeText(applicationContext,"Result is $result",Toast.LENGTH_LONG).show()
                    }) {
                        Text(text = "Div")
                    }

                }

            }


        }
    }
}

