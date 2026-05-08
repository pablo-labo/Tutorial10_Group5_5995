package androidx.media3.ui;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.c;
import androidx.media3.ui.e;
import androidx.recyclerview.widget.RecyclerView;
import com.indeed.android.jobsearch.R;
import defpackage.bh5;
import defpackage.cdb;
import defpackage.dqf;
import defpackage.e47;
import defpackage.emf;
import defpackage.gdb;
import defpackage.jj9;
import defpackage.ka2;
import defpackage.l5;
import defpackage.mh3;
import defpackage.nb3;
import defpackage.nfa;
import defpackage.qr3;
import defpackage.qyc;
import defpackage.rdb;
import defpackage.vjg;
import defpackage.wqf;
import defpackage.zkd;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes.dex */
public final class c extends FrameLayout {
    public static final float[] w1;
    public final TextView A0;
    public final TextView B0;
    public final androidx.media3.ui.e C0;
    public final StringBuilder D0;
    public final Formatter E0;
    public final emf.b F0;
    public final emf.d G0;
    public final qr3 H0;
    public final Drawable I0;
    public final Drawable J0;
    public final Drawable K0;
    public final Drawable L0;
    public final Drawable M0;
    public final String N0;
    public final String O0;
    public final String P0;
    public final Drawable Q0;
    public final Drawable R0;
    public final float S0;
    public final float T0;
    public final String U0;
    public final Class<?> V;
    public final String V0;
    public final Method W;
    public final Drawable W0;
    public final Drawable X0;
    public final String Y0;
    public final String Z0;
    public final rdb a;
    public final Method a0;
    public final Drawable a1;
    public final Resources b;
    public final CopyOnWriteArrayList<l> b0;
    public final Drawable b1;
    public final b c;
    public final RecyclerView c0;
    public final String c1;
    public final Class<?> d;
    public final g d0;
    public final String d1;
    public final Method e;
    public final d e0;
    public gdb e1;
    public final Method f;
    public final i f0;
    public InterfaceC0067c f1;
    public final a g0;
    public boolean g1;
    public final nfa h0;
    public boolean h1;
    public final PopupWindow i0;
    public boolean i1;
    public final int j0;
    public boolean j1;
    public final ImageView k0;
    public boolean k1;
    public final ImageView l0;
    public boolean l1;
    public final ImageView m0;
    public int m1;
    public final View n0;
    public boolean n1;
    public final View o0;
    public int o1;
    public final TextView p0;
    public int p1;
    public final TextView q0;
    public long[] q1;
    public final ImageView r0;
    public boolean[] r1;
    public final ImageView s0;
    public final long[] s1;
    public final ImageView t0;
    public final boolean[] t1;
    public final ImageView u0;
    public long u1;
    public final ImageView v0;
    public boolean v1;
    public final ImageView w0;
    public final View x0;
    public final View y0;
    public final View z0;

    public final class a extends k {
        public a() {
            super();
        }

        @Override // androidx.media3.ui.c.k
        public final void o(h hVar) {
            hVar.u.setText(R.string.exo_track_selection_auto);
            gdb gdbVar = c.this.e1;
            gdbVar.getClass();
            hVar.v.setVisibility(q(gdbVar.P()) ? 4 : 0);
            hVar.a.setOnClickListener(new View.OnClickListener() { // from class: jdb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c cVar = c.this;
                    gdb gdbVar2 = cVar.e1;
                    if (gdbVar2 == null || !gdbVar2.O0(29)) {
                        return;
                    }
                    dqf dqfVarP = cVar.e1.P();
                    gdb gdbVar3 = cVar.e1;
                    String str = vjg.a;
                    gdbVar3.v(dqfVarP.a().d(1).m(1, false).b());
                    c.g gVar = cVar.d0;
                    gVar.e[1] = cVar.getResources().getString(R.string.exo_track_selection_auto);
                    cVar.i0.dismiss();
                }
            });
        }

        @Override // androidx.media3.ui.c.k
        public final void p(String str) {
            c.this.d0.e[1] = str;
        }

