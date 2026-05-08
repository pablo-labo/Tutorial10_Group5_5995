package defpackage;

import defpackage.ewc;
import defpackage.mf8;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wd8<R> implements ud8<R>, fg8 {
    public final ewc.a<List<Annotation>> a;
    public final ewc.a<ArrayList<mf8>> b;
    public final ewc.a<cg8> c;
    public final ewc.a<List<eg8>> d;
    public final ewc.a<Object[]> e;
    public final Lazy<Boolean> f = boa.E(qt8.b, new nx1(this, 3));

    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ak2.i(((mf8) t).getName(), ((mf8) t2).getName());
        }
    }

    public wd8() {
        int i = 2;
        this.a = ewc.a(null, new p04(this, i));
        this.b = ewc.a(null, new q04(this, i));
        this.c = ewc.a(null, new r04(this, i));
        int i2 = 1;
        this.d = ewc.a(null, new s04(this, i2));
        this.e = ewc.a(null, new t04(this, i2));
    }

    public static Object v(zf8 zf8Var) {
        Class clsP = jh2.p(pyd.v(zf8Var));
        if (clsP.isArray()) {
            Object objNewInstance = Array.newInstance(clsP.getComponentType(), 0);
            objNewInstance.getClass();
            return objNewInstance;
        }
        throw new qi8("Cannot instantiate the default empty array of type " + clsP.getSimpleName() + ", because it is not an array type");
    }

    public final int A(mf8 mf8Var) {
        if (!this.f.getValue().booleanValue()) {
            l5.q("Check if parametersNeedMFVCFlattening is true before");
            return 0;
        }
        cg8 type = mf8Var.getType();
        mq5 mq5Var = akg.a;
        ui8 ui8Var = type.a;
        if (ui8Var == null || !fe7.f(ui8Var)) {
            return 1;
        }
        ArrayList arrayListE = wuf.e(dyf.a(mf8Var.getType().a));
        arrayListE.getClass();
        return arrayListE.size();
    }

    public final boolean B() {
        return wl7.b(getName(), "<init>") && x().j().isAnnotation();
    }

    public abstract boolean C();

    @Override // defpackage.ud8
    public final R call(Object... objArr) throws IllegalCallableAccessException {
        objArr.getClass();
        try {
            return (R) w().call(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // defpackage.ud8
    public final R callBy(Map<mf8, ? extends Object> map) throws IllegalCallableAccessException {
        Object objV;
        map.getClass();
        boolean z = false;
        if (B()) {
            List<mf8> parameters = getParameters();
            ArrayList arrayList = new ArrayList(t92.r0(parameters, 10));
            for (mf8 mf8Var : parameters) {
                if (map.containsKey(mf8Var)) {
                    objV = map.get(mf8Var);
                    if (objV == null) {
                        l6.n("Annotation argument value cannot be null (", 41, mf8Var);
                        return null;
                    }
                } else if (mf8Var.u()) {
                    objV = null;
                } else {
                    if (!mf8Var.d()) {
                        akb.o(mf8Var, "No argument provided for a required parameter: ");
                        return null;
                    }
                    objV = v(mf8Var.getType());
                }
                arrayList.add(objV);
            }
            pv1<?> pv1VarY = y();
            if (pv1VarY == null) {
                l.h(z(), "This callable does not support a default call: ");
                return null;
            }
            try {
                return (R) pv1VarY.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        }
        List<mf8> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return (R) w().call(isSuspend() ? new lu2[]{null} : new lu2[0]);
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) this.e.invoke().clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean zBooleanValue = this.f.getValue().booleanValue();
        int i = 0;
        for (mf8 mf8Var2 : parameters2) {
            int iA = zBooleanValue ? A(mf8Var2) : 1;
            if (map.containsKey(mf8Var2)) {
                objArr[mf8Var2.getIndex()] = map.get(mf8Var2);
            } else if (mf8Var2.u()) {
                if (zBooleanValue) {
                    int i2 = i + iA;
                    for (int i3 = i; i3 < i2; i3++) {
                        int i4 = (i3 / 32) + size;
                        Object obj = objArr[i4];
                        obj.getClass();
                        objArr[i4] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i3 % 32)));
                    }
                } else {
                    int i5 = (i / 32) + size;
                    Object obj2 = objArr[i5];
                    obj2.getClass();
                    objArr[i5] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i % 32)));
                }
                z = true;
            } else if (!mf8Var2.d()) {
                akb.o(mf8Var2, "No argument provided for a required parameter: ");
                return null;
            }
            if (mf8Var2.f() == mf8.a.c) {
                i += iA;
            }
        }
        if (!z) {
            try {
                return (R) w().call(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e3) {
                throw new IllegalCallableAccessException(e3);
            }
        }
        pv1<?> pv1VarY2 = y();
        if (pv1VarY2 == null) {
            l.h(z(), "This callable does not support a default call: ");
            return null;
        }
        try {
            return (R) pv1VarY2.call(objArr);
        } catch (IllegalAccessException e4) {
            throw new IllegalCallableAccessException(e4);
        }
    }

    @Override // defpackage.td8
    public final List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this.a.invoke();
        listInvoke.getClass();
        return listInvoke;
    }

    @Override // defpackage.ud8
    public final List<mf8> getParameters() {
        ArrayList<mf8> arrayListInvoke = this.b.invoke();
        arrayListInvoke.getClass();
        return arrayListInvoke;
    }

    @Override // defpackage.ud8
    public final zf8 getReturnType() {
        cg8 cg8VarInvoke = this.c.invoke();
        cg8VarInvoke.getClass();
        return cg8VarInvoke;
    }

    @Override // defpackage.ud8
    public final List<dg8> getTypeParameters() {
        List<eg8> listInvoke = this.d.invoke();
        listInvoke.getClass();
        return listInvoke;
    }

    @Override // defpackage.ud8
    public final jg8 getVisibility() {
        e04 visibility = z().getVisibility();
        visibility.getClass();
        mq5 mq5Var = akg.a;
        if (visibility.equals(d04.e)) {
            return jg8.a;
        }
        if (visibility.equals(d04.c)) {
            return jg8.b;
        }
        if (visibility.equals(d04.d)) {
            return jg8.c;
        }
        if (visibility.equals(d04.a) || visibility.equals(d04.b)) {
            return jg8.d;
        }
        return null;
    }

    @Override // defpackage.ud8
    public final boolean isAbstract() {
        return z().r() == ax9.e;
    }

    @Override // defpackage.ud8
    public final boolean isFinal() {
        return z().r() == ax9.b;
    }

    @Override // defpackage.ud8
    public final boolean isOpen() {
        return z().r() == ax9.d;
    }

    public abstract pv1<?> w();

    public abstract te8 x();

    public abstract pv1<?> y();

    public abstract hv1 z();
}
