package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import defpackage.grg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh78;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h78 extends w0g {
    public final t41 g0 = new t41(jz0.a());
    public final frg h0 = os5.a(this, fwc.a.b(aub.class), new a(this), new b(this), new c(this));
    public Function2<? super hs7, ? super is7, j6g> i0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h78 h78Var) {
            super(0);
            this.$this_activityViewModels = h78Var;
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
        public b(h78 h78Var) {
            super(0);
            this.$this_activityViewModels = h78Var;
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
        public c(h78 h78Var) {
            super(0);
            this.$this_activityViewModels = h78Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [zr4] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        ?? arrayList;
        androidx.compose.runtime.c cVarH = bVar.h(247469147);
        int i2 = 2;
        int i3 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            List<e78> list = R().l().q;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = ((e78) it.next()).b;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            } else {
                arrayList = zr4.a;
            }
            b5g b5gVarP = R().p();
            hw9 hw9Var = new hw9((iy3) cVarH.M(um2.h));
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new ed(this, 3);
                cVarH.p(objV);
            }
            Function2 function2 = (Function2) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new z0(this, 12);
                cVarH.p(objV2);
            }
            r78.a(arrayList, function2, (gu5) objV2, this.g0, b5gVarP, hw9Var, cVarH, 262144);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new fr2(this, i, i2);
        }
    }

    public final void Q(hs7 hs7Var, is7 is7Var) {
        close();
        Function2<? super hs7, ? super is7, j6g> function2 = this.i0;
        if (function2 != null) {
            if (hs7Var == hs7.a) {
                function2.invoke(hs7Var, is7Var);
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
        String[] stringArray;
        super.onCreate(bundle);
        ((gme) R().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            List listE0 = null;
            if (arguments != null && arguments.containsKey("KEY_JOB_TITLES") && (stringArray = arguments.getStringArray("KEY_JOB_TITLES")) != null && stringArray.length != 0) {
                listE0 = ut0.E0(stringArray);
            }
            if (listE0 != null) {
                aub aubVarR = R();
                vsb vsbVarL = aubVarR.l();
                List list = listE0;
                ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new e78((String) it.next(), 13));
                }
                aubVarR.v(vsb.a(vsbVarL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, 2031615));
            }
        }
    }

    @Override // defpackage.w0g, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ((gme) R().e).setValue(b5g.b);
        u63.Y(hh1.A(this), null, null, new g78(this, null), 3);
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
