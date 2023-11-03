import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.groceryapp.R
import com.example.groceryapp.ui.theme.DIMENS_114dp
import com.example.groceryapp.ui.theme.DIMENS_12dp
import com.example.groceryapp.ui.theme.DIMENS_16dp
import com.example.groceryapp.ui.theme.DIMENS_46dp
import com.example.groceryapp.ui.theme.DIMENS_4dp
import com.example.groceryapp.ui.theme.DIMENS_76dp
import com.example.groceryapp.ui.theme.DIMENS_8dp

@Composable
fun CategoryItem(
    image: Int,
    label: String,
    modifier: Modifier = Modifier
        .width(DIMENS_76dp)
        .height(DIMENS_114dp)
        .padding(horizontal = DIMENS_12dp)
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {

        Box(
            modifier = Modifier
                .background(
                    color = Color(0x3351BC7D),
                    shape = RoundedCornerShape(size = DIMENS_16dp)
                )
                .padding(DIMENS_4dp)
                .height(DIMENS_46dp)
                .width(DIMENS_46dp),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )

        }

        Spacer(modifier = Modifier.height(DIMENS_8dp))

        Text(
            text = label,
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center
            )
        )

    }
}

@Preview(showBackground = true)
@Composable
fun CategoryItemPreview() {
    CategoryItem(
        image = R.drawable.frango,
        label = "Fast Food"
    )
}
