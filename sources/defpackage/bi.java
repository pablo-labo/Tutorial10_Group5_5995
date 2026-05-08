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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbi;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bi extends w0g {
    public boolean g0;
    public Function2<? super ps7, ? super tr7, j6g> h0;
    public final ArrayList i0;
    public final zcd j0;
    public final t41 k0;
    public final frg l0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bi biVar) {
            super(0);
            this.$this_activityViewModels = biVar;
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
        public b(bi biVar) {
            super(0);
            this.$this_activityViewModels = biVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public bi() {
        String[] iSOCountries = Locale.getISOCountries();
        iSOCountries.getClass();
        ArrayList arrayList = new ArrayList(iSOCountries.length);
        int i = 0;
        for (String str : iSOCountries) {
            arrayList.add(new Locale("", str));
        }
        this.i0 = arrayList;
        this.j0 = new zcd();
        this.k0 = new t41(jz0.a());
        this.l0 = os5.a(this, fwc.a.b(yvb.class), new a(this), new b(this), new xh(this, i));
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        c cVarH = bVar.h(-269195017);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            boolean z = this.g0;
            go4 go4Var = Q().v().A;
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new yh(this, 0);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new zh(this, i3);
                cVarH.p(objV2);
            }
            mj.a(z, go4Var, function1, (gu5) objV2, this.k0, this.i0, Q().w(), new hw9((iy3) cVarH.M(um2.h)), cVarH, 16777216);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new s5(this, i, 1);
        }
    }

    public final yvb Q() {
        return (yvb) this.l0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        sr7 sr7Var;
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            boolean z = (arguments == null || !arguments.containsKey("KEY_IS_BUILD_SUGGESTION")) ? false : arguments.getBoolean("KEY_IS_BUILD_SUGGESTION");
            this.g0 = z;
            if (z) {
                String string = (arguments == null || !arguments.containsKey("KEY_LEVEL_OF_EDUCATION")) ? null : arguments.getString("KEY_LEVEL_OF_EDUCATION");
                String string2 = (arguments == null || !arguments.containsKey("KEY_SCHOOL")) ? null : arguments.getString("KEY_SCHOOL");
                String string3 = (arguments == null || !arguments.containsKey("KEY_FIELD_OF_STUDY")) ? null : arguments.getString("KEY_FIELD_OF_STUDY");
                String string4 = (arguments == null || !arguments.containsKey("KEY_COUNTRY")) ? null : arguments.getString("KEY_COUNTRY");
                String string5 = (arguments == null || !arguments.containsKey("KEY_SCHOOL_LOCATION")) ? null : arguments.getString("KEY_SCHOOL_LOCATION");
                if (arguments == null || !arguments.containsKey("KEY_FROM_YEAR")) {
                    sr7Var = null;
                } else {
                    int i = arguments.getInt("KEY_FROM_YEAR", -1);
                    String string6 = arguments.getString("KEY_FROM_MONTH_NAME");
                    rr7 rr7Var = new rr7(string6 != null ? ds7.valueOf(string6) : null, Integer.valueOf(i));
                    int i2 = arguments.getInt("KEY_TO_YEAR");
                    String string7 = arguments.getString("KEY_TO_MONTH_NAME");
                    sr7Var = new sr7(rr7Var, Boolean.valueOf(arguments.getBoolean("KEY_IS_CURRENT")), new rr7(string7 != null ? ds7.valueOf(string7) : null, Integer.valueOf(i2)));
                }
                yvb yvbVarQ = Q();
                if (string == null) {
                    string = "";
                }
                ((gme) yvbVarQ.d).setValue(svb.a(yvbVarQ.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, new go4(string, null, string3, null, string2, string4, string5, sr7Var != null ? jsb.b(sr7Var) : null, 43), null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -67108865, 8388607));
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
        dg3.i(dg3.b(rxb.a, "profile-tab-add-education", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-add-education", null, null, 12));
    }
}
