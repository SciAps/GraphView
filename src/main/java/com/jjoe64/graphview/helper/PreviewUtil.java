package com.jjoe64.graphview.helper;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public final class PreviewUtil
{
    public static Bitmap drawBitmap(GraphView gv, int width, int height, LineGraphSeries<DataPoint> series1, LineGraphSeries<DataPoint> series2)
    {
        Bitmap b = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(b);
        series1.draw(gv, c, false);
        series2.draw(gv, c, false);
        return b;
    }
}
