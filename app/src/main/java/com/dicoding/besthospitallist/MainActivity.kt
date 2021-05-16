package com.dicoding.besthospitallist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvHospital: RecyclerView
    private var list: ArrayList<Hospital> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.title = "Rumah Sakit Terbaik"

        rvHospital = findViewById(R.id.rv_hospital)
        rvHospital.setHasFixedSize(true)

        list.addAll(HospitalData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvHospital.layoutManager = LinearLayoutManager(this)
        val listHospitalAdapter = ListHospitalAdapter(list)
        rvHospital.adapter = listHospitalAdapter

        listHospitalAdapter.setOnItemClickCallback(object : ListHospitalAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Hospital) {
                showSelectedHospital(data)
                val detail = Intent(this@MainActivity, Detail::class.java)
                detail.putExtra(Detail.IMAGE, data.photo)
                detail.putExtra(Detail.NAME, data.name)
                detail.putExtra(Detail.TIME, data.time)
                detail.putExtra(Detail.DETAIL, data.detail)
                detail.putExtra(Detail.LOCATION, data.location)
                detail.putExtra(Detail.LATITUDE, data.latitude)
                detail.putExtra(Detail.LONGITUDE, data.longitude)
                detail.putExtra(Detail.WEB, data.web)
                detail.putExtra(Detail.TELEPHONE, data.telephone)
                startActivity(detail)
            }
        })
    }
    private fun showAbout() {
        val about = Intent(this@MainActivity, About::class.java)
        startActivity(about)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }
            R.id.action_about -> {
                showAbout()
            }
        }
    }

    private fun showSelectedHospital(hospital: Hospital) {
        Toast.makeText(this, "Kamu memilih " + hospital.name, Toast.LENGTH_SHORT).show()
    }


}
