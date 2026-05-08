package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.horcrux.svg.a;
import com.horcrux.svg.n;
import defpackage.bg;
import defpackage.c6b;
import defpackage.ieb;
import defpackage.ip4;
import defpackage.m6;
import defpackage.mgc;
import defpackage.n7g;
import defpackage.ngc;
import defpackage.ob5;
import defpackage.qeb;
import defpackage.s55;
import defpackage.tb5;
import defpackage.z3;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RenderableView extends VirtualView {
    private static final int CAP_BUTT = 0;
    static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    static final int JOIN_ROUND = 1;
    private static final int VECTOR_EFFECT_DEFAULT = 0;
    private static final int VECTOR_EFFECT_NON_SCALING_STROKE = 1;
    static RenderableView contextElement;
    private static final Pattern regex = Pattern.compile("[0-9.-]+");
    public ReadableArray fill;
    public float fillOpacity;
    public Path.FillType fillRule;
    private ArrayList<String> mAttributeList;
    private RenderableView mCaller;
    private int mCurrentColor;
    String mFilter;
    private ArrayList<String> mLastMergedList;
    private ArrayList<Object> mOriginProperties;
    private ArrayList<String> mPropList;
    public ReadableArray stroke;
    public SVGLength[] strokeDasharray;
    public float strokeDashoffset;
    public Paint.Cap strokeLinecap;
    public Paint.Join strokeLinejoin;
    public float strokeMiterlimit;
    public float strokeOpacity;
    public SVGLength strokeWidth;
    public int vectorEffect;

    public RenderableView(ReactContext reactContext) {
        super(reactContext);
        this.vectorEffect = 0;
        this.strokeWidth = new SVGLength(1.0d);
        this.strokeOpacity = 1.0f;
        this.strokeMiterlimit = 4.0f;
        this.strokeDashoffset = 0.0f;
        this.strokeLinecap = Paint.Cap.BUTT;
        this.strokeLinejoin = Paint.Join.MITER;
        this.mCurrentColor = 0;
        this.fillOpacity = 1.0f;
        this.fillRule = Path.FillType.WINDING;
        setPivotX(0.0f);
        setPivotY(0.0f);
    }

    private ArrayList<String> getAttributeList() {
        return this.mAttributeList;
    }

    private boolean hasOwnProperty(String str) {
        ArrayList<String> arrayList = this.mAttributeList;
        return arrayList != null && arrayList.contains(str);
    }

    private void setupPaint(Paint paint, float f, ReadableArray readableArray) {
        float f2;
        float f3;
        int[] iArr;
        float[] fArr;
        float[] fArr2;
        int[] iArr2;
        double d;
        ReadableArray readableArray2;
        RenderableView renderableView;
        ReadableArray readableArray3;
        int i = readableArray.getInt(0);
        char c = 4;
        int i2 = 1;
        if (i == 0) {
            if (readableArray.size() != 2) {
                paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f) * 255.0d : 255.0f * f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
                return;
            } else {
                paint.setColor(((readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1)) & 16777215) | (Math.round((r0 >>> 24) * f) << 24));
                return;
            }
        }
        if (i != 1) {
            if (i == 2) {
                paint.setColor((getCurrentColor() & 16777215) | (Math.round((r0 >>> 24) * f) << 24));
                return;
            }
            if (i != 3) {
                if (i != 4 || (renderableView = contextElement) == null || (readableArray3 = renderableView.stroke) == null) {
                    return;
                }
                setupPaint(paint, f, readableArray3);
                return;
            }
            RenderableView renderableView2 = contextElement;
            if (renderableView2 == null || (readableArray2 = renderableView2.fill) == null) {
                return;
            }
            setupPaint(paint, f, readableArray2);
            return;
        }
        a definedBrush = getSvgView().getDefinedBrush(readableArray.getString(1));
        if (definedBrush != null) {
            RectF rectF = this.mBox;
            float f4 = this.mScale;
            a.EnumC0161a enumC0161a = definedBrush.a;
            SVGLength[] sVGLengthArr = definedBrush.b;
            boolean z = definedBrush.d;
            if (!z) {
                rectF = new RectF(definedBrush.g);
            }
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            if (z) {
                f3 = rectF.left;
                f2 = rectF.top;
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            RectF rectF2 = new RectF(f3, f2, fWidth + f3, fHeight + f2);
            float fWidth2 = rectF2.width();
            float fHeight2 = rectF2.height();
            float f5 = rectF2.left;
            float f6 = rectF2.top;
            float textSize = paint.getTextSize();
            if (enumC0161a == a.EnumC0161a.c) {
                double d2 = fWidth2;
                double dA = definedBrush.a(sVGLengthArr[0], d2, f4, textSize);
                double d3 = fHeight2;
                double dA2 = definedBrush.a(sVGLengthArr[1], d3, f4, textSize);
                double dA3 = definedBrush.a(sVGLengthArr[2], d2, f4, textSize);
                double dA4 = definedBrush.a(sVGLengthArr[3], d3, f4, textSize);
                if (dA3 <= 1.0d || dA4 <= 1.0d) {
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) dA3, (int) dA4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                o oVar = definedBrush.h;
                oVar.getClass();
                float f7 = oVar.d0;
                float f8 = oVar.mScale;
                float f9 = oVar.e0;
                RectF rectF3 = new RectF(f7 * f8, f9 * f8, (f7 + oVar.f0) * f8, (f9 + oVar.g0) * f8);
                if (rectF3.width() > 0.0f && rectF3.height() > 0.0f) {
                    RectF rectF4 = new RectF((float) dA, (float) dA2, (float) dA3, (float) dA4);
                    o oVar2 = definedBrush.h;
                    canvas.concat(n7g.c(rectF3, rectF4, oVar2.h0, oVar2.i0));
                }
                if (definedBrush.e) {
                    canvas.scale(fWidth2 / f4, fHeight2 / f4);
                }
                definedBrush.h.draw(canvas, new Paint(), f);
                Matrix matrix = new Matrix();
                Matrix matrix2 = definedBrush.f;
                if (matrix2 != null) {
                    matrix.preConcat(matrix2);
                }
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                return;
            }
            int size = definedBrush.c.size();
            if (size == 0) {
                s55.n("ReactNative", "Gradient contains no stops");
                return;
            }
            int i3 = size / 2;
            int[] iArr3 = new int[i3];
            float[] fArr3 = new float[i3];
            ReadableArray readableArray4 = definedBrush.c;
            int i4 = 0;
            while (i4 < i3) {
                char c2 = c;
                int i5 = i4 * 2;
                fArr3[i4] = (float) readableArray4.getDouble(i5);
                iArr3[i4] = (readableArray4.getInt(i5 + 1) & 16777215) | (Math.round((r8 >>> 24) * f) << 24);
                i4++;
                c = c2;
                i2 = i2;
                definedBrush = definedBrush;
            }
            char c3 = c;
            int i6 = i2;
            a aVar = definedBrush;
            if (i3 == i6) {
                int[] iArr4 = new int[2];
                iArr4[0] = iArr3[0];
                iArr4[i6] = iArr3[0];
                float[] fArr4 = new float[2];
                fArr4[0] = fArr3[0];
                fArr4[i6] = fArr3[0];
                s55.n("ReactNative", "Gradient contains only one stop");
                iArr = iArr4;
                fArr = fArr4;
            } else {
                iArr = iArr3;
                fArr = fArr3;
            }
            if (enumC0161a == a.EnumC0161a.a) {
                double d4 = fWidth2;
                double d5 = f5;
                double dA5 = aVar.a(sVGLengthArr[0], d4, f4, textSize) + d5;
                double d6 = fHeight2;
                double d7 = f6;
                LinearGradient linearGradient = new LinearGradient((float) dA5, (float) (aVar.a(sVGLengthArr[1], d6, f4, textSize) + d7), (float) (d5 + aVar.a(sVGLengthArr[2], d4, f4, textSize)), (float) (aVar.a(sVGLengthArr[3], d6, f4, textSize) + d7), iArr, fArr, Shader.TileMode.CLAMP);
                if (aVar.f != null) {
                    Matrix matrix3 = new Matrix();
                    matrix3.preConcat(aVar.f);
                    linearGradient.setLocalMatrix(matrix3);
                }
                paint.setShader(linearGradient);
                return;
            }
            int[] iArr5 = iArr;
            float[] fArr5 = fArr;
            if (enumC0161a == a.EnumC0161a.b) {
                double d8 = fWidth2;
                double dA6 = aVar.a(sVGLengthArr[2], d8, f4, textSize);
                double d9 = fHeight2;
                double dA7 = aVar.a(sVGLengthArr[3], d9, f4, textSize);
                if (dA6 <= 0.0d || dA7 <= 0.0d) {
                    fArr2 = new float[]{fArr5[0], fArr5[fArr5.length - 1]};
                    iArr2 = new int[]{iArr5[iArr5.length - 1], iArr5[iArr5.length - 1]};
                    dA6 = d8;
                    d = d9;
                } else {
                    d = dA7;
                    iArr2 = iArr5;
                    fArr2 = fArr5;
                }
                double d10 = d / dA6;
                RadialGradient radialGradient = new RadialGradient((float) (((double) f5) + aVar.a(sVGLengthArr[c3], d8, f4, textSize)), (float) ((((double) f6) / d10) + aVar.a(sVGLengthArr[5], d9 / d10, f4, textSize)), (float) dA6, iArr2, fArr2, Shader.TileMode.CLAMP);
                Matrix matrix4 = new Matrix();
                matrix4.preScale(1.0f, (float) d10);
                Matrix matrix5 = aVar.f;
                if (matrix5 != null) {
                    matrix4.preConcat(matrix5);
                }
                radialGradient.setLocalMatrix(matrix4);
                paint.setShader(radialGradient);
            }
        }
    }

    @Override // com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.mOpacity;
        boolean z = this.mPath == null;
        if (z) {
            Path path = getPath(canvas, paint);
            this.mPath = path;
            path.setFillType(this.fillRule);
        }
        boolean z2 = this.vectorEffect == 1;
        Path path2 = this.mPath;
        if (z2) {
            path2 = new Path();
            this.mPath.transform(this.mCTM, path2);
            canvas.setMatrix(null);
        }
        if (z || path2 != this.mPath) {
            RectF rectF = new RectF();
            this.mBox = rectF;
            path2.computeBounds(rectF, true);
        }
        RectF rectF2 = new RectF(this.mBox);
        this.mCTM.mapRect(rectF2);
        setClientRect(rectF2);
        clip(canvas, paint);
        if (setupFillPaint(paint, this.fillOpacity * f2)) {
            if (z) {
                Path path3 = new Path();
                this.mFillPath = path3;
                paint.getFillPath(path2, path3);
            }
            canvas.drawPath(path2, paint);
        }
        if (setupStrokePaint(paint, this.strokeOpacity * f2)) {
            if (z) {
                Path path4 = new Path();
                this.mStrokePath = path4;
                paint.getFillPath(path2, path4);
            }
            canvas.drawPath(path2, paint);
        }
        renderMarkers(canvas, paint, f2);
    }

    public int getCurrentColor() {
        int i = this.mCurrentColor;
        if (i != 0) {
            return i;
        }
        RenderableView renderableView = this.mCaller;
        if (renderableView != null) {
            return renderableView.getCurrentColor();
        }
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((RenderableView) parent).getCurrentColor();
        }
        if (parent instanceof SvgView) {
            return ((SvgView) parent).mCurrentColor;
        }
        return 0;
    }

    @Override // defpackage.tpc, defpackage.pkc
    public Rect getHitSlopRect() {
        if (this.mPointerEvents == qeb.c) {
            return new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    public abstract Path getPath(Canvas canvas, Paint paint);

    public Region getRegion(Path path, RectF rectF) {
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
        return region;
    }

    @Override // com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        Region region2;
        if (this.mPath == null || !this.mInvertible || this.mPointerEvents == qeb.b) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int iRound = Math.round(fArr2[0]);
        int iRound2 = Math.round(fArr2[1]);
        initBounds();
        Region region3 = this.mRegion;
        if ((region3 != null && region3.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && (region.contains(iRound, iRound2) || ((region2 = this.mMarkerRegion) != null && region2.contains(iRound, iRound2))))) {
            if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                return getId();
            }
            return -1;
        }
        return -1;
    }

    public void initBounds() {
        if (this.mRegion == null && this.mFillPath != null) {
            RectF rectF = new RectF();
            this.mFillBounds = rectF;
            this.mFillPath.computeBounds(rectF, true);
            this.mRegion = getRegion(this.mFillPath, this.mFillBounds);
        }
        if (this.mRegion == null && this.mPath != null) {
            RectF rectF2 = new RectF();
            this.mFillBounds = rectF2;
            this.mPath.computeBounds(rectF2, true);
            this.mRegion = getRegion(this.mPath, this.mFillBounds);
        }
        if (this.mStrokeRegion == null && this.mStrokePath != null) {
            RectF rectF3 = new RectF();
            this.mStrokeBounds = rectF3;
            this.mStrokePath.computeBounds(rectF3, true);
            this.mStrokeRegion = getRegion(this.mStrokePath, this.mStrokeBounds);
        }
        if (this.mMarkerRegion == null && this.mMarkerPath != null) {
            RectF rectF4 = new RectF();
            this.mMarkerBounds = rectF4;
            this.mMarkerPath.computeBounds(rectF4, true);
            this.mMarkerRegion = getRegion(this.mMarkerPath, this.mMarkerBounds);
        }
        Path clipPath = getClipPath();
        if (clipPath == null || this.mClipRegionPath == clipPath) {
            return;
        }
        this.mClipRegionPath = clipPath;
        RectF rectF5 = new RectF();
        this.mClipBounds = rectF5;
        clipPath.computeBounds(rectF5, true);
        this.mClipRegion = getRegion(clipPath, this.mClipBounds);
    }

    public void mergeProperties(RenderableView renderableView) {
        this.mCaller = renderableView;
        ArrayList<String> attributeList = renderableView.getAttributeList();
        if (attributeList == null || attributeList.size() == 0) {
            return;
        }
        this.mOriginProperties = new ArrayList<>();
        this.mAttributeList = this.mPropList == null ? new ArrayList<>() : new ArrayList<>(this.mPropList);
        int size = attributeList.size();
        for (int i = 0; i < size; i++) {
            try {
                String str = attributeList.get(i);
                Field field = getClass().getField(str);
                Object obj = field.get(renderableView);
                this.mOriginProperties.add(field.get(this));
                if (!hasOwnProperty(str)) {
                    this.mAttributeList.add(str);
                    field.set(this, obj);
                }
            } catch (Exception e) {
                z3.q(e);
                return;
            }
        }
        this.mLastMergedList = attributeList;
    }

    @Override // com.horcrux.svg.VirtualView
    public void render(Canvas canvas, Paint paint, float f) {
        RectF rectF;
        f fVar;
        RectF rectF2 = null;
        n nVar = this.mMask != null ? (n) getSvgView().getDefinedMask(this.mMask) : null;
        f fVar2 = this.mFilter != null ? (f) getSvgView().getDefinedFilter(this.mFilter) : null;
        if (nVar == null && fVar2 == null) {
            draw(canvas, paint, f);
            return;
        }
        if (fVar2 != null) {
            Paint paint2 = new Paint(2);
            canvas.saveLayer(null, paint2);
            Bitmap currentBitmap = getSvgView().getCurrentBitmap();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            canvas2.setMatrix(canvas.getMatrix());
            draw(canvas2, paint, f);
            initBounds();
            RectF clientRect = getClientRect();
            if ((this instanceof j) && clientRect == null) {
                return;
            }
            HashMap<String, Bitmap> map = fVar2.a;
            map.clear();
            map.put("SourceGraphic", bitmapCreateBitmap);
            map.put("SourceAlpha", FilterUtils.applySourceAlphaFilter(bitmapCreateBitmap));
            map.put("BackgroundImage", currentBitmap);
            map.put("BackgroundAlpha", FilterUtils.applySourceAlphaFilter(currentBitmap));
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getConfig());
            Canvas canvas3 = new Canvas(bitmapCreateBitmap2);
            Rect cropRect = fVar2.d.getCropRect(fVar2, fVar2.b, clientRect);
            int i = 0;
            int i2 = 0;
            while (i2 < fVar2.getChildCount()) {
                View childAt = fVar2.getChildAt(i2);
                if (childAt instanceof ob5) {
                    ob5 ob5Var = (ob5) childAt;
                    bitmapCreateBitmap2.eraseColor(i);
                    FilterRegion filterRegion = ob5Var.b;
                    tb5 tb5Var = fVar2.c;
                    fVar = fVar2;
                    Rect cropRect2 = filterRegion.getCropRect(ob5Var, tb5Var, tb5Var == tb5.USER_SPACE_ON_USE ? new RectF(cropRect) : clientRect);
                    canvas3.drawBitmap(ob5Var.g(map, bitmapCreateBitmap), cropRect2, cropRect2, (Paint) null);
                    Bitmap bitmapCopy = bitmapCreateBitmap2.copy(Bitmap.Config.ARGB_8888, true);
                    String str = ob5Var.a;
                    if (str != null) {
                        map.put(str, bitmapCopy);
                    }
                    bitmapCreateBitmap = bitmapCopy;
                } else {
                    fVar = fVar2;
                    Log.e("RNSVG", "Invalid `Filter` child: Filter children can only be `Fe...` components");
                }
                i2++;
                fVar2 = fVar;
                i = 0;
            }
            bitmapCreateBitmap2.eraseColor(i);
            rectF2 = null;
            canvas3.drawBitmap(bitmapCreateBitmap, cropRect, cropRect, (Paint) null);
            int iSave = canvas.save();
            canvas.setMatrix(null);
            canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint2);
            canvas.restoreToCount(iSave);
        } else {
            canvas.saveLayer(null, new Paint());
            draw(canvas, paint, f);
        }
        if (nVar != null) {
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.saveLayer(rectF2, paint3);
            if (nVar.c0 == n.a.a) {
                Paint paint4 = new Paint();
                paint4.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f})));
                canvas.saveLayer(null, paint4);
            } else {
                canvas.saveLayer(null, paint);
            }
            if (nVar.b0 == a.b.b) {
                float fRelativeOnWidth = (float) relativeOnWidth(nVar.f);
                float fRelativeOnHeight = (float) relativeOnHeight(nVar.V);
                rectF = new RectF(fRelativeOnWidth, fRelativeOnHeight, ((float) relativeOnWidth(nVar.W)) + fRelativeOnWidth, ((float) relativeOnHeight(nVar.a0)) + fRelativeOnHeight);
            } else {
                RectF clientRect2 = getClientRect();
                if ((this instanceof j) && clientRect2 == null) {
                    return;
                }
                this.mInvCTM.mapRect(clientRect2);
                float fRelativeOnFraction = (float) relativeOnFraction(nVar.f, clientRect2.width());
                float fRelativeOnFraction2 = (float) relativeOnFraction(nVar.V, clientRect2.height());
                float fRelativeOnFraction3 = (float) relativeOnFraction(nVar.W, clientRect2.width());
                float fRelativeOnFraction4 = (float) relativeOnFraction(nVar.a0, clientRect2.height());
                float f2 = clientRect2.left + fRelativeOnFraction;
                float f3 = clientRect2.top + fRelativeOnFraction2;
                rectF = new RectF(f2, f3, fRelativeOnFraction3 + f2, fRelativeOnFraction4 + f3);
            }
            canvas.clipRect(rectF);
            nVar.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.saveLayer(null, paint3);
            canvas.clipRect(rectF);
            nVar.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public void renderMarkers(Canvas canvas, Paint paint, float f) {
        char c;
        int i;
        int i2;
        m mVar;
        Iterator<mgc> it;
        Matrix matrix;
        ieb iebVar;
        ieb iebVar2;
        ieb iebVarC;
        ieb iebVarC2;
        ieb iebVarC3;
        ieb iebVar3;
        ieb iebVarC4;
        m mVar2;
        long j;
        m mVar3 = (m) getSvgView().getDefinedMarker(this.mMarkerStart);
        m mVar4 = (m) getSvgView().getDefinedMarker(this.mMarkerMid);
        m mVar5 = (m) getSvgView().getDefinedMarker(this.mMarkerEnd);
        ArrayList<c6b> arrayList = this.elements;
        if (arrayList != null) {
            if (mVar3 == null && mVar4 == null && mVar5 == null) {
                return;
            }
            contextElement = this;
            mgc.d = new ArrayList<>();
            char c2 = 0;
            mgc.e = 0;
            mgc.f = new ieb(0.0d, 0.0d);
            mgc.g = new ieb(0.0d, 0.0d);
            Iterator<c6b> it2 = arrayList.iterator();
            while (true) {
                c = 4;
                if (!it2.hasNext()) {
                    break;
                }
                c6b next = it2.next();
                ieb[] iebVarArr = next.b;
                char c3 = c2;
                ip4 ip4Var = next.a;
                ieb iebVar4 = null;
                int iOrdinal = ip4Var.ordinal();
                if (iOrdinal == 0) {
                    ieb iebVar5 = iebVarArr[2];
                    ieb iebVarC5 = mgc.c(iebVarArr[c3], mgc.f);
                    ieb iebVarC6 = mgc.c(iebVarArr[2], iebVarArr[1]);
                    if (mgc.b(iebVarC5)) {
                        ieb iebVar6 = iebVarArr[c3];
                        ieb iebVar7 = iebVarArr[1];
                        ieb iebVar8 = iebVarArr[2];
                        iebVarC = mgc.c(iebVar7, iebVar6);
                        iebVarC2 = mgc.c(iebVar8, iebVar7);
                        if (!mgc.b(iebVarC)) {
                            if (mgc.b(iebVarC2)) {
                                iebVarC2 = iebVarC;
                            }
                            iebVarC3 = iebVarC;
                        }
                        iebVarC3 = iebVarC2;
                    } else if (mgc.b(iebVarC6)) {
                        ieb iebVar9 = mgc.f;
                        ieb iebVar10 = iebVarArr[c3];
                        ieb iebVar11 = iebVarArr[1];
                        iebVarC = mgc.c(iebVar10, iebVar9);
                        iebVarC2 = mgc.c(iebVar11, iebVar10);
                        if (!mgc.b(iebVarC)) {
                            if (mgc.b(iebVarC2)) {
                                iebVarC2 = iebVarC;
                            }
                            iebVarC3 = iebVarC;
                        }
                        iebVarC3 = iebVarC2;
                    } else {
                        iebVar4 = iebVarC6;
                        iebVar = iebVar5;
                        iebVar2 = iebVarC5;
                        iebVar3 = iebVar;
                        iebVarC3 = iebVar2;
                        iebVarC4 = iebVar4;
                    }
                    iebVar3 = iebVar5;
                    iebVarC4 = iebVarC2;
                } else if (iOrdinal == 1) {
                    iebVar3 = iebVarArr[1];
                    ieb iebVar12 = mgc.f;
                    ieb iebVar13 = iebVarArr[c3];
                    iebVarC3 = mgc.c(iebVar13, iebVar12);
                    iebVarC4 = mgc.c(iebVar3, iebVar13);
                    if (mgc.b(iebVarC3)) {
                        iebVarC3 = iebVarC4;
                    } else if (mgc.b(iebVarC4)) {
                        iebVarC4 = iebVarC3;
                    }
                } else if (iOrdinal == 2 || iOrdinal == 3) {
                    iebVar3 = iebVarArr[c3];
                    iebVarC3 = mgc.c(iebVar3, mgc.f);
                    iebVarC4 = mgc.c(iebVar3, mgc.f);
                } else if (iOrdinal != 4) {
                    iebVar = null;
                    iebVar2 = null;
                    iebVar3 = iebVar;
                    iebVarC3 = iebVar2;
                    iebVarC4 = iebVar4;
                } else {
                    iebVar3 = mgc.g;
                    iebVarC3 = mgc.c(iebVar3, mgc.f);
                    iebVarC4 = mgc.c(iebVar3, mgc.f);
                }
                mgc.i = iebVarC3;
                int i3 = mgc.e;
                if (i3 > 0) {
                    ngc ngcVar = i3 == 1 ? ngc.a : ngc.b;
                    mVar2 = mVar3;
                    mgc.d.add(new mgc(ngcVar, mgc.f, mgc.a(ngcVar)));
                } else {
                    mVar2 = mVar3;
                }
                mgc.h = iebVarC4;
                mgc.f = iebVar3;
                if (ip4Var == ip4.b) {
                    mgc.g = next.b[c3];
                } else {
                    if (ip4Var == ip4.d) {
                        j = 0;
                        mgc.g = new ieb(0.0d, 0.0d);
                    }
                    mgc.e++;
                    c2 = c3;
                    mVar3 = mVar2;
                }
                j = 0;
                mgc.e++;
                c2 = c3;
                mVar3 = mVar2;
            }
            m mVar6 = mVar3;
            char c4 = c2;
            int i4 = 1;
            int i5 = 2;
            ngc ngcVar2 = ngc.c;
            mgc.d.add(new mgc(ngcVar2, mgc.f, mgc.a(ngcVar2)));
            ArrayList<mgc> arrayList2 = mgc.d;
            SVGLength sVGLength = this.strokeWidth;
            float fRelativeOnOther = (float) (sVGLength != null ? relativeOnOther(sVGLength) : 1.0d);
            this.mMarkerPath = new Path();
            Iterator<mgc> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                mgc next2 = it3.next();
                int iOrdinal2 = next2.a.ordinal();
                if (iOrdinal2 != 0) {
                    i2 = i4;
                    if (iOrdinal2 != i2) {
                        i = i5;
                        mVar = iOrdinal2 != i ? null : mVar5;
                    } else {
                        i = i5;
                        mVar = mVar4;
                    }
                } else {
                    i = i5;
                    i2 = i4;
                    mVar = mVar6;
                }
                if (mVar == null) {
                    i5 = i;
                    i4 = i2;
                } else {
                    Matrix matrix2 = mVar.j0;
                    int iSaveAndSetupCanvas = mVar.saveAndSetupCanvas(canvas, mVar.mCTM);
                    matrix2.reset();
                    ieb iebVar14 = next2.b;
                    matrix2.setTranslate((float) iebVar14.a, (float) iebVar14.b);
                    double d = "auto".equals(mVar.c0) ? -1.0d : Double.parseDouble(mVar.c0);
                    if (d == -1.0d) {
                        d = next2.c;
                    }
                    matrix2.preRotate(((float) d) + 180.0f);
                    if ("strokeWidth".equals(mVar.b0)) {
                        float f2 = fRelativeOnOther / mVar.mScale;
                        matrix2.preScale(f2, f2);
                    }
                    char c5 = c;
                    RectF rectF = new RectF(0.0f, 0.0f, (float) (mVar.relativeOnWidth(mVar.W) / ((double) mVar.mScale)), (float) (mVar.relativeOnHeight(mVar.a0) / ((double) mVar.mScale)));
                    if (mVar.h0 != null) {
                        float f3 = mVar.d0;
                        float f4 = mVar.mScale;
                        float f5 = mVar.e0;
                        it = it3;
                        Matrix matrixC = n7g.c(new RectF(f3 * f4, f5 * f4, (f3 + mVar.f0) * f4, (f5 + mVar.g0) * f4), rectF, mVar.h0, mVar.i0);
                        float[] fArr = new float[9];
                        matrixC.getValues(fArr);
                        matrix = matrix2;
                        matrix.preScale(fArr[c4], fArr[c5]);
                    } else {
                        it = it3;
                        matrix = matrix2;
                    }
                    matrix.preTranslate((float) (-mVar.relativeOnWidth(mVar.f)), (float) (-mVar.relativeOnHeight(mVar.V)));
                    canvas.concat(matrix);
                    mVar.g(canvas, paint, f);
                    mVar.restoreCanvas(canvas, iSaveAndSetupCanvas);
                    this.mMarkerPath.addPath(mVar.getPath(canvas, paint), matrix);
                    c = c5;
                    it3 = it;
                    i5 = 2;
                    i4 = 1;
                }
            }
            contextElement = null;
        }
    }

    public void resetProperties() {
        ArrayList<String> arrayList = this.mLastMergedList;
        if (arrayList == null || this.mOriginProperties == null) {
            return;
        }
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                getClass().getField(this.mLastMergedList.get(size)).set(this, this.mOriginProperties.get(size));
            }
            this.mLastMergedList = null;
            this.mOriginProperties = null;
            this.mAttributeList = this.mPropList;
            this.mCaller = null;
        } catch (Exception e) {
            z3.q(e);
        }
    }

    public void setCurrentColor(Integer num) {
        this.mCurrentColor = num != null ? num.intValue() : 0;
        invalidate();
        clearChildCache();
    }

    public void setFill(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.fill = null;
            invalidate();
            return;
        }
        ReadableType type = dynamic.getType();
        if (type.equals(ReadableType.Map)) {
            setFill(dynamic.asMap());
            return;
        }
        int i = 0;
        if (type.equals(ReadableType.Number)) {
            this.fill = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.fill = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double d = Double.parseDouble(matcher.group());
                int i2 = i + 1;
                if (i < 3) {
                    d /= 255.0d;
                }
                javaOnlyArray.pushDouble(d);
                i = i2;
            }
            this.fill = javaOnlyArray;
        }
        invalidate();
    }

    public void setFillOpacity(float f) {
        this.fillOpacity = f;
        invalidate();
    }

    public void setFillRule(int i) {
        if (i == 0) {
            this.fillRule = Path.FillType.EVEN_ODD;
        } else if (i != 1) {
            m6.m(bg.d(i, "fillRule ", " unrecognized"));
            return;
        }
        invalidate();
    }

    public void setFilter(String str) {
        this.mFilter = str;
        invalidate();
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        VirtualViewManager.setRenderableView(i, this);
    }

    public void setPropList(ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mAttributeList = arrayList;
            this.mPropList = arrayList;
            for (int i = 0; i < readableArray.size(); i++) {
                this.mPropList.add(readableArray.getString(i));
            }
        }
        invalidate();
    }

    public void setStroke(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.stroke = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            setStroke(dynamic.asMap());
            return;
        }
        ReadableType type = dynamic.getType();
        int i = 0;
        if (type.equals(ReadableType.Number)) {
            this.stroke = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.stroke = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double d = Double.parseDouble(matcher.group());
                int i2 = i + 1;
                if (i < 3) {
                    d /= 255.0d;
                }
                javaOnlyArray.pushDouble(d);
                i = i2;
            }
            this.stroke = javaOnlyArray;
        }
        invalidate();
    }

    public void setStrokeDasharray(Dynamic dynamic) {
        ArrayList<SVGLength> arrayListA = SVGLength.a(dynamic);
        if (arrayListA != null) {
            if (arrayListA.size() % 2 == 1) {
                arrayListA.addAll(arrayListA);
            }
            this.strokeDasharray = (SVGLength[]) arrayListA.toArray(new SVGLength[0]);
        } else {
            this.strokeDasharray = null;
        }
        invalidate();
    }

    public void setStrokeDashoffset(float f) {
        this.strokeDashoffset = f * this.mScale;
        invalidate();
    }

    public void setStrokeLinecap(int i) {
        if (i == 0) {
            this.strokeLinecap = Paint.Cap.BUTT;
        } else if (i == 1) {
            this.strokeLinecap = Paint.Cap.ROUND;
        } else {
            if (i != 2) {
                m6.m(bg.d(i, "strokeLinecap ", " unrecognized"));
                return;
            }
            this.strokeLinecap = Paint.Cap.SQUARE;
        }
        invalidate();
    }

    public void setStrokeLinejoin(int i) {
        if (i == 0) {
            this.strokeLinejoin = Paint.Join.MITER;
        } else if (i == 1) {
            this.strokeLinejoin = Paint.Join.ROUND;
        } else {
            if (i != 2) {
                m6.m(bg.d(i, "strokeLinejoin ", " unrecognized"));
                return;
            }
            this.strokeLinejoin = Paint.Join.BEVEL;
        }
        invalidate();
    }

    public void setStrokeMiterlimit(float f) {
        this.strokeMiterlimit = f;
        invalidate();
    }

    public void setStrokeOpacity(float f) {
        this.strokeOpacity = f;
        invalidate();
    }

    public void setStrokeWidth(Dynamic dynamic) {
        this.strokeWidth = dynamic.isNull() ? new SVGLength(1.0d) : SVGLength.b(dynamic);
        invalidate();
    }

    public void setVectorEffect(int i) {
        this.vectorEffect = i;
        invalidate();
    }

    public boolean setupFillPaint(Paint paint, float f) {
        ReadableArray readableArray = this.fill;
        if (readableArray == null || readableArray.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, f, this.fill);
        return true;
    }

    public boolean setupStrokePaint(Paint paint, float f) {
        ReadableArray readableArray;
        paint.reset();
        double dRelativeOnOther = relativeOnOther(this.strokeWidth);
        if (dRelativeOnOther == 0.0d || (readableArray = this.stroke) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.strokeLinecap);
        paint.setStrokeJoin(this.strokeLinejoin);
        paint.setStrokeMiter(this.strokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) dRelativeOnOther);
        setupPaint(paint, f, this.stroke);
        SVGLength[] sVGLengthArr = this.strokeDasharray;
        if (sVGLengthArr == null) {
            return true;
        }
        int length = sVGLengthArr.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) relativeOnOther(this.strokeDasharray[i]);
        }
        paint.setPathEffect(new DashPathEffect(fArr, this.strokeDashoffset));
        return true;
    }

    public void setFill(ReadableMap readableMap) {
        if (readableMap == null) {
            this.fill = null;
            invalidate();
            return;
        }
        int i = readableMap.getInt("type");
        if (i == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.fill = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.fill = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i == 1) {
            this.fill = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.fill = JavaOnlyArray.of(Integer.valueOf(i));
        }
        invalidate();
    }

    public void setStroke(ReadableMap readableMap) {
        if (readableMap == null) {
            this.stroke = null;
            invalidate();
            return;
        }
        int i = readableMap.getInt("type");
        if (i == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.stroke = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.stroke = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i == 1) {
            this.stroke = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.stroke = JavaOnlyArray.of(Integer.valueOf(i));
        }
        invalidate();
    }
}
