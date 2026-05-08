package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i8f {
    public static final a a = new a(3, null);

    @uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements wu5<dmb, ooa, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r7d.b(obj);
                return j6g.a;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // defpackage.wu5
        public final Object q(dmb dmbVar, ooa ooaVar, lu2<? super j6g> lu2Var) {
            long j = ooaVar.a;
            return new a(3, lu2Var).invokeSuspend(j6g.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[LOOP:0: B:19:0x004f->B:20:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.l61 r7, defpackage.x81 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.m8f
            if (r0 == 0) goto L13
            r0 = r8
            m8f r0 = (defpackage.m8f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            m8f r0 = new m8f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r7 = r0.L$0
            l61 r7 = (defpackage.l61) r7
            defpackage.r7d.b(r8)
            goto L42
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            r7 = 0
            return r7
        L30:
            defpackage.r7d.b(r8)
        L33:
            r0.L$0 = r7
            r0.label = r2
            peb r8 = defpackage.peb.b
            java.lang.Object r8 = r7.B1(r8, r0)
            g13 r1 = defpackage.g13.a
            if (r8 != r1) goto L42
            return r1
        L42:
            neb r8 = (defpackage.neb) r8
            java.util.List<yeb> r1 = r8.a
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
            r5 = r4
        L4f:
            if (r5 >= r3) goto L5d
            java.lang.Object r6 = r1.get(r5)
            yeb r6 = (defpackage.yeb) r6
            r6.a()
            int r5 = r5 + 1
            goto L4f
        L5d:
            java.util.List<yeb> r8 = r8.a
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
        L66:
            if (r4 >= r1) goto L76
            java.lang.Object r3 = r8.get(r4)
            yeb r3 = (defpackage.yeb) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L73
            goto L33
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            j6g r7 = defpackage.j6g.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8f.a(l61, x81):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004b -> B:18:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.l61 r5, boolean r6, defpackage.peb r7, defpackage.x81 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.j8f
            if (r0 == 0) goto L13
            r0 = r8
            j8f r0 = (defpackage.j8f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            j8f r0 = new j8f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            boolean r5 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            peb r6 = (defpackage.peb) r6
            java.lang.Object r7 = r0.L$0
            l61 r7 = (defpackage.l61) r7
            defpackage.r7d.b(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4e
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            r5 = 0
            return r5
        L3a:
            defpackage.r7d.b(r8)
        L3d:
            r0.L$0 = r5
            r0.L$1 = r7
            r0.Z$0 = r6
            r0.label = r2
            java.lang.Object r8 = r5.B1(r7, r0)
            g13 r1 = defpackage.g13.a
            if (r8 != r1) goto L4e
            return r1
        L4e:
            neb r8 = (defpackage.neb) r8
            r1 = 0
            boolean r3 = f(r8, r6, r1)
            if (r3 == 0) goto L3d
            java.util.List<yeb> r5 = r8.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8f.b(l61, boolean, peb, x81):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.l61 r6, defpackage.peb r7, defpackage.x81 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.k8f
            if (r0 == 0) goto L13
            r0 = r8
            k8f r0 = (defpackage.k8f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            k8f r0 = new k8f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 != r3) goto L35
            boolean r6 = r0.Z$0
            java.lang.Object r7 = r0.L$1
            peb r7 = (defpackage.peb) r7
            java.lang.Object r1 = r0.L$0
            l61 r1 = (defpackage.l61) r1
            defpackage.r7d.b(r8)
            r5 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r5
            goto L56
        L35:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            r6 = 0
            return r6
        L3c:
            defpackage.r7d.b(r8)
            r8 = r7
            r7 = r2
        L41:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r1 = r6.B1(r8, r0)
            g13 r4 = defpackage.g13.a
            if (r1 != r4) goto L52
            return r4
        L52:
            r5 = r0
            r0 = r8
            r8 = r1
            r1 = r5
        L56:
            neb r8 = (defpackage.neb) r8
            boolean r4 = f(r8, r7, r3)
            if (r4 == 0) goto L65
            java.util.List<yeb> r6 = r8.a
            java.lang.Object r6 = r6.get(r2)
            return r6
        L65:
            r8 = r0
            r0 = r1
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8f.d(l61, peb, x81):java.lang.Object");
    }

    public static Object e(efb efbVar, Function1 function1, lu2 lu2Var) {
        Object objD = f13.d(new o8f(efbVar, a, null, null, function1, null), lu2Var);
        return objD == g13.a ? objD : j6g.a;
    }

    public static final boolean f(neb nebVar, boolean z, boolean z2) {
        if (z2) {
            List<yeb> list = nebVar.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (list.get(i).i != 2) {
                        break;
                    }
                    i++;
                } else if ((nebVar.d & 33) == 0) {
                    return false;
                }
            }
        }
        List<yeb> list2 = nebVar.a;
        int size2 = list2.size();
        int i2 = 0;
        while (true) {
            boolean zG = true;
            if (i2 >= size2) {
                return true;
            }
            yeb yebVar = list2.get(i2);
            if (!z) {
                zG = mh2.g(yebVar);
            } else if (yebVar.b() || yebVar.h || !yebVar.d) {
                zG = false;
            }
            if (!zG) {
                return false;
            }
            i2++;
        }
    }

    public static uqe g(e13 e13Var, ex7 ex7Var, Function2 function2) {
        return u63.Y(e13Var, null, i13.d, new p8f(ex7Var, function2, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, m59$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(defpackage.l61 r6, defpackage.peb r7, defpackage.x81 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.q8f
            if (r0 == 0) goto L13
            r0 = r8
            q8f r0 = (defpackage.q8f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            q8f r0 = new q8f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.lang.Object r6 = r0.L$0
            luc r6 = (defpackage.luc) r6
            defpackage.r7d.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            goto L57
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r2
        L30:
            defpackage.r7d.b(r8)
            luc r8 = new luc
            r8.<init>()
            m59$a r1 = m59.a.a
            r8.element = r1
            opg r1 = r6.getViewConfiguration()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            long r4 = r1.b()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            r8f r1 = new r8f     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            r1.<init>(r7, r8, r2)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            r0.L$0 = r8     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            java.lang.Object r6 = r6.v1(r4, r1, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            g13 r7 = defpackage.g13.a
            if (r6 != r7) goto L56
            return r7
        L56:
            r6 = r8
        L57:
            T r6 = r6.element
            return r6
        L5a:
            m59$c r6 = m59.c.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8f.h(l61, peb, x81):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        if (r0 == r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00bb -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(defpackage.l61 r17, defpackage.peb r18, defpackage.x81 r19) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8f.i(l61, peb, x81):java.lang.Object");
    }
}
