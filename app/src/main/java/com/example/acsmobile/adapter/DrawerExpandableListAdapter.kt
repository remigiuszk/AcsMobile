package com.example.acsmobile.adapter

import android.content.Context
import android.database.DataSetObserver
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.acsmobile.model.navigation.NavigationGroup
import com.example.acsmobile.R

class DrawerExpandableListAdapter(
        private var context: Context, private var itemsList: List<NavigationGroup>
):ExpandableListAdapter {

    override fun registerDataSetObserver(observer: DataSetObserver?) {
    }

    override fun unregisterDataSetObserver(observer: DataSetObserver?) {
    }

    override fun getGroupCount(): Int {
        return itemsList.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return itemsList[groupPosition].children.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return itemsList[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): String {
        //return itemList[titleList[groupPosition]]!![childPosition]
        return itemsList[groupPosition].children[childPosition].name
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        val selectedGroup: NavigationGroup = getGroup(groupPosition) as NavigationGroup
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_group, null)
        }
        val titleText = convertView!!.findViewById<TextView>(R.id.listTitle)

        titleText.setTypeface(null, Typeface.BOLD)
        titleText.text = selectedGroup.name
        val icon = convertView.findViewById<ImageView>(R.id.listIcon)
        icon.setImageResource(selectedGroup.icon)
        val ind: ImageView = convertView.findViewById<ImageView>(R.id.explist_indicator)
        if (getChildrenCount(groupPosition) == 0) {
            ind.visibility = View.INVISIBLE
        } else {
            if(isExpanded){
                ind.setImageResource(R.drawable.expander_ic_maximized)
            }
            else
            {
                ind.setImageResource(R.drawable.expander_ic_minimized)
            }
            ind.visibility = View.VISIBLE
        }
        return convertView
    }

    override fun getChildView(
            groupPosition: Int,
            childPosition: Int,
            isLastChild: Boolean,
            convertView: View?,
            parent: ViewGroup?
    ): View? {
        var convertView = convertView
        if(itemsList[groupPosition].children.isNotEmpty()) {
            val title: String = getChild(groupPosition, childPosition)

            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null)
            }
            val childText = convertView?.findViewById<TextView>(R.id.expandableListItem)
            childText?.text = title
        }
        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    override fun areAllItemsEnabled(): Boolean {
        return true
    }

    override fun isEmpty(): Boolean {
        return false
    }

    override fun onGroupExpanded(groupPosition: Int) {
    }

    override fun onGroupCollapsed(groupPosition: Int) {
    }

    override fun getCombinedChildId(groupId: Long, childId: Long): Long {
        return childId
    }

    override fun getCombinedGroupId(groupId: Long): Long {
        return groupId
    }

}