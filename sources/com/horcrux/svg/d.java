package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import defpackage.c6b;
import defpackage.ieb;
import defpackage.ip4;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class d extends RenderableView {
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
        double d = dRelativeOnWidth - dRelativeOnWidth2;
        double d2 = dRelativeOnHeight - dRelativeOnHeight2;
        double d3 = dRelativeOnWidth + dRelativeOnWidth2;
        double d4 = dRelativeOnHeight + dRelativeOnHeight2;
        path.addOval(new RectF((float) d, (float) d2, (float) d3, (float) d4), Path.Direction.CW);
        ArrayList<c6b> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new c6b(ip4.b, new ieb[]{new ieb(dRelativeOnWidth, d2)}));
        ArrayList<c6b> arrayList2 = this.elements;
        ieb[] iebVarArr = {new ieb(dRelativeOnWidth, d2), new ieb(d3, dRelativeOnHeight)};
        ip4 ip4Var = ip4.c;
        arrayList2.add(new c6b(ip4Var, iebVarArr));
        this.elements.add(new c6b(ip4Var, new ieb[]{new ieb(d3, dRelativeOnHeight), new ieb(dRelativeOnWidth, d4)}));
        this.elements.add(new c6b(ip4Var, new ieb[]{new ieb(dRelativeOnWidth, d4), new ieb(d, dRelativeOnHeight)}));
        this.elements.add(new c6b(ip4Var, new ieb[]{new ieb(d, dRelativeOnHeight), new ieb(dRelativeOnWidth, d2)}));
        return path;
    }
}
