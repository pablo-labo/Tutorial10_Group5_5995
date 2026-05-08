package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import defpackage.grg;
import defpackage.kpg;
import defpackage.p63;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lw02;", "Ls2d;", "Lxh8;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w02 extends s2d implements xh8 {
    public final frg c;
    public final Lazy d;
    public final Lazy e;
    public final a f;

    public static final class a extends wpa {
        public a() {
            super(true);
        }

        @Override // defpackage.wpa
        public final void b() {
            androidx.fragment.app.g activity = w02.this.getActivity();
            if (activity != null) {
                lr5 lr5VarU = activity.u();
                lr5VarU.getClass();
                web.D(lr5VarU, "ChangeCountrySelectorFragment");
            }
        }
    }

    public static final class b extends mj8 implements gu5<x02> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w02 w02Var) {
            super(0);
            this.$this_inject = w02Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, x02] */
        @Override // defpackage.gu5
        public final x02 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(x02.class), a9cVar);
        }
    }

    public static final class c extends mj8 implements gu5<gz4> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w02 w02Var) {
            super(0);
            this.$this_inject = w02Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class d extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w02 w02Var) {
            super(0);
            this.$this_viewModels = w02Var;
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
        public h(w02 w02Var, Lazy lazy) {
            super(0);
            this.$this_viewModels = w02Var;
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

    public w02() {
        Lazy lazyE = boa.E(qt8.c, new e(new d(this)));
        this.c = os5.a(this, fwc.a.b(h12.class), new f(lazyE), new g(lazyE), new h(this, lazyE));
        b bVar = new b(this);
        qt8 qt8Var = qt8.a;
        this.d = boa.E(qt8Var, bVar);
        this.e = boa.E(qt8Var, new c(this));
        this.f = new a();
    }

    public final h12 G() {
        return (h12) this.c.getValue();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // defpackage.an0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.g gVarRequireActivity = requireActivity();
        gVarRequireActivity.getClass();
        try {
            hh8.a = Integer.valueOf(gVarRequireActivity.getWindow().getAttributes().softInputMode);
            gVarRequireActivity.getWindow().setSoftInputMode(32);
        } catch (Exception e2) {
            ArrayList arrayList = lz2.a;
            lz2.b("KeyboardUtils", "safelyAdjustSoftInputMode error", false, e2);
        }
        ((x02) this.d.getValue()).getClass();
        q6.n("native-change-country", null, null, 6, (tp7) cr8.p(tp7.class));
        h12 h12VarG = G();
        bu8 bu8Var = bu8.a;
        String strE = bu8Var.e();
        if (strE == null) {
            strE = Locale.getDefault().getCountry();
        }
        String str = strE;
        str.getClass();
        String strF = bu8Var.f();
        if (strF == null) {
            strF = Locale.getDefault().getLanguage();
        }
        String str2 = strF;
        str2.getClass();
        h12VarG.k(i12.a(h12VarG.g(), null, str, str2, null, null, null, null, false, 249));
        h12VarG.k(i12.a(h12VarG.g(), null, null, null, str, null, null, null, false, 247));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setViewCompositionStrategy(kpg.a.a);
        composeView.setContent(new ah2(-1399336159, new w91(this, 1), true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        androidx.fragment.app.g gVarRequireActivity = requireActivity();
        gVarRequireActivity.getClass();
        try {
            Integer num = hh8.a;
            if (num != null) {
                gVarRequireActivity.getWindow().setSoftInputMode(num.intValue());
            }
        } catch (Exception e2) {
            ArrayList arrayList = lz2.a;
            lz2.b("KeyboardUtils", "safelyResetSoftInputMode error", false, e2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        dqa dqaVarR;
        view.getClass();
        super.onViewCreated(view, bundle);
        androidx.fragment.app.g activity = getActivity();
        if (activity == null || (dqaVarR = activity.r()) == null) {
            return;
        }
        zv8 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dqaVarR.a(viewLifecycleOwner, this.f);
    }
}
