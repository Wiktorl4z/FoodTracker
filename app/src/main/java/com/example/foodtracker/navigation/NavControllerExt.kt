package com.example.foodtracker.navigation

import androidx.navigation.NavController
import com.example.foodtracker.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}