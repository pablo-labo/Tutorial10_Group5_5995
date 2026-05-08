package defpackage;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.b;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import defpackage.grg;
import defpackage.p63;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lec1;", "Lv81;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ec1 extends v81 {
    public static final /* synthetic */ int s0 = 0;
    public final ArrayList j0 = new ArrayList();
    public final frg k0;
    public final Lazy l0;
    public ModalWebview m0;
    public String n0;
    public LaunchActivity o0;
    public com.google.android.material.bottomsheet.b p0;
    public final z8<Intent> q0;
    public String r0;

    public static final class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(View view, float f) {
            int i = ec1.s0;
            twg twgVarQ = ec1.this.Q();
            twgVarQ.h(swg.a(twgVarQ.g(), null, false, null, Math.abs(1.0f - f), false, 23));
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view, int i) {
        }
    }

    public static final class b extends mj8 implements gu5<nl0> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ec1 ec1Var) {
            super(0);
            this.$this_inject = ec1Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, nl0] */
        @Override // defpackage.gu5
        public final nl0 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(nl0.class), a9cVar);
        }
    }

    public static final class c extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ec1 ec1Var) {
            super(0);
            this.$this_viewModels = ec1Var;
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
        public g(ec1 ec1Var, Lazy lazy) {
            super(0);
            this.$this_viewModels = ec1Var;
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

    public ec1() {
        Lazy lazyE = boa.E(qt8.c, new d(new c(this)));
        this.k0 = os5.a(this, fwc.a.b(twg.class), new e(lazyE), new f(lazyE), new g(this, lazyE));
        this.l0 = boa.E(qt8.a, new b(this));
        z8<Intent> z8VarRegisterForActivityResult = registerForActivityResult(new w8(), new q6(3));
        z8VarRegisterForActivityResult.getClass();
        this.q0 = z8VarRegisterForActivityResult;
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.oj0, androidx.fragment.app.f
    public final Dialog H(Bundle bundle) {
        com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) super.H(bundle);
        this.p0 = bVar;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorH = bVar.h();
        bottomSheetBehaviorH.getClass();
        bottomSheetBehaviorH.s(new a());
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("MODAL_SHEET_FULLSCREEN")) {
            com.google.android.material.bottomsheet.b bVar2 = this.p0;
            if (bVar2 == null) {
                wl7.g("bottomSheetDialog");
                throw null;
            }
            bVar2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: bc1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ec1 ec1Var = this.a;
                    b bVar3 = ec1Var.p0;
                    if (bVar3 == null) {
                        wl7.g("bottomSheetDialog");
                        throw null;
                    }
                    bVar3.h().H(3);
                    b bVar4 = ec1Var.p0;
                    if (bVar4 != null) {
                        bVar4.h().F = false;
                    } else {
                        wl7.g("bottomSheetDialog");
                        throw null;
                    }
                }
            });
        }
        com.google.android.material.bottomsheet.b bVar3 = this.p0;
        if (bVar3 != null) {
            return bVar3;
        }
        wl7.g("bottomSheetDialog");
        throw null;
    }

    @Override // defpackage.t81
    @SuppressLint({"ComposableNaming"})
    public final void O(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.b bVar2;
        bVar.L(502736862);
        if (getArguments() == null) {
            bVar.L(483018815);
            bVar.F();
            bVar2 = bVar;
        } else {
            bVar.L(483018816);
            boolean zX = bVar.x(this);
            Object objV = bVar.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new fy(this, 2);
                bVar.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = bVar.x(this);
            Object objV2 = bVar.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new i30(this, 3);
                bVar.p(objV2);
            }
            gu5 gu5Var2 = (gu5) objV2;
            boolean zX3 = bVar.x(this);
            Object objV3 = bVar.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new a1(this, 5);
                bVar.p(objV3);
            }
            gu5 gu5Var3 = (gu5) objV3;
            boolean zX4 = bVar.x(this);
            Object objV4 = bVar.v();
            int i2 = 1;
            if (zX4 || objV4 == c0020a) {
                objV4 = new fk0(this, i2);
                bVar.p(objV4);
            }
            gu5 gu5Var4 = (gu5) objV4;
            twg twgVarQ = Q();
            boolean z = Q().g().e;
            boolean zX5 = bVar.x(this);
            Object objV5 = bVar.v();
            if (zX5 || objV5 == c0020a) {
                objV5 = new le(this, i2);
                bVar.p(objV5);
            }
            bVar2 = bVar;
            qw9.a(gu5Var, gu5Var2, gu5Var3, gu5Var4, twgVarQ, z, (gu5) objV5, bVar2, 0);
            bVar2.F();
        }
        bVar2.F();
    }

    public abstract String P();

    public final twg Q() {
        return (twg) this.k0.getValue();
    }

    @Override // defpackage.v81, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        view.getClass();
        super.onViewCreated(view, bundle);
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(6, P(), null, null));
        androidx.fragment.app.g gVarRequireActivity = requireActivity();
        gVarRequireActivity.getClass();
        this.o0 = (LaunchActivity) gVarRequireActivity;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("MODAL_SHEET_URL")) == null) {
            l5.q("Missing modalSheetUrl argument");
            return;
        }
        this.n0 = string;
        twg twgVarQ = Q();
        Bundle arguments2 = getArguments();
        twgVarQ.h(swg.a(twgVarQ.g(), arguments2 != null ? arguments2.getString("MODAL_SHEET_TITLE") : null, false, null, 0.0f, false, 30));
        nxg nxgVar = nxg.ModalView;
        int i = 3;
        int i2 = 1;
        List listA0 = u63.a0(new p0b(nxgVar, null), new esc(new ne(this, i)));
        ArrayList arrayList = this.j0;
        w92.w0(arrayList, listA0);
        Lazy lazy = axg.a;
        String str = this.n0;
        if (str == null) {
            wl7.g("modalSheetUrl");
            throw null;
        }
        this.m0 = (ModalWebview) axg.a(str, arrayList, this.q0, new oe(this, i), new cu(this, i2), new vx0(this, i2), new se(this, 5), nxgVar, null, null, null, null, null, null, 32288).d();
        Bundle arguments3 = getArguments();
        if (arguments3 == null || arguments3.getBoolean("MODAL_SHEET_FULLSCREEN")) {
            return;
        }
        ModalWebview modalWebview = this.m0;
        if (modalWebview != null) {
            modalWebview.getViewTreeObserver().addOnScrollChangedListener(new cc1(this, 0));
        } else {
            wl7.g("webview");
            throw null;
        }
    }
}
