package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import defpackage.cs7;
import defpackage.grg;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqlb;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class qlb extends w0g {
    public Function2<? super hs7, ? super cs7, j6g> g0;
    public final frg h0 = os5.a(this, fwc.a.b(aub.class), new a(this), new b(this), new c(this));

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qlb qlbVar) {
            super(0);
            this.$this_activityViewModels = qlbVar;
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
        public b(qlb qlbVar) {
            super(0);
            this.$this_activityViewModels = qlbVar;
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
        public c(qlb qlbVar) {
            super(0);
            this.$this_activityViewModels = qlbVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(-1920275849);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            vsb vsbVarL = R().l();
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new yh(this, 13);
                cVarH.p(objV);
            }
            Function1 function1 = (Function1) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new zh(this, 18);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new nj(this, 19);
                cVarH.p(objV3);
            }
            gu5 gu5Var2 = (gu5) objV3;
            boolean zX4 = cVarH.x(this);
            Object objV4 = cVarH.v();
            if (zX4 || objV4 == c0020a) {
                objV4 = new nv(this, 15);
                cVarH.p(objV4);
            }
            sl4.a(vsbVarL, function1, gu5Var, gu5Var2, (gu5) objV4, R().p(), cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new ey(this, i, 8);
        }
    }

    public final void Q(hs7 hs7Var, cs7 cs7Var) {
        R().u(usb.a);
        close();
        Function2<? super hs7, ? super cs7, j6g> function2 = this.g0;
        if (function2 != null) {
            if (hs7Var == hs7.a) {
                function2.invoke(hs7Var, cs7Var);
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
        f68 f68Var;
        String string;
        super.onCreate(bundle);
        ((gme) R().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            Double dValueOf = (arguments == null || !arguments.containsKey("KEY_AMOUNT")) ? null : Double.valueOf(arguments.getDouble("KEY_AMOUNT"));
            if (dValueOf != null) {
                aub aubVarR = R();
                zt9 zt9Var = aubVarR.l().p;
                if (zt9Var == null) {
                    zt9Var = new zt9(null, null, 15);
                }
                aubVarR.v(vsb.a(aubVarR.l(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, zt9.a(zt9Var, dValueOf, null, null, 14), null, null, null, null, null, 2064383));
            }
            String string2 = (arguments == null || !arguments.containsKey("KEY_CURRENCY")) ? null : arguments.getString("KEY_CURRENCY");
            if (string2 != null) {
                aub aubVarR2 = R();
                zt9 zt9Var2 = aubVarR2.l().p;
                if (zt9Var2 == null) {
                    zt9Var2 = new zt9(null, null, 15);
                }
                aubVarR2.v(vsb.a(aubVarR2.l(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, zt9.a(zt9Var2, null, null, string2, 7), null, null, null, null, null, 2064383));
            }
            cs7.a aVarValueOf = (arguments == null || !arguments.containsKey("KEY_PAY_PERIOD") || (string = arguments.getString("KEY_PAY_PERIOD")) == null) ? null : cs7.a.valueOf(string);
            if (aVarValueOf != null) {
                aub aubVarR3 = R();
                int iOrdinal = aVarValueOf.ordinal();
                if (iOrdinal == 0) {
                    f68Var = f68.c;
                } else if (iOrdinal == 1) {
                    f68Var = f68.d;
                } else if (iOrdinal == 2) {
                    f68Var = f68.e;
                } else if (iOrdinal == 3) {
                    f68Var = f68.f;
                } else if (iOrdinal == 4) {
                    f68Var = f68.V;
                } else {
                    if (iOrdinal != 5) {
                        l.g();
                        return;
                    }
                    f68Var = f68.W;
                }
                zt9 zt9Var3 = aubVarR3.l().p;
                if (zt9Var3 == null) {
                    zt9Var3 = new zt9(null, null, 15);
                }
                aubVarR3.v(vsb.a(aubVarR3.l(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, zt9.a(zt9Var3, null, f68Var, null, 13), null, null, null, null, null, 2064383));
            }
        }
    }

    @Override // defpackage.w0g, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        P(true);
        u63.Y(hh1.A(this), null, null, new plb(this, null), 3);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) R().e).setValue(b5g.a);
        }
        this.g0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.h(pjb.d);
        super.onDestroyView();
    }
}
