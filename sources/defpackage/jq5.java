package defpackage;

import android.view.Choreographer;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes2.dex */
public final class jq5 implements Choreographer.FrameCallback {
    public int V;
    public int W;
    public int X;
    public double Y;
    public boolean Z;
    public final ReactContext a;
    public Choreographer b;
    public final q44 c;
    public long d;
    public long e;
    public int f;

    public jq5(ReactContext reactContext) {
        reactContext.getClass();
        this.a = reactContext;
        this.c = new q44();
        this.d = -1L;
        this.e = -1L;
        this.Y = 60.0d;
        this.Z = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z;
        if (this.d == -1) {
            this.d = j;
        }
        long j2 = this.e;
        this.e = j;
        q44 q44Var = this.c;
        synchronized (q44Var) {
            try {
                boolean zI = c0h.i(j2, j, q44Var.d);
                long jH = c0h.h(j2, j, q44Var.a);
                long jH2 = c0h.h(j2, j, q44Var.b);
                z = false;
                boolean z2 = (jH == -1 && jH2 == -1) ? q44Var.e : jH > jH2;
                if (zI || (z2 && !c0h.i(j2, j, q44Var.c))) {
                    z = true;
                }
                c0h.f(q44Var.a, j);
                c0h.f(q44Var.b, j);
                c0h.f(q44Var.c, j);
                c0h.f(q44Var.d, j);
                q44Var.e = z2;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.X++;
        }
        this.f++;
        int i = (int) (((this.Y * ((double) ((int) ((this.e - this.d) / 1000000.0d)))) / 1000.0d) + 1.0d);
        if ((i - this.V) - 1 >= 4) {
            this.W++;
        }
        this.V = i;
        Choreographer choreographer = this.b;
        if (choreographer != null) {
            choreographer.postFrameCallback(this);
        }
    }
}
