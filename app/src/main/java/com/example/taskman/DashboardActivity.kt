//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Text
//import androidx.compose.material3.surfaceColorAtElevation
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.example.taskman.Login
//
//class DashboardActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            Card()
//            CardWithShape()
//            CardWithBorder()
//            CardWithMultipleViews()
//            CardWithContentColor()
//        }
//    }
//}
//
//
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true)
//@Composable
//fun Card() {
//    val paddingModifier= Modifier.padding(10.dp)
//    androidx.compose.material3.Card (
//        surfaceColorAtElevation(10.dp), modifier = paddingModifier
//    ){
//        Text(text = "Simple Card with elevation",modifier = paddingModifier)
//    }
//
//
//
//}
//@Composable
//fun CardWithShape(){
//    val paddingModifier = Modifier.padding(10.dp)
//    androidx.compose.material3.Card {
//      Text(text= "Round corner shape",modifier = paddingModifier)
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun CardWithBorder(){
//    val paddingModifier =
//        Modifier.padding(10.dp)
//    androidx.compose.material3.Card(
//        surfaceColorAtElevation(10.dp), border = BorderStroke(1.dp, Color.Blue),
//        modifier = paddingModifier
//    ) {
//Text(text = "Card with blue border",modifier = paddingModifier)
//    }
//}
//
//
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun CardWithMultipleViews() {
//    val paddingModifier = Modifier.padding(10.dp)
//    androidx.compose.material3.Card(
//        surfaceColorAtElevation(10.dp), modifier = paddingModifier
//    )
//    {
//        Column(
//            modifier =
//            paddingModifier
//        ) {
//            Text(text = "First Text")
//            Text(text = "Second Text")
//        }
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun CardWithContentColor(){
//    val paddingModifier = Modifier.padding(10.dp)
//    androidx.compose.material3.Card(
//        surfaceColorAtElevation(10.dp),contentColor =Color.Blue,
//        modifier = paddingModifier
//    ) {
//        Column (modifier =
//        paddingModifier
//
//        ){
//    Text(text = "Text with card content color(Blue)",modifier = paddingModifier)
//    Text(text = "Text with card custom color",color = Color.Black,modifier = paddingModifier)
//}
//    }
//}


