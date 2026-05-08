package androidx.compose.runtime.snapshots;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ame;
import defpackage.j6g;
import defpackage.jf8;
import defpackage.k9b;
import defpackage.l9b;
import defpackage.o9b;
import defpackage.pse;
import defpackage.q92;
import defpackage.r6;
import defpackage.rme;
import defpackage.rse;
import defpackage.sse;
import defpackage.tse;
import defpackage.wl7;
import defpackage.wle;
import defpackage.z92;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "T", "Landroid/os/Parcelable;", "Lpse;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class SnapshotStateSet<T> implements Parcelable, pse, Set<T>, RandomAccess, jf8 {
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new a();
    public tse a;

    public SnapshotStateSet() {
        k9b k9bVar = k9b.d;
        tse tseVar = new tse(ame.j().g(), k9bVar);
        wle.e.getClass();
        if (ame.b.a() != null) {
            tseVar.b = new tse(1L, k9bVar);
        }
        this.a = tseVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        int i;
        o9b<? extends T> o9bVar;
        wle wleVarJ;
        boolean zA;
        do {
            synchronized (rme.a) {
                tse tseVar = this.a;
                tseVar.getClass();
                tse tseVar2 = (tse) ame.h(tseVar);
                i = tseVar2.d;
                o9bVar = tseVar2.c;
                j6g j6gVar = j6g.a;
            }
            o9bVar.getClass();
            k9b k9bVarAdd = o9bVar.add(t);
            if (k9bVarAdd.equals(o9bVar)) {
                return false;
            }
            tse tseVar3 = this.a;
            tseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zA = rme.a((tse) ame.v(tseVar3, this, wleVarJ), i, k9bVarAdd);
            }
            ame.m(wleVarJ, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        o9b<? extends T> o9bVar;
        wle wleVarJ;
        boolean zA;
        do {
            synchronized (rme.a) {
                tse tseVar = this.a;
                tseVar.getClass();
                tse tseVar2 = (tse) ame.h(tseVar);
                i = tseVar2.d;
                o9bVar = tseVar2.c;
                j6g j6gVar = j6g.a;
            }
            o9bVar.getClass();
            o9b<? extends T> o9bVarAddAll = o9bVar.addAll((Collection<? extends Object>) collection);
            if (wl7.b(o9bVarAddAll, o9bVar)) {
                return false;
            }
            tse tseVar3 = this.a;
            tseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zA = rme.a((tse) ame.v(tseVar3, this, wleVarJ), i, o9bVarAddAll);
            }
            ame.m(wleVarJ, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        wle wleVarJ;
        tse tseVar = this.a;
        tseVar.getClass();
        synchronized (ame.c) {
            wle.e.getClass();
            wleVarJ = ame.j();
            tse tseVar2 = (tse) ame.v(tseVar, this, wleVarJ);
            synchronized (rme.a) {
                tseVar2.c = k9b.d;
                tseVar2.d++;
            }
        }
        ame.m(wleVarJ, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return rme.b(this).c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return rme.b(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.pse
    public final void i(rse rseVar) {
        rseVar.b = this.a;
        this.a = (tse) rseVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return rme.b(this).c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new sse(this, rme.b(this).c.iterator());
    }

    @Override // defpackage.pse
    public final rse n() {
        return this.a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        o9b<? extends T> o9bVar;
        wle wleVarJ;
        boolean zA;
        do {
            synchronized (rme.a) {
                tse tseVar = this.a;
                tseVar.getClass();
                tse tseVar2 = (tse) ame.h(tseVar);
                i = tseVar2.d;
                o9bVar = tseVar2.c;
                j6g j6gVar = j6g.a;
            }
            o9bVar.getClass();
            k9b k9bVarRemove = o9bVar.remove(obj);
            if (k9bVarRemove.equals(o9bVar)) {
                return false;
            }
            tse tseVar3 = this.a;
            tseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zA = rme.a((tse) ame.v(tseVar3, this, wleVarJ), i, k9bVarRemove);
            }
            ame.m(wleVarJ, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i;
        o9b<? extends T> o9bVar;
        wle wleVarJ;
        boolean zA;
        do {
            synchronized (rme.a) {
                tse tseVar = this.a;
                tseVar.getClass();
                tse tseVar2 = (tse) ame.h(tseVar);
                i = tseVar2.d;
                o9bVar = tseVar2.c;
                j6g j6gVar = j6g.a;
            }
            o9bVar.getClass();
            o9b<? extends T> o9bVarRemoveAll = o9bVar.removeAll((Collection<? extends Object>) collection);
            if (wl7.b(o9bVarRemoveAll, o9bVar)) {
                return false;
            }
            tse tseVar3 = this.a;
            tseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zA = rme.a((tse) ame.v(tseVar3, this, wleVarJ), i, o9bVarRemoveAll);
            }
            ame.m(wleVarJ, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i;
        o9b<? extends T> o9bVar;
        boolean zRetainAll;
        wle wleVarJ;
        boolean zA;
        do {
            synchronized (rme.a) {
                tse tseVar = this.a;
                tseVar.getClass();
                tse tseVar2 = (tse) ame.h(tseVar);
                i = tseVar2.d;
                o9bVar = tseVar2.c;
                j6g j6gVar = j6g.a;
            }
            if (o9bVar == null) {
                r6.g("No set to mutate");
                return false;
            }
            l9b l9bVarBuilder = o9bVar.builder();
            zRetainAll = l9bVarBuilder.retainAll(z92.E1(collection));
            k9b k9bVarB = l9bVarBuilder.b();
            if (k9bVarB.equals(o9bVar)) {
                break;
            }
            tse tseVar3 = this.a;
            tseVar3.getClass();
            synchronized (ame.c) {
                wle.e.getClass();
                wleVarJ = ame.j();
                zA = rme.a((tse) ame.v(tseVar3, this, wleVarJ), i, k9bVarB);
            }
            ame.m(wleVarJ, this);
        } while (!zA);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return rme.b(this).c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return q92.E(this);
    }

    public final String toString() {
        tse tseVar = this.a;
        tseVar.getClass();
        return "SnapshotStateSet(value=" + ((tse) ame.h(tseVar)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o9b<? extends T> o9bVar = rme.b(this).c;
        parcel.writeInt(size());
        Iterator<? extends T> it = o9bVar.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    public static final class a implements Parcelable.ClassLoaderCreator<SnapshotStateSet<Object>> {
        /* JADX WARN: Multi-variable type inference failed */
        public static SnapshotStateSet a(Parcel parcel, ClassLoader classLoader) {
            SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
            if (classLoader == null) {
                classLoader = SnapshotStateSet.class.getClassLoader();
            }
            int i = parcel.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                snapshotStateSet.add(parcel.readValue(classLoader));
            }
            return snapshotStateSet;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SnapshotStateSet[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ SnapshotStateSet<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) q92.F(this, tArr);
    }
}
