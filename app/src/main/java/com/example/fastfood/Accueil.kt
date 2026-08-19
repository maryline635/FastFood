package com.example.fastfood

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun accueil(
    onGetStarted: () -> Unit
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(35.dp))
    )
    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(R.drawable.img_20260511_wa0030),
        contentDescription = "image background",
        contentScale = ContentScale.Crop
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.65f))
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 40.dp, vertical = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {

            Spacer(modifier = Modifier.height(30.dp))
            Image(
                modifier = Modifier
                    .size(330.dp)
                    .clip(RoundedCornerShape(30.dp)),
                painter = painterResource(R.drawable.img_20260511_wa0051),
                contentDescription = "logo"
            )

            Spacer(modifier = Modifier.height(50.dp))

            Text(
                text = "ENJOY YOUR\n FOOD", color = Color.White,
                lineHeight = 60.sp,
                fontWeight = FontWeight.Bold, fontSize = 40.sp, textAlign = TextAlign.Center
            )


            Spacer(modifier = Modifier.weight(1f))


            Button(
                onClick = onGetStarted, modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp),
                shape = RoundedCornerShape(22.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {

                Text(
                    text = "GET STARTED",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold, color = Color(0xFFE89A00)
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}
