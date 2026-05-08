package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.fabric.a;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.internal.interop.InteropEventEmitter;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.text.PreparedLayout;
import defpackage.a0a;
import defpackage.a65;
import defpackage.an6;
import defpackage.bg;
import defpackage.e2f;
import defpackage.ee6;
import defpackage.epg;
import defpackage.f2f;
import defpackage.f6e;
import defpackage.fj7;
import defpackage.hh1;
import defpackage.i0g;
import defpackage.ie7;
import defpackage.im8;
import defpackage.j0g;
import defpackage.l5;
import defpackage.le1;
import defpackage.lif;
import defpackage.m6h;
import defpackage.me1;
import defpackage.mkf;
import defpackage.nn2;
import defpackage.o0f;
import defpackage.p0f;
import defpackage.p6;
import defpackage.ppc;
import defpackage.prg;
import defpackage.pyd;
import defpackage.qb0;
import defpackage.qmc;
import defpackage.r6;
import defpackage.r64;
import defpackage.s55;
import defpackage.s59;
import defpackage.t64;
import defpackage.u64;
import defpackage.vnc;
import defpackage.vqg;
import defpackage.vse;
import defpackage.w14;
import defpackage.wab;
import defpackage.wtf;
import defpackage.xnc;
import defpackage.y55;
import defpackage.ypd;
import defpackage.zhb;
import defpackage.zkd;
import defpackage.zo7;
import defpackage.zz9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"MissingNativeLoadLibrary"})
public class FabricUIManager implements UIManager, LifecycleEventListener, j0g, f2f {
    private static final a.InterfaceC0131a FABRIC_PERF_LOGGER = new a65();
    public static final boolean IS_DEVELOPMENT_ENVIRONMENT = false;
    public static final String TAG = "FabricUIManager";
    private final le1 mBatchEventDispatchedListener;
    private FabricUIManagerBinding mBinding;
    public com.facebook.react.fabric.a mDevToolsReactPerfLogger;
    private final f mDispatchUIFrameCallback;
    private final y55 mEventDispatcher;
    private fj7 mInteropUIBlockListener;
    private final zz9 mMountItemDispatcher;
    private final a0a.a mMountItemExecutor;
    private final a0a mMountingManager;
    private final ReactApplicationContext mReactApplicationContext;
    private final vqg mViewManagerRegistry;
    private final CopyOnWriteArrayList<UIManagerListener> mListeners = new CopyOnWriteArrayList<>();
    private boolean mMountNotificationScheduled = false;
    private List<Integer> mSurfaceIdsWithPendingMountNotification = new ArrayList();
    private final Set<e2f> mSynchronousEvents = new HashSet();
    private volatile boolean mDestroyed = false;
    private boolean mDriveCxxAnimations = false;
    private boolean mDriveCxxNativeAnimated = ie7.g0.cxxNativeAnimatedEnabled();
    private long mDispatchViewUpdatesTime = 0;
    private long mCommitStartTime = 0;
    private long mLayoutTime = 0;
    private long mFinishTransactionTime = 0;
    private long mFinishTransactionCPPTime = 0;
    private int mCurrentSynchronousCommitNumber = 10000;

    public class a implements a0a.a {
        public a() {
        }
    }

    public class b implements MountItem {
        public final /* synthetic */ int a;
        public final /* synthetic */ ReadableMap b;

