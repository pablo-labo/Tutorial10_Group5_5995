package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import defpackage.bgb;
import defpackage.cr8;
import defpackage.d47;
import defpackage.h84;
import defpackage.i98;
import defpackage.jo3;
import defpackage.k37;
import defpackage.l37;
import defpackage.r82;
import defpackage.s9a;
import defpackage.vs4;
import defpackage.web;
import defpackage.x4d;
import defpackage.yfd;
import defpackage.z07;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
@h84
public class NativeJpegTranscoder implements l37 {
    public boolean a;
    public int b;
    public boolean c;

    public static void e(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        s9a.a();
        web.e(Boolean.valueOf(i2 >= 1));
        web.e(Boolean.valueOf(i2 <= 16));
        web.e(Boolean.valueOf(i3 >= 0));
        web.e(Boolean.valueOf(i3 <= 100));
        d47<Integer> d47Var = i98.a;
        web.e(Boolean.valueOf(i >= 0 && i <= 270 && i % 90 == 0));
        web.f("no transformation requested", (i2 == 8 && i == 0) ? false : true);
        outputStream.getClass();
        nativeTranscodeJpeg(inputStream, outputStream, i, i2, i3);
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        boolean z;
        s9a.a();
        web.e(Boolean.valueOf(i2 >= 1));
        web.e(Boolean.valueOf(i2 <= 16));
        web.e(Boolean.valueOf(i3 >= 0));
        web.e(Boolean.valueOf(i3 <= 100));
        d47<Integer> d47Var = i98.a;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        web.e(Boolean.valueOf(z));
        web.f("no transformation requested", (i2 == 8 && i == 1) ? false : true);
        outputStream.getClass();
        nativeTranscodeJpegWithExifOrientation(inputStream, outputStream, i, i2, i3);
    }

    @h84
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @h84
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @Override // defpackage.l37
    public final String a() {
        return "NativeJpegTranscoder";
    }

    @Override // defpackage.l37
    public final k37 b(vs4 vs4Var, bgb bgbVar, yfd yfdVar, x4d x4dVar, ColorSpace colorSpace) {
        Integer num = 85;
        if (yfdVar == null) {
            yfdVar = yfd.c;
        }
        int iM = cr8.m(yfdVar, x4dVar, vs4Var, this.b);
        try {
            int iC = i98.c(yfdVar, x4dVar, vs4Var, this.a);
            int iMax = Math.max(1, 8 / iM);
            if (this.c) {
                iC = iMax;
            }
            InputStream inputStreamV = vs4Var.v();
            d47<Integer> d47Var = i98.a;
            vs4Var.b0();
            if (d47Var.contains(Integer.valueOf(vs4Var.d))) {
                int iA = i98.a(yfdVar, vs4Var);
                web.h(inputStreamV, "Cannot transcode from null input stream!");
                f(inputStreamV, bgbVar, iA, iC, num.intValue());
            } else {
                int iB = i98.b(yfdVar, vs4Var);
                web.h(inputStreamV, "Cannot transcode from null input stream!");
                e(inputStreamV, bgbVar, iB, iC, num.intValue());
            }
            r82.b(inputStreamV);
            return new k37(iM != 1 ? 0 : 1);
        } catch (Throwable th) {
            r82.b(null);
            throw th;
        }
    }

    @Override // defpackage.l37
    public final boolean c(vs4 vs4Var, yfd yfdVar, x4d x4dVar) {
        if (yfdVar == null) {
            yfdVar = yfd.c;
        }
        return i98.c(yfdVar, x4dVar, vs4Var, this.a) < 8;
    }

    @Override // defpackage.l37
    public final boolean d(z07 z07Var) {
        return z07Var == jo3.a;
    }
}
