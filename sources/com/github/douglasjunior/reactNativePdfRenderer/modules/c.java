package com.github.douglasjunior.reactNativePdfRenderer.modules;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.douglasjunior.reactNativePdfRenderer.modules.a;
import com.github.douglasjunior.reactNativePdfRenderer.modules.c;
import defpackage.h50;
import defpackage.j7b;
import defpackage.qb0;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor", "NotifyDataSetChanged"})
public final class c extends RecyclerView {
    public final GestureDetector A1;
    public final ScaleGestureDetector B1;
    public final Matrix C1;
    public final com.github.douglasjunior.reactNativePdfRenderer.modules.a D1;
    public final b E1;
    public final PdfRendererViewManager F1;
    public boolean G1;
    public float H1;
    public float I1;
    public float J1;
    public int K1;
    public int L1;
    public int M1;
    public boolean N1;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            c cVar = c.this;
            Matrix matrix = cVar.C1;
            if (motionEvent.getPointerCount() > 1) {
                return false;
            }
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            float f = fArr[0] <= 1.0f ? cVar.H1 : 1.0f;
            float width = cVar.getWidth() / 2.0f;
            float height = cVar.getHeight() / 2.0f;
            matrix.setScale(f, f, width, height);
            matrix.postTranslate(width - motionEvent.getX(), height - motionEvent.getY());
            cVar.p0();
            cVar.postInvalidateOnAnimation();
            cVar.D1.a(f);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            c cVar = c.this;
            cVar.C1.postTranslate(-f, -f2);
            cVar.p0();
            cVar.postInvalidateOnAnimation();
            return true;
        }
    }

    public class b extends LinearLayoutManager {
        public b() {
            super(1);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public final int n0(int i, RecyclerView.t tVar, RecyclerView.x xVar) {
            try {
                float[] fArr = new float[9];
                c.this.C1.getValues(fArr);
                return super.n0(Math.round(i / fArr[4]), tVar, xVar);
            } catch (Exception unused) {
                return super.n0(i, tVar, xVar);
            }
        }
    }

    /* JADX INFO: renamed from: com.github.douglasjunior.reactNativePdfRenderer.modules.c$c, reason: collision with other inner class name */
    public class C0148c extends RecyclerView.e<a> {
        public PdfRenderer d;
        public ParcelFileDescriptor e;

        /* JADX INFO: renamed from: com.github.douglasjunior.reactNativePdfRenderer.modules.c$c$a */
        public class a extends RecyclerView.b0 {
            public j7b u;

            public a(ImageView imageView) {
                super(imageView);
            }

            public final Bitmap q(int i, float f, int i2) {
                c cVar = c.this;
                int iRound = Math.round(((cVar.getResources().getDisplayMetrics().densityDpi * i) * f) / 72.0f);
                int iRound2 = Math.round(((cVar.getResources().getDisplayMetrics().densityDpi * i2) * f) / 72.0f);
                float f2 = cVar.I1;
                float f3 = iRound;
                float f4 = iRound2;
                float fMin = Math.min(f, Math.min(f2 / f3, f2 / f4));
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.round(f3 * fMin), Math.round(f4 * fMin), Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(-1);
                return bitmapCreateBitmap;
            }

            public final void r(float f, int i) {
                C0148c c0148c = C0148c.this;
                c cVar = c.this;
                try {
                    PdfRenderer.Page pageOpenPage = c0148c.d.openPage(i);
                    try {
                        int width = pageOpenPage.getWidth();
                        int height = pageOpenPage.getHeight();
                        Bitmap bitmapQ = q(width, f, height);
                        pageOpenPage.render(bitmapQ, null, null, 1);
                        ImageView imageView = (ImageView) this.a;
                        imageView.setImageBitmap(bitmapQ);
                        RecyclerView.n nVar = (RecyclerView.n) imageView.getLayoutParams();
                        ((ViewGroup.MarginLayoutParams) nVar).width = -1;
                        if (cVar.N1) {
                            ((ViewGroup.MarginLayoutParams) nVar).height = -1;
                            nVar.setMargins(0, 0, 0, 0);
                        } else {
                            ((ViewGroup.MarginLayoutParams) nVar).height = Math.round((cVar.K1 / width) * height);
                            nVar.setMargins(0, 0, 0, (int) cVar.J1);
                        }
                        imageView.setLayoutParams(nVar);
                        pageOpenPage.close();
                    } finally {
                    }
                } catch (Exception unused) {
                }
            }
        }

        public C0148c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int c() {
            PdfRenderer pdfRenderer = this.d;
            if (pdfRenderer == null) {
                return 0;
            }
            return c.this.N1 ? Math.min(pdfRenderer.getPageCount(), 1) : pdfRenderer.getPageCount();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void g(RecyclerView.b0 b0Var, int i) {
            a aVar = (a) b0Var;
            if (this.d == null) {
                return;
            }
            aVar.r(c.this.D1.b, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
            ImageView imageView = new ImageView(viewGroup.getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setBackgroundColor(-1);
            imageView.setLayoutParams(new RecyclerView.n(-1, 0));
            return new a(imageView);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [j7b, java.lang.Object] */
        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void k(RecyclerView.b0 b0Var) {
            final a aVar = (a) b0Var;
            C0148c c0148c = C0148c.this;
            j7b j7bVar = aVar.u;
            if (j7bVar != null) {
                c.this.D1.a.remove(j7bVar);
                aVar.u = null;
            }
            ?? r0 = new a.InterfaceC0147a() { // from class: j7b
                @Override // com.github.douglasjunior.reactNativePdfRenderer.modules.a.InterfaceC0147a
                public final void a(float f) {
                    c.C0148c.a aVar2 = aVar;
                    c cVar = c.this;
                    int iB = aVar2.b();
                    if (iB != -1 && iB >= cVar.E1.J0() && iB <= cVar.E1.K0()) {
                        aVar2.r(f, iB);
                    }
                }
            };
            aVar.u = r0;
            c.this.D1.a.add(r0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void l(RecyclerView.b0 b0Var) {
            a aVar = (a) b0Var;
            j7b j7bVar = aVar.u;
            if (j7bVar != null) {
                c.this.D1.a.remove(j7bVar);
                aVar.u = null;
            }
        }
    }

    public interface d {
        void onPageChange(c cVar, int i, int i2);
    }

    public class e extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public e() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float[] fArr = new float[9];
            c cVar = c.this;
            Matrix matrix = cVar.C1;
            matrix.getValues(fArr);
            float f = fArr[0];
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (f >= cVar.H1 && scaleFactor > 1.0f) {
                return false;
            }
            matrix.postScale(scaleFactor, scaleFactor, cVar.getWidth() / 2.0f, cVar.getHeight() / 2.0f);
            cVar.p0();
            cVar.postInvalidateOnAnimation();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
            float[] fArr = new float[9];
            c cVar = c.this;
            cVar.C1.getValues(fArr);
            cVar.D1.a(fArr[0]);
        }
    }

    public c(Context context, PdfRendererViewManager pdfRendererViewManager) {
        super(context, null);
        this.G1 = false;
        this.H1 = 5.0f;
        this.J1 = 0.0f;
        this.M1 = -1;
        this.D1 = new com.github.douglasjunior.reactNativePdfRenderer.modules.a();
        b bVar = new b();
        this.E1 = bVar;
        bVar.Z0(1);
        RecyclerView.e c0148c = new C0148c();
        setLayoutManager(bVar);
        setAdapter(c0148c);
        j(new com.github.douglasjunior.reactNativePdfRenderer.modules.b(this));
        this.F1 = pdfRendererViewManager;
        this.C1 = new Matrix();
        this.B1 = new ScaleGestureDetector(getContext(), new e());
        this.A1 = new GestureDetector(context, new a());
        setLayoutParams(new RecyclerView.n(-1, -1));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(this.C1);
        try {
            super.dispatchDraw(canvas);
        } catch (Exception e2) {
            Log.e("PdfRendererRecyclerView", "Error dispatching draw", e2);
        }
        canvas.restore();
    }

    public final void n0() {
        b bVar = this.E1;
        View viewM0 = bVar.M0(bVar.v() - 1, -1, true, false);
        int iE = viewM0 != null ? RecyclerView.m.E(viewM0) : -1;
        if (iE < 0) {
            iE = bVar.K0();
        }
        if (iE != this.M1) {
            this.M1 = iE;
            C0148c c0148c = (C0148c) getAdapter();
            if (c0148c == null) {
                return;
            }
            this.F1.onPageChange(this, iE, c0148c.c());
        }
    }

    public final void o0(File file) {
        this.M1 = -1;
        C0148c c0148c = (C0148c) getAdapter();
        if (c0148c == null) {
            return;
        }
        PdfRenderer pdfRenderer = c0148c.d;
        if (pdfRenderer != null) {
            pdfRenderer.close();
            c0148c.d = null;
        }
        ParcelFileDescriptor parcelFileDescriptor = c0148c.e;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
            c0148c.e = null;
        }
        c0148c.e = ParcelFileDescriptor.open(file, 268435456);
        c0148c.d = new PdfRenderer(c0148c.e);
        c0148c.a.b();
        post(new h50(this, 5));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            Log.e("PdfRendererRecyclerView", "Error intercepting touch event", e2);
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.K1 = View.MeasureSpec.getSize(i);
        this.L1 = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        int i6 = this.K1;
        float fMax = (i6 <= 0 || (i5 = this.L1) <= 0) ? 1 : Math.max(i / i6, i2 / i5);
        Matrix matrix = this.C1;
        matrix.setScale(fMax, fMax);
        matrix.postTranslate((i - (this.K1 * r4)) / 2.0f, (i2 - (r4 * this.L1)) / 2.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.B1.onTouchEvent(motionEvent);
        this.A1.onTouchEvent(motionEvent);
        float[] fArr = new float[9];
        this.C1.getValues(fArr);
        float fMin = Math.min(Math.max(fArr[4], 1.0f), this.H1);
        float f = fArr[5];
        float f2 = this.L1;
        float f3 = f2 - (fMin * f2);
        if (f >= 0.0f || f <= f3) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p0() {
        float[] fArr = new float[9];
        Matrix matrix = this.C1;
        matrix.getValues(fArr);
        float fMin = Math.min(Math.max(fArr[0], 1.0f), this.H1);
        float f = fArr[2];
        float fMin2 = Math.min(Math.max(fArr[4], 1.0f), this.H1);
        float f2 = fArr[5];
        int i = this.K1;
        float f3 = i - (i * fMin);
        int i2 = this.L1;
        float f4 = i2 - (i2 * fMin2);
        if (f > 0.0f) {
            f = 0.0f;
        } else if (f < f3) {
            f = f3;
        }
        if (f2 > 0.0f) {
            f2 = 0.0f;
        } else if (f2 < f4) {
            f2 = f4;
        }
        fArr[0] = fMin;
        fArr[2] = f;
        fArr[4] = fMin2;
        fArr[5] = f2;
        matrix.setValues(fArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    @SuppressLint({"WrongCall"})
    public final void requestLayout() {
        super.requestLayout();
        if (this.G1) {
            return;
        }
        this.G1 = true;
        post(new qb0(this, 6));
    }

    public void setDistanceBetweenPages(float f) {
        this.J1 = TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    public void setMaxPageResolution(float f) {
        this.I1 = f;
    }

    public void setMaxZoom(float f) {
        this.H1 = f;
    }

    public void setSinglePage(boolean z) {
        this.N1 = z;
        if (z) {
            this.C1.setScale(1.0f, 1.0f, 0.0f, 0.0f);
            p0();
            postInvalidateOnAnimation();
            this.D1.a(1.0f);
        }
    }
}
