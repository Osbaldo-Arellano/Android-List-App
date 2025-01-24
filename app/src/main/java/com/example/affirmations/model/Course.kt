/**
 * Course.kt
 *
 * The Course data class holds the details of a course.
 * Each Course has a title, department, course number, and capacity.
 *
 * Example:
 * val course = Course(
 *     title = R.string.course_title,
 *     department = R.string.department_name,
 *     number = 101,
 *     capacity = 50
 * )
 *
 * Author: Osbaldo Arellano
 * Date: 1/24/2025
 */


package com.example.affirmations.model

import androidx.annotation.StringRes

data class Course(
    @StringRes val title: Int,
    @StringRes val department: Int,
    val number: Int,
    val capacity: Int
)