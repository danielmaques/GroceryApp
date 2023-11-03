package com.example.groceryapp.presenter.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.groceryapp.R
import com.example.groceryapp.domain.model.ProductItem
import com.example.groceryapp.ui.theme.Black
import com.example.groceryapp.ui.theme.DIMENS_10dp
import com.example.groceryapp.ui.theme.DIMENS_2dp
import com.example.groceryapp.ui.theme.DIMENS_32dp
import com.example.groceryapp.ui.theme.DIMENS_8dp
import com.example.groceryapp.ui.theme.Green

@Composable
fun ProductCard(
    modifier: Modifier = Modifier,
    productItem: ProductItem
) {
    Card(
        shape = RoundedCornerShape(DIMENS_10dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = DIMENS_2dp
        ),
        modifier = modifier
            .width(157.dp)
    ) {

        Column(
            Modifier.background(Color.White),
        ) {

            Image(
                painter = painterResource(id = productItem.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .height(131.dp)
            )

            Column(modifier = Modifier.padding(DIMENS_10dp)) {

                Text(
                    text = productItem.title,
                    style = MaterialTheme.typography.headlineSmall,
                    color = Black,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(DIMENS_8dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "R$ ${productItem.price}",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight(700),
                            letterSpacing = 0.26.sp,
                            color = Green
                        ),
                    )

                    Button(
                        modifier = Modifier.size(DIMENS_32dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Green),
                        shape = RoundedCornerShape(DIMENS_8dp),
                        contentPadding = PaddingValues(DIMENS_10dp),
                        onClick = {
                        }
                    )

                    {

                        Icon(
                            modifier = Modifier.fillMaxSize(),
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add",
                            tint = Color.White
                        )

                    }
                }
            }
        }
    }
}

@Preview()
@Composable
fun ItemPreview() {
    ProductCard(
        productItem = ProductItem(
            id = 1,
            title = "Title",
            description = "description",
            image = R.drawable.food,
            unit = "unit",
            price = 1.0,
            nutritions = "nutritions",
            review = 1.0
        )
    )
}