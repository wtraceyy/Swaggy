package com.tracey.swaggy.ui.screens.form

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.navigation.ROUT_ITEM
import com.tracey.swaggy.R
import com.tracey.swaggy.ui.theme.Purplee

@Composable
fun FormScreen(navController: NavController){

    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var passwsord by remember { mutableStateOf("") }
    var confirmpasswsord by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().background(color = Purplee),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.shoppingcart))
        val progress by animateLottieCompositionAsState(composition)

        LottieAnimation(composition, progress,
            modifier = Modifier.size(200.dp)
        )
        //End of animation
        Spacer(modifier = Modifier.height(10.dp))

        //card

        Card(
            modifier = Modifier.fillMaxWidth().height(800.dp),
            shape = RoundedCornerShape(topStart = 60.dp , topEnd = 60.dp),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Swaggy",
                    fontSize = 30.sp,
                    color = Purplee,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Join us and start your journey today",
                    fontSize = 15.sp,
                )
                Spacer(modifier = Modifier.height(8.dp))

                //username
                OutlinedTextField(
                    value = username,
                    onValueChange ={username = it},
                    modifier = Modifier.fillMaxWidth().padding(start = 10.dp , end = 10.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person") },
                    label = { Text(text = "Username") },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Purplee,
                        focusedBorderColor = Color.Black,
                        unfocusedLeadingIconColor = Purplee,

                        ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

                )
                //end username

                Spacer(modifier = Modifier.height(8.dp))

                //email
                OutlinedTextField(
                    value = email,
                    onValueChange ={username = it},
                    modifier = Modifier.fillMaxWidth().padding(start = 10.dp , end = 10.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "person") },
                    label = { Text(text = "Email Address") },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Purplee,
                        focusedBorderColor = Color.Black,
                        unfocusedLeadingIconColor = Purplee,

                        ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)


                )
                //end email

                Spacer(modifier = Modifier.height(8.dp))

                //pwd
                OutlinedTextField(
                    value = passwsord,
                    onValueChange ={username = it},
                    modifier = Modifier.fillMaxWidth().padding(start = 10.dp , end = 10.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Lock,contentDescription ="person") },
                    label = { Text(text = "Passwsord") },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Purplee,
                        focusedBorderColor = Color.Black,
                        unfocusedLeadingIconColor = Purplee,

                        ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation()


                )
                //end pwd

                Spacer(modifier = Modifier.height(8.dp))

                //confirm pwd
                OutlinedTextField(
                    value = confirmpasswsord,
                    onValueChange ={username = it},
                    modifier = Modifier.fillMaxWidth().padding(start = 10.dp , end = 10.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "person") },
                    label = { Text(text = "Confirm Password") },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Purplee,
                        focusedBorderColor = Color.Black,
                        unfocusedLeadingIconColor = Purplee,

                        ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation()

                )
                //end confirm pwd

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {

                    },
                    colors = ButtonDefaults.buttonColors(Purplee),
                    modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp)
                ) {
                    Text(text = "Sign Up")

                }

                Spacer(modifier = Modifier.height(8.dp))

                TextButton(onClick = {}) {

                    Text(text = "Already have an account ? Log in")
                }


            }



        }
        //end of card





    }
    // end of screen


}

@Preview(showBackground = true)
@Composable
fun FormScreenPreview() {
    FormScreen(rememberNavController())
}