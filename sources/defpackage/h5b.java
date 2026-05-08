package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import defpackage.grg;
import defpackage.kpg;
import defpackage.p63;
import defpackage.s87;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lh5b;", "Lyw9;", "<init>", "()V", "a", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h5b extends yw9 {
    public final frg n0;
    public final Lazy o0;
    public final tx5 p0;
    public final frg q0;
    public final Lazy r0;
    public final Lazy s0;
    public final Lazy t0;
    public final z8<Intent> u0;
    public final z8<Intent> v0;
    public final Lazy w0;
    public final d2f x0;
    public ModalWebview y0;
    public Function1<? super mq7, j6g> z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("SIGN_IN", 0);
            a = aVar;
            a aVar2 = new a("CANCEL", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h5b h5bVar) {
            super(0);
            this.$this_activityViewModels = h5bVar;
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
        public c(h5b h5bVar) {
            super(0);
            this.$this_activityViewModels = h5bVar;
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
        public d(h5b h5bVar) {
            super(0);
            this.$this_activityViewModels = h5bVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class e extends mj8 implements gu5<gz4> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h5b h5bVar) {
            super(0);
            this.$this_inject = h5bVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class f extends mj8 implements gu5<nl0> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(h5b h5bVar) {
            super(0);
            this.$this_inject = h5bVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, nl0] */
        @Override // defpackage.gu5
        public final nl0 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(nl0.class), a9cVar);
        }
    }

    public static final class g extends mj8 implements gu5<ua6> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(h5b h5bVar) {
            super(0);
            this.$this_inject = h5bVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ua6] */
        @Override // defpackage.gu5
        public final ua6 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(ua6.class), a9cVar);
        }
    }

    public static final class h extends mj8 implements gu5<xa6> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(h5b h5bVar) {
            super(0);
            this.$this_inject = h5bVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xa6] */
        @Override // defpackage.gu5
        public final xa6 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(xa6.class), a9cVar);
        }
    }

    public static final class i extends mj8 implements gu5<cya> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h5b h5bVar) {
            super(0);
            this.$this_inject = h5bVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [cya, java.lang.Object] */
        @Override // defpackage.gu5
        public final cya invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(cya.class), a9cVar);
        }
    }

    public static final class j extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(h5b h5bVar) {
            super(0);
            this.$this_viewModels = h5bVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class k extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.$ownerProducer = jVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class l extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
        }
    }

    public static final class m extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Lazy lazy) {
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

    public static final class n extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(h5b h5bVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = h5bVar;
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

    public h5b() {
        Lazy lazyE = boa.E(qt8.c, new k(new j(this)));
        iwc iwcVar = fwc.a;
        this.n0 = os5.a(this, iwcVar.b(k5b.class), new l(lazyE), new m(lazyE), new n(this, lazyE));
        e eVar = new e(this);
        qt8 qt8Var = qt8.a;
        this.o0 = boa.E(qt8Var, eVar);
        this.p0 = new tx5();
        this.q0 = os5.a(this, iwcVar.b(jq6.class), new b(this), new c(this), new d(this));
        this.r0 = boa.E(qt8Var, new f(this));
        this.s0 = boa.E(qt8Var, new g(this));
        this.t0 = boa.E(qt8Var, new h(this));
        z8<Intent> z8VarRegisterForActivityResult = registerForActivityResult(new w8(), new x65(this));
        z8VarRegisterForActivityResult.getClass();
        this.u0 = z8VarRegisterForActivityResult;
        z8<Intent> z8VarRegisterForActivityResult2 = registerForActivityResult(new w8(), new k20(14));
        z8VarRegisterForActivityResult2.getClass();
        this.v0 = z8VarRegisterForActivityResult2;
        this.w0 = boa.E(qt8Var, new i(this));
        this.x0 = new d2f(new oe(this, 14));
    }

    @Override // defpackage.yw9
    public final ModalWebview N() {
        ModalWebview modalWebview = this.y0;
        if (modalWebview != null) {
            return modalWebview;
        }
        wl7.g("webview");
        throw null;
    }

    public final void O(a aVar) {
        if (M().isFinishing()) {
            return;
        }
        try {
            Lazy<s87> lazy = s87.f;
            s87.a.a((gz4) this.o0.getValue(), tx5.k(this.p0, "PassportSignInWebViewFragment", "cancel", null, 12));
            ArrayList arrayList = lz2.a;
            lz2.d("PassportSignInWebViewFragment", "Dismissing Passport Sign In modal", false, null);
            E();
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                ((cya) this.w0.getValue()).a();
                Function1<? super mq7, j6g> function1 = this.z0;
                if (function1 != null) {
                    function1.invoke(mq7.b);
                    return;
                }
                return;
            }
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            Function1<? super mq7, j6g> function12 = this.z0;
            if (function12 != null) {
                function12.invoke(mq7.a);
            }
        } catch (Exception e2) {
            ArrayList arrayList2 = lz2.a;
            o6.l("Error while exiting PassportSignInFlow: ", e2, "PassportSignInWebViewFragment", false, e2);
        }
    }

    public final k5b P() {
        return (k5b) this.n0.getValue();
    }

    public final void Q() {
        xa6.b((xa6) this.t0.getValue(), new nj(this, 17), false, new se(this, 10), new oj(this, 14), 18);
    }

    public final void R(String str) {
        String str2 = String.format("token=%s&preExtRedirectUrl=%s", Arrays.copyOf(new Object[]{Uri.encode(str), Uri.encode(N().getUrl())}, 2));
        ModalWebview modalWebviewN = N();
        String string = getString(R.string.indeed_passport_google_auth_endpoint);
        byte[] bytes = str2.getBytes(a32.b);
        bytes.getClass();
        modalWebviewN.postUrl(string, bytes);
        ((gme) P().e).setValue(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(6, "PassportSignInWebViewFragment", null, null));
        int i2 = 8;
        int i3 = 16;
        List listA0 = u63.a0(new j84(new mc(i2), new tb(i2), new vm1(i3)), new c5b(new wm1(this, 12)), new esc(new cj(this, i2)), new eb6(new bt(this, 14)));
        ArrayList arrayList = this.j0;
        w92.w0(arrayList, listA0);
        Lazy lazy = axg.a;
        ModalWebview modalWebview = (ModalWebview) axg.a((String) this.x0.getValue(), arrayList, this.v0, new oq(this, i3), new nf(20), new dc(17), new hs(12), nxg.PassportSignIn, ((jq6) this.q0.getValue()).d0, new pl0(10), null, null, null, null, 30752).d();
        modalWebview.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.y0 = modalWebview;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setViewCompositionStrategy(kpg.a.a);
        composeView.setContent(new ah2(-1679012178, new w91(this, 7), true));
        return composeView;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        exg.a.b(N(), "indeed-passport-signin-webview", bundle);
    }

    @Override // defpackage.yw9, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle arguments;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            exg.a.a(N(), "indeed-passport-signin-webview", bundle);
        }
        KeyEvent.Callback callbackI = I();
        if (callbackI instanceof hqa) {
            dqa dqaVarR = ((hqa) callbackI).r();
            j5b j5bVar = new j5b(this);
            dqaVarR.getClass();
            dqaVarR.b(j5bVar);
        }
        if (bundle == null && (arguments = getArguments()) != null && arguments.getBoolean("passport_is_continue_with_google")) {
            dd4 dd4Var = dd4.a;
            if (dd4.b()) {
                Q();
            } else {
                ((ua6) this.s0.getValue()).c(false, new cu(this, 10));
            }
        }
    }
}
