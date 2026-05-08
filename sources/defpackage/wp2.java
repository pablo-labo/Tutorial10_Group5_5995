package defpackage;

import defpackage.mne;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wp2 {
    public int b;
    public boolean c;
    public final gq2 d;
    public final a e;
    public wp2 f;
    public mne i;
    public HashSet<wp2> a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a V;
        public static final a W;
        public static final /* synthetic */ a[] X;
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("NONE", 0);
            a aVar2 = new a("LEFT", 1);
            a = aVar2;
            a aVar3 = new a("TOP", 2);
            b = aVar3;
            a aVar4 = new a("RIGHT", 3);
            c = aVar4;
            a aVar5 = new a("BOTTOM", 4);
            d = aVar5;
            a aVar6 = new a("BASELINE", 5);
            e = aVar6;
            a aVar7 = new a("CENTER", 6);
            f = aVar7;
            a aVar8 = new a("CENTER_X", 7);
            V = aVar8;
            a aVar9 = new a("CENTER_Y", 8);
            W = aVar9;
            X = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) X.clone();
        }
    }

    public wp2(gq2 gq2Var, a aVar) {
        this.d = gq2Var;
        this.e = aVar;
    }

    public final void a(wp2 wp2Var, int i, int i2) {
        if (wp2Var == null) {
            g();
            return;
        }
        this.f = wp2Var;
        if (wp2Var.a == null) {
            wp2Var.a = new HashSet<>();
        }
        HashSet<wp2> hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
    }

    public final void b(int i, dzg dzgVar, ArrayList arrayList) {
        HashSet<wp2> hashSet = this.a;
        if (hashSet != null) {
            Iterator<wp2> it = hashSet.iterator();
            while (it.hasNext()) {
                sd6.a(it.next().d, i, arrayList, dzgVar);
            }
        }
    }

    public final int c() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int d() {
        wp2 wp2Var;
        if (this.d.h0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (wp2Var = this.f) == null || wp2Var.d.h0 != 8) ? this.g : i;
    }

    public final boolean e() {
        wp2 wp2Var;
        HashSet<wp2> hashSet = this.a;
        if (hashSet != null) {
            for (wp2 wp2Var2 : hashSet) {
                gq2 gq2Var = wp2Var2.d;
                a aVar = wp2Var2.e;
                switch (aVar.ordinal()) {
                    case 0:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        wp2Var = null;
                        break;
                    case 1:
                        wp2Var = gq2Var.K;
                        break;
                    case 2:
                        wp2Var = gq2Var.L;
                        break;
                    case 3:
                        wp2Var = gq2Var.I;
                        break;
                    case 4:
                        wp2Var = gq2Var.J;
                        break;
                    default:
                        g7.l(aVar.name());
                        return false;
                }
                if (wp2Var.f()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f != null;
    }

    public final void g() {
        HashSet<wp2> hashSet;
        wp2 wp2Var = this.f;
        if (wp2Var != null && (hashSet = wp2Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void h() {
        mne mneVar = this.i;
        if (mneVar == null) {
            this.i = new mne(mne.a.a);
        } else {
            mneVar.e();
        }
    }

    public final void i(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.i0 + ":" + this.e.toString();
    }
}
