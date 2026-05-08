package defpackage;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class tpe extends td0 {
    public long e;
    public boolean f;
    public double g;
    public double h;
    public double i;
    public double j;
    public boolean k;
    public final a l;
    public double m;
    public double n;
    public double o;
    public double p;
    public double q;
    public int r;
    public int s;
    public double t;

    public static final class a {
        public double a;
        public double b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.a, aVar.a) == 0 && Double.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "PhysicsState(position=" + this.a + ", velocity=" + this.b + ")";
        }
    }

    public tpe(ReadableMap readableMap) {
        readableMap.getClass();
        a aVar = new a();
        aVar.a = 0.0d;
        aVar.b = 0.0d;
        this.l = aVar;
        aVar.b = readableMap.getDouble("initialVelocity");
        a(readableMap);
    }

    @Override // defpackage.td0
    public final void a(ReadableMap readableMap) {
        readableMap.getClass();
        this.g = readableMap.getDouble("stiffness");
        this.h = readableMap.getDouble("damping");
        this.i = readableMap.getDouble("mass");
        this.j = this.l.b;
        this.n = readableMap.getDouble("toValue");
        this.o = readableMap.getDouble("restSpeedThreshold");
        this.p = readableMap.getDouble("restDisplacementThreshold");
        this.k = readableMap.getBoolean("overshootClamping");
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.r = i;
        this.a = i == 0;
        this.s = 0;
        this.q = 0.0d;
        this.f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0122  */
    @Override // defpackage.td0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r28) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tpe.b(long):void");
    }

    public final boolean c() {
        a aVar = this.l;
        if (Math.abs(aVar.b) <= this.o) {
            return Math.abs(this.n - aVar.a) <= this.p || this.g == 0.0d;
        }
        return false;
    }
}
