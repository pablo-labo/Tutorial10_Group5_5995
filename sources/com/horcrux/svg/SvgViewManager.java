package com.horcrux.svg;

import android.graphics.Rect;
import android.util.SparseArray;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.view.ReactViewManager;
import defpackage.mkf;
import defpackage.nn2;
import defpackage.qeb;
import defpackage.s55;
import defpackage.snc;
import defpackage.sqg;
import defpackage.tgc;
import defpackage.tpc;
import defpackage.zec;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class SvgViewManager extends ReactViewManager implements tgc<SvgView> {
    public static final String REACT_CLASS = "RNSVGSvgViewAndroid";
    private final sqg<SvgView> mDelegate = new zec(this, 1);
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            a = iArr;
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static SvgView getSvgViewByTag(int i) {
        return mTagToSvgView.get(i);
    }

    public static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    public static void setSvgView(int i, SvgView svgView) {
        mTagToSvgView.put(i, svgView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public tpc createViewInstance(mkf mkfVar) {
        return new SvgView(mkfVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.wo6
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(tpc tpcVar) {
        super.onDropViewInstance(tpcVar);
        mTagToSvgView.remove(tpcVar.getId());
    }

    @Override // defpackage.tgc
    public void setHitSlop(SvgView svgView, Dynamic dynamic) {
        int i = a.a[dynamic.getType().ordinal()];
        if (i == 1) {
            ReadableMap readableMapAsMap = dynamic.asMap();
            svgView.setHitSlopRect(new Rect(readableMapAsMap.hasKey(GesturesListener.SCROLL_DIRECTION_LEFT) ? (int) nn2.G((float) readableMapAsMap.getDouble(GesturesListener.SCROLL_DIRECTION_LEFT)) : 0, readableMapAsMap.hasKey("top") ? (int) nn2.G((float) readableMapAsMap.getDouble("top")) : 0, readableMapAsMap.hasKey(GesturesListener.SCROLL_DIRECTION_RIGHT) ? (int) nn2.G((float) readableMapAsMap.getDouble(GesturesListener.SCROLL_DIRECTION_RIGHT)) : 0, readableMapAsMap.hasKey("bottom") ? (int) nn2.G((float) readableMapAsMap.getDouble("bottom")) : 0));
        } else {
            if (i == 2) {
                int iG = (int) nn2.G((float) dynamic.asDouble());
                svgView.setHitSlopRect(new Rect(iG, iG, iG, iG));
                return;
            }
            if (i != 3) {
                s55.n("ReactNative", "Invalid type for 'hitSlop' value " + dynamic.getType());
            }
            svgView.setHitSlopRect(null);
        }
    }

    @Override // defpackage.tgc
    @snc(name = "pointerEvents")
    public void setPointerEvents(SvgView svgView, String str) {
        try {
            Class<? super Object> superclass = svgView.getClass().getSuperclass();
            if (superclass != null) {
                Method declaredMethod = superclass.getDeclaredMethod("setPointerEvents", qeb.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(svgView, qeb.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(tpc tpcVar, Object obj) {
        super.updateExtraData(tpcVar, obj);
        tpcVar.invalidate();
    }

    @Override // defpackage.tgc
    public void setAccessible(SvgView svgView, boolean z) {
        super.setAccessible((tpc) svgView, z);
    }

    @Override // defpackage.tgc
    @snc(name = "align")
    public void setAlign(SvgView svgView, String str) {
        svgView.setAlign(str);
    }

    @Override // defpackage.tgc
    public void setBackfaceVisibility(SvgView svgView, String str) {
        super.setBackfaceVisibility((tpc) svgView, str);
    }

    @Override // defpackage.tgc
    @snc(name = "bbHeight")
    public void setBbHeight(SvgView svgView, Dynamic dynamic) {
        svgView.setBbHeight(dynamic);
    }

    @Override // defpackage.tgc
    @snc(name = "bbWidth")
    public void setBbWidth(SvgView svgView, Dynamic dynamic) {
        svgView.setBbWidth(dynamic);
    }

    @Override // defpackage.tgc
    public void setBorderBlockColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 9, num);
    }

    @Override // defpackage.tgc
    public void setBorderBlockEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 10, num);
    }

    @Override // defpackage.tgc
    public void setBorderBlockStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 11, num);
    }

    @Override // defpackage.tgc
    public void setBorderBottomColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 4, num);
    }

    @Override // defpackage.tgc
    public void setBorderBottomEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 8, dynamic);
    }

    @Override // defpackage.tgc
    public void setBorderBottomLeftRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 4, dynamic);
    }

    @Override // defpackage.tgc
    public void setBorderBottomRightRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 3, dynamic);
    }

    @Override // defpackage.tgc
    public void setBorderBottomStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 7, dynamic);
    }

    @Override // defpackage.tgc
    public void setBorderColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 0, num);
    }

    @Override // defpackage.tgc
    public void setBorderEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 6, num);
    }

    @Override // defpackage.tgc
    public void setBorderEndEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 9, dynamic);
    }

    @Override // defpackage.tgc
    public void setBorderEndStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 10, dynamic);
    }

    @Override // defpackage.tgc
    public void setBorderLeftColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 1, num);
    }

    @Override // defpackage.tgc
    public void setBorderRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 0, dynamic);
    }

    @Override // defpackage.tgc
    public void setBorderRightColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 2, num);
    }

    @Override // defpackage.tgc
    public void setBorderStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 5, num);
    }

    @Override // defpackage.tgc
    public void setBorderStartEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 11, dynamic);
    }

    @Override // defpackage.tgc
    public void setBorderStartStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 12, dynamic);
    }

    @Override // defpackage.tgc
    public void setBorderStyle(SvgView svgView, String str) {
        super.setBorderStyle((tpc) svgView, str);
    }

    @Override // defpackage.tgc
    public void setBorderTopColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 3, num);
    }

    @Override // defpackage.tgc
    public void setBorderTopEndRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 6, dynamic);
    }

    @Override // defpackage.tgc
    public void setBorderTopLeftRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 1, dynamic);
    }

    @Override // defpackage.tgc
    public void setBorderTopRightRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 2, dynamic);
    }

    @Override // defpackage.tgc
    public void setBorderTopStartRadius(SvgView svgView, Dynamic dynamic) {
        super.setBorderRadius(svgView, 5, dynamic);
    }

    @Override // defpackage.tgc
    @snc(customType = "Color", name = "color")
    public void setColor(SvgView svgView, Integer num) {
        svgView.setCurrentColor(num);
    }

    @Override // defpackage.tgc
    public void setFocusable(SvgView svgView, boolean z) {
        super.setFocusable((tpc) svgView, z);
    }

    @Override // defpackage.tgc
    public void setHasTVPreferredFocus(SvgView svgView, boolean z) {
        super.setTVPreferredFocus(svgView, z);
    }

    @Override // defpackage.tgc
    @snc(name = "meetOrSlice")
    public void setMeetOrSlice(SvgView svgView, int i) {
        svgView.setMeetOrSlice(i);
    }

    @Override // defpackage.tgc
    @snc(name = "minX")
    public void setMinX(SvgView svgView, float f) {
        svgView.setMinX(f);
    }

    @Override // defpackage.tgc
    @snc(name = "minY")
    public void setMinY(SvgView svgView, float f) {
        svgView.setMinY(f);
    }

    @Override // defpackage.tgc
    public void setNativeBackgroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeBackground(svgView, readableMap);
    }

    @Override // defpackage.tgc
    public void setNativeForegroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeForeground(svgView, readableMap);
    }

    @Override // defpackage.tgc
    public void setNeedsOffscreenAlphaCompositing(SvgView svgView, boolean z) {
        super.setNeedsOffscreenAlphaCompositing((tpc) svgView, z);
    }

    @Override // defpackage.tgc
    public void setNextFocusDown(SvgView svgView, int i) {
        super.nextFocusDown(svgView, i);
    }

    @Override // defpackage.tgc
    public void setNextFocusForward(SvgView svgView, int i) {
        super.nextFocusForward(svgView, i);
    }

    @Override // defpackage.tgc
    public void setNextFocusLeft(SvgView svgView, int i) {
        super.nextFocusLeft(svgView, i);
    }

    @Override // defpackage.tgc
    public void setNextFocusRight(SvgView svgView, int i) {
        super.nextFocusRight(svgView, i);
    }

    @Override // defpackage.tgc
    public void setNextFocusUp(SvgView svgView, int i) {
        super.nextFocusUp(svgView, i);
    }

    @Override // defpackage.tgc
    public void setRemoveClippedSubviews(SvgView svgView, boolean z) {
        super.setRemoveClippedSubviews(svgView, z);
    }

    @Override // defpackage.tgc
    @snc(name = "vbHeight")
    public void setVbHeight(SvgView svgView, float f) {
        svgView.setVbHeight(f);
    }

    @Override // defpackage.tgc
    @snc(name = "vbWidth")
    public void setVbWidth(SvgView svgView, float f) {
        svgView.setVbWidth(f);
    }
}
