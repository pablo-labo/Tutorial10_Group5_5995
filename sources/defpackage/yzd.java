package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import defpackage.xh8;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lyzd;", "Ll1g;", "Lxh8;", "<init>", "()V", "", "conversationId", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class yzd extends l1g implements xh8 {
    public final Lazy V;
    public final boolean a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public static final /* synthetic */ class a extends qv5 implements gu5<Boolean> {
        @Override // defpackage.gu5
        public final Boolean invoke() {
            return Boolean.valueOf(w7.c(((yzd) this.receiver).requireActivity(), "android.permission.CAMERA"));
        }
    }

    public static final /* synthetic */ class b extends qv5 implements Function1<h4a<dnf>, j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(h4a<dnf> h4aVar) {
            h4aVar.getClass();
            yzd yzdVar = (yzd) this.receiver;
            yzdVar.getClass();
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", yzdVar.requireContext().getPackageName(), null));
            yzdVar.startActivity(intent);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements gu5<androidx.fragment.app.g> {
        final /* synthetic */ Fragment $this_activityViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(yzd yzdVar) {
            super(0);
            this.$this_activityViewModel = yzdVar;
        }

        @Override // defpackage.gu5
        public final androidx.fragment.app.g invoke() {
            androidx.fragment.app.g gVarRequireActivity = this.$this_activityViewModel.requireActivity();
            gVarRequireActivity.getClass();
            return gVarRequireActivity;
        }
    }

    public static final class d extends mj8 implements gu5<u67> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(yzd yzdVar, c cVar) {
            super(0);
            this.$this_activityViewModel = yzdVar;
            this.$ownerProducer = cVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, u67] */
        @Override // defpackage.gu5
        public final u67 invoke() {
            p63 defaultViewModelCreationExtras;
            Fragment fragment = this.$this_activityViewModel;
            a9c a9cVar = this.$qualifier;
            gu5 gu5Var = this.$ownerProducer;
            gu5 gu5Var2 = this.$extrasProducer;
            gu5 gu5Var3 = this.$parameters;
            irg viewModelStore = ((jrg) gu5Var.invoke()).getViewModelStore();
            if (gu5Var2 == null || (defaultViewModelCreationExtras = (p63) gu5Var2.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return p66.a(fwc.a.b(u67.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public static final class e extends mj8 implements gu5<androidx.fragment.app.g> {
        final /* synthetic */ Fragment $this_activityViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(yzd yzdVar) {
            super(0);
            this.$this_activityViewModel = yzdVar;
        }

        @Override // defpackage.gu5
        public final androidx.fragment.app.g invoke() {
            androidx.fragment.app.g gVarRequireActivity = this.$this_activityViewModel.requireActivity();
            gVarRequireActivity.getClass();
            return gVarRequireActivity;
        }
    }

    public static final class f extends mj8 implements gu5<kta> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(yzd yzdVar, e eVar) {
            super(0);
            this.$this_activityViewModel = yzdVar;
            this.$ownerProducer = eVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, kta] */
        @Override // defpackage.gu5
        public final kta invoke() {
            p63 defaultViewModelCreationExtras;
            Fragment fragment = this.$this_activityViewModel;
            a9c a9cVar = this.$qualifier;
            gu5 gu5Var = this.$ownerProducer;
            gu5 gu5Var2 = this.$extrasProducer;
            gu5 gu5Var3 = this.$parameters;
            irg viewModelStore = ((jrg) gu5Var.invoke()).getViewModelStore();
            if (gu5Var2 == null || (defaultViewModelCreationExtras = (p63) gu5Var2.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return p66.a(fwc.a.b(kta.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public static final class g extends mj8 implements gu5<androidx.fragment.app.g> {
        final /* synthetic */ Fragment $this_activityViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(yzd yzdVar) {
            super(0);
            this.$this_activityViewModel = yzdVar;
        }

        @Override // defpackage.gu5
        public final androidx.fragment.app.g invoke() {
            androidx.fragment.app.g gVarRequireActivity = this.$this_activityViewModel.requireActivity();
            gVarRequireActivity.getClass();
            return gVarRequireActivity;
        }
    }

    public static final class h extends mj8 implements gu5<fnf> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(yzd yzdVar, g gVar) {
            super(0);
            this.$this_activityViewModel = yzdVar;
            this.$ownerProducer = gVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, fnf] */
        @Override // defpackage.gu5
        public final fnf invoke() {
            p63 defaultViewModelCreationExtras;
            Fragment fragment = this.$this_activityViewModel;
            a9c a9cVar = this.$qualifier;
            gu5 gu5Var = this.$ownerProducer;
            gu5 gu5Var2 = this.$extrasProducer;
            gu5 gu5Var3 = this.$parameters;
            irg viewModelStore = ((jrg) gu5Var.invoke()).getViewModelStore();
            if (gu5Var2 == null || (defaultViewModelCreationExtras = (p63) gu5Var2.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return p66.a(fwc.a.b(fnf.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public static final class i extends mj8 implements gu5<tid> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(yzd yzdVar) {
            super(0);
            this.$this_inject = yzdVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, tid] */
        @Override // defpackage.gu5
        public final tid invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(tid.class), a9cVar);
        }
    }

    public static final class j extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(yzd yzdVar) {
            super(0);
            this.$this_viewModel = yzdVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModel;
        }
    }

    public static final class k extends mj8 implements gu5<y1e> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(yzd yzdVar, j jVar) {
            super(0);
            this.$this_viewModel = yzdVar;
            this.$ownerProducer = jVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, y1e] */
        @Override // defpackage.gu5
        public final y1e invoke() {
            p63 defaultViewModelCreationExtras;
            Fragment fragment = this.$this_viewModel;
            a9c a9cVar = this.$qualifier;
            gu5 gu5Var = this.$ownerProducer;
            gu5 gu5Var2 = this.$extrasProducer;
            gu5 gu5Var3 = this.$parameters;
            irg viewModelStore = ((jrg) gu5Var.invoke()).getViewModelStore();
            if (gu5Var2 == null || (defaultViewModelCreationExtras = (p63) gu5Var2.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return p66.a(fwc.a.b(y1e.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public static final class l extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(yzd yzdVar) {
            super(0);
            this.$this_viewModel = yzdVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModel;
        }
    }

    public static final class m extends mj8 implements gu5<i3d> {
        final /* synthetic */ gu5 $ownerProducer;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(yzd yzdVar, l lVar) {
            super(0);
            this.$this_viewModel = yzdVar;
            this.$ownerProducer = lVar;
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [brg, i3d] */
        @Override // defpackage.gu5
        public final i3d invoke() {
            p63 defaultViewModelCreationExtras;
            Fragment fragment = this.$this_viewModel;
            a9c a9cVar = this.$qualifier;
            gu5 gu5Var = this.$ownerProducer;
            gu5 gu5Var2 = this.$extrasProducer;
            gu5 gu5Var3 = this.$parameters;
            irg viewModelStore = ((jrg) gu5Var.invoke()).getViewModelStore();
            if (gu5Var2 == null || (defaultViewModelCreationExtras = (p63) gu5Var2.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return p66.a(fwc.a.b(i3d.class), viewModelStore, defaultViewModelCreationExtras, a9cVar, pnb.B(fragment), gu5Var3);
        }
    }

    public yzd() {
        this.a = ((kr7) cr8.p(kr7.class)).e("droid_native_messaging_sse").a > 0;
        this.b = boa.E(qt8.a, new i(this));
        d dVar = new d(this, new c(this));
        qt8 qt8Var = qt8.c;
        this.c = boa.E(qt8Var, dVar);
        this.d = boa.E(qt8Var, new k(this, new j(this)));
        this.e = boa.E(qt8Var, new m(this, new l(this)));
        this.f = boa.E(qt8Var, new f(this, new e(this)));
        this.V = boa.E(qt8Var, new h(this, new g(this)));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        zv8 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        u63.Y(hh1.A(viewLifecycleOwner), null, null, new xzd(this, null), 3);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setContent(new ah2(1858180151, new ey(this, 9), true));
        return composeView;
    }

    @Override // defpackage.l1g
    public final boolean tryHandleBackNavigation() {
        return false;
    }
}
