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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnr;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class nr extends w0g {
    public boolean g0;
    public Function2<? super ps7, ? super zr7, j6g> h0;
    public final zcd i0 = new zcd();
    public final frg j0 = os5.a(this, fwc.a.b(yvb.class), new a(this), new b(this), new oa(this, 2));

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nr nrVar) {
            super(0);
            this.$this_activityViewModels = nrVar;
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
        public b(nr nrVar) {
            super(0);
            this.$this_activityViewModels = nrVar;
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
        c cVarH = bVar.h(1720191718);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            boolean z = this.g0;
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new hr(this, i3);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new ji(this, 1);
                cVarH.p(objV2);
            }
            Function1 function1 = (Function1) objV2;
            String str = Q().v().a0.b;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new ir(this, i3);
                cVarH.p(objV3);
            }
            Function1 function12 = (Function1) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = new jr(0);
                cVarH.p(objV4);
            }
            gu5 gu5Var2 = (gu5) objV4;
            b5g b5gVarW = Q().w();
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = new kr(0);
                cVarH.p(objV5);
            }
            jfg.a(z, gu5Var, function1, str, function12, gu5Var2, false, b5gVarW, (gu5) objV5, cVarH, 102432768);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new lr(this, i, i3);
        }
    }

    public final yvb Q() {
        return (yvb) this.j0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            boolean z = (arguments == null || !arguments.containsKey("KEY_IS_BUILD_SUGGESTION")) ? false : arguments.getBoolean("KEY_IS_BUILD_SUGGESTION");
            this.g0 = z;
            if (z) {
                String string = (arguments == null || !arguments.containsKey("KEY_URL")) ? null : arguments.getString("KEY_URL");
                if (string != null) {
                    yvb yvbVarQ = Q();
                    ((gme) yvbVarQ.d).setValue(svb.a(yvbVarQ.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, new ux8(yvbVarQ.v().a0.a, string), null, null, -1, 7340031));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) Q().e).setValue(b5g.a);
        }
        this.h0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-link", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-add-link", null, null, 12));
    }
}