        public final boolean q(dqf dqfVar) {
            for (int i = 0; i < this.d.size(); i++) {
                if (dqfVar.D.containsKey(this.d.get(i).a.b)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final class b implements gdb.c, e.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // androidx.media3.ui.e.a
        public final void C(long j) {
            c cVar = c.this;
            TextView textView = cVar.B0;
            if (textView != null) {
                textView.setText(vjg.D(cVar.D0, cVar.E0, j));
            }
            if (cVar.k(cVar.e1)) {
                c.a(cVar, cVar.e1, j);
            }
        }

        @Override // androidx.media3.ui.e.a
        public final void F(long j, boolean z) {
            c cVar = c.this;
            cVar.l1 = false;
            gdb gdbVar = cVar.e1;
            if (gdbVar != null) {
                if (!z) {
                    c.a(cVar, gdbVar, j);
                }
                if (cVar.i(cVar.e1)) {
                    try {
                        Method method = cVar.e;
                        method.getClass();
                        method.invoke(cVar.e1, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        l5.r(e);
                        return;
                    }
                } else if (cVar.h(cVar.e1)) {
                    try {
                        Method method2 = cVar.W;
                        method2.getClass();
                        method2.invoke(cVar.e1, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        l5.r(e2);
                        return;
                    }
                }
            }
            cVar.a.g();
        }

        @Override // gdb.c
        public final void o(gdb.b bVar) {
            bh5 bh5Var = bVar.a;
            boolean zA = bh5Var.a(4, 5, 13);
            c cVar = c.this;
            if (zA) {
                cVar.q();
            }
            if (bh5Var.a(4, 5, 7, 13)) {
                cVar.s();
            }
            if (bh5Var.a(8, 13)) {
                cVar.t();
            }
            if (bh5Var.a(9, 13)) {
                cVar.v();
            }
            if (bh5Var.a(8, 9, 11, 0, 16, 17, 13)) {
                cVar.p();
            }
            if (bh5Var.a(11, 0, 13)) {
                cVar.w();
            }
            if (bh5Var.a(12, 13)) {
                cVar.r();
            }
            if (bh5Var.a(2, 13)) {
                cVar.x();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c cVar = c.this;
            ImageView imageView = cVar.u0;
            View view2 = cVar.z0;
            View view3 = cVar.y0;
            View view4 = cVar.x0;
            rdb rdbVar = cVar.a;
            gdb gdbVar = cVar.e1;
            if (gdbVar == null) {
                return;
            }
            rdbVar.g();
            if (cVar.l0 == view) {
                if (gdbVar.O0(9)) {
                    gdbVar.Q();
                    return;
                }
                return;
            }
            if (cVar.k0 == view) {
                if (gdbVar.O0(7)) {
                    gdbVar.z();
                    return;
                }
                return;
            }
            if (cVar.n0 == view) {
                if (gdbVar.b() == 4 || !gdbVar.O0(12)) {
                    return;
                }
                gdbVar.G0();
                return;
            }
            if (cVar.o0 == view) {
                if (gdbVar.O0(11)) {
                    gdbVar.H0();
                    return;
                }
                return;
            }
            if (cVar.m0 == view) {
                if (vjg.Z(gdbVar, cVar.j1)) {
                    vjg.G(gdbVar);
                    return;
                } else {
                    if (gdbVar.O0(1)) {
                        gdbVar.c();
                        return;
                    }
                    return;
                }
            }
            if (cVar.r0 == view) {
                if (gdbVar.O0(15)) {
                    int i = gdbVar.i();
                    int i2 = cVar.p1;
                    for (int i3 = 1; i3 <= 2; i3++) {
                        int i4 = (i + i3) % 3;
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 != 2 || (i2 & 2) == 0) {
                                }
                            } else if ((i2 & 1) == 0) {
                            }
                        }
                        i = i4;
                    }
                    gdbVar.w0(i);
                    return;
                }
                return;
            }
            if (cVar.s0 == view) {
                if (gdbVar.O0(14)) {
                    gdbVar.X(!gdbVar.D0());
                    return;
                }
                return;
            }
            if (view4 == view) {
                rdbVar.f();
                cVar.e(cVar.d0, view4);
                return;
            }
            if (view3 == view) {
                rdbVar.f();
                cVar.e(cVar.e0, view3);
            } else if (view2 == view) {
                rdbVar.f();
                cVar.e(cVar.g0, view2);
            } else if (imageView == view) {
                rdbVar.f();
                cVar.e(cVar.f0, imageView);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            c cVar = c.this;
            if (cVar.v1) {
                cVar.a.g();
            }
        }

        @Override // androidx.media3.ui.e.a
        public final void x(long j) {
            c cVar = c.this;
            cVar.l1 = true;
            TextView textView = cVar.B0;
            if (textView != null) {
                textView.setText(vjg.D(cVar.D0, cVar.E0, j));
            }
            cVar.a.f();
            gdb gdbVar = cVar.e1;
            if (gdbVar == null || !cVar.n1) {
                return;
            }
            if (cVar.i(gdbVar)) {
                try {
                    Method method = cVar.e;
                    method.getClass();
                    method.invoke(cVar.e1, Boolean.TRUE);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    l5.r(e);
                    return;
                }
            }
            if (!cVar.h(cVar.e1)) {
                StringBuilder sb = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                gdb gdbVar2 = cVar.e1;
                gdbVar2.getClass();
                sb.append(gdbVar2.getClass());
                zkd.T("PlayerControlView", sb.toString());
                return;
            }
            try {
                Method method2 = cVar.W;
                method2.getClass();
                method2.invoke(cVar.e1, Boolean.TRUE);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                l5.r(e2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$c, reason: collision with other inner class name */
    @Deprecated
    public interface InterfaceC0067c {
    }

    public final class d extends RecyclerView.e<h> {
        public final String[] d;
        public final float[] e;
        public int f;

        public d(String[] strArr, float[] fArr) {
            this.d = strArr;
            this.e = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int c() {
            return this.d.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void g(RecyclerView.b0 b0Var, final int i) {
            h hVar = (h) b0Var;
            View view = hVar.v;
            View view2 = hVar.a;
            String[] strArr = this.d;
            if (i < strArr.length) {
                hVar.u.setText(strArr[i]);
            }
            if (i == this.f) {
                view2.setSelected(true);
                view.setVisibility(0);
            } else {
                view2.setSelected(false);
                view.setVisibility(4);
            }
            view2.setOnClickListener(new View.OnClickListener() { // from class: kdb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    c.d dVar = this.a;
                    c cVar = c.this;
                    int i2 = dVar.f;
                    int i3 = i;
                    if (i3 != i2) {
                        cVar.setPlaybackSpeed(dVar.e[i3]);
                    }
                    cVar.i0.dismiss();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
            return new h(LayoutInflater.from(c.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public interface e {
    }

    public final class f extends RecyclerView.b0 {
        public final TextView u;
        public final TextView v;
        public final ImageView w;

        public f(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.exo_main_text);
            this.v = (TextView) view.findViewById(R.id.exo_sub_text);
            this.w = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new mh3(this, 1));
        }
    }

    public class g extends RecyclerView.e<f> {
        public final String[] d;
        public final String[] e;
        public final Drawable[] f;

        public g(String[] strArr, Drawable[] drawableArr) {
            this.d = strArr;
            this.e = new String[strArr.length];
            this.f = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int c() {
            return this.d.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final long d(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void g(RecyclerView.b0 b0Var, int i) {
            f fVar = (f) b0Var;
            boolean zN = n(i);
            View view = fVar.a;
            if (zN) {
                view.setLayoutParams(new RecyclerView.n(-1, -2));
            } else {
                view.setLayoutParams(new RecyclerView.n(0, 0));
            }
            fVar.u.setText(this.d[i]);
            String str = this.e[i];
            TextView textView = fVar.v;
            if (str == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
            Drawable drawable = this.f[i];
            ImageView imageView = fVar.w;
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
            c cVar = c.this;
            return cVar.new f(LayoutInflater.from(cVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }

        public final boolean n(int i) {
            c cVar = c.this;
            gdb gdbVar = cVar.e1;
            if (gdbVar == null) {
                return false;
            }
            return i != 0 ? i != 1 || (gdbVar.O0(30) && cVar.e1.O0(29)) : gdbVar.O0(13);
        }
    }

    public static class h extends RecyclerView.b0 {
        public final TextView u;
        public final View v;

        public h(View view) {
            super(view);
            this.u = (TextView) view.findViewById(R.id.exo_text);
            this.v = view.findViewById(R.id.exo_check);
        }
    }

    public final class i extends k {
        public i() {
            super();
        }

        @Override // androidx.media3.ui.c.k, androidx.recyclerview.widget.RecyclerView.e
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final void g(h hVar, int i) {
            super.g(hVar, i);
            if (i > 0) {
                j jVar = this.d.get(i - 1);
                hVar.v.setVisibility(jVar.a.e[jVar.b] ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.c.k
        public final void o(h hVar) {
            int i;
            boolean z;
            hVar.u.setText(R.string.exo_track_selection_none);
            int i2 = 0;
            while (true) {
                i = 1;
                if (i2 >= this.d.size()) {
                    z = true;
                    break;
                }
                j jVar = this.d.get(i2);
                if (jVar.a.e[jVar.b]) {
                    z = false;
                    break;
                }
                i2++;
            }
            hVar.v.setVisibility(z ? 0 : 4);
            hVar.a.setOnClickListener(new nb3(this, i));
        }

        @Override // androidx.media3.ui.c.k
        public final void p(String str) {
        }

        public final void q(List<j> list) {
            c cVar = c.this;
            ImageView imageView = cVar.u0;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= ((qyc) list).d) {
                    break;
                }
                j jVar = (j) ((qyc) list).get(i);
                if (jVar.a.e[jVar.b]) {
                    z = true;
                    break;
                }
                i++;
            }
            if (imageView != null) {
                imageView.setImageDrawable(z ? cVar.W0 : cVar.X0);
                imageView.setContentDescription(z ? cVar.Y0 : cVar.Z0);
            }
            this.d = list;
        }
    }

    public static final class j {
        public final wqf.a a;
        public final int b;
        public final String c;

        public j(wqf wqfVar, int i, int i2, String str) {
            this.a = wqfVar.a.get(i);
            this.b = i2;
            this.c = str;
        }
    }

    public abstract class k extends RecyclerView.e<h> {
        public List<j> d = new ArrayList();

        public k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int c() {
            if (this.d.isEmpty()) {
                return 0;
            }
            return this.d.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
            return new h(LayoutInflater.from(c.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
        @Override // androidx.recyclerview.widget.RecyclerView.e
        /* JADX INFO: renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void g(androidx.media3.ui.c.h r7, int r8) {
            /*
                r6 = this;
                androidx.media3.ui.c r0 = androidx.media3.ui.c.this
                gdb r0 = r0.e1
                if (r0 != 0) goto L7
                return
            L7:
                if (r8 != 0) goto Ld
                r6.o(r7)
                return
            Ld:
                java.util.List<androidx.media3.ui.c$j> r1 = r6.d
                r2 = 1
                int r8 = r8 - r2
                java.lang.Object r8 = r1.get(r8)
                androidx.media3.ui.c$j r8 = (androidx.media3.ui.c.j) r8
                wqf$a r1 = r8.a
                wpf r1 = r1.b
                dqf r3 = r0.P()
                f47<wpf, cqf> r3 = r3.D
                java.lang.Object r3 = r3.get(r1)
                r4 = 0
                if (r3 == 0) goto L33
                wqf$a r3 = r8.a
                int r5 = r8.b
                boolean[] r3 = r3.e
                boolean r3 = r3[r5]
                if (r3 == 0) goto L33
                goto L34
            L33:
                r2 = r4
            L34:
                android.widget.TextView r3 = r7.u
                java.lang.String r5 = r8.c
                r3.setText(r5)
                android.view.View r3 = r7.v
                if (r2 == 0) goto L40
                goto L41
            L40:
                r4 = 4
            L41:
                r3.setVisibility(r4)
                android.view.View r7 = r7.a
                ldb r2 = new ldb
                r2.<init>()
                r7.setOnClickListener(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.c.k.g(androidx.media3.ui.c$h, int):void");
        }

        public abstract void o(h hVar);

        public abstract void p(String str);
    }

    @Deprecated
    public interface l {
        void x(int i);
    }

    static {
        jj9.a("media3.ui");
        w1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0454  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r36, android.util.AttributeSet r37) throws java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 1546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void a(c cVar, gdb gdbVar, long j2) {
        if (cVar.k1) {
            if (gdbVar.O0(17) && gdbVar.O0(10)) {
                emf emfVarM = gdbVar.M();
                int iO = emfVarM.o();
                int i2 = 0;
                while (true) {
                    long jC0 = vjg.c0(emfVarM.m(i2, cVar.G0, 0L).l);
                    if (j2 < jC0) {
                        break;
                    }
                    if (i2 == iO - 1) {
                        j2 = jC0;
                        break;
                    } else {
                        j2 -= jC0;
                        i2++;
                    }
                }
                gdbVar.U(i2, j2);
            }
        } else if (gdbVar.O0(5)) {
            gdbVar.j0(j2);
        }
        cVar.s();
    }

    public static boolean c(gdb gdbVar, emf.d dVar) {
        emf emfVarM;
        int iO;
        if (!gdbVar.O0(17) || (iO = (emfVarM = gdbVar.M()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i2 = 0; i2 < iO; i2++) {
            if (emfVarM.m(i2, dVar, 0L).l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f2) {
        gdb gdbVar = this.e1;
        if (gdbVar == null || !gdbVar.O0(13)) {
            return;
        }
        gdb gdbVar2 = this.e1;
        gdbVar2.g(new cdb(f2, gdbVar2.e().b));
    }

    public final boolean d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        gdb gdbVar = this.e1;
        if (gdbVar == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (gdbVar.b() != 4 && gdbVar.O0(12)) {
                    gdbVar.G0();
                }
            } else if (keyCode == 89 && gdbVar.O0(11)) {
                gdbVar.H0();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (vjg.Z(gdbVar, this.j1)) {
                        vjg.G(gdbVar);
                    } else if (gdbVar.O0(1)) {
                        gdbVar.c();
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            vjg.G(gdbVar);
                        } else if (keyCode == 127) {
                            String str = vjg.a;
                            if (gdbVar.O0(1)) {
                                gdbVar.c();
                            }
                        }
                    } else if (gdbVar.O0(7)) {
                        gdbVar.z();
                    }
                } else if (gdbVar.O0(9)) {
                    gdbVar.Q();
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return d(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e(RecyclerView.e<?> eVar, View view) {
        this.c0.setAdapter(eVar);
        u();
        this.v1 = false;
        PopupWindow popupWindow = this.i0;
        popupWindow.dismiss();
        this.v1 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i2 = this.j0;
        popupWindow.showAsDropDown(view, width - i2, (-popupWindow.getHeight()) - i2);
    }

    public final qyc f(wqf wqfVar, int i2) {
        e47.a aVar = new e47.a();
        e47<wqf.a> e47Var = wqfVar.a;
        for (int i3 = 0; i3 < e47Var.size(); i3++) {
            wqf.a aVar2 = e47Var.get(i3);
            if (aVar2.b.c == i2) {
                for (int i4 = 0; i4 < aVar2.a; i4++) {
                    if (aVar2.b(i4)) {
                        androidx.media3.common.a aVarA = aVar2.a(i4);
                        if ((aVarA.e & 2) == 0) {
                            aVar.c(new j(wqfVar, i3, i4, this.h0.a(aVarA)));
                        }
                    }
                }
            }
        }
        return aVar.f();
    }

    public final void g() {
        rdb rdbVar = this.a;
        int i2 = rdbVar.z;
        if (i2 == 3 || i2 == 2) {
            return;
        }
        rdbVar.f();
        if (!rdbVar.C) {
            rdbVar.i(2);
        } else if (rdbVar.z == 1) {
            rdbVar.m.start();
        } else {
            rdbVar.n.start();
        }
    }

    public gdb getPlayer() {
        return this.e1;
    }

    public int getRepeatToggleModes() {
        return this.p1;
    }

    public boolean getShowShuffleButton() {
        return this.a.b(this.s0);
    }

    public boolean getShowSubtitleButton() {
        return this.a.b(this.u0);
    }

    public int getShowTimeoutMs() {
        return this.m1;
    }

    public boolean getShowVrButton() {
        return this.a.b(this.t0);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public final boolean h(gdb gdbVar) {
        Class<?> cls;
        return (gdbVar == null || (cls = this.V) == null || !cls.isAssignableFrom(gdbVar.getClass())) ? false : true;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public final boolean i(gdb gdbVar) {
        Class<?> cls;
        return (gdbVar == null || (cls = this.d) == null || !cls.isAssignableFrom(gdbVar.getClass())) ? false : true;
    }

    public final boolean j() {
        rdb rdbVar = this.a;
        return rdbVar.z == 0 && rdbVar.a.l();
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public final boolean k(gdb gdbVar) {
        try {
            if (i(gdbVar)) {
                Method method = this.f;
                method.getClass();
                Object objInvoke = method.invoke(gdbVar, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (h(gdbVar)) {
                Method method2 = this.a0;
                method2.getClass();
                Object objInvoke2 = method2.invoke(gdbVar, null);
                objInvoke2.getClass();
                if (((Boolean) objInvoke2).booleanValue()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalAccessException e2) {
            e = e2;
            l5.r(e);
            return false;
        } catch (InvocationTargetException e3) {
            e = e3;
            l5.r(e);
            return false;
        }
    }

    public final boolean l() {
        return getVisibility() == 0;
    }

    public final void m() {
        q();
        p();
        t();
        v();
        x();
        r();
        w();
    }

    public final void n(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.S0 : this.T0);
    }

    public final void o(boolean z) {
        PlayerView.d dVar;
        if (this.g1 == z) {
            return;
        }
        this.g1 = z;
        String str = this.d1;
        Drawable drawable = this.b1;
        String str2 = this.c1;
        Drawable drawable2 = this.a1;
        ImageView imageView = this.v0;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.w0;
        if (imageView2 != null) {
            if (z) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        InterfaceC0067c interfaceC0067c = this.f1;
        if (interfaceC0067c == null || (dVar = PlayerView.this.n0) == null) {
            return;
        }
        dVar.e(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rdb rdbVar = this.a;
        rdbVar.a.addOnLayoutChangeListener(rdbVar.x);
        this.h1 = true;
        if (j()) {
            rdbVar.g();
        }
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rdb rdbVar = this.a;
        rdbVar.a.removeOnLayoutChangeListener(rdbVar.x);
        this.h1 = false;
        removeCallbacks(this.H0);
        rdbVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.a.b;
        if (view != null) {
            view.layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    public final void p() {
        boolean zO0;
        boolean zO02;
        boolean zO03;
        boolean zO04;
        boolean zO05;
        if (l() && this.h1) {
            gdb gdbVar = this.e1;
            if (gdbVar != null) {
                zO0 = (this.i1 && c(gdbVar, this.G0)) ? gdbVar.O0(10) : gdbVar.O0(5);
                zO03 = gdbVar.O0(7);
                zO04 = gdbVar.O0(11);
                zO05 = gdbVar.O0(12);
                zO02 = gdbVar.O0(9);
            } else {
                zO0 = false;
                zO02 = false;
                zO03 = false;
                zO04 = false;
                zO05 = false;
            }
            Resources resources = this.b;
            View view = this.o0;
            if (zO04) {
                gdb gdbVar2 = this.e1;
                int iL0 = (int) ((gdbVar2 != null ? gdbVar2.L0() : 5000L) / 1000);
                TextView textView = this.q0;
                if (textView != null) {
                    textView.setText(String.valueOf(iL0));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, iL0, Integer.valueOf(iL0)));
                }
            }
            View view2 = this.n0;
            if (zO05) {
                gdb gdbVar3 = this.e1;
                int iN0 = (int) ((gdbVar3 != null ? gdbVar3.n0() : 15000L) / 1000);
                TextView textView2 = this.p0;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iN0));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, iN0, Integer.valueOf(iN0)));
                }
            }
            n(this.k0, zO03);
            n(view, zO04);
            n(view2, zO05);
            n(this.l0, zO02);
            androidx.media3.ui.e eVar = this.C0;
            if (eVar != null) {
                eVar.setEnabled(zO0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r4 = this;
            boolean r0 = r4.l()
            if (r0 == 0) goto L55
            boolean r0 = r4.h1
            if (r0 != 0) goto Lb
            goto L55
        Lb:
            android.widget.ImageView r0 = r4.m0
            if (r0 == 0) goto L55
            gdb r1 = r4.e1
            boolean r2 = r4.j1
            boolean r1 = defpackage.vjg.Z(r1, r2)
            if (r1 == 0) goto L1c
            android.graphics.drawable.Drawable r2 = r4.I0
            goto L1e
        L1c:
            android.graphics.drawable.Drawable r2 = r4.J0
        L1e:
            if (r1 == 0) goto L24
            r1 = 2131952085(0x7f1301d5, float:1.9540603E38)
            goto L27
        L24:
            r1 = 2131952084(0x7f1301d4, float:1.95406E38)
        L27:
            r0.setImageDrawable(r2)
            android.content.res.Resources r2 = r4.b
            java.lang.String r1 = r2.getString(r1)
            r0.setContentDescription(r1)
            gdb r1 = r4.e1
            if (r1 == 0) goto L51
            r2 = 1
            boolean r3 = r1.O0(r2)
            if (r3 == 0) goto L51
            r3 = 17
            boolean r3 = r1.O0(r3)
            if (r3 == 0) goto L52
            emf r1 = r1.M()
            boolean r1 = r1.p()
            if (r1 != 0) goto L51
            goto L52
        L51:
            r2 = 0
        L52:
            r4.n(r0, r2)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.c.q():void");
    }

    public final void r() {
        d dVar;
        gdb gdbVar = this.e1;
        if (gdbVar == null) {
            return;
        }
        float f2 = gdbVar.e().a;
        float f3 = Float.MAX_VALUE;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            dVar = this.e0;
            float[] fArr = dVar.e;
            if (i2 >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f2 - fArr[i2]);
            if (fAbs < f3) {
                i3 = i2;
                f3 = fAbs;
            }
            i2++;
        }
        dVar.f = i3;
        String str = dVar.d[i3];
        g gVar = this.d0;
        gVar.e[0] = str;
        n(this.x0, gVar.n(1) || gVar.n(0));
    }

    public final void s() {
        long jP0;
        long jE0;
        if (l() && this.h1) {
            gdb gdbVar = this.e1;
            if (gdbVar == null || !gdbVar.O0(16)) {
                jP0 = 0;
                jE0 = 0;
            } else {
                jP0 = gdbVar.p0() + this.u1;
                jE0 = gdbVar.E0() + this.u1;
            }
            TextView textView = this.B0;
            if (textView != null && !this.l1) {
                textView.setText(vjg.D(this.D0, this.E0, jP0));
            }
            androidx.media3.ui.e eVar = this.C0;
            if (eVar != null) {
                eVar.setPosition(jP0);
                if (k(gdbVar)) {
                    jE0 = jP0;
                }
                eVar.setBufferedPosition(jE0);
            }
            qr3 qr3Var = this.H0;
            removeCallbacks(qr3Var);
            int iB = gdbVar == null ? 1 : gdbVar.b();
            if (gdbVar != null && gdbVar.t0()) {
                long jMin = Math.min(eVar != null ? eVar.getPreferredUpdateDelay() : 1000L, 1000 - (jP0 % 1000));
                float f2 = gdbVar.e().a;
                postDelayed(qr3Var, vjg.j(f2 > 0.0f ? (long) (jMin / f2) : 1000L, this.o1, 1000L));
            } else {
                if (iB == 4 || iB == 1) {
                    return;
                }
                postDelayed(qr3Var, 1000L);
            }
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.a.C = z;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC0067c interfaceC0067c) {
        this.f1 = interfaceC0067c;
        boolean z = interfaceC0067c != null;
        ImageView imageView = this.v0;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = interfaceC0067c != null;
        ImageView imageView2 = this.w0;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(gdb gdbVar) {
        ka2.q(Looper.myLooper() == Looper.getMainLooper());
        ka2.l(gdbVar == null || gdbVar.Q0() == Looper.getMainLooper());
        gdb gdbVar2 = this.e1;
        if (gdbVar2 == gdbVar) {
            return;
        }
        b bVar = this.c;
        if (gdbVar2 != null) {
            gdbVar2.x0(bVar);
        }
        this.e1 = gdbVar;
        if (gdbVar != null) {
            gdbVar.Z(bVar);
        }
        m();
    }

    public void setProgressUpdateListener(e eVar) {
    }

    public void setRepeatToggleModes(int i2) {
        this.p1 = i2;
        gdb gdbVar = this.e1;
        if (gdbVar != null && gdbVar.O0(15)) {
            int i3 = this.e1.i();
            if (i2 == 0 && i3 != 0) {
                this.e1.w0(0);
            } else if (i2 == 1 && i3 == 2) {
                this.e1.w0(1);
            } else if (i2 == 2 && i3 == 1) {
                this.e1.w0(2);
            }
        }
        this.a.h(this.r0, i2 != 0);
        t();
    }

    public void setShowFastForwardButton(boolean z) {
        this.a.h(this.n0, z);
        p();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.i1 = z;
        w();
    }

    public void setShowNextButton(boolean z) {
        this.a.h(this.l0, z);
        p();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.j1 = z;
        q();
    }

    public void setShowPreviousButton(boolean z) {
        this.a.h(this.k0, z);
        p();
    }

    public void setShowRewindButton(boolean z) {
        this.a.h(this.o0, z);
        p();
    }

    public void setShowShuffleButton(boolean z) {
        this.a.h(this.s0, z);
        v();
    }

    public void setShowSubtitleButton(boolean z) {
        this.a.h(this.u0, z);
    }

    public void setShowTimeoutMs(int i2) {
        this.m1 = i2;
        if (j()) {
            this.a.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.a.h(this.t0, z);
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.o1 = vjg.i(i2, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.n1 = z;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.t0;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            n(imageView, onClickListener != null);
        }
    }

    public final void t() {
        ImageView imageView;
        if (l() && this.h1 && (imageView = this.r0) != null) {
            if (this.p1 == 0) {
                n(imageView, false);
                return;
            }
            gdb gdbVar = this.e1;
            String str = this.N0;
            Drawable drawable = this.K0;
            if (gdbVar == null || !gdbVar.O0(15)) {
                n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, true);
            int i2 = gdbVar.i();
            if (i2 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i2 == 1) {
                imageView.setImageDrawable(this.L0);
                imageView.setContentDescription(this.O0);
            } else {
                if (i2 != 2) {
                    return;
                }
                imageView.setImageDrawable(this.M0);
                imageView.setContentDescription(this.P0);
            }
        }
    }

    public final void u() {
        RecyclerView recyclerView = this.c0;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i2 = this.j0;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i2 * 2));
        PopupWindow popupWindow = this.i0;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i2 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void v() {
        ImageView imageView;
        if (l() && this.h1 && (imageView = this.s0) != null) {
            gdb gdbVar = this.e1;
            if (!this.a.b(imageView)) {
                n(imageView, false);
                return;
            }
            String str = this.V0;
            Drawable drawable = this.R0;
            if (gdbVar == null || !gdbVar.O0(14)) {
                n(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, true);
            if (gdbVar.D0()) {
                drawable = this.Q0;
            }
            imageView.setImageDrawable(drawable);
            if (gdbVar.D0()) {
                str = this.U0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w() {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.c.w():void");
    }

    public final void x() {
        i iVar = this.f0;
        iVar.getClass();
        List<j> list = Collections.EMPTY_LIST;
        iVar.d = list;
        a aVar = this.g0;
        aVar.getClass();
        aVar.d = list;
        gdb gdbVar = this.e1;
        ImageView imageView = this.u0;
        if (gdbVar != null && gdbVar.O0(30) && this.e1.O0(29)) {
            wqf wqfVarD = this.e1.D();
            qyc qycVarF = f(wqfVarD, 1);
            aVar.d = qycVarF;
            c cVar = c.this;
            gdb gdbVar2 = cVar.e1;
            g gVar = cVar.d0;
            gdbVar2.getClass();
            dqf dqfVarP = gdbVar2.P();
            if (!qycVarF.isEmpty()) {
                if (aVar.q(dqfVarP)) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= qycVarF.d) {
                            break;
                        }
                        j jVar = (j) qycVarF.get(i2);
                        if (jVar.a.e[jVar.b]) {
                            gVar.e[1] = jVar.c;
                            break;
                        }
                        i2++;
                    }
                } else {
                    gVar.e[1] = cVar.getResources().getString(R.string.exo_track_selection_auto);
                }
            } else {
                gVar.e[1] = cVar.getResources().getString(R.string.exo_track_selection_none);
            }
            if (this.a.b(imageView)) {
                iVar.q(f(wqfVarD, 3));
            } else {
                iVar.q(qyc.e);
            }
        }
        n(imageView, iVar.c() > 0);
        g gVar2 = this.d0;
        n(this.x0, gVar2.n(1) || gVar2.n(0));
    }
}
