package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgy;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class gy extends w0g {
    public final ArrayList g0;
    public final zcd h0;
    public final t41 i0;
    public final frg j0;
    public Function2<? super ps7, ? super vs7, j6g> k0;
    public boolean l0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gy gyVar) {
            super(0);
            this.$this_activityViewModels = gyVar;
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
        public b(gy gyVar) {
            super(0);
            this.$this_activityViewModels = gyVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public gy() {
        String[] iSOCountries = Locale.getISOCountries();
        iSOCountries.getClass();
        ArrayList arrayList = new ArrayList(iSOCountries.length);
        int i = 0;
        for (String str : iSOCountries) {
            arrayList.add(new Locale("", str));
        }
        this.g0 = arrayList;
        this.h0 = new zcd();
        this.i0 = new t41(jz0.a());
        this.j0 = os5.a(this, fwc.a.b(yvb.class), new a(this), new b(this), new fy(this, i));
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        c cVarH = bVar.h(714071774);
        int i2 = 2;
        int i3 = (cVarH.x(this) ? 4 : 2) | i;
        int i4 = 0;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            boolean z = this.l0;
            b5g b5gVarW = Q().w();
            hw9 hw9Var = new hw9((iy3) cVarH.M(um2.h));
            j2h j2hVar = Q().v().e;
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new nj(this, 3);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new se(this, i2);
                cVarH.p(objV2);
            }
            hz.a(z, this.i0, this.g0, gu5Var, (Function1) objV2, b5gVarW, hw9Var, j2hVar, cVarH, 2097152);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ey(this, i, i4);
        }
    }

    public final yvb Q() {
        return (yvb) this.j0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        vs7 vs7Var;
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            this.l0 = arguments != null ? arguments.getBoolean("KEY_IS_BUILD_SUGGESTION") : false;
            Q().P(this.l0);
            yvb yvbVarQ = Q();
            if (arguments == null) {
                vs7Var = null;
            } else {
                String string = arguments.getString("fromMonth");
                String string2 = arguments.getString("toMonth");
                vs7Var = new vs7(new sr7(new rr7(string != null ? ds7.valueOf(string) : null, Integer.valueOf(arguments.getInt("fromYear"))), Boolean.valueOf(arguments.getBoolean("isCurrent")), new rr7(string2 != null ? ds7.valueOf(string2) : null, Integer.valueOf(arguments.getInt("toYear")))), arguments.getString("jobTitle"), arguments.getString("company"), arguments.getString("country"), arguments.getString("location"), arguments.getString("description"));
            }
            yvbVarQ.O(vs7Var != null ? jsb.u(vs7Var, "") : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) Q().e).setValue(b5g.a);
        }
        this.k0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-add-work-experience", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-add-work-experience", null, null, 12));
    }
}
