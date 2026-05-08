package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class wi3 extends td0 {
    public double e;
    public double f;
    public long g;
    public double h;
    public double i;
    public int j;
    public int k;

    @Override // defpackage.td0
    public final void a(ReadableMap readableMap) {
        readableMap.getClass();
        this.e = readableMap.getDouble("velocity");
        this.f = readableMap.getDouble("deceleration");
        this.g = -1L;
        this.h = 0.0d;
        this.i = 0.0d;
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.j = i;
        this.k = 1;
        this.a = i == 0;
    }

    @Override // defpackage.td0
    public final void b(long j) {
        elg elgVar = this.b;
        if (elgVar == null) {
            l5.q("Animated value should not be null");
            return;
        }
        long j2 = j / 1000000;
        if (this.g == -1) {
            this.g = j2 - 16;
            double d = this.h;
            if (d == this.i) {
                this.h = elgVar.e;
            } else {
                elgVar.e = d;
            }
            this.i = elgVar.e;
        }
        double d2 = this.h;
        double d3 = this.e;
        double d4 = this.f;
        double dExp = ((1.0d - Math.exp((-(1.0d - d4)) * (j2 - this.g))) * (d3 / (1.0d - d4))) + d2;
        if (Math.abs(this.i - dExp) < 0.1d) {
            int i = this.j;
            if (i != -1 && this.k >= i) {
                this.a = true;
                return;
            } else {
                this.g = -1L;
                this.k++;
            }
        }
        this.i = dExp;
        elgVar.e = dExp;
    }
}
