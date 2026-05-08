package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class yai<E> extends pzh<E> {
    public static final yai<Object> c;
    public final ArrayList b;

    static {
        yai<Object> yaiVar = new yai<>(new ArrayList(0));
        c = yaiVar;
        yaiVar.a = false;
    }

    public yai(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        a();
        this.b.add(i, e);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.s5i
    public final s5i b0(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            o6.h();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new yai(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        return (E) this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        a();
        E e = (E) this.b.remove(i);
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        a();
        E e2 = (E) this.b.set(i, e);
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
