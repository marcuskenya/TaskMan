//package com.example.taskman
//
//import android.graphics.drawable.Icon
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material.icons.filled.Favorite
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Person
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBar
//import androidx.compose.material3.surfaceColorAtElevation
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.taskman.ui.theme.TaskManTheme
//
//class CardActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//
//        }
//    }
//}
//@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true)
//@Composable
//fun ScaffoldWithTopBar() {
//    Scaffold (
//        topBar = {
//            TopAppBar(title = {
//              Text(text = "Top App Bar") },
//                navigationIcon = {
//                    IconButton(onClick = {}) {
//
//                        Icon(Icons.Filled.ArrowBack,"backIcon")
//
//                    }
//                },
//
//                backgroundColor = MaterialTheme.colors.primary,
//                contentColor = Color.White, colors = surfaceColoratElevation(10.dp)
//            )
//
//        }, content = {
//            Column (
//                modifier = Modifier
//                    .fillMaxSize
//                    .background(Color.Blue),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ){
//Text(text = "Content of the page", fontSize =30.sp, color = Color.White )
//            }
//        }
//    ){
//
//    }
//
//}
//
//@Composable
//fun BottomBar(){
//    val selectedIndex = remember {mutableStateOf(0)}
//
//    BottomNavigation(surfaceColorAtElevation(10.dp)){
//
//        BottomNavigationItem(icon ={
//            Icon(imageVector = Icons.Default.Home,"")
//        },
//            label = {
//                Text(text = "Home")
//            },selected =(selectedIndex.value == 0),
//            onClick = {
//
//                selectedIndex.value = 0
//            })
//
//        BottomNavigationItem(icon ={
//            Icon(imageVector = Icons.Default.Favorite,"")
//        },
//            label = {
//                Text(text = "Favourite")
//            },
//            selected = (selectedIndex.value ==1),
//            onClick = {
//                selectedIndex.value = 1
//            })
//        BottomNavigationItem(icon = {
//            Icon(imageVector = Icons.Default.Person,"")
//
//        },
//            label = {
//                Text(text = "Profile")
//            },selected = (selectedIndex.value == 2),
//        onClick = {
//
//            selectedIndex.value = 2
//        })
//    }
//}
//
//
//@Composable
//fun ScaffoldWithBottomMenu(){
//
//    Scaffold (bottomBar = {BottomBar()}
//    ){
//        Box(modifier = Modifier
//            .background(Color.White)
//            .fillMaxSize()
//      )
//    }
//}




