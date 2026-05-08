package com.wlappdebug;

import android.content.ComponentCallbacks;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.a9c;
import defpackage.ah2;
import defpackage.ak2;
import defpackage.ake;
import defpackage.bh2;
import defpackage.boa;
import defpackage.c20;
import defpackage.c8;
import defpackage.ci2;
import defpackage.dc5;
import defpackage.fh8;
import defpackage.fif;
import defpackage.fwc;
import defpackage.g4a;
import defpackage.gi7;
import defpackage.gl2;
import defpackage.gu5;
import defpackage.hm8;
import defpackage.i6c;
import defpackage.j6g;
import defpackage.jhf;
import defpackage.k2;
import defpackage.ka2;
import defpackage.l40;
import defpackage.mb2;
import defpackage.mj8;
import defpackage.ob2;
import defpackage.pg8;
import defpackage.pm8;
import defpackage.pnb;
import defpackage.qt8;
import defpackage.rm2;
import defpackage.sq1;
import defpackage.t8b;
import defpackage.u63;
import defpackage.ub5;
import defpackage.uz;
import defpackage.vs0;
import defpackage.w40;
import defpackage.wi0;
import defpackage.wl7;
import defpackage.ybf;
import defpackage.ygg;
import defpackage.yob;
import defpackage.z92;
import defpackage.zff;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/wlappdebug/DebugProctorActivity;", "Lwi0;", "<init>", "()V", "e", "", "overrideValue", "", "overridePayloadString", "", "customBucketDialogShown", "Ljhf;", "input", "wlappdebug_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class DebugProctorActivity extends wi0 {
    public static final /* synthetic */ int t0 = 0;
    public final Lazy q0 = boa.E(qt8.a, new j(this));
    public final ArrayList r0 = new ArrayList();
    public c8 s0;

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ g4a<jhf> $input$delegate;
        final /* synthetic */ Function1<String, j6g> $onPositiveClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g4a g4aVar, Function1 function1) {
            super(2);
            this.$onPositiveClick = function1;
            this.$input$delegate = g4aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 11) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                bVar2.u(1453150644);
                boolean zX = bVar2.x(this.$onPositiveClick) | bVar2.K(this.$input$delegate);
                Function1<String, j6g> function1 = this.$onPositiveClick;
                g4a<jhf> g4aVar = this.$input$delegate;
                Object objV = bVar2.v();
                if (zX || objV == b.a.a) {
                    objV = new a0(g4aVar, function1);
                    bVar2.p(objV);
                }
                bVar2.J();
                sq1.a((gu5) objV, null, false, null, null, null, null, null, ci2.a, bVar2, 805306368, 510);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ gu5<j6g> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gu5<j6g> gu5Var) {
            super(2);
            this.$onDismiss = gu5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 11) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                bVar2.u(1453150823);
                boolean zX = bVar2.x(this.$onDismiss);
                gu5<j6g> gu5Var = this.$onDismiss;
                Object objV = bVar2.v();
                if (zX || objV == b.a.a) {
                    objV = new b0(gu5Var);
                    bVar2.p(objV);
                }
                bVar2.J();
                sq1.a((gu5) objV, null, false, null, null, null, null, null, ci2.b, bVar2, 805306368, 510);
            }
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ g4a<jhf> $input$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g4a<jhf> g4aVar) {
            super(2);
            this.$input$delegate = g4aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 11) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.f.f(e.a.b, 8.0f);
                g4a<jhf> g4aVar = this.$input$delegate;
                bVar2.u(-483455358);
                ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                bVar2.u(-1323940314);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                ah2 ah2VarA = hm8.a(eVarF);
                if (bVar2.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar2.B();
                if (bVar2.f()) {
                    bVar2.y(aVar);
                } else {
                    bVar2.n();
                }
                ygg.y(bVar2, ob2VarA, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                    uz.g(iG, bVar2, iG, c0251a);
                }
                ah2VarA.q(new ake(bVar2), bVar2, 0);
                bVar2.u(2058660585);
                fif.b("Custom bucket value (integer):", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 6, 0, 131070);
                int i = DebugProctorActivity.t0;
                jhf value = g4aVar.getValue();
                bVar2.u(1453151168);
                boolean zK = bVar2.K(g4aVar);
                Object objV = bVar2.v();
                if (zK || objV == b.a.a) {
                    objV = new c0(g4aVar);
                    bVar2.p(objV);
                }
                Function1 function1 = (Function1) objV;
                bVar2.J();
                Boolean bool = fh8.e.b;
                zff.a(value, function1, null, false, null, null, null, null, new fh8(Boolean.valueOf(bool != null ? bool.booleanValue() : true), 3, 1, 96), null, 0, 0, null, null, bVar2, 0, 384, 1044476);
                bVar2.J();
                bVar2.q();
                bVar2.J();
                bVar2.J();
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ gu5<j6g> $onDismiss;
        final /* synthetic */ Function1<String, j6g> $onPositiveClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(gu5<j6g> gu5Var, Function1<? super String, j6g> function1, int i) {
            super(2);
            this.$onDismiss = gu5Var;
            this.$onPositiveClick = function1;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            DebugProctorActivity debugProctorActivity = DebugProctorActivity.this;
            gu5<j6g> gu5Var = this.$onDismiss;
            Function1<String, j6g> function1 = this.$onPositiveClick;
            int iL = ka2.L(this.$$changed | 1);
            int i = DebugProctorActivity.t0;
            debugProctorActivity.A(iL, gu5Var, bVar, function1);
            return j6g.a;
        }
    }

    public static final class e implements Comparable<e> {
        public final ybf a;
        public Integer b;
        public String c;

        public e(ybf ybfVar, Integer num, String str) {
            this.a = ybfVar;
            this.b = num;
            this.c = str;
        }

        @Override // java.lang.Comparable
        public final int compareTo(e eVar) {
            e eVar2 = eVar;
            eVar2.getClass();
            Function1[] function1Arr = {d0.a, e0.a, f0.a};
            for (int i = 0; i < 3; i++) {
                Function1 function1 = function1Arr[i];
                int i2 = ak2.i((Comparable) function1.invoke(this), (Comparable) function1.invoke(eVar2));
                if (i2 != 0) {
                    return i2;
                }
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && wl7.b(this.b, eVar.b) && wl7.b(this.c, eVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Editor(test=");
            sb.append(this.a);
            sb.append(", overrideValue=");
            sb.append(this.b);
            sb.append(", overridePayloadString=");
            return w40.f(sb, this.c, ')');
        }
    }

    public static final class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String string = editable != null ? editable.toString() : null;
            DebugProctorActivity debugProctorActivity = DebugProctorActivity.this;
            ub5 ub5VarA = dc5.a(string, debugProctorActivity.r0, h.a);
            c8 c8Var = debugProctorActivity.s0;
            if (c8Var != null) {
                c8Var.E0.setContent(new ah2(1205979378, new g(ub5VarA, debugProctorActivity), true));
            } else {
                wl7.g("binding");
                throw null;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class g extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ ub5<e> $filterResult;
        final /* synthetic */ DebugProctorActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ub5 ub5Var, DebugProctorActivity debugProctorActivity) {
            super(2);
            this.this$0 = debugProctorActivity;
            this.$filterResult = ub5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 11) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                DebugProctorActivity.D(this.this$0, this.$filterResult, bVar2, 72);
            }
            return j6g.a;
        }
    }

    public static final class h extends mj8 implements Function1<e, String> {
        public static final h a = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(e eVar) {
            e eVar2 = eVar;
            eVar2.getClass();
            return eVar2.a.getName();
        }
    }

    public static final class i extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 11) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                DebugProctorActivity debugProctorActivity = DebugProctorActivity.this;
                DebugProctorActivity.D(debugProctorActivity, new ub5(zr4.a, z92.o1(debugProctorActivity.r0)), bVar2, 72);
            }
            return j6g.a;
        }
    }

    public static final class j extends mj8 implements gu5<yob<k2>> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(DebugProctorActivity debugProctorActivity) {
            super(0);
            this.$this_inject = debugProctorActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yob<k2>] */
        @Override // defpackage.gu5
        public final yob<k2> invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(yob.class), a9cVar);
        }
    }

    public static final void B(DebugProctorActivity debugProctorActivity, e eVar, List list, androidx.compose.runtime.b bVar, int i2) {
        debugProctorActivity.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(379556843);
        rm2.b(new i6c[]{gi7.b.a(Boolean.FALSE)}, bh2.b(cVarH, -205801685, new g0(debugProctorActivity, eVar, list)), cVarH, 56);
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new h0(debugProctorActivity, eVar, list, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04b3 A[LOOP:4: B:86:0x04ad->B:88:0x04b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void C(com.wlappdebug.DebugProctorActivity r39, com.wlappdebug.DebugProctorActivity.e r40, java.util.List r41, androidx.compose.runtime.b r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wlappdebug.DebugProctorActivity.C(com.wlappdebug.DebugProctorActivity, com.wlappdebug.DebugProctorActivity$e, java.util.List, androidx.compose.runtime.b, int):void");
    }

    public static final void D(DebugProctorActivity debugProctorActivity, ub5 ub5Var, androidx.compose.runtime.b bVar, int i2) {
        debugProctorActivity.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(1662183692);
        u63.g(null, null, null, bh2.b(cVarH, 617496800, new s0(ub5Var, debugProctorActivity)), cVarH, 3072, 7);
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new t0(debugProctorActivity, ub5Var, i2);
        }
    }

    public final void A(int i2, gu5 gu5Var, androidx.compose.runtime.b bVar, Function1 function1) {
        int i3;
        androidx.compose.runtime.c cVarH = bVar.h(-790691210);
        if ((i2 & 14) == 0) {
            i3 = (cVarH.x(gu5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= cVarH.x(function1) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            cVarH.u(-492369756);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = androidx.compose.runtime.r.f(new jhf((String) null, 0L, 7));
                cVarH.p(objV);
            }
            cVarH.U(false);
            g4a g4aVar = (g4a) objV;
            l40.a(gu5Var, bh2.b(cVarH, -1157331778, new a(g4aVar, function1)), null, bh2.b(cVarH, -1313312320, new b(gu5Var)), null, bh2.b(cVarH, -1469292862, new c(g4aVar)), null, 0L, 0L, null, cVarH, (i3 & 14) | 199728, 980);
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new d(gu5Var, function1, i2);
        }
    }

    public final yob<k2> E() {
        return (yob) this.q0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r13) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wlappdebug.DebugProctorActivity.onCreate(android.os.Bundle):void");
    }
}
