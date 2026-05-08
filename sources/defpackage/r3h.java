package defpackage;

import androidx.work.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class r3h {
    public final String a;
    public s2h b;
    public final String c;
    public String d;
    public b e;
    public final b f;
    public long g;
    public final long h;
    public final long i;
    public jq2 j;
    public final int k;
    public final b81 l;
    public final long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final iwa r;
    public final int s;
    public final int t;

    public static final class a {
        public String a;
        public s2h b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
        }
    }

    static {
        z39.f("WorkSpec");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r3h(String str, s2h s2hVar, String str2, String str3, b bVar, b bVar2, long j, long j2, long j3, jq2 jq2Var, int i, b81 b81Var, long j4, long j5, long j6, long j7, boolean z, iwa iwaVar, int i2, int i3, int i4) {
        b bVar3;
        b bVar4;
        s2h s2hVar2 = (i3 & 2) != 0 ? s2h.a : s2hVar;
        String str4 = (i3 & 8) != 0 ? null : str3;
        if ((i3 & 16) != 0) {
            b bVar5 = b.c;
            bVar5.getClass();
            bVar3 = bVar5;
        } else {
            bVar3 = bVar;
        }
        if ((i3 & 32) != 0) {
            b bVar6 = b.c;
            bVar6.getClass();
            bVar4 = bVar6;
        } else {
            bVar4 = bVar2;
        }
        this(str, s2hVar2, str2, str4, bVar3, bVar4, (i3 & 64) != 0 ? 0L : j, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 0L : j2, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0L : j3, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? jq2.i : jq2Var, (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? 0 : i, (i3 & 2048) != 0 ? b81.a : b81Var, (i3 & 4096) != 0 ? 30000L : j4, (i3 & 8192) != 0 ? 0L : j5, (i3 & 16384) != 0 ? 0L : j6, (32768 & i3) != 0 ? -1L : j7, (65536 & i3) != 0 ? false : z, (131072 & i3) != 0 ? iwa.a : iwaVar, (i3 & 262144) != 0 ? 0 : i2, 0);
    }

    public final long a() {
        int i;
        if (this.b == s2h.a && (i = this.k) > 0) {
            b81 b81Var = this.l;
            b81 b81Var2 = b81.b;
            long j = this.m;
            long jScalb = b81Var == b81Var2 ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            long j2 = this.n;
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.g;
        }
        long j3 = this.n;
        int i2 = this.s;
        if (i2 == 0) {
            j3 += this.g;
        }
        long j4 = this.i;
        long j5 = this.h;
        if (j4 != j5) {
            return j3 + j5 + (i2 == 0 ? (-1) * j4 : 0L);
        }
        return j3 + (i2 != 0 ? j5 : 0L);
    }

    public final boolean b() {
        return !wl7.b(jq2.i, this.j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3h)) {
            return false;
        }
        r3h r3hVar = (r3h) obj;
        return wl7.b(this.a, r3hVar.a) && this.b == r3hVar.b && wl7.b(this.c, r3hVar.c) && wl7.b(this.d, r3hVar.d) && wl7.b(this.e, r3hVar.e) && wl7.b(this.f, r3hVar.f) && this.g == r3hVar.g && this.h == r3hVar.h && this.i == r3hVar.i && wl7.b(this.j, r3hVar.j) && this.k == r3hVar.k && this.l == r3hVar.l && this.m == r3hVar.m && this.n == r3hVar.n && this.o == r3hVar.o && this.p == r3hVar.p && this.q == r3hVar.q && this.r == r3hVar.r && this.s == r3hVar.s && this.t == r3hVar.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    public final int hashCode() {
        int iD = akb.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iD2 = ia.d(ia.d(ia.d(ia.d((this.l.hashCode() + w40.c(this.k, (this.j.hashCode() + ia.d(ia.d(ia.d((this.f.hashCode() + ((this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        boolean z = this.q;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return Integer.hashCode(this.t) + w40.c(this.s, (this.r.hashCode() + ((iD2 + r2) * 31)) * 31, 31);
    }

    public final String toString() {
        return w40.f(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public r3h(String str, s2h s2hVar, String str2, String str3, b bVar, b bVar2, long j, long j2, long j3, jq2 jq2Var, int i, b81 b81Var, long j4, long j5, long j6, long j7, boolean z, iwa iwaVar, int i2, int i3) {
        str.getClass();
        s2hVar.getClass();
        str2.getClass();
        bVar.getClass();
        bVar2.getClass();
        jq2Var.getClass();
        b81Var.getClass();
        iwaVar.getClass();
        this.a = str;
        this.b = s2hVar;
        this.c = str2;
        this.d = str3;
        this.e = bVar;
        this.f = bVar2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = jq2Var;
        this.k = i;
        this.l = b81Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = iwaVar;
        this.s = i2;
        this.t = i3;
    }
}
