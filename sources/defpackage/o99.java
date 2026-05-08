package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo99;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o99 extends w0g {
    public final zcd g0 = new zcd();
    public final t41 h0 = new t41(jz0.a());
    public final frg i0 = os5.a(this, fwc.a.b(yvb.class), new a(this), new b(this), new oq(this, 14));

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o99 o99Var) {
            super(0);
            this.$this_activityViewModels = o99Var;
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
        public b(o99 o99Var) {
            super(0);
            this.$this_activityViewModels = o99Var;
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
        c cVarH = bVar.h(964893421);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            List<wj8> list = Q().v().N;
            b5g b5gVarW = Q().w();
            hw9 hw9Var = new hw9((iy3) cVarH.M(um2.h));
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new k1(this, 11);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            int i3 = 13;
            if (zX2 || objV2 == c0020a) {
                objV2 = new na0(this, i3);
                cVarH.p(objV2);
            }
            Function1 function12 = (Function1) objV2;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new qr(this, 12);
                cVarH.p(objV3);
            }
            gu5 gu5Var = (gu5) objV3;
            boolean zX4 = cVarH.x(this);
            Object objV4 = cVarH.v();
            if (zX4 || objV4 == c0020a) {
                objV4 = new ne(this, 10);
                cVarH.p(objV4);
            }
            Function1 function13 = (Function1) objV4;
            boolean zX5 = cVarH.x(this);
            Object objV5 = cVarH.v();
            if (zX5 || objV5 == c0020a) {
                objV5 = new yh(this, 9);
                cVarH.p(objV5);
            }
            Function1 function14 = (Function1) objV5;
            boolean zX6 = cVarH.x(this);
            Object objV6 = cVarH.v();
            if (zX6 || objV6 == c0020a) {
                objV6 = new zh(this, i3);
                cVarH.p(objV6);
            }
            gu5 gu5Var2 = (gu5) objV6;
            boolean zX7 = cVarH.x(this);
            Object objV7 = cVarH.v();
            if (zX7 || objV7 == c0020a) {
                objV7 = new vx0(this, 7);
                cVarH.p(objV7);
            }
            Function1 function15 = (Function1) objV7;
            boolean zX8 = cVarH.x(this);
            Object objV8 = cVarH.v();
            if (zX8 || objV8 == c0020a) {
                objV8 = new nv(this, 12);
                cVarH.p(objV8);
            }
            aa9.a(list, this.h0, function1, function12, gu5Var, function13, function14, gu5Var2, b5gVarW, hw9Var, function15, (gu5) objV8, cVarH, 1073741824);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ey(this, i, 6);
        }
    }

    @Override // defpackage.w0g
    public final void O() {
        Q().k();
    }

    public final yvb Q() {
        return (yvb) this.i0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) Q().e).setValue(b5g.a);
        }
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-manage-language", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-manage-language", null, null, 12));
    }
}
