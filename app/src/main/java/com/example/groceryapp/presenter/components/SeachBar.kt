package com.example.groceryapp.presenter.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.groceryapp.ui.theme.Black
import com.example.groceryapp.ui.theme.DIMENS_16dp
import com.example.groceryapp.ui.theme.DIMENS_48dp
import com.example.groceryapp.ui.theme.GrayBackground
import com.example.groceryapp.ui.theme.GraySecondTextColor

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    query: String = "",
    hint: String,
    onClickSearch: (String) -> Unit = {},
    onValueChange: (String) -> Unit = {},
) {
    TextField(
        modifier = modifier
            .padding(DIMENS_16dp)
            .fillMaxWidth()
            .height(DIMENS_48dp)
            .clip(RoundedCornerShape(DIMENS_16dp)),
        value = query,
        onValueChange = {
            onValueChange.invoke(it)
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = Color.Black
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = GrayBackground,
            disabledIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        placeholder = {
            Text(
                text = hint,
                fontWeight = FontWeight.SemiBold,
                color = GraySecondTextColor,
                fontSize = 12.sp
            )
        },
        singleLine = true,
        textStyle = TextStyle(
            fontWeight = FontWeight.SemiBold,
            color = Black,
            fontSize = 12.sp

        ),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Search
        ),
        keyboardActions = KeyboardActions(
            onSearch = {
                onClickSearch.invoke(query)
            }
        ),
    )
}

@Preview()
@Composable
fun SearchBarPreview() {
    SearchBar(
        query = "",
        hint = "Buscar",
        onClickSearch = {},
    )
}