package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.n;
import defpackage.sp9;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k extends j<n.d> {
    @Override // androidx.datastore.preferences.protobuf.j
    public final void a(Map.Entry entry) {
        ((n.d) entry.getKey()).getClass();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final n.e b(i iVar, sp9 sp9Var, int i) {
        return iVar.a.get(new i.a(i, sp9Var));
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final l<n.d> c(Object obj) {
        return ((n.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final l<n.d> d(Object obj) {
        n.c cVar = (n.c) obj;
        l<n.d> lVar = cVar.extensions;
        if (lVar.b) {
            cVar.extensions = lVar.clone();
        }
        return cVar.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean e(sp9 sp9Var) {
        return sp9Var instanceof n.c;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void f(Object obj) {
        l<n.d> lVar = ((n.c) obj).extensions;
        if (lVar.b) {
            return;
        }
        lVar.a.h();
        lVar.b = true;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final Object g(Object obj) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void h(Object obj) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void i(Object obj) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void j(Map.Entry entry) {
        ((n.d) entry.getKey()).getClass();
        throw null;
    }
}
