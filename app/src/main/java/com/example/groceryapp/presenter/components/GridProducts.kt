package com.example.groceryapp.presenter.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.groceryapp.R
import com.example.groceryapp.domain.model.ProductItem

@Composable
fun GridProducts(
    modifier: Modifier = Modifier,
    products: List<ProductItem>,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(20.dp),
        verticalArrangement = Arrangement.spacedBy(21.dp),
        horizontalArrangement = Arrangement.spacedBy(21.dp)
    ) {
        items(products.size) { _ ->
            ProductCard(
                productItem = products[0],
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GridProductsPreview() {
    GridProducts(
        modifier = Modifier,
        products = listOf(
            ProductItem(
                id = 1,
                title = "Title",
                description = "description",
                image = R.drawable.food,
                unit = "unit",
                price = 1.0,
                nutritions = "nutritions",
                review = 1.0
            ),
            ProductItem(
                id = 1,
                title = "Title",
                description = "description",
                image = R.drawable.food,
                unit = "unit",
                price = 1.0,
                nutritions = "nutritions",
                review = 1.0
            ),
            ProductItem(
                id = 1,
                title = "Title",
                description = "description",
                image = R.drawable.food,
                unit = "unit",
                price = 1.0,
                nutritions = "nutritions",
                review = 1.0
            ),
            ProductItem(
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
    )
}