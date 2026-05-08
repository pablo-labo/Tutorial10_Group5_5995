package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import defpackage.cd4;
import defpackage.grg;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf98;", "Lp91;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f98 extends p91 {
    public static final /* synthetic */ int k0 = 0;
    public final frg j0 = os5.a(this, fwc.a.b(jq6.class), new b(this), new c(this), new d(this));

    @uh3(c = "com.indeed.android.jobsearch.bottomnav.tabs.jpmypage.JpMyPageTabWebViewFragment$TopNavContent$1$1$1", f = "JpMyPageTabWebViewFragment.kt", l = {}, m = "invokeSuspend")
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
        public b(f98 f98Var) {
            super(0);
            this.$this_activityViewModels = f98Var;
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
        public c(f98 f98Var) {
            super(0);
            this.$this_activityViewModels = f98Var;
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
        public d(f98 f98Var) {
            super(0);
            this.$this_activityViewModels = f98Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    @Override // defpackage.p91
    public final void L(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(-920675824);
        int i2 = i & 1;
        if (cVarH.o(i2, i2 != 0)) {
            ma0 ma0VarA = g3f.a(cVarH);
            ne4 ne4Var = p97.a;
            dd4 dd4Var = dd4.a;
            ad4 ad4Var = dd4.n().a;
            ad4Var.getClass();
            ad4Var.e(cd4.a.D0);
            cd4.i3.a.getClass();
            rm2.a(ne4Var.a(h07.a), bh2.c(-977556144, new ct(ma0VarA, 5), cVarH), cVarH, 56);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ed(this, i, 4);
        }
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: N */
    public final String getQ0() {
        zo6 zo6Var = zo6.a;
        zo6Var.getClass();
        return zo6Var.c(xj1.a0);
    }

    @Override // defpackage.p91
    /* JADX INFO: renamed from: O */
    public final xj1 getR0() {
        return xj1.a0;
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
        if (((jq6) this.j0.getValue()).h() == xj1.a0) {
            this.Y.h("JP_MYPAGE");
            if (Z()) {
                ArrayList arrayList = lz2.a;
                lz2.d("JpMyPageTabWebViewFragment", "handleBackNavigation() -> back in WebView", false, null);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.p91
    public final void a0() {
    }
}
