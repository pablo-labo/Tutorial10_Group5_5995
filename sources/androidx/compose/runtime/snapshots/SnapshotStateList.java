package androidx.compose.runtime.snapshots;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ak2;
import defpackage.ame;
import defpackage.bf8;
import defpackage.ca6;
import defpackage.gib;
import defpackage.ike;
import defpackage.j6g;
import defpackage.kse;
import defpackage.lse;
import defpackage.pse;
import defpackage.q3;
import defpackage.q92;
import defpackage.q9b;
import defpackage.qwe;
import defpackage.r3;
import defpackage.rse;
import defpackage.wl7;
import defpackage.wle;
import defpackage.yh;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\t\b\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Lpse;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class SnapshotStateList<T> implements Parcelable, pse, List<T>, RandomAccess, bf8 {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new a();
    public lse a;

    public SnapshotStateList(r3 r3Var) {
        wle wleVarJ = ame.j();
        lse lseVar = new lse(wleVarJ.g(), r3Var);
        if (!(wleVarJ instanceof ca6)) {
            lseVar.b = new lse(1L, r3Var);
        }
        this.a = lseVar;
    }

    public final void a(int i, int i2) {
        int i3;
        r3 r3Var;
        wle wleVarJ;
        boolean zG;
        do {
            synchronized (ak2.a0) {
                lse lseVar = this.a;
                lseVar.getClass();
                lse lseVar2 = (lse) ame.h(lseVar);
                i3 = lseVar2.d;
                r3Var = lseVar2.c;
                j6g j6gVar = j6g.a;
            }
            r3Var.getClass();
            q9b q9bVarG = r3Var.g();
            q9bVarG.subList(i, i2).clear();
            r3 r3VarD = q9bVarG.d();
            if (wl7.b(r3VarD, r3Var)) {
                return;
            }
            lse lseVar3 = this.a;
            lseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zG = ak2.g((lse) ame.v(lseVar3, this, wleVarJ), i3, r3VarD, true);
            }
            ame.m(wleVarJ, this);
        } while (!zG);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i;
        r3 r3Var;
        wle wleVarJ;
        boolean zG;
        do {
            synchronized (ak2.a0) {
                lse lseVar = this.a;
                lseVar.getClass();
                lse lseVar2 = (lse) ame.h(lseVar);
                i = lseVar2.d;
                r3Var = lseVar2.c;
                j6g j6gVar = j6g.a;
            }
            r3Var.getClass();
            r3 r3VarD = r3Var.d(t);
            if (r3VarD.equals(r3Var)) {
                return false;
            }
            lse lseVar3 = this.a;
            lseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zG = ak2.g((lse) ame.v(lseVar3, this, wleVarJ), i, r3VarD, true);
            }
            ame.m(wleVarJ, this);
        } while (!zG);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        r3 r3Var;
        wle wleVarJ;
        boolean zG;
        do {
            synchronized (ak2.a0) {
                lse lseVar = this.a;
                lseVar.getClass();
                lse lseVar2 = (lse) ame.h(lseVar);
                i = lseVar2.d;
                r3Var = lseVar2.c;
                j6g j6gVar = j6g.a;
            }
            r3Var.getClass();
            r3 r3VarF = r3Var.f(collection);
            if (wl7.b(r3VarF, r3Var)) {
                return false;
            }
            lse lseVar3 = this.a;
            lseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zG = ak2.g((lse) ame.v(lseVar3, this, wleVarJ), i, r3VarF, true);
            }
            ame.m(wleVarJ, this);
        } while (!zG);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        wle wleVarJ;
        lse lseVar = this.a;
        lseVar.getClass();
        synchronized (ame.c) {
            wle.e.getClass();
            wleVarJ = ame.j();
            lse lseVar2 = (lse) ame.v(lseVar, this, wleVarJ);
            synchronized (ak2.a0) {
                lseVar2.c = ike.b;
                lseVar2.d++;
                lseVar2.e++;
            }
        }
        ame.m(wleVarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ak2.q(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return ak2.q(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final T get(int i) {
        return (T) ak2.q(this).c.get(i);
    }

    @Override // defpackage.pse
    public final void i(rse rseVar) {
        rseVar.b = this.a;
        this.a = (lse) rseVar;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return ak2.q(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return ak2.q(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return ak2.q(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new kse(this, 0);
    }

    @Override // defpackage.pse
    public final rse n() {
        return this.a;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        r3 r3Var;
        wle wleVarJ;
        boolean zG;
        do {
            synchronized (ak2.a0) {
                lse lseVar = this.a;
                lseVar.getClass();
                lse lseVar2 = (lse) ame.h(lseVar);
                i = lseVar2.d;
                r3Var = lseVar2.c;
                j6g j6gVar = j6g.a;
            }
            r3Var.getClass();
            int iIndexOf = r3Var.indexOf(obj);
            r3 r3VarJ = iIndexOf != -1 ? r3Var.j(iIndexOf) : r3Var;
            if (wl7.b(r3VarJ, r3Var)) {
                return false;
            }
            lse lseVar3 = this.a;
            lseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zG = ak2.g((lse) ame.v(lseVar3, this, wleVarJ), i, r3VarJ, true);
            }
            ame.m(wleVarJ, this);
        } while (!zG);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i;
        r3 r3Var;
        wle wleVarJ;
        boolean zG;
        do {
            synchronized (ak2.a0) {
                lse lseVar = this.a;
                lseVar.getClass();
                lse lseVar2 = (lse) ame.h(lseVar);
                i = lseVar2.d;
                r3Var = lseVar2.c;
                j6g j6gVar = j6g.a;
            }
            r3Var.getClass();
            r3 r3VarI = r3Var.i(new q3(collection, 0));
            if (wl7.b(r3VarI, r3Var)) {
                return false;
            }
            lse lseVar3 = this.a;
            lseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zG = ak2.g((lse) ame.v(lseVar3, this, wleVarJ), i, r3VarI, true);
            }
            ame.m(wleVarJ, this);
        } while (!zG);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return ak2.w(this, new yh(collection, 17));
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        r3 r3Var;
        wle wleVarJ;
        boolean zG;
        T t2 = get(i);
        do {
            synchronized (ak2.a0) {
                lse lseVar = this.a;
                lseVar.getClass();
                lse lseVar2 = (lse) ame.h(lseVar);
                i2 = lseVar2.d;
                r3Var = lseVar2.c;
                j6g j6gVar = j6g.a;
            }
            r3Var.getClass();
            r3 r3VarK = r3Var.k(i, t);
            if (r3VarK.equals(r3Var)) {
                break;
            }
            lse lseVar3 = this.a;
            lseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zG = ak2.g((lse) ame.v(lseVar3, this, wleVarJ), i2, r3VarK, false);
            }
            ame.m(wleVarJ, this);
        } while (!zG);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return ak2.q(this).c.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            gib.a("fromIndex or toIndex are out of bounds");
        }
        return new qwe(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return q92.E(this);
    }

    public final String toString() {
        lse lseVar = this.a;
        lseVar.getClass();
        return "SnapshotStateList(value=" + ((lse) ame.h(lseVar)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        r3 r3Var = ak2.q(this).c;
        int size = r3Var.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(r3Var.get(i2));
        }
    }

    public static final class a implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
        public static SnapshotStateList a(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            int i = parcel.readInt();
            if (i == 0) {
                return new SnapshotStateList();
            }
            q9b q9bVarG = ike.b.g();
            for (int i2 = 0; i2 < i; i2++) {
                q9bVarG.add(parcel.readValue(classLoader));
            }
            return new SnapshotStateList(q9bVarG.d());
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SnapshotStateList[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ SnapshotStateList<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) q92.F(this, tArr);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new kse(this, i);
    }

    public SnapshotStateList() {
        this(ike.b);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        int i2;
        r3 r3Var;
        wle wleVarJ;
        boolean zG;
        do {
            synchronized (ak2.a0) {
                lse lseVar = this.a;
                lseVar.getClass();
                lse lseVar2 = (lse) ame.h(lseVar);
                i2 = lseVar2.d;
                r3Var = lseVar2.c;
                j6g j6gVar = j6g.a;
            }
            r3Var.getClass();
            r3 r3VarB = r3Var.b(i, t);
            if (r3VarB.equals(r3Var)) {
                return;
            }
            lse lseVar3 = this.a;
            lseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zG = ak2.g((lse) ame.v(lseVar3, this, wleVarJ), i2, r3VarB, true);
            }
            ame.m(wleVarJ, this);
        } while (!zG);
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection<? extends T> collection) {
        return ak2.w(this, new Function1() { // from class: pme
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i, collection));
            }
        });
    }

    @Override // java.util.List
    public final T remove(int i) {
        int i2;
        r3 r3Var;
        wle wleVarJ;
        boolean zG;
        T t = get(i);
        do {
            synchronized (ak2.a0) {
                lse lseVar = this.a;
                lseVar.getClass();
                lse lseVar2 = (lse) ame.h(lseVar);
                i2 = lseVar2.d;
                r3Var = lseVar2.c;
                j6g j6gVar = j6g.a;
            }
            r3Var.getClass();
            r3 r3VarJ = r3Var.j(i);
            if (r3VarJ.equals(r3Var)) {
                break;
            }
            lse lseVar3 = this.a;
            lseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zG = ak2.g((lse) ame.v(lseVar3, this, wleVarJ), i2, r3VarJ, true);
            }
            ame.m(wleVarJ, this);
        } while (!zG);
        return t;
    }
}
