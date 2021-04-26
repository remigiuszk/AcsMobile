package com.example.acsmobile

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ExpandableListView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.acsmobile.adapter.DrawerExpandableListAdapter
import com.example.acsmobile.model.navigation.NavigationGroup
import com.example.acsmobile.model.navigation.NavigationItem
import com.example.acsmobile.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import java.util.*
import javax.net.ssl.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: DrawerExpandableListAdapter
    private lateinit var expandableListView: ExpandableListView
    private lateinit var mDrawerToggle: ActionBarDrawerToggle
    private lateinit var mDrawerLayout: DrawerLayout
    private lateinit var navController: NavController

    private lateinit var mActivityTitle: String

    private val groupsList = ArrayList<NavigationGroup>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        setupExpandableListView()
        addDrawersItem()
        setupDrawer()
        setupNavigation(savedInstanceState)
    }

    private fun setupExpandableListView() {
        mDrawerLayout = findViewById(R.id.drawer_layout)
        mActivityTitle = title.toString()
        expandableListView = findViewById(R.id.navList)
        initNavbarItems()
        val listHeaderView = layoutInflater.inflate(R.layout.nav_header_main, null, false)
        expandableListView.addHeaderView(listHeaderView)
    }

    private fun setupNavigation(savedInstanceState: Bundle?) {
        navController = findNavController(R.id.nav_host_fragment)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_news, R.id.nav_events, R.id.nav_classes_forms
            ), mDrawerLayout
        )
        for (item in groupsList) {
            if (item.fragmentId!! > 0) {
                appBarConfiguration.topLevelDestinations.add(item.fragmentId)
            } else {
                for (child in item.children) {
                    if (child.fragmentId > 0) {
                        appBarConfiguration.topLevelDestinations.add(child.fragmentId)
                    }
                }
            }
        }
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.navView.setupWithNavController(navController)
        if (savedInstanceState == null)
            selectFirstItemAsDefault()
    }

    private fun selectFirstItemAsDefault() {
        run {
            val firstItem = groupsList[0].fragmentId
            if (firstItem != null) {
                navController.navigate(firstItem)
            }
            mDrawerLayout.closeDrawer(GravityCompat.START)
        }
    }

    fun initNavbarItems() {

        var infoChildrenList: List<NavigationItem> = listOf(
            NavigationItem("Informacje ogólne", R.id.nav_info),
            NavigationItem("Sekcje", R.id.nav_info_sections),
            NavigationItem("Kierownictwo", R.id.nav_info_directorship),
            NavigationItem("Kadra", R.id.nav_info_team),
            NavigationItem("Studia podyplomowe", R.id.nav_info_postgraduate),
            NavigationItem("Egzaminy i zaliczenia WF", R.id.nav_info_exams),
            NavigationItem("Sportowcy z AMW", R.id.nav_info_exams),
            NavigationItem("Kluby przy ACS AMW Gdynia", R.id.nav_info_clubs),
            NavigationItem("Regulamin ACS", R.id.nav_info_terms)
        )

        val eventsChildrenlist: List<NavigationItem> = listOf(
            NavigationItem("Przeglądaj wydarzenia", R.id.nav_events),
            NavigationItem("Dokonane rezerwacje", R.id.nav_events_reservations),
            NavigationItem("Kategorie", R.id.nav_events_categories),
            NavigationItem("Lokalizacje", R.id.nav_events_localization)
        )

        val poolsChildrenList: List<NavigationItem> = listOf(
            NavigationItem("Baseny - prezentacja", R.id.nav_pools),
            NavigationItem("Grafik basenu", R.id.nav_pools_schedule),
            NavigationItem("Cennik OSzP", R.id.nav_pools_pricing),
            NavigationItem("OSzP dla kadry AMW", R.id.nav_pools_for_team),
            NavigationItem("OSzP dla kursów", R.id.nav_pools_courses)
        )

        val objectsChildrenList: List<NavigationItem> = listOf(
            NavigationItem("Hale - prezentacja", R.id.nav_objects),
            NavigationItem("Grafiki obiektów", R.id.nav_objects_schedule),
            NavigationItem("Cennik OWFiS", R.id.nav_objects_pricing),
            NavigationItem("OWFiS dla kadry AMW", R.id.nav_objects_for_team),
            NavigationItem("OSzP dla kursów", R.id.nav_objects_courses)
        )

        val classesChildrenList: List<NavigationItem> = listOf(
            NavigationItem("ZS - informacje", R.id.nav_classes),
            NavigationItem("Komunikaty ZS", R.id.nav_classes_messages),
            NavigationItem("Regulamin ZS", R.id.nav_classes_terms),
            NavigationItem("Formalności ZS", R.id.nav_classes_forms)
        )

        val contactChildrenList: List<NavigationItem> = listOf(
            NavigationItem("Dane kontaktowe", R.id.nav_contact),
            NavigationItem("Wykaz telefonów", R.id.nav_contact_phones),
            NavigationItem("POMOC", 0),
            NavigationItem("Fotoaktualności", 0)
        )

        groupsList.add(
            NavigationGroup(
                "Strona główna",
                R.drawable.ic_home,
                listOf(),
                R.id.nav_home
            )
        )
        groupsList.add(NavigationGroup("Aktualności", R.drawable.ic_news, listOf(), R.id.nav_news))
        groupsList.add(NavigationGroup("Wydarzenia", R.drawable.ic_events, eventsChildrenlist, 0))
        groupsList.add(NavigationGroup("Info", R.drawable.ic_info, infoChildrenList, 0))
        groupsList.add(NavigationGroup("Baseny", R.drawable.ic_pools, poolsChildrenList, 0))
        groupsList.add(NavigationGroup("Hale", R.drawable.ic_objects, objectsChildrenList, 0))
        groupsList.add(
            NavigationGroup(
                "Komunikaty",
                R.drawable.ic_notifications,
                listOf(),
                R.id.nav_messages
            )
        )
        groupsList.add(
            NavigationGroup(
                "Kontakt",
                R.drawable.ic_contact,
                contactChildrenList,
                R.id.nav_contact
            )
        )
        groupsList.add(
            NavigationGroup(
                "Zajęcia sportowe",
                R.drawable.ic_classes,
                classesChildrenList,
                0
            )
        )
    }

    fun addDrawersItem() {
        adapter = DrawerExpandableListAdapter(this, groupsList)
        expandableListView.setAdapter(adapter)
        expandableListView.setOnGroupExpandListener {
            ExpandableListView.OnGroupExpandListener { groupPosition ->
                supportActionBar!!.title = groupsList[groupPosition].name
            }
        }
        expandableListView.setOnGroupCollapseListener {
            ExpandableListView.OnGroupExpandListener { groupPosition ->
                supportActionBar!!.title = "ACS mobile"
            }
        }

        expandableListView.setOnChildClickListener(ExpandableListView.OnChildClickListener { parent, v, groupPosition, childPosition, id ->
            val selectedItem = groupsList[groupPosition].children[childPosition]
            supportActionBar!!.title = selectedItem.name
            navController.navigate(selectedItem.fragmentId)
            mDrawerLayout.closeDrawer(GravityCompat.START)
            return@OnChildClickListener false
        })

        expandableListView.setOnGroupClickListener { parent, v, groupPosition, id ->
            val selectedItem = groupsList[groupPosition]
            if (!selectedItem.hasChildren) {
                selectedItem.fragmentId?.let { it1 -> navController.navigate(it1) }
                supportActionBar!!.title = selectedItem.name
                mDrawerLayout.closeDrawer(GravityCompat.START)
            }
            return@setOnGroupClickListener false
        }
    }

    private fun setupDrawer() {
        mDrawerToggle = object : ActionBarDrawerToggle(
            this,
            mDrawerLayout,
            R.string.open,
            R.string.close
        ) {
            override fun onDrawerClosed(drawerView: View) {
                super.onDrawerClosed(drawerView)
                invalidateOptionsMenu()
            }
            override fun onDrawerOpened(drawerView: View) {
                super.onDrawerOpened(drawerView)
                supportActionBar!!.title = "ACS mobile"
                invalidateOptionsMenu()
            }
        }
        mDrawerToggle.isDrawerIndicatorEnabled = true
        mDrawerToggle.isDrawerSlideAnimationEnabled = true
        mDrawerLayout.addDrawerListener(mDrawerToggle)
        mDrawerToggle.syncState()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId
        mDrawerLayout.openDrawer(GravityCompat.START)
        return super.onOptionsItemSelected(item)
    }
}

