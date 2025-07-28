package com.tracey.swaggy.ui.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tracey.swaggy.R
import com.tracey.swaggy.ui.theme.Teal
import com.tracey.swaggy.ui.theme.Whitee


@Composable
fun AboutScreen(navController: NavController){
Column(
    modifier = Modifier.fillMaxSize().background(Whitee),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,
) {
    Image(painter = painterResource(R.drawable.img),
        contentDescription = "comp",
        modifier = Modifier.size(150.dp)

    )
    Spacer(modifier = Modifier.height(40.dp))

    Text(
        text = "Easy Shopping",
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,

    )
    Spacer(modifier = Modifier.height(10.dp))

    Text(
        text = "I love shopping, especially with my friends. I usually go to the market for shopping clothes or technical items as these 2 things are most important to me.",
        fontSize = 15.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(start = 40.dp,end = 40.dp)

    )
    Spacer(modifier = Modifier.height(50.dp))

    Row(


    ) {
        Image(
            painter = painterResource(R.drawable.dot),
            contentDescription = "dot",
            modifier = Modifier.size(40.dp)
        )

        Spacer(modifier = Modifier.width(200.dp))

        Text(
            text = "Skip",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )


    }








}






}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen(rememberNavController())
}