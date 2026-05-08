package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.horcrux.svg.SVGLength;
import defpackage.c6b;
import defpackage.c74;
import defpackage.dmc;
import defpackage.ia6;
import defpackage.pqa;
import defpackage.qeb;
import defpackage.s55;
import defpackage.tpc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public abstract class VirtualView extends tpc {
    private static final int CLIP_RULE_EVENODD = 0;
    static final int CLIP_RULE_NONZERO = 1;
    private static final double M_SQRT1_2l = 0.7071067811865476d;
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private double canvasDiagonal;
    private float canvasHeight;
    private float canvasWidth;
    ArrayList<c6b> elements;
    private double fontSize;
    private ia6 glyphContext;
    RectF mBox;
    Matrix mCTM;
    boolean mCTMInvertible;
    private Path mCachedClipPath;
    private RectF mClientRect;
    RectF mClipBounds;
    private String mClipPath;
    Region mClipRegion;
    Path mClipRegionPath;
    int mClipRule;
    final ReactContext mContext;
    String mDisplay;
    RectF mFillBounds;
    Path mFillPath;
    Matrix mInvCTM;
    Matrix mInvMatrix;
    final Matrix mInvTransform;
    boolean mInvertible;
    RectF mMarkerBounds;
    String mMarkerEnd;
    String mMarkerMid;
    Path mMarkerPath;
    Region mMarkerRegion;
    String mMarkerStart;
    String mMask;
    Matrix mMatrix;
    String mName;
    float mOpacity;
    Path mPath;
    qeb mPointerEvents;
    Region mRegion;
    private boolean mResponsible;
    final float mScale;
    RectF mStrokeBounds;
    Path mStrokePath;
    Region mStrokeRegion;
    private h mTextRoot;
    private SvgView svgView;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            a = iArr;
            try {
                iArr[SVGLength.UnitType.EMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SVGLength.UnitType.EXS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SVGLength.UnitType.CM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SVGLength.UnitType.MM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SVGLength.UnitType.IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[SVGLength.UnitType.PT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[SVGLength.UnitType.PC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public VirtualView(ReactContext reactContext) {
        super(reactContext);
        this.mOpacity = 1.0f;
        this.mCTM = new Matrix();
        this.mMatrix = new Matrix();
        this.mInvCTM = new Matrix();
        this.mInvMatrix = new Matrix();
        this.mInvTransform = new Matrix();
        this.mInvertible = true;
        this.mCTMInvertible = true;
        this.fontSize = -1.0d;
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.mContext = reactContext;
        this.mScale = c74.c().density;
    }

    private void clearParentCache() {
        while (true) {
            ViewParent parent = this.getParent();
            if (!(parent instanceof VirtualView)) {
                return;
            }
            this = (VirtualView) parent;
            if (this.mPath == null) {
                return;
            } else {
                this.clearCache();
            }
        }
    }

    private double fromRelativeFast(SVGLength sVGLength) {
        double fontSizeFromContext;
        switch (a.a[sVGLength.b.ordinal()]) {
            case 1:
                fontSizeFromContext = getFontSizeFromContext();
                break;
            case 2:
                fontSizeFromContext = getFontSizeFromContext() / 2.0d;
                break;
            case 3:
                fontSizeFromContext = 35.43307d;
                break;
            case 4:
                fontSizeFromContext = 3.543307d;
                break;
            case 5:
                fontSizeFromContext = 90.0d;
                break;
            case 6:
                fontSizeFromContext = 1.25d;
                break;
            case 7:
                fontSizeFromContext = 15.0d;
                break;
            default:
                fontSizeFromContext = 1.0d;
                break;
        }
        return sVGLength.a * fontSizeFromContext * ((double) this.mScale);
    }

    private double getCanvasDiagonal() {
        double d = this.canvasDiagonal;
        if (d != -1.0d) {
            return d;
        }
        double dSqrt = Math.sqrt(Math.pow(getCanvasHeight(), 2.0d) + Math.pow(getCanvasWidth(), 2.0d)) * M_SQRT1_2l;
        this.canvasDiagonal = dSqrt;
        return dSqrt;
    }

    private float getCanvasHeight() {
        float f = this.canvasHeight;
        if (f != -1.0f) {
            return f;
        }
        h textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasHeight = getSvgView().getCanvasBounds().height();
        } else {
            this.canvasHeight = textRoot.b.O;
        }
        return this.canvasHeight;
    }

    private float getCanvasWidth() {
        float f = this.canvasWidth;
        if (f != -1.0f) {
            return f;
        }
        h textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasWidth = getSvgView().getCanvasBounds().width();
        } else {
            this.canvasWidth = textRoot.b.N;
        }
        return this.canvasWidth;
    }

    private double getFontSizeFromContext() {
        double d = this.fontSize;
        if (d != -1.0d) {
            return d;
        }
        h textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.glyphContext == null) {
            this.glyphContext = textRoot.b;
        }
        double d2 = this.glyphContext.q;
        this.fontSize = d2;
        return d2;
    }

    public void clearCache() {
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.fontSize = -1.0d;
        this.mStrokeRegion = null;
        this.mMarkerRegion = null;
        this.mRegion = null;
        this.mPath = null;
    }

    public void clearChildCache() {
        clearCache();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).clearChildCache();
            }
        }
    }

    public void clip(Canvas canvas, Paint paint) {
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
    }

    public abstract void draw(Canvas canvas, Paint paint, float f);

    public RectF getClientRect() {
        return this.mClientRect;
    }

    public Path getClipPath(Canvas canvas, Paint paint) {
        Path pathI;
        if (this.mClipPath != null) {
            c cVar = (c) getSvgView().getDefinedClipPath(this.mClipPath);
            if (cVar != null) {
                if (this.mClipRule == 0) {
                    pathI = cVar.getPath(canvas, paint);
                } else {
                    Region.Op op = Region.Op.UNION;
                    pathI = cVar.i(canvas, paint);
                }
                pathI.transform(cVar.mMatrix);
                int i = this.mClipRule;
                if (i == 0) {
                    pathI.setFillType(Path.FillType.EVEN_ODD);
                } else if (i != 1) {
                    s55.n("ReactNative", "RNSVG: clipRule: " + this.mClipRule + " unrecognized");
                }
                this.mCachedClipPath = pathI;
            } else {
                s55.n("ReactNative", "RNSVG: Undefined clipPath: " + this.mClipPath);
            }
        }
        return getClipPath();
    }

    public h getParentTextRoot() {
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((VirtualView) parent).getTextRoot();
        }
        return null;
    }

    public abstract Path getPath(Canvas canvas, Paint paint);

    public SvgView getSvgView() {
        SvgView svgView = this.svgView;
        if (svgView != null) {
            return svgView;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof SvgView) {
            this.svgView = (SvgView) parent;
        } else if (parent instanceof VirtualView) {
            this.svgView = ((VirtualView) parent).getSvgView();
        } else {
            s55.f("ReactNative", "RNSVG: " + getClass().getName() + " should be descendant of a SvgView.");
        }
        return this.svgView;
    }

    public h getTextRoot() {
        if (this.mTextRoot == null) {
            VirtualView virtualView = this;
            while (true) {
                if (virtualView == null) {
                    break;
                }
                if (virtualView instanceof h) {
                    h hVar = (h) virtualView;
                    if (hVar.b != null) {
                        this.mTextRoot = hVar;
                        break;
                    }
                }
                ViewParent parent = virtualView.getParent();
                virtualView = !(parent instanceof VirtualView) ? null : (VirtualView) parent;
            }
        }
        return this.mTextRoot;
    }

    public abstract int hitTest(float[] fArr);

    @Override // android.view.View
    public void invalidate() {
        if ((this instanceof RenderableView) && this.mPath == null) {
            return;
        }
        clearCache();
        clearParentCache();
        super.invalidate();
    }

    public boolean isResponsible() {
        return this.mResponsible;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.mClientRect != null) {
            SvgView svgView = getSvgView();
            int[] iArr = new int[2];
            getSvgView().getLocationOnScreen(iArr);
            Rect rect = new Rect();
            boolean z = false;
            rect.left = iArr[0] + ((int) Math.floor(this.mClientRect.left));
            rect.top = iArr[1] + ((int) Math.floor(this.mClientRect.top));
            rect.right = rect.left + ((int) Math.ceil(this.mClientRect.width()));
            rect.bottom = rect.top + ((int) Math.ceil(this.mClientRect.height()));
            Rect rect2 = new Rect();
            if (svgView.getGlobalVisibleRect(rect2) && rect.intersect(rect2)) {
                z = true;
            }
            String canonicalName = getClass().getCanonicalName();
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setClassName(canonicalName);
            accessibilityNodeInfo.setVisibleToUser(z);
        }
    }

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mClientRect == null) {
            return;
        }
        if (!(this instanceof h)) {
            int iFloor = (int) Math.floor(r1.left);
            int iFloor2 = (int) Math.floor(this.mClientRect.top);
            int iCeil = (int) Math.ceil(this.mClientRect.right);
            int iCeil2 = (int) Math.ceil(this.mClientRect.bottom);
            setLeft(iFloor);
            setTop(iFloor2);
            setRight(iCeil);
            setBottom(iCeil2);
        }
        setMeasuredDimension((int) Math.ceil(this.mClientRect.width()), (int) Math.ceil(this.mClientRect.height()));
    }

    @Override // defpackage.tpc, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.mClientRect != null ? (int) Math.ceil(r0.width()) : View.getDefaultSize(getSuggestedMinimumWidth(), i), this.mClientRect != null ? (int) Math.ceil(r0.height()) : View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    public double relativeOn(SVGLength sVGLength, float f) {
        double d;
        SVGLength.UnitType unitType = sVGLength.b;
        double d2 = sVGLength.a;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d = this.mScale;
        } else {
            if (unitType != SVGLength.UnitType.PERCENTAGE) {
                return fromRelativeFast(sVGLength);
            }
            d2 /= 100.0d;
            d = f;
        }
        return d2 * d;
    }

    public double relativeOnFraction(SVGLength sVGLength, float f) {
        SVGLength.UnitType unitType = sVGLength.b;
        double d = sVGLength.a;
        if (unitType != SVGLength.UnitType.NUMBER) {
            if (unitType != SVGLength.UnitType.PERCENTAGE) {
                return fromRelativeFast(sVGLength);
            }
            d /= 100.0d;
        }
        return d * ((double) f);
    }

    public double relativeOnHeight(SVGLength sVGLength) {
        return relativeOn(sVGLength, getCanvasHeight());
    }

    public double relativeOnOther(SVGLength sVGLength) {
        return relativeOn(sVGLength, (float) getCanvasDiagonal());
    }

    public double relativeOnWidth(SVGLength sVGLength) {
        return relativeOn(sVGLength, getCanvasWidth());
    }

    public void render(Canvas canvas, Paint paint, float f) {
        draw(canvas, paint, f);
    }

    public void restoreCanvas(Canvas canvas, int i) {
        canvas.restoreToCount(i);
    }

    public int saveAndSetupCanvas(Canvas canvas, Matrix matrix) {
        int iSave = canvas.save();
        this.mCTM.set(this.mMatrix);
        canvas.concat(this.mCTM);
        this.mCTM.preConcat(matrix);
        this.mCTMInvertible = this.mCTM.invert(this.mInvCTM);
        return iSave;
    }

    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
    }

    public void setClientRect(RectF rectF) {
        SvgView svgView;
        RectF rectF2 = this.mClientRect;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            this.mClientRect = rectF;
            if (rectF == null) {
                return;
            }
            int iCeil = (int) Math.ceil(rectF.width());
            int iCeil2 = (int) Math.ceil(this.mClientRect.height());
            int iFloor = (int) Math.floor(this.mClientRect.left);
            int iFloor2 = (int) Math.floor(this.mClientRect.top);
            int iCeil3 = (int) Math.ceil(this.mClientRect.right);
            int iCeil4 = (int) Math.ceil(this.mClientRect.bottom);
            setMeasuredDimension(iCeil, iCeil2);
            if (!(this instanceof h) && (svgView = getSvgView()) != null) {
                setLeft(Math.max(iFloor, 0));
                setTop(Math.max(iFloor2, 0));
                setRight(Math.min(iCeil3, svgView.getWidth()));
                setBottom(Math.min(iCeil4, svgView.getHeight()));
            }
            EventDispatcher eventDispatcherE = dmc.e(this.mContext, getId());
            if (eventDispatcherE != null) {
                int id = getId();
                pqa pqaVarAcquire = pqa.e.acquire();
                if (pqaVarAcquire == null) {
                    pqaVarAcquire = new pqa();
                }
                pqaVarAcquire.init(-1, id);
                pqaVarAcquire.a = iFloor;
                pqaVarAcquire.b = iFloor2;
                pqaVarAcquire.c = iCeil;
                pqaVarAcquire.d = iCeil2;
                eventDispatcherE.a(pqaVarAcquire);
            }
        }
    }

    public void setClipPath(String str) {
        this.mCachedClipPath = null;
        this.mClipPath = str;
        invalidate();
    }

    public void setClipRule(int i) {
        this.mClipRule = i;
        invalidate();
    }

    public void setDisplay(String str) {
        this.mDisplay = str;
        invalidate();
    }

    public void setMarkerEnd(String str) {
        this.mMarkerEnd = str;
        invalidate();
    }

    public void setMarkerMid(String str) {
        this.mMarkerMid = str;
        invalidate();
    }

    public void setMarkerStart(String str) {
        this.mMarkerStart = str;
        invalidate();
    }

    public void setMask(String str) {
        this.mMask = str;
        invalidate();
    }

    public void setMatrix(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = sRawMatrix;
            int iC = p.c(readableArray, fArr, this.mScale);
            if (iC == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                    this.mInvMatrix = new Matrix();
                }
                this.mMatrix.setValues(fArr);
                this.mInvertible = this.mMatrix.invert(this.mInvMatrix);
            } else if (iC != -1) {
                s55.n("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix.reset();
            this.mInvMatrix.reset();
            this.mInvertible = true;
        }
        super.invalidate();
        clearParentCache();
    }

    public void setName(String str) {
        this.mName = str;
        invalidate();
    }

    public void setOpacity(float f) {
        this.mOpacity = f;
        invalidate();
    }

    @Override // defpackage.tpc
    public void setPointerEvents(qeb qebVar) {
        this.mPointerEvents = qebVar;
    }

    public void setResponsible(boolean z) {
        this.mResponsible = z;
        invalidate();
    }

    public void setMatrix(Dynamic dynamic) {
        setMatrix((dynamic.isNull() || !dynamic.getType().equals(ReadableType.Array)) ? null : dynamic.asArray());
    }

    public Path getClipPath() {
        return this.mCachedClipPath;
    }
}
