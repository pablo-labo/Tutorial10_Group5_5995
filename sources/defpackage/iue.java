package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import defpackage.h94;
import defpackage.t27;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class iue implements j5d<InputStream, Bitmap> {
    public final h94 a;
    public final kt0 b;

    public static class a implements h94.b {
        public final RecyclableBufferedInputStream a;
        public final a15 b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, a15 a15Var) {
            this.a = recyclableBufferedInputStream;
            this.b = a15Var;
        }

        @Override // h94.b
        public final void a() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.c = recyclableBufferedInputStream.a.length;
            }
        }

        @Override // h94.b
        public final void b(bh1 bh1Var, Bitmap bitmap) throws IOException {
            IOException iOException = this.b.b;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                bh1Var.d(bitmap);
                throw iOException;
            }
        }
    }

    public iue(h94 h94Var, kt0 kt0Var) {
        this.a = h94Var;
        this.b = kt0Var;
    }

    @Override // defpackage.j5d
    public final boolean a(InputStream inputStream, ova ovaVar) {
        return true;
    }

    @Override // defpackage.j5d
    public final f5d<Bitmap> b(InputStream inputStream, int i, int i2, ova ovaVar) {
        boolean z;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        a15 a15Var;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream2;
            z = false;
        } else {
            z = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream2, this.b);
        }
        ArrayDeque arrayDeque = a15.c;
        synchronized (arrayDeque) {
            a15Var = (a15) arrayDeque.poll();
        }
        if (a15Var == null) {
            a15Var = new a15();
        }
        a15 a15Var2 = a15Var;
        a15Var2.a = recyclableBufferedInputStream;
        vc9 vc9Var = new vc9(a15Var2);
        a aVar = new a(recyclableBufferedInputStream, a15Var2);
        try {
            h94 h94Var = this.a;
            dh1 dh1VarA = h94Var.a(new t27.b(vc9Var, h94Var.d, h94Var.c), i, i2, ovaVar, aVar);
            a15Var2.b = null;
            a15Var2.a = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(a15Var2);
            }
            if (z) {
                recyclableBufferedInputStream.h();
            }
            return dh1VarA;
        } catch (Throwable th) {
            a15Var2.b = null;
            a15Var2.a = null;
            ArrayDeque arrayDeque2 = a15.c;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(a15Var2);
                if (!z) {
                    throw th;
                }
                recyclableBufferedInputStream.h();
                throw th;
            }
        }
    }
}
