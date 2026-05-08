package androidx.compose.ui.platform;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.d;
import defpackage.a3a;
import defpackage.b0;
import defpackage.b3a;
import defpackage.dce;
import defpackage.dh7;
import defpackage.f5e;
import defpackage.fz8;
import defpackage.g5e;
import defpackage.go1;
import defpackage.gu5;
import defpackage.h22;
import defpackage.hh1;
import defpackage.hh7;
import defpackage.i5e;
import defpackage.j6g;
import defpackage.jh7;
import defpackage.jwa;
import defpackage.k5e;
import defpackage.kh7;
import defpackage.kjf;
import defpackage.l;
import defpackage.l5;
import defpackage.le0;
import defpackage.loe;
import defpackage.lrd;
import defpackage.m80;
import defpackage.mif;
import defpackage.mj8;
import defpackage.o3a;
import defpackage.o50;
import defpackage.ot0;
import defpackage.p50;
import defpackage.p6;
import defpackage.ph7;
import defpackage.pm8;
import defpackage.pyd;
import defpackage.q50;
import defpackage.q9;
import defpackage.qed;
import defpackage.qtc;
import defpackage.r5;
import defpackage.r5e;
import defpackage.s4g;
import defpackage.s50;
import defpackage.t50;
import defpackage.t6;
import defpackage.tia;
import defpackage.u50;
import defpackage.u6;
import defpackage.u63;
import defpackage.v4e;
import defpackage.v5b;
import defpackage.w4e;
import defpackage.w5e;
import defpackage.wl7;
import defpackage.wrd;
import defpackage.wu5;
import defpackage.x4e;
import defpackage.y2a;
import defpackage.y5;
import defpackage.y5e;
import defpackage.ypd;
import defpackage.z2a;
import defpackage.z3a;
import defpackage.z5;
import defpackage.z92;
import defpackage.zfd;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends y5 {
    public static final z2a Q;
    public boolean A;
    public C0023d B;
    public a3a C;
    public final b3a D;
    public final y2a E;
    public final y2a F;
    public final String G;
    public final String H;
    public final s4g I;
    public final a3a<g5e> J;
    public g5e K;
    public boolean L;
    public final y2a M;
    public final q9 N;
    public final ArrayList O;
    public final f P;
    public final AndroidComposeView d;
    public int e = Integer.MIN_VALUE;
    public final e f = new e();
    public final AccessibilityManager g;
    public long h;
    public final o50 i;
    public final p50 j;
    public List<AccessibilityServiceInfo> k;
    public final Handler l;
    public final c m;
    public int n;
    public int o;
    public t6 p;
    public t6 q;
    public boolean r;
    public final a3a<lrd> s;
    public final a3a<lrd> t;
    public final loe<loe<CharSequence>> u;
    public final loe<o3a<CharSequence>> v;
    public int w;
    public Integer x;
    public final ot0<pm8> y;
    public final go1 z;

    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            d dVar = d.this;
            AccessibilityManager accessibilityManager = dVar.g;
            dVar.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            accessibilityManager.addAccessibilityStateChangeListener(dVar.i);
            accessibilityManager.addTouchExplorationStateChangeListener(dVar.j);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            d dVar = d.this;
            dVar.l.removeCallbacks(dVar.N);
            AccessibilityManager accessibilityManager = dVar.g;
            accessibilityManager.removeAccessibilityStateChangeListener(dVar.i);
            accessibilityManager.removeTouchExplorationStateChangeListener(dVar.j);
        }
    }

    public static final class b {
        public static final void a(t6 t6Var, f5e f5eVar) {
            w4e w4eVar = f5eVar.d;
            qed qedVar = (qed) x4e.a(w4eVar, k5e.x);
            if (u50.a(f5eVar)) {
                if (qedVar != null && qedVar.a == 8) {
                    return;
                }
                r5 r5Var = (r5) x4e.a(w4eVar, v4e.x);
                if (r5Var != null) {
                    t6Var.b(new t6.a(R.id.accessibilityActionPageUp, r5Var.a));
                }
                r5 r5Var2 = (r5) x4e.a(w4eVar, v4e.z);
                if (r5Var2 != null) {
                    t6Var.b(new t6.a(R.id.accessibilityActionPageDown, r5Var2.a));
                }
                r5 r5Var3 = (r5) x4e.a(w4eVar, v4e.y);
                if (r5Var3 != null) {
                    t6Var.b(new t6.a(R.id.accessibilityActionPageLeft, r5Var3.a));
                }
                r5 r5Var4 = (r5) x4e.a(w4eVar, v4e.A);
                if (r5Var4 != null) {
                    t6Var.b(new t6.a(R.id.accessibilityActionPageRight, r5Var4.a));
                }
            }
        }
    }

    public final class c extends u6 {
        public c() {
        }

        @Override // defpackage.u6
        public final void a(int i, t6 t6Var, String str, Bundle bundle) {
            d.this.j(i, t6Var, str, bundle);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:265:0x05e5  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x0629  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:295:0x0633  */
        /* JADX WARN: Removed duplicated region for block: B:370:0x07b2  */
        /* JADX WARN: Removed duplicated region for block: B:371:0x07bc  */
        /* JADX WARN: Type inference failed for: r0v38 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17, types: [t6] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v3, types: [t6] */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r3v50 */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v14, types: [androidx.compose.ui.platform.d] */
        /* JADX WARN: Type inference failed for: r5v19 */
        /* JADX WARN: Type inference failed for: r5v27, types: [zr4] */
        /* JADX WARN: Type inference failed for: r5v28, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v32, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r5v47 */
        /* JADX WARN: Type inference failed for: r5v50, types: [androidx.compose.ui.platform.d] */
        /* JADX WARN: Type inference failed for: r5v52 */
        /* JADX WARN: Type inference failed for: r5v54 */
        /* JADX WARN: Type inference failed for: r5v55 */
        /* JADX WARN: Type inference failed for: r5v56 */
        /* JADX WARN: Type inference failed for: r6v178 */
        /* JADX WARN: Type inference failed for: r6v96 */
        /* JADX WARN: Type inference failed for: r6v97, types: [java.lang.String] */
        @Override // defpackage.u6
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.t6 b(int r46) {
            /*
                Method dump skipped, instruction units count: 3370
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.d.c.b(int):t6");
        }

        @Override // defpackage.u6
        public final t6 c(int i) {
            d dVar = d.this;
            if (i != 1) {
                if (i == 2) {
                    return b(dVar.n);
                }
                l5.q(p6.c(i, "Unknown focus type: "));
                return null;
            }
            int i2 = dVar.o;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:508:0x017b, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0207  */
        /* JADX WARN: Removed duplicated region for block: B:409:0x066e  */
        /* JADX WARN: Removed duplicated region for block: B:414:0x0686  */
        @Override // defpackage.u6
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean d(int r23, int r24, android.os.Bundle r25) {
            /*
                Method dump skipped, instruction units count: 2116
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.d.c.d(int, int, android.os.Bundle):boolean");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.d$d, reason: collision with other inner class name */
    public static final class C0023d {
        public final f5e a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final long f;

        public C0023d(f5e f5eVar, int i, int i2, int i3, int i4, long j) {
            this.a = f5eVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = j;
        }
    }

    public static final class e extends mj8 implements Function1<AccessibilityEvent, Boolean> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(d.this.d.getParent().requestSendAccessibilityEvent(d.this.d, accessibilityEvent));
        }
    }

    public static final class f extends mj8 implements Function1<wrd, j6g> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(wrd wrdVar) {
            wrd wrdVar2 = wrdVar;
            d dVar = d.this;
            z2a z2aVar = d.Q;
            dVar.getClass();
            if (wrdVar2.b.contains(wrdVar2)) {
                dVar.d.getSnapshotObserver().a(wrdVar2, dVar.P, new q50(wrdVar2, dVar));
            }
            return j6g.a;
        }
    }

    public static final class g extends mj8 implements Function1<pm8, Boolean> {
        public static final g a = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(pm8 pm8Var) {
            w4e w4eVarG = pm8Var.g();
            boolean z = false;
            if (w4eVarG != null && w4eVarG.c) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class h extends mj8 implements Function1<pm8, Boolean> {
        public static final h a = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(pm8 pm8Var) {
            return Boolean.valueOf(pm8Var.t0.d(8));
        }
    }

    static {
        int[] iArr = {com.indeed.android.jobsearch.R.id.accessibility_custom_action_0, com.indeed.android.jobsearch.R.id.accessibility_custom_action_1, com.indeed.android.jobsearch.R.id.accessibility_custom_action_2, com.indeed.android.jobsearch.R.id.accessibility_custom_action_3, com.indeed.android.jobsearch.R.id.accessibility_custom_action_4, com.indeed.android.jobsearch.R.id.accessibility_custom_action_5, com.indeed.android.jobsearch.R.id.accessibility_custom_action_6, com.indeed.android.jobsearch.R.id.accessibility_custom_action_7, com.indeed.android.jobsearch.R.id.accessibility_custom_action_8, com.indeed.android.jobsearch.R.id.accessibility_custom_action_9, com.indeed.android.jobsearch.R.id.accessibility_custom_action_10, com.indeed.android.jobsearch.R.id.accessibility_custom_action_11, com.indeed.android.jobsearch.R.id.accessibility_custom_action_12, com.indeed.android.jobsearch.R.id.accessibility_custom_action_13, com.indeed.android.jobsearch.R.id.accessibility_custom_action_14, com.indeed.android.jobsearch.R.id.accessibility_custom_action_15, com.indeed.android.jobsearch.R.id.accessibility_custom_action_16, com.indeed.android.jobsearch.R.id.accessibility_custom_action_17, com.indeed.android.jobsearch.R.id.accessibility_custom_action_18, com.indeed.android.jobsearch.R.id.accessibility_custom_action_19, com.indeed.android.jobsearch.R.id.accessibility_custom_action_20, com.indeed.android.jobsearch.R.id.accessibility_custom_action_21, com.indeed.android.jobsearch.R.id.accessibility_custom_action_22, com.indeed.android.jobsearch.R.id.accessibility_custom_action_23, com.indeed.android.jobsearch.R.id.accessibility_custom_action_24, com.indeed.android.jobsearch.R.id.accessibility_custom_action_25, com.indeed.android.jobsearch.R.id.accessibility_custom_action_26, com.indeed.android.jobsearch.R.id.accessibility_custom_action_27, com.indeed.android.jobsearch.R.id.accessibility_custom_action_28, com.indeed.android.jobsearch.R.id.accessibility_custom_action_29, com.indeed.android.jobsearch.R.id.accessibility_custom_action_30, com.indeed.android.jobsearch.R.id.accessibility_custom_action_31};
        z2a z2aVar = hh7.a;
        z2a z2aVar2 = new z2a(32);
        int i = z2aVar2.b;
        if (i < 0) {
            l5.s("");
            return;
        }
        int i2 = i + 32;
        z2aVar2.d(i2);
        int[] iArr2 = z2aVar2.a;
        int i3 = z2aVar2.b;
        if (i != i3) {
            pyd.h(i2, i, i3, iArr2, iArr2);
        }
        pyd.k(i, 0, 12, iArr, iArr2);
        z2aVar2.b += 32;
        Q = z2aVar2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [o50] */
    /* JADX WARN: Type inference failed for: r2v3, types: [p50] */
    public d(AndroidComposeView androidComposeView) {
        this.d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: o50
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                d dVar = this.a;
                dVar.k = z ? dVar.g.getEnabledAccessibilityServiceList(-1) : zr4.a;
            }
        };
        this.j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: p50
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                d dVar = this.a;
                dVar.k = dVar.g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.l = new Handler(Looper.getMainLooper());
        this.m = new c();
        this.n = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.s = new a3a<>();
        this.t = new a3a<>();
        this.u = new loe<>(0);
        this.v = new loe<>(0);
        this.w = -1;
        this.y = new ot0<>(0);
        this.z = h22.a(1, 6, null);
        this.A = true;
        a3a a3aVar = kh7.a;
        a3aVar.getClass();
        this.C = a3aVar;
        this.D = new b3a((Object) null);
        this.E = new y2a();
        this.F = new y2a();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new s4g();
        this.J = new a3a<>();
        this.K = new g5e(androidComposeView.getSemanticsOwner().a(), a3aVar);
        int i = dh7.a;
        this.M = new y2a();
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.N = new q9(this, 1);
        this.O = new ArrayList();
        this.P = new f();
    }

    public static /* synthetic */ void E(d dVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        dVar.D(i, i2, num, null);
    }

    public static Rect L(jwa jwaVar) {
        if (!(jwaVar instanceof jwa.b) && !(jwaVar instanceof jwa.c)) {
            return null;
        }
        qtc qtcVarA = jwaVar.a();
        return new Rect((int) qtcVarA.a, (int) qtcVarA.b, (int) qtcVarA.c, (int) qtcVarA.d);
    }

    public static float[] M(jwa jwaVar) {
        if (!(jwaVar instanceof jwa.c)) {
            return null;
        }
        zfd zfdVar = ((jwa.c) jwaVar).a;
        long j = zfdVar.e;
        long j2 = zfdVar.h;
        long j3 = zfdVar.g;
        long j4 = zfdVar.f;
        return new float[]{Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (zfdVar.e & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L))};
    }

    public static Region N(jwa jwaVar) {
        if (jwaVar instanceof jwa.a) {
            v5b v5bVar = ((jwa.a) jwaVar).a;
            qtc bounds = v5bVar.getBounds();
            Region region = new Region(new Rect((int) bounds.a, (int) bounds.b, (int) bounds.c, (int) bounds.d));
            Region region2 = new Region();
            if (v5bVar instanceof m80) {
                region2.setPath(((m80) v5bVar).a, region);
                return region2;
            }
            b0.u("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence O(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String u(f5e f5eVar) {
        le0 le0Var;
        if (f5eVar != null) {
            w4e w4eVar = f5eVar.d;
            z3a<r5e<?>, Object> z3aVar = w4eVar.a;
            r5e<List<String>> r5eVar = k5e.a;
            if (z3aVar.b(r5eVar)) {
                return fz8.b(62, ",", (List) w4eVar.d(r5eVar), null);
            }
            r5e<le0> r5eVar2 = k5e.E;
            if (z3aVar.b(r5eVar2)) {
                le0 le0Var2 = (le0) x4e.a(w4eVar, r5eVar2);
                if (le0Var2 != null) {
                    return le0Var2.b;
                }
            } else {
                List list = (List) x4e.a(w4eVar, k5e.A);
                if (list != null && (le0Var = (le0) z92.Q0(list)) != null) {
                    return le0Var.b;
                }
            }
        }
        return null;
    }

    public static final boolean x(lrd lrdVar, float f2) {
        gu5<Float> gu5Var = lrdVar.a;
        if (f2 >= 0.0f || gu5Var.invoke().floatValue() <= 0.0f) {
            return f2 > 0.0f && gu5Var.invoke().floatValue() < lrdVar.b.invoke().floatValue();
        }
        return true;
    }

    public static final boolean y(lrd lrdVar) {
        gu5<Float> gu5Var = lrdVar.a;
        boolean z = lrdVar.c;
        if (gu5Var.invoke().floatValue() <= 0.0f || z) {
            return gu5Var.invoke().floatValue() < lrdVar.b.invoke().floatValue() && z;
        }
        return true;
    }

    public static final boolean z(lrd lrdVar) {
        gu5<Float> gu5Var = lrdVar.a;
        boolean z = lrdVar.c;
        if (gu5Var.invoke().floatValue() >= lrdVar.b.invoke().floatValue() || z) {
            return gu5Var.invoke().floatValue() > 0.0f && z;
        }
        return true;
    }

    public final int A(int i) {
        if (i == this.d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(defpackage.f5e r20, defpackage.g5e r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = defpackage.sh7.a
            b3a r3 = new b3a
            r4 = 0
            r3.<init>(r4)
            r4 = 4
            java.util.List r5 = defpackage.f5e.j(r4, r1)
            pm8 r6 = r1.c
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = 0
            r9 = r8
        L1e:
            if (r9 >= r7) goto L44
            java.lang.Object r10 = r5.get(r9)
            f5e r10 = (defpackage.f5e) r10
            jh7 r11 = r0.t()
            int r10 = r10.g
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L41
            b3a r11 = r2.b
            boolean r11 = r11.b(r10)
            if (r11 != 0) goto L3e
            r0.w(r6)
            return
        L3e:
            r3.a(r10)
        L41:
            int r9 = r9 + 1
            goto L1e
        L44:
            b3a r2 = r2.b
            int[] r5 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8f
            r9 = r8
        L50:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L8a
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L6a:
            if (r14 >= r12) goto L88
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L84
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.b(r15)
            if (r15 != 0) goto L84
            r0.w(r6)
            return
        L84:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L6a
        L88:
            if (r12 != r13) goto L8f
        L8a:
            if (r9 == r7) goto L8f
            int r9 = r9 + 1
            goto L50
        L8f:
            java.util.List r1 = defpackage.f5e.j(r4, r1)
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L9a:
            if (r8 >= r2) goto Lc0
            java.lang.Object r3 = r1.get(r8)
            f5e r3 = (defpackage.f5e) r3
            a3a<g5e> r4 = r0.J
            int r5 = r3.g
            java.lang.Object r4 = r4.b(r5)
            g5e r4 = (defpackage.g5e) r4
            if (r4 == 0) goto Lbd
            jh7 r5 = r0.t()
            int r6 = r3.g
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lbd
            r0.B(r3, r4)
        Lbd:
            int r8 = r8 + 1
            goto L9a
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.d.B(f5e, g5e):void");
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.r = true;
        }
        try {
            return ((Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.r = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(fz8.b(62, ",", list, null));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventO = o(A(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i) {
        C0023d c0023d = this.B;
        if (c0023d != null) {
            f5e f5eVar = c0023d.a;
            if (i != f5eVar.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0023d.f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(f5eVar.g), 131072);
                accessibilityEventO.setFromIndex(c0023d.d);
                accessibilityEventO.setToIndex(c0023d.e);
                accessibilityEventO.setAction(c0023d.b);
                accessibilityEventO.setMovementGranularity(c0023d.c);
                accessibilityEventO.getText().add(u(f5eVar));
                C(accessibilityEventO);
            }
        }
        this.B = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x04db A[PHI: r38
  0x04db: PHI (r38v8 int) = (r38v7 int), (r38v10 int), (r38v10 int) binds: [B:186:0x04d9, B:180:0x04c0, B:182:0x04c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(defpackage.jh7<defpackage.i5e> r58) {
        /*
            Method dump skipped, instruction units count: 1671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.d.H(jh7):void");
    }

    public final void I(pm8 pm8Var, b3a b3aVar) {
        w4e w4eVarG;
        pm8 pm8VarC;
        if (pm8Var.d() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(pm8Var)) {
            if (!pm8Var.t0.d(8)) {
                pm8Var = u50.c(pm8Var, h.a);
            }
            if (pm8Var == null || (w4eVarG = pm8Var.g()) == null) {
                return;
            }
            if (!w4eVarG.c && (pm8VarC = u50.c(pm8Var, g.a)) != null) {
                pm8Var = pm8VarC;
            }
            int i = pm8Var.b;
            if (b3aVar.a(i)) {
                E(this, A(i), 2048, 1, 8);
            }
        }
    }

    public final void J(pm8 pm8Var) {
        if (pm8Var.d() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(pm8Var)) {
            int i = pm8Var.b;
            lrd lrdVarB = this.s.b(i);
            lrd lrdVarB2 = this.t.b(i);
            if (lrdVarB == null && lrdVarB2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i, 4096);
            if (lrdVarB != null) {
                accessibilityEventO.setScrollX((int) lrdVarB.a.invoke().floatValue());
                accessibilityEventO.setMaxScrollX((int) lrdVarB.b.invoke().floatValue());
            }
            if (lrdVarB2 != null) {
                accessibilityEventO.setScrollY((int) lrdVarB2.a.invoke().floatValue());
                accessibilityEventO.setMaxScrollY((int) lrdVarB2.b.invoke().floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(f5e f5eVar, int i, int i2, boolean z) {
        String strU;
        w4e w4eVar = f5eVar.d;
        int i3 = f5eVar.g;
        r5e<r5<wu5<Integer, Integer, Boolean, Boolean>>> r5eVar = v4e.i;
        if (w4eVar.a.b(r5eVar) && u50.a(f5eVar)) {
            wu5 wu5Var = (wu5) ((r5) f5eVar.d.d(r5eVar)).b;
            if (wu5Var != null) {
                return ((Boolean) wu5Var.q(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.w) && (strU = u(f5eVar)) != null) {
            if (i < 0 || i != i2 || i2 > strU.length()) {
                i = -1;
            }
            this.w = i;
            boolean z2 = strU.length() > 0;
            C(q(A(i3), z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(strU.length()) : null, strU));
            G(i3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0150, code lost:
    
        if (((r1 & ((~r1) << 6)) & r24) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0152, code lost:
    
        r29 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P() {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.d.P():void");
    }

    @Override // defpackage.y5
    public final u6 b(View view) {
        return this.m;
    }

    public final void j(int i, t6 t6Var, String str, Bundle bundle) {
        f5e f5eVar;
        dce dceVar;
        Region regionN;
        float[] fArrM;
        Rect rectL;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i2;
        AccessibilityNodeInfo accessibilityNodeInfo2 = t6Var.a;
        i5e i5eVarB = t().b(i);
        if (i5eVarB == null || (f5eVar = i5eVarB.a) == null) {
            return;
        }
        w4e w4eVar = f5eVar.d;
        z3a<r5e<?>, Object> z3aVar = w4eVar.a;
        String strU = u(f5eVar);
        if (wl7.b(str, this.G)) {
            int iD = this.E.d(i);
            if (iD != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (wl7.b(str, this.H)) {
            int iD2 = this.F.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (z3aVar.b(v4e.a) && bundle != null && wl7.b(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 > 0 && i3 >= 0) {
                if (i3 < (strU != null ? strU.length() : Integer.MAX_VALUE)) {
                    mif mifVarB = y5e.b(w4eVar);
                    if (mifVarB == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i3 + i5;
                        RectF rectF = null;
                        if (i6 >= mifVarB.a.a.b.length()) {
                            arrayList.add(null);
                            accessibilityNodeInfo = accessibilityNodeInfo2;
                            i2 = i4;
                        } else {
                            qtc qtcVarB = mifVarB.b(i6);
                            tia tiaVarD = f5eVar.d();
                            long jA0 = 0;
                            if (tiaVarD != null) {
                                if (!tiaVarD.f1().c0) {
                                    tiaVarD = null;
                                }
                                if (tiaVarD != null) {
                                    jA0 = tiaVarD.a0(0L);
                                }
                            }
                            qtc qtcVarI = qtcVarB.i(jA0);
                            qtc qtcVarG = f5eVar.g();
                            qtc qtcVarE = qtcVarI.g(qtcVarG) ? qtcVarI.e(qtcVarG) : null;
                            if (qtcVarE != null) {
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(qtcVarE.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(qtcVarE.a)) << 32);
                                AndroidComposeView androidComposeView = this.d;
                                long jV = androidComposeView.v(jFloatToRawIntBits);
                                accessibilityNodeInfo = accessibilityNodeInfo2;
                                i2 = i4;
                                long jV2 = androidComposeView.v((((long) Float.floatToRawIntBits(qtcVarE.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(qtcVarE.c)) << 32));
                                int i7 = (int) (jV >> 32);
                                int i8 = (int) (jV2 >> 32);
                                int i9 = (int) (jV & 4294967295L);
                                int i10 = (int) (jV2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)));
                            } else {
                                accessibilityNodeInfo = accessibilityNodeInfo2;
                                i2 = i4;
                            }
                            arrayList.add(rectF);
                        }
                        i5++;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        i4 = i2;
                    }
                    accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        r5e<String> r5eVar = k5e.y;
        if (z3aVar.b(r5eVar) && bundle != null && wl7.b(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) x4e.a(w4eVar, r5eVar);
            if (str2 != null) {
                accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (wl7.b(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo2.getExtras().putInt(str, f5eVar.g);
            return;
        }
        if (wl7.b(str, "androidx.compose.ui.semantics.shapeType")) {
            dce dceVar2 = (dce) x4e.a(w4eVar, k5e.O);
            if (dceVar2 != null) {
                jwa jwaVarP = p(dceVar2, f5eVar);
                if (jwaVarP instanceof jwa.b) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(jwaVarP));
                    return;
                } else if (jwaVarP instanceof jwa.c) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(jwaVarP));
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", M(jwaVarP));
                    return;
                } else if (!(jwaVarP instanceof jwa.a)) {
                    l.g();
                    return;
                } else {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", N(jwaVarP));
                    return;
                }
            }
            return;
        }
        if (wl7.b(str, "androidx.compose.ui.semantics.shapeRect")) {
            dce dceVar3 = (dce) x4e.a(w4eVar, k5e.O);
            if (dceVar3 == null || (rectL = L(p(dceVar3, f5eVar))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
            return;
        }
        if (wl7.b(str, "androidx.compose.ui.semantics.shapeCorners")) {
            dce dceVar4 = (dce) x4e.a(w4eVar, k5e.O);
            if (dceVar4 == null || (fArrM = M(p(dceVar4, f5eVar))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM);
            return;
        }
        if (!wl7.b(str, "androidx.compose.ui.semantics.shapeRegion") || (dceVar = (dce) x4e.a(w4eVar, k5e.O)) == null || (regionN = N(p(dceVar, f5eVar))) == null) {
            return;
        }
        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionN);
    }

    public final Rect k(i5e i5eVar) {
        ph7 ph7Var = i5eVar.b;
        float f2 = ph7Var.a;
        float f3 = ph7Var.b;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f3)) & 4294967295L;
        AndroidComposeView androidComposeView = this.d;
        long jV = androidComposeView.v(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jV2 = androidComposeView.v((((long) Float.floatToRawIntBits(ph7Var.c)) << 32) | (((long) Float.floatToRawIntBits(ph7Var.d)) & 4294967295L));
        int i = (int) (jV >> 32);
        int i2 = (int) (jV2 >> 32);
        int i3 = (int) (jV & 4294967295L);
        int i4 = (int) (jV2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f9, code lost:
    
        if (defpackage.ls3.b(r5, r2) == r8) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:13:0x0035, B:24:0x0064, B:28:0x0076, B:30:0x007e, B:32:0x0087, B:34:0x008d, B:35:0x009c, B:37:0x00a4, B:20:0x004e, B:23:0x0055), top: B:57:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f9 -> B:50:0x00fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.pu2 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.d.l(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(int r23, long r24, boolean r26) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.d.m(int, long, boolean):boolean");
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.d.getSemanticsOwner().a(), this.K);
            }
            j6g j6gVar = j6g.a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(t());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    P();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        i5e i5eVarB;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i);
        if (v() && (i5eVarB = t().b(i)) != null) {
            f5e f5eVar = i5eVarB.a;
            accessibilityEventObtain.setPassword(f5eVar.d.a.b(k5e.J));
            boolean zB = wl7.b(x4e.a(f5eVar.d, k5e.n), Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                z5.a(accessibilityEventObtain, zB);
            }
        }
        return accessibilityEventObtain;
    }

    public final jwa p(dce dceVar, f5e f5eVar) {
        tia tiaVarD = f5eVar.d();
        return dceVar.a(hh1.Y(tiaVarD != null ? tiaVarD.c : 0L), f5eVar.c.n0, this.d.getDensity());
    }

    public final AccessibilityEvent q(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int r(f5e f5eVar) {
        w4e w4eVar = f5eVar.d;
        if (!w4eVar.a.b(k5e.a)) {
            r5e<kjf> r5eVar = k5e.F;
            if (w4eVar.a.b(r5eVar)) {
                return (int) (((kjf) w4eVar.d(r5eVar)).a & 4294967295L);
            }
        }
        return this.w;
    }

    public final int s(f5e f5eVar) {
        w4e w4eVar = f5eVar.d;
        if (!w4eVar.a.b(k5e.a)) {
            r5e<kjf> r5eVar = k5e.F;
            if (w4eVar.a.b(r5eVar)) {
                return (int) (((kjf) w4eVar.d(r5eVar)).a >> 32);
            }
        }
        return this.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jh7<i5e> t() {
        if (this.A) {
            this.A = false;
            AndroidComposeView androidComposeView = this.d;
            this.C = ypd.w(androidComposeView.getSemanticsOwner());
            if (v()) {
                a3a a3aVar = this.C;
                Resources resources = androidComposeView.getContext().getResources();
                y2a y2aVar = this.E;
                y2aVar.a();
                y2a y2aVar2 = this.F;
                y2aVar2.a();
                i5e i5eVar = (i5e) a3aVar.b(-1);
                f5e f5eVar = i5eVar != null ? i5eVar.a : null;
                f5eVar.getClass();
                ArrayList arrayListB = w5e.b(f5eVar, new s50(a3aVar), new t50(resources), u63.Z(f5eVar));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((f5e) arrayListB.get(i - 1)).g;
                        int i3 = ((f5e) arrayListB.get(i)).g;
                        y2aVar.f(i2, i3);
                        y2aVar2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.C;
    }

    public final boolean v() {
        return this.g.isEnabled() && !this.k.isEmpty();
    }

    public final void w(pm8 pm8Var) {
        if (this.y.add(pm8Var)) {
            this.z.f(j6g.a);
        }
    }
}
