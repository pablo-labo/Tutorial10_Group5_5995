package defpackage;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class eng {
    public final ht0<String, Method> a;
    public final ht0<String, Method> b;
    public final ht0<String, Class> c;

    public eng(ht0<String, Method> ht0Var, ht0<String, Method> ht0Var2, ht0<String, Class> ht0Var3) {
        this.a = ht0Var;
        this.b = ht0Var2;
        this.c = ht0Var3;
    }

    public abstract fng a();

    public final Class b(Class<? extends gng> cls) throws ClassNotFoundException {
        String name = cls.getName();
        ht0<String, Class> ht0Var = this.c;
        Class cls2 = ht0Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(o6.f(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        ht0Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        ht0<String, Method> ht0Var = this.a;
        Method method = ht0Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, eng.class.getClassLoader()).getDeclaredMethod("read", eng.class);
        ht0Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        ht0<String, Method> ht0Var = this.b;
        Method method = ht0Var.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, eng.class);
        ht0Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i);

    public abstract int i();

    public final int j(int i, int i2) {
        return !h(i2) ? i : i();
    }

    public abstract <T extends Parcelable> T k();

    public abstract String l();

    public final <T extends gng> T m() {
        String strL = l();
        if (strL == null) {
            return null;
        }
        try {
            return (T) c(strL).invoke(null, a());
        } catch (ClassNotFoundException e) {
            l6.p("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            l6.p("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            l6.p("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            l6.p("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void n(int i);

    public abstract void o(boolean z);

    public abstract void p(byte[] bArr);

    public abstract void q(CharSequence charSequence);

    public abstract void r(int i);

    public final void s(int i, int i2) {
        n(i2);
        r(i);
    }

    public abstract void t(Parcelable parcelable);

    public abstract void u(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(gng gngVar) {
        if (gngVar == null) {
            u(null);
            return;
        }
        try {
            u(b(gngVar.getClass()).getName());
            fng fngVarA = a();
            try {
                d(gngVar.getClass()).invoke(null, gngVar, fngVarA);
                fngVarA.w();
            } catch (ClassNotFoundException e) {
                l6.p("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                l6.p("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                l6.p("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                l6.p("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            l6.p(gngVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
