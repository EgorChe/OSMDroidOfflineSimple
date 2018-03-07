package com.egorc.osmdroid.simple

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.osmdroid.tileprovider.tilesource.XYTileSource
import org.osmdroid.util.GeoPoint

class MainActivity : AppCompatActivity() {

    private val CHELAYBINSK = GeoPoint(55.160928, 61.414103)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        map_view.setBuiltInZoomControls(true)
        map_view.setMultiTouchControls(true)
        map_view.setTileSource(XYTileSource(
                "Hikebikemap",
                7,
                17,
                256,
                ".png",
                arrayOf()
        ))
        map_view.setUseDataConnection(false)
        map_view.controller.setCenter(CHELAYBINSK)
        map_view.controller.setZoom(15)
    }
}
