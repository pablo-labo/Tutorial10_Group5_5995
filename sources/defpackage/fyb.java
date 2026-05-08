package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import defpackage.cd4;
import defpackage.grg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfyb;", "Lp91;", "<init>", "()V", "a", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fyb extends p91 {
    public static final /* synthetic */ int n0 = 0;
    public final frg j0;
    public final frg k0;
    public final frg l0;
    public final xj1 m0;

    public static final class a {
        public static fyb a(IanInitialState ianInitialState) {
            fyb fybVar = new fyb();
            Bundle bundle = new Bundle();
            if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) == xj1.e) {
                bundle.putString("KEY_INITIAL_URL", ianInitialState.getInitialUrl());
            }
            fybVar.setArguments(bundle);
            return fybVar;
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fyb fybVar) {
            super(0);
            this.$this_activityViewModels = fybVar;
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
        public c(fyb fybVar) {
            super(0);
            this.$this_activityViewModels = fybVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class d extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(fyb fybVar) {
            super(0);
            this.$this_activityViewModels = fybVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class e extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(fyb fybVar) {
            super(0);
            this.$this_activityViewModels = fybVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(fyb fybVar) {
            super(0);
            this.$this_activityViewModels = fybVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class g extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(fyb fybVar) {
            super(0);
            this.$this_activityViewModels = fybVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class h extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(fyb fybVar) {
            super(0);
            this.$this_activityViewModels = fybVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class i extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(fyb fybVar) {
            super(0);
            this.$this_activityViewModels = fybVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class j extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(fyb fybVar) {
            super(0);
            this.$this_activityViewModels = fybVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public fyb() {
        iwc iwcVar = fwc.a;
        this.j0 = os5.a(this, iwcVar.b(jq6.class), new b(this), new c(this), new d(this));
        this.k0 = os5.a(this, iwcVar.b(ff6.class), new e(this), new f(this), new g(this));
        this.l0 = os5.a(this, iwcVar.b(eyb.class), new h(this), new i(this), new j(this));
        this.m0 = xj1.e;
    }

    @Override // defpackage.p91
    public final void L(int i2, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(-106789414);
        int i3 = (cVarH.x(this) ? 4 : 2) | i2;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            ne4 ne4Var = p97.a;
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            ad4Var.e(cd4.a.D0);
            cd4.i3.a.getClass();
            rm2.a(ne4Var.a(h07.a), bh2.c(-1267647846, new v02(this, 5), cVarH), cVarH, 56);
        } else {
            cVarH.D();
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new mh(this, i2, 8);
        }
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: N */
    public final String getQ0() {
        zo6 zo6Var = zo6.a;
        zo6Var.getClass();
        return zo6Var.c(xj1.e);
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: O, reason: from getter */
    public final xj1 getQ0() {
        return this.m0;
    }

    @Override // defpackage.p91
    public final String P() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("KEY_INITIAL_URL");
        }
        return null;
    }

    @Override // defpackage.p91
    public final boolean Y() {
        if (((jq6) this.j0.getValue()).h() == xj1.e) {
            this.Y.h("PROFILE");
            frg frgVar = this.k0;
            if (((ff6) frgVar.getValue()).j()) {
                ArrayList arrayList = lz2.a;
                lz2.d("ProfileTabWebViewFragment", "handleBackNavigation() -> closing hamburger menu", false, null);
                ((gme) ((ff6) frgVar.getValue()).Y).setValue(Boolean.FALSE);
                List listA0 = u63.a0(M().l, M().c, M().d, M().m, M().f, M().e);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listA0) {
                    ((ViewGroup) obj).getId();
                    arrayList2.add(obj);
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((ViewGroup) it.next()).setImportantForAccessibility(1);
                }
                return true;
            }
            if (Z()) {
                ArrayList arrayList3 = lz2.a;
                lz2.d("ProfileTabWebViewFragment", "handleBackNavigation() -> back in WebView", false, null);
                return true;
            }
            frg frgVar2 = this.l0;
            if (((eyb) frgVar2.getValue()).g()) {
                ArrayList arrayList4 = lz2.a;
                lz2.d("ProfileTabWebViewFragment", "handleBackNavigation() -> SYSTEM_BACK_RESET, resetting tab to home state", false, null);
                ((eyb) frgVar2.getValue()).h(false);
                W(gq6.SYSTEM_BACK_RESET);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.p91
    public final void a0() {
        boolean zG = G().g();
        frg frgVar = this.l0;
        if (zG || G().e()) {
            ((eyb) frgVar.getValue()).h(false);
        } else {
            ((eyb) frgVar.getValue()).h(true);
        }
    }

    @Override // defpackage.p91, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        JobSearchApplication jobSearchApplication = JobSearchApplication.X;
    }
}
