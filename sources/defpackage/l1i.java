package defpackage;

import com.google.android.gms.internal.measurement.a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class l1i extends wuh<String> implements q1i, RandomAccess {
    public final ArrayList b;

    static {
        new l1i(10).a = false;
    }

    public l1i(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // defpackage.q1i
    public final void O1(fvh fvhVar) {
        a();
        this.b.add(fvhVar);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.q1i
    public final Object P(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.wuh, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof q1i) {
            collection = ((q1i) collection).zzd();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // defpackage.wuh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof fvh) {
            fvh fvhVar = (fvh) obj;
            String strD = fvhVar.b() == 0 ? "" : fvhVar.d(mzh.a);
            if (fvhVar.zzc()) {
                arrayList.set(i, strD);
            }
            return strD;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, mzh.a);
        if (a.a.F1(0, bArr, bArr.length)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof fvh)) {
            return new String((byte[]) objRemove, mzh.a);
        }
        fvh fvhVar = (fvh) objRemove;
        return fvhVar.b() == 0 ? "" : fvhVar.d(mzh.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof fvh)) {
            return new String((byte[]) obj2, mzh.a);
        }
        fvh fvhVar = (fvh) obj2;
        return fvhVar.b() == 0 ? "" : fvhVar.d(mzh.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.e0i
    public final e0i zza(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            o6.h();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new l1i((ArrayList<Object>) arrayList2);
    }

    @Override // defpackage.q1i
    public final List<?> zzd() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.q1i
    public final q1i zze() {
        return this.a ? new d8i(this) : this;
    }

    public l1i(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }

    @Override // defpackage.wuh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.b.size(), collection);
    }
}
