package ru.q2l3ntk.tunica.menu

import android.app.Activity
import androidx.lifecycle.ViewModel
import ru.q2l3ntk.tunica.allEmployees.AllEmployeesActivity
import ru.q2l3ntk.tunica.newEmployee.NewEmployeeActivity

class MenuViewModel : ViewModel() {
    fun launchAllEmployeesScreen(activity: Activity) = activity.startActivity(AllEmployeesActivity.newIntent(activity))

    fun launchNewEmployeesScreen(activity: Activity) = activity.startActivity(NewEmployeeActivity.newIntent(activity))
}