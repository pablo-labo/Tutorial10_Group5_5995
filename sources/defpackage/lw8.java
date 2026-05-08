package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lw8 {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static pw5 a(Constructor constructor, yv8 yv8Var) {
        try {
            Object objNewInstance = constructor.newInstance(yv8Var);
            objNewInstance.getClass();
            return (pw5) objNewInstance;
        } catch (IllegalAccessException e) {
            l5.r(e);
            return null;
        } catch (InstantiationException e2) {
            l5.r(e2);
            return null;
        } catch (InvocationTargetException e3) {
            l5.r(e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.Class r13) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw8.b(java.lang.Class):int");
    }
}
