package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.w;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mm8 extends tia {
    public static final f80 N0;
    public lm8 J0;
    public iq2 K0;
    public a L0;
    public androidx.compose.ui.layout.b M0;

    public final class a extends x59 {
        public a() {
            super(mm8.this);
        }

        @Override // defpackage.pl7
        public final int K(int i) {
            mm8 mm8Var = mm8.this;
            lm8 lm8Var = mm8Var.J0;
            tia tiaVar = mm8Var.h0;
            tiaVar.getClass();
            x59 x59VarD1 = tiaVar.d1();
            x59VarD1.getClass();
            return lm8Var.v(this, x59VarD1, i);
        }

        @Override // defpackage.pl7
        public final int O(int i) {
            mm8 mm8Var = mm8.this;
            lm8 lm8Var = mm8Var.J0;
            tia tiaVar = mm8Var.h0;
            tiaVar.getClass();
            x59 x59VarD1 = tiaVar.d1();
            x59VarD1.getClass();
            return lm8Var.p(this, x59VarD1, i);
        }

        @Override // defpackage.pl7
        public final int P(int i) {
            mm8 mm8Var = mm8.this;
            lm8 lm8Var = mm8Var.J0;
            tia tiaVar = mm8Var.h0;
            tiaVar.getClass();
            x59 x59VarD1 = tiaVar.d1();
            x59VarD1.getClass();
            return lm8Var.z(this, x59VarD1, i);
        }

        @Override // defpackage.vf9
        public final w R(long j) {
            l0(j);
            iq2 iq2Var = new iq2(j);
            mm8 mm8Var = mm8.this;
            mm8Var.K0 = iq2Var;
            lm8 lm8Var = mm8Var.J0;
            tia tiaVar = mm8Var.h0;
            tiaVar.getClass();
            x59 x59VarD1 = tiaVar.d1();
            x59VarD1.getClass();
            x59.O0(this, lm8Var.d(this, x59VarD1, j));
            return this;
        }

        @Override // defpackage.w59
        public final int s0(d20 d20Var) {
            int iG = boa.g(this, d20Var);
            this.j0.h(iG, d20Var);
            return iG;
        }

        @Override // defpackage.pl7
        public final int w(int i) {
            mm8 mm8Var = mm8.this;
            lm8 lm8Var = mm8Var.J0;
            tia tiaVar = mm8Var.h0;
            tiaVar.getClass();
            x59 x59VarD1 = tiaVar.d1();
            x59VarD1.getClass();
            return lm8Var.r(this, x59VarD1, i);
        }
    }

    public static final class b implements bg9 {
        public final /* synthetic */ bg9 a;
        public final int b;
        public final int c;

        public b(bg9 bg9Var, mm8 mm8Var) {
            this.a = bg9Var;
            a aVar = mm8Var.L0;
            aVar.getClass();
            this.b = aVar.a;
            a aVar2 = mm8Var.L0;
            aVar2.getClass();
            this.c = aVar2.b;
        }

        @Override // defpackage.bg9
        public final int getHeight() {
            return this.c;
        }

        @Override // defpackage.bg9
        public final int getWidth() {
            return this.b;
        }

        @Override // defpackage.bg9
        public final void j() {
            this.a.j();
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

    static {
        f80 f80VarA = g80.a();
        f80VarA.d(da2.g);
        f80VarA.q(1.0f);
        f80VarA.r(1);
        N0 = f80VarA;
    }

    public mm8(pm8 pm8Var, lm8 lm8Var) {
        super(pm8Var);
        this.J0 = lm8Var;
        this.L0 = pm8Var.V != null ? new a() : null;
        this.M0 = (lm8Var.k().c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new androidx.compose.ui.layout.b(this, (androidx.compose.ui.layout.a) lm8Var) : null;
    }

    @Override // defpackage.pl7
    public final int K(int i) {
        androidx.compose.ui.layout.b bVar = this.M0;
        if (bVar != null) {
            androidx.compose.ui.layout.a aVar = bVar.b;
            tia tiaVar = this.h0;
            tiaVar.getClass();
            return aVar.z0(bVar, tiaVar, i);
        }
        lm8 lm8Var = this.J0;
        tia tiaVar2 = this.h0;
        tiaVar2.getClass();
        return lm8Var.v(this, tiaVar2, i);
    }

    @Override // defpackage.pl7
    public final int O(int i) {
        androidx.compose.ui.layout.b bVar = this.M0;
        if (bVar != null) {
            androidx.compose.ui.layout.a aVar = bVar.b;
            tia tiaVar = this.h0;
            tiaVar.getClass();
            return aVar.b0(bVar, tiaVar, i);
        }
        lm8 lm8Var = this.J0;
        tia tiaVar2 = this.h0;
        tiaVar2.getClass();
        return lm8Var.p(this, tiaVar2, i);
    }

    @Override // defpackage.pl7
    public final int P(int i) {
        androidx.compose.ui.layout.b bVar = this.M0;
        if (bVar != null) {
            androidx.compose.ui.layout.a aVar = bVar.b;
            tia tiaVar = this.h0;
            tiaVar.getClass();
            return aVar.c1(bVar, tiaVar, i);
        }
        lm8 lm8Var = this.J0;
        tia tiaVar2 = this.h0;
        tiaVar2.getClass();
        return lm8Var.z(this, tiaVar2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    @Override // defpackage.vf9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.layout.w R(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.g0
            r1 = 0
            if (r0 == 0) goto L12
            iq2 r9 = r8.K0
            if (r9 == 0) goto Lc
            long r9 = r9.a
            goto L12
        Lc:
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            defpackage.l5.q(r8)
            return r1
        L12:
            r8.l0(r9)
            androidx.compose.ui.layout.b r0 = r8.M0
            if (r0 == 0) goto La9
            androidx.compose.ui.layout.a r2 = r0.b
            mm8 r3 = r0.a
            mm8$a r3 = r3.L0
            r3.getClass()
            bg9 r3 = r3.G0()
            r3.getWidth()
            r3.getHeight()
            boolean r3 = r2.e1()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L42
            iq2 r3 = r8.K0
            if (r3 != 0) goto L39
            goto L42
        L39:
            long r6 = r3.a
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L40
            goto L42
        L40:
            r9 = r5
            goto L43
        L42:
            r9 = r4
        L43:
            r0.c = r9
            if (r9 != 0) goto L4e
            tia r9 = r8.h0
            r9.getClass()
            r9.g0 = r4
        L4e:
            tia r9 = r8.h0
            r9.getClass()
            bg9 r9 = r2.a0()
            tia r10 = r8.h0
            r10.getClass()
            r10.g0 = r5
            int r10 = r9.getWidth()
            mm8$a r2 = r8.L0
            r2.getClass()
            int r2 = r2.a
            if (r10 != r2) goto L79
            int r10 = r9.getHeight()
            mm8$a r2 = r8.L0
            r2.getClass()
            int r2 = r2.b
            if (r10 != r2) goto L79
            goto L7a
        L79:
            r4 = r5
        L7a:
            boolean r10 = r0.c
            if (r10 != 0) goto Lb4
            tia r10 = r8.h0
            r10.getClass()
            long r2 = r10.c
            tia r10 = r8.h0
            r10.getClass()
            x59 r10 = r10.d1()
            if (r10 == 0) goto L9a
            long r0 = r10.P0()
            th7 r10 = new th7
            r10.<init>(r0)
            r1 = r10
        L9a:
            boolean r10 = defpackage.th7.a(r1, r2)
            if (r10 == 0) goto Lb4
            if (r4 != 0) goto Lb4
            mm8$b r10 = new mm8$b
            r10.<init>(r9, r8)
            r9 = r10
            goto Lb4
        La9:
            lm8 r0 = r8.J0
            tia r1 = r8.h0
            r1.getClass()
            bg9 r9 = r0.d(r8, r1, r9)
        Lb4:
            r8.W1(r9)
            r8.O1()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm8.R(long):androidx.compose.ui.layout.w");
    }

    @Override // defpackage.tia
    public final void S1(ww1 ww1Var, xc6 xc6Var) {
        tia tiaVar;
        tia tiaVar2 = this.h0;
        tiaVar2.getClass();
        tiaVar2.U0(ww1Var, xc6Var);
        if (!tm8.a(this.e0).getShowLayoutBounds() || (tiaVar = this.h0) == null) {
            return;
        }
        if (th7.b(this.c, tiaVar.c) && lh7.b(tiaVar.r0, 0L)) {
            return;
        }
        long j = this.c;
        ww1Var.t(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, N0);
    }

    @Override // defpackage.tia
    public final void Z0() {
        if (this.L0 == null) {
            this.L0 = new a();
        }
    }

    @Override // defpackage.tia
    public final x59 d1() {
        return this.L0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e2() {
        /*
            r7 = this;
            boolean r0 = r7.Y
            if (r0 == 0) goto L5
            return
        L5:
            r7.Q1()
            androidx.compose.ui.layout.b r0 = r7.M0
            r1 = 0
            if (r0 == 0) goto L5a
            mm8$a r2 = r7.L0
            r2.getClass()
            boolean r0 = r0.c
            if (r0 != 0) goto L52
            long r2 = r7.c
            mm8$a r0 = r7.L0
            r4 = 0
            if (r0 == 0) goto L27
            long r5 = r0.P0()
            th7 r0 = new th7
            r0.<init>(r5)
            goto L28
        L27:
            r0 = r4
        L28:
            boolean r0 = defpackage.th7.a(r0, r2)
            if (r0 == 0) goto L52
            tia r0 = r7.h0
            r0.getClass()
            long r2 = r0.c
            tia r0 = r7.h0
            r0.getClass()
            x59 r0 = r0.d1()
            if (r0 == 0) goto L4a
            long r4 = r0.P0()
            th7 r0 = new th7
            r0.<init>(r4)
            r4 = r0
        L4a:
            boolean r0 = defpackage.th7.a(r4, r2)
            if (r0 == 0) goto L52
            r0 = 1
            goto L53
        L52:
            r0 = r1
        L53:
            tia r2 = r7.h0
            r2.getClass()
            r2.f0 = r0
        L5a:
            bg9 r0 = r7.G0()
            r0.j()
            tia r7 = r7.h0
            r7.getClass()
            r7.f0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm8.e2():void");
    }

    @Override // defpackage.tia
    public final e.c f1() {
        return this.J0.k();
    }

    public final void f2(lm8 lm8Var) {
        if (!lm8Var.equals(this.J0)) {
            if ((lm8Var.k().c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                androidx.compose.ui.layout.a aVar = (androidx.compose.ui.layout.a) lm8Var;
                androidx.compose.ui.layout.b bVar = this.M0;
                if (bVar != null) {
                    bVar.b = aVar;
                } else {
                    bVar = new androidx.compose.ui.layout.b(this, aVar);
                }
                this.M0 = bVar;
            } else {
                this.M0 = null;
            }
        }
        this.J0 = lm8Var;
    }

    @Override // defpackage.tia, androidx.compose.ui.layout.w
    public final void g0(long j, float f, xc6 xc6Var) {
        super.g0(j, f, xc6Var);
        e2();
    }

    @Override // defpackage.tia, androidx.compose.ui.layout.w
    public final void h0(long j, float f, Function1<? super cd6, j6g> function1) {
        super.h0(j, f, function1);
        e2();
    }

    @Override // defpackage.w59
    public final int s0(d20 d20Var) {
        a aVar = this.L0;
        if (aVar == null) {
            return boa.g(this, d20Var);
        }
        o3a<d20> o3aVar = aVar.j0;
        int iD = o3aVar.d(d20Var);
        if (iD >= 0) {
            return o3aVar.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.pl7
    public final int w(int i) {
        androidx.compose.ui.layout.b bVar = this.M0;
        if (bVar != null) {
            androidx.compose.ui.layout.a aVar = bVar.b;
            tia tiaVar = this.h0;
            tiaVar.getClass();
            return aVar.J0(bVar, tiaVar, i);
        }
        lm8 lm8Var = this.J0;
        tia tiaVar2 = this.h0;
        tiaVar2.getClass();
        return lm8Var.r(this, tiaVar2, i);
    }
}
