/**
 * MainActivity.kt
 *
 * This file serves as the entry point for the application.
 *
 * Author: Osbaldo Arellano
 * Date: 1/24/2025
 */

package com.example.affirmations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.affirmations.data.Datasource
import com.example.affirmations.model.Course
import com.example.affirmations.ui.theme.AffirmationsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AffirmationsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CoursesApp()
                }
            }
        }
    }
}

@Composable
fun CoursesApp() {
    CourseList(
        courseList = Datasource().loadCourses(),
    )
}

@Composable
fun CourseList(courseList: List<Course>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        // Add extra top margin to the first card
        // to avoid the card being placed beneath the camera
        // SOURCE: https://stackoverflow.com/questions/70755946/android-jetpack-compose-lazy-column-items-with-index
        itemsIndexed(courseList) { index, course ->
            CourseCard(
                course = course,
                modifier = Modifier
                    .padding(
                        start = 8.dp,
                        end = 8.dp,
                        top = if (index == 0) 60.dp else 8.dp,
                        bottom = 8.dp
                    )
            )
        }
    }
}


@Composable
fun CourseCard(course: Course, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        // SOURCE: https://developer.android.com/develop/ui/compose/components/card
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        Column {
            Text(
                text = "${stringResource(course.department)} ${course.number}",
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                text = stringResource(course.title),
                modifier = Modifier.padding(horizontal = 16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Capacity: ${course.capacity}",
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}


@Preview
@Composable
private fun CourseCardPreview() {
    CourseCard(
        Course(
            title = R.string.CS161_title,
            department = R.string.department_cs,
            number = 161,
            capacity = 100
        )
    )
}
