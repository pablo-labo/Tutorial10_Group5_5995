package com.indeed.android.profile.screens.sheets.profilesubtab.militaryservice;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import defpackage.b5g;
import defpackage.boa;
import defpackage.bs7;
import defpackage.dg3;
import defpackage.ds7;
import defpackage.f51;
import defpackage.fk4;
import defpackage.frg;
import defpackage.fwc;
import defpackage.fy;
import defpackage.gme;
import defpackage.grg;
import defpackage.gu5;
import defpackage.hg6;
import defpackage.hw9;
import defpackage.ig3;
import defpackage.irg;
import defpackage.it9;
import defpackage.iwc;
import defpackage.iy3;
import defpackage.j6g;
import defpackage.j91;
import defpackage.jrg;
import defpackage.jsb;
import defpackage.lb;
import defpackage.mj8;
import defpackage.n30;
import defpackage.os5;
import defpackage.p63;
import defpackage.ps7;
import defpackage.q3;
import defpackage.qt8;
import defpackage.rj4;
import defpackage.rr7;
import defpackage.rxb;
import defpackage.sr7;
import defpackage.svb;
import defpackage.tv;
import defpackage.um2;
import defpackage.w0g;
import defpackage.yvb;
import defpackage.z92;
import defpackage.zcd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/profile/screens/sheets/profilesubtab/militaryservice/a;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends w0g {
    public Function2<? super ps7, ? super bs7, j6g> g0;
    public final ArrayList h0;
    public final zcd i0;
    public final frg j0;
    public final frg k0;

    /* JADX INFO: renamed from: com.indeed.android.profile.screens.sheets.profilesubtab.militaryservice.a$a, reason: collision with other inner class name */
    public static final class C0176a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0176a(a aVar) {
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

    public static final class c extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar) {
            super(0);
            this.$this_viewModels = aVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class d extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.$ownerProducer = cVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class e extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class f extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Lazy lazy) {
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

    public static final class g extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a aVar, Lazy lazy) {
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
        String[] iSOCountries = Locale.getISOCountries();
        iSOCountries.getClass();
        ArrayList arrayList = new ArrayList(iSOCountries.length);
        for (String str : iSOCountries) {
            arrayList.add(new Locale("", str));
        }
        this.h0 = arrayList;
        this.i0 = new zcd();
        Lazy lazyE = boa.E(qt8.c, new d(new c(this)));
        iwc iwcVar = fwc.a;
        this.j0 = os5.a(this, iwcVar.b(f51.class), new e(lazyE), new f(lazyE), new g(this, lazyE));
        this.k0 = os5.a(this, iwcVar.b(yvb.class), new C0176a(this), new b(this), new fy(this, 9));
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        int i2;
        androidx.compose.runtime.c cVarH = bVar.h(271577981);
        int i3 = 4;
        int i4 = 2;
        int i5 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i5 & 1, (i5 & 3) != 2)) {
            String str = R().v().j;
            svb svbVarV = R().v();
            frg frgVar = this.j0;
            List list = (List) ((gme) ((f51) frgVar.getValue()).V).getValue();
            List list2 = (List) ((gme) ((f51) frgVar.getValue()).e).getValue();
            b5g b5gVarW = R().w();
            hw9 hw9Var = new hw9((iy3) cVarH.M(um2.h));
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new j91(this, i3);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new lb(this, 5);
                cVarH.p(objV2);
            }
            Function2 function2 = (Function2) objV2;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new q3(this, 4);
                cVarH.p(objV3);
            }
            Function1 function12 = (Function1) objV3;
            boolean zX4 = cVarH.x(this);
            Object objV4 = cVarH.v();
            if (zX4 || objV4 == c0020a) {
                objV4 = new n30(this, i4);
                cVarH.p(objV4);
            }
            gu5 gu5Var = (gu5) objV4;
            boolean zX5 = cVarH.x(this);
            Object objV5 = cVarH.v();
            if (zX5 || objV5 == c0020a) {
                objV5 = new tv(this, 6);
                cVarH.p(objV5);
            }
            i2 = 0;
            fk4.a(this.h0, str, svbVarV, list2, list, function1, function2, function12, gu5Var, (Function1) objV5, b5gVarW, hw9Var, cVarH, 0);
        } else {
            i2 = 0;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rj4(this, i, i2);
        }
    }

    public final void Q(ps7 ps7Var, bs7 bs7Var) {
        Function2<? super ps7, ? super bs7, j6g> function2 = this.g0;
        this.g0 = null;
        if (function2 != null) {
            if (ps7Var == ps7.b) {
                function2.invoke(ps7Var, bs7Var);
            } else {
                function2.invoke(ps7Var, null);
            }
        }
        close();
    }

    public final yvb R() {
        return (yvb) this.k0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws MilitaryServiceIdNotFoundException {
        sr7 sr7Var;
        int i;
        int i2;
        int i3;
        super.onCreate(bundle);
        ((gme) R().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            if (arguments == null || !arguments.containsKey("KEY_MILITARY_SERVICE_ID")) {
                throw new MilitaryServiceIdNotFoundException("No military service id provided");
            }
            String string = arguments.getString("KEY_MILITARY_SERVICE_ID");
            if (string == null) {
                throw new MilitaryServiceIdNotFoundException("No military service id provided");
            }
            yvb yvbVarR = R();
            ((gme) yvbVarR.d).setValue(svb.a(yvbVarR.v(), null, null, false, null, null, null, null, null, false, string, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -513, 8388607));
            String string2 = !arguments.containsKey("KEY_COUNTRY_OF_SERVICE") ? null : arguments.getString("KEY_COUNTRY_OF_SERVICE");
            int i4 = 0;
            if (string2 != null) {
                yvb yvbVarR2 = R();
                Iterator<it9> it = yvbVarR2.v().k.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (it.next().a.equals(string)) {
                            i3 = i5;
                            break;
                        }
                        i5++;
                    }
                }
                if (i3 != -1) {
                    ArrayList arrayListB1 = z92.B1(yvbVarR2.v().k);
                    arrayListB1.set(i3, it9.a((it9) arrayListB1.get(i3), string2, null, null, null, null, 125));
                    ((gme) yvbVarR2.d).setValue(svb.a(yvbVarR2.v(), null, null, false, null, null, null, null, null, false, null, arrayListB1, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1025, 8388607));
                }
            }
            String string3 = !arguments.containsKey("KEY_BRANCH") ? null : arguments.getString("KEY_BRANCH");
            if (string3 != null) {
                yvb yvbVarR3 = R();
                Iterator<it9> it2 = yvbVarR3.v().k.iterator();
                int i6 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (it2.next().a.equals(string)) {
                            i2 = i6;
                            break;
                        }
                        i6++;
                    }
                }
                if (i2 != -1) {
                    ArrayList arrayListB12 = z92.B1(yvbVarR3.v().k);
                    arrayListB12.set(i2, it9.a((it9) arrayListB12.get(i2), null, string3, null, null, null, 123));
                    ((gme) yvbVarR3.d).setValue(svb.a(yvbVarR3.v(), null, null, false, null, null, null, null, null, false, null, arrayListB12, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1025, 8388607));
                }
            }
            String string4 = !arguments.containsKey("KEY_RANK") ? null : arguments.getString("KEY_RANK");
            if (string4 != null) {
                yvb yvbVarR4 = R();
                Iterator<it9> it3 = yvbVarR4.v().k.iterator();
                int i7 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i = -1;
                        break;
                    } else {
                        if (it3.next().a.equals(string)) {
                            i = i7;
                            break;
                        }
                        i7++;
                    }
                }
                if (i != -1) {
                    ArrayList arrayListB13 = z92.B1(yvbVarR4.v().k);
                    arrayListB13.set(i, it9.a((it9) arrayListB13.get(i), null, null, string4, null, null, 119));
                    ((gme) yvbVarR4.d).setValue(svb.a(yvbVarR4.v(), null, null, false, null, null, null, null, null, false, null, arrayListB13, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1025, 8388607));
                }
            }
            if (arguments.containsKey("KEY_FROM_YEAR")) {
                int i8 = arguments.getInt("KEY_FROM_YEAR", -1);
                String string5 = arguments.getString("KEY_FROM_MONTH_NAME");
                rr7 rr7Var = new rr7(string5 != null ? ds7.valueOf(string5) : null, Integer.valueOf(i8));
                int i9 = arguments.getInt("KEY_TO_YEAR");
                String string6 = arguments.getString("KEY_TO_MONTH_NAME");
                sr7Var = new sr7(rr7Var, Boolean.valueOf(arguments.getBoolean("KEY_IS_CURRENT")), new rr7(string6 != null ? ds7.valueOf(string6) : null, Integer.valueOf(i9)));
            } else {
                sr7Var = null;
            }
            if (sr7Var != null) {
                yvb yvbVarR5 = R();
                ig3 ig3VarB = jsb.b(sr7Var);
                Iterator<it9> it4 = yvbVarR5.v().k.iterator();
                int i10 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i10 = -1;
                        break;
                    } else if (it4.next().a.equals(string)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    ArrayList arrayListB14 = z92.B1(yvbVarR5.v().k);
                    arrayListB14.set(i10, it9.a((it9) arrayListB14.get(i10), null, null, null, null, new it9.a("JobSeekerProfileDateRange", ig3VarB), 63));
                    ((gme) yvbVarR5.d).setValue(svb.a(yvbVarR5.v(), null, null, false, null, null, null, null, null, false, null, arrayListB14, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1025, 8388607));
                }
            }
            String string7 = arguments.containsKey("KEY_DESCRIPTION") ? arguments.getString("KEY_DESCRIPTION") : null;
            if (string7 != null) {
                yvb yvbVarR6 = R();
                Iterator<it9> it5 = yvbVarR6.v().k.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (it5.next().a.equals(string)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    return;
                }
                ArrayList arrayListB15 = z92.B1(yvbVarR6.v().k);
                arrayListB15.set(i4, it9.a((it9) arrayListB15.get(i4), null, null, null, string7, null, 111));
                ((gme) yvbVarR6.d).setValue(svb.a(yvbVarR6.v(), null, null, false, null, null, null, null, null, false, null, arrayListB15, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1025, 8388607));
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
        dg3.i(dg3.b(rxb.a, "profile-tab-edit-military-experience", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-edit-military-experience", null, null, 12));
    }
}
