package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Course

class Datasource {
    fun loadCourses(): List<Course> {
        return listOf(
            Course(
                title = R.string.name,
                department = R.string.department_assignment,
                number = 3,
                capacity = 1
            ),
            Course(
                title = R.string.CS161_title,
                department = R.string.department_cs,
                number = 161,
                capacity = 100
            ),
            Course(
                title = R.string.CS162_title,
                department = R.string.department_cs,
                number = 162,
                capacity = 100
            ),
            Course(
                title = R.string.CS225_title,
                department = R.string.department_cs,
                number = 225,
                capacity = 200
            ),
            Course(
                title = R.string.CS261_title,
                department = R.string.department_cs,
                number = 261,
                capacity = 200
            ),
            Course(
                title = R.string.CS271_title,
                department = R.string.department_cs,
                number = 271,
                capacity = 200
            ),
            Course(
                title = R.string.CS290_title,
                department = R.string.department_cs,
                number = 290,
                capacity = 200
            ),
            Course(
                title = R.string.CS325_title,
                department = R.string.department_cs,
                number = 325,
                capacity = 300
            ),
            Course(
                title = R.string.CS340_title,
                department = R.string.department_cs,
                number = 340,
                capacity = 300
            ),
            Course(
                title = R.string.CS344_title,
                department = R.string.department_cs,
                number = 344,
                capacity = 300
            ),
            Course(
                title = R.string.CS361_title,
                department = R.string.department_cs,
                number = 361,
                capacity = 300
            ),
            Course(
                title = R.string.CS362_title,
                department = R.string.department_cs,
                number = 362,
                capacity = 300
            ),
            Course(
                title = R.string.CS467_title,
                department = R.string.department_cs,
                number = 467,
                capacity = 400
            )
        )
    }
}
