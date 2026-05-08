package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import defpackage.fjf;
import defpackage.ia6;
import defpackage.xif;
import defpackage.zif;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class u extends h {
    public SVGLength V;
    public String W;
    public fjf a0;
    public zif b0;
    public ArrayList<SVGLength> c0;
    public ArrayList<SVGLength> d0;
    public ArrayList<SVGLength> e0;
    public SVGLength f;
    public ArrayList<SVGLength> f0;
    public ArrayList<SVGLength> g0;
    public double h0;

    public u(ReactContext reactContext) {
        super(reactContext);
        this.f = null;
        this.V = null;
        this.W = null;
        this.a0 = fjf.a;
        this.h0 = Double.NaN;
    }

    @Override // com.horcrux.svg.VirtualView
    public void clearCache() {
        this.h0 = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.h, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        m(canvas);
        clip(canvas, paint);
        n(canvas, paint);
        l();
        g(canvas, paint, f);
        k();
    }

    @Override // com.horcrux.svg.h, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        m(canvas);
        return n(canvas, paint);
    }

    @Override // com.horcrux.svg.h
    public final Path i(Canvas canvas, Paint paint) {
        return getPath(canvas, paint);
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (this.mPath == null) {
            return;
        }
        super.invalidate();
        ViewParent parent = getParent();
        while (parent instanceof u) {
            this = (u) parent;
            parent = this.getParent();
        }
        this.clearChildCache();
    }

    @Override // com.horcrux.svg.h
    public void l() {
        boolean z = ((this instanceof xif) || (this instanceof t)) ? false : true;
        ia6 ia6VarJ = j();
        ReadableMap readableMap = this.a;
        ArrayList<SVGLength> arrayList = this.c0;
        ArrayList<SVGLength> arrayList2 = this.d0;
        ArrayList<SVGLength> arrayList3 = this.f0;
        ArrayList<SVGLength> arrayList4 = this.g0;
        ArrayList<SVGLength> arrayList5 = this.e0;
        if (z) {
            ia6VarJ.F = 0;
            ia6VarJ.E = 0;
            ia6VarJ.D = 0;
            ia6VarJ.C = 0;
            ia6VarJ.B = 0;
            ia6VarJ.K = -1;
            ia6VarJ.J = -1;
            ia6VarJ.I = -1;
            ia6VarJ.H = -1;
            ia6VarJ.G = -1;
            ia6VarJ.v = 0.0d;
            ia6VarJ.u = 0.0d;
            ia6VarJ.t = 0.0d;
            ia6VarJ.s = 0.0d;
        }
        ia6VarJ.f(this, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            ia6VarJ.B++;
            ia6VarJ.G = -1;
            ia6VarJ.g.add(-1);
            SVGLength[] sVGLengthArrA = ia6.a(arrayList);
            ia6VarJ.w = sVGLengthArrA;
            ia6VarJ.b.add(sVGLengthArrA);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            ia6VarJ.C++;
            ia6VarJ.H = -1;
            ia6VarJ.h.add(-1);
            SVGLength[] sVGLengthArrA2 = ia6.a(arrayList2);
            ia6VarJ.x = sVGLengthArrA2;
            ia6VarJ.c.add(sVGLengthArrA2);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            ia6VarJ.D++;
            ia6VarJ.I = -1;
            ia6VarJ.i.add(-1);
            SVGLength[] sVGLengthArrA3 = ia6.a(arrayList3);
            ia6VarJ.y = sVGLengthArrA3;
            ia6VarJ.d.add(sVGLengthArrA3);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            ia6VarJ.E++;
            ia6VarJ.J = -1;
            ia6VarJ.j.add(-1);
            SVGLength[] sVGLengthArrA4 = ia6.a(arrayList4);
            ia6VarJ.z = sVGLengthArrA4;
            ia6VarJ.e.add(sVGLengthArrA4);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            ia6VarJ.F++;
            ia6VarJ.K = -1;
            ia6VarJ.k.add(-1);
            int size = arrayList5.size();
            double[] dArr = new double[size];
            for (int i = 0; i < size; i++) {
                dArr[i] = arrayList5.get(i).a;
            }
            ia6VarJ.A = dArr;
            ia6VarJ.f.add(dArr);
        }
        ia6VarJ.e();
    }

    public final Path n(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        l();
        this.mPath = super.getPath(canvas, paint);
        k();
        return this.mPath;
    }

    public double o(Paint paint) {
        if (!Double.isNaN(this.h0)) {
            return this.h0;
        }
        double dO = 0.0d;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof u) {
                dO = ((u) childAt).o(paint) + dO;
            }
        }
        this.h0 = dO;
        return dO;
    }

    public void p(String str) {
        this.b0 = zif.a(str);
        invalidate();
    }
}
