package com.example.socialmedia

open class BottomNavigationItem(var rout:String, var icon:Int) {
    object Home :BottomNavigationItem("Home",R.drawable.ic_outline_home_24)
    object Search :BottomNavigationItem("Search",R.drawable.ic_outline_search_24)
    object Add :BottomNavigationItem("Add",R.drawable.ic_baseline_add_circle_outline_24)
    object Activites :BottomNavigationItem("Activites",R.drawable.ic_baseline_favorite_border_24)
    object Profile :BottomNavigationItem("Profile",R.drawable.ic_baseline_person_pin_24)
}