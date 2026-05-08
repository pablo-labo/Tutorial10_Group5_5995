package defpackage;

import androidx.compose.runtime.r;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bdf extends zs3 implements nm2, z96 {
    public Function1<? super lu2<? super j6g>, ? extends Object> f0;
    public final g4a g0 = r.e(null, zkd.f);

    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: bdf$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0093a extends qv5 implements Function1<ooa, j6g> {
            @Override // kotlin.jvm.functions.Function1
            public final j6g invoke(ooa ooaVar) {
                long j = ooaVar.a;
                bdf bdfVar = (bdf) this.receiver;
                bdfVar.getClass();
                hdf hdfVar = (hdf) om2.a(bdfVar, idf.a);
                if (hdfVar != null) {
                    u63.Y(bdfVar.Q1(), null, null, new cdf(bdfVar, hdfVar, bdfVar.new b(j), null), 3);
                }
                return j6g.a;
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
            Object objC = ap5.c(efbVar, new edd(new C0093a(1, bdf.this, bdf.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0), null), lu2Var);
            g13 g13Var = g13.a;
            if (objC != g13Var) {
                objC = j6g.a;
            }
            return objC == g13Var ? objC : j6g.a;
        }
    }

    public final class b implements zcf {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        @Override // defpackage.zcf
        public final long L0(sl8 sl8Var) {
            sl8 sl8Var2 = (sl8) ((gme) bdf.this.g0).getValue();
            if (sl8Var2 != null) {
                return sl8Var.G(sl8Var2, this.a);
            }
            de7.d("Tried to open context menu before the anchor was placed.");
            r40.e();
            return 0L;
        }

        @Override // defpackage.zcf
        public final qtc O0(sl8 sl8Var) {
            return web.a(L0(sl8Var), 0L);
        }

        @Override // defpackage.zcf
        public final ycf g0() {
            return gdf.a(bdf.this);
        }
    }

    public bdf(Function1<? super lu2<? super j6g>, ? extends Object> function1) {
        this.f0 = function1;
        c2(f1f.a(new a()));
    }

    @Override // defpackage.z96
    public final void n0(tia tiaVar) {
        ((gme) this.g0).setValue(tiaVar);
    }
}
