package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.indeed.android.jobsearch.R;
import defpackage.grg;
import defpackage.kpg;
import defpackage.p63;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ldbc;", "Ll1g;", "Lk3g;", "<init>", "()V", "Lc4g;", "uiState", "rnace_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class dbc extends l1g implements k3g {
    public kt1 a;
    public final frg b;

    public static final class a extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dbc dbcVar) {
            super(0);
            this.$this_viewModels = dbcVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class b extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.$ownerProducer = aVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class c extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class d extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Lazy lazy) {
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

    public static final class e extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(dbc dbcVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = dbcVar;
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

    public dbc() {
        Lazy lazyE = boa.E(qt8.c, new b(new a(this)));
        this.b = os5.a(this, fwc.a.b(d4g.class), new c(lazyE), new d(lazyE), new e(this, lazyE));
    }

    @Override // defpackage.k3g
    public final void a(da2 da2Var) {
        ((d4g) this.b.getValue()).g(da2Var);
    }

    @Override // defpackage.k3g
    public final void m(List<raa> list) {
        ((d4g) this.b.getValue()).h(list);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.ace_resume_creation_fragment, viewGroup, false);
        int i = R.id.ace_resume_creation_rn_container;
        FrameLayout frameLayout = (FrameLayout) esg.a(viewInflate, R.id.ace_resume_creation_rn_container);
        if (frameLayout != null) {
            i = R.id.ace_resume_creation_tare_top_nav_bar;
            ComposeView composeView = (ComposeView) esg.a(viewInflate, R.id.ace_resume_creation_tare_top_nav_bar);
            if (composeView != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                this.a = new kt1(linearLayout, frameLayout, composeView);
                linearLayout.getClass();
                return linearLayout;
            }
        }
        ja.k("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.a = null;
    }

    @Override // defpackage.l1g, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        boolean zC = ((h2g) cr8.p(h2g.class)).c();
        kt1 kt1Var = this.a;
        if (zC) {
            kt1Var.getClass();
            ComposeView composeView = (ComposeView) kt1Var.b;
            composeView.setVisibility(0);
            composeView.setViewCompositionStrategy(kpg.a.a);
            composeView.setContent(new ah2(-259750784, new pj(this, 12), true));
        } else {
            kt1Var.getClass();
            ((ComposeView) kt1Var.b).setVisibility(8);
        }
        Bundle arguments = getArguments();
        Bundle bundle2 = arguments != null ? arguments.getBundle("ace_resume_creation_props") : null;
        ija ijaVar = new ija();
        Bundle bundle3 = new Bundle();
        bundle3.putString("arg_component_name", "AceResumeCreation");
        bundle3.putBundle("arg_launch_options", bundle2);
        bundle3.putBoolean("arg_fabric_enabled", false);
        ijaVar.setArguments(bundle3);
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
        aVar.d(R.id.ace_resume_creation_rn_container, ijaVar, null, 1);
        aVar.h(false);
    }

    @Override // defpackage.l1g
    public final boolean tryHandleBackNavigation() {
        return false;
    }

    @Override // defpackage.k3g
    public final void v(List<raa> list) {
        ((d4g) this.b.getValue()).j(list);
    }

    @Override // defpackage.k3g
    public final void z(sof sofVar) {
        ((d4g) this.b.getValue()).i(sofVar);
    }
}
