package defpackage;

import android.os.Bundle;
import defpackage.maa;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes.dex */
public final class naa<Args extends maa> implements Lazy<Args> {
    public final yd8<Args> a;
    public final gu5<Bundle> b;
    public Args c;

    public naa(yd8<Args> yd8Var, gu5<Bundle> gu5Var) {
        yd8Var.getClass();
        this.a = yd8Var;
        this.b = gu5Var;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.Lazy
    public final Object getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Args args = this.c;
        if (args != null) {
            return args;
        }
        Bundle bundleInvoke = this.b.invoke();
        ht0<yd8<? extends maa>, Method> ht0Var = oaa.b;
        yd8<Args> yd8Var = this.a;
        Method method = ht0Var.get((yd8<? extends maa>) yd8Var);
        if (method == null) {
            method = jh2.p(yd8Var).getMethod("fromBundle", (Class[]) Arrays.copyOf(oaa.a, 1));
            ht0Var.put((yd8<? extends maa>) yd8Var, method);
            method.getClass();
        }
        Object objInvoke = method.invoke(null, bundleInvoke);
        objInvoke.getClass();
        Args args2 = (Args) objInvoke;
        this.c = args2;
        return args2;
    }
}
