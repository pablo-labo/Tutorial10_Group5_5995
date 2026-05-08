package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class jm3 extends u81 implements p82 {
    public static final /* synthetic */ int X = 0;
    public final int V;
    public final int W;
    public n82 d;
    public volatile Bitmap e;
    public final h47 f;

    public jm3(n82 n82Var, h47 h47Var, int i, int i2) {
        n82 n82VarP = n82Var.p();
        n82VarP.getClass();
        this.d = n82VarP;
        this.e = (Bitmap) n82VarP.P();
        this.f = h47Var;
        this.V = i;
        this.W = i2;
    }

    @Override // defpackage.p82
    public final int D0() {
        return this.W;
    }

    @Override // defpackage.p82
    public final int X0() {
        return this.V;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n82 n82Var;
        synchronized (this) {
            n82Var = this.d;
            this.d = null;
            this.e = null;
        }
        if (n82Var != null) {
            n82Var.close();
        }
    }

    public final void finalize() throws Throwable {
        boolean z;
        synchronized (this) {
            z = this.d == null;
        }
        if (z) {
            return;
        }
        s55.p("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", jm3.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // defpackage.l82, defpackage.b17
    public final int getHeight() {
        int i;
        if (this.V % 180 != 0 || (i = this.W) == 5 || i == 7) {
            Bitmap bitmap = this.e;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.e;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    @Override // defpackage.l82, defpackage.b17
    public final int getWidth() {
        int i;
        if (this.V % 180 != 0 || (i = this.W) == 5 || i == 7) {
            Bitmap bitmap = this.e;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.e;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    @Override // defpackage.u81, defpackage.l82
    public final h47 o1() {
        return this.f;
    }

    @Override // defpackage.l82
    public final int t0() {
        return eh1.d(this.e);
    }

    @Override // defpackage.j82
    public final Bitmap t1() {
        return this.e;
    }

    public jm3(Bitmap bitmap, a6d a6dVar, h47 h47Var) {
        this.e = bitmap;
        Bitmap bitmap2 = this.e;
        a6dVar.getClass();
        this.d = n82.d0(bitmap2, a6dVar, n82.f);
        this.f = h47Var;
        this.V = 0;
        this.W = 0;
    }
}
