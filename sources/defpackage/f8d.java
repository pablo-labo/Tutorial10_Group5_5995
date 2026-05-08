package defpackage;

import android.content.Context;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf8d;", "Lw0g;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f8d extends w0g {
    public final o8d g0 = new o8d();
    public final zcd h0 = new zcd();
    public final frg i0;
    public final frg j0;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f8d f8dVar) {
            super(0);
            this.$this_activityViewModels = f8dVar;
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
        public b(f8d f8dVar) {
            super(0);
            this.$this_activityViewModels = f8dVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class c extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f8d f8dVar) {
            super(0);
            this.$this_activityViewModels = f8dVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class d extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f8d f8dVar) {
            super(0);
            this.$this_activityViewModels = f8dVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public f8d() {
        a1 a1Var = new a1(this, 22);
        iwc iwcVar = fwc.a;
        this.i0 = os5.a(this, iwcVar.b(x1c.class), new a(this), new b(this), a1Var);
        this.j0 = os5.a(this, iwcVar.b(p9d.class), new c(this), new d(this), new fk0(this, 17));
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(-452826571);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            r8 r8Var = new r8();
            boolean zX = cVarH.x(this) | cVarH.x(context);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new zi(6, this, context);
                cVarH.p(objV);
            }
            ra9 ra9VarL = ypd.L(r8Var, (Function1) objV, cVarH);
            String str = Q().n().h;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new wm1(this, 16);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new cq0(this, 13);
                cVarH.p(objV3);
            }
            gu5 gu5Var2 = (gu5) objV3;
            boolean zX4 = cVarH.x(this);
            Object objV4 = cVarH.v();
            if (zX4 || objV4 == c0020a) {
                objV4 = new o91(this, 19);
                cVarH.p(objV4);
            }
            gu5 gu5Var3 = (gu5) objV4;
            boolean zX5 = cVarH.x(this);
            Object objV5 = cVarH.v();
            if (zX5 || objV5 == c0020a) {
                objV5 = new oq(this, 23);
                cVarH.p(objV5);
            }
            gu5 gu5Var4 = (gu5) objV5;
            boolean zX6 = cVarH.x(ra9VarL);
            Object objV6 = cVarH.v();
            if (zX6 || objV6 == c0020a) {
                objV6 = new dd(ra9VarL, 17);
                cVarH.p(objV6);
            }
            gu5 gu5Var5 = (gu5) objV6;
            boolean zX7 = cVarH.x(this);
            Object objV7 = cVarH.v();
            if (zX7 || objV7 == c0020a) {
                objV7 = new qq(this, 22);
                cVarH.p(objV7);
            }
            pg8.f(gu5Var, str2, gu5Var2, gu5Var3, gu5Var4, gu5Var5, (gu5) objV7, cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rq(this, i, 11);
        }
    }

    public final x1c Q() {
        return (x1c) this.i0.getValue();
    }
}
