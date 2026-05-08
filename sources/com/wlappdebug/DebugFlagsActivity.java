package com.wlappdebug;

import android.content.ComponentCallbacks;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowInsets;
import android.widget.EditText;
import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.R;
import com.wlappdebug.DebugFlagsActivity;
import com.wlappdebug.r;
import defpackage.a8;
import defpackage.a9c;
import defpackage.ah2;
import defpackage.ak2;
import defpackage.bh2;
import defpackage.boa;
import defpackage.dc5;
import defpackage.fwc;
import defpackage.gi7;
import defpackage.gu5;
import defpackage.i6c;
import defpackage.j6g;
import defpackage.mh3;
import defpackage.mj8;
import defpackage.oc9;
import defpackage.pnb;
import defpackage.qpg;
import defpackage.qt8;
import defpackage.rm2;
import defpackage.u63;
import defpackage.ub5;
import defpackage.wd3;
import defpackage.wi0;
import defpackage.wl7;
import defpackage.z92;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/wlappdebug/DebugFlagsActivity;", "Lwi0;", "<init>", "()V", "a", "", "value", "wlappdebug_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class DebugFlagsActivity extends wi0 {
    public static final /* synthetic */ int t0 = 0;
    public final Lazy q0 = boa.E(qt8.a, new f(this));
    public final ArrayList r0 = new ArrayList();
    public a8 s0;

    public static final class a implements Comparable<a> {
        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            aVar2.getClass();
            Function1[] function1Arr = {s.a, t.a};
            for (int i = 0; i < 2; i++) {
                Function1 function1 = function1Arr[i];
                int i2 = ak2.i((Comparable) function1.invoke(this), (Comparable) function1.invoke(aVar2));
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
            if (obj instanceof a) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String string = editable != null ? editable.toString() : null;
            DebugFlagsActivity debugFlagsActivity = DebugFlagsActivity.this;
            ub5 ub5VarA = dc5.a(string, debugFlagsActivity.r0, d.a);
            a8 a8Var = debugFlagsActivity.s0;
            if (a8Var != null) {
                a8Var.E0.setContent(new ah2(2013444850, new c(ub5VarA, debugFlagsActivity), true));
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

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ ub5<a> $filterResult;
        final /* synthetic */ DebugFlagsActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ub5 ub5Var, DebugFlagsActivity debugFlagsActivity) {
            super(2);
            this.this$0 = debugFlagsActivity;
            this.$filterResult = ub5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 11) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                DebugFlagsActivity.C(this.this$0, this.$filterResult, bVar2, 72);
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function1<a, String> {
        public static final d a = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(a aVar) {
            aVar.getClass();
            throw null;
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 11) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                DebugFlagsActivity debugFlagsActivity = DebugFlagsActivity.this;
                DebugFlagsActivity.C(debugFlagsActivity, new ub5(zr4.a, z92.o1(debugFlagsActivity.r0)), bVar2, 72);
            }
            return j6g.a;
        }
    }

    public static final class f extends mj8 implements gu5<r.b> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DebugFlagsActivity debugFlagsActivity) {
            super(0);
            this.$this_inject = debugFlagsActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.wlappdebug.r$b, java.lang.Object] */
        @Override // defpackage.gu5
        public final r.b invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(r.b.class), a9cVar);
        }
    }

    public static final void A(DebugFlagsActivity debugFlagsActivity, a aVar, List list, androidx.compose.runtime.b bVar, int i) {
        debugFlagsActivity.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(734456427);
        rm2.b(new i6c[]{gi7.b.a(Boolean.FALSE)}, bh2.b(cVarH, 2029432235, new u(debugFlagsActivity, aVar, list)), cVarH, 56);
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new v(debugFlagsActivity, aVar, list, i);
        }
    }

    public static final void B(DebugFlagsActivity debugFlagsActivity, a aVar, List list, androidx.compose.runtime.b bVar, int i) {
        debugFlagsActivity.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-1378907347);
        cVarH.u(-492369756);
        Object objV = cVarH.v();
        if (objV == b.a.a) {
            aVar.getClass();
            objV = androidx.compose.runtime.r.f(null);
            cVarH.p(objV);
        }
        cVarH.U(false);
        throw null;
    }

    public static final void C(DebugFlagsActivity debugFlagsActivity, ub5 ub5Var, androidx.compose.runtime.b bVar, int i) {
        debugFlagsActivity.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-1297352692);
        u63.g(null, null, null, bh2.b(cVarH, -439068192, new y(ub5Var, debugFlagsActivity)), cVarH, 3072, 7);
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new z(debugFlagsActivity, ub5Var, i);
        }
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        oc9 oc9Var = new oc9(i >= 35 ? 50 : 0);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i3 = a8.I0;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = wd3.a;
        a8 a8Var = (a8) qpg.W(layoutInflater, R.layout.activity_debug_flags, null);
        a8Var.getClass();
        this.s0 = a8Var;
        a8Var.e0(oc9Var);
        a8 a8Var2 = this.s0;
        if (a8Var2 == null) {
            wl7.g("binding");
            throw null;
        }
        setContentView(a8Var2.r0);
        if (i >= 35) {
            a8 a8Var3 = this.s0;
            if (a8Var3 == null) {
                wl7.g("binding");
                throw null;
            }
            a8Var3.r0.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: kh3
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int i4 = DebugFlagsActivity.t0;
                    view.getClass();
                    windowInsets.getClass();
                    a8 a8Var4 = this.a.s0;
                    if (a8Var4 == null) {
                        wl7.g("binding");
                        throw null;
                    }
                    View view2 = a8Var4.r0;
                    view2.getClass();
                    return vzg.a(view, view2, windowInsets);
                }
            });
        }
        Iterator it = r.a().iterator();
        if (it.hasNext()) {
            r.a aVar = (r.a) it.next();
            r.b bVar = (r.b) this.q0.getValue();
            aVar.getClass();
            bVar.getClass();
            throw null;
        }
        a8 a8Var4 = this.s0;
        if (a8Var4 == null) {
            wl7.g("binding");
            throw null;
        }
        EditText editText = a8Var4.F0;
        editText.getClass();
        editText.addTextChangedListener(new b());
        a8 a8Var5 = this.s0;
        if (a8Var5 == null) {
            wl7.g("binding");
            throw null;
        }
        a8Var5.E0.setContent(new ah2(2124998477, new e(), true));
        a8 a8Var6 = this.s0;
        if (a8Var6 == null) {
            wl7.g("binding");
            throw null;
        }
        a8Var6.D0.setOnClickListener(new View.OnClickListener() { // from class: lh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = DebugFlagsActivity.t0;
                this.a.finish();
            }
        });
        a8 a8Var7 = this.s0;
        if (a8Var7 != null) {
            a8Var7.G0.setOnClickListener(new mh3(this, i2));
        } else {
            wl7.g("binding");
            throw null;
        }
    }
}
