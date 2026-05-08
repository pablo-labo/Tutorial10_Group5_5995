package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class dg1 {
    public int a;
    public long b;
    public final int c;
    public final int d;
    public final a e;

    public class a implements a6d<Bitmap> {
        public a() {
        }

        @Override // defpackage.a6d
        public final void a(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            try {
                dg1.this.a(bitmap2);
            } finally {
                bitmap2.recycle();
            }
        }
    }

    public dg1(int i, int i2) {
        web.e(Boolean.valueOf(i > 0));
        web.e(Boolean.valueOf(i2 > 0));
        this.c = i;
        this.d = i2;
        this.e = new a();
    }

    public final synchronized void a(Bitmap bitmap) {
        int iD = eh1.d(bitmap);
        web.f("No bitmaps registered.", this.a > 0);
        long j = iD;
        web.g(j <= this.b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iD), Long.valueOf(this.b));
        this.b -= j;
        this.a--;
    }

    public final synchronized int b() {
        return this.d;
    }
}
