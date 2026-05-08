package defpackage;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class r92 implements qvf {
    public final pq2 a;

    public static final class a<E> extends pvf<Collection<E>> {
        public final rvf a;
        public final hna<? extends Collection<E>> b;

        public a(ae6 ae6Var, Type type, pvf<E> pvfVar, hna<? extends Collection<E>> hnaVar) {
            this.a = new rvf(ae6Var, pvfVar, type);
            this.b = hnaVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pvf
        public final Object a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            Collection<E> collectionB = this.b.b();
            nb8Var.a();
            while (nb8Var.hasNext()) {
                collectionB.add(this.a.b.a(nb8Var));
            }
            nb8Var.v();
            return collectionB;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                gc8Var.Q();
                return;
            }
            gc8Var.h();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.a.b(gc8Var, it.next());
            }
            gc8Var.v();
        }
    }

    public r92(pq2 pq2Var) {
        this.a = pq2Var;
    }

    @Override // defpackage.qvf
    public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
        Type type = iyfVar.b;
        Class<? super T> cls = iyfVar.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        hh1.p(Collection.class.isAssignableFrom(cls));
        Type typeF = defpackage.a.f(type, cls, defpackage.a.d(type, cls, Collection.class), new HashMap());
        Class cls2 = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments()[0] : Object.class;
        return new a(ae6Var, cls2, ae6Var.c(new iyf<>(cls2)), this.a.b(iyfVar));
    }
}
