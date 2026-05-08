package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.indeed.android.jobsearch.viewjob.a;

/* JADX INFO: loaded from: classes2.dex */
public final class kqg {
    public static final g3a<jz2<j6g>> a;
    public static final g3a b;

    static {
        g3a<jz2<j6g>> g3aVar = new g3a<>();
        a = g3aVar;
        b = g3aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r12, androidx.fragment.app.FragmentManager r13, boolean r14, java.lang.String r15) {
        /*
            r12.getClass()
            r13.getClass()
            androidx.fragment.app.a r0 = new androidx.fragment.app.a
            r0.<init>(r13)
            java.lang.String r13 = "ViewJobBottomSheetFragment"
            r0.c(r13)
            dd4 r1 = defpackage.dd4.a
            boolean r2 = defpackage.pyd.h0
            if (r2 == 0) goto L45
            ed4 r2 = defpackage.dd4.n()
            ad4 r2 = r2.a
            r2.getClass()
            cd4$a r3 = cd4.a.s0
            int r2 = r2.e(r3)
            cd4$n2 r4 = cd4.n2.a
            int r4 = r4.getValue()
            if (r2 != r4) goto L2e
            goto L43
        L2e:
            ed4 r2 = defpackage.dd4.n()
            ad4 r2 = r2.a
            r2.getClass()
            int r2 = r2.e(r3)
            cd4$n2 r3 = cd4.n2.b
            int r3 = r3.getValue()
            if (r2 != r3) goto L45
        L43:
            r2 = 1
            goto L46
        L45:
            r2 = 0
        L46:
            boolean r3 = defpackage.pyd.h0
            if (r3 == 0) goto L6e
            ed4 r3 = defpackage.dd4.n()
            ad4 r3 = r3.a
            r3.getClass()
            cd4$a r4 = cd4.a.s0
            int r3 = r3.e(r4)
            cd4$n2 r4 = cd4.n2.b
            int r4 = r4.getValue()
            if (r3 != r4) goto L6e
            boolean r3 = defpackage.dd4.k()
            if (r3 != 0) goto L6e
            r3 = 4606732058837280358(0x3fee666666666666, double:0.95)
        L6c:
            r8 = r3
            goto L71
        L6e:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L6c
        L71:
            if (r2 == 0) goto La6
            ohc r6 = new ohc
            if (r14 == 0) goto L7a
            nhc r14 = defpackage.nhc.DEEPLINK
            goto L7c
        L7a:
            nhc r14 = defpackage.nhc.UNKNOWN
        L7c:
            ep5 r2 = defpackage.ep5.a
            java.lang.String r2 = r2.e()
            java.lang.String r1 = r1.a()
            e9a r1 = e9a.a.a(r2, r1)
            r6.<init>(r12, r14, r15, r1)
            kbc$a r12 = defpackage.kbc.p0
            boolean r10 = defpackage.dd4.k()
            jr r11 = new jr
            r14 = 23
            r11.<init>(r14)
            r12.getClass()
            java.lang.String r5 = "ViewJob"
            java.lang.String r7 = "rn-view-job"
            kbc r12 = kbc.a.a(r5, r6, r7, r8, r10, r11)
            goto Lb9
        La6:
            com.indeed.android.jobsearch.viewjob.a r14 = new com.indeed.android.jobsearch.viewjob.a
            r14.<init>()
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r1 = "VIEW_JOB_URL"
            r15.putString(r1, r12)
            r14.setArguments(r15)
            r12 = r14
        Lb9:
            r12.K(r0, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqg.a(java.lang.String, androidx.fragment.app.FragmentManager, boolean, java.lang.String):void");
    }

    public static void b(FragmentManager fragmentManager) {
        fragmentManager.getClass();
        Fragment fragmentD = fragmentManager.D("ViewJobBottomSheetFragment");
        if (fragmentD instanceof a) {
            ((a) fragmentD).E();
        } else if (fragmentD instanceof kbc) {
            ((kbc) fragmentD).E();
        }
    }

    public static boolean c(String str, lr5 lr5Var) {
        str.getClass();
        Fragment fragmentD = lr5Var.D("ViewJobBottomSheetFragment");
        if (fragmentD == null || !(fragmentD instanceof a)) {
            return false;
        }
        lqg lqgVarQ = ((a) fragmentD).Q();
        ((gme) lqgVarQ.b).setValue(jqg.a(lqgVarQ.g(), false, false, false, false, null, false, null, str, 0.0f, false, false, 3967));
        return true;
    }

    public static void d(boolean z, lr5 lr5Var) {
        Fragment fragmentD = lr5Var.D("ViewJobBottomSheetFragment");
        if (fragmentD == null || !(fragmentD instanceof a)) {
            return;
        }
        lqg lqgVarQ = ((a) fragmentD).Q();
        ((gme) lqgVarQ.b).setValue(jqg.a(lqgVarQ.g(), false, false, false, false, null, false, Boolean.valueOf(z), null, 0.0f, false, false, 4031));
    }
}
