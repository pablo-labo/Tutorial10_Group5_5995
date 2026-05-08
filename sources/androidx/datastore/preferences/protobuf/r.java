package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p;
import defpackage.o6;
import defpackage.ot8;
import defpackage.t6g;
import defpackage.tr1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class r extends c<String> implements ot8, RandomAccess {
    public final ArrayList b;

    static {
        new r(10).a = false;
    }

    public r(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // defpackage.ot8
    public final Object J1(int i) {
        return this.b.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.p.c
    public final p.c Q0(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            o6.h();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new r((ArrayList<Object>) arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof ot8) {
            collection = ((ot8) collection).h();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.ot8
    public final void f0(tr1 tr1Var) {
        a();
        this.b.add(tr1Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof tr1) {
            tr1 tr1Var = (tr1) obj;
            String strG = tr1Var.size() == 0 ? "" : tr1Var.g(p.a);
            if (tr1Var.d()) {
                arrayList.set(i, strG);
            }
            return strG;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, p.a);
        if (Utf8.a.c(0, bArr, bArr.length) == 0) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // defpackage.ot8
    public final List<?> h() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof tr1)) {
            return new String((byte[]) objRemove, p.a);
        }
        tr1 tr1Var = (tr1) objRemove;
        return tr1Var.size() == 0 ? "" : tr1Var.g(p.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof tr1)) {
            return new String((byte[]) obj2, p.a);
        }
        tr1 tr1Var = (tr1) obj2;
        return tr1Var.size() == 0 ? "" : tr1Var.g(p.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.ot8
    public final ot8 v() {
        return this.a ? new t6g(this) : this;
    }

    public r(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.b.size(), collection);
    }
}
