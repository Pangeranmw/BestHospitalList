package com.dicoding.besthospitallist

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val tvDetail: TextView = findViewById(R.id.tv_hospital_detail)
        val tvLocation: TextView = findViewById(R.id.tv_hospital_location)
        val tvTime: TextView = findViewById(R.id.tv_hospital_time)
        val tvName: TextView = findViewById(R.id.tv_hospital_name)
        val imgHospital: ImageView = findViewById(R.id.img_item_hospital)
        val image = intent.getIntExtra(IMAGE, 0)
        val detail = intent.getStringExtra(DETAIL)
        val location = intent.getStringExtra(LOCATION)
        val time = intent.getStringExtra(TIME)
        val name = intent.getStringExtra(NAME)
        val web = intent.getStringExtra(WEB)
        val lt = intent.getStringExtra(LATITUDE)
        val ll = intent.getStringExtra(LONGITUDE)
        val telephone = intent.getStringExtra(TELEPHONE)

        supportActionBar!!.title = "Detail $name"
        Glide.with(this)
            .load(image)
            .apply(RequestOptions()
                .fitCenter()
                .format(DecodeFormat.PREFER_ARGB_8888)
                .override(Target.SIZE_ORIGINAL))
            .into(imgHospital)
        tvDetail.text = detail
        tvLocation.text = location
        tvTime.text = time
        tvName.text = name

        val call: Button = findViewById(R.id.btn_hospital_call)
        val maps: Button = findViewById(R.id.btn_hospital_maps)
        val share: Button = findViewById(R.id.btn_share)

        maps.setOnClickListener{
            val gmmIntentUri = Uri.parse("geo:$lt,$ll?z=21")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        call.setOnClickListener{
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$telephone"))
            startActivity(dialPhoneIntent)
        }
        share.setOnClickListener{
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Kunjungi Rumah Sakit Terbaik Pilihan-ku $web")
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }

    }
    companion object {
        const val LOCATION = "extra_location"
        const val DETAIL = "extra_detail"
        const val TIME = "extra_time"
        const val LATITUDE = "extra_lt"
        const val LONGITUDE = "extra_ll"
        const val WEB = "extra_web"
        const val TELEPHONE = "extra_phone"
        const val NAME = "extra_name"
        const val IMAGE = "extra_photo"
    }
}