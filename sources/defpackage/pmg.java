package defpackage;

import defpackage.ge0;

/* JADX INFO: loaded from: classes.dex */
public final class pmg<V extends ge0> implements omg<V> {
    public final he0 a;
    public V b;
    public V c;
    public V d;

    public static final class a implements he0 {
        public final /* synthetic */ zh5 a;

        public a(zh5 zh5Var) {
            this.a = zh5Var;
        }

        @Override // defpackage.he0
        public final zh5 get(int i) {
            return this.a;
        }
    }

    public pmg(zh5 zh5Var) {
        this(new a(zh5Var));
    }

    @Override // defpackage.lmg
    public final long d(V v, V v2, V v3) {
        int iB = v.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, this.a.get(i).f(v.a(i), v2.a(i), v3.a(i)));
        }
        return jMax;
    }

    @Override // defpackage.lmg
    public final V k(V v, V v2, V v3) {
        if (this.d == null) {
            this.d = (V) v3.c();
        }
        V v4 = this.d;
        if (v4 == null) {
            wl7.g("endVelocityVector");
            throw null;
        }
        int iB = v4.b();
        int i = 0;
        while (true) {
            V v5 = this.d;
            if (i >= iB) {
                if (v5 != null) {
                    return v5;
                }
                wl7.g("endVelocityVector");
                throw null;
            }
            if (v5 == null) {
                wl7.g("endVelocityVector");
                throw null;
            }
            v5.e(this.a.get(i).c(v.a(i), v2.a(i), v3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.lmg
    public final V o(long j, V v, V v2, V v3) {
        if (this.c == null) {
            this.c = (V) v3.c();
        }
        V v4 = this.c;
        if (v4 == null) {
            wl7.g("velocityVector");
            throw null;
        }
        int iB = v4.b();
        int i = 0;
        while (true) {
            V v5 = this.c;
            if (i >= iB) {
                if (v5 != null) {
                    return v5;
                }
                wl7.g("velocityVector");
                throw null;
            }
            if (v5 == null) {
                wl7.g("velocityVector");
                throw null;
            }
            v5.e(this.a.get(i).e(j, v.a(i), v2.a(i), v3.a(i)), i);
            i++;
        }
    }

    @Override // defpackage.lmg
    public final V q(long j, V v, V v2, V v3) {
        if (this.b == null) {
            this.b = (V) v.c();
        }
        V v4 = this.b;
        if (v4 == null) {
            wl7.g("valueVector");
            throw null;
        }
        int iB = v4.b();
        int i = 0;
        while (true) {
            V v5 = this.b;
            if (i >= iB) {
                if (v5 != null) {
                    return v5;
                }
                wl7.g("valueVector");
                throw null;
            }
            if (v5 == null) {
                wl7.g("valueVector");
                throw null;
            }
            v5.e(this.a.get(i).d(j, v.a(i), v2.a(i), v3.a(i)), i);
            i++;
        }
    }

    public pmg(he0 he0Var) {
        this.a = he0Var;
    }
}
