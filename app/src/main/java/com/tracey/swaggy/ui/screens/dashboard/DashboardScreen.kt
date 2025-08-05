package com.tracey.swaggy.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tracey.swaggy.R
import com.tracey.swaggy.ui.theme.Bluee
import com.tracey.swaggy.ui.theme.Orangee
import com.tracey.swaggy.ui.theme.Pink
import com.tracey.swaggy.ui.theme.Teal
import android.annotation.SuppressLint as SuppressLint1

@SuppressLint1("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen() {

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {

        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.White
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        //navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "Favorites") },
                    label = { Text("") },
                    selected = selectedIndex == 3,
                    onClick = { selectedIndex = 3
                        // navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Pink,
                modifier = Modifier.offset(y = 40.dp),
                shape = CircleShape,

            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        content = {


            Column(
                modifier = Modifier
                    .padding( top = 40.dp)
                    .verticalScroll(rememberScrollState()),

            ) {
                Row(

                ) {
                    Column(

                    ) {
                        Text(
                            text = "Hi Samantha ",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 20.dp)
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Here are your projects",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 20.dp)


                        )
                    }

                    Image(
                        painter = painterResource(R.drawable.teacher),
                        contentDescription = "shoe",
                        modifier = Modifier.fillMaxWidth().height(150.dp),
                    )

                }


                Spacer(modifier = Modifier.height(40.dp))

                //row
                Row(
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .horizontalScroll(rememberScrollState())

                ) {
                    //card
                    Card(onClick = {},
                        modifier = Modifier.width(200.dp).height(300.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        //colors = CardDefaults.cardColors(Teal)
                        colors = CardDefaults.cardColors(Bluee)
                    ) {
                        Column(

                        ) {
                            Image(
                                painter = painterResource(R.drawable.card),
                                contentDescription = "shoe",
                                modifier = Modifier.fillMaxWidth().height(150.dp).padding(start = 10.dp , end = 40.dp , top = 60.dp , bottom = 20.dp),
                            )

                            Text(
                                text = " Cryptocurrency landing page ",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 20.dp)

                            )
                            Spacer(modifier = Modifier.height(10.dp))


                            Text(
                                text = "12 likes",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp)

                            )




                        }


                    }


                    //end of card
                    Spacer(modifier = Modifier.width(20.dp))

                    //card
                    Card(onClick = {},
                        modifier = Modifier.width(200.dp).height(300.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        //colors = CardDefaults.cardColors(Teal)
                        colors = CardDefaults.cardColors(Orangee)

                    ) {
                        Column(

                        ) {
                            Image(
                                painter = painterResource(R.drawable.chart),
                                contentDescription = "shoe",
                                modifier = Modifier.fillMaxWidth().height(150.dp).padding(start = 10.dp , end = 40.dp , top = 60.dp , bottom = 20.dp),
                            )

                            Text(
                                text = " Statistics Dashboard ",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 20.dp)

                            )
                            Spacer(modifier = Modifier.height(20.dp))


                            Text(
                                text = "12 likes ",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp)

                            )




                        }


                    }

                    //end of card
                    Spacer(modifier = Modifier.width(20.dp))

                    //card
                    Card(onClick = {},
                        modifier = Modifier.width(200.dp).height(300.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        //colors = CardDefaults.cardColors(Teal)
                        colors = CardDefaults.cardColors(Teal)

                    ) {
                        Column(

                        ) {
                            Image(
                                painter = painterResource(R.drawable.chart),
                                contentDescription = "shoe",
                                modifier = Modifier.fillMaxWidth().height(150.dp).padding(start = 10.dp , end = 40.dp , top = 60.dp , bottom = 20.dp),
                            )

                            Text(
                                text = " Statistics Dashboard ",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 20.dp)

                            )
                            Spacer(modifier = Modifier.height(20.dp))


                            Text(
                                text = "12 likes ",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp)

                            )




                        }


                    }

                    //end of card


                }
                //end of row
                Spacer(modifier = Modifier.height(40.dp))



                //column
                Column(
                    modifier = Modifier
                        .background(color = Color.LightGray)
                        .fillMaxSize()

                ) {
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = " Personal Tasks ",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 20.dp)

                    )

                    Spacer(modifier = Modifier.height(20.dp))


                    //card
                    Card(onClick = {},
                        modifier = Modifier.fillMaxWidth().height(80.dp).padding(start = 30.dp, end = 30.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        //colors = CardDefaults.cardColors(Teal)
                        colors = CardDefaults.cardColors(Color.White)  ,

                    ) {

                            Row (

                            ){
                                Image(painter = painterResource(R.drawable.video),
                                    contentDescription = "video",
                                    modifier = Modifier.padding(20.dp)

                                )



                                Column(

                                ) {
                                    Row() {
                                        Text(
                                            text = "NDA Review for website project ",
                                            fontSize = 15.sp,
                                            fontWeight = FontWeight.Bold,
                                            modifier = Modifier.padding(top=20.dp)

                                        )
                                        Image(painter = painterResource(R.drawable.reddot),
                                            contentDescription = "video",
                                            alignment = Alignment.TopEnd,

                                            )

                                    }

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Column(

                                    ) {
                                        Text(
                                            text = "Today - 10pm ",
                                            fontSize = 15.sp,

                                        )

                                    }
                                }





                            }




                    }


                    //end of card

                    Spacer(modifier = Modifier.height(20.dp))


                    //card
                    Card(onClick = {},
                        modifier = Modifier.fillMaxWidth().height(80.dp).padding(start = 30.dp, end = 30.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        //colors = CardDefaults.cardColors(Teal)
                        colors = CardDefaults.cardColors(Color.White)  ,
                    ) {

                        Row (

                        ){
                            Image(painter = painterResource(R.drawable.mail),
                                contentDescription = "video",
                                modifier = Modifier.padding(20.dp)


                            )


                            Column(

                            ) {
                                Row {
                                    Text(
                                        text = "Email Reply for Green Project ",
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(start = 20.dp, top = 20.dp)

                                    )
                                    Image(painter = painterResource(R.drawable.bluedot),
                                        contentDescription = "video",
                                        modifier = Modifier,
                                        alignment = Alignment.TopEnd,

                                        )

                                }


                                Spacer(modifier = Modifier.height(10.dp))

                                Column(

                                ) {
                                    Text(
                                        text = "Today - 10pm ",
                                        fontSize = 15.sp,
                                        modifier = Modifier.padding(start = 20.dp)

                                    )

                                }
                            }





                        }




                    }




                    //end of card





                }
                //end of column









            }
        },
    )

    //End of scaffold



}

@Preview(showBackground =true)
@Composable
fun DashboardScreenPreview() {
    DashboardScreen()
}