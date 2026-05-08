package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import defpackage.grg;
import defpackage.ig3;
import defpackage.p63;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsr;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class sr extends w0g {
    public boolean g0;
    public Function2<? super ps7, ? super bs7, j6g> h0;
    public final ArrayList i0;
    public final zcd j0;
    public final frg k0;
    public final frg l0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sr srVar) {
            super(0);
            this.$this_activityViewModels = srVar;
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
        public b(sr srVar) {
            super(0);
            this.$this_activityViewModels = srVar;
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
        public c(sr srVar) {
            super(0);
            this.$this_viewModels = srVar;
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
        public g(sr srVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = srVar;
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

    public sr() {
        String[] iSOCountries = Locale.getISOCountries();
        iSOCountries.getClass();
        ArrayList arrayList = new ArrayList(iSOCountries.length);
        for (String str : iSOCountries) {
            arrayList.add(new Locale("", str));
        }
        this.i0 = arrayList;
        this.j0 = new zcd();
        Lazy lazyE = boa.E(qt8.c, new d(new c(this)));
        iwc iwcVar = fwc.a;
        this.k0 = os5.a(this, iwcVar.b(f51.class), new e(lazyE), new f(lazyE), new g(this, lazyE));
        this.l0 = os5.a(this, iwcVar.b(yvb.class), new a(this), new b(this), new qr(this, 0));
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        int i2;
        androidx.compose.runtime.c cVarH = bVar.h(133847959);
        int i3 = 2;
        int i4 = (cVarH.x(this) ? 4 : 2) | i;
        int i5 = 0;
        int i6 = 1;
        if (cVarH.o(i4 & 1, (i4 & 3) != 2)) {
            boolean z = this.g0;
            mt9 mt9Var = Q().v().l;
            frg frgVar = this.k0;
            List list = (List) ((gme) ((f51) frgVar.getValue()).V).getValue();
            List list2 = (List) ((gme) ((f51) frgVar.getValue()).e).getValue();
            b5g b5gVarW = Q().w();
            hw9 hw9Var = new hw9((iy3) cVarH.M(um2.h));
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new or(this, i5);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new rq(this, i6);
                cVarH.p(objV2);
            }
            Function2 function2 = (Function2) objV2;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new a1(this, i6);
                cVarH.p(objV3);
            }
            gu5 gu5Var = (gu5) objV3;
            boolean zX4 = cVarH.x(this);
            Object objV4 = cVarH.v();
            if (zX4 || objV4 == c0020a) {
                objV4 = new k1(this, i3);
                cVarH.p(objV4);
            }
            i2 = 0;
            at.a(z, mt9Var, this.i0, list2, list, function1, function2, gu5Var, (Function1) objV4, b5gVarW, hw9Var, cVarH, 0);
        } else {
            i2 = 0;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pr(this, i, i2);
        }
    }

    public final yvb Q() {
        return (yvb) this.l0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        sr7 sr7Var;
        ig3.a aVar;
        rr7 rr7Var;
        rr7 rr7Var2;
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            boolean z = (arguments == null || !arguments.containsKey("KEY_IS_BUILD_SUGGESTION")) ? false : arguments.getBoolean("KEY_IS_BUILD_SUGGESTION");
            this.g0 = z;
            if (z) {
                ig3.b bVar = null;
                bVar = null;
                String string = (arguments == null || !arguments.containsKey("KEY_COUNTRY_OF_SERVICE")) ? null : arguments.getString("KEY_COUNTRY_OF_SERVICE");
                String string2 = (arguments == null || !arguments.containsKey("KEY_BRANCH")) ? null : arguments.getString("KEY_BRANCH");
                String string3 = (arguments == null || !arguments.containsKey("KEY_RANK")) ? null : arguments.getString("KEY_RANK");
                if (arguments == null || !arguments.containsKey("KEY_FROM_YEAR")) {
                    sr7Var = null;
                } else {
                    int i = arguments.getInt("KEY_FROM_YEAR", -1);
                    String string4 = arguments.getString("KEY_FROM_MONTH_NAME");
                    rr7 rr7Var3 = new rr7(string4 != null ? ds7.valueOf(string4) : null, Integer.valueOf(i));
                    int i2 = arguments.getInt("KEY_TO_YEAR");
                    String string5 = arguments.getString("KEY_TO_MONTH_NAME");
                    sr7Var = new sr7(rr7Var3, Boolean.valueOf(arguments.getBoolean("KEY_IS_CURRENT")), new rr7(string5 != null ? ds7.valueOf(string5) : null, Integer.valueOf(i2)));
                }
                String string6 = (arguments == null || !arguments.containsKey("KEY_DESCRIPTION")) ? null : arguments.getString("KEY_DESCRIPTION");
                yvb yvbVarQ = Q();
                if (sr7Var == null || (rr7Var2 = sr7Var.a) == null) {
                    aVar = null;
                } else {
                    Integer num = rr7Var2.b;
                    ds7 ds7Var = rr7Var2.a;
                    aVar = new ig3.a(sr7Var.b, ds7Var != null ? jsb.c(ds7Var) : null, num);
                }
                Boolean bool = sr7Var != null ? sr7Var.b : null;
                if (sr7Var != null && (rr7Var = sr7Var.c) != null) {
                    Integer num2 = rr7Var.b;
                    ds7 ds7Var2 = rr7Var.a;
                    bVar = new ig3.b(sr7Var.b, ds7Var2 != null ? jsb.c(ds7Var2) : null, num2);
                }
                ((gme) yvbVarQ.d).setValue(svb.a(yvbVarQ.v(), null, null, false, null, null, null, null, null, false, null, null, new mt9(string, string2, string3, string6, new ig3(aVar, bool, bVar), 32), null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -2049, 8388607));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) Q().e).setValue(b5g.a);
        }
        this.h0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-military-experience", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-add-military-experience", null, null, 12));
    }
}
