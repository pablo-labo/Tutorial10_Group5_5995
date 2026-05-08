package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.TransformHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.horcrux.svg.VirtualView;
import defpackage.c74;
import defpackage.hh1;
import defpackage.i75;
import defpackage.is3;
import defpackage.j75;
import defpackage.k75;
import defpackage.l75;
import defpackage.m75;
import defpackage.mkf;
import defpackage.n75;
import defpackage.nn2;
import defpackage.p6b;
import defpackage.qeb;
import defpackage.snc;
import defpackage.sqg;
import defpackage.tnc;
import defpackage.xif;
import defpackage.xm8;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class VirtualViewManager<V extends VirtualView> extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    protected final String mClassName;
    protected sqg<V> mDelegate;
    protected final SVGClass svgClass;
    private static final a.C0134a sMatrixDecompositionContext = new a.C0134a();
    private static final double[] sTransformDecompositionArray = new double[16];
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    public enum SVGClass {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGFilter,
        RNSVGFeBlend,
        RNSVGFeColorMatrix,
        RNSVGFeComposite,
        RNSVGFeFlood,
        RNSVGFeGaussianBlur,
        RNSVGFeMerge,
        RNSVGFeOffset,
        RNSVGMarker,
        RNSVGForeignObject
    }

    public class a implements ViewGroup.OnHierarchyChangeListener {
        public a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SVGClass.values().length];
            a = iArr;
            try {
                iArr[SVGClass.RNSVGGroup.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SVGClass.RNSVGPath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SVGClass.RNSVGCircle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SVGClass.RNSVGEllipse.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SVGClass.RNSVGLine.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[SVGClass.RNSVGRect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[SVGClass.RNSVGText.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[SVGClass.RNSVGTSpan.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[SVGClass.RNSVGTextPath.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[SVGClass.RNSVGImage.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[SVGClass.RNSVGClipPath.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[SVGClass.RNSVGDefs.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[SVGClass.RNSVGUse.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[SVGClass.RNSVGSymbol.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[SVGClass.RNSVGLinearGradient.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[SVGClass.RNSVGRadialGradient.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[SVGClass.RNSVGPattern.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[SVGClass.RNSVGMask.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[SVGClass.RNSVGFilter.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[SVGClass.RNSVGFeBlend.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[SVGClass.RNSVGFeColorMatrix.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[SVGClass.RNSVGFeComposite.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[SVGClass.RNSVGFeFlood.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[SVGClass.RNSVGFeGaussianBlur.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[SVGClass.RNSVGFeMerge.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[SVGClass.RNSVGFeOffset.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[SVGClass.RNSVGMarker.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[SVGClass.RNSVGForeignObject.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
        }
    }

    public static class c extends xm8 {
        @tnc(names = {"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", GesturesListener.SCROLL_DIRECTION_RIGHT, "top", "bottom", GesturesListener.SCROLL_DIRECTION_LEFT, "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
        public void ignoreLayoutProps(int i, Dynamic dynamic) {
        }
    }

    public VirtualViewManager(SVGClass sVGClass) {
        this.svgClass = sVGClass;
        this.mClassName = sVGClass.toString();
    }

    public static RenderableView getRenderableViewByTag(int i) {
        return mTagToRenderableView.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateSvgView(V v) {
        SvgView svgView = v.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (v instanceof u) {
            u uVar = (u) v;
            ViewParent parent = uVar.getParent();
            while (parent instanceof u) {
                uVar = (u) parent;
                parent = uVar.getParent();
            }
            uVar.clearChildCache();
        }
    }

    public static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    private static float sanitizeFloatPropertyValue(float f) {
        if (f >= -3.4028235E38f && f <= Float.MAX_VALUE) {
            return f;
        }
        if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f);
    }

    public static void setRenderableView(int i, RenderableView renderableView) {
        mTagToRenderableView.put(i, renderableView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(mkf mkfVar, VirtualView virtualView) {
        super.addEventEmitters(mkfVar, virtualView);
        virtualView.setOnHierarchyChangeListener(new a());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public xm8 createShadowNodeInstance() {
        return new c();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public VirtualView createViewInstance(mkf mkfVar) {
        switch (b.a[this.svgClass.ordinal()]) {
            case 1:
                return new h(mkfVar);
            case 2:
                p6b p6bVar = new p6b(mkfVar);
                hh1.Z = p6bVar.mScale;
                p6bVar.a = new Path();
                return p6bVar;
            case 3:
                return new com.horcrux.svg.b(mkfVar);
            case 4:
                return new d(mkfVar);
            case 5:
                return new k(mkfVar);
            case 6:
                return new r(mkfVar);
            case 7:
                return new u(mkfVar);
            case 8:
                return new t(mkfVar);
            case DatadogLogGenerator.CRASH /* 9 */:
                return new xif(mkfVar);
            case 10:
                return new j(mkfVar);
            case 11:
                return new com.horcrux.svg.c(mkfVar);
            case 12:
                return new is3(mkfVar);
            case 13:
                return new v(mkfVar);
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return new s(mkfVar);
            case 15:
                l lVar = new l(mkfVar);
                lVar.V = null;
                return lVar;
            case 16:
                q qVar = new q(mkfVar);
                qVar.a0 = null;
                return qVar;
            case 17:
                o oVar = new o(mkfVar);
                oVar.j0 = null;
                return oVar;
            case 18:
                return new n(mkfVar);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return new f(mkfVar);
            case 20:
                i75 i75Var = new i75(mkfVar);
                SVGLength sVGLength = new SVGLength(0.0d);
                FilterRegion filterRegion = i75Var.b;
                filterRegion.mX = sVGLength;
                filterRegion.mY = new SVGLength(0.0d);
                filterRegion.mW = new SVGLength("100%");
                filterRegion.mH = new SVGLength("100%");
                return i75Var;
            case 21:
                return new j75(mkfVar);
            case 22:
                return new k75(mkfVar);
            case 23:
                e eVar = new e(mkfVar);
                eVar.d = 1.0f;
                return eVar;
            case 24:
                return new l75(mkfVar);
            case 25:
                return new m75(mkfVar);
            case 26:
                return new n75(mkfVar);
            case 27:
                m mVar = new m(mkfVar);
                mVar.j0 = new Matrix();
                return mVar;
            case 28:
                g gVar = new g(mkfVar);
                gVar.b0 = new Canvas(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888));
                return gVar;
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends xm8> getShadowNodeClass() {
        return c.class;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(VirtualView virtualView) {
        super.onAfterUpdateTransaction(virtualView);
        invalidateSvgView(virtualView);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(VirtualView virtualView) {
        super.onDropViewInstance(virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @snc(name = "clipPath")
    public void setClipPath(V v, String str) {
        v.setClipPath(str);
    }

    @snc(name = "clipRule")
    public void setClipRule(V v, int i) {
        v.setClipRule(i);
    }

    @snc(name = "display")
    public void setDisplay(V v, String str) {
        v.setDisplay(str);
    }

    @snc(name = "markerEnd")
    public void setMarkerEnd(V v, String str) {
        v.setMarkerEnd(str);
    }

    @snc(name = "markerMid")
    public void setMarkerMid(V v, String str) {
        v.setMarkerMid(str);
    }

    @snc(name = "markerStart")
    public void setMarkerStart(V v, String str) {
        v.setMarkerStart(str);
    }

    @snc(name = "mask")
    public void setMask(V v, String str) {
        v.setMask(str);
    }

    @snc(name = "matrix")
    public void setMatrix(V v, Dynamic dynamic) {
        v.setMatrix(dynamic);
    }

    @snc(name = "name")
    public void setName(V v, String str) {
        v.setName(str);
    }

    @snc(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(V v, float f) {
        v.setOpacity(f);
    }

    @snc(name = "pointerEvents")
    public void setPointerEvents(V v, String str) {
        if (str == null) {
            v.setPointerEvents(qeb.e);
        } else {
            v.setPointerEvents(qeb.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
        }
    }

    @snc(name = "responsible")
    public void setResponsible(V v, boolean z) {
        v.setResponsible(z);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransform(VirtualView virtualView, ReadableArray readableArray) {
        setTransformProperty(virtualView, readableArray);
        Matrix matrix = virtualView.getMatrix();
        virtualView.mMatrix = matrix;
        virtualView.mInvertible = matrix.invert(virtualView.mInvMatrix);
    }

    public void setTransformProperty(VirtualView virtualView, ReadableArray readableArray) {
        if (readableArray == null) {
            virtualView.setTranslationX(nn2.G(0.0f));
            virtualView.setTranslationY(nn2.G(0.0f));
            virtualView.setRotation(0.0f);
            virtualView.setRotationX(0.0f);
            virtualView.setRotationY(0.0f);
            virtualView.setScaleX(1.0f);
            virtualView.setScaleY(1.0f);
            virtualView.setCameraDistance(0.0f);
            return;
        }
        a.C0134a c0134a = sMatrixDecompositionContext;
        double[] dArr = c0134a.a;
        double[] dArr2 = c0134a.d;
        double[] dArr3 = c0134a.b;
        double[] dArr4 = c0134a.e;
        a.C0134a.C0135a.a(dArr);
        a.C0134a.C0135a.a(dArr3);
        a.C0134a.C0135a.a(c0134a.c);
        a.C0134a.C0135a.a(dArr2);
        a.C0134a.C0135a.a(dArr4);
        double[] dArr5 = sTransformDecompositionArray;
        TransformHelper.c(readableArray, dArr5, virtualView.getWidth(), virtualView.getHeight(), null, false);
        com.facebook.react.uimanager.a.a(dArr5, c0134a);
        virtualView.setTranslationX(nn2.G(sanitizeFloatPropertyValue((float) dArr2[0])));
        virtualView.setTranslationY(nn2.G(sanitizeFloatPropertyValue((float) dArr2[1])));
        virtualView.setRotation(sanitizeFloatPropertyValue((float) dArr4[2]));
        virtualView.setRotationX(sanitizeFloatPropertyValue((float) dArr4[0]));
        virtualView.setRotationY(sanitizeFloatPropertyValue((float) dArr4[1]));
        virtualView.setScaleX(sanitizeFloatPropertyValue((float) dArr3[0]));
        virtualView.setScaleY(sanitizeFloatPropertyValue((float) dArr3[1]));
        double[] dArr6 = c0134a.a;
        if (dArr6.length > 2) {
            float f = (float) dArr6[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            float f2 = (-1.0f) / f;
            float f3 = c74.c().density;
            virtualView.setCameraDistance(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    public void setMatrix(V v, ReadableArray readableArray) {
        v.setMatrix(readableArray);
    }

    @snc(name = "transform")
    public void setTransform(V v, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        setTransform((VirtualView) v, dynamic.asArray());
    }
}
