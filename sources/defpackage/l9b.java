package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l9b<E> extends n3<E> implements Collection, bf8 {
    public k9b<E> a;
    public Object b;
    public Object c;
    public final w8b<E, fy8> d;

    public l9b(k9b<E> k9bVar) {
        this.a = k9bVar;
        this.b = k9bVar.a;
        this.c = k9bVar.b;
        this.d = k9bVar.c.b();
    }

    @Override // defpackage.n3
    public final int a() {
        w8b<E, fy8> w8bVar = this.d;
        w8bVar.getClass();
        return w8bVar.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        w8b<E, fy8> w8bVar = this.d;
        if (w8bVar.containsKey(e)) {
            return false;
        }
        if (isEmpty()) {
            this.b = e;
            this.c = e;
            w8bVar.put(e, new fy8());
            return true;
        }
        fy8 fy8Var = w8bVar.get(this.c);
        fy8Var.getClass();
        w8bVar.put((E) this.c, new fy8(fy8Var.a, e));
        w8bVar.put(e, new fy8(this.c));
        this.c = e;
        return true;
    }

    public final k9b b() {
        u8b<E, fy8> u8bVarA = this.d.a();
        k9b<E> k9bVar = this.a;
        if (u8bVarA != k9bVar.c) {
            k9bVar = new k9b<>(this.b, this.c, u8bVarA);
        }
        this.a = k9bVar;
        return k9bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.d.clear();
        mh2 mh2Var = mh2.X;
        this.b = mh2Var;
        this.c = mh2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new n9b(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        w8b<E, fy8> w8bVar = this.d;
        fy8 fy8VarRemove = w8bVar.remove(obj);
        if (fy8VarRemove == null) {
            return false;
        }
        Object obj2 = fy8VarRemove.b;
        Object obj3 = fy8VarRemove.a;
        mh2 mh2Var = mh2.X;
        if (obj3 != mh2Var) {
            fy8 fy8Var = w8bVar.get(obj3);
            fy8Var.getClass();
            w8bVar.put((E) obj3, new fy8(fy8Var.a, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 == mh2Var) {
            this.c = obj3;
            return true;
        }
        fy8 fy8Var2 = w8bVar.get(obj2);
        fy8Var2.getClass();
        w8bVar.put((E) obj2, new fy8(obj3, fy8Var2.b));
        return true;
    }
}
