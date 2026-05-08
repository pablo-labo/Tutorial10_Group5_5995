package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import defpackage.grg;
import defpackage.p63;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lre;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class re extends w0g {
    public final zcd g0 = new zcd();
    public final frg h0;
    public final frg i0;
    public Function2<? super ps7, ? super qr7, j6g> j0;
    public boolean k0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(re reVar) {
            super(0);
            this.$this_activityViewModels = reVar;
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
        public b(re reVar) {
            super(0);
            this.$this_activityViewModels = reVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class c extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(re reVar) {
            super(0);
            this.$this_viewModels = reVar;
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
        public g(re reVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = reVar;
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

    public re() {
        Lazy lazyE = boa.E(qt8.c, new d(new c(this)));
        iwc iwcVar = fwc.a;
        this.h0 = os5.a(this, iwcVar.b(f51.class), new e(lazyE), new f(lazyE), new g(this, lazyE));
        this.i0 = os5.a(this, iwcVar.b(yvb.class), new a(this), new b(this), new le(this, 0));
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(-279391674);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            boolean z = this.k0;
            List list = (List) ((gme) ((f51) this.h0.getValue()).Z).getValue();
            b5g b5gVarW = Q().w();
            hw9 hw9Var = new hw9((iy3) cVarH.M(um2.h));
            hz1 hz1Var = Q().v().I;
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new me(this, 0);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new ne(this, 0);
                cVarH.p(objV2);
            }
            Function1 function12 = (Function1) objV2;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new oe(this, i3);
                cVarH.p(objV3);
            }
            sf.a(z, list, function1, function12, (gu5) objV3, b5gVarW, hw9Var, hz1Var, cVarH, 2097152);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pe(this, i, i3);
        }
    }

    public final yvb Q() {
        return (yvb) this.i0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            yvb r0 = r8.Q()
            g4a r0 = r0.e
            gme r0 = (defpackage.gme) r0
            b5g r1 = defpackage.b5g.a
            r0.setValue(r1)
            android.os.Bundle r0 = r8.getArguments()
            if (r9 != 0) goto La1
            if (r0 == 0) goto L1f
            java.lang.String r9 = "KEY_IS_BUILD_SUGGESTION"
            boolean r9 = r0.getBoolean(r9)
            goto L20
        L1f:
            r9 = 0
        L20:
            r8.k0 = r9
            yvb r9 = r8.Q()
            boolean r1 = r8.k0
            r9.G(r1)
            yvb r8 = r8.Q()
            r9 = 0
            if (r0 != 0) goto L34
            r0 = r9
            goto L96
        L34:
            java.lang.String r1 = "fromMonth"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "toMonth"
            java.lang.String r2 = r0.getString(r2)
            if (r1 == 0) goto L47
            ds7 r1 = defpackage.ds7.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L47
            goto L48
        L47:
            r1 = r9
        L48:
            if (r2 == 0) goto L4f
            ds7 r2 = defpackage.ds7.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L4f
            goto L50
        L4f:
            r2 = r9
        L50:
            java.lang.String r3 = "certificationName"
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r4 = "description"
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r5 = "isCurrent"
            boolean r5 = r0.getBoolean(r5)
            java.lang.String r6 = "fromYear"
            int r6 = r0.getInt(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r6 == 0) goto L6f
            goto L70
        L6f:
            r7 = r9
        L70:
            rr7 r6 = new rr7
            r6.<init>(r1, r7)
            java.lang.String r1 = "toYear"
            int r0 = r0.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L82
            goto L83
        L82:
            r1 = r9
        L83:
            rr7 r0 = new rr7
            r0.<init>(r2, r1)
            sr7 r1 = new sr7
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r1.<init>(r6, r2, r0)
            qr7 r0 = new qr7
            r0.<init>(r3, r1, r4)
        L96:
            if (r0 == 0) goto L9e
            java.lang.String r9 = ""
            hz1 r9 = defpackage.jsb.a(r0, r9)
        L9e:
            r8.H(r9)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) Q().e).setValue(b5g.a);
        }
        this.j0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-certification", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-add-certification", null, null, 12));
    }
}
