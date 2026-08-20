package com.example.fastfood

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircleOutline
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Menu() {

    val verticalScrollState = rememberScrollState()
    var searchText by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )
    {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(verticalScrollState)
                .padding(
                    start = 40.dp,
                    top = 40.dp,
                    end = 40.dp,
                    bottom = 40.dp
                )
        )
        {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(
                    text = "Menu",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )

                Image(

                    painter = painterResource(R.drawable.capture_d_cran_19_8_2026_192248_www_bing_com),
                    contentDescription = "image background",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(30.dp))


            //champ de texte Search
            OutlinedTextField(
                value = searchText,
                onValueChange = { searchText = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp),
                placeholder = {
                    Text(
                        text = "Search",
                        fontSize = 21.sp,
                        color = Color.LightGray
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Rechercher"
                    )
                },
                shape = RoundedCornerShape(25.dp),
                singleLine = true
            )

            Spacer(modifier = Modifier.height(30.dp))


            // pour les 4 box
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Column(horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Image(

                        painter = painterResource(R.drawable.delicious_ramen_bowl_with_pork_and_egg),
                        contentDescription = "all",
                        modifier = Modifier
                            .size(70.dp)
                            .clip(RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "All",
                        fontSize = 20.sp
                    )
                }


                Column(horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Image(

                        painter = painterResource(R.drawable.braised_pork_belly),
                        contentDescription = "burger",
                        modifier = Modifier
                            .size(70.dp)
                            .clip(RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Burger",
                        fontSize = 20.sp
                    )
                }


                Column(horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Image(

                        painter = painterResource(R.drawable.img_20260511_wa0047),
                        contentDescription = "pizza",
                        modifier = Modifier
                            .size(70.dp)
                            .clip(RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Pizza",
                        fontSize = 20.sp
                    )
                }


                Column(horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Image(

                        painter = painterResource(R.drawable.img_20260511_wa0040),
                        contentDescription = "Desrt",
                        modifier = Modifier
                            .size(70.dp)
                            .clip(RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Desert",
                        fontSize = 20.sp
                    )
                }

            }
            Spacer(modifier = Modifier.height(25.dp))

            //promotion
            Text(
                text = "Promotions",
                fontSize = 24.sp
            )

            Spacer(modifier = Modifier.height(18.dp))


            //pour la box avec des frittes
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(20.dp))
                    .background(
                        Brush.horizontalGradient(colors = listOf(Color(0xFFFFE8A8), Color.White)),
                        shape = RoundedCornerShape(20.dp)
                    )
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .align(Alignment.TopEnd)
                ) {

                    Image(
                        painter = painterResource(
                            id = R.drawable
                                .franc_s_papas_fritas_en_un_caja_de_cart_n_caja_en_aislado_transparente_antecedentes
                        ),
                        contentDescription = "frites",
                        contentScale = ContentScale.Fit
                    )
                }

                Column(modifier = Modifier.padding(start = 15.dp, top = 20.dp))
                {
                    Text(
                        text = "Today's Offer",
                        color = Color.Red,
                        fontSize = 22.sp
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Free box of fried",
                        color = Color.Red,
                        fontSize = 20.sp, fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "on all orders above 1000fcfa",
                        color = Color.Red,
                        fontSize = 20.sp, fontWeight = FontWeight.Bold
                    )

                }
            }
            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Popular",
                fontSize = 24.sp
            )
            Spacer(modifier = Modifier.height(19.dp))


            //les 2 cartes
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {

                // CARTE BURGER

                Box(
                    modifier = Modifier
                        .width(155.dp)
                ) {

                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color(0xFFFFEEEE))
                    ) {

                        Image(
                            painter = painterResource(
                                id = R.drawable.img_20260511_wa0044
                            ),
                            contentDescription = "burger",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(115.dp)
                                .clip(RoundedCornerShape(20.dp)),
                            contentScale = ContentScale.Crop
                        )

                        Column(
                            modifier = Modifier.padding(15.dp)
                        ) {

                            Text(
                                text = "Beef Burger",
                                fontSize = 22.sp
                            )

                            Spacer(
                                modifier = Modifier.height(8.dp)
                            )

                            Text(
                                text = "2000 FCFA",
                                fontSize = 20.sp
                            )
                        }
                    }

                    IconButton(
                        modifier = Modifier
                            .align(Alignment.BottomEnd),
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color.Transparent
                        ),
                        onClick = {}
                    ) {
                        Icon(
                            imageVector = Icons.Default.AddCircleOutline,
                            contentDescription = "Ajouter",
                            tint = Color.Green
                        )
                    }
                }


                //  CARTE RAMEN

                Box(
                    modifier = Modifier
                        .width(155.dp)
                ) {

                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color(0xFFFFEEEE))
                    ) {

                        Image(
                            painter = painterResource(
                                id = R.drawable.img_20260511_wa0052
                            ),
                            contentDescription = "ramen",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(115.dp)
                                .clip(RoundedCornerShape(20.dp)),
                            contentScale = ContentScale.Crop
                        )

                        Column(
                            modifier = Modifier.padding(15.dp)
                        ) {

                            Text(
                                text = "Ramen bowl",
                                fontSize = 22.sp
                            )

                            Spacer(
                                modifier = Modifier.height(8.dp)
                            )

                            Text(
                                text = "2500 FCFA",
                                fontSize = 20.sp
                            )
                        }
                    }

                    IconButton(
                        modifier = Modifier
                            .align(Alignment.BottomEnd),
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color.Transparent
                        ),
                        onClick = {}
                    ) {
                        Icon(
                            imageVector = Icons.Default.AddCircleOutline,
                            contentDescription = "Ajouter",
                            tint = Color.Green
                        )
                    }
                }
            }

        }

        val horizontalScrollState = rememberScrollState()
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .horizontalScroll(horizontalScrollState)
                .background(Color.White),
            verticalAlignment = Alignment.CenterVertically
        ) {

            IconButton(
                modifier = Modifier.width(100.dp),
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Accueil",
                    tint =Color(0xFFE89A00)
                )
            }

            IconButton(
                modifier = Modifier.width(100.dp),
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Recherche"
                )
            }

            IconButton(
                modifier = Modifier.width(100.dp),
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = "Panier",
                    tint =Color(0xFFE89A00)
                )
            }

            IconButton(
                modifier = Modifier.width(150.dp),
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Profil"
                )
            }
        }
    }
}