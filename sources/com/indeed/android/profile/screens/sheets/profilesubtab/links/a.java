package com.indeed.android.profile.screens.sheets.profilesubtab.links;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import defpackage.b5g;
import defpackage.dg3;
import defpackage.fk0;
import defpackage.frg;
import defpackage.fwc;
import defpackage.gme;
import defpackage.gu5;
import defpackage.irg;
import defpackage.j6g;
import defpackage.jfg;
import defpackage.jz0;
import defpackage.me;
import defpackage.mj8;
import defpackage.na0;
import defpackage.nj;
import defpackage.oe;
import defpackage.os5;
import defpackage.p63;
import defpackage.pe;
import defpackage.ps7;
import defpackage.rxb;
import defpackage.svb;
import defpackage.t41;
import defpackage.ux8;
import defpackage.w0g;
import defpackage.xh;
import defpackage.yvb;
import defpackage.zcd;
import defpackage.zr7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/profile/screens/sheets/profilesubtab/links/a;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends w0g {
    public Function2<? super ps7, ? super zr7, j6g> g0;
    public final zcd h0 = new zcd();
    public final frg i0;

    /* JADX INFO: renamed from: com.indeed.android.profile.screens.sheets.profilesubtab.links.a$a, reason: collision with other inner class name */
    public static final class C0175a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0175a(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
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
        public b(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public a() {
        new t41(jz0.a());
        this.i0 = os5.a(this, fwc.a.b(yvb.class), new C0175a(this), new b(this), new nj(this, 10));
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        c cVarH = bVar.h(-1974728728);
        int i2 = 4;
        int i3 = (cVarH.x(this) ? 4 : 2) | i;
        int i4 = 1;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new fk0(this, 6);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            int i5 = 7;
            if (zX2 || objV2 == c0020a) {
                objV2 = new na0(this, i5);
                cVarH.p(objV2);
            }
            Function1 function1 = (Function1) objV2;
            String str = R().v().a0.b;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new me(this, 7);
                cVarH.p(objV3);
            }
            Function1 function12 = (Function1) objV3;
            boolean zX4 = cVarH.x(this);
            Object objV4 = cVarH.v();
            if (zX4 || objV4 == c0020a) {
                objV4 = new xh(this, i2);
                cVarH.p(objV4);
            }
            gu5 gu5Var2 = (gu5) objV4;
            b5g b5gVarW = R().w();
            boolean zX5 = cVarH.x(this);
            Object objV5 = cVarH.v();
            if (zX5 || objV5 == c0020a) {
                objV5 = new oe(this, 5);
                cVarH.p(objV5);
            }
            jfg.a(false, gu5Var, function1, str, function12, gu5Var2, true, b5gVarW, (gu5) objV5, cVarH, 1572870);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pe(this, i, i4);
        }
    }

    public final void Q(ps7 ps7Var, zr7 zr7Var) {
        Function2<? super ps7, ? super zr7, j6g> function2 = this.g0;
        this.g0 = null;
        if (function2 != null) {
            if (ps7Var == ps7.b) {
                function2.invoke(ps7Var, zr7Var);
            } else {
                function2.invoke(ps7Var, null);
            }
        }
        close();
    }

    public final yvb R() {
        return (yvb) this.i0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws LinkIdNotFoundException {
        super.onCreate(bundle);
        ((gme) R().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            if (arguments == null || !arguments.containsKey("KEY_LINK_ID")) {
                throw new LinkIdNotFoundException("No link id provided");
            }
            String string = arguments.getString("KEY_LINK_ID");
            if (string == null) {
                throw new LinkIdNotFoundException("No link id provided");
            }
            String string2 = !arguments.containsKey("KEY_URL") ? null : arguments.getString("KEY_URL");
            if (string2 != null) {
                R().R(string2, string);
                return;
            }
            yvb yvbVarR = R();
            ux8 ux8Var = yvbVarR.v().b0.get(string);
            if (ux8Var != null) {
                ((gme) yvbVarR.d).setValue(svb.a(yvbVarR.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, new ux8(string, ux8Var.b), null, null, -1, 7340031));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) R().e).setValue(b5g.a);
        }
        this.g0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-edit-link", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-edit-link", null, null, 12));
    }
}
