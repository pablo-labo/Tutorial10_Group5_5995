package com.indeed.android.profile.screens.sheets.profilesubtab.award;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import defpackage.ah4;
import defpackage.b5g;
import defpackage.dg3;
import defpackage.ds7;
import defpackage.frg;
import defpackage.fwc;
import defpackage.fy;
import defpackage.gme;
import defpackage.gu5;
import defpackage.irg;
import defpackage.j6g;
import defpackage.j91;
import defpackage.jsb;
import defpackage.lb;
import defpackage.lz2;
import defpackage.m61;
import defpackage.mj8;
import defpackage.nv;
import defpackage.os5;
import defpackage.p63;
import defpackage.pr7;
import defpackage.ps7;
import defpackage.q2;
import defpackage.rr7;
import defpackage.rxb;
import defpackage.svb;
import defpackage.tg3;
import defpackage.w0g;
import defpackage.w40;
import defpackage.wl7;
import defpackage.yvb;
import defpackage.z92;
import defpackage.zcd;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/profile/screens/sheets/profilesubtab/award/a;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends w0g {
    public final zcd g0 = new zcd();
    public final frg h0 = os5.a(this, fwc.a.b(yvb.class), new C0173a(this), new b(this), new nv(this, 7));
    public Function2<? super ps7, ? super pr7, j6g> i0;

    /* JADX INFO: renamed from: com.indeed.android.profile.screens.sheets.profilesubtab.award.a$a, reason: collision with other inner class name */
    public static final class C0173a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0173a(a aVar) {
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

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        c cVarH = bVar.h(1376110322);
        int i2 = 4;
        int i3 = 2;
        int i4 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i4 & 1, (i4 & 3) != 2)) {
            String str = R().v().u;
            svb svbVarV = R().v();
            b5g b5gVarW = R().w();
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new q2(this, 7);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new fy(this, 8);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new j91(this, i3);
                cVarH.p(objV3);
            }
            ah4.a(str, svbVarV, function1, gu5Var, (Function1) objV3, b5gVarW, cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new lb(this, i, i2);
        }
    }

    public final void Q(ps7 ps7Var, pr7 pr7Var) {
        Function2<? super ps7, ? super pr7, j6g> function2 = this.i0;
        this.i0 = null;
        if (function2 != null) {
            if (ps7Var == ps7.b) {
                function2.invoke(ps7Var, pr7Var);
            } else {
                function2.invoke(ps7Var, null);
            }
        }
        close();
    }

    public final yvb R() {
        return (yvb) this.h0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws AwardIdNotFoundException {
        rr7 rr7Var;
        super.onCreate(bundle);
        ((gme) R().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            if (arguments == null || !arguments.containsKey("KEY_AWARD_ID")) {
                throw new AwardIdNotFoundException("No award id provided");
            }
            String string = arguments.getString("KEY_AWARD_ID");
            if (string == null) {
                throw new AwardIdNotFoundException("No award id provided");
            }
            yvb yvbVarR = R();
            ((gme) yvbVarR.d).setValue(svb.a(yvbVarR.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, string, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1048577, 8388607));
            String string2 = !arguments.containsKey("KEY_TITLE") ? null : arguments.getString("KEY_TITLE");
            if (string2 != null) {
                yvb yvbVarR2 = R();
                Iterator<m61> it = yvbVarR2.v().v.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (wl7.b(it.next().a, string)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    ArrayList arrayListB1 = z92.B1(yvbVarR2.v().v);
                    arrayListB1.set(i, m61.a((m61) arrayListB1.get(i), null, null, string2, 7));
                    ((gme) yvbVarR2.d).setValue(svb.a(yvbVarR2.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, arrayListB1, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -2097153, 8388607));
                }
            }
            String string3 = !arguments.containsKey("KEY_DESCRIPTION") ? null : arguments.getString("KEY_DESCRIPTION");
            if (string3 != null) {
                yvb yvbVarR3 = R();
                Iterator<m61> it2 = yvbVarR3.v().v.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (wl7.b(it2.next().a, string)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    ArrayList arrayListB12 = z92.B1(yvbVarR3.v().v);
                    arrayListB12.set(i2, m61.a((m61) arrayListB12.get(i2), null, string3, null, 11));
                    ((gme) yvbVarR3.d).setValue(svb.a(yvbVarR3.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, arrayListB12, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -2097153, 8388607));
                }
            }
            if (arguments.containsKey("KEY_YEAR")) {
                int i3 = arguments.getInt("KEY_YEAR", -1);
                String string4 = arguments.getString("KEY_MONTH_NAME");
                rr7Var = new rr7(string4 != null ? ds7.valueOf(string4) : null, Integer.valueOf(i3));
            } else {
                rr7Var = null;
            }
            if (rr7Var != null) {
                yvb yvbVarR4 = R();
                ds7 ds7Var = rr7Var.a;
                tg3 tg3Var = new tg3(null, ds7Var != null ? jsb.c(ds7Var) : null, rr7Var.b);
                Iterator<m61> it3 = yvbVarR4.v().v.iterator();
                int i4 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (wl7.b(it3.next().a, string)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    ArrayList arrayList = lz2.a;
                    w40.n("setAwardDateToEdit: award item not found", "ProfileSectionsViewModel", "setAwardDateToEdit: award item not found", false);
                } else {
                    ArrayList arrayListB13 = z92.B1(yvbVarR4.v().v);
                    arrayListB13.set(i4, m61.a((m61) arrayListB13.get(i4), tg3Var, null, null, 13));
                    ((gme) yvbVarR4.d).setValue(svb.a(yvbVarR4.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, arrayListB13, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -2097153, 8388607));
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
        this.i0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-edit-award", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-edit-award", null, null, 12));
    }
}
