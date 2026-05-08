package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class p2d {
    public static final String[] a = {"SHOE", "SOCK", "PPID"};

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(android.content.Context r4, java.lang.String r5, java.lang.String r6, defpackage.pu2 r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.k2d
            if (r0 == 0) goto L13
            r0 = r7
            k2d r0 = (defpackage.k2d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            k2d r0 = new k2d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L32
            java.lang.Object r4 = r0.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r0.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r0.L$0
            android.content.Context r4 = (android.content.Context) r4
            defpackage.r7d.b(r7)
            goto L55
        L32:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r3
        L38:
            defpackage.r7d.b(r7)
            eq3 r7 = defpackage.a74.a
            no3 r7 = defpackage.no3.c
            l2d r1 = new l2d
            r1.<init>(r4, r6, r5, r3)
            r0.L$0 = r3
            r0.L$1 = r3
            r0.L$2 = r3
            r0.label = r2
            java.lang.Object r7 = defpackage.u63.q0(r7, r1, r0)
            g13 r4 = defpackage.g13.a
            if (r7 != r4) goto L55
            return r4
        L55:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2d.a(android.content.Context, java.lang.String, java.lang.String, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.ba5 r4, defpackage.pu2 r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.m2d
            if (r0 == 0) goto L13
            r0 = r5
            m2d r0 = (defpackage.m2d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            m2d r0 = new m2d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.lang.Object r4 = r0.L$0
            ba5 r4 = (defpackage.ba5) r4
            defpackage.r7d.b(r5)
            goto L49
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L30:
            defpackage.r7d.b(r5)
            eq3 r5 = defpackage.a74.a
            no3 r5 = defpackage.no3.c
            n2d r1 = new n2d
            r1.<init>(r4, r2)
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r5 = defpackage.u63.q0(r5, r1, r0)
            g13 r4 = defpackage.g13.a
            if (r5 != r4) goto L49
            return r4
        L49:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2d.b(ba5, pu2):java.lang.Object");
    }

    public static String c(String str) {
        if (str == null) {
            str = "";
        }
        List listK0 = zve.k0(str, new String[]{"; "});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK0) {
            String str2 = (String) obj;
            String[] strArr = a;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    arrayList.add(obj);
                    break;
                }
                if (zve.L(str2, strArr[i], true)) {
                    break;
                }
                i++;
            }
        }
        return z92.W0(arrayList, "; ", null, null, null, 62);
    }

    public static final Object d(Activity activity, String str, ba5 ba5Var, r2d r2dVar, String str2, Function1 function1, c1f c1fVar) {
        Object objD = f13.d(new o2d(activity, r2dVar, str, null, ba5Var, str2, function1, null), c1fVar);
        return objD == g13.a ? objD : j6g.a;
    }
}
