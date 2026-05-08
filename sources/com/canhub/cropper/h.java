package com.canhub.cropper;

import android.graphics.RectF;
import com.canhub.cropper.i;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public final RectF a = new RectF();
    public final RectF b = new RectF();
    public float k = 1.0f;
    public float l = 1.0f;

    public static float a(float f, float f2, float f3, float f4) {
        return Math.max(Math.abs(f - f3), Math.abs(f2 - f4));
    }

    public static boolean h(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    public final float b() {
        float f = this.f;
        float f2 = this.j / this.l;
        return f > f2 ? f2 : f;
    }

    public final float c() {
        float f = this.e;
        float f2 = this.i / this.k;
        return f > f2 ? f2 : f;
    }

    public final float d() {
        float f = this.d;
        float f2 = this.h / this.l;
        return f < f2 ? f2 : f;
    }

    public final float e() {
        float f = this.c;
        float f2 = this.g / this.k;
        return f < f2 ? f2 : f;
    }

    public final i.a f(float f, float f2, boolean z) {
        RectF rectF = this.a;
        float fWidth = rectF.width() / 6.0f;
        float f3 = rectF.left;
        float f4 = f3 + fWidth;
        float f5 = (fWidth * 5.0f) + f3;
        float fHeight = rectF.height() / 6.0f;
        float f6 = rectF.top;
        float f7 = f6 + fHeight;
        float f8 = (5.0f * fHeight) + f6;
        if (f < f4) {
            return f2 < f7 ? i.a.a : f2 < f8 ? i.a.e : i.a.c;
        }
        if (f >= f5) {
            return f2 < f7 ? i.a.b : f2 < f8 ? i.a.V : i.a.d;
        }
        if (f2 < f7) {
            return i.a.f;
        }
        if (f2 >= f8) {
            return i.a.W;
        }
        if (z) {
            return i.a.X;
        }
        return null;
    }

    public final RectF g() {
        RectF rectF = this.a;
        RectF rectF2 = this.b;
        rectF2.set(rectF);
        return rectF2;
    }
}
