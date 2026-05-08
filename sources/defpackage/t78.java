package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import defpackage.grg;
import defpackage.js7;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt78;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t78 extends w0g {
    public final frg g0 = os5.a(this, fwc.a.b(aub.class), new a(this), new b(this), new c(this));
    public Function2<? super hs7, ? super js7, j6g> h0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t78 t78Var) {
            super(0);
            this.$this_activityViewModels = t78Var;
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
        public b(t78 t78Var) {
            super(0);
            this.$this_activityViewModels = t78Var;
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
        public c(t78 t78Var) {
            super(0);
            this.$this_activityViewModels = t78Var;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(297022519);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            List<sjb> list = Q().l().c;
            List<sjb> list2 = Q().l().d;
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new a1(this, 15);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new k1(this, 9);
                cVarH.p(objV2);
            }
            y78.a(list, list2, gu5Var, (Function1) objV2, Q().p(), cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pr(this, i, 3);
        }
    }

    public final aub Q() {
        return (aub) this.g0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        sjb sjbVar;
        String[] stringArray;
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            Set setE1 = null;
            if (arguments != null && arguments.containsKey("KEY_JOB_TYPES_SET") && (stringArray = arguments.getStringArray("KEY_JOB_TYPES_SET")) != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : stringArray) {
                    str.getClass();
                    js7.a aVarValueOf = js7.a.valueOf(str);
                    if (aVarValueOf != null) {
                        arrayList.add(aVarValueOf);
                    }
                }
                setE1 = z92.E1(arrayList);
            }
            if (setE1 != null) {
                Set<js7.a> set = setE1;
                ArrayList arrayList2 = new ArrayList(t92.r0(set, 10));
                for (js7.a aVar : set) {
                    aVar.getClass();
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        sjbVar = y78.d;
                    } else if (iOrdinal == 1) {
                        sjbVar = y78.b;
                    } else if (iOrdinal == 2) {
                        sjbVar = y78.a;
                    } else if (iOrdinal == 3) {
                        sjbVar = y78.c;
                    } else {
                        if (iOrdinal != 4) {
                            l.g();
                            return;
                        }
                        sjbVar = y78.e;
                    }
                    arrayList2.add(sjbVar);
                }
                List listZ1 = z92.z1(arrayList2);
                aub aubVarQ = Q();
                aubVarQ.v(vsb.a(aubVarQ.l(), null, null, null, listZ1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097143));
            }
        }
    }

    @Override // defpackage.w0g, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        P(true);
        u63.Y(hh1.A(this), null, null, new s78(this, null), 3);
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
        dg3.h(pjb.b);
        super.onDestroyView();
    }
}
