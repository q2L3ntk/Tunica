package ru.q2l3ntk.tunica.menu

import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
internal fun MenuContent(activity: Activity, viewModel: MenuViewModel) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Tunica",
                        maxLines = 1,
                        color = colorScheme.onPrimary,
                        fontSize = 18.sp,
                        style = MaterialTheme.typography.titleMedium
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = colorScheme.secondary)
            )
        }) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(modifier = Modifier.padding(bottom = 10.dp), text = "Выберите доступное действие:")
            Button(
                onClick = { viewModel.launchAllEmployeesScreen(activity) },
                modifier = Modifier.width(300.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorScheme.secondary),
                shape = MaterialTheme.shapes.medium
            ) { Text(text = "Все сотрудники") }
            Button(
                onClick = { viewModel.launchNewEmployeesScreen(activity) },
                modifier = Modifier.width(300.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorScheme.secondary),
                shape = MaterialTheme.shapes.medium
            ) { Text(text = "Добавить сотрудника") }
        }
    }
}

@Preview
@Composable
internal fun MenuContentPreview() {
    MenuContent(
        activity = MenuActivity(),
        viewModel = MenuViewModel(),
    )
}