package androidx.compose.ui.layout;

import androidx.compose.ui.layout.w;
import defpackage.ae7;
import defpackage.bg9;
import defpackage.d20;
import defpackage.j6g;
import defpackage.khd;
import defpackage.ql7;
import defpackage.w59;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface q extends ql7 {

    public static final class a implements bg9 {
        public final int a;
        public final int b;
        public final Map<d20, Integer> c;
        public final Function1<khd, j6g> d;
        public final /* synthetic */ int e;
        public final /* synthetic */ q f;
        public final /* synthetic */ Function1<w.a, j6g> g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Map<d20, Integer> map, Function1<? super khd, j6g> function1, q qVar, Function1<? super w.a, j6g> function12) {
            this.e = i;
            this.f = qVar;
            this.g = function12;
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = function1;
        }

        @Override // defpackage.bg9
        public final int getHeight() {
            return this.b;
        }

        @Override // defpackage.bg9
        public final int getWidth() {
            return this.a;
        }

        @Override // defpackage.bg9
        public final void j() {
            q qVar = this.f;
            boolean z = qVar instanceof w59;
            Function1<w.a, j6g> function1 = this.g;
            if (z) {
                function1.invoke(((w59) qVar).a0);
                return;
            }
            function1.invoke(new c0(this.e, qVar.getLayoutDirection(), qVar.getDensity(), qVar.p1()));
        }

        @Override // defpackage.bg9
        public final Function1<khd, j6g> k() {
            return this.d;
        }

        @Override // defpackage.bg9
        public final Map<d20, Integer> r() {
            return this.c;
        }
    }

    default bg9 Y0(int i, int i2, Map<d20, Integer> map, Function1<? super w.a, j6g> function1) {
        return z1(i, i2, map, null, function1);
    }

    default bg9 z1(int i, int i2, Map<d20, Integer> map, Function1<? super khd, j6g> function1, Function1<? super w.a, j6g> function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ae7.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i, i2, map, function1, this, function12);
    }
}
