package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class pt0<E> extends pvf<Object> {
    public static final a c = new a();
    public final Class<E> a;
    public final rvf b;

    public class a implements qvf {
        @Override // defpackage.qvf
        public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
            Type type = iyfVar.b;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new pt0(ae6Var, ae6Var.c(new iyf<>(genericComponentType)), defpackage.a.e(genericComponentType));
        }
    }

    public pt0(ae6 ae6Var, pvf<E> pvfVar, Class<E> cls) {
        this.b = new rvf(ae6Var, pvfVar, cls);
        this.a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pvf
    public final Object a(nb8 nb8Var) throws IOException {
        if (nb8Var.j0() == sb8.X) {
            nb8Var.l1();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        nb8Var.a();
        while (nb8Var.hasNext()) {
            arrayList.add(this.b.b.a(nb8Var));
        }
        nb8Var.v();
        int size = arrayList.size();
        Class<E> cls = this.a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // defpackage.pvf
    public final void b(gc8 gc8Var, Object obj) throws IOException {
        if (obj == null) {
            gc8Var.Q();
            return;
        }
        gc8Var.h();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.b(gc8Var, Array.get(obj, i));
        }
        gc8Var.v();
    }
}
