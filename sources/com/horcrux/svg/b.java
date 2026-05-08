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
public final class b extends RenderableView {
    public SVGLength a;
    public SVGLength b;
    public SVGLength c;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.a);
        double dRelativeOnHeight = relativeOnHeight(this.b);
        double dRelativeOnOther = relativeOnOther(this.c);
        path.addCircle((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) dRelativeOnOther, Path.Direction.CW);
        ArrayList<c6b> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d = dRelativeOnHeight - dRelativeOnOther;
        arrayList.add(new c6b(ip4.b, new ieb[]{new ieb(dRelativeOnWidth, d)}));
        ArrayList<c6b> arrayList2 = this.elements;
        double d2 = dRelativeOnWidth + dRelativeOnOther;
        ieb[] iebVarArr = {new ieb(dRelativeOnWidth, d), new ieb(d2, dRelativeOnHeight)};
        ip4 ip4Var = ip4.c;
        arrayList2.add(new c6b(ip4Var, iebVarArr));
        double d3 = dRelativeOnHeight + dRelativeOnOther;
        this.elements.add(new c6b(ip4Var, new ieb[]{new ieb(d2, dRelativeOnHeight), new ieb(dRelativeOnWidth, d3)}));
        double d4 = dRelativeOnWidth - dRelativeOnOther;
        this.elements.add(new c6b(ip4Var, new ieb[]{new ieb(dRelativeOnWidth, d3), new ieb(d4, dRelativeOnHeight)}));
        this.elements.add(new c6b(ip4Var, new ieb[]{new ieb(d4, dRelativeOnHeight), new ieb(dRelativeOnWidth, d)}));
        return path;
    }
}
