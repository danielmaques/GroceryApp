package com.example.groceryapp.presenter.components

import CategoryItem
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.groceryapp.R
import com.example.groceryapp.ui.theme.DIMENS_2dp
import com.example.groceryapp.ui.theme.DIMENS_8dp

@Composable
fun ListCategory(categoriesImage: List<Int>, categoriesLabel: List<String>) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(DIMENS_2dp),
        contentPadding = PaddingValues(DIMENS_8dp)
    ) {
        items(categoriesImage.size) { index ->
            CategoryItem(
                image = categoriesImage[index],
                label = categoriesLabel[index]
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListCategoryPreview() {
    ListCategory(
        categoriesImage = listOf(
            R.drawable.burguer,
            R.drawable.frango,
            R.drawable.frango
        ),
        categoriesLabel = listOf(
            "Burguer",
            "Fast Food",
            "Fast Food"
        )

    )
}
