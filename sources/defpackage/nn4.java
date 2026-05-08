package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lnn4;", "Lw0g;", "<init>", "()V", "a", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class nn4 extends w0g {
    public final ArrayList g0;
    public final zcd h0;
    public final t41 i0;
    public final frg j0;
    public boolean k0;
    public Function2<? super ps7, ? super vs7, j6g> l0;

    public static final class a {
        public static void a(vs7 vs7Var, Bundle bundle) {
            ds7 ds7Var;
            Integer num;
            ds7 ds7Var2;
            Integer num2;
            String str = vs7Var.a;
            sr7 sr7Var = vs7Var.e;
            if (str != null) {
                bundle.putString("jobTitle", str);
            }
            String str2 = vs7Var.b;
            if (str2 != null) {
                bundle.putString("company", str2);
            }
            String str3 = vs7Var.c;
            if (str3 != null) {
                bundle.putString("country", str3);
            }
            String str4 = vs7Var.d;
            if (str4 != null) {
                bundle.putString("location", str4);
            }
            String str5 = vs7Var.f;
            if (str5 != null) {
                bundle.putString("description", str5);
            }
            if (sr7Var != null) {
                rr7 rr7Var = sr7Var.c;
                rr7 rr7Var2 = sr7Var.a;
                Boolean bool = sr7Var.b;
                int iIntValue = 0;
                bundle.putBoolean("isCurrent", bool != null ? bool.booleanValue() : false);
                String strName = null;
                if (rr7Var2 != null) {
                    if ((rr7Var2 != null ? rr7Var2.b : null) != null) {
                        bundle.putInt("fromYear", (rr7Var2 == null || (num2 = rr7Var2.b) == null) ? 0 : num2.intValue());
                    }
                    if ((rr7Var2 != null ? rr7Var2.a : null) != null) {
                        bundle.putString("fromMonth", (rr7Var2 == null || (ds7Var2 = rr7Var2.a) == null) ? null : ds7Var2.name());
                    }
                }
                if (rr7Var != null) {
                    if ((rr7Var != null ? rr7Var.b : null) != null) {
                        if (rr7Var != null && (num = rr7Var.b) != null) {
                            iIntValue = num.intValue();
                        }
                        bundle.putInt("toYear", iIntValue);
                    }
                    if ((rr7Var != null ? rr7Var.a : null) != null) {
                        if (rr7Var != null && (ds7Var = rr7Var.a) != null) {
                            strName = ds7Var.name();
                        }
                        bundle.putString("toMonth", strName);
                    }
                }
            }
        }

        public static vs7 b(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("fromMonth");
            String string2 = bundle.getString("toMonth");
            String string3 = bundle.getString("jobTitle");
            String string4 = bundle.getString("company");
            String string5 = bundle.getString("country");
            String string6 = bundle.getString("location");
            String string7 = bundle.getString("description");
            boolean z = bundle.getBoolean("isCurrent");
            return new vs7(new sr7(new rr7(string != null ? ds7.valueOf(string) : null, bundle.getInt("fromYear") != 0 ? Integer.valueOf(bundle.getInt("fromYear")) : null), Boolean.valueOf(z), new rr7(string2 != null ? ds7.valueOf(string2) : null, bundle.getInt("toYear") != 0 ? Integer.valueOf(bundle.getInt("toYear")) : null)), string3, string4, string5, string6, string7);
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(nn4 nn4Var) {
            super(0);
            this.$this_activityViewModels = nn4Var;
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
        public c(nn4 nn4Var) {
            super(0);
            this.$this_activityViewModels = nn4Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public nn4() {
        String[] iSOCountries = Locale.getISOCountries();
        iSOCountries.getClass();
        ArrayList arrayList = new ArrayList(iSOCountries.length);
        for (String str : iSOCountries) {
            arrayList.add(new Locale("", str));
        }
        this.g0 = arrayList;
        this.h0 = new zcd();
        this.i0 = new t41(jz0.a());
        this.j0 = os5.a(this, fwc.a.b(yvb.class), new b(this), new c(this), new qa(this, 10));
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(-245770592);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            boolean z = this.k0;
            String str = R().v().d;
            svb svbVarV = R().v();
            b5g b5gVarW = R().w();
            hw9 hw9Var = new hw9((iy3) cVarH.M(um2.h));
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            int i3 = 5;
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new ir(this, i3);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new cq0(this, i3);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new bt(this, 6);
                cVarH.p(objV3);
            }
            yn4.a(1073741824, this.i0, gu5Var, hw9Var, svbVarV, b5gVarW, cVarH, str, this.g0, function1, (Function1) objV3, z);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new lr(this, i, 3);
        }
    }

    @Override // defpackage.w0g
    public final void O() {
        ((np7) cr8.p(np7.class)).a("EditWorkExperienceBottomSheet", "onDismiss");
    }

    public final void Q() {
        close();
        R().F(null);
        R().P(false);
    }

    public final yvb R() {
        return (yvb) this.j0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        vs7 vs7VarB;
        super.onCreate(bundle);
        ((gme) R().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            this.k0 = arguments != null ? arguments.getBoolean("KEY_IS_BUILD_SUGGESTION") : false;
            R().P(this.k0);
            if (this.k0) {
                vs7 vs7VarB2 = a.b(arguments);
                R().F(vs7VarB2 != null ? jsb.u(vs7VarB2, "") : null);
                return;
            }
            String string = arguments != null ? arguments.getString("id") : null;
            String str = string == null ? "" : string;
            yvb yvbVarR = R();
            ((gme) yvbVarR.d).setValue(svb.a(yvbVarR.v(), null, null, false, str, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -9, 8388607));
            if (((arguments == null || !arguments.containsKey("jobTitle")) && (arguments == null || !arguments.containsKey("company"))) || (vs7VarB = a.b(arguments)) == null) {
                return;
            }
            R().O(jsb.u(vs7VarB, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) R().e).setValue(b5g.a);
        }
        this.l0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-edit-work-experience", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-edit-work-experience", null, null, 12));
    }
}
