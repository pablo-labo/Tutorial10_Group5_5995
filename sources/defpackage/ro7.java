package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.JobSearchApplication;
import defpackage.cd4;
import defpackage.grg;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro7;", "Lp91;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ro7 extends p91 {
    public static final /* synthetic */ int n0 = 0;
    public final frg j0;
    public final String k0;
    public final xj1 l0;
    public final frg m0;

    @uh3(c = "com.indeed.android.jobsearch.bottomnav.tabs.jpmessages.JPMessagesTabWebViewFragment$TopNavContent$1$1$1", f = "JPMessagesTabWebViewFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ f3f $systemUiController;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f3f f3fVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$systemUiController = f3fVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$systemUiController, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$systemUiController.b();
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ro7 ro7Var) {
            super(0);
            this.$this_activityViewModels = ro7Var;
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
        public c(ro7 ro7Var) {
            super(0);
            this.$this_activityViewModels = ro7Var;
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
        public d(ro7 ro7Var) {
            super(0);
            this.$this_activityViewModels = ro7Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class e extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ro7 ro7Var) {
            super(0);
            this.$this_activityViewModels = ro7Var;
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
        public f(ro7 ro7Var) {
            super(0);
            this.$this_activityViewModels = ro7Var;
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
        public g(ro7 ro7Var) {
            super(0);
            this.$this_activityViewModels = ro7Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public ro7() {
        iwc iwcVar = fwc.a;
        this.j0 = os5.a(this, iwcVar.b(jq6.class), new b(this), new c(this), new d(this));
        zo6 zo6Var = zo6.a;
        zo6Var.getClass();
        xj1 xj1Var = xj1.b0;
        this.k0 = zo6Var.c(xj1Var);
        this.l0 = xj1Var;
        this.m0 = os5.a(this, iwcVar.b(c6f.class), new e(this), new f(this), new g(this));
    }

    @Override // defpackage.p91
    public final void L(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(-797436609);
        int i2 = i & 1;
        if (cVarH.o(i2, i2 != 0)) {
            ma0 ma0VarA = g3f.a(cVarH);
            ne4 ne4Var = p97.a;
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            ad4Var.e(cd4.a.D0);
            cd4.i3.a.getClass();
            rm2.a(ne4Var.a(h07.a), bh2.c(940095615, new v02(ma0VarA, 3), cVarH), cVarH, 56);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new mh(this, i, 4);
        }
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: N, reason: from getter */
    public final String getQ0() {
        return this.k0;
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: O, reason: from getter */
    public final xj1 getQ0() {
        return this.l0;
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
        if (((jq6) this.j0.getValue()).h() == xj1.b0) {
            this.Y.h("JP_MESSAGES");
            if (Z()) {
                ArrayList arrayList = lz2.a;
                lz2.d("JPMessagesTabWebViewFragment", "handleBackNavigation() -> back in WebView", false, null);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.p91
    public final void a0() {
    }

    @Override // defpackage.p91, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        JobSearchApplication jobSearchApplication = JobSearchApplication.X;
        ((c6f) this.m0.getValue()).l(this.l0).a.e(getViewLifecycleOwner(), new so7(new ji(this, 5)));
    }
}
