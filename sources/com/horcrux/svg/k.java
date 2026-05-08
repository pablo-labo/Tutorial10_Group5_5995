package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import defpackage.c6b;
import defpackage.ieb;
import defpackage.ip4;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class k extends RenderableView {
    public SVGLength a;
    public SVGLength b;
    public SVGLength c;
    public SVGLength d;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.a);
        double dRelativeOnHeight = relativeOnHeight(this.b);
        double dRelativeOnWidth2 = relativeOnWidth(this.c);
        double dRelativeOnHeight2 = relativeOnHeight(this.d);
        path.moveTo((float) dRelativeOnWidth, (float) dRelativeOnHeight);
        path.lineTo((float) dRelativeOnWidth2, (float) dRelativeOnHeight2);
        ArrayList<c6b> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new c6b(ip4.b, new ieb[]{new ieb(dRelativeOnWidth, dRelativeOnHeight)}));
        this.elements.add(new c6b(ip4.c, new ieb[]{new ieb(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }
}
