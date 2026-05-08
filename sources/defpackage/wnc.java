package defpackage;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.indeed.android.jobsearch.R;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class wnc extends FrameLayout implements qfd, vnc {
    public boolean V;
    public ot7 W;
    public fmc a;
    public yo7 a0;
    public String b;
    public final ojc b0;
    public Bundle c;
    public boolean c0;
    public a d;
    public int d0;
    public int e;
    public int e0;
    public boolean f;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public final AtomicInteger k0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final Rect a;
        public final int b;
        public boolean c = false;
        public int d = 0;
        public int e = 0;

        public a() {
            c74.f(wnc.this.getContext().getApplicationContext());
            this.a = new Rect();
            this.b = (int) nn2.G(60.0f);
        }

        public static WritableMap a(double d, double d2, double d3, double d4) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putDouble("height", d4);
            writableMapCreateMap2.putDouble("screenX", d2);
            writableMapCreateMap2.putDouble("width", d3);
            writableMapCreateMap2.putDouble("screenY", d);
            writableMapCreateMap.putMap("endCoordinates", writableMapCreateMap2);
            writableMapCreateMap.putString("easing", "keyboard");
            writableMapCreateMap.putDouble("duration", 0.0d);
            return writableMapCreateMap;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            WindowInsets rootWindowInsets;
            DisplayCutout displayCutout;
            DeviceInfoModule deviceInfoModule;
            String str;
            double d;
            boolean zIsVisible;
            wnc wncVar = wnc.this;
            if (wncVar.i() && wncVar.l()) {
                int i = Build.VERSION.SDK_INT;
                boolean z = true;
                Rect rect = this.a;
                if (i >= 30) {
                    wncVar.getRootView().getWindowVisibleDisplayFrame(rect);
                    WindowInsets rootWindowInsets2 = wncVar.getRootView().getRootWindowInsets();
                    if (rootWindowInsets2 != null && (zIsVisible = rootWindowInsets2.isVisible(WindowInsets.Type.ime())) != this.c) {
                        this.c = zIsVisible;
                        if (zIsVisible) {
                            int i2 = rootWindowInsets2.getInsets(WindowInsets.Type.ime()).bottom - rootWindowInsets2.getInsets(WindowInsets.Type.systemBars()).bottom;
                            ViewGroup.LayoutParams layoutParams = wncVar.getRootView().getLayoutParams();
                            hh1.l(layoutParams instanceof WindowManager.LayoutParams);
                            wncVar.m("keyboardDidShow", a(nn2.C(((WindowManager.LayoutParams) layoutParams).softInputMode == 48 ? rect.bottom - i2 : rect.bottom), nn2.C(rect.left), nn2.C(rect.width()), nn2.C(i2)));
                        } else {
                            wncVar.m("keyboardDidHide", a(nn2.C(rect.height()), 0.0d, nn2.C(rect.width()), 0.0d));
                        }
                    }
                } else {
                    wncVar.getRootView().getWindowVisibleDisplayFrame(rect);
                    int safeInsetTop = (i < 28 || (rootWindowInsets = wncVar.getRootView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) ? 0 : displayCutout.getSafeInsetTop();
                    int i3 = (c74.d().heightPixels - rect.bottom) + safeInsetTop;
                    int i4 = this.d;
                    int i5 = this.b;
                    if (i4 != i3 && i3 > i5) {
                        this.d = i3;
                        this.c = true;
                        wncVar.m("keyboardDidShow", a(nn2.C(r9), nn2.C(rect.left), nn2.C(rect.width()), nn2.C(this.d)));
                    } else if (i4 != 0 && i3 <= i5) {
                        this.d = 0;
                        this.c = false;
                        wncVar.m("keyboardDidHide", a(nn2.C(rect.height()), 0.0d, nn2.C(rect.width()), 0.0d));
                    }
                }
                int rotation = ((WindowManager) wncVar.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
                if (this.e != rotation) {
                    this.e = rotation;
                    c74.e(wncVar.getContext().getApplicationContext());
                    if (rotation != 0) {
                        if (rotation == 1) {
                            str = "landscape-primary";
                            d = -90.0d;
                        } else if (rotation == 2) {
                            str = "portrait-secondary";
                            d = 180.0d;
                        } else if (rotation == 3) {
                            str = "landscape-secondary";
                            d = 90.0d;
                        }
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putString("name", str);
                        writableMapCreateMap.putDouble("rotationDegrees", d);
                        writableMapCreateMap.putBoolean("isLandscape", z);
                        wncVar.m("namedOrientationDidChange", writableMapCreateMap);
                    } else {
                        str = "portrait-primary";
                        d = 0.0d;
                    }
                    z = false;
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putString("name", str);
                    writableMapCreateMap2.putDouble("rotationDegrees", d);
                    writableMapCreateMap2.putBoolean("isLandscape", z);
                    wncVar.m("namedOrientationDidChange", writableMapCreateMap2);
                }
                ReactContext currentReactContext = wncVar.getCurrentReactContext();
                if (currentReactContext == null || (deviceInfoModule = (DeviceInfoModule) currentReactContext.getNativeModule(DeviceInfoModule.class)) == null) {
                    return;
                }
                deviceInfoModule.emitUpdateDimensionsEvent();
            }
        }
    }

    public interface b {
    }

    public wnc(Context context) {
        super(context);
        this.e = 0;
        this.b0 = new ojc(this);
        this.c0 = false;
        this.d0 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.e0 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f0 = 0;
        this.g0 = 0;
        this.h0 = Integer.MIN_VALUE;
        this.i0 = Integer.MIN_VALUE;
        this.j0 = 1;
        this.k0 = new AtomicInteger(0);
        setRootViewTag(xnc.a());
        setClipChildren(false);
    }

    private a getCustomGlobalLayoutListener() {
        if (this.d == null) {
            this.d = new a();
        }
        return this.d;
    }

    @Override // defpackage.vnc
    public final void a() {
        Trace.beginSection(jpf.g("ReactRootView.runApplication"));
        try {
            if (j() && l()) {
                ReactContext currentReactContext = getCurrentReactContext();
                if (currentReactContext == null) {
                    return;
                }
                CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (this.c0) {
                    n(this.d0, this.e0, true);
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rootTag", getRootViewTag());
                Bundle appProperties = getAppProperties();
                if (appProperties != null) {
                    writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                }
                this.V = true;
                ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
            }
        } finally {
            Trace.endSection();
        }
    }

    public void b(View view, MotionEvent motionEvent) {
        EventDispatcher eventDispatcherD;
        yo7 yo7Var;
        if (k() && (eventDispatcherD = dmc.d(getCurrentReactContext(), getUIManagerType())) != null) {
            this.W.c(motionEvent, eventDispatcherD);
            if (view == null || (yo7Var = this.a0) == null) {
                return;
            }
            yo7Var.g(view, motionEvent, eventDispatcherD);
        }
    }

    @Override // defpackage.vnc
    public final void c() {
        this.W = new ot7(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.a0 = new yo7(this);
        }
    }

    public final void d() {
        Trace.beginSection(jpf.g("attachToReactInstanceManager"));
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_START);
        if (getId() != -1) {
            ReactSoftExceptionLogger.logSoftException("ReactRootView", new IllegalViewOperationException("Trying to attach a ReactRootView with an explicit id already set to [" + getId() + "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID."));
        }
        try {
            if (!this.f) {
                this.f = true;
                fmc fmcVar = this.a;
                hh1.n(fmcVar);
                fmcVar.a(this);
                getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            h(e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!i() || !l()) {
            s55.n("ReactRootView", "Unable to handle key event as the catalyst instance has not been attached");
            return super.dispatchKeyEvent(keyEvent);
        }
        ojc ojcVar = this.b0;
        ojcVar.getClass();
        keyEvent.getClass();
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (action == 1 || action == 0) {
            Map<Integer, String> map = ojc.c;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                ojcVar.a(ojcVar.b, action, map.get(Integer.valueOf(keyCode)));
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2;
        BlendMode blendModeJ;
        if (Build.VERSION.SDK_INT >= 29 && msb.e(getId()) == 2 && nh1.a(this)) {
            blendModeJ = w20.j(view.getTag(R.id.mix_blend_mode));
            if (blendModeJ != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendModeJ);
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            blendModeJ = null;
        }
        boolean zDrawChild = super.drawChild(canvas2, view, j);
        if (blendModeJ != null) {
            canvas2.restore();
        }
        return zDrawChild;
    }

    public void e(ViewGroup viewGroup, MotionEvent motionEvent) {
        if (k() && dmc.d(getCurrentReactContext(), getUIManagerType()) != null) {
            this.W.d = false;
            yo7 yo7Var = this.a0;
            if (yo7Var != null) {
                yo7Var.e = -1;
            }
        }
    }

    public void f(MotionEvent motionEvent, boolean z) {
        if (!i() || !l()) {
            s55.n("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        if (this.a0 == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                s55.n("ReactRootView", "Unable to dispatch pointer events to JS before the dispatcher is available");
            }
        } else {
            EventDispatcher eventDispatcherD = dmc.d(getCurrentReactContext(), getUIManagerType());
            if (eventDispatcherD != null) {
                this.a0.d(motionEvent, eventDispatcherD, z);
            }
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        hh1.m(!this.f, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    public void g(MotionEvent motionEvent) {
        if (!i() || !l()) {
            s55.n("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        if (this.W == null) {
            s55.n("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
            return;
        }
        EventDispatcher eventDispatcherD = dmc.d(getCurrentReactContext(), getUIManagerType());
        if (eventDispatcherD != null) {
            this.W.b(motionEvent, eventDispatcherD, getCurrentReactContext());
        }
    }

    @Override // defpackage.vnc
    public Bundle getAppProperties() {
        return this.c;
    }

    public ReactContext getCurrentReactContext() {
        fmc fmcVar = this.a;
        if (fmcVar == null) {
            return null;
        }
        return fmcVar.e();
    }

    @Override // defpackage.vnc
    public int getHeightMeasureSpec() {
        return this.e0;
    }

    public String getJSModuleName() {
        String str = this.b;
        hh1.n(str);
        return str;
    }

    public fmc getReactInstanceManager() {
        return this.a;
    }

    @Override // defpackage.vnc
    public ViewGroup getRootViewGroup() {
        return this;
    }

    @Override // defpackage.vnc
    public int getRootViewTag() {
        return this.e;
    }

    @Override // defpackage.vnc
    public AtomicInteger getState() {
        return this.k0;
    }

    @Override // defpackage.vnc
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    public int getUIManagerType() {
        return this.j0;
    }

    @Override // defpackage.vnc
    public int getWidthMeasureSpec() {
        return this.d0;
    }

    public void h(StackOverflowError stackOverflowError) {
        if (!i()) {
            l5.r(stackOverflowError);
        } else {
            getCurrentReactContext().handleException(new IllegalViewOperationException(stackOverflowError.getMessage(), this, stackOverflowError));
        }
    }

    public boolean i() {
        fmc fmcVar = this.a;
        return (fmcVar == null || fmcVar.e() == null) ? false : true;
    }

    public boolean j() {
        return this.a != null;
    }

    public final boolean k() {
        if (!i() || !l()) {
            s55.n("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return false;
        }
        if (this.W == null) {
            s55.n("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
            return false;
        }
        if (!ReactFeatureFlags.dispatchPointerEvents || this.a0 != null) {
            return true;
        }
        s55.n("ReactRootView", "Unable to dispatch pointer events to JS before the dispatcher is available");
        return false;
    }

    public boolean l() {
        return this.f;
    }

    public final void m(String str, WritableMap writableMap) {
        if (j()) {
            getCurrentReactContext().emitDeviceEvent(str, writableMap);
        }
    }

    public final void n(int i, int i2, boolean z) {
        UIManager uIManagerJ;
        int i3;
        int i4;
        int i5;
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_START);
        if (!j()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            s55.n("ReactRootView", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        boolean z2 = getUIManagerType() == 2;
        if (z2 && ((i5 = this.e) == 0 || i5 == -1)) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            s55.f("ReactRootView", "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
            return;
        }
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (uIManagerJ = dmc.j(currentReactContext, getUIManagerType(), true)) != null) {
            if (z2) {
                Point pointZ = pyd.z(this);
                int i6 = pointZ.x;
                i4 = pointZ.y;
                i3 = i6;
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (z || i3 != this.h0 || i4 != this.i0) {
                uIManagerJ.updateRootLayoutSpecs(getRootViewTag(), i, i2, i3, i4);
            }
            this.h0 = i3;
            this.i0 = i4;
        }
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (l()) {
            getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (l()) {
            getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!i() || !l()) {
            s55.n("ReactRootView", "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z, i, rect);
            return;
        }
        ojc ojcVar = this.b0;
        int i2 = ojcVar.b;
        if (i2 != -1) {
            ojcVar.a(i2, -1, "blur");
        }
        ojcVar.b = -1;
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        f(motionEvent, false);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        f(motionEvent, true);
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g(motionEvent);
        f(motionEvent, true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.c0 && getUIManagerType() == 2) {
            n(this.d0, this.e0, false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        int iMax2;
        Trace.beginSection(jpf.g("ReactRootView.onMeasure"));
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_START);
        try {
            boolean z = (i == this.d0 && i2 == this.e0) ? false : true;
            this.d0 = i;
            this.e0 = i2;
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 0) {
                iMax = 0;
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
                }
            } else {
                iMax = View.MeasureSpec.getSize(i);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                iMax2 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt2 = getChildAt(i4);
                    iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
                }
            } else {
                iMax2 = View.MeasureSpec.getSize(i2);
            }
            setMeasuredDimension(iMax, iMax2);
            this.c0 = true;
            if (j() && !l()) {
                d();
            } else if (z || this.f0 != iMax || this.g0 != iMax2) {
                n(this.d0, this.e0, true);
            }
            this.f0 = iMax;
            this.g0 = iMax2;
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g(motionEvent);
        f(motionEvent, false);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.V) {
            this.V = false;
            ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, getJSModuleName(), this.e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!i() || !l()) {
            s55.n("ReactRootView", "Unable to handle child focus changed event as the catalyst instance has not been attached");
            super.requestChildFocus(view, view2);
            return;
        }
        ojc ojcVar = this.b0;
        ojcVar.getClass();
        view2.getClass();
        if (ojcVar.b != view2.getId()) {
            int i = ojcVar.b;
            if (i != -1) {
                ojcVar.a(i, -1, "blur");
            }
            ojcVar.b = view2.getId();
            ojcVar.a(view2.getId(), -1, "focus");
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.c = bundle;
        int i = this.e;
        if (i == 0 || i == -1) {
            return;
        }
        a();
    }

    public void setEventListener(b bVar) {
    }

    public void setIsFabric(boolean z) {
        this.j0 = z ? 2 : 1;
    }

    @Override // defpackage.vnc
    public void setRootViewTag(int i) {
        this.e = i;
    }

    @Override // defpackage.vnc
    public void setShouldLogContentAppeared(boolean z) {
        this.V = z;
    }
}
