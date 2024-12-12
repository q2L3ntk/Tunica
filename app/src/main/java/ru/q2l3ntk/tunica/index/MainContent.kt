package ru.q2l3ntk.tunica.index

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.q2l3ntk.tunica.ui.theme.BackgroundC

@Composable
internal fun MainContent(activity: MainActivity, view: MainActivityView) {
    Scaffold(
        containerColor = BackgroundC
    ) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {},
                modifier = Modifier.width(300.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorScheme.secondary),
                shape = MaterialTheme.shapes.medium
            ) { Text("Войти как организация") }
            Button(
                onClick = {},
                modifier = Modifier.width(300.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorScheme.secondary),
                shape = MaterialTheme.shapes.medium
            ) { Text("Войти как сотрудник") }
        }
    }
}

@Preview
@Composable
internal fun MainContentPreview() {
    MainContent(
        activity = MainActivity(),
        view = MainActivityView()
    )
}