package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class rx9 {
    public final String a;
    public final HashSet<vge<?>> b;
    public final HashMap<String, hg7<?>> c;
    public final HashSet<a9c> d;
    public final ArrayList e;

    public rx9(int i) {
        this.a = t40.h();
        this.b = new HashSet<>();
        this.c = new HashMap<>();
        this.d = new HashSet<>();
        this.e = new ArrayList();
    }

    public final void a(hg7<?> hg7Var) {
        ue1<?> ue1Var = hg7Var.a;
        this.c.put(mh2.m(ue1Var.b, ue1Var.c, ue1Var.a), hg7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rx9.class == obj.getClass() && wl7.b(this.a, ((rx9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public rx9() {
        this(0);
    }
}
