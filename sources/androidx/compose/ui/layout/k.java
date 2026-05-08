package androidx.compose.ui.layout;

import androidx.compose.ui.layout.e0;
import androidx.compose.ui.layout.j;
import defpackage.bg9;
import defpackage.bxe;
import defpackage.d20;
import defpackage.iq2;
import defpackage.j6g;
import defpackage.khd;
import defpackage.pm8;
import defpackage.vf9;
import defpackage.z3a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends pm8.e {
    public final /* synthetic */ j b;
    public final /* synthetic */ Function2<bxe, iq2, bg9> c;

    public static final class a implements bg9 {
        public final /* synthetic */ bg9 a;
        public final /* synthetic */ j b;
        public final /* synthetic */ int c;
        public final /* synthetic */ bg9 d;

        public a(bg9 bg9Var, j jVar, int i, bg9 bg9Var2) {
            this.b = jVar;
            this.c = i;
            this.d = bg9Var2;
            this.a = bg9Var;
        }

        @Override // defpackage.bg9
        public final int getHeight() {
            return this.a.getHeight();
        }

        @Override // defpackage.bg9
        public final int getWidth() {
            return this.a.getWidth();
        }

        @Override // defpackage.bg9
        public final void j() {
            int i = this.c;
            j jVar = this.b;
            jVar.e = i;
            this.d.j();
            z3a<Object, e0.b> z3aVar = jVar.a0;
            long[] jArr = z3aVar.a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = z3aVar.b[i5];
                            e0.b bVar = (e0.b) z3aVar.c[i5];
                            int i6 = jVar.b0.i(obj);
                            if (i6 < 0 || i6 >= jVar.e) {
                                bVar.dispose();
                                z3aVar.l(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        @Override // defpackage.bg9
        public final Function1<khd, j6g> k() {
            return this.a.k();
        }

        @Override // defpackage.bg9
        public final Map<d20, Integer> r() {
            return this.a.r();
        }
    }

    public static final class b implements bg9 {
        public final /* synthetic */ bg9 a;
        public final /* synthetic */ j b;
        public final /* synthetic */ int c;
        public final /* synthetic */ bg9 d;

        public b(bg9 bg9Var, j jVar, int i, bg9 bg9Var2) {
            this.b = jVar;
            this.c = i;
            this.d = bg9Var2;
            this.a = bg9Var;
        }

        @Override // defpackage.bg9
        public final int getHeight() {
            return this.a.getHeight();
        }

        @Override // defpackage.bg9
        public final int getWidth() {
            return this.a.getWidth();
        }

        @Override // defpackage.bg9
        public final void j() {
            int i = this.c;
            j jVar = this.b;
            jVar.d = i;
            this.d.j();
            jVar.d(jVar.d);
        }

        @Override // defpackage.bg9
        public final Function1<khd, j6g> k() {
            return this.a.k();
        }

        @Override // defpackage.bg9
        public final Map<d20, Integer> r() {
            return this.a.r();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(j jVar, Function2<? super bxe, ? super iq2, ? extends bg9> function2, String str) {
        super(str);
        this.b = jVar;
        this.c = function2;
    }

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        j jVar = this.b;
        j.c cVar = jVar.W;
        cVar.a = qVar.getLayoutDirection();
        cVar.b = qVar.getDensity();
        cVar.c = qVar.p1();
        boolean zM0 = qVar.m0();
        Function2<bxe, iq2, bg9> function2 = this.c;
        if (zM0 || jVar.a.V == null) {
            jVar.d = 0;
            bg9 bg9VarInvoke = function2.invoke(cVar, new iq2(j));
            return new b(bg9VarInvoke, jVar, jVar.d, bg9VarInvoke);
        }
        jVar.e = 0;
        bg9 bg9VarInvoke2 = function2.invoke(jVar.X, new iq2(j));
        return new a(bg9VarInvoke2, jVar, jVar.e, bg9VarInvoke2);
    }
}
