package com.example.fastfood

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.IosShare
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfilClient(
    onValidation: () -> Unit,
    onBack: () -> Unit
) {
    Scaffold(
        containerColor = Color(0xFFE89A00),
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFE89A00)),
                title = {
                    Text("")
                },
                navigationIcon = {
                    IconButton(
                        onClick = onBack
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Retour", tint = Color.Black
                        )
                    }
                },
                actions = {
                    IconButton(onClick = {}
                    ) {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "Notification", tint = Color.Black
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {


            //le box en blanc
            Column(
                modifier = Modifier
                    .padding(top = 120.dp)
                    .fillMaxSize()
                    .shadow(
                        elevation = 1.dp,
                        shape = RoundedCornerShape(
                            topStart = 30.dp,
                            topEnd = 30.dp,
                        )
                    )
                    .background(Color.White)
                    .padding(30.dp)

            )
            {
                Spacer(modifier = Modifier.height(50.dp))

                //les 4 champs de texte
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text("Name")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RoundedCornerShape(18.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text("Email")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RoundedCornerShape(18.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text("delivery address")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RoundedCornerShape(18.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text("Password")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RoundedCornerShape(18.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                //les texte avec l'icone
                Column(
                    modifier = Modifier.fillMaxWidth()

                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Payment details", fontSize = 18.sp)

                        Icon(
                            imageVector = Icons.Default.ChevronRight,
                            contentDescription = ""
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Order history", fontSize = 18.sp)

                        Icon(
                            imageVector = Icons.Default.ChevronRight,
                            contentDescription = ""
                        )
                    }
                }

                Spacer(modifier = Modifier.height(70.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .weight(1f)
                            .height(65.dp),
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                    ) {
                        Text(
                            text = "Edit Profile",
                            fontSize = 20.sp
                        )
                        Icon(
                            imageVector = Icons.Default.Logout,
                            contentDescription = "",
                            tint =   Color(0xFFE89A00)
                        )

                    }

                    TextButton(
                        onClick = onValidation,
                        modifier = Modifier
                            .weight(1f)
                            .height(65.dp)
                            .border(
                                width = 1.dp,
                                color = Color(0xFFE89A00),
                                shape = RoundedCornerShape(20.dp)
                            ),

                        // colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                    ) {
                        Text(
                            text = "Check",
                            fontSize = 20.sp,
                            color = Color(0xFFE89A00)
                        )
                    }
                }
            }

            //le cercle du milieu pour le profil
            Box(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .size(150.dp)
                    .clip(CircleShape)
                    .background(Color.Yellow),
            ) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(R.drawable.capture_d_cran_19_8_2026_192248_www_bing_com),
                    contentDescription = "image background",
                    contentScale = ContentScale.Crop
                )
            }

        }
    }
}