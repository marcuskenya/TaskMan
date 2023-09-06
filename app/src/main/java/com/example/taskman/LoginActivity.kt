package com.example.taskman

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
Login()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Login() {


    val email by remember {
        mutableStateOf("")
    }
    val password by remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
            .padding(12.dp)
                , verticalArrangement = Arrangement.Center
,horizontalAlignment = Alignment.CenterHorizontally
    ){



Text(text = "Welcome ,please login", color = Color.White)





        Spacer(modifier = Modifier.height(15.dp))

        TextField(value = email,
            leadingIcon = { Icon(Icons.Default.Email,contentDescription = "email") },
            onValueChange = {email },
            label = {Text(text ="email")},
            modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.height(15.dp))

        TextField(value = password,
            leadingIcon = {Icon(Icons.Default.Lock,contentDescription = "password")},
            onValueChange ={email},
            label = { Text(text = "password")},
            modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { /*TODO*/ },
            shape= RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
      Text(text = "LOGIN")
        }

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "SIGN UP")
        }
    }
}



