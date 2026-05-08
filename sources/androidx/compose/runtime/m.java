package androidx.compose.runtime;

import defpackage.a3a;
import defpackage.b3a;
import defpackage.fm2;
import defpackage.gib;
import defpackage.gke;
import defpackage.pd6;
import defpackage.qd6;
import defpackage.r6;
import defpackage.wl7;
import defpackage.x20;
import defpackage.ze8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m implements fm2, Iterable<Object>, ze8 {
    public boolean V;
    public int W;
    public HashMap<x20, qd6> Y;
    public a3a<b3a> Z;
    public int b;
    public int d;
    public int e;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public final Object f = new Object();
    public ArrayList<x20> X = new ArrayList<>();

    public final int a(x20 x20Var) {
        if (this.V) {
            d.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!x20Var.a()) {
            gib.a("Anchor refers to a group that was removed");
        }
        return x20Var.a;
    }

    public final void b() {
        this.Y = new HashMap<>();
    }

    public final l d() {
        if (this.V) {
            r6.g("Cannot read while a writer is pending");
            return null;
        }
        this.e++;
        return new l(this);
    }

    public final n f() {
        if (this.V) {
            d.c("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            d.c("Cannot start a writer when a reader is pending");
        }
        this.V = true;
        this.W++;
        return new n(this);
    }

    public final boolean g(x20 x20Var) {
        int iD;
        return x20Var.a() && (iD = gke.d(this.X, x20Var.a, this.b)) >= 0 && wl7.b(this.X.get(iD), x20Var);
    }

    public final qd6 i(int i) {
        int i2;
        ArrayList<x20> arrayList;
        int iD;
        HashMap<x20, qd6> map = this.Y;
        if (map != null) {
            if (this.V) {
                d.c("use active SlotWriter to crate an anchor for location instead");
            }
            x20 x20Var = (i < 0 || i >= (i2 = this.b) || (iD = gke.d((arrayList = this.X), i, i2)) < 0) ? null : arrayList.get(iD);
            if (x20Var != null) {
                return map.get(x20Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new pd6(this, 0, this.b);
    }
}
