package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import defpackage.epg;
import defpackage.nzg;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l44 extends n1 implements tpa {
    public final Window a0;
    public final g4a b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;

    public static final class a extends nzg.b {
        public a() {
            super(1);
        }

        @Override // nzg.b
        public final rzg d(rzg rzgVar, List<nzg> list) {
            l44 l44Var = l44.this;
            if (!l44Var.d0) {
                View childAt = l44Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, l44Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, l44Var.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return rzgVar.a.n(iMax, iMax2, iMax3, iMax4);
                }
            }
            return rzgVar;
        }

        @Override // nzg.b
        public final nzg.a e(nzg nzgVar, nzg.a aVar) {
            l44 l44Var = l44.this;
            if (!l44Var.d0) {
                View childAt = l44Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, l44Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, l44Var.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    kf7 kf7VarB = kf7.b(iMax, iMax2, iMax3, iMax4);
                    int i = kf7VarB.a;
                    kf7 kf7Var = aVar.a;
                    int i2 = kf7VarB.b;
                    int i3 = kf7VarB.c;
                    int i4 = kf7VarB.d;
                    return new nzg.a(rzg.e(kf7Var, i, i2, i3, i4), rzg.e(aVar.b, i, i2, i3, i4));
                }
            }
            return aVar;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            l44.this.a(ka2.L(this.$$changed | 1), bVar);
            return j6g.a;
        }
    }

    public l44(Window window, Context context) {
        super(context, null, 6, 0);
        this.a0 = window;
        this.b0 = r.f(dh2.a);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.d.m(this, this);
        epg.q(this, new a());
    }

    @Override // defpackage.n1
    public final void a(int i, androidx.compose.runtime.b bVar) {
        int i2;
        c cVarH = bVar.h(1735448596);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) ((gme) this.b0).getValue()).invoke(cVarH, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new b(i);
        }
    }

    @Override // defpackage.tpa
    public final rzg b(View view, rzg rzgVar) {
        if (!this.d0) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return rzgVar.a.n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return rzgVar;
    }

    @Override // defpackage.n1
    public final void g(int i, int i2, int i3, boolean z, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // defpackage.n1
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f0;
    }

    @Override // defpackage.n1
    public final void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.h(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.a0;
        int i3 = (mode != Integer.MIN_VALUE || this.c0 || this.d0 || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i3 - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.d0 || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.c0) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
