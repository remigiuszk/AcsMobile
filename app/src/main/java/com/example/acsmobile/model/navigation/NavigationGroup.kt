package com.example.acsmobile.model.navigation

public class NavigationGroup(var name:String, var icon:Int, var children:List<NavigationItem>, var fragmentId: Int?) {
    var hasChildren = children.isNotEmpty()
}