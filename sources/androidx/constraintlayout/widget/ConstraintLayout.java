package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.eva;
import defpackage.fe6;
import defpackage.gq2;
import defpackage.hq2;
import defpackage.kq2;
import defpackage.nac;
import defpackage.ox8;
import defpackage.pc1;
import defpackage.rsg;
import defpackage.ssg;
import defpackage.tde;
import defpackage.wp2;
import defpackage.zp2;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static tde j0;
    public int V;
    public boolean W;
    public final SparseArray<View> a;
    public int a0;
    public final ArrayList<androidx.constraintlayout.widget.b> b;
    public c b0;
    public final hq2 c;
    public zp2 c0;
    public int d;
    public int d0;
    public int e;
    public HashMap<String, Integer> e0;
    public int f;
    public final SparseArray<gq2> f0;
    public final b g0;
    public int h0;
    public int i0;

    public class b implements pc1.b {
        public final ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public b(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        public static boolean a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @SuppressLint({"WrongCall"})
        public final void b(gq2 gq2Var, pc1.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMax;
            int iMax2;
            boolean z;
            int baseline;
            int i;
            wp2 wp2Var = gq2Var.K;
            wp2 wp2Var2 = gq2Var.I;
            if (gq2Var.h0 == 8 && !gq2Var.E) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
                return;
            }
            if (gq2Var.U == null) {
                return;
            }
            gq2.a aVar2 = aVar.a;
            gq2.a aVar3 = aVar.b;
            int i2 = aVar.c;
            int i3 = aVar.d;
            int i4 = this.b + this.c;
            int i5 = this.d;
            View view = gq2Var.g0;
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else if (iOrdinal == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
            } else if (iOrdinal == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
                boolean z2 = gq2Var.q == 1;
                int i6 = aVar.j;
                if (i6 == 1 || i6 == 2) {
                    boolean z3 = view.getMeasuredHeight() == gq2Var.i();
                    if (aVar.j == 2 || !z2 || ((z2 && z3) || (view instanceof e) || gq2Var.v())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gq2Var.l(), 1073741824);
                    }
                }
            } else if (iOrdinal != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i7 = this.f;
                int i8 = wp2Var2 != null ? wp2Var2.g : 0;
                if (wp2Var != null) {
                    i8 += wp2Var.g;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i5 + i8, -1);
            }
            int iOrdinal2 = aVar3.ordinal();
            if (iOrdinal2 == 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (iOrdinal2 == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
            } else if (iOrdinal2 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
                boolean z4 = gq2Var.r == 1;
                int i9 = aVar.j;
                if (i9 == 1 || i9 == 2) {
                    boolean z5 = view.getMeasuredWidth() == gq2Var.l();
                    if (aVar.j == 2 || !z4 || ((z4 && z5) || (view instanceof e) || gq2Var.w())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gq2Var.i(), 1073741824);
                    }
                }
            } else if (iOrdinal2 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i10 = this.g;
                int i11 = wp2Var2 != null ? gq2Var.J.g : 0;
                if (wp2Var != null) {
                    i11 += gq2Var.L.g;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, i4 + i11, -1);
            }
            hq2 hq2Var = (hq2) gq2Var.U;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (hq2Var != null && eva.b(constraintLayout.a0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) && view.getMeasuredWidth() == gq2Var.l() && view.getMeasuredWidth() < hq2Var.l() && view.getMeasuredHeight() == gq2Var.i() && view.getMeasuredHeight() < hq2Var.i() && view.getBaseline() == gq2Var.b0 && !gq2Var.u() && a(gq2Var.G, iMakeMeasureSpec, gq2Var.l()) && a(gq2Var.H, iMakeMeasureSpec2, gq2Var.i())) {
                aVar.e = gq2Var.l();
                aVar.f = gq2Var.i();
                aVar.g = gq2Var.b0;
                return;
            }
            gq2.a aVar4 = gq2.a.c;
            boolean z6 = aVar2 == aVar4;
            boolean z7 = aVar3 == aVar4;
            gq2.a aVar5 = gq2.a.a;
            gq2.a aVar6 = gq2.a.d;
            boolean z8 = aVar3 == aVar6 || aVar3 == aVar5;
            boolean z9 = aVar2 == aVar6 || aVar2 == aVar5;
            boolean z10 = z6 && gq2Var.X > 0.0f;
            boolean z11 = z7 && gq2Var.X > 0.0f;
            if (view == null) {
                return;
            }
            a aVar7 = (a) view.getLayoutParams();
            int i12 = aVar.j;
            if (i12 != 1 && i12 != 2 && z6 && gq2Var.q == 0 && z7 && gq2Var.r == 0) {
                i = -1;
                z = false;
                baseline = 0;
                iMax = 0;
                iMax2 = 0;
            } else {
                if (!(view instanceof rsg) || !(gq2Var instanceof ssg)) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                gq2Var.G = iMakeMeasureSpec;
                gq2Var.H = iMakeMeasureSpec2;
                gq2Var.g = false;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i13 = gq2Var.t;
                iMax = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
                int i14 = gq2Var.u;
                if (i14 > 0) {
                    iMax = Math.min(i14, iMax);
                }
                int i15 = gq2Var.w;
                iMax2 = i15 > 0 ? Math.max(i15, measuredHeight) : measuredHeight;
                int i16 = iMakeMeasureSpec2;
                int i17 = gq2Var.x;
                if (i17 > 0) {
                    iMax2 = Math.min(i17, iMax2);
                }
                if (!eva.b(constraintLayout.a0, 1)) {
                    if (z10 && z8) {
                        iMax = (int) ((iMax2 * gq2Var.X) + 0.5f);
                    } else if (z11 && z9) {
                        iMax2 = (int) ((iMax / gq2Var.X) + 0.5f);
                    }
                }
                if (measuredWidth == iMax && measuredHeight == iMax2) {
                    baseline = baseline2;
                    i = -1;
                    z = false;
                } else {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i16;
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    gq2Var.G = iMakeMeasureSpec;
                    gq2Var.H = iMakeMeasureSpec3;
                    z = false;
                    gq2Var.g = false;
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMax = measuredWidth2;
                    iMax2 = measuredHeight2;
                    i = -1;
                }
            }
            boolean z12 = baseline != i ? true : z;
            aVar.i = (iMax == aVar.c && iMax2 == aVar.d) ? z : true;
            boolean z13 = aVar7.b0 ? true : z12;
            if (z13 && baseline != -1 && gq2Var.b0 != baseline) {
                aVar.i = true;
            }
            aVar.e = iMax;
            aVar.f = iMax2;
            aVar.h = z13;
            aVar.g = baseline;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.c = new hq2();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.V = Integer.MAX_VALUE;
        this.W = true;
        this.a0 = 257;
        this.b0 = null;
        this.c0 = null;
        this.d0 = -1;
        this.e0 = new HashMap<>();
        this.f0 = new SparseArray<>();
        this.g0 = new b(this);
        this.h0 = 0;
        this.i0 = 0;
        c(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static tde getSharedValues() {
        if (j0 == null) {
            tde tdeVar = new tde();
            new SparseIntArray();
            new HashMap();
            j0 = tdeVar;
        }
        return j0;
    }

    public final gq2 b(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(new a(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void c(AttributeSet attributeSet, int i) {
        hq2 hq2Var = this.c;
        hq2Var.g0 = this;
        b bVar = this.g0;
        hq2Var.u0 = bVar;
        hq2Var.s0.f = bVar;
        this.a.put(getId(), this);
        this.b0 = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nac.b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 15) {
                    this.V = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.V);
                } else if (index == 112) {
                    this.a0 = typedArrayObtainStyledAttributes.getInt(index, this.a0);
                } else if (index == 55) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            e(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.c0 = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar = new c();
                        this.b0 = cVar;
                        cVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.b0 = null;
                    }
                    this.d0 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        hq2Var.D0 = this.a0;
        ox8.p = hq2Var.N(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final boolean d() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                arrayList.get(i).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void e(int i) {
        this.c0 = new zp2(getContext(), this, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.hq2 r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 1914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.f(hq2, int, int, int):void");
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.W = true;
        super.forceLayout();
    }

    public final void g(gq2 gq2Var, a aVar, SparseArray<gq2> sparseArray, int i, wp2.a aVar2) {
        View view = this.a.get(i);
        gq2 gq2Var2 = sparseArray.get(i);
        if (gq2Var2 == null || view == null || !(view.getLayoutParams() instanceof a)) {
            return;
        }
        aVar.b0 = true;
        wp2.a aVar3 = wp2.a.e;
        if (aVar2 == aVar3) {
            a aVar4 = (a) view.getLayoutParams();
            aVar4.b0 = true;
            aVar4.p0.D = true;
        }
        gq2Var.g(aVar3).a(gq2Var2.g(aVar2), aVar.C, aVar.B);
        gq2Var.D = true;
        gq2Var.g(wp2.a.b).g();
        gq2Var.g(wp2.a.d).g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.V;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.D0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            a aVar = (a) childAt.getLayoutParams();
            gq2 gq2Var = aVar.p0;
            if ((childAt.getVisibility() != 8 || aVar.c0 || aVar.d0 || zIsInEditMode) && !aVar.e0) {
                int iM = gq2Var.m();
                int iN = gq2Var.n();
                int iL = gq2Var.l() + iM;
                int i6 = gq2Var.i() + iN;
                childAt.layout(iM, iN, iL, i6);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iM, iN, iL, i6);
                }
            }
        }
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                arrayList.get(i7).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05b6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 1664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        gq2 gq2VarB = b(view);
        if ((view instanceof Guideline) && !(gq2VarB instanceof fe6)) {
            a aVar = (a) view.getLayoutParams();
            fe6 fe6Var = new fe6();
            aVar.p0 = fe6Var;
            aVar.c0 = true;
            fe6Var.J(aVar.U);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) view;
            bVar.i();
            ((a) view.getLayoutParams()).d0 = true;
            ArrayList<androidx.constraintlayout.widget.b> arrayList = this.b;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.a.put(view.getId(), view);
        this.W = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        gq2 gq2VarB = b(view);
        this.c.q0.remove(gq2VarB);
        gq2VarB.x();
        this.b.remove(view);
        this.W = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.W = true;
        super.requestLayout();
    }

    public void setConstraintSet(c cVar) {
        this.b0 = cVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray<View> sparseArray = this.a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.V) {
            return;
        }
        this.V = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(kq2 kq2Var) {
        zp2 zp2Var = this.c0;
        if (zp2Var != null) {
            zp2Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.a0 = i;
        hq2 hq2Var = this.c;
        hq2Var.D0 = i;
        ox8.p = hq2Var.N(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.c = new hq2();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.V = Integer.MAX_VALUE;
        this.W = true;
        this.a0 = 257;
        this.b0 = null;
        this.c0 = null;
        this.d0 = -1;
        this.e0 = new HashMap<>();
        this.f0 = new SparseArray<>();
        this.g0 = new b(this);
        this.h0 = 0;
        this.i0 = 0;
        c(attributeSet, i);
    }

    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public final int B;
        public final int C;
        public float D;
        public float E;
        public String F;
        public float G;
        public float H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public int U;
        public boolean V;
        public boolean W;
        public String X;
        public int Y;
        public boolean Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public boolean c0;
        public int d;
        public boolean d0;
        public int e;
        public boolean e0;
        public int f;
        public int f0;
        public int g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public int j0;
        public int k;
        public int k0;
        public int l;
        public float l0;
        public int m;
        public int m0;
        public int n;
        public int n0;
        public int o;
        public float o0;
        public int p;
        public gq2 p0;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;
        public final int v;
        public int w;
        public final int x;
        public int y;
        public int z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a, reason: collision with other inner class name */
        public static class C0025a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(97, 64);
                sparseIntArray.append(74, 65);
                sparseIntArray.append(83, 8);
                sparseIntArray.append(84, 9);
                sparseIntArray.append(86, 10);
                sparseIntArray.append(87, 11);
                sparseIntArray.append(93, 12);
                sparseIntArray.append(92, 13);
                sparseIntArray.append(64, 14);
                sparseIntArray.append(63, 15);
                sparseIntArray.append(59, 16);
                sparseIntArray.append(61, 52);
                sparseIntArray.append(60, 53);
                sparseIntArray.append(65, 2);
                sparseIntArray.append(67, 3);
                sparseIntArray.append(66, 4);
                sparseIntArray.append(102, 49);
                sparseIntArray.append(103, 50);
                sparseIntArray.append(71, 5);
                sparseIntArray.append(72, 6);
                sparseIntArray.append(73, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(88, 17);
                sparseIntArray.append(89, 18);
                sparseIntArray.append(70, 19);
                sparseIntArray.append(69, 20);
                sparseIntArray.append(107, 21);
                sparseIntArray.append(110, 22);
                sparseIntArray.append(108, 23);
                sparseIntArray.append(105, 24);
                sparseIntArray.append(109, 25);
                sparseIntArray.append(106, 26);
                sparseIntArray.append(104, 55);
                sparseIntArray.append(111, 54);
                sparseIntArray.append(79, 29);
                sparseIntArray.append(94, 30);
                sparseIntArray.append(68, 44);
                sparseIntArray.append(81, 45);
                sparseIntArray.append(96, 46);
                sparseIntArray.append(80, 47);
                sparseIntArray.append(95, 48);
                sparseIntArray.append(57, 27);
                sparseIntArray.append(56, 28);
                sparseIntArray.append(98, 31);
                sparseIntArray.append(75, 32);
                sparseIntArray.append(100, 33);
                sparseIntArray.append(99, 34);
                sparseIntArray.append(101, 35);
                sparseIntArray.append(77, 36);
                sparseIntArray.append(76, 37);
                sparseIntArray.append(78, 38);
                sparseIntArray.append(82, 39);
                sparseIntArray.append(91, 40);
                sparseIntArray.append(85, 41);
                sparseIntArray.append(62, 42);
                sparseIntArray.append(58, 43);
                sparseIntArray.append(90, 51);
                sparseIntArray.append(113, 66);
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = 0;
            this.q = 0.0f;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = Integer.MIN_VALUE;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = 0.5f;
            this.E = 0.5f;
            this.F = null;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 1.0f;
            this.R = 1.0f;
            this.S = -1;
            this.T = -1;
            this.U = -1;
            this.V = false;
            this.W = false;
            this.X = null;
            this.Y = 0;
            this.Z = true;
            this.a0 = true;
            this.b0 = false;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = Integer.MIN_VALUE;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = 0.5f;
            this.p0 = new gq2();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nac.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = C0025a.a.get(index);
                switch (i2) {
                    case 1:
                        this.U = typedArrayObtainStyledAttributes.getInt(index, this.U);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                        this.o = resourceId;
                        if (resourceId == -1) {
                            this.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.p);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.q) % 360.0f;
                        this.q = f;
                        if (f < 0.0f) {
                            this.q = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId2;
                        if (resourceId2 == -1) {
                            this.d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId3;
                        if (resourceId3 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId5;
                        if (resourceId5 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId6;
                        if (resourceId6 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId11;
                        if (resourceId11 == -1) {
                            this.r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId12;
                        if (resourceId12 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId13;
                        if (resourceId13 == -1) {
                            this.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId14;
                        if (resourceId14 == -1) {
                            this.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 22:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 23:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 24:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 25:
                        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 26:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 27:
                        this.V = typedArrayObtainStyledAttributes.getBoolean(index, this.V);
                        break;
                    case 28:
                        this.W = typedArrayObtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 29:
                        this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                        break;
                    case RendererMetrics.SAMPLES /* 30 */:
                        this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 31:
                        int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.K = i3;
                        if (i3 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.L = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                        break;
                    case 35:
                        this.Q = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.Q));
                        this.K = 2;
                        break;
                    case 36:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                        break;
                    case 38:
                        this.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                c.h(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                                break;
                            case 46:
                                this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 47:
                                this.I = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.S = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.S);
                                break;
                            case 50:
                                this.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 51:
                                this.X = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                                this.m = resourceId15;
                                if (resourceId15 == -1) {
                                    this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId16;
                                if (resourceId16 == -1) {
                                    this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
                                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        c.g(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        c.g(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.c0 = false;
            this.Z = true;
            this.a0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.V) {
                this.Z = false;
                if (this.K == 0) {
                    this.K = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.W) {
                this.a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.Z = false;
                if (i == 0 && this.K == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.V = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.a0 = false;
                if (i2 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.W = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.c0 = true;
            this.Z = true;
            this.a0 = true;
            if (!(this.p0 instanceof fe6)) {
                this.p0 = new fe6();
            }
            ((fe6) this.p0).J(this.U);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void resolveLayoutDirection(int r12) {
            /*
                Method dump skipped, instruction units count: 251
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }

        public a() {
            super(-2, -2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = 0;
            this.q = 0.0f;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = Integer.MIN_VALUE;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = 0.5f;
            this.E = 0.5f;
            this.F = null;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 1.0f;
            this.R = 1.0f;
            this.S = -1;
            this.T = -1;
            this.U = -1;
            this.V = false;
            this.W = false;
            this.X = null;
            this.Y = 0;
            this.Z = true;
            this.a0 = true;
            this.b0 = false;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = Integer.MIN_VALUE;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = 0.5f;
            this.p0 = new gq2();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = 0;
            this.q = 0.0f;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = Integer.MIN_VALUE;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = 0.5f;
            this.E = 0.5f;
            this.F = null;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 1.0f;
            this.R = 1.0f;
            this.S = -1;
            this.T = -1;
            this.U = -1;
            this.V = false;
            this.W = false;
            this.X = null;
            this.Y = 0;
            this.Z = true;
            this.a0 = true;
            this.b0 = false;
            this.c0 = false;
            this.d0 = false;
            this.e0 = false;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = Integer.MIN_VALUE;
            this.k0 = Integer.MIN_VALUE;
            this.l0 = 0.5f;
            this.p0 = new gq2();
        }
    }
}
