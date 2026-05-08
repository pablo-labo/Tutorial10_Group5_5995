package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpv;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class pv extends w0g {
    public final zcd g0 = new zcd();
    public final o8d h0 = new o8d();
    public final frg i0;
    public final frg j0;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bqb.values().length];
            try {
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[7] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[hvb.values().length];
            try {
                iArr2[3] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            a = iArr2;
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pv pvVar) {
            super(0);
            this.$this_activityViewModels = pvVar;
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
        public c(pv pvVar) {
            super(0);
            this.$this_activityViewModels = pvVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class d extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(pv pvVar) {
            super(0);
            this.$this_activityViewModels = pvVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(pv pvVar) {
            super(0);
            this.$this_activityViewModels = pvVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public pv() {
        zh zhVar = new zh(this, 1);
        iwc iwcVar = fwc.a;
        this.i0 = os5.a(this, iwcVar.b(yvb.class), new b(this), new c(this), zhVar);
        this.j0 = os5.a(this, iwcVar.b(x1c.class), new d(this), new e(this), new nj(this, 2));
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(1317386997);
        int i2 = 2;
        int i3 = (cVarH.x(this) ? 4 : 2) | i;
        int i4 = 0;
        int i5 = 1;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new nv(this, i4);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new q2(this, i2);
                cVarH.p(objV2);
            }
            sv.a(gu5Var, (Function1) objV2, isb.b(((x1c) this.j0.getValue()).o(), ((yvb) this.i0.getValue()).v()), cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pj(this, i, i5);
        }
    }
}
