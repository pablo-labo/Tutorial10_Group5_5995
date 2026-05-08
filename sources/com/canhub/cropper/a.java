package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.CropImageView;
import defpackage.a74;
import defpackage.c1f;
import defpackage.d78;
import defpackage.e13;
import defpackage.eq3;
import defpackage.g13;
import defpackage.j6g;
import defpackage.k89;
import defpackage.m89;
import defpackage.u63;
import defpackage.v03;
import defpackage.wl7;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e13 {
    public final int V;
    public final int W;
    public final boolean X;
    public final int Y;
    public final int Z;
    public final Context a;
    public final int a0;
    public final WeakReference<CropImageView> b;
    public final int b0;
    public final Uri c;
    public final boolean c0;
    public final Bitmap d;
    public final boolean d0;
    public final float[] e;
    public final CropImageView.j e0;
    public final int f;
    public final Bitmap.CompressFormat f0;
    public final int g0;
    public final Uri h0;
    public d78 i0;

    /* JADX INFO: renamed from: com.canhub.cropper.a$a, reason: collision with other inner class name */
    public static final class C0119a {
        public final Bitmap a;
        public final Uri b;
        public final Exception c;
        public final int d;

        public C0119a(Bitmap bitmap, Uri uri, Exception exc, int i) {
            this.a = bitmap;
            this.b = uri;
            this.c = exc;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0119a)) {
                return false;
            }
            C0119a c0119a = (C0119a) obj;
            return wl7.b(this.a, c0119a.a) && wl7.b(this.b, c0119a.b) && wl7.b(this.c, c0119a.c) && this.d == c0119a.d;
        }

        public final int hashCode() {
            Bitmap bitmap = this.a;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Uri uri = this.b;
            int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
            Exception exc = this.c;
            return Integer.hashCode(this.d) + ((iHashCode2 + (exc != null ? exc.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Result(bitmap=" + this.a + ", uri=" + this.b + ", error=" + this.c + ", sampleSize=" + this.d + ")";
        }
    }

    public a(Context context, WeakReference<CropImageView> weakReference, Uri uri, Bitmap bitmap, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, CropImageView.j jVar, Bitmap.CompressFormat compressFormat, int i8, Uri uri2) {
        fArr.getClass();
        jVar.getClass();
        compressFormat.getClass();
        this.a = context;
        this.b = weakReference;
        this.c = uri;
        this.d = bitmap;
        this.e = fArr;
        this.f = i;
        this.V = i2;
        this.W = i3;
        this.X = z;
        this.Y = i4;
        this.Z = i5;
        this.a0 = i6;
        this.b0 = i7;
        this.c0 = z2;
        this.d0 = z3;
        this.e0 = jVar;
        this.f0 = compressFormat;
        this.g0 = i8;
        this.h0 = uri2;
        this.i0 = u63.f();
    }

    public static final Object a(a aVar, C0119a c0119a, c1f c1fVar) throws Throwable {
        aVar.getClass();
        eq3 eq3Var = a74.a;
        Object objQ0 = u63.q0(m89.a, new b(aVar, c0119a, null), c1fVar);
        return objQ0 == g13.a ? objQ0 : j6g.a;
    }

    @Override // defpackage.e13
    public final v03 getCoroutineContext() {
        eq3 eq3Var = a74.a;
        k89 k89Var = m89.a;
        d78 d78Var = this.i0;
        k89Var.getClass();
        return v03.a.C0438a.c(k89Var, d78Var);
    }
}
