package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lal4;", "Lw0g;", "<init>", "()V", "a", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class al4 extends w0g {
    public final zcd g0 = new zcd();
    public final frg h0 = os5.a(this, fwc.a.b(yvb.class), new b(this), new c(this), new oa(this, 6));
    public Function2<? super ps7, ? super es7, j6g> i0;

    public static final class a {
        public static al4 a(es7 es7Var, String str) {
            str.getClass();
            al4 al4Var = new al4();
            Bundle bundleE = l6.e("id", str);
            if (es7Var != null) {
                rr7 rr7Var = es7Var.d;
                String str2 = es7Var.a;
                if (str2 != null) {
                    bundleE.putString("patentTitle", str2);
                }
                String str3 = es7Var.c;
                if (str3 != null) {
                    bundleE.putString("patentUrl", str3);
                }
                String str4 = es7Var.e;
                if (str4 != null) {
                    bundleE.putString("patentDescription", str4);
                }
                String str5 = es7Var.b;
                if (str5 != null) {
                    bundleE.putString("patentNumber", str5);
                }
                Integer num = rr7Var.b;
                if (num != null) {
                    bundleE.putInt("patentYear", num.intValue());
                }
                ds7 ds7Var = rr7Var.a;
                if (ds7Var != null) {
                    bundleE.putString("patentMonth", ds7Var.name());
                }
            }
            al4Var.setArguments(bundleE);
            return al4Var;
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(al4 al4Var) {
            super(0);
            this.$this_activityViewModels = al4Var;
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
        public c(al4 al4Var) {
            super(0);
            this.$this_activityViewModels = al4Var;
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
        androidx.compose.runtime.c cVarH = bVar.h(768435175);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            String str = R().v().q;
            svb svbVarV = R().v();
            b5g b5gVarW = R().w();
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new tv(this, 7);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new la(this, 6);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new ma(this, 5);
                cVarH.p(objV3);
            }
            ll4.a(str, svbVarV, function1, gu5Var, (Function1) objV3, b5gVarW, cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xd(this, i, 6);
        }
    }

    public final void Q(ps7 ps7Var, es7 es7Var) {
        Function2<? super ps7, ? super es7, j6g> function2 = this.i0;
        this.i0 = null;
        if (function2 != null) {
            if (ps7Var == ps7.b) {
                function2.invoke(ps7Var, es7Var);
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
            es7 es7Var = null;
            String string = arguments != null ? arguments.getString("id") : null;
            if (string == null) {
                string = "";
            }
            String str = string;
            yvb yvbVarR = R();
            ((gme) yvbVarR.d).setValue(svb.a(yvbVarR.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, str, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -65537, 8388607));
            if ((arguments == null || !arguments.containsKey("patentTitle")) && (arguments == null || !arguments.containsKey("patentNumber"))) {
                return;
            }
            if (arguments != null) {
                String string2 = arguments.getString("patentMonth");
                String string3 = arguments.getString("patentTitle");
                String string4 = arguments.getString("patentDescription");
                es7Var = new es7(string3, arguments.getString("patentNumber"), arguments.getString("patentUrl"), new rr7(string2 != null ? ds7.valueOf(string2) : null, arguments.getInt("patentYear") != 0 ? Integer.valueOf(arguments.getInt("patentYear")) : null), string4);
            }
            if (es7Var != null) {
                R().M(jsb.s(es7Var, str));
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
        dg3.i(dg3.b(rxb.a, "profile-tab-edit-patent", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-edit-patent", null, null, 12));
    }
}
