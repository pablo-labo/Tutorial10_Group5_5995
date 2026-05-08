package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt7g;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t7g extends w0g {
    public boolean g0;
    public final zcd h0 = new zcd();
    public final frg i0 = os5.a(this, fwc.a.b(yvb.class), new a(this), new b(this), new dd(this, 20));
    public Function2<? super ps7, ? super or7, j6g> j0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t7g t7gVar) {
            super(0);
            this.$this_activityViewModels = t7gVar;
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
        public b(t7g t7gVar) {
            super(0);
            this.$this_activityViewModels = t7gVar;
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
        c cVarH = bVar.h(1815949500);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            boolean z = this.g0;
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            int i3 = 20;
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new cq0(this, i3);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new bt(this, i3);
                cVarH.p(objV2);
            }
            Function1 function1 = (Function1) objV2;
            String str = Q().v().Y;
            if (str == null) {
                str = "";
            }
            w7g.a(z, gu5Var, function1, str, Q().w(), cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new lr(this, i, 13);
        }
    }

    public final yvb Q() {
        return (yvb) this.i0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            this.g0 = arguments != null ? arguments.getBoolean("KEY_IS_BUILD_SUGGESTION") : false;
            yvb yvbVarQ = Q();
            ((gme) yvbVarQ.d).setValue(svb.a(yvbVarQ.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, this.g0, null, null, null, -1, 7864319));
            String string = (arguments == null || !arguments.containsKey("KEY_ADDITIONAL_INFORMATION")) ? null : arguments.getString("KEY_ADDITIONAL_INFORMATION");
            if (string != null) {
                yvb yvbVarQ2 = Q();
                ((gme) yvbVarQ2.d).setValue(svb.a(yvbVarQ2.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, string, false, null, null, null, -1, 8126463));
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
}
