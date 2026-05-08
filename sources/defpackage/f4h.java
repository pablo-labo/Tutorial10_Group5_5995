package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.R;
import defpackage.grg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf4h;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f4h extends w0g {
    public final frg g0 = os5.a(this, fwc.a.b(aub.class), new a(this), new b(this), new c(this));
    public Function2<? super hs7, ? super ys7, j6g> h0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f4h f4hVar) {
            super(0);
            this.$this_activityViewModels = f4hVar;
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
        public b(f4h f4hVar) {
            super(0);
            this.$this_activityViewModels = f4hVar;
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
        public c(f4h f4hVar) {
            super(0);
            this.$this_activityViewModels = f4hVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        List list;
        Integer num;
        androidx.compose.runtime.c cVarH = bVar.h(-140558679);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            g4h g4hVar = Q().l().n;
            List<sjb> list2 = Q().l().m;
            int iIntValue = (g4hVar == null || (num = g4hVar.b) == null) ? 0 : num.intValue();
            String strK = !list2.isEmpty() ? z3.k(cVarH, 209973102, R.string.edit_work_wellbeing_header, cVarH, false) : z3.k(cVarH, 210053423, R.string.add_work_wellbeing_header, cVarH, false);
            if (g4hVar == null || (list = g4hVar.c) == null) {
                list = zr4.a;
            }
            List list3 = list;
            String str = g4hVar != null ? g4hVar.a : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            String strI = ak2.I(R.string.work_wellbeing_description, cVarH);
            String strI2 = ak2.I(R.string.work_wellbeing_banner_info, cVarH);
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new me(this, 22);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new xh(this, 18);
                cVarH.p(objV2);
            }
            l4h.a(list3, list2, strK, str2, strI, strI2, iIntValue, function1, (gu5) objV2, Q().p(), cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new uw(this, i, 13);
        }
    }

    public final aub Q() {
        return (aub) this.g0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List<sjb> list;
        Object next;
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            String[] stringArray = (arguments == null || !arguments.containsKey("KEY_SELECTED_SUIDS")) ? null : arguments.getStringArray("KEY_SELECTED_SUIDS");
            if (stringArray != null) {
                aub aubVarQ = Q();
                ArrayList arrayList = new ArrayList();
                for (String str : stringArray) {
                    g4h g4hVar = aubVarQ.l().n;
                    if (g4hVar != null && (list = g4hVar.c) != null) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((sjb) next).a.equals(str)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        sjb sjbVar = (sjb) next;
                        if (sjbVar != null) {
                            arrayList.add(sjbVar);
                        }
                    }
                }
                aubVarQ.v(vsb.a(aubVarQ.l(), null, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, null, 2093055));
            }
        }
    }

    @Override // defpackage.w0g, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        P(true);
        u63.Y(hh1.A(this), null, null, new e4h(this, null), 3);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
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
        dg3.h(pjb.W);
        super.onDestroyView();
    }
}
