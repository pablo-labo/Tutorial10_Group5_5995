package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.DisplayMetrics;
import defpackage.a74;
import defpackage.d78;
import defpackage.e13;
import defpackage.eq3;
import defpackage.ia;
import defpackage.k89;
import defpackage.m89;
import defpackage.p6;
import defpackage.u63;
import defpackage.uz;
import defpackage.v03;
import defpackage.w40;
import defpackage.wl7;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e13 {
    public final Context a;
    public final Uri b;
    public final int c;
    public final int d;
    public final WeakReference<CropImageView> e;
    public d78 f = u63.f();

    public static final class a {
        public final Uri a;
        public final Bitmap b;
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final Exception g;

        public a(Uri uri, Bitmap bitmap, int i, int i2, boolean z, boolean z2, Exception exc) {
            this.a = uri;
            this.b = bitmap;
            this.c = i;
            this.d = i2;
            this.e = z;
            this.f = z2;
            this.g = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && wl7.b(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && wl7.b(this.g, aVar.g);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Bitmap bitmap = this.b;
            int iF = ia.f(ia.f(w40.c(this.d, w40.c(this.c, (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31), 31), 31, this.e), 31, this.f);
            Exception exc = this.g;
            return iF + (exc != null ? exc.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(uri=");
            sb.append(this.a);
            sb.append(", bitmap=");
            sb.append(this.b);
            sb.append(", loadSampleSize=");
            uz.i(sb, this.c, ", degreesRotated=", this.d, ", flipHorizontally=");
            p6.j(sb, this.e, ", flipVertically=", this.f, ", error=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    public d(Context context, CropImageView cropImageView, Uri uri) {
        this.a = context;
        this.b = uri;
        this.e = new WeakReference<>(cropImageView);
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        double d = f > 1.0f ? 1.0d / ((double) f) : 1.0d;
        this.c = (int) (((double) displayMetrics.widthPixels) * d);
        this.d = (int) (((double) displayMetrics.heightPixels) * d);
    }

    @Override // defpackage.e13
    public final v03 getCoroutineContext() {
        eq3 eq3Var = a74.a;
        k89 k89Var = m89.a;
        d78 d78Var = this.f;
        k89Var.getClass();
        return v03.a.C0438a.c(k89Var, d78Var);
    }
}
