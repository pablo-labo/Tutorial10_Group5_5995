package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class pfb implements ct2 {
    public final String a;
    public final a b;
    public final dc0 c;
    public final tc0<PointF, PointF> d;
    public final dc0 e;
    public final dc0 f;
    public final dc0 g;
    public final dc0 h;
    public final dc0 i;
    public final boolean j;
    public final boolean k;

    public enum a {
        STAR(1),
        /* JADX INFO: Fake field, exist only in values array */
        POLYGON(2);

        private final int value;

        a(int i) {
            this.value = i;
        }

        public static a a(int i) {
            for (a aVar : values()) {
                if (aVar.value == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public pfb(String str, a aVar, dc0 dc0Var, tc0<PointF, PointF> tc0Var, dc0 dc0Var2, dc0 dc0Var3, dc0 dc0Var4, dc0 dc0Var5, dc0 dc0Var6, boolean z, boolean z2) {
        this.a = str;
        this.b = aVar;
        this.c = dc0Var;
        this.d = tc0Var;
        this.e = dc0Var2;
        this.f = dc0Var3;
        this.g = dc0Var4;
        this.h = dc0Var5;
        this.i = dc0Var6;
        this.j = z;
        this.k = z2;
    }

    @Override // defpackage.ct2
    public final ks2 a(j79 j79Var, s69 s69Var, ba1 ba1Var) {
        return new ofb(j79Var, ba1Var, this);
    }
}
