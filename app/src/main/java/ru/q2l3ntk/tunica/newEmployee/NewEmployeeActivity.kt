package ru.q2l3ntk.tunica.newEmployee

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import ru.q2l3ntk.tunica.ui.theme.TunicaTheme

class NewEmployeeActivity : ComponentActivity() {
    private val viewModel: NewEmployeeViewModel = NewEmployeeViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TunicaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NewEmployeeContent(activity = this, viewModel = viewModel)
                }
            }
        }
    }

    companion object {
        fun newIntent(activity: Activity): Intent = Intent(activity, NewEmployeeActivity::class.java)
    }
}