package defpackage;

import android.graphics.ColorSpace;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class vs4 implements Closeable {
    public int V;
    public int W;
    public xr1 X;
    public ColorSpace Y;
    public String Z;
    public final n82<PooledByteBuffer> a;
    public z07 b;
    public int c;
    public int d;
    public int e;
    public int f;

    public vs4() {
        throw null;
    }

    public vs4(n82<PooledByteBuffer> n82Var) {
        this.b = z07.c;
        this.c = -1;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.V = 1;
        this.W = -1;
        web.e(Boolean.valueOf(n82.W(n82Var)));
        this.a = n82Var.clone();
    }

    public static boolean P(vs4 vs4Var) {
        return vs4Var.c >= 0 && vs4Var.e >= 0 && vs4Var.f >= 0;
    }

    public static boolean W(vs4 vs4Var) {
        return vs4Var != null && vs4Var.Q();
    }

    public static vs4 a(vs4 vs4Var) {
        vs4 vs4Var2 = null;
        if (vs4Var == null) {
            return null;
        }
        n82 n82VarV = n82.v(vs4Var.a);
        if (n82VarV != null) {
            try {
                vs4Var2 = new vs4(n82VarV);
            } catch (Throwable th) {
                n82VarV.close();
                throw th;
            }
        }
        n82.G(n82VarV);
        if (vs4Var2 != null) {
            vs4Var2.p(vs4Var);
        }
        return vs4Var2;
    }

    public static void h(vs4 vs4Var) {
        if (vs4Var != null) {
            vs4Var.close();
        }
    }

    public final int G() {
        n82<PooledByteBuffer> n82Var = this.a;
        if (n82Var == null) {
            return this.W;
        }
        n82Var.P();
        return n82Var.P().size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c2, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs4.N():void");
    }

    public final synchronized boolean Q() {
        return n82.W(this.a);
    }

    public final void b0() {
        if (this.e < 0 || this.f < 0) {
            N();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n82.G(this.a);
    }

    public final void p(vs4 vs4Var) {
        vs4Var.b0();
        this.b = vs4Var.b;
        vs4Var.b0();
        this.e = vs4Var.e;
        vs4Var.b0();
        this.f = vs4Var.f;
        vs4Var.b0();
        this.c = vs4Var.c;
        vs4Var.b0();
        this.d = vs4Var.d;
        this.V = vs4Var.V;
        this.W = vs4Var.G();
        this.X = vs4Var.X;
        vs4Var.b0();
        this.Y = vs4Var.Y;
    }

    public final String s() {
        n82 n82VarV = n82.v(this.a);
        if (n82VarV == null) {
            return "";
        }
        int iMin = Math.min(G(), 10);
        byte[] bArr = new byte[iMin];
        try {
            ((PooledByteBuffer) n82VarV.P()).i(0, 0, iMin, bArr);
            n82VarV.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i = 0; i < iMin; i++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i])));
            }
            return sb.toString();
        } catch (Throwable th) {
            n82VarV.close();
            throw th;
        }
    }

    public final InputStream v() {
        n82 n82VarV = n82.v(this.a);
        if (n82VarV == null) {
            return null;
        }
        try {
            return new agb((PooledByteBuffer) n82VarV.P());
        } finally {
            n82VarV.close();
        }
    }
}
