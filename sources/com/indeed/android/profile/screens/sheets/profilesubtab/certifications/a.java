package com.indeed.android.profile.screens.sheets.profilesubtab.certifications;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import defpackage.b5g;
import defpackage.boa;
import defpackage.dg3;
import defpackage.ds7;
import defpackage.f51;
import defpackage.frg;
import defpackage.fwc;
import defpackage.gme;
import defpackage.grg;
import defpackage.gu5;
import defpackage.hg6;
import defpackage.irg;
import defpackage.iwc;
import defpackage.j6g;
import defpackage.jrg;
import defpackage.jsb;
import defpackage.mj8;
import defpackage.n30;
import defpackage.os5;
import defpackage.p63;
import defpackage.ps7;
import defpackage.qr7;
import defpackage.qt8;
import defpackage.rr7;
import defpackage.rxb;
import defpackage.sr7;
import defpackage.svb;
import defpackage.w0g;
import defpackage.yvb;
import defpackage.zcd;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/profile/screens/sheets/profilesubtab/certifications/a;", "Lw0g;", "<init>", "()V", "a", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends w0g {
    public final zcd g0 = new zcd();
    public final frg h0;
    public final frg i0;
    public Function2<? super ps7, ? super qr7, j6g> j0;
    public boolean k0;

    /* JADX INFO: renamed from: com.indeed.android.profile.screens.sheets.profilesubtab.certifications.a$a, reason: collision with other inner class name */
    public static final class C0174a {
        public static void a(qr7 qr7Var, Bundle bundle) {
            ds7 ds7Var;
            Integer num;
            ds7 ds7Var2;
            Integer num2;
            String str = qr7Var.a;
            sr7 sr7Var = qr7Var.b;
            if (str != null) {
                bundle.putString("certificationName", str);
            }
            String str2 = qr7Var.c;
            if (str2 != null) {
                bundle.putString("description", str2);
            }
            if (sr7Var != null) {
                rr7 rr7Var = sr7Var.c;
                rr7 rr7Var2 = sr7Var.a;
                Boolean bool = sr7Var.b;
                int iIntValue = 0;
                bundle.putBoolean("isCurrent", bool != null ? bool.booleanValue() : false);
                String strName = null;
                if (rr7Var2 != null) {
                    if ((rr7Var2 != null ? rr7Var2.b : null) != null) {
                        bundle.putInt("fromYear", (rr7Var2 == null || (num2 = rr7Var2.b) == null) ? 0 : num2.intValue());
                    }
                    if ((rr7Var2 != null ? rr7Var2.a : null) != null) {
                        bundle.putString("fromMonth", (rr7Var2 == null || (ds7Var2 = rr7Var2.a) == null) ? null : ds7Var2.name());
                    }
                }
                if (rr7Var != null) {
                    if ((rr7Var != null ? rr7Var.b : null) != null) {
                        if (rr7Var != null && (num = rr7Var.b) != null) {
                            iIntValue = num.intValue();
                        }
                        bundle.putInt("toYear", iIntValue);
                    }
                    if ((rr7Var != null ? rr7Var.a : null) != null) {
                        if (rr7Var != null && (ds7Var = rr7Var.a) != null) {
                            strName = ds7Var.name();
                        }
                        bundle.putString("toMonth", strName);
                    }
                }
            }
        }

        public static qr7 b(Bundle bundle) {
            ds7 ds7VarValueOf;
            ds7 ds7VarValueOf2;
            String string = bundle != null ? bundle.getString("certificationName") : null;
            if (bundle == null || string == null) {
                return null;
            }
            String string2 = bundle.getString("fromMonth");
            String string3 = bundle.getString("toMonth");
            if (string2 != null) {
                try {
                    ds7VarValueOf = ds7.valueOf(string2);
                } catch (IllegalArgumentException unused) {
                    ds7VarValueOf = null;
                }
            } else {
                ds7VarValueOf = null;
            }
            if (string3 != null) {
                try {
                    ds7VarValueOf2 = ds7.valueOf(string3);
                } catch (IllegalArgumentException unused2) {
                    ds7VarValueOf2 = null;
                }
            } else {
                ds7VarValueOf2 = null;
            }
            String string4 = bundle.getString("description");
            boolean z = bundle.getBoolean("isCurrent");
            int i = bundle.getInt("fromYear");
            Integer numValueOf = Integer.valueOf(i);
            if (i == 0) {
                numValueOf = null;
            }
            rr7 rr7Var = new rr7(ds7VarValueOf, numValueOf);
            int i2 = bundle.getInt("toYear");
            return new qr7(string, new sr7(rr7Var, Boolean.valueOf(z), new rr7(ds7VarValueOf2, i2 != 0 ? Integer.valueOf(i2) : null)), string4);
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar) {
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

    public static final class d extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar) {
            super(0);
            this.$this_viewModels = aVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class e extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.$ownerProducer = dVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class f extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class g extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            if (gu5Var != null && (p63Var = (p63) gu5Var.invoke()) != null) {
                return p63Var;
            }
            jrg jrgVar = (jrg) this.$owner$delegate.getValue();
            hg6 hg6Var = jrgVar instanceof hg6 ? (hg6) jrgVar : null;
            return hg6Var != null ? hg6Var.getDefaultViewModelCreationExtras() : p63.a.b;
        }
    }

    public static final class h extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a aVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = aVar;
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            grg.c defaultViewModelProviderFactory;
            jrg jrgVar = (jrg) this.$owner$delegate.getValue();
            hg6 hg6Var = jrgVar instanceof hg6 ? (hg6) jrgVar : null;
            if (hg6Var != null && (defaultViewModelProviderFactory = hg6Var.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            grg.c defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            defaultViewModelProviderFactory2.getClass();
            return defaultViewModelProviderFactory2;
        }
    }

    public a() {
        Lazy lazyE = boa.E(qt8.c, new e(new d(this)));
        iwc iwcVar = fwc.a;
        this.h0 = os5.a(this, iwcVar.b(f51.class), new f(lazyE), new g(lazyE), new h(this, lazyE));
        this.i0 = os5.a(this, iwcVar.b(yvb.class), new b(this), new c(this), new n30(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    @Override // defpackage.w0g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(int r14, androidx.compose.runtime.b r15) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.profile.screens.sheets.profilesubtab.certifications.a.M(int, androidx.compose.runtime.b):void");
    }

    public final void Q() {
        close();
        R().G(false);
        R().D(null);
    }

    public final yvb R() {
        return (yvb) this.i0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws CertificationIdNotFoundException {
        String string;
        super.onCreate(bundle);
        ((gme) R().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            boolean z = arguments != null ? arguments.getBoolean("KEY_IS_BUILD_SUGGESTION") : false;
            this.k0 = z;
            if (z) {
                qr7 qr7VarB = C0174a.b(arguments);
                R().D(qr7VarB != null ? jsb.a(qr7VarB, "") : null);
            } else {
                if (arguments == null || (string = arguments.getString("id")) == null) {
                    throw new CertificationIdNotFoundException("No certification id provided");
                }
                yvb yvbVarR = R();
                ((gme) yvbVarR.d).setValue(svb.a(yvbVarR.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, string, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, Integer.MAX_VALUE, 8388607));
                qr7 qr7VarB2 = C0174a.b(arguments);
                if (qr7VarB2 != null) {
                    R().H(jsb.a(qr7VarB2, string));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) R().e).setValue(b5g.a);
        }
        this.j0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-edit-certification", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-edit-certification", null, null, 12));
    }
}
