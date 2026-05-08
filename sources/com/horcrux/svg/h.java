package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import defpackage.c6b;
import defpackage.ia6;
import defpackage.on5;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class h extends RenderableView {
    public ReadableMap a;
    public ia6 b;
    public Bitmap c;
    public Canvas d;
    public final Paint e;

    public h(ReactContext reactContext) {
        super(reactContext);
        this.e = new Paint(1);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        m(canvas);
        clip(canvas, paint);
        g(canvas, paint, f);
        renderMarkers(canvas, paint, f);
    }

    public void g(Canvas canvas, Paint paint, float f) {
        l();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        if (this.mOpacity != 1.0f) {
            Bitmap bitmap = this.c;
            if (bitmap == null) {
                this.c = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.d = new Canvas(this.c);
            } else {
                bitmap.recycle();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.c = bitmapCreateBitmap;
                this.d.setBitmap(bitmapCreateBitmap);
            }
            this.d.save();
            this.d.setMatrix(canvas.getMatrix());
        } else {
            this.d = canvas;
        }
        this.elements = new ArrayList<>();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof n)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z = virtualView instanceof RenderableView;
                        if (z) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(this.d, this.mCTM);
                        virtualView.render(this.d, paint, f);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(this.d, iSaveAndSetupCanvas);
                        if (z) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                        ArrayList<c6b> arrayList = virtualView.elements;
                        if (arrayList != null) {
                            this.elements.addAll(arrayList);
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                }
            }
        }
        if (this.mOpacity != 1.0f) {
            this.d.restore();
            int iSave = canvas.save();
            canvas.setMatrix(null);
            int i2 = (int) (this.mOpacity * 255.0f);
            Paint paint2 = this.e;
            paint2.setAlpha(i2);
            canvas.drawBitmap(this.c, 0.0f, 0.0f, paint2);
            canvas.restoreToCount(iSave);
        }
        setClientRect(rectF);
        k();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        this.mPath = new Path();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof n) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                this.mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return this.mPath;
    }

    public final void h(Canvas canvas, Paint paint, float f) {
        super.draw(canvas, paint, f);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        int iReactTagForTouch;
        VirtualView virtualView;
        int iHitTest;
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int iRound = Math.round(fArr2[0]);
        int iRound2 = Math.round(fArr2[1]);
        Path clipPath = getClipPath();
        if (clipPath != null) {
            if (this.mClipRegionPath != clipPath) {
                this.mClipRegionPath = clipPath;
                RectF rectF = new RectF();
                this.mClipBounds = rectF;
                clipPath.computeBounds(rectF, true);
                this.mClipRegion = getRegion(clipPath, this.mClipBounds);
            }
            if (!this.mClipRegion.contains(iRound, iRound2)) {
                return -1;
            }
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof VirtualView) {
                if (!(childAt instanceof n) && (iHitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                    return (virtualView.isResponsible() || iHitTest != childAt.getId()) ? iHitTest : getId();
                }
            } else if ((childAt instanceof SvgView) && (iReactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                return iReactTagForTouch;
            }
        }
        return -1;
    }

    public Path i(Canvas canvas, Paint paint) {
        Region.Op op = Region.Op.UNION;
        Path path = new Path();
        Path.Op opValueOf = Path.Op.valueOf(op.name());
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof n) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path pathI = virtualView instanceof h ? ((h) virtualView).i(canvas, paint) : virtualView.getPath(canvas, paint);
                pathI.transform(matrix);
                path.op(pathI, opValueOf);
            }
        }
        return path;
    }

    public final ia6 j() {
        h textRoot = getTextRoot();
        textRoot.getClass();
        return textRoot.b;
    }

    public void k() {
        ia6 ia6VarJ = j();
        ArrayList<double[]> arrayList = ia6VarJ.f;
        ArrayList<SVGLength[]> arrayList2 = ia6VarJ.e;
        ArrayList<SVGLength[]> arrayList3 = ia6VarJ.d;
        ArrayList<SVGLength[]> arrayList4 = ia6VarJ.c;
        ArrayList<SVGLength[]> arrayList5 = ia6VarJ.b;
        ArrayList<on5> arrayList6 = ia6VarJ.a;
        arrayList6.remove(ia6VarJ.L);
        ArrayList<Integer> arrayList7 = ia6VarJ.l;
        arrayList7.remove(ia6VarJ.L);
        ArrayList<Integer> arrayList8 = ia6VarJ.m;
        arrayList8.remove(ia6VarJ.L);
        ArrayList<Integer> arrayList9 = ia6VarJ.n;
        arrayList9.remove(ia6VarJ.L);
        ArrayList<Integer> arrayList10 = ia6VarJ.o;
        arrayList10.remove(ia6VarJ.L);
        ArrayList<Integer> arrayList11 = ia6VarJ.p;
        arrayList11.remove(ia6VarJ.L);
        int i = ia6VarJ.L - 1;
        ia6VarJ.L = i;
        int i2 = ia6VarJ.B;
        int i3 = ia6VarJ.C;
        int i4 = ia6VarJ.D;
        int i5 = ia6VarJ.E;
        int i6 = ia6VarJ.F;
        ia6VarJ.r = arrayList6.get(i);
        ia6VarJ.B = arrayList7.get(ia6VarJ.L).intValue();
        ia6VarJ.C = arrayList8.get(ia6VarJ.L).intValue();
        ia6VarJ.D = arrayList9.get(ia6VarJ.L).intValue();
        ia6VarJ.E = arrayList10.get(ia6VarJ.L).intValue();
        ia6VarJ.F = arrayList11.get(ia6VarJ.L).intValue();
        if (i2 != ia6VarJ.B) {
            arrayList5.remove(i2);
            ia6VarJ.w = arrayList5.get(ia6VarJ.B);
            ia6VarJ.G = ia6VarJ.g.get(ia6VarJ.B).intValue();
        }
        if (i3 != ia6VarJ.C) {
            arrayList4.remove(i3);
            ia6VarJ.x = arrayList4.get(ia6VarJ.C);
            ia6VarJ.H = ia6VarJ.h.get(ia6VarJ.C).intValue();
        }
        if (i4 != ia6VarJ.D) {
            arrayList3.remove(i4);
            ia6VarJ.y = arrayList3.get(ia6VarJ.D);
            ia6VarJ.I = ia6VarJ.i.get(ia6VarJ.D).intValue();
        }
        if (i5 != ia6VarJ.E) {
            arrayList2.remove(i5);
            ia6VarJ.z = arrayList2.get(ia6VarJ.E);
            ia6VarJ.J = ia6VarJ.j.get(ia6VarJ.E).intValue();
        }
        if (i6 != ia6VarJ.F) {
            arrayList.remove(i6);
            ia6VarJ.A = arrayList.get(ia6VarJ.F);
            ia6VarJ.K = ia6VarJ.k.get(ia6VarJ.F).intValue();
        }
    }

    public void l() {
        ia6 ia6VarJ = j();
        ia6VarJ.f(this, this.a);
        ia6VarJ.e();
    }

    public final void m(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        this.b = new ia6(this.mScale, rectF.width(), rectF.height());
    }

    @Override // com.horcrux.svg.RenderableView
    public void resetProperties() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}
