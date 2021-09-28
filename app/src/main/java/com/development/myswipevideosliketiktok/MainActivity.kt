package com.development.myswipevideosliketiktok

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.development.myswipevideosliketiktok.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var videoItemsList = ArrayList<VideoItem>()
    private var videosAdapter: VideosAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.fragment = this

        videoItemsList.add(
                VideoItem(
                       /* ContextCompat.getDrawable(requireActivity(), R.drawable.memorials_img1)!!,*/
                        "https://heavenplusone-api.dedicateddevelopers.us/uploads/memorial/media_1627550774674_VID-20210719-WA0007.mp4",
                        "Women In Tech",
                        "International Women's Day 2019"
                )
        )
        videoItemsList.add(
                VideoItem(
                        /*ContextCompat.getDrawable(requireActivity(), R.drawable.memorials_img2)!!,*/
                        "https://heavenplusone-api.dedicateddevelopers.us/uploads/memorial/media_1627550774674_VID-20210719-WA0007.mp4",
                        "Sasha Solomon",
                        "How Sasha Solomon Became a Software Developer at Twitter"
                )
        )
        videoItemsList.add(
                VideoItem(
                      /*  ContextCompat.getDrawable(requireActivity(), R.drawable.memorials_img1)!!,*/
                        "https://heavenplusone-api.dedicateddevelopers.us/uploads/memorial/media_1627550774674_VID-20210719-WA0007.mp4",
                        "Happy Hour Wednesday",
                        "Depth-First Search Algorithm"
                )
        )

        videosAdapter = VideosAdapter(this,videoItemsList)
        binding.viewPagerVideos.adapter = videosAdapter
    }
}