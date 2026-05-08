package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.WritableNativeMap;
import defpackage.ac3;
import defpackage.nn2;
import defpackage.vse;
import defpackage.w55;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class g extends w55 {
    public int V;
    public boolean W;
    public a a0;
    public int f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] f;

        static {
            a aVar = new a("LEFT", 0);
            a = aVar;
            a aVar2 = new a("CENTER", 1);
            b = aVar2;
            a aVar3 = new a("RIGHT", 2);
            c = aVar3;
            a aVar4 = new a("BACK", 3);
            d = aVar4;
            a aVar5 = new a("SEARCH_BAR", 4);
            e = aVar5;
            f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    public final f getConfig() {
        ViewParent parent = getParent();
        ac3 ac3Var = parent instanceof ac3 ? (ac3) parent : null;
        if (ac3Var != null) {
            return ac3Var.getConfig();
        }
        return null;
    }

    public final a getType() {
        return this.a0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.W) {
                float fC = nn2.C(i5);
                float fC2 = nn2.C(i6);
                float fC3 = nn2.C(i);
                float fC4 = nn2.C(i2);
                if (Math.abs(this.b - fC) >= 0.9f || Math.abs(this.c - fC2) >= 0.9f || Math.abs(this.d - fC3) >= 0.9f || Math.abs(this.e - fC4) >= 0.9f) {
                    this.b = fC;
                    this.c = fC2;
                    this.d = fC3;
                    this.e = fC4;
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("frameWidth", fC);
                    writableNativeMap.putDouble("frameHeight", fC2);
                    writableNativeMap.putDouble("contentOffsetX", fC3);
                    writableNativeMap.putDouble("contentOffsetY", fC4);
                    vse vseVar = this.a;
                    if (vseVar != null) {
                        vseVar.updateState(writableNativeMap);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            this.f = View.MeasureSpec.getSize(i);
            this.V = View.MeasureSpec.getSize(i2);
            this.W = true;
            Object parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f, this.V);
    }

    public final void setType(a aVar) {
        aVar.getClass();
        this.a0 = aVar;
    }
}
