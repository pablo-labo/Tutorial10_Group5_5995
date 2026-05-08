package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Trace;
import android.util.SparseBooleanArray;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import defpackage.an6;
import defpackage.ay4;
import defpackage.bg;
import defpackage.c74;
import defpackage.dkc;
import defpackage.dmc;
import defpackage.e4g;
import defpackage.e72;
import defpackage.h0g;
import defpackage.h3f;
import defpackage.haa;
import defpackage.hh1;
import defpackage.i3f;
import defpackage.iaa;
import defpackage.ila;
import defpackage.jaf;
import defpackage.jpf;
import defpackage.k0g;
import defpackage.koc;
import defpackage.lc9;
import defpackage.loc;
import defpackage.m0g;
import defpackage.m6;
import defpackage.mkf;
import defpackage.msb;
import defpackage.n0g;
import defpackage.nmc;
import defpackage.nn2;
import defpackage.noc;
import defpackage.o0g;
import defpackage.o6h;
import defpackage.p6;
import defpackage.r6;
import defpackage.s55;
import defpackage.t9a;
import defpackage.vnc;
import defpackage.vqg;
import defpackage.wqg;
import defpackage.xnc;
import defpackage.xog;
import defpackage.ybe;
import e4g.c;
import e4g.d;
import e4g.f;
import e4g.h;
import e4g.j;
import e4g.l;
import e4g.m;
import e4g.n;
import e4g.o;
import e4g.p;
import e4g.q;
import e4g.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = UIManagerModule.NAME)
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG;
    public static final String NAME = "UIManager";
    public static final String TAG = "UIManagerModule";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final EventDispatcher mEventDispatcher;
    private final List<o0g> mListeners;
    private final e mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final k0g mUIImplementation;
    private final CopyOnWriteArrayList<UIManagerListener> mUIManagerListeners;
    private final vqg mViewManagerRegistry;

    public class a implements d {
    }

    public class b extends GuardedRunnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ReactApplicationContext reactApplicationContext, int i, Object obj) {
            super(reactApplicationContext);
            this.a = i;
            this.b = obj;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public final void runGuarded() {
            k0g k0gVar = UIManagerModule.this.mUIImplementation;
            ybe ybeVar = k0gVar.d;
            int i = this.a;
            koc<?> kocVarA = ybeVar.a(i);
            if (kocVarA != null) {
                kocVarA.m(this.b);
                k0gVar.f();
            } else {
                s55.n("ReactNative", "Attempt to set local data for view with unknown tag: " + i);
            }
        }
    }

    public class c extends GuardedRunnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ReactApplicationContext reactApplicationContext, int i, int i2, int i3) {
            super(reactApplicationContext);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public final void runGuarded() {
            UIManagerModule uIManagerModule = UIManagerModule.this;
            ybe ybeVar = uIManagerModule.mUIImplementation.d;
            int i = this.a;
            koc<?> kocVarA = ybeVar.a(i);
            if (kocVarA == null) {
                s55.n("ReactNative", "Tried to update non-existent root tag: " + i);
            } else {
                kocVarA.e(this.b, this.c);
            }
            uIManagerModule.mUIImplementation.e(-1);
        }
    }

    public interface d {
    }

    public static class e implements ComponentCallbacks2 {
        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i) {
            if (i >= 60) {
                ((e72) o6h.a.getValue()).b();
            }
        }
    }

    static {
        dkc.d.getClass();
        DEBUG = false;
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        c74.f(reactApplicationContext);
        ay4 ay4Var = new ay4(reactApplicationContext);
        this.mEventDispatcher = ay4Var;
        HashMap map = new HashMap();
        this.mCustomDirectEvents = map;
        this.mModuleConstants = createConstants(list, null, map);
        vqg vqgVar = new vqg(list);
        this.mViewManagerRegistry = vqgVar;
        this.mUIImplementation = new k0g(reactApplicationContext, vqgVar, ay4Var, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(wqg wqgVar) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        i3f i3fVar = new i3f("CreateUIManagerConstants");
        i3fVar.S(Boolean.TRUE, "Lazy");
        i3fVar.T();
        try {
            return n0g.a(wqgVar);
        } finally {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public static WritableMap getConstantsForViewManager(ViewManager viewManager, Map<String, Object> map) {
        i3f i3fVar = new i3f("UIManagerModule.getConstantsForViewManager");
        i3fVar.S(viewManager.getName(), "ViewManager");
        i3fVar.S(Boolean.TRUE, "Lazy");
        i3fVar.T();
        try {
            return Arguments.makeNativeMap(n0g.c(viewManager, null, map));
        } finally {
            new h3f(11);
            Trace.endSection();
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t, WritableMap writableMap) {
        Trace.beginSection(jpf.g("UIManagerModule.addRootView"));
        int iA = xnc.a();
        mkf mkfVar = new mkf(getReactApplicationContext(), t.getContext(), ((vnc) t).getSurfaceID(), -1);
        k0g k0gVar = this.mUIImplementation;
        synchronized (k0gVar.a) {
            loc locVar = new loc();
            if (an6.a(k0gVar.c)) {
                locVar.j0.B();
            }
            locVar.b = "Root";
            locVar.a = iA;
            locVar.d = mkfVar;
            mkfVar.runOnNativeModulesQueueThread(new jaf(1, k0gVar, locVar));
            haa haaVar = k0gVar.f.b;
            synchronized (haaVar) {
                haaVar.a(t, iA);
            }
        }
        Trace.endSection();
        return iA;
    }

    public void addUIBlock(h0g h0gVar) {
        e4g e4gVar = this.mUIImplementation.f;
        e4gVar.h.add(e4gVar.new q(h0gVar));
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.add(uIManagerListener);
    }

    @Deprecated
    public void addUIManagerListener(o0g o0gVar) {
        this.mListeners.add(o0gVar);
    }

    @ReactMethod
    public void clearJSResponder() {
        e4g e4gVar = this.mUIImplementation.f;
        e4gVar.h.add(e4gVar.new c(0, 0, true, false));
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        e4g e4gVar = this.mUIImplementation.f;
        e4gVar.h.add(e4gVar.new d(readableMap, callback));
    }

    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        noc nocVar;
        if (DEBUG) {
            StringBuilder sbJ = m6.j(i, "(UIManager.createView) tag: ", ", class: ", str, ", props: ");
            sbJ.append(readableMap);
            s55.b("ReactNative", sbJ.toString());
            dkc.d.getClass();
        }
        k0g k0gVar = this.mUIImplementation;
        if (k0gVar.j) {
            synchronized (k0gVar.a) {
                try {
                    koc<?> kocVarCreateShadowNodeInstance = k0gVar.e.a(str).createShadowNodeInstance(k0gVar.c);
                    koc<?> kocVarA = k0gVar.d.a(i2);
                    hh1.o(kocVarA, "Root node with tag " + i2 + " doesn't exist");
                    kocVarCreateShadowNodeInstance.o(i);
                    kocVarCreateShadowNodeInstance.x(str);
                    kocVarCreateShadowNodeInstance.j(kocVarA.B());
                    kocVarCreateShadowNodeInstance.k(kocVarA.K());
                    ybe ybeVar = k0gVar.d;
                    ybeVar.getClass();
                    ybeVar.c.a();
                    ybeVar.a.put(kocVarCreateShadowNodeInstance.B(), kocVarCreateShadowNodeInstance);
                    if (readableMap != null) {
                        nocVar = new noc(readableMap);
                        kocVarCreateShadowNodeInstance.V(nocVar);
                    } else {
                        nocVar = null;
                    }
                    k0gVar.g(kocVarCreateShadowNodeInstance, nocVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        k0g k0gVar = this.mUIImplementation;
        k0gVar.getClass();
        if (k0gVar.d(i, "dispatchViewManagerCommand: " + i2)) {
            e4g e4gVar = k0gVar.f;
            e4gVar.getClass();
            e4gVar.g.add(e4gVar.new f(i, i2, readableArray));
        }
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, Dynamic dynamic, ReadableArray readableArray) {
        UIManager uIManagerI = dmc.i(getReactApplicationContext(), msb.e(i));
        if (uIManagerI == null) {
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            uIManagerI.dispatchCommand(i, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            uIManagerI.dispatchCommand(i, dynamic.asString(), readableArray);
        }
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        k0g k0gVar = this.mUIImplementation;
        float fRound = Math.round(nn2.G((float) readableArray.getDouble(0)));
        float fRound2 = Math.round(nn2.G((float) readableArray.getDouble(1)));
        e4g e4gVar = k0gVar.f;
        e4gVar.h.add(e4gVar.new j(i, fRound, fRound2, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap((Map<String, Object>) lc9.a0(new Pair("bubblingEventTypes", m0g.a), new Pair("directEventTypes", m0g.b)));
    }

    @Deprecated
    public d getDirectEventNamesResolver() {
        return new a();
    }

    @Override // com.facebook.react.bridge.UIManager
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        e4g e4gVar = this.mUIImplementation.f;
        e4gVar.getClass();
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(e4gVar.p));
        map.put("CommitEndTime", Long.valueOf(e4gVar.q));
        map.put("LayoutTime", Long.valueOf(e4gVar.r));
        map.put("DispatchViewUpdatesTime", Long.valueOf(e4gVar.s));
        map.put("RunStartTime", Long.valueOf(e4gVar.t));
        map.put("RunEndTime", Long.valueOf(e4gVar.u));
        map.put("BatchedExecutionTime", Long.valueOf(e4gVar.v));
        map.put("NonBatchedExecutionTime", Long.valueOf(e4gVar.w));
        map.put("NativeModulesThreadCpuTime", Long.valueOf(e4gVar.x));
        map.put("CreateViewCount", Long.valueOf(e4gVar.y));
        map.put("UpdatePropsCount", Long.valueOf(e4gVar.z));
        return map;
    }

    @Deprecated
    public k0g getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public vqg getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        getReactApplicationContext().registerComponentCallbacks(this.mViewManagerRegistry);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.mEventDispatcher.c();
        k0g k0gVar = this.mUIImplementation;
        k0gVar.j = false;
        k0gVar.e.c();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.unregisterComponentCallbacks(this.mMemoryTrimCallback);
        reactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        ((e72) o6h.a.getValue()).b();
        com.facebook.react.uimanager.d.a();
    }

    public void invalidateNodeLayout(int i) {
        koc<?> kocVarA = this.mUIImplementation.d.a(i);
        if (kocVarA != null) {
            kocVarA.w();
            this.mUIImplementation.e(-1);
        } else {
            s55.n("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i);
        }
    }

    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        int[] iArr;
        boolean z;
        ReadableArray readableArray6 = readableArray;
        if (DEBUG) {
            s55.b("ReactNative", "(UIManager.manageChildren) tag: " + i + ", moveFrom: " + readableArray6 + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5);
            dkc.d.getClass();
        }
        k0g k0gVar = this.mUIImplementation;
        if (k0gVar.j) {
            synchronized (k0gVar.a) {
                try {
                    koc<?> kocVarA = k0gVar.d.a(i);
                    int size = readableArray6 == null ? 0 : readableArray6.size();
                    int size2 = readableArray3 == null ? 0 : readableArray3.size();
                    int size3 = readableArray5 == null ? 0 : readableArray5.size();
                    if (size != 0 && (readableArray2 == null || size != readableArray2.size())) {
                        throw new IllegalViewOperationException("Size of moveFrom != size of moveTo!");
                    }
                    if (size2 != 0 && (readableArray4 == null || size2 != readableArray4.size())) {
                        throw new IllegalViewOperationException("Size of addChildTags != size of addAtIndices!");
                    }
                    int i2 = size + size2;
                    xog[] xogVarArr = new xog[i2];
                    int i3 = size + size3;
                    int[] iArr2 = new int[i3];
                    int[] iArr3 = new int[i3];
                    int[] iArr4 = new int[size3];
                    if (size > 0) {
                        hh1.n(readableArray6);
                        hh1.n(readableArray2);
                        iArr = iArr4;
                        int i4 = 0;
                        while (i4 < size) {
                            int i5 = size;
                            int i6 = readableArray6.getInt(i4);
                            int i7 = kocVarA.a(i6).a;
                            xogVarArr[i4] = new xog(i7, readableArray2.getInt(i4));
                            iArr2[i4] = i6;
                            iArr3[i4] = i7;
                            i4++;
                            readableArray6 = readableArray;
                            size = i5;
                            i3 = i3;
                        }
                    } else {
                        iArr = iArr4;
                    }
                    int i8 = size;
                    int i9 = i3;
                    if (size2 > 0) {
                        hh1.n(readableArray3);
                        hh1.n(readableArray4);
                        for (int i10 = 0; i10 < size2; i10++) {
                            xogVarArr[i8 + i10] = new xog(readableArray3.getInt(i10), readableArray4.getInt(i10));
                        }
                    }
                    if (size3 > 0) {
                        hh1.n(readableArray5);
                        for (int i11 = 0; i11 < size3; i11++) {
                            int i12 = readableArray5.getInt(i11);
                            int i13 = kocVarA.a(i12).a;
                            int i14 = i8 + i11;
                            iArr2[i14] = i12;
                            iArr3[i14] = i13;
                            iArr[i11] = i13;
                        }
                    }
                    Arrays.sort(xogVarArr, xog.c);
                    Arrays.sort(iArr2);
                    int i15 = -1;
                    for (int i16 = i9 - 1; i16 >= 0; i16--) {
                        int i17 = iArr2[i16];
                        if (i17 == i15) {
                            throw new IllegalViewOperationException("Repeated indices in Removal list for view tag: " + i);
                        }
                        kocVarA.v(i17);
                        i15 = iArr2[i16];
                    }
                    for (int i18 = 0; i18 < i2; i18++) {
                        xog xogVar = xogVarArr[i18];
                        koc<?> kocVarA2 = k0gVar.d.a(xogVar.a);
                        if (kocVarA2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + xogVar.a);
                        }
                        kocVarA.R(kocVarA2, xogVar.b);
                    }
                    iaa iaaVar = k0gVar.g;
                    ybe ybeVar = iaaVar.b;
                    for (int i19 = 0; i19 < i9; i19++) {
                        int i20 = iArr3[i19];
                        int i21 = 0;
                        while (true) {
                            if (i21 >= size3) {
                                z = false;
                                break;
                            } else {
                                if (iArr[i21] == i20) {
                                    z = true;
                                    break;
                                }
                                i21++;
                            }
                        }
                        iaaVar.g(ybeVar.a(i20), z);
                    }
                    for (int i22 = 0; i22 < i2; i22++) {
                        xog xogVar2 = xogVarArr[i22];
                        iaaVar.c(kocVarA, ybeVar.a(xogVar2.a), xogVar2.b);
                    }
                    for (int i23 = 0; i23 < size3; i23++) {
                        koc<?> kocVarA3 = k0gVar.d.a(iArr[i23]);
                        k0gVar.j(kocVarA3);
                        kocVarA3.dispose();
                    }
                } finally {
                }
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void markActiveTouchForTag(int i, int i2) {
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        k0g k0gVar = this.mUIImplementation;
        if (k0gVar.j) {
            e4g e4gVar = k0gVar.f;
            e4gVar.h.add(e4gVar.new m(i, callback));
        }
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        k0g k0gVar = this.mUIImplementation;
        if (k0gVar.j) {
            e4g e4gVar = k0gVar.f;
            e4gVar.h.add(e4gVar.new l(i, callback));
        }
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        k0g k0gVar = this.mUIImplementation;
        if (k0gVar.j) {
            try {
                k0gVar.h(i, i2, k0gVar.h);
                callback2.invoke(Float.valueOf(nn2.C(k0gVar.h[0])), Float.valueOf(nn2.C(k0gVar.h[1])), Float.valueOf(nn2.C(k0gVar.h[2])), Float.valueOf(nn2.C(k0gVar.h[3])));
            } catch (IllegalViewOperationException e2) {
                callback.invoke(e2.getMessage());
            }
        }
    }

    @Override // com.facebook.react.bridge.OnBatchCompleteListener
    public void onBatchComplete() {
        int size;
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        i3f i3fVar = new i3f("onBatchCompleteUI");
        i3fVar.R("BatchId", String.valueOf(i));
        i3fVar.T();
        Iterator<o0g> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        Iterator<UIManagerListener> it2 = this.mUIManagerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().willDispatchViewUpdates(this);
        }
        try {
            haa haaVar = this.mUIImplementation.f.b;
            synchronized (haaVar) {
                size = haaVar.c.size();
            }
            if (size > 0) {
                this.mUIImplementation.e(i);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.getClass();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        e4g e4gVar = this.mUIImplementation.f;
        e4gVar.l = false;
        com.facebook.react.modules.core.a aVar = com.facebook.react.modules.core.a.f;
        if (aVar == null) {
            r6.g("ReactChoreographer needs to be initialized.");
        } else {
            aVar.c(a.EnumC0132a.a, e4gVar.e);
            e4gVar.c();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        e4g e4gVar = this.mUIImplementation.f;
        e4gVar.l = true;
        com.facebook.react.modules.core.a aVar = com.facebook.react.modules.core.a.f;
        if (aVar != null) {
            aVar.b(a.EnumC0132a.a, e4gVar.e);
        } else {
            r6.g("ReactChoreographer needs to be initialized.");
        }
    }

    public void prependUIBlock(h0g h0gVar) {
        e4g e4gVar = this.mUIImplementation.f;
        e4gVar.h.add(0, e4gVar.new q(h0gVar));
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        e4g e4gVar = this.mUIImplementation.f;
        e4gVar.n = true;
        e4gVar.p = 0L;
        e4gVar.y = 0L;
        e4gVar.z = 0L;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i, int i2, String str, WritableMap writableMap) {
        ((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(i2, str, writableMap);
    }

    @ReactMethod
    public void removeRootView(int i) {
        k0g k0gVar = this.mUIImplementation;
        synchronized (k0gVar.a) {
            ybe ybeVar = k0gVar.d;
            SparseBooleanArray sparseBooleanArray = ybeVar.b;
            ybeVar.c.a();
            if (i != -1) {
                if (!sparseBooleanArray.get(i)) {
                    throw new IllegalViewOperationException(bg.d(i, "View with tag ", " is not registered as a root view"));
                }
                ybeVar.a.remove(i);
                sparseBooleanArray.delete(i);
            }
        }
        e4g e4gVar = k0gVar.f;
        e4gVar.h.add(e4gVar.new n(i));
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.remove(uIManagerListener);
    }

    @Deprecated
    public void removeUIManagerListener(o0g o0gVar) {
        this.mListeners.remove(o0gVar);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        Map map;
        return (str == null || (map = (Map) this.mCustomDirectEvents.get(str)) == null) ? str : (String) map.get("registrationName");
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i) {
        if (i % 10 != 1) {
            ybe ybeVar = this.mUIImplementation.d;
            ybeVar.c.a();
            if (!ybeVar.b.get(i)) {
                koc<?> kocVarA = ybeVar.a(i);
                if (kocVarA != null) {
                    return kocVarA.M();
                }
                s55.n("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i);
                return 0;
            }
        }
        return i;
    }

    @Override // com.facebook.react.bridge.UIManager
    public View resolveView(int i) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.f.b.j(i);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        int iE = msb.e(i);
        if (iE != 2) {
            e4g e4gVar = this.mUIImplementation.f;
            e4gVar.h.add(e4gVar.new o(i, i2));
        } else {
            UIManager uIManagerI = dmc.i(getReactApplicationContext(), iE);
            if (uIManagerI != null) {
                uIManagerI.sendAccessibilityEvent(i, i2);
            }
        }
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        if (DEBUG) {
            s55.b("ReactNative", "(UIManager.setChildren) tag: " + i + ", children: " + readableArray);
            dkc.d.getClass();
        }
        k0g k0gVar = this.mUIImplementation;
        if (k0gVar.j) {
            synchronized (k0gVar.a) {
                try {
                    koc<?> kocVarA = k0gVar.d.a(i);
                    for (int i2 = 0; i2 < readableArray.size(); i2++) {
                        koc<?> kocVarA2 = k0gVar.d.a(readableArray.getInt(i2));
                        if (kocVarA2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i2));
                        }
                        kocVarA.R(kocVarA2, i2);
                    }
                    iaa iaaVar = k0gVar.g;
                    iaaVar.getClass();
                    for (int i3 = 0; i3 < readableArray.size(); i3++) {
                        iaaVar.c(kocVarA, iaaVar.b.a(readableArray.getInt(i3)), i3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        k0g k0gVar = this.mUIImplementation;
        koc<?> kocVarA = k0gVar.d.a(i);
        if (kocVarA == null) {
            return;
        }
        while (kocVarA.L() == t9a.c) {
            kocVarA = kocVarA.getParent();
        }
        e4g e4gVar = k0gVar.f;
        e4gVar.h.add(e4gVar.new c(kocVarA.B(), i, false, z));
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        e4g e4gVar = this.mUIImplementation.f;
        e4gVar.h.add(e4gVar.new p(z));
    }

    public void setViewHierarchyUpdateDebugListener(ila ilaVar) {
        this.mUIImplementation.f.k = ilaVar;
    }

    public void setViewLocalData(int i, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new b(reactApplicationContext, i, obj));
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t, String str, WritableMap writableMap, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sweepActiveTouchForTag(int i, int i2) {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap) {
        k0g k0gVar = this.mUIImplementation;
        noc nocVar = new noc(readableMap);
        k0gVar.getClass();
        UiThreadUtil.assertOnUiThread();
        k0gVar.f.b.n(i, nocVar);
    }

    public void updateInsetsPadding(int i, int i2, int i3, int i4, int i5) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        k0g k0gVar = this.mUIImplementation;
        koc<?> kocVarA = k0gVar.d.a(i);
        if (kocVarA == null) {
            s55.n("ReactNative", "Tried to update size of non-existent tag: " + i);
        } else {
            kocVarA.r(i3, 4);
            kocVarA.r(i2, 1);
            kocVarA.r(i5, 5);
            kocVarA.r(i4, 3);
            k0gVar.f();
        }
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        k0g k0gVar = this.mUIImplementation;
        koc<?> kocVarA = k0gVar.d.a(i);
        if (kocVarA == null) {
            s55.n("ReactNative", "Tried to update size of non-existent tag: " + i);
        } else {
            kocVarA.G(i2);
            kocVarA.d(i3);
            k0gVar.f();
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i, int i2, int i3, int i4, int i5) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new c(reactApplicationContext, i, i2, i3));
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        if (DEBUG) {
            StringBuilder sbJ = m6.j(i, "(UIManager.updateView) tag: ", ", class: ", str, ", props: ");
            sbJ.append(readableMap);
            s55.b("ReactNative", sbJ.toString());
            dkc.d.getClass();
        }
        k0g k0gVar = this.mUIImplementation;
        if (k0gVar.j) {
            k0gVar.e.a(str);
            koc<?> kocVarA = k0gVar.d.a(i);
            if (kocVarA == null) {
                throw new IllegalViewOperationException(p6.c(i, "Trying to update non-existent view with tag "));
            }
            if (readableMap != null) {
                noc nocVar = new noc(readableMap);
                kocVarA.V(nocVar);
                if (kocVarA.E()) {
                    return;
                }
                iaa iaaVar = k0gVar.g;
                iaaVar.getClass();
                if (kocVarA.U() && !iaa.f(nocVar)) {
                    iaaVar.h(kocVarA, nocVar);
                } else {
                    if (kocVarA.U()) {
                        return;
                    }
                    e4g e4gVar = iaaVar.a;
                    int iB = kocVarA.B();
                    e4gVar.z++;
                    e4gVar.h.add(e4gVar.new t(iB, nocVar));
                }
            }
        }
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        ybe ybeVar = this.mUIImplementation.d;
        koc<?> kocVarA = ybeVar.a(i);
        koc<?> kocVarA2 = ybeVar.a(i2);
        if (kocVarA == null || kocVarA2 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(kocVarA.J(kocVarA2)));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        receiveEvent(-1, i, str, writableMap);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        k0g k0gVar = this.mUIImplementation;
        k0gVar.getClass();
        if (k0gVar.d(i, "dispatchViewManagerCommand: " + str)) {
            e4g e4gVar = k0gVar.f;
            e4gVar.getClass();
            e4gVar.g.add(e4gVar.new h(i, str, readableArray));
        }
    }

    public static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        i3f i3fVar = new i3f("CreateUIManagerConstants");
        i3fVar.S(Boolean.FALSE, "Lazy");
        i3fVar.T();
        try {
            return n0g.b(list, map, map2);
        } finally {
            Trace.endSection();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        ViewManager<?, ?> viewManagerB;
        vqg vqgVar = this.mUIImplementation.e;
        synchronized (vqgVar) {
            str.getClass();
            viewManagerB = (ViewManager) vqgVar.a.get(str);
            if (viewManagerB == null) {
                viewManagerB = vqgVar.b != null ? vqgVar.b(str) : null;
            }
        }
        if (viewManagerB == null) {
            return null;
        }
        return getConstantsForViewManager(viewManagerB, this.mCustomDirectEvents);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, wqg wqgVar, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        c74.f(reactApplicationContext);
        ay4 ay4Var = new ay4(reactApplicationContext);
        this.mEventDispatcher = ay4Var;
        this.mModuleConstants = createConstants(wqgVar);
        this.mCustomDirectEvents = m0g.b;
        vqg vqgVar = new vqg(wqgVar);
        this.mViewManagerRegistry = vqgVar;
        this.mUIImplementation = new k0g(reactApplicationContext, vqgVar, ay4Var, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public <T extends View> int addRootView(T t) {
        return addRootView(t, null);
    }
}
