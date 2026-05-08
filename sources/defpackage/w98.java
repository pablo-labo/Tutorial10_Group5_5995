package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class w98 extends ka8 implements Iterable<ka8> {
    public final ArrayList<ka8> a;

    public w98() {
        this.a = new ArrayList<>();
    }

    @Override // defpackage.ka8
    public final boolean a() {
        return k().a();
    }

    @Override // defpackage.ka8
    public final int b() {
        return k().b();
    }

    @Override // defpackage.ka8
    public final long e() {
        return k().e();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof w98) && ((w98) obj).a.equals(this.a);
        }
        return true;
    }

    @Override // defpackage.ka8
    public final Number f() {
        return k().f();
    }

    @Override // defpackage.ka8
    public final String g() {
        return k().g();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(ka8 ka8Var) {
        if (ka8Var == null) {
            ka8Var = xa8.a;
        }
        this.a.add(ka8Var);
    }

    @Override // java.lang.Iterable
    public final Iterator<ka8> iterator() {
        return this.a.iterator();
    }

    public final void j(String str) {
        this.a.add(str == null ? xa8.a : new fb8(str));
    }

    public final ka8 k() {
        ArrayList<ka8> arrayList = this.a;
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        r6.g(p6.c(size, "Array must have size 1, but has size "));
        return null;
    }

    public final int size() {
        return this.a.size();
    }

    public w98(int i) {
        this.a = new ArrayList<>(i);
    }
}
