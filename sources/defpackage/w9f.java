package defpackage;

import com.indeed.android.jobsearch.R;
import defpackage.saa;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.debug.TareTopNavBarDebugScreenKt$TareTopNavBarDebugScreen$1$1", f = "TareTopNavBarDebugScreen.kt", l = {}, m = "invokeSuspend")
public final class w9f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onBackClick;
    final /* synthetic */ g4a<Boolean> $showBackButton$delegate;
    final /* synthetic */ g4a<Boolean> $showBadges$delegate;
    final /* synthetic */ g4a<Boolean> $showCustomButton$delegate;
    final /* synthetic */ g4a<Boolean> $showLogoButton$delegate;
    final /* synthetic */ g4a<Boolean> $showProfileButton$delegate;
    final /* synthetic */ g4a<Boolean> $showSearchButton$delegate;
    final /* synthetic */ g4a<Boolean> $showSignInButton$delegate;
    final /* synthetic */ o97 $theme;
    final /* synthetic */ g4a<String> $titleText$delegate;
    final /* synthetic */ g4a<Boolean> $toggleColor$delegate;
    final /* synthetic */ g4a<Boolean> $useCenteredAlignment$delegate;
    final /* synthetic */ d4g $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9f(d4g d4gVar, o97 o97Var, gu5<j6g> gu5Var, g4a<Boolean> g4aVar, g4a<Boolean> g4aVar2, g4a<Boolean> g4aVar3, g4a<Boolean> g4aVar4, g4a<Boolean> g4aVar5, g4a<Boolean> g4aVar6, g4a<Boolean> g4aVar7, g4a<String> g4aVar8, g4a<Boolean> g4aVar9, g4a<Boolean> g4aVar10, lu2<? super w9f> lu2Var) {
        super(2, lu2Var);
        this.$viewModel = d4gVar;
        this.$theme = o97Var;
        this.$onBackClick = gu5Var;
        this.$showBackButton$delegate = g4aVar;
        this.$showLogoButton$delegate = g4aVar2;
        this.$showSignInButton$delegate = g4aVar3;
        this.$showCustomButton$delegate = g4aVar4;
        this.$showBadges$delegate = g4aVar5;
        this.$showSearchButton$delegate = g4aVar6;
        this.$showProfileButton$delegate = g4aVar7;
        this.$titleText$delegate = g4aVar8;
        this.$useCenteredAlignment$delegate = g4aVar9;
        this.$toggleColor$delegate = g4aVar10;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new w9f(this.$viewModel, this.$theme, this.$onBackClick, this.$showBackButton$delegate, this.$showLogoButton$delegate, this.$showSignInButton$delegate, this.$showCustomButton$delegate, this.$showBadges$delegate, this.$showSearchButton$delegate, this.$showProfileButton$delegate, this.$titleText$delegate, this.$useCenteredAlignment$delegate, this.$toggleColor$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((w9f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        gu5<j6g> gu5Var = this.$onBackClick;
        g4a<Boolean> g4aVar = this.$showBackButton$delegate;
        g4a<Boolean> g4aVar2 = this.$showLogoButton$delegate;
        g4a<Boolean> g4aVar3 = this.$showSignInButton$delegate;
        g4a<Boolean> g4aVar4 = this.$showCustomButton$delegate;
        g4a<Boolean> g4aVar5 = this.$showBadges$delegate;
        iy8 iy8VarS = u63.s();
        if (g4aVar.getValue().booleanValue()) {
            iy8VarS.add(new raa(saa.a.a, (String) null, (String) null, (Integer) null, gu5Var, 30));
        }
        if (g4aVar2.getValue().booleanValue()) {
            iy8VarS.add(new raa(saa.f.a, (String) null, (String) null, (Integer) null, (gu5) null, 62));
        }
        if (g4aVar3.getValue().booleanValue()) {
            iy8VarS.add(new raa(saa.j.a, (String) null, (String) null, (Integer) null, new bo0(22), 30));
        }
        if (x9f.c(g4aVar4)) {
            iy8VarS.add(new raa(new saa.d(R.drawable.ic_idl_placeholder_24), (String) null, "Custom", x9f.d(g4aVar5) ? new Integer(5) : null, new vm1(19), 18));
        }
        iy8 iy8VarL = iy8VarS.l();
        g4a<Boolean> g4aVar6 = this.$showSearchButton$delegate;
        g4a<Boolean> g4aVar7 = this.$showProfileButton$delegate;
        g4a<Boolean> g4aVar8 = this.$showCustomButton$delegate;
        g4a<Boolean> g4aVar9 = this.$showBadges$delegate;
        iy8 iy8VarS2 = u63.s();
        if (g4aVar6.getValue().booleanValue()) {
            iy8VarS2.add(new raa(saa.i.a, (String) null, (String) null, (Integer) null, new pd1(19), 30));
        }
        if (g4aVar7.getValue().booleanValue()) {
            iy8VarS2.add(new raa(saa.g.a, (String) null, (String) null, (Integer) null, new jr(22), 30));
        }
        if (x9f.c(g4aVar8)) {
            iy8VarS2.add(new raa(new saa.d(R.drawable.ic_idl_placeholder_24), (String) null, "Custom", x9f.d(g4aVar9) ? new Integer(5) : null, new kr(19), 18));
        }
        iy8 iy8VarL2 = iy8VarS2.l();
        d4g d4gVar = this.$viewModel;
        iy8 iy8Var = !iy8VarL.isEmpty() ? iy8VarL : null;
        iy8 iy8Var2 = !iy8VarL2.isEmpty() ? iy8VarL2 : null;
        sof sofVar = new sof(this.$titleText$delegate.getValue(), x9f.e(this.$useCenteredAlignment$delegate) ? vmf.b : vmf.a, x9f.e(this.$useCenteredAlignment$delegate) ? null : new Integer(R.drawable.ic_idl_placeholder_24), null, 24);
        boolean zBooleanValue = this.$toggleColor$delegate.getValue().booleanValue();
        o97 o97Var = this.$theme;
        d4gVar.k(new c4g(sofVar, iy8Var, iy8Var2, new da2(zBooleanValue ? o97Var.c.b.a : o97Var.c.b.f.b), false));
        return j6g.a;
    }
}
