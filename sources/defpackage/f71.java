package defpackage;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class f71 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public f71(BackEvent backEvent) {
        float fC = gg0.c(backEvent);
        float fD = gg0.d(backEvent);
        float fA = gg0.a(backEvent);
        int iB = gg0.b(backEvent);
        this.a = fC;
        this.b = fD;
        this.c = fA;
        this.d = iB;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return k6.h(sb, this.d, '}');
    }
}
