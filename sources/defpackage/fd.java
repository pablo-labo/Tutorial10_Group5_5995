package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfd;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fd extends w0g {
    public final zcd g0 = new zcd();
    public final frg h0 = os5.a(this, fwc.a.b(yvb.class), new a(this), new b(this), new z0(this, 1));
    public boolean i0;
    public Function2<? super ps7, ? super pr7, j6g> j0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fd fdVar) {
            super(0);
            this.$this_activityViewModels = fdVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fd fdVar) {
            super(0);
            this.$this_activityViewModels = fdVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        c cVarH = bVar.h(174826892);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            boolean z = this.i0;
            m61 m61Var = Q().v().w;
            b5g b5gVarW = Q().w();
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new cd(this, 0);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new dd(this, 0);
                cVarH.p(objV2);
            }
            je.a(z, m61Var, function1, (gu5) objV2, b5gVarW, cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ed(this, i, i3);
        }
    }

    public final yvb Q() {
        return (yvb) this.h0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        rr7 rr7Var;
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            boolean z = (arguments == null || !arguments.containsKey("KEY_IS_BUILD_SUGGESTION")) ? false : arguments.getBoolean("KEY_IS_BUILD_SUGGESTION");
            this.i0 = z;
            if (z) {
                tg3 tg3Var = null;
                String string = (arguments == null || !arguments.containsKey("KEY_TITLE")) ? null : arguments.getString("KEY_TITLE");
                String string2 = (arguments == null || !arguments.containsKey("KEY_DESCRIPTION")) ? null : arguments.getString("KEY_DESCRIPTION");
                if (arguments == null || !arguments.containsKey("KEY_YEAR")) {
                    rr7Var = null;
                } else {
                    int i = arguments.getInt("KEY_YEAR", -1);
                    String string3 = arguments.getString("KEY_MONTH_NAME");
                    rr7Var = new rr7(string3 != null ? ds7.valueOf(string3) : null, Integer.valueOf(i));
                }
                if (rr7Var != null) {
                    ds7 ds7Var = rr7Var.a;
                    tg3Var = new tg3(null, ds7Var != null ? jsb.c(ds7Var) : null, rr7Var.b);
                }
                m61 m61Var = new m61(tg3Var, string2, string, 1);
                yvb yvbVarQ = Q();
                ((gme) yvbVarQ.d).setValue(svb.a(yvbVarQ.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, m61Var, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -4194305, 8388607));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) Q().e).setValue(b5g.a);
        }
        this.j0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-award", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-add-award", null, null, 12));
    }
}
