package com.tracey.swaggy.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tracey.swaggy.R
import com.tracey.swaggy.ui.theme.Newyellow
import com.tracey.swaggy.ui.theme.Purplee
import com.tracey.swaggy.ui.theme.Teal

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(){

    Column(
        modifier = Modifier.fillMaxSize(),

    ) {
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Teal,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White,
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu"
                    )
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "cart"
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "notification"
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "star"
                    )
                }
            }
        )
        //end of TopAppBar

        Image(
            painter = painterResource(R.drawable.car),
            contentDescription = "car",
            modifier = Modifier.fillMaxWidth().height(250.dp),
            contentScale = ContentScale.FillWidth
        )

        Spacer(modifier = Modifier.height(40.dp))

        //Search bar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp , end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search") },
            placeholder = { Text(text = "Search products ... ") },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Teal,
                focusedBorderColor = Color.Blue
            )
        )


        //End of search bar
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Other Products ",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(10.dp))

        // beginning of row
        Row(
            modifier = Modifier.padding(start = 20.dp)
        ) {
            Image(painter = painterResource(R.drawable.shoes),
                 contentDescription = "shoe",
                 modifier = Modifier.size(width = 150.dp, height = 180.dp)
                )

        Spacer(modifier = Modifier.width(10.dp))

        Column() {
            Text(
                text = "Stylish converse shoe",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Brand : Tommy Hillfigure",
                fontSize = 15.sp,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Price : ksh.2000 ",
                fontSize = 15.sp,
                textDecoration = TextDecoration.LineThrough,
                )
            
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Now : ksh.1800 ",
                fontSize = 15.sp,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Material: Cotton ",
                fontSize = 15.sp,
            )

            Spacer(modifier = Modifier.height(10.dp))

        Row() {
            Icon( imageVector = Icons.Default.Star, contentDescription = "star", tint = Newyellow,)
            Icon( imageVector = Icons.Default.Star, contentDescription = "star", tint = Newyellow,)
            Icon( imageVector = Icons.Default.Star, contentDescription = "star", tint = Newyellow,)
            Icon( imageVector = Icons.Default.Star, contentDescription = "star", tint = Newyellow,)
            Icon( imageVector = Icons.Default.Star, contentDescription = "star", tint = Color.Gray,)

        }
        Button(
            onClick ={},
            colors = ButtonDefaults.buttonColors(Teal),
            shape = RectangleShape



        ) {
            Text(text = "Buy Now")
        }

        }



        }
        // end of row




    }

}




@Preview(showBackground = true)
@Composable
fun ItemScreenPreview() {
    ItemScreen()
}