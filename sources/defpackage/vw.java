package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvw;", "Lw0g;", "<init>", "()V", "a", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class vw extends w0g {
    public final zcd g0 = new zcd();
    public final t41 h0 = new t41(jz0.a());
    public final frg i0 = os5.a(this, fwc.a.b(yvb.class), new b(this), new c(this), new zh(this, 2));
    public Function2<? super ps7, ? super qs7, j6g> j0;
    public boolean k0;

    public static final class a {
        public static vw a(qs7 qs7Var, boolean z) {
            List<String> list;
            List<String> list2;
            vw vwVar = new vw();
            Bundle bundle = new Bundle();
            bundle.putBoolean("KEY_IS_BUILD_SUGGESTION", z);
            String[] strArr = null;
            if ((qs7Var != null ? qs7Var.a : null) != null) {
                bundle.putString("KEY_TEXT", qs7Var.a);
            }
            if ((qs7Var != null ? qs7Var.b : null) != null) {
                Integer num = qs7Var.b;
                bundle.putInt("KEY_EXPERIENCE", num != null ? num.intValue() : 0);
            }
            if ((qs7Var != null ? qs7Var.c : null) != null) {
                ts7 ts7Var = qs7Var.c;
                bundle.putString("KEY_TAXONOMY_LABEL", ts7Var != null ? ts7Var.a : null);
                bundle.putString("KEY_TAXONOMY_SUID", ts7Var != null ? ts7Var.b : null);
                if ((ts7Var != null ? ts7Var.c : null) != null) {
                    bundle.putString("KEY_TAXONOMY_TYPE", ts7Var != null ? ts7Var.c : null);
                }
                if ((ts7Var != null ? ts7Var.d : null) != null) {
                    bundle.putStringArray("KEY_TAXONOMY_SECTION_IDS", (ts7Var == null || (list2 = ts7Var.d) == null) ? null : (String[]) list2.toArray(new String[0]));
                }
                if ((ts7Var != null ? ts7Var.e : null) != null) {
                    if (ts7Var != null && (list = ts7Var.e) != null) {
                        strArr = (String[]) list.toArray(new String[0]);
                    }
                    bundle.putStringArray("KEY_TAXONOMY_CONTEXT", strArr);
                }
            }
            vwVar.setArguments(bundle);
            return vwVar;
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vw vwVar) {
            super(0);
            this.$this_activityViewModels = vwVar;
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
        public c(vw vwVar) {
            super(0);
            this.$this_activityViewModels = vwVar;
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
        androidx.compose.runtime.c cVarH = bVar.h(2036897853);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        int i3 = 0;
        int i4 = 1;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            boolean z = this.k0;
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new me(this, 2);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new xh(this, i4);
                cVarH.p(objV2);
            }
            mx.a(z, this.h0, function1, (gu5) objV2, Q().w(), new hw9((iy3) cVarH.M(um2.h)), Q(), Q().v().U, cVarH, 262144, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new uw(this, i, i3);
        }
    }

    public final yvb Q() {
        return (yvb) this.i0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ts7 ts7Var;
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            this.k0 = (arguments == null || !arguments.containsKey("KEY_IS_BUILD_SUGGESTION")) ? false : arguments.getBoolean("KEY_IS_BUILD_SUGGESTION");
            zie zieVarN = null;
            if (arguments != null) {
                String string = arguments.getString("KEY_TAXONOMY_LABEL");
                String string2 = arguments.getString("KEY_TAXONOMY_SUID");
                if (string == null || string2 == null) {
                    ts7Var = null;
                } else {
                    String string3 = arguments.getString("KEY_TAXONOMY_TYPE");
                    String[] stringArray = arguments.getStringArray("KEY_TAXONOMY_SECTION_IDS");
                    List listE0 = stringArray != null ? ut0.E0(stringArray) : null;
                    String[] stringArray2 = arguments.getStringArray("KEY_TAXONOMY_CONTEXT");
                    ts7Var = new ts7(listE0, stringArray2 != null ? ut0.E0(stringArray2) : null, string, string2, string3);
                }
                if (ts7Var != null) {
                    String string4 = arguments.getString("KEY_TEXT");
                    if (string4 == null) {
                        string4 = "";
                    }
                    zieVarN = jsb.n(new qs7(string4, arguments.containsKey("KEY_EXPERIENCE") ? Integer.valueOf(arguments.getInt("KEY_EXPERIENCE")) : null, ts7Var), null);
                }
            }
            zie zieVar = zieVarN;
            yvb yvbVarQ = Q();
            ((gme) yvbVarQ.d).setValue(svb.a(yvbVarQ.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, zieVar, false, null, false, null, false, null, null, null, -1, 8372223));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) Q().e).setValue(b5g.a);
        }
        this.j0 = null;
    }
}
