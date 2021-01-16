package com.amrilhs.aplikasiwisatasibolga.ui.tourism

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.amrilhs.aplikasiwisatasibolga.R
import com.amrilhs.aplikasiwisatasibolga.model.DataTuris
import kotlinx.android.synthetic.main.fragment_tourism.*

class TourismFragment : Fragment() {
    companion object {
        val TAG = TourismFragment::class.java.simpleName
        const val EXTRA_DETAIL = "extra_detail"
    }

   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tourism, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val arrayList = ArrayList<DataTuris>()//inisialisasi array
           arrayList.add( //tambahkan data array
            DataTuris(
                R.drawable.wisatasibolgapulauponcan, "Pulau Poncan Gadang",
                    "Tempat wisata di Sibolga (Sumut) yang menarik dikunjungi oleh wisatawan berikutnya yaitu Pulau Poncan Gadang. " +
                            "Lokasi pulau ini tidak begitu jauh dari dermaga Kota Sibolga, dan lumayan dekat dengan Pulau Putri. " +
                            "Keindahan pantai ditambah dengan keeksotisan gua-gua jepang, membuat pulau ini memiliki daya tarik yang kuat untuk mendatangkan wisatawan, baik wisatawan lokal maupun wisatawan yang berasal dari luar kota. Bukan hanya itu saja, di pulau ini juga sudah tersedia beberapa tempat untuk beristirahat berupa resort. " +
                            "Apabila kamu terlalu lelah untuk kembali pulang, kamu bisa bermalam di resort-resort di pulau ini." +
                            "Untuk tiket bervariasi. bisa menyewa kapal atau speedboat. Kisaran biasa mulai 20ribu sampai 100ribu per orang." +
                            "dan jarak tempuh sekitar 30 menit.")
        )
        arrayList.add(
            DataTuris(
                R.drawable.pantaiujungsibolga, "Pantai Ujung Sibolga",
                "Kota Sibolga berhadapan langsung dengan Samudera Hindia, sehingga tidak terlalu mengherankan jika kota ini memiliki beberapa tempat wisata pantai yang begitu cantik, salah satunya adalah Pantai Ujung.\n" +
                        "\n" +
                        "Perpaduan antara pasir berwarna kecokelatan dengan hamparan laut biru, sehingga pantai ini terlihat lebih eksotis. Disamping itu, pantai ini juga merupakan salah satu tempat terbaik untuk menikmati matahari terbenam (sunset) di Sibolga.\n" +
                        "\n" +
                        "Jika kamu penasaran dengan pantai ini? Kamu bisa mengunjunginya di Desa Simare-Mare, Kecamatan Sibolga Utara, Kota Sibolga. Biasanya, pantai ini buka setiap hari, dari pukul 08:00 hingga pukul 00:00."
            )
        )
        arrayList.add(
            DataTuris(
                R.drawable.pulaubangke, "Pulau Bangke",
                "Walaupun namanya terdengar sedikit unik, namun keindahan alam di Pulau Bangke ini tidak kalah jauh jika dibandingkan dengan keindahan alam di beberapa pulau lainnya di Kota Sibolga, dan sekitarnya.\n" +
                        "\n" +
                        "Lokasi pulau ini sangat dekat dengan Pulau Poncan (Pulau Poncan Gadang, dan Pulau Poncan Ketek). Bahkan, pulau ini bisa langsung dikunjungi dari kedua pulau tersebut jika air laut sedang surut."
            )
        )
        arrayList.add(
            DataTuris(
                R.drawable.torsimarbarimbing, "Bukit Tor Simarbarimbing",
                "Jika kamu ingin melihat pemandangan indah Kota Sibolga dan Teluk Tapian Nauli dari ketinggian? Maka kunjungilah Bukit Tor Simarbarimbing di Desa Angin Nauli, Kecamatan Sibolga Utara, Kota Sibolga.\n" +
                        "\n" +
                        "Dalam perjalanan menuju ke puncaknya, para pengunjung juga akan menemukan beberapa hal menarik, salah satunya adalah perkampungan suku nias, lengkap dengan replika lompat batu, atau hombo batu.\n" +
                        "\n" +
                        "Lebih menariknya lagi, di Bukit Tor Simarbarimbing sudah dilengkapi dengan beberapa gazebo, yang bisa dimamfaatkan oleh para pengunjung untuk sekedar melepas lelah sejenak."
            )
        )
        arrayList.add(
            DataTuris(
                R.drawable.poncakketek, "Pulau Poncan Ketek",
                "Lokasi Pulau Poncan Ketek ini sangat dekat sekali dengan Pulau Poncan Gadang. Bahkan, karena saking dekatnya, membuat banyak wisatawan yang menganggap bahwa kedua pulau ini adalah pulau kembar.\n" +
                        "\n" +
                        "Walaupun saling berdekatan dan dianggap pulau kembar, bukan berarti fasilitas pendukung di kedua pulau ini sama, dari ukurannya saja jauh berbeda, dimana Pulau Poncan Ketek berukuran lebih kecil dibandingkan Pulau Poncan Gadang.\n" +
                        "\n" +
                        "Namun jangan dulu dianggap remeh. Pasalnya, panorama alam yang dimiliki oleh Pulau Poncan Ketek tidak ini kalah indah dengan panorama alam yang dimiliki oleh Pulau Poncan Gadang."
            )
        )
        arrayList.add(
            DataTuris(
                R.drawable.tanggaseratussibolga, "Tangga Saratus",
                "Bukan hanya pulau yang eksotis dan pantai yang cantik saja, Kota Sibolga dan sekitarnya juga mempunyai sejumlah tempat wisata alam yang tidak kalah indah, salah satunya adalah Tangga Seratus.\n" +
                        "\n" +
                        "Tangga Seratus adalah sebuah tangga dengan anak tangga lebih dari seratus. Tangga ini menuju ke puncak bukit, sehingga pemandangan yang ditawarkannya adalah pemandangan dari puncak bukit yang indah.\n" +
                        "\n" +
                        "Jika kamu penasaran seperti apa Tangga Seratus ini? Kamu bisa mengunjunginya di Jalan Sisingamangaraja, Desa Sibolga Ilir, Kecamatan Sibolga Utara, Kota Sibolga. Biasanya, tempat ini dibuka 24 jam setiap harinya."
            )
        )
        arrayList.add(
            DataTuris(
                R.drawable.bukibentengketapang, "Bukit Benteng Ketapang",
                "Sebuah bangunan tua di Sibolga bernama Bentang Ketapang menjadi saksi bisu pada masa agresi Jepang terhadap Teluk Tapian Nauli. tempat wisata sejarah ini terdiri dari 2 lantai dan sudah permanen.\n" +
                        "Jika naik ke lantai 2, maka pemandangan Tapian Nauli dari Bukit Benteng Ketapang sangatlah indah. Benteng Jepang ini tepat di Kota Beringin, Sibolga Kota dan mudah diakses. Sayangnya, wisatawan luar tidak banyak mengetahui obyek wisata Benteng Ketapang ini."
            )
        )
        arrayList.add(
            DataTuris(
                R.drawable.pulausarudik, "Pulau Sarudik",
                "Tempat wisata di Sibolga (Sumut) yang menarik dikunjungi wisatawan selanjutnya yaitu Pulau Sarudik. Pulau yang dikenal juga dengan nama \" Sarudut \" ini terkenal dengan pantainya yang berpasir putih.\n" +
                        "\n" +
                        "Pulau Sarudik adalah salah satu tempat terbaik untuk melakukan snorkeling di Sibolga. Pasalnya, ombaknya di pulau ini sedikit lebih tenang. Disamping itu, pemandangan matahari terbenam (sunset) dari pulau ini juga cukup eksotis.\n" +
                        "\n" +
                        "Pulau ini berada di Teluk Sibolga, dan hanya berjarak kurang lebih 3 kilometer dari pusat Kota Sibolga, atau lebih tepatnya berada di Desa Pancuran Pinang, Kecamatan Sibolga Sambas, Kota Sibolga."
            )
        )
        arrayList.add(
            DataTuris(
                R.drawable.batulubang, "Batu Lobang",
                "Batu Lobang merupakan sebuah terowongan sepanjang 20 meter, yang berada di sebuah jalan raya, yang menghubungkan antara Kabupaten Tapanuli Utara dengan Kota Sibolga di Provinsi Sumatera Utara.\n" +
                        "\n" +
                        "Banyak pengendara yang sengaja berhenti di lokasi terowongan ini untuk sekedar berfoto. Batu Lobang ini disebut juga dengan nama \" Goa Belanda \" karena terowongan ini dibangun pada masa penjajahan belanda."
            )
        )
        arrayList.add(
            DataTuris(
                R.drawable.pantaipelabuhanlamasibolga, "Pelabuhan Lama",
                "Garis pantai di pantai yang berada di Jalan Yos Sudarso, Kota Beringin, Sibolga Kota, Kota Sibolga ini cukup luas, sehingga cocok dijadikan sebagai tempat nongkrong di Sibolga, khususnya pada sore hari.\n" +
                        "\n" +
                        "Pasalnya, pemandangan matahari terbenam (sunset) di Pantai Pelabuhan Lama ini cukup eksotis, apalagi ketika musim kemarau. Biasanya, tempat wisata ini dibuka 24 jam setiap harinya, sehingga bisa dikunjungi kapanpun."
            )
        )
        arrayList.add(
            DataTuris(
                R.drawable.pulauputri, "Pulau Putri",
                "Luas pulau ini hanya setengah hektar saja, sangat kecil untuk ukuran sebuah pulau. Namun jangan heran jika pemandangan yang ada di pulau ini sangat menawan nan eksotis. Pemandangan bawah laut berupa batu karang, rumput dan ikan bewarna akan sangat memanjakan mata. Cocok bagi Anda yang hobi diving karena alam bawah laut yang sangat luar biasa.\n" +
                        "\n" +
                        "Pulau ini hanya berjarak 12 km saja dari arah pusat kota, jadi bisa ditempuh hanya dalam 30 menit saja. Apabila ingin berkeliling dengan perahu juga bisa karena sudah ada fasilitas perahu yang memadai. Namun akan lebih baik jika naik secara berkelompok karena harga sewa cukup mahal, yakni sekitar 1 juta s.d 1,5 juta bergantung jarak dan waktu."
            )
        )
        arrayList.add(
            DataTuris(
                R.drawable.pulaumursala, "Pulau Mursala",
                "Secara administratif, Pulau Mursala ini tidak berada di wilayah Kota Sibolga, melainkan berada di Wilayah Kabupaten Tapanuli Tengah, atau lebih tepatnya berada di Wilayah Kecamatan Tapian Nauli.\n" +
                        "\n" +
                        "Namun, karena lokasinya yang cukup dekat dengan Kota Sibolga, sehingga pulau ini patut dipertimbangkan untuk dikunjungi wisatawan. Apalagi, keindahan alam yang ditawarkannya sangat mempesona.\n" +
                        "\n" +
                        "Salah satu objek wisata yang wajib dikunjungi wisatawan di Pulau Mursala ini adalah sebuah air terjun yang langsung ke jatuh ke laut. Disamping itu. pulau ini juga pernah menjadi lokasi pembuat film hollywood berjudul \" Kingkong \"."
            )
        )
       //masukkan data array ke dalam recyclerview
        val tourismAdapter = TurisAdapter(arrayList)
        rc_tourism_xml.layoutManager = LinearLayoutManager(this.context)
        rc_tourism_xml.adapter = tourismAdapter


    }
}