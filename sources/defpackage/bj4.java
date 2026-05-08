package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbj4;", "Lw0g;", "<init>", "()V", "a", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bj4 extends w0g {
    public final zcd g0 = new zcd();
    public final frg h0 = os5.a(this, fwc.a.b(yvb.class), new b(this), new c(this), new la(this, 5));
    public Function2<? super ps7, ? super xr7, j6g> i0;

    public static final class a {
        public static bj4 a(xr7 xr7Var, String str) {
            ds7 ds7Var;
            Integer num;
            ds7 ds7Var2;
            Integer num2;
            str.getClass();
            bj4 bj4Var = new bj4();
            Bundle bundleE = l6.e("groupId", str);
            if (xr7Var != null) {
                String str2 = xr7Var.a;
                if (str2 != null) {
                    bundleE.putString("groupTitle", str2);
                }
                String str3 = xr7Var.c;
                if (str3 != null) {
                    bundleE.putString("groupDescription", str3);
                }
                sr7 sr7Var = xr7Var.b;
                if (sr7Var != null) {
                    rr7 rr7Var = sr7Var.c;
                    rr7 rr7Var2 = sr7Var.a;
                    Boolean bool = sr7Var.b;
                    bundleE.putBoolean("groupIsCurrent", bool != null ? bool.booleanValue() : false);
                    if (rr7Var2 != null && (num2 = rr7Var2.b) != null) {
                        bundleE.putInt("groupFromYear", num2.intValue());
                    }
                    if (rr7Var2 != null && (ds7Var2 = rr7Var2.a) != null) {
                        bundleE.putString("groupFromMonth", ds7Var2.name());
                    }
                    if (rr7Var != null && (num = rr7Var.b) != null) {
                        bundleE.putInt("groupToYear", num.intValue());
                    }
                    if (rr7Var != null && (ds7Var = rr7Var.a) != null) {
                        bundleE.putString("groupToMonth", ds7Var.name());
                    }
                }
            }
            bj4Var.setArguments(bundleE);
            return bj4Var;
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(bj4 bj4Var) {
            super(0);
            this.$this_activityViewModels = bj4Var;
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
        public c(bj4 bj4Var) {
            super(0);
            this.$this_activityViewModels = bj4Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(2075873364);
        int i2 = 4;
        int i3 = 2;
        int i4 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i4 & 1, (i4 & 3) != 2)) {
            String str = R().v().B;
            List<lu0> list = R().v().C;
            b5g b5gVarW = R().w();
            mu0 mu0Var = R().v().E;
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new ma(this, i2);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new vv(this, i2);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new m91(this, i3);
                cVarH.p(objV3);
            }
            pg4.a(str, list, function1, gu5Var, (Function1) objV3, b5gVarW, mu0Var, cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pa(this, i, 3);
        }
    }

    public final void Q(ps7 ps7Var, xr7 xr7Var) {
        Function2<? super ps7, ? super xr7, j6g> function2 = this.i0;
        this.i0 = null;
        if (function2 != null) {
            if (ps7Var == ps7.b) {
                function2.invoke(ps7Var, xr7Var);
            } else {
                function2.invoke(ps7Var, null);
            }
        }
        close();
    }

    public final yvb R() {
        return (yvb) this.h0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((gme) R().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            xr7 xr7Var = null;
            String string = arguments != null ? arguments.getString("groupId") : null;
            if (string == null) {
                string = "";
            }
            String str = string;
            yvb yvbVarR = R();
            ((gme) yvbVarR.d).setValue(svb.a(yvbVarR.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, str, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -134217729, 8388607));
            if ((arguments == null || !arguments.containsKey("groupTitle")) && (arguments == null || !arguments.containsKey("groupDescription"))) {
                return;
            }
            if (arguments != null) {
                String string2 = arguments.getString("groupFromMonth");
                String string3 = arguments.getString("groupToMonth");
                String string4 = arguments.getString("groupTitle");
                boolean z = arguments.getBoolean("groupIsCurrent");
                xr7Var = new xr7(string4, new sr7(new rr7(string2 != null ? ds7.valueOf(string2) : null, Integer.valueOf(arguments.getInt("groupFromYear"))), Boolean.valueOf(z), new rr7(string3 != null ? ds7.valueOf(string3) : null, Integer.valueOf(arguments.getInt("groupToYear")))), arguments.getString("groupDescription"));
            }
            if (xr7Var != null) {
                R().J(jsb.o(xr7Var, str));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) R().e).setValue(b5g.a);
        }
        this.i0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-edit-groups", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-edit-groups", null, null, 12));
    }
}
