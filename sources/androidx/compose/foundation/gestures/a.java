package androidx.compose.foundation.gestures;

import androidx.compose.ui.e;
import defpackage.d3a;
import defpackage.dwa;
import defpackage.ggf;
import defpackage.iy3;
import defpackage.lz9;
import defpackage.tr;
import defpackage.v03;
import defpackage.xrd;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final tr a = new tr(16);
    public static final b b = new b();
    public static final C0013a c = new C0013a();
    public static final c d = new c();

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.a$a, reason: collision with other inner class name */
    public static final class C0013a implements lz9 {
        @Override // defpackage.v03
        public final v03 P(v03.b<?> bVar) {
            return v03.a.C0438a.b(this, bVar);
        }

        @Override // defpackage.lz9
        public final float Q() {
            return 1.0f;
        }

        @Override // defpackage.v03
        public final v03 d1(v03 v03Var) {
            return v03.a.C0438a.c(this, v03Var);
        }

        @Override // defpackage.v03
        public final <E extends v03.a> E h1(v03.b<E> bVar) {
            return (E) v03.a.C0438a.a(this, bVar);
        }

        @Override // defpackage.v03
        public final <R> R j1(R r, Function2<? super R, ? super v03.a, ? extends R> function2) {
            return function2.invoke(r, this);
        }
    }

    public static final class b implements xrd {
        @Override // defpackage.xrd
        public final float e(float f) {
            return f;
        }
    }

    public static final class c implements iy3 {
        @Override // defpackage.iy3
        public final float getDensity() {
            return 1.0f;
        }

        @Override // defpackage.iy3
        public final float p1() {
            return 1.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.xsd r9, long r10, defpackage.pu2 r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.b
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b r0 = new androidx.compose.foundation.gestures.b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            java.lang.Object r9 = r0.L$1
            iuc r9 = (defpackage.iuc) r9
            java.lang.Object r10 = r0.L$0
            xsd r10 = (defpackage.xsd) r10
            defpackage.r7d.b(r12)
            r7 = r9
            r9 = r10
            goto L58
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            r9 = 0
            return r9
        L36:
            defpackage.r7d.b(r12)
            iuc r7 = new iuc
            r7.<init>()
            fsd r3 = new fsd
            r8 = 0
            r4 = r9
            r5 = r10
            r3.<init>(r4, r5, r7, r8)
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r2
            n4a r9 = defpackage.n4a.a
            java.lang.Object r9 = r4.f(r9, r3, r0)
            g13 r10 = defpackage.g13.a
            if (r9 != r10) goto L57
            return r10
        L57:
            r9 = r4
        L58:
            float r10 = r7.element
            long r9 = r9.h(r10)
            ooa r11 = new ooa
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.a(xsd, long, pu2):java.lang.Object");
    }

    public static e b(ggf ggfVar, dwa dwaVar, boolean z, boolean z2, d3a d3aVar) {
        return new ScrollableElement(ggfVar, dwaVar, z, z2, d3aVar);
    }
}
