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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldu;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class du extends w0g {
    public final zcd g0 = new zcd();
    public final frg h0 = os5.a(this, fwc.a.b(yvb.class), new a(this), new b(this), new oj(this, 1));
    public Function2<? super ps7, ? super es7, j6g> i0;
    public boolean j0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(du duVar) {
            super(0);
            this.$this_activityViewModels = duVar;
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
        public b(du duVar) {
            super(0);
            this.$this_activityViewModels = duVar;
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
        c cVarH = bVar.h(1296126193);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        int i3 = 0;
        int i4 = 1;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            boolean z = this.j0;
            b5g b5gVarW = Q().w();
            q5b q5bVar = Q().v().t;
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new cu(this, i3);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new nj(this, i4);
                cVarH.p(objV2);
            }
            fv.a(z, function1, (gu5) objV2, b5gVarW, q5bVar, cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new t5(this, i, i4);
        }
    }

    public final yvb Q() {
        return (yvb) this.h0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        es7 es7Var;
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            this.j0 = arguments != null ? arguments.getBoolean("KEY_IS_BUILD_SUGGESTION") : false;
            yvb yvbVarQ = Q();
            ((gme) yvbVarQ.d).setValue(svb.a(yvbVarQ.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, this.j0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -262145, 8388607));
            yvb yvbVarQ2 = Q();
            if (arguments != null) {
                String string = arguments.getString("patentMonth");
                es7Var = new es7(arguments.getString("patentTitle"), arguments.getString("patentNumber"), arguments.getString("patentUrl"), new rr7(string != null ? ds7.valueOf(string) : null, Integer.valueOf(arguments.getInt("patentYear"))), arguments.getString("patentDescription"));
            } else {
                es7Var = null;
            }
            yvbVarQ2.M(es7Var != null ? jsb.s(es7Var, "") : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) Q().e).setValue(b5g.a);
        }
        this.i0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-patent", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-add-patent", null, null, 12));
    }
}
