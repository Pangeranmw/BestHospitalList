package com.dicoding.besthospitallist

object HospitalData {
    private val hospitalNames = arrayOf("RS Pondok Indah Group",
        "RS Mata JEC",
        "RS Siloam Kebon Jeruk",
        "RS Cipto Mangunkusumo",
        "RS Adi Husada",
        "RS Premier Jatinegara",
        "BIMC Hospital",
        "RSPAD Gatot Soberoto",
        "RSUP Fatmawati",
        "Santosa Hospital Bandung"
    )
    private val hospitalWeb = arrayOf("https://rspondokindah.co.id/id",
        "https://jec.co.id/",
        "http://www.siloamhospitals.com/",
        "http://www.rscm.co.id/",
        "http://adihusada.co.id/",
        "https://www.ramsaysimedarby.co.id",
        "http://www.bimcbali.com/",
        "http://www.rspadgs.net/",
        "http://rsupfatmawati.id/",
        "https://shbc.santosa-hospital.com/"
    )
    private val hospitalDetail = arrayOf("Lebih dari 250 dokter spesialis, subspesialis, serta dokter umum mungkin itulah yang membuat rumah sakit Pondok Indah di cap menjadi salah satu rumah sakit terbaik di tanah air. Sehingga setiap keluhan dari setiap pasien bisa ditangani langsung oleh dokter spesialis penyakit diidap",
        "Jakarta Eye Center atau yang lebih dikenal dengan JEC, juga menjadi salah satu rumah sakit terbaik. Apa yang membuat rumah sakit ini jadi rumah sakit terbaik? Yaitu selalu mengutamakan keselamatan dan pelayanan kesehatan berkualitas.",
        "Dengan 26 fasilitas layanan yang beroperasi penuh di 16 kota di seluruh Indonesia, Siloam International Hospitals adalah penyedia perawatan swasta terbesar di negara ini. Siloam juga berinvestasi besar dalam teknologi terbaru karena terus berupaya memberikan perawatan paling canggih kepada pasiennya. Pusat kanker kelas dunia di Siloam juga merupakan fasilitas onkologi komprehensif 'satu atap' swasta pertama dan saat ini terbesar di Indonesia.",
        "Juga dikenal sebagai RSCM, fasilitas kesehatan berusia berabad-abad ini pertama kali didirikan pada tahun 1853 sebagai Sekolah Dokter Djawa sebelum diubah menjadi rumah sakit pemerintah. Sekarang rumah sakit ini dimiliki oleh Kementerian Kesehatan serta sebagai pusat praktik dan pelatihan bagi mahasiswa kedokteran Universitas Indonesia (UI). RSCM menyediakan berbagai layanan medis yang terjangkau dan berkualitas tinggi untuk pasien dari berbagai latar belakang sosial ekonomi. Menjadi alternatif yang sangat menarik bagi siapa saja.",
        "Dengan berbasis di kota besar Surabaya, Rumah Sakit Adi Husada menjadi salah satu rujukan tempat berobat bagi masyarakat Surabaya di berbagai kalangan. Kamu bisa menemukan rumah sakit ini di wilayah Undaan Wetan dan Kapasari Surabaya, dengan tambahan Stikes Adi Husada yang terletak di wilayah Kapasari juga. Layanan kesehatan yang ditawarkan cukup lengkap, dan ditawarkan pula beberapa health check up dengan harga mulai dari 600 ribuan (Silver), hingga 1,5 juta rupiah (Diamond). RS Adi Husada juga memiliki fasilitas Cancer Center yang berfokus pada diagnosis dan perawatan pada pasien yang menderita kanker.",
        "Didirikan pada tahun 1989 dan dimiliki oleh perusahaan kesehatan Affinity Health Indonesia, rumah sakit swasta ini dulu bernama RS Mitra Internasional sebelum berganti nama pada Agustus 2010.  Setahun kemudian, berkat kualitas dan layanannya yang terus berkembang, rumah sakit ini berhasil mendapatkan gelar akreditasi Internasional, menjadikannya salah satu dari sedikit rumah sakit Indonesia dengan standar internasional. Rumah sakit ini terkenal dengan beberapa layanan perawatan seperti Digestive Center, Extracorporeal Shock Waves for Sexual Therapy atau ESST untuk masalah disfungsi ereksi, Bypass Coronary Surgery, dan Stroke Center.",
        "Rumah sakit terbaik pertama datang dari rumah sakit yang berada di Bali yaitu rumah sakti Bali International Medical Center (BIMC). Rumah sakit ini juga sudah bertaraf international. Keunggulan dari BIMC di Bali ini sendiri yaitu para tenaga medisnya sudah menguasi maupun memahami banyak bahasa. Itu tentunya akan memudahkan pasien luar negeri untuk berkonsultasi.",
        "Rumah Sakit Pusat Angkatan Darat (RSPAD) Gatot Soebroto jadi rumah sakit di Indonesia yang menyabet gelar jadi rumah sakit terbaik. Di mana rumah sakit ini berada di bawah naungan Komando Direktorat Kesehatan Angkatan Darat.",
        "Berbagai pelayanan medis diberikan serta dokter spesialis lengkap, mungkin menjadikan rumah sakit ini jadi yang terbaik di Indonesia. Rumah sakit milik pemerintah Indonesia ini sudah dibuka sejak tahun 1962 dan menjadi kepercayaan warga Jakarta dan Indonesia untuk menangani masalah kesehatan.",
        "Sudah terakreditasi internasional menjadikan salah satu rumah sakit di Bandung ini jadi salah satu rumah sakit terbaik di Indonesia. Berbagai layanan seperti tempat tidur banyak, Unit Gawat Darurat (UGD) 24 jam, alat dan tenaga medis profesional jadi salah satu buktinya.",
    )
    private val hospitalImages = intArrayOf(R.drawable.rs_pondok_indah,
        R.drawable.rs_jec,
        R.drawable.rs_siloam,
        R.drawable.rs_cipto,
        R.drawable.rs_adi_husada,
        R.drawable.rs_premier_jatinegara,
        R.drawable.rs_bimc,
        R.drawable.rs_gatot,
        R.drawable.rs_fatmawati,
        R.drawable.santosa_hospital
    )
    private val hospitalLocations = arrayOf("CBD Emerald Blok CE/C, Jl. Boulevard Bintaro Jaya No.1, Parigi, Kec. Pd. Aren, Kota Tangerang Selatan, Banten 15227",
        "Jalan Terusan Jl. Arjuna Utara No.1, RT.7/RW.3, Kedoya Sel., Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11520",
        "Jl. Perjuangan No.Kav.8, RT.14/RW.10, Kb. Jeruk, Kec. Kb. Jeruk, Jakarta, Daerah Khusus Ibukota Jakarta 11530",
        "Jl. Pangeran Diponegoro No.71, RW.5, Kenari, Kec. Senen, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10430",
        "Jl. Undaan Wetan No.40-44, Ketabang, Kec. Genteng, Kota SBY, Jawa Timur 60272",
        "Jalan Jatinegara Timur II No.9, RT.12/RW.2, Rawa Bunga, Jatinegara, Kota Jakarta Timur, 13310",
        "Kawasan ITDC Blok D, Jl. Nusa Dua, Benoa, Kabupaten Badung, Bali 80363",
        "Jl. Abdul Rahman Saleh Raya No.24, RT.10/RW.5, Senen, Kec. Senen, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10410",
        "Jl. RS. Fatmawati Raya No.4, RT.4/RW.9, Cilandak Bar., Kec. Cilandak, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12430",
        "Jl. Kebon Jati No.38, Kb. Jeruk, Kec. Andir, Kota Bandung, Jawa Barat 40181"
    )
    private val hospitalTelephones = arrayOf("+622180828888",
        "+628041221000",
        "+622125677888",
        "+62211500135",
        "+62315318000",
        "1500908",
        "+623613000911",
        "+62213840702",
        "+62217501524",
        "+62224248333"
    )
    private val hospitalTimes = arrayOf("24 HOURS",
        "07:00 - 18:00",
        "24 HOURS",
        "24 HOURS",
        "24 HOURS",
        "24 HOURS",
        "24 HOURS",
        "24 HOURS",
        "24 HOURS",
        "24 HOURS"
    )
    private val hospitalLatitudes = arrayOf("-6.271633028890898",
        "-6.189601712407746",
        "-6.190808786622975",
        "-6.1971523",
        "-7.250811495831688",
        "-6.221952307183089",
        "-8.799360592059797",
        "-6.1761283",
        "-6.2950842",
        "-6.9154159"
    )
    private val hospitalLongitudes = arrayOf("106.69714356696973",
        "106.7614475820736",
        "106.76362418427173",
        "106.8468688",
        "112.74572882197589",
        "106.8682078951643",
        "115.22846222361687",
        "106.8376429",
        "106.796477",
        "107.6004122"
    )
    val listData: ArrayList<Hospital>
        get() {
            val list = arrayListOf<Hospital>()
            for (position in hospitalNames.indices){
                val hospital = Hospital()
                hospital.name = hospitalNames[position]
                hospital.web = hospitalWeb[position]
                hospital.detail = hospitalDetail[position]
                hospital.photo = hospitalImages[position]
                hospital.location = hospitalLocations[position]
                hospital.time = hospitalTimes[position]
                hospital.telephone = hospitalTelephones[position]
                hospital.latitude = hospitalLatitudes[position]
                hospital.longitude = hospitalLongitudes[position]
                list.add(hospital)
            }
            return list
        }
}