package simple.osmdroid.egorc.com.java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.osmdroid.tileprovider.tilesource.XYTileSource;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

public class MainActivity extends AppCompatActivity {

    private GeoPoint CHELAYBINSK = new GeoPoint(55.160928, 61.414103);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView mapView = findViewById(R.id.map_view);


        mapView.setBuiltInZoomControls(true);


        mapView.setMultiTouchControls(true);
        mapView.setTileSource(new XYTileSource(
                "Hikebikemap",
                1,
                15,
                256,
                ".png",
                new String[]{}));
        mapView.setUseDataConnection(false);
        mapView.getController().setCenter(CHELAYBINSK);
        mapView.getController().setZoom(15);
    }
}

