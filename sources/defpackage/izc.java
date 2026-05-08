package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import defpackage.grg;
import defpackage.ls7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lizc;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class izc extends w0g {
    public final t41 g0 = new t41(jz0.a());
    public final frg h0 = os5.a(this, fwc.a.b(aub.class), new a(this), new b(this), new c(this));
    public Function2<? super hs7, ? super ls7, j6g> i0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(izc izcVar) {
            super(0);
            this.$this_activityViewModels = izcVar;
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
        public b(izc izcVar) {
            super(0);
            this.$this_activityViewModels = izcVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class c extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(izc izcVar) {
            super(0);
            this.$this_activityViewModels = izcVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [zr4] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        ?? arrayList;
        androidx.compose.runtime.c cVarH = bVar.h(-651289599);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            tzc tzcVarM = R().m();
            List<fzc> list = R().l().s;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = ((fzc) it.next()).c;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = zr4.a;
            }
            ?? r2 = arrayList;
            b5g b5gVarP = R().p();
            hw9 hw9Var = new hw9((iy3) cVarH.M(um2.h));
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new ed(this, 10);
                cVarH.p(objV);
            }
            Function2 function2 = (Function2) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new z0(this, 19);
                cVarH.p(objV2);
            }
            szc.a(tzcVarM, r2, function2, (gu5) objV2, this.g0, b5gVarP, hw9Var, cVarH, 2097152);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new fr2(this, i, 8);
        }
    }

    public final void Q(hs7 hs7Var, ls7 ls7Var) {
        close();
        Function2<? super hs7, ? super ls7, j6g> function2 = this.i0;
        if (function2 != null) {
            if (hs7Var == hs7.a) {
                function2.invoke(hs7Var, ls7Var);
            } else {
                function2.invoke(hs7Var, null);
            }
        }
    }

    public final aub R() {
        return (aub) this.h0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String[] stringArray;
        super.onCreate(bundle);
        ((gme) R().e).setValue(b5g.a);
        if (bundle == null) {
            Bundle arguments = getArguments();
            ls7.a aVarValueOf = null;
            List listE0 = (arguments == null || !arguments.containsKey("KEY_LOCATIONS_LIST") || (stringArray = arguments.getStringArray("KEY_LOCATIONS_LIST")) == null) ? null : ut0.E0(stringArray);
            if (listE0 != null) {
                aub aubVarR = R();
                vsb vsbVarL = aubVarR.l();
                List list = listE0;
                ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new fzc((String) it.next(), 13));
                }
                aubVarR.v(vsb.a(vsbVarL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, null, 1835007));
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null && arguments2.containsKey("KEY_RELOCATION_VALUE") && (string = arguments2.getString("KEY_RELOCATION_VALUE")) != null) {
                aVarValueOf = ls7.a.valueOf(string);
            }
            if (aVarValueOf != null) {
                aub aubVarR2 = R();
                aubVarR2.v(vsb.a(aubVarR2.l(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(aVarValueOf != ls7.a.a), null, null, null, 1966079));
            }
        }
    }

    @Override // defpackage.w0g, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        P(true);
        u63.Y(hh1.A(this), null, null, new hzc(this, null), 3);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) R().e).setValue(b5g.a);
        }
        this.i0 = null;
    }
}
