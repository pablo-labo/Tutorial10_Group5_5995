package defpackage;

import android.view.View;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.OnViewDidUpdatePropsException;
import expo.modules.kotlin.exception.UnexpectedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class zqg {
    public zx9<?> a;
    public final rqg b;
    public final String c;

    public zqg(zx9<?> zx9Var, rqg rqgVar, String str) {
        rqgVar.getClass();
        this.a = zx9Var;
        this.b = rqgVar;
        this.c = str;
    }

    public final hb9 a() {
        hb9 hb9Var = new hb9();
        c00 c00Var = this.b.f;
        if (c00Var != null) {
            for (String str : (String[]) c00Var.a) {
                hb9Var.put(ypd.I(str), kc9.W(new Pair("registrationName", str)));
            }
        }
        return hb9Var.j();
    }

    public final String b() {
        String str = this.c;
        return str == null ? z3.m(this.a.b.a, "_", this.b.a) : str;
    }

    public final void c(View view) {
        CodedException unexpectedException;
        CodedException codedException;
        rqg rqgVar = this.b;
        view.getClass();
        try {
            Function1<View, j6g> function1 = rqgVar.e;
            if (function1 != null) {
                function1.invoke(view);
            }
        } catch (Throwable th) {
            if ((view instanceof nx4) || (view instanceof ow4)) {
                return;
            }
            if (th instanceof CodedException) {
                codedException = (CodedException) th;
            } else {
                if (th instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th;
                    unexpectedException = new CodedException(codedException2.a(), codedException2.getMessage(), codedException2.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                codedException = unexpectedException;
            }
            d49 d49Var = mz2.a;
            d49Var.getClass();
            d49Var.a(o39.Error, "❌ '" + view + "' wasn't able to destroy itself", codedException);
            rqgVar.getClass();
            rqg.a(view, codedException);
        }
    }

    public final void d(View view) {
        CodedException unexpectedException;
        CodedException codedException;
        view.getClass();
        Function1<View, j6g> function1 = this.b.g;
        if (function1 != null) {
            try {
                function1.invoke(view);
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                try {
                    throw new OnViewDidUpdatePropsException("Error occurred when invoking 'onViewDidUpdateProps' on '" + fwc.a.b(view.getClass()).r() + "'", !(th instanceof CodedException) ? th instanceof expo.modules.core.errors.CodedException ? new CodedException(((expo.modules.core.errors.CodedException) th).a(), ((expo.modules.core.errors.CodedException) th).getMessage(), ((expo.modules.core.errors.CodedException) th).getCause()) : new UnexpectedException(th) : (CodedException) th);
                } catch (Throwable th2) {
                    if ((view instanceof nx4) || (view instanceof ow4)) {
                        return;
                    }
                    if (th2 instanceof CodedException) {
                        codedException = (CodedException) th2;
                    } else {
                        if (th2 instanceof expo.modules.core.errors.CodedException) {
                            expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th2;
                            unexpectedException = new CodedException(codedException2.a(), codedException2.getMessage(), codedException2.getCause());
                        } else {
                            unexpectedException = new UnexpectedException(th2);
                        }
                        codedException = unexpectedException;
                    }
                    d49 d49Var = mz2.a;
                    String str = "❌ Error occurred when invoking 'onViewDidUpdateProps' on '" + view.getClass().getSimpleName() + "'";
                    d49Var.getClass();
                    d49Var.a(o39.Error, str, codedException);
                    rqg.a(view, codedException);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: all -> 0x0056, DONT_GENERATE, FINALLY_INSNS, TryCatch #0 {all -> 0x0056, blocks: (B:14:0x0040, B:16:0x0044, B:23:0x004f, B:25:0x0053, B:33:0x007d, B:28:0x0058, B:30:0x005c, B:32:0x0077), top: B:38:0x0040 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList e(android.view.View r10, com.facebook.react.bridge.ReadableMap r11) {
        /*
            r9 = this;
            r10.getClass()
            rqg r0 = r9.b
            java.util.Map<java.lang.String, uf0> r0 = r0.d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.facebook.react.bridge.ReadableMapKeySetIterator r2 = r11.keySetIterator()
        L10:
            boolean r3 = r2.hasNextKey()
            if (r3 == 0) goto Lb1
            java.lang.String r3 = r2.nextKey()
            java.lang.Object r4 = r0.get(r3)
            uf0 r4 = (defpackage.uf0) r4
            if (r4 == 0) goto L10
            com.facebook.react.bridge.Dynamic r5 = r11.getDynamic(r3)     // Catch: java.lang.Throwable -> L3f
            zx9<?> r6 = r9.a     // Catch: java.lang.Throwable -> L3f
            T extends sx9 r6 = r6.a     // Catch: java.lang.Throwable -> L3f
            ohd r6 = r6.a     // Catch: java.lang.Throwable -> L3f
            if (r6 == 0) goto L37
            java.lang.ref.WeakReference<gk0> r6 = r6.b     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L3f
            gk0 r6 = (defpackage.gk0) r6     // Catch: java.lang.Throwable -> L3f
            goto L38
        L37:
            r6 = 0
        L38:
            r4.a(r5, r10, r6)     // Catch: java.lang.Throwable -> L3f
        L3b:
            r1.add(r3)
            goto L10
        L3f:
            r4 = move-exception
            boolean r5 = r10 instanceof defpackage.nx4     // Catch: java.lang.Throwable -> L56
            if (r5 != 0) goto L4b
            boolean r5 = r10 instanceof defpackage.ow4     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L49
            goto L4b
        L49:
            r5 = 0
            goto L4c
        L4b:
            r5 = 1
        L4c:
            if (r5 == 0) goto L4f
            goto L3b
        L4f:
            boolean r5 = r4 instanceof expo.modules.kotlin.exception.CodedException     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L58
            expo.modules.kotlin.exception.CodedException r4 = (expo.modules.kotlin.exception.CodedException) r4     // Catch: java.lang.Throwable -> L56
            goto L7d
        L56:
            r9 = move-exception
            goto Lad
        L58:
            boolean r5 = r4 instanceof expo.modules.core.errors.CodedException     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L77
            expo.modules.kotlin.exception.CodedException r5 = new expo.modules.kotlin.exception.CodedException     // Catch: java.lang.Throwable -> L56
            r6 = r4
            expo.modules.core.errors.CodedException r6 = (expo.modules.core.errors.CodedException) r6     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = r6.a()     // Catch: java.lang.Throwable -> L56
            r7 = r4
            expo.modules.core.errors.CodedException r7 = (expo.modules.core.errors.CodedException) r7     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L56
            expo.modules.core.errors.CodedException r4 = (expo.modules.core.errors.CodedException) r4     // Catch: java.lang.Throwable -> L56
            java.lang.Throwable r4 = r4.getCause()     // Catch: java.lang.Throwable -> L56
            r5.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L56
        L75:
            r4 = r5
            goto L7d
        L77:
            expo.modules.kotlin.exception.UnexpectedException r5 = new expo.modules.kotlin.exception.UnexpectedException     // Catch: java.lang.Throwable -> L56
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L56
            goto L75
        L7d:
            d49 r5 = defpackage.mz2.a     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = r9.b()     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r7.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = "❌ Cannot set the '"
            r7.append(r8)     // Catch: java.lang.Throwable -> L56
            r7.append(r6)     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = "' prop on the '"
            r7.append(r6)     // Catch: java.lang.Throwable -> L56
            r7.append(r10)     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = "'"
            r7.append(r6)     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L56
            r5.getClass()     // Catch: java.lang.Throwable -> L56
            o39 r7 = defpackage.o39.Error     // Catch: java.lang.Throwable -> L56
            r5.a(r7, r6, r4)     // Catch: java.lang.Throwable -> L56
            defpackage.rqg.a(r10, r4)     // Catch: java.lang.Throwable -> L56
            goto L3b
        Lad:
            r1.add(r3)
            throw r9
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqg.e(android.view.View, com.facebook.react.bridge.ReadableMap):java.util.ArrayList");
    }
}
