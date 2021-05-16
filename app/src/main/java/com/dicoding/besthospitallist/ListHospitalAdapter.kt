package com.dicoding.besthospitallist

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target.SIZE_ORIGINAL

@Suppress("DEPRECATION")
class ListHospitalAdapter(val listHospital: ArrayList<Hospital>) : RecyclerView.Adapter<ListHospitalAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_hospital, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hospital = listHospital[position]
        Glide.with(holder.itemView.context)
            .load(hospital.photo)
            .apply(RequestOptions()
                .fitCenter()
                .format(DecodeFormat.PREFER_ARGB_8888)
                .override(SIZE_ORIGINAL))
            .into(holder.imgPhoto)
        holder.tvName.text = hospital.name
        holder.tvDetail.text = hospital.detail
        holder.tvLatitude.text = hospital.latitude
        holder.tvLongitude.text = hospital.longitude
        holder.tvLocation.text = hospital.location
        holder.tvTime.text = hospital.time
        holder.tvWeb.text = hospital.web
        holder.tvTelephone.text = hospital.telephone

        holder.btnDetail.setOnClickListener { onItemClickCallback.onItemClicked(listHospital[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listHospital.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_hospital_name)
        var tvLatitude: TextView = itemView.findViewById(R.id.tv_latitude)
        var tvLongitude: TextView = itemView.findViewById(R.id.tv_longitude)
        var tvLocation: TextView = itemView.findViewById(R.id.tv_hospital_location)
        var tvTime: TextView = itemView.findViewById(R.id.tv_hospital_time)
        var tvWeb: TextView = itemView.findViewById(R.id.tv_web)
        var tvTelephone: TextView = itemView.findViewById(R.id.tv_hospital_telephone)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_hospital_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_hospital)
        var btnDetail: Button = itemView.findViewById(R.id.btn_detail)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Hospital)
    }
}