package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class t6i extends pzh<String> implements q6i, RandomAccess {
    public final ArrayList b;

    static {
        new t6i(10).a = false;
    }

    public t6i(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.pzh, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof q6i) {
            collection = ((q6i) collection).m0();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
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
        return new t6i((ArrayList<Object>) arrayList2);
    }

    @Override // defpackage.pzh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.q6i
    public final q6i d1() {
        return this.a ? new qdi(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h0i) {
            h0i h0iVar = (h0i) obj;
            String strC = h0iVar.size() == 0 ? "" : h0iVar.c(p5i.a);
            if (h0iVar.d()) {
                arrayList.set(i, strC);
            }
            return strC;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, p5i.a);
        if (cei.a.H1(bArr, 0, bArr.length)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // defpackage.q6i
    public final void j1(h0i h0iVar) {
        a();
        this.b.add(h0iVar);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.q6i
    public final List<?> m0() {
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
        if (!(objRemove instanceof h0i)) {
            return new String((byte[]) objRemove, p5i.a);
        }
        h0i h0iVar = (h0i) objRemove;
        return h0iVar.size() == 0 ? "" : h0iVar.c(p5i.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof h0i)) {
            return new String((byte[]) obj2, p5i.a);
        }
        h0i h0iVar = (h0i) obj2;
        return h0iVar.size() == 0 ? "" : h0iVar.c(p5i.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public t6i(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }

    @Override // defpackage.pzh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.b.size(), collection);
    }
}
