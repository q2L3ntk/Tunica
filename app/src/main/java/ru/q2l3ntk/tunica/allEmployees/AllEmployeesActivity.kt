package ru.q2l3ntk.tunica.allEmployees

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

class AllEmployeesActivity : ComponentActivity() {
    private val viewModel: AllEmployeesViewModel = AllEmployeesViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TunicaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) { AllEmployeesContent(activity = this, viewModel = viewModel) }
            }
        }
    }

    companion object {
        fun newIntent(activity: Activity): Intent = Intent(activity, AllEmployeesActivity::class.java)
    }
}