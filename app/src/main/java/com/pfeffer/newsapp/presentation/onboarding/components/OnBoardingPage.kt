package com.pfeffer.newsapp.presentation.onboarding.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.pfeffer.newsapp.R
import com.pfeffer.newsapp.presentation.Dimension.MediumPadding1
import com.pfeffer.newsapp.presentation.Dimension.MediumPadding2
import com.pfeffer.newsapp.presentation.onboarding.Page
import com.pfeffer.newsapp.presentation.onboarding.pages
import com.pfeffer.newsapp.ui.theme.NewsAppTheme

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier, page: Page
) {

    Column(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = page.image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6f)
        )

        Spacer(
            modifier = Modifier.height(MediumPadding1)
        )

        Text(
            text = page.title,
            modifier = Modifier.padding(horizontal = MediumPadding2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)
        )

        Text(
            text = page.title,
            modifier = Modifier.padding(horizontal = MediumPadding2),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)
        )
    }

}

@Preview(showBackground = true)
@Preview(uiMode = UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun OnBoardingPagePreview() {
    NewsAppTheme {
        OnBoardingPage(
            page = pages[0]
        )
    }
}