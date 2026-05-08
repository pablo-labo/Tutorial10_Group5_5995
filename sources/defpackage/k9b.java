package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k9b<E> extends f4<E> implements o9b<E> {
    public static final k9b d;
    public final Object a;
    public final Object b;
    public final u8b<E, fy8> c;

    static {
        mh2 mh2Var = mh2.X;
        d = new k9b(mh2Var, mh2Var, u8b.c);
    }

    public k9b(Object obj, Object obj2, u8b<E, fy8> u8bVar) {
        this.a = obj;
        this.b = obj2;
        this.c = u8bVar;
    }

    @Override // defpackage.l1
    public final int a() {
        u8b<E, fy8> u8bVar = this.c;
        u8bVar.getClass();
        return u8bVar.b;
    }

    @Override // java.util.Collection, java.util.Set, defpackage.o9b
    public final k9b add(Object obj) {
        u8b<E, fy8> u8bVar = this.c;
        if (u8bVar.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new k9b(obj, obj, u8bVar.d(obj, new fy8()));
        }
        Object obj2 = this.b;
        fy8 fy8Var = u8bVar.get(obj2);
        fy8Var.getClass();
        return new k9b(this.a, obj, u8bVar.d(obj2, new fy8(fy8Var.a, obj)).d(obj, new fy8(obj2)));
    }

    @Override // java.util.Collection, java.util.Set, defpackage.o9b
    public final o9b<E> addAll(Collection<? extends E> collection) {
        l9b l9bVar = new l9b(this);
        l9bVar.addAll(collection);
        return l9bVar.b();
    }

    @Override // defpackage.o9b
    public final l9b builder() {
        return new l9b(this);
    }

    @Override // defpackage.l1, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new m9b(this.a, this.c);
    }

    @Override // java.util.Collection, java.util.Set, defpackage.o9b
    public final k9b remove(Object obj) {
        u8b<E, fy8> u8bVarD = this.c;
        fy8 fy8Var = u8bVarD.get(obj);
        if (fy8Var == null) {
            return this;
        }
        Object obj2 = fy8Var.a;
        Object obj3 = fy8Var.b;
        stf<E, fy8> stfVar = u8bVarD.a;
        stf<E, fy8> stfVarV = stfVar.v(obj, obj != null ? obj.hashCode() : 0, 0);
        if (stfVar != stfVarV) {
            u8bVarD = stfVarV == null ? u8b.c : new u8b<>(stfVarV, u8bVarD.b - 1);
        }
        mh2 mh2Var = mh2.X;
        if (obj2 != mh2Var) {
            fy8 fy8Var2 = u8bVarD.get(obj2);
            fy8Var2.getClass();
            u8bVarD = u8bVarD.d(obj2, new fy8(fy8Var2.a, obj3));
        }
        if (obj3 != mh2Var) {
            fy8 fy8Var3 = u8bVarD.get(obj3);
            fy8Var3.getClass();
            u8bVarD = u8bVarD.d(obj3, new fy8(obj2, fy8Var3.b));
        }
        Object obj4 = obj2 != mh2Var ? this.a : obj3;
        if (obj3 != mh2Var) {
            obj2 = this.b;
        }
        return new k9b(obj4, obj2, u8bVarD);
    }

    @Override // java.util.Collection, java.util.Set, defpackage.o9b
    public final o9b<E> removeAll(Collection<? extends E> collection) {
        l9b l9bVar = new l9b(this);
        l9bVar.removeAll(collection);
        return l9bVar.b();
    }
}