        public b(int i, ReadableMap readableMap) {
            this.a = i;
            this.b = readableMap;
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public final void execute(a0a a0aVar) {
            try {
                int i = this.a;
                ReadableMap readableMap = this.b;
                a0aVar.getClass();
                UiThreadUtil.assertOnUiThread();
                if (readableMap == null) {
                    return;
                }
                a0aVar.d(i).i(i, readableMap);
            } catch (Exception unused) {
            }
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public final int getSurfaceId() {
            return -1;
        }

        public final String toString() {
            return String.format("SYNC UPDATE PROPS [%d]: %s", Integer.valueOf(this.a), FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT ? this.b.toHashMap().toString() : "<hidden>");
        }
    }

    public class c extends GuardedRunnable {
        public c(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public final void runGuarded() {
            FabricUIManager.this.mMountItemDispatcher.d();
        }
    }

    public class d implements MountItem {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;

        public d(int i, int i2, int i3, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public final void execute(a0a a0aVar) {
            p0f p0fVarA = a0aVar.a(this.a);
            if (p0fVarA == null) {
                s55.f(FabricUIManager.TAG, "setJSResponder skipped, surface no longer available [" + this.a + "]");
                return;
            }
            int i = this.b;
            int i2 = this.c;
            boolean z = this.d;
            synchronized (p0fVarA) {
                UiThreadUtil.assertOnUiThread();
                if (p0fVarA.a) {
                    return;
                }
                if (!z) {
                    p0fVarA.f.a(i2, null);
                    return;
                }
                p0f.b bVarE = p0fVarA.e(i);
                View view = bVarE.a;
                if (i2 != i && (view instanceof ViewParent)) {
                    p0fVarA.f.a(i2, (ViewParent) view);
                    return;
                }
                if (view == 0) {
                    SoftAssertions.assertUnreachable("Cannot find view for tag [" + i + "].");
                    return;
                }
                if (bVarE.c) {
                    SoftAssertions.assertUnreachable("Cannot block native responder on [" + i + "] that is a root view");
                }
                p0fVarA.f.a(i2, view.getParent());
            }
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public final int getSurfaceId() {
            return this.a;
        }

        @SuppressLint({"DefaultLocale"})
        public final String toString() {
            return String.format("SET_JS_RESPONDER [%d] [surface:%d]", Integer.valueOf(this.b), Integer.valueOf(this.a));
        }
    }

    public class e implements MountItem {
        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public final void execute(a0a a0aVar) {
            zo7 zo7Var = a0aVar.g;
            zo7Var.a = -1;
            ViewParent viewParent = zo7Var.b;
            if (viewParent != null) {
                viewParent.requestDisallowInterceptTouchEvent(false);
            }
            zo7Var.b = null;
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public final int getSurfaceId() {
            return -1;
        }

        public final String toString() {
            return "CLEAR_JS_RESPONDER";
        }
    }

    public class f extends ee6 {
        public volatile boolean b;
        public boolean c;
        public boolean d;

        public f(ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.b = true;
            this.c = false;
            this.d = false;
        }

        @Override // defpackage.ee6
        public final void a(long j) {
            this.d = false;
            if (!this.b) {
                s55.n(FabricUIManager.TAG, "Not flushing pending UI operations: exception was previously thrown");
                return;
            }
            if (FabricUIManager.this.mDestroyed) {
                s55.n(FabricUIManager.TAG, "Not flushing pending UI operations: FabricUIManager is destroyed");
                return;
            }
            if ((FabricUIManager.this.mDriveCxxAnimations || FabricUIManager.this.mDriveCxxNativeAnimated) && FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.driveCxxAnimations();
            }
            if (FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.drainPreallocateViewsQueue();
            }
            try {
                try {
                    FabricUIManager.this.mMountItemDispatcher.b(j);
                    FabricUIManager.this.mMountItemDispatcher.d();
                    b();
                    FabricUIManager.this.mSynchronousEvents.clear();
                } catch (Exception e) {
                    s55.g(FabricUIManager.TAG, "Exception thrown when executing UIFrameGuarded", e);
                    this.b = false;
                    throw e;
                }
            } catch (Throwable th) {
                b();
                throw th;
            }
        }

        public final void b() {
            if (this.d || !this.c) {
                return;
            }
            this.d = true;
            com.facebook.react.modules.core.a aVar = com.facebook.react.modules.core.a.f;
            if (aVar != null) {
                aVar.b(a.EnumC0132a.a, this);
            } else {
                r6.g("ReactChoreographer needs to be initialized.");
            }
        }
    }

    public class g {
        public g() {
        }
    }

    static {
        zkd.M();
    }

    public FabricUIManager(ReactApplicationContext reactApplicationContext, vqg vqgVar, le1 le1Var) {
        a aVar = new a();
        this.mMountItemExecutor = aVar;
        this.mDispatchUIFrameCallback = new f(reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        a0a a0aVar = new a0a(vqgVar, aVar);
        this.mMountingManager = a0aVar;
        this.mMountItemDispatcher = new zz9(a0aVar, new g());
        this.mEventDispatcher = new y55(reactApplicationContext, new FabricEventEmitter(this));
        this.mBatchEventDispatchedListener = le1Var;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mViewManagerRegistry = vqgVar;
        reactApplicationContext.registerComponentCallbacks(vqgVar);
    }

    private MountItem createIntBufferBatchMountItem(int i, int[] iArr, Object[] objArr, int i2) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        return new IntBufferBatchMountItem(i, iArr, objArr, i2);
    }

    private void destroyUnmountedView(int i, int i2) {
        zz9 zz9Var = this.mMountItemDispatcher;
        zz9Var.d.add(new w14(i, i2));
    }

    private fj7 getInteropUIBlockListener() {
        if (this.mInteropUIBlockListener == null) {
            fj7 fj7Var = new fj7();
            this.mInteropUIBlockListener = fj7Var;
            addUIManagerEventListener(fj7Var);
        }
        return this.mInteropUIBlockListener;
    }

    @SuppressLint({"NotInvokedPrivateMethod"})
    private boolean isOnMainThread() {
        return UiThreadUtil.isOnUiThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$static$0(a.b bVar) {
        bVar.getClass();
        long jA = bVar.a(ReactMarkerConstants.FABRIC_COMMIT_END) - bVar.a(ReactMarkerConstants.FABRIC_COMMIT_START);
        long jA2 = bVar.a(ReactMarkerConstants.FABRIC_LAYOUT_END) - bVar.a(ReactMarkerConstants.FABRIC_LAYOUT_START);
        long jA3 = bVar.a(ReactMarkerConstants.FABRIC_DIFF_END) - bVar.a(ReactMarkerConstants.FABRIC_DIFF_START);
        long jA4 = bVar.a(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END) - bVar.a(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START);
        long jA5 = bVar.a(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END) - bVar.a(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START);
        s59 s59Var = com.facebook.react.fabric.a.c;
        s59Var.a(jA);
        s59 s59Var2 = com.facebook.react.fabric.a.d;
        s59Var2.a(jA2);
        s59 s59Var3 = com.facebook.react.fabric.a.e;
        s59Var3.a(jA3);
        s59 s59Var4 = com.facebook.react.fabric.a.f;
        s59Var4.a(jA4);
        s59 s59Var5 = com.facebook.react.fabric.a.g;
        s59Var5.a(jA5);
        String str = TAG;
        Object[] objArr = {Long.valueOf(bVar.a), Long.valueOf(jA), Double.valueOf(s59Var.c), Double.valueOf(s59Var.b()), Long.valueOf(s59Var.e), Long.valueOf(jA2), Double.valueOf(s59Var2.c), Double.valueOf(s59Var2.b()), Long.valueOf(s59Var2.e), Long.valueOf(jA3), Double.valueOf(s59Var3.c), Double.valueOf(s59Var3.b()), Long.valueOf(s59Var3.e), Long.valueOf(jA4), Double.valueOf(s59Var4.c), Double.valueOf(s59Var4.b()), Long.valueOf(s59Var4.e), Long.valueOf(jA5), Double.valueOf(s59Var5.c), Double.valueOf(s59Var5.b()), Long.valueOf(s59Var5.e)};
        s55.a.getClass();
        if (wab.p(4)) {
            wab.t(4, str, String.format(null, "Statistics of Fabric commit #%d:\n - Total commit time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Layout time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Diffing time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - FinishTransaction (Diffing + JNI serialization): %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Mounting: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n", objArr));
        }
    }

    private NativeArray measureLines(ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f2, float f3) {
        NativeModule nativeModuleA = this.mViewManagerRegistry.a("RCTText");
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        float fG = nn2.G(f2);
        float fG2 = nn2.G(f3);
        ppc ppcVar = nativeModuleA instanceof ppc ? (ppc) nativeModuleA : null;
        lif lifVar = lif.a;
        reactApplicationContext.getClass();
        readableMapBuffer.getClass();
        readableMapBuffer2.getClass();
        lif.a.getClass();
        m6h m6hVar = m6h.EXACTLY;
        Layout layoutF = lif.f(reactApplicationContext, readableMapBuffer, readableMapBuffer2, fG, m6hVar, fG2, m6hVar, ppcVar);
        CharSequence text = layoutF.getText();
        text.getClass();
        return (NativeArray) ypd.y(text, layoutF, reactApplicationContext);
    }

    private void preallocateView(int i, int i2, String str, Object obj, Object obj2, boolean z) {
        p0f p0fVarA;
        zz9 zz9Var = this.mMountItemDispatcher;
        str.getClass();
        zhb zhbVar = new zhb(i, i2, str, (ReadableMap) obj, (vse) obj2, z);
        zz9Var.getClass();
        a0a a0aVar = zz9Var.a;
        if (!a0aVar.d.contains(Integer.valueOf(i)) && ((p0fVarA = a0aVar.a(i)) == null || !p0fVarA.a)) {
            zz9Var.e.add(zhbVar);
        } else if (IS_DEVELOPMENT_ENVIRONMENT) {
            s55.h("MountItemDispatcher", "Not queueing PreAllocateMountItem: surfaceId stopped: [%d] - %s", Integer.valueOf(i), zhbVar.toString());
        }
    }

    private void scheduleMountItem(MountItem mountItem, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z = mountItem instanceof me1;
        boolean z2 = true;
        if (z) {
            z2 = !((me1) mountItem).isBatchEmpty();
        } else if (mountItem == null) {
            z2 = false;
        }
        Iterator<UIManagerListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().didScheduleMountItems(this);
        }
        if (z) {
            this.mCommitStartTime = j;
            this.mLayoutTime = j5 - j4;
            this.mFinishTransactionCPPTime = j7 - j6;
            this.mFinishTransactionTime = jUptimeMillis - j6;
            this.mDispatchViewUpdatesTime = SystemClock.uptimeMillis();
        }
        if (z2) {
            hh1.o(mountItem, "MountItem is null");
            this.mMountItemDispatcher.d.add(mountItem);
            c cVar = new c(this.mReactApplicationContext);
            if (UiThreadUtil.isOnUiThread()) {
                cVar.run();
            }
        }
        if (z) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i, j);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i, j6);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i, j7);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i, j2);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i, j3);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i, j4);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i, j5);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES, null, i, j5, i2);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public <T extends View> int addRootView(T t, WritableMap writableMap) {
        String str = TAG;
        ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("Do not call addRootView in Fabric; it is unsupported. Call startSurface instead."));
        vnc vncVar = (vnc) t;
        int rootViewTag = vncVar.getRootViewTag();
        this.mMountingManager.e(rootViewTag, new mkf(this.mReactApplicationContext, t.getContext(), vncVar.getSurfaceID(), rootViewTag), t);
        String jSModuleName = vncVar.getJSModuleName();
        if (ie7.g0.enableFabricLogs()) {
            s55.c(str, "Starting surface for module: %s and reactTag: %d", jSModuleName, Integer.valueOf(rootViewTag));
        }
        hh1.o(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.startSurface(rootViewTag, jSModuleName, (NativeMap) writableMap);
        return rootViewTag;
    }

    public void addUIBlock(i0g i0gVar) {
        if (ie7.g0.useFabricInterop()) {
            fj7 interopUIBlockListener = getInteropUIBlockListener();
            synchronized (interopUIBlockListener) {
                i0gVar.getClass();
                interopUIBlockListener.b.add(i0gVar);
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.add(uIManagerListener);
    }

    public void attachRootView(SurfaceHandlerBinding surfaceHandlerBinding, View view) {
        mkf mkfVar = new mkf(this.mReactApplicationContext, view.getContext(), surfaceHandlerBinding.b(), surfaceHandlerBinding.d());
        p0f p0fVarB = this.mMountingManager.b(surfaceHandlerBinding.d(), "attachView");
        if (p0fVarB.a) {
            ReactSoftExceptionLogger.logSoftException("a0a", new IllegalStateException("Trying to attach a view to a stopped surface"));
        } else {
            p0fVarB.a(mkfVar, view);
        }
        surfaceHandlerBinding.i();
    }

    public void clearJSResponder() {
        zz9 zz9Var = this.mMountItemDispatcher;
        zz9Var.d.add(new e());
    }

    public r64 createDispatchCommandMountItemForInterop(int i, int i2, String str, ReadableArray readableArray) {
        try {
            int i3 = Integer.parseInt(str);
            readableArray.getClass();
            return new t64(i, i2, i3, readableArray);
        } catch (NumberFormatException unused) {
            str.getClass();
            readableArray.getClass();
            return new u64(i, i2, str, readableArray);
        }
    }

    public void dispatchCommand(int i, int i2, String str, ReadableArray readableArray) {
        boolean zUseFabricInterop = ie7.g0.useFabricInterop();
        zz9 zz9Var = this.mMountItemDispatcher;
        if (zUseFabricInterop) {
            r64 r64VarCreateDispatchCommandMountItemForInterop = createDispatchCommandMountItemForInterop(i, i2, str, readableArray);
            zz9Var.getClass();
            r64VarCreateDispatchCommandMountItemForInterop.getClass();
            zz9Var.c.add(r64VarCreateDispatchCommandMountItemForInterop);
            return;
        }
        str.getClass();
        readableArray.getClass();
        u64 u64Var = new u64(i, i2, str, readableArray);
        zz9Var.getClass();
        zz9Var.c.add(u64Var);
    }

    public void experimental_prefetchResource(String str, int i, int i2, ReadableMapBuffer readableMapBuffer) {
        a0a a0aVar = this.mMountingManager;
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        vqg vqgVar = a0aVar.a;
        if (str != null) {
            vqgVar.a(str).experimental_prefetchResource(reactApplicationContext, i, i2, readableMapBuffer);
        } else {
            r6.g("Required value was null.");
        }
    }

    public Integer findNextFocusableElement(int i, int i2, int i3) {
        FabricUIManagerBinding fabricUIManagerBinding = this.mBinding;
        if (fabricUIManagerBinding == null) {
            return null;
        }
        int i4 = 1;
        if (i3 == 1) {
            i4 = 5;
        } else if (i3 == 2) {
            i4 = 4;
        } else if (i3 == 17) {
            i4 = 3;
        } else if (i3 != 33) {
            if (i3 == 66) {
                i4 = 2;
            } else {
                if (i3 != 130) {
                    return null;
                }
                i4 = 0;
            }
        }
        int iFindNextFocusableElement = fabricUIManagerBinding.findNextFocusableElement(i, i2, i4);
        if (iFindNextFocusableElement == -1) {
            return null;
        }
        return Integer.valueOf(iFindNextFocusableElement);
    }

    public int getColor(int i, String[] strArr) {
        mkf mkfVar = this.mMountingManager.b(i, "getColor").c;
        if (mkfVar == null) {
            return 0;
        }
        for (String str : strArr) {
            Integer numResolveResourcePath = ColorPropConverter.resolveResourcePath(mkfVar, str);
            if (numResolveResourcePath != null) {
                return numResolveResourcePath.intValue();
            }
        }
        return 0;
    }

    @Override // com.facebook.react.bridge.UIManager
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.mCommitStartTime));
        map.put("LayoutTime", Long.valueOf(this.mLayoutTime));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.mDispatchViewUpdatesTime));
        map.put("RunStartTime", Long.valueOf(this.mMountItemDispatcher.h));
        map.put("BatchedExecutionTime", Long.valueOf(this.mMountItemDispatcher.g));
        map.put("FinishFabricTransactionTime", Long.valueOf(this.mFinishTransactionTime));
        map.put("FinishFabricTransactionCPPTime", Long.valueOf(this.mFinishTransactionCPPTime));
        return map;
    }

    public int[] getRelativeAncestorList(int i, int i2) {
        FabricUIManagerBinding fabricUIManagerBinding = this.mBinding;
        if (fabricUIManagerBinding != null) {
            return fabricUIManagerBinding.getRelativeAncestorList(i, i2);
        }
        return null;
    }

    public boolean getThemeData(int i, float[] fArr) {
        p0f p0fVarA = this.mMountingManager.a(i);
        mkf mkfVar = p0fVarA != null ? p0fVarA.c : null;
        if (mkfVar == null) {
            s55.p(TAG, "Couldn't get context for surfaceId %d in getThemeData", Integer.valueOf(i));
            return false;
        }
        EditText editText = new EditText(mkfVar);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        float[] fArr2 = {nn2.C(editText.getPaddingStart()), nn2.C(editText.getPaddingEnd()), nn2.C(editText.getPaddingTop()), nn2.C(editText.getPaddingBottom())};
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[3];
        return true;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void initialize() {
        y55 y55Var = this.mEventDispatcher;
        le1 le1Var = this.mBatchEventDispatchedListener;
        y55Var.getClass();
        le1Var.getClass();
        y55Var.d.add(le1Var);
        qmc qmcVar = ie7.g0;
        if (qmcVar.enableFabricLogs()) {
            com.facebook.react.fabric.a aVar = new com.facebook.react.fabric.a();
            this.mDevToolsReactPerfLogger = aVar;
            a.InterfaceC0131a interfaceC0131a = FABRIC_PERF_LOGGER;
            interfaceC0131a.getClass();
            aVar.b.add(interfaceC0131a);
            ReactMarker.addFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (qmcVar.useFabricInterop()) {
            this.mReactApplicationContext.internal_registerInteropModule(RCTEventEmitter.class, new InteropEventEmitter(this.mReactApplicationContext));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void invalidate() {
        String str = TAG;
        s55.a.getClass();
        if (wab.p(4)) {
            wab.t(4, str, "FabricUIManager.invalidate");
        }
        com.facebook.react.fabric.a aVar = this.mDevToolsReactPerfLogger;
        if (aVar != null) {
            a.InterfaceC0131a interfaceC0131a = FABRIC_PERF_LOGGER;
            interfaceC0131a.getClass();
            aVar.b.remove(interfaceC0131a);
            ReactMarker.removeFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot double-destroy FabricUIManager"));
            return;
        }
        this.mDestroyed = true;
        y55 y55Var = this.mEventDispatcher;
        le1 le1Var = this.mBatchEventDispatchedListener;
        y55Var.getClass();
        le1Var.getClass();
        y55Var.d.remove(le1Var);
        y55 y55Var2 = this.mEventDispatcher;
        y55Var2.b.registerFabricEventEmitter(null);
        UiThreadUtil.runOnUiThread(new qb0(y55Var2, 2));
        this.mReactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        this.mViewManagerRegistry.c();
        this.mReactApplicationContext.removeLifecycleEventListener(this);
        onHostPause();
        FabricUIManagerBinding fabricUIManagerBinding = this.mBinding;
        if (fabricUIManagerBinding != null) {
            fabricUIManagerBinding.d();
        }
        this.mBinding = null;
        com.facebook.react.uimanager.d.a();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void markActiveTouchForTag(int i, int i2) {
        p0f p0fVarA = this.mMountingManager.a(i);
        if (p0fVarA != null) {
            p0fVarA.k.add(Integer.valueOf(i2));
        }
    }

    public long measure(int i, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, float f3, float f4, float f5) {
        Context context;
        if (i > 0) {
            p0f p0fVarB = this.mMountingManager.b(i, "measure");
            if (p0fVarB.a) {
                return 0L;
            }
            context = p0fVarB.c;
            hh1.o(context, "Context in SurfaceMountingManager is null. surfaceId: " + i);
        } else {
            context = this.mReactApplicationContext;
        }
        Context context2 = context;
        a0a a0aVar = this.mMountingManager;
        float fD = im8.d(f2, f3);
        m6h m6hVarB = im8.b(f2, f3);
        float fD2 = im8.d(f4, f5);
        m6h m6hVarB2 = im8.b(f4, f5);
        vqg vqgVar = a0aVar.a;
        if (str != null) {
            return vqgVar.a(str).measure(context2, readableMap, readableMap2, readableMap3, fD, m6hVarB, fD2, m6hVarB2, null);
        }
        r6.g("Required value was null.");
        return 0L;
    }

    public float[] measurePreparedLayout(PreparedLayout preparedLayout, float f2, float f3, float f4, float f5) {
        float fD = im8.d(f2, f3);
        m6h m6hVarB = im8.b(f2, f3);
        float fD2 = im8.d(f4, f5);
        m6h m6hVarB2 = im8.b(f4, f5);
        lif lifVar = lif.a;
        preparedLayout.getClass();
        Layout layout = preparedLayout.a;
        CharSequence text = layout.getText();
        text.getClass();
        Spanned spanned = (Spanned) text;
        int i = preparedLayout.b;
        lif.a.getClass();
        int iC = lif.c(layout, i);
        if (m6hVarB != m6h.EXACTLY) {
            fD = layout.getWidth();
        }
        float f6 = fD;
        float fB = lif.b(layout, fD2, m6hVarB2, iC);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(nn2.C(f6)));
        arrayList.add(Float.valueOf(nn2.C(fB)));
        lif.a aVar = new lif.a();
        int iL = 0;
        while (iL < spanned.length()) {
            iL = lif.l(layout, spanned, f6, iC, iL, preparedLayout.c, aVar);
            if (aVar.a) {
                arrayList.add(Float.valueOf(nn2.C(aVar.b)));
                arrayList.add(Float.valueOf(nn2.C(aVar.c)));
                arrayList.add(Float.valueOf(nn2.C(aVar.d)));
                arrayList.add(Float.valueOf(nn2.C(aVar.e)));
            }
        }
        float[] fArr = new float[arrayList.size()];
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            obj.getClass();
            fArr[i2] = ((Number) obj).floatValue();
        }
        return fArr;
    }

    public long measureText(int i, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f2, float f3, float f4, float f5, float[] fArr) {
        Context context;
        if (i > 0) {
            p0f p0fVarB = this.mMountingManager.b(i, "measureText");
            if (p0fVarB.a) {
                return 0L;
            }
            context = p0fVarB.c;
            hh1.o(context, "Context in SurfaceMountingManager is null. surfaceId: " + i);
        } else {
            context = this.mReactApplicationContext;
        }
        Context context2 = context;
        NativeModule nativeModuleA = this.mViewManagerRegistry.a("RCTText");
        float fD = im8.d(f2, f3);
        m6h m6hVarB = im8.b(f2, f3);
        float fD2 = im8.d(f4, f5);
        m6h m6hVarB2 = im8.b(f4, f5);
        ppc ppcVar = nativeModuleA instanceof ppc ? (ppc) nativeModuleA : null;
        lif lifVar = lif.a;
        context2.getClass();
        readableMapBuffer.getClass();
        readableMapBuffer2.getClass();
        lif.a.getClass();
        Layout layoutF = lif.f(context2, readableMapBuffer, readableMapBuffer2, fD, m6hVarB, fD2, m6hVarB2, ppcVar);
        int i2 = 0;
        int i3 = readableMapBuffer2.h1(0) ? readableMapBuffer2.getInt(0) : -1;
        CharSequence text = layoutF.getText();
        text.getClass();
        Spanned spanned = (Spanned) text;
        int iC = lif.c(layoutF, i3);
        if (m6hVarB != m6h.EXACTLY) {
            fD = layoutF.getWidth();
        }
        float fB = lif.b(layoutF, fD2, m6hVarB2, iC);
        if (fArr != null) {
            lif.a aVar = new lif.a();
            int iL = 0;
            while (iL < spanned.length()) {
                lif.a.getClass();
                lif.a aVar2 = aVar;
                Spanned spanned2 = spanned;
                float f6 = fD;
                iL = lif.l(layoutF, spanned2, f6, iC, iL, 0.0f, aVar2);
                if (aVar2.a) {
                    fArr[i2] = nn2.C(aVar2.b);
                    fArr[i2 + 1] = nn2.C(aVar2.c);
                    i2 += 2;
                }
                fD = f6;
                spanned = spanned2;
                aVar = aVar2;
            }
        }
        return wtf.e(nn2.C(fD), nn2.C(fB));
    }

    public void onAllAnimationsComplete() {
        this.mDriveCxxAnimations = false;
    }

    public void onAnimationStarted() {
        this.mDriveCxxAnimations = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        f fVar = this.mDispatchUIFrameCallback;
        fVar.getClass();
        com.facebook.react.modules.core.a aVar = com.facebook.react.modules.core.a.f;
        if (aVar == null) {
            r6.g("ReactChoreographer needs to be initialized.");
            return;
        }
        aVar.c(a.EnumC0132a.a, fVar);
        fVar.c = false;
        fVar.d = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        f fVar = this.mDispatchUIFrameCallback;
        fVar.c = true;
        fVar.b();
    }

    public void onRequestEventBeat() {
        this.mEventDispatcher.e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.react.views.text.PreparedLayout prepareTextLayout(int r9, com.facebook.react.common.mapbuffer.ReadableMapBuffer r10, com.facebook.react.common.mapbuffer.ReadableMapBuffer r11, float r12, float r13, float r14, float r15) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.fabric.FabricUIManager.prepareTextLayout(int, com.facebook.react.common.mapbuffer.ReadableMapBuffer, com.facebook.react.common.mapbuffer.ReadableMapBuffer, float, float, float, float):com.facebook.react.views.text.PreparedLayout");
    }

    public void prependUIBlock(i0g i0gVar) {
        if (ie7.g0.useFabricInterop()) {
            fj7 interopUIBlockListener = getInteropUIBlockListener();
            synchronized (interopUIBlockListener) {
                i0gVar.getClass();
                interopUIBlockListener.a.add(i0gVar);
            }
        }
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    @Override // defpackage.f2f
    public void receiveEvent(int i, int i2, String str, boolean z, WritableMap writableMap, int i3, boolean z2) {
        p0f.b bVar;
        p0f.b bVarD;
        if (this.mDestroyed) {
            s55.f(TAG, "Attempted to receiveEvent after destruction");
            return;
        }
        a0a a0aVar = this.mMountingManager;
        p0f p0fVarC = i == -1 ? a0aVar.c(i2) : a0aVar.a(i);
        EventEmitterWrapper eventEmitterWrapper = null;
        if (p0fVarC != null && (bVarD = p0fVarC.d(i2)) != null) {
            eventEmitterWrapper = bVarD.g;
        }
        if (eventEmitterWrapper != null) {
            if (z2) {
                UiThreadUtil.assertOnUiThread();
                if (this.mSynchronousEvents.add(new e2f(i, i2, str))) {
                    eventEmitterWrapper.dispatchEventSynchronously(str, writableMap);
                    return;
                }
                return;
            }
            if (z) {
                eventEmitterWrapper.dispatchUnique(str, writableMap);
                return;
            } else {
                eventEmitterWrapper.dispatch(str, writableMap, i3);
                return;
            }
        }
        if (this.mMountingManager.c(i2) != null) {
            a0a a0aVar2 = this.mMountingManager;
            p0f p0fVarC2 = i == -1 ? a0aVar2.c(i2) : a0aVar2.a(i);
            if (p0fVarC2 == null) {
                s55.c("a0a", "Cannot queue event without valid surface mounting manager for tag: %d, surfaceId: %d", Integer.valueOf(i2), Integer.valueOf(i));
                return;
            }
            ConcurrentHashMap<Integer, p0f.b> concurrentHashMap = p0fVarC2.d;
            if (concurrentHashMap == null || (bVar = concurrentHashMap.get(Integer.valueOf(i2))) == null) {
                return;
            }
            UiThreadUtil.runOnUiThread(new o0f(bVar, new p0f.a(str, writableMap, i3, z)));
            return;
        }
        String str2 = TAG;
        String str3 = "Unable to invoke event: " + str + " for reactTag: " + i2;
        s55.a.getClass();
        if (wab.p(4)) {
            wab.t(4, str2, str3);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.remove(uIManagerListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith("top") ? "on".concat(str.substring(3)) : str;
    }

    @Override // com.facebook.react.bridge.UIManager
    public View resolveView(int i) {
        UiThreadUtil.assertOnUiThread();
        p0f p0fVarC = this.mMountingManager.c(i);
        if (p0fVarC == null) {
            return null;
        }
        p0f.b bVarD = p0fVarC.d(i);
        View view = bVarD != null ? bVarD.a : null;
        if (view != null) {
            return view;
        }
        throw new IllegalViewOperationException(bg.d(i, "Trying to resolve view with tag ", " which doesn't exist"));
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sendAccessibilityEvent(int i, int i2) {
        zz9 zz9Var = this.mMountItemDispatcher;
        zz9Var.d.add(new f6e(-1, i, i2));
    }

    public void sendAccessibilityEventFromJS(int i, int i2, String str) {
        int i3;
        if ("focus".equals(str)) {
            i3 = 8;
        } else if ("windowStateChange".equals(str)) {
            i3 = 32;
        } else if ("click".equals(str)) {
            i3 = 1;
        } else {
            if (!"viewHoverEnter".equals(str)) {
                l5.q(l5.l("sendAccessibilityEventFromJS: invalid eventType ", str));
                return;
            }
            i3 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        zz9 zz9Var = this.mMountItemDispatcher;
        zz9Var.d.add(new f6e(i, i2, i3));
    }

    public void setBinding(FabricUIManagerBinding fabricUIManagerBinding) {
        this.mBinding = fabricUIManagerBinding;
    }

    public void setJSResponder(int i, int i2, int i3, boolean z) {
        zz9 zz9Var = this.mMountItemDispatcher;
        zz9Var.d.add(new d(i, i2, i3, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t, String str, WritableMap writableMap, int i, int i2) {
        int rootViewTag = ((vnc) t).getRootViewTag();
        Context context = t.getContext();
        mkf mkfVar = new mkf(this.mReactApplicationContext, context, str, rootViewTag);
        if (ie7.g0.enableFabricLogs()) {
            s55.c(TAG, "Starting surface for module: %s and reactTag: %d", str, Integer.valueOf(rootViewTag));
        }
        this.mMountingManager.e(rootViewTag, mkfVar, t);
        Point pointZ = UiThreadUtil.isOnUiThread() ? pyd.z(t) : new Point(0, 0);
        hh1.o(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.startSurfaceWithConstraints(rootViewTag, str, (NativeMap) writableMap, im8.a(i), im8.c(i), im8.a(i2), im8.c(i2), pointZ.x, pointZ.y, an6.a(context), context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true));
        return rootViewTag;
    }

    public void stopSurface(SurfaceHandlerBinding surfaceHandlerBinding) {
        if (!surfaceHandlerBinding.f()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to stop surface that hasn't started yet"));
            return;
        }
        this.mMountingManager.f(surfaceHandlerBinding.d());
        hh1.o(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.stopSurfaceWithSurfaceHandler(surfaceHandlerBinding);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sweepActiveTouchForTag(int i, int i2) {
        p0f p0fVarA = this.mMountingManager.a(i);
        if (p0fVarA != null) {
            p0fVarA.k.remove(Integer.valueOf(i2));
            HashSet hashSet = p0fVarA.l;
            if (hashSet.contains(Integer.valueOf(i2))) {
                hashSet.remove(Integer.valueOf(i2));
                p0fVarA.c(i2);
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        int i2 = this.mCurrentSynchronousCommitNumber;
        this.mCurrentSynchronousCommitNumber = i2 + 1;
        b bVar = new b(i, readableMap);
        if (this.mMountingManager.c(i) == null) {
            this.mMountItemDispatcher.d.add(bVar);
            return;
        }
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i2);
        if (ie7.g0.enableFabricLogs()) {
            s55.c(TAG, "SynchronouslyUpdateViewOnUIThread for tag %d: %s", Integer.valueOf(i), IS_DEVELOPMENT_ENVIRONMENT ? readableMap.toHashMap().toString() : "<hidden>");
        }
        bVar.execute(this.mMountingManager);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, null, i2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        if (ie7.g0.enableFabricLogs()) {
            s55.a(Integer.valueOf(i), TAG, "Updating Root Layout Specs for [%d]");
        }
        p0f p0fVarA = this.mMountingManager.a(i);
        if (p0fVarA == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException(p6.c(i, "Cannot updateRootLayoutSpecs on surfaceId that does not exist: ")));
            return;
        }
        mkf mkfVar = p0fVarA.c;
        if (mkfVar != null) {
            boolean zA = an6.a(mkfVar);
            z2 = mkfVar.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
            z = zA;
        } else {
            z = false;
            z2 = false;
        }
        hh1.o(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.setConstraints(i, im8.a(i2), im8.c(i2), im8.a(i3), im8.c(i3), i4, i5, z, z2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i) {
        this.mMountingManager.f(i);
        hh1.o(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.stopSurface(i);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    @Deprecated
    public void dispatchCommand(int i, int i2, int i3, ReadableArray readableArray) {
        zz9 zz9Var = this.mMountItemDispatcher;
        readableArray.getClass();
        t64 t64Var = new t64(i, i2, i3, readableArray);
        zz9Var.getClass();
        zz9Var.c.add(t64Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void startSurface(SurfaceHandlerBinding surfaceHandlerBinding, Context context, View view) {
        int iA;
        if (view instanceof vnc) {
            iA = ((vnc) view).getRootViewTag();
        } else {
            iA = xnc.a();
        }
        this.mMountingManager.e(iA, new mkf(this.mReactApplicationContext, context, surfaceHandlerBinding.b(), iA), view);
        hh1.o(this.mBinding, "Binding in FabricUIManager is null");
        this.mBinding.startSurfaceWithSurfaceHandler(iA, surfaceHandlerBinding, view != 0);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i, int i2, String str, WritableMap writableMap) {
        receiveEvent(i, i2, str, false, writableMap, 2);
    }

    public void receiveEvent(int i, int i2, String str, boolean z, WritableMap writableMap, int i3) {
        receiveEvent(i, i2, str, z, writableMap, i3, false);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        receiveEvent(-1, i, str, false, writableMap, 2);
    }
}
