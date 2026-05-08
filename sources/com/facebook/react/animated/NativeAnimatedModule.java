package com.facebook.react.animated;

import android.util.SparseArray;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.b9a;
import defpackage.d9a;
import defpackage.dmc;
import defpackage.ee6;
import defpackage.h0g;
import defpackage.haa;
import defpackage.hd0;
import defpackage.id0;
import defpackage.j6g;
import defpackage.l5;
import defpackage.m91;
import defpackage.msb;
import defpackage.nmc;
import defpackage.r6;
import defpackage.sk9;
import defpackage.xl9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "NativeAnimatedModule")
@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\b\u000e*\u0001v\b\u0007\u0018\u0000 ~2\u00020\u00012\u00020\u00022\u00020\u0003:\u0007\u007f\u0080\u0001\u0081\u0001\u0082\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u000eJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010&\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b&\u0010$J\u001f\u0010(\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001cH\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001cH\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010$J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b,\u0010$J/\u00102\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001e2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u001cH\u0016¢\u0006\u0004\b4\u0010$J\u001f\u00107\u001a\u00020\n2\u0006\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u001cH\u0016¢\u0006\u0004\b7\u0010)J\u001f\u00108\u001a\u00020\n2\u0006\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u001cH\u0016¢\u0006\u0004\b8\u0010)J\u001f\u0010:\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u0010)J\u001f\u0010;\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001cH\u0016¢\u0006\u0004\b;\u0010)J\u0017\u0010<\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u001cH\u0016¢\u0006\u0004\b<\u0010$J'\u0010@\u001a\u00020\n2\u0006\u00109\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u001eH\u0016¢\u0006\u0004\b@\u0010AJ'\u0010C\u001a\u00020\n2\u0006\u00109\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020=2\u0006\u0010B\u001a\u00020\u001cH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\n2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\n2\u0006\u0010G\u001a\u00020\u001cH\u0016¢\u0006\u0004\bH\u0010$J\u001f\u0010K\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u001c2\u0006\u0010J\u001a\u000200H\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\nH\u0016¢\u0006\u0004\bM\u0010\u000eJ\u0017\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u001b\u0010T\u001a\u00020\n2\n\u0010S\u001a\u00060RR\u00020\u0000H\u0002¢\u0006\u0004\bT\u0010UJ\u001b\u0010V\u001a\u00020\n2\n\u0010S\u001a\u00060RR\u00020\u0000H\u0002¢\u0006\u0004\bV\u0010UJ\u001b\u0010W\u001a\u00020\n2\n\u0010S\u001a\u00060RR\u00020\u0000H\u0002¢\u0006\u0004\bW\u0010UJ\u000f\u0010X\u001a\u00020\nH\u0002¢\u0006\u0004\bX\u0010\u000eJ\u000f\u0010Y\u001a\u00020\nH\u0002¢\u0006\u0004\bY\u0010\u000eJ\u0017\u0010Z\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\bZ\u0010\fJ\u0017\u0010[\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b[\u0010\fR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u00060_R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010b\u001a\u00060_R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010aR\u001c\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010d0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010lR\u0016\u0010n\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010iR\u0016\u0010o\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010iR\u001c\u0010p\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bp\u0010q\u0012\u0004\br\u0010\u000eR\u0016\u0010s\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010qR\u0016\u0010t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010qR\u0016\u0010u\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010iR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR(\u0010y\u001a\u0004\u0018\u00010d2\b\u0010y\u001a\u0004\u0018\u00010d8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}¨\u0006\u0083\u0001"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule;", "Lcom/facebook/fbreact/specs/NativeAnimatedModuleSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/UIManagerListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "viewTag", "Lj6g;", "userDrivenScrollEnded", "(I)V", "initialize", "()V", "onHostResume", "Lcom/facebook/react/bridge/UIManager;", "uiManager", "didScheduleMountItems", "(Lcom/facebook/react/bridge/UIManager;)V", "willMountItems", "didMountItems", "didDispatchMountItems", "willDispatchViewUpdates", "onHostPause", "onHostDestroy", "startOperationBatch", "finishOperationBatch", "", "tagDouble", "Lcom/facebook/react/bridge/ReadableMap;", "config", "createAnimatedNode", "(DLcom/facebook/react/bridge/ReadableMap;)V", "updateAnimatedNodeConfig", "startListeningToAnimatedNodeValue", "(D)V", "stopListeningToAnimatedNodeValue", "dropAnimatedNode", "value", "setAnimatedNodeValue", "(DD)V", "setAnimatedNodeOffset", "flattenAnimatedNodeOffset", "extractAnimatedNodeOffset", "animationIdDouble", "animatedNodeTagDouble", "animationConfig", "Lcom/facebook/react/bridge/Callback;", "endCallback", "startAnimatingNode", "(DDLcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V", "stopAnimation", "parentNodeTagDouble", "childNodeTagDouble", "connectAnimatedNodes", "disconnectAnimatedNodes", "viewTagDouble", "connectAnimatedNodeToView", "disconnectAnimatedNodeFromView", "restoreDefaultValues", "", "eventName", "eventMapping", "addAnimatedEventToView", "(DLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "animatedValueTagDouble", "removeAnimatedEventFromView", "(DLjava/lang/String;D)V", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "animatedValueNodeTagDouble", "callback", "getValue", "(DLcom/facebook/react/bridge/Callback;)V", "invalidate", "Lcom/facebook/react/bridge/ReadableArray;", "opsAndArgs", "queueAndExecuteBatchedOperations", "(Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/animated/NativeAnimatedModule$d;", "operation", "addOperation", "(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V", "addUnbatchedOperation", "addPreOperation", "clearFrameCallback", "enqueueFrameCallback", "initializeLifecycleEventListenersForViewTag", "decrementInFlightAnimationsForViewTag", "Lcom/facebook/react/modules/core/a;", "reactChoreographer", "Lcom/facebook/react/modules/core/a;", "Lcom/facebook/react/animated/NativeAnimatedModule$c;", "operations", "Lcom/facebook/react/animated/NativeAnimatedModule$c;", "preOperations", "Ljava/util/concurrent/atomic/AtomicReference;", "Ld9a;", "nodesManagerRef", "Ljava/util/concurrent/atomic/AtomicReference;", "", "batchingControlledByJS", "Z", "", "currentFrameNumber", "J", "currentBatchNumber", "initializedForFabric", "initializedForNonFabric", "uiManagerType", "I", "getUiManagerType$annotations", "numFabricAnimations", "numNonFabricAnimations", "enqueuedAnimationOnFrame", "com/facebook/react/animated/NativeAnimatedModule$f", "animatedFrameCallback", "Lcom/facebook/react/animated/NativeAnimatedModule$f;", "nodesManager", "getNodesManager", "()Ld9a;", "setNodesManager", "(Ld9a;)V", "Companion", "a", "d", "c", "b", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    public static final String NAME = "NativeAnimatedModule";
    private final f animatedFrameCallback;
    private boolean batchingControlledByJS;
    private volatile long currentBatchNumber;
    private volatile long currentFrameNumber;
    private boolean enqueuedAnimationOnFrame;
    private boolean initializedForFabric;
    private boolean initializedForNonFabric;
    private final AtomicReference<d9a> nodesManagerRef;
    private int numFabricAnimations;
    private int numNonFabricAnimations;
    private final c operations;
    private final c preOperations;
    private final com.facebook.react.modules.core.a reactChoreographer;
    private int uiManagerType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static a[] b;

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;
        public static final /* synthetic */ a[] c = {new a("OP_CODE_CREATE_ANIMATED_NODE", 0), new a("OP_CODE_UPDATE_ANIMATED_NODE_CONFIG", 1), new a("OP_CODE_GET_VALUE", 2), new a("OP_START_LISTENING_TO_ANIMATED_NODE_VALUE", 3), new a("OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE", 4), new a("OP_CODE_CONNECT_ANIMATED_NODES", 5), new a("OP_CODE_DISCONNECT_ANIMATED_NODES", 6), new a("OP_CODE_START_ANIMATING_NODE", 7), new a("OP_CODE_STOP_ANIMATION", 8), new a("OP_CODE_SET_ANIMATED_NODE_VALUE", 9), new a("OP_CODE_SET_ANIMATED_NODE_OFFSET", 10), new a("OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET", 11), new a("OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET", 12), new a("OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW", 13), new a("OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW", 14), new a("OP_CODE_RESTORE_DEFAULT_VALUES", 15), new a("OP_CODE_DROP_ANIMATED_NODE", 16), new a("OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW", 17), new a("OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW", 18), new a("OP_CODE_ADD_LISTENER", 19), new a("OP_CODE_REMOVE_LISTENERS", 20)};
        public static final C0129a a = new C0129a();

        /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$a$a, reason: collision with other inner class name */
        public static final class C0129a {
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public final class c {
        public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
        public d b;

        /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0027 A[EDGE_INSN: B:30:0x0027->B:14:0x0027 BREAK  A[LOOP:0: B:6:0x000d->B:27:0x0050], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(long r6, defpackage.d9a r8) {
            /*
                r5 = this;
                boolean r0 = r5.b()
                r1 = 0
                if (r0 == 0) goto L8
                goto L32
            L8:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            Ld:
                com.facebook.react.animated.NativeAnimatedModule$d r2 = r5.b
                if (r2 == 0) goto L1d
                long r3 = r2.a
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r3 <= 0) goto L18
                goto L27
            L18:
                r0.add(r2)
                r5.b = r1
            L1d:
                java.util.concurrent.ConcurrentLinkedQueue r2 = r5.a
                java.lang.Object r2 = r2.poll()
                com.facebook.react.animated.NativeAnimatedModule$d r2 = (com.facebook.react.animated.NativeAnimatedModule.d) r2
                if (r2 != 0) goto L29
            L27:
                r1 = r0
                goto L32
            L29:
                long r3 = r2.a
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r3 <= 0) goto L50
                r5.b = r2
                goto L27
            L32:
                if (r1 == 0) goto L4f
                java.util.Iterator r5 = r1.iterator()
            L38:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L4f
                java.lang.Object r6 = r5.next()
                com.facebook.react.animated.NativeAnimatedModule$d r6 = (com.facebook.react.animated.NativeAnimatedModule.d) r6
                if (r8 == 0) goto L4a
                r6.a(r8)
                goto L38
            L4a:
                java.lang.String r5 = "Required value was null."
                defpackage.r6.g(r5)
            L4f:
                return
            L50:
                r0.add(r2)
                goto Ld
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.NativeAnimatedModule.c.a(long, d9a):void");
        }

        public final boolean b() {
            return this.a.isEmpty() && this.b == null;
        }
    }

    public abstract class d {
        public long a = -1;

        public abstract void a(d9a d9aVar);
    }

    public static final class e extends d {
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ReadableMap d;

        public e(int i, String str, ReadableMap readableMap) {
            this.b = i;
            this.c = str;
            this.d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.b(this.b, this.c, this.d);
        }
    }

    public static final class f extends ee6 {
        public final /* synthetic */ NativeAnimatedModule b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ReactApplicationContext reactApplicationContext, NativeAnimatedModule nativeAnimatedModule) {
            super(reactApplicationContext);
            this.b = nativeAnimatedModule;
        }

        @Override // defpackage.ee6
        public final void a(long j) {
            NativeAnimatedModule nativeAnimatedModule = this.b;
            try {
                nativeAnimatedModule.enqueuedAnimationOnFrame = false;
                d9a nodesManager = nativeAnimatedModule.getNodesManager();
                if (nodesManager == null) {
                    return;
                }
                if (nodesManager.c.size() > 0 || nodesManager.d.size() > 0) {
                    nodesManager.o(j);
                }
                nativeAnimatedModule.enqueueFrameCallback();
            } catch (Exception e) {
                l5.r(e);
            }
        }
    }

    public static final class g extends d {
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public g(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.c(this.b, this.c);
        }
    }

    public static final class h extends d {
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public h(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.d(this.b, this.c);
        }
    }

    public static final class i extends d {
        public final /* synthetic */ int b;
        public final /* synthetic */ ReadableMap c;

        public i(int i, ReadableMap readableMap) {
            this.b = i;
            this.c = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.e(this.b, this.c);
        }
    }

    public static final class j extends d {
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public j(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.f(this.b, this.c);
        }
    }

    public static final class k extends d {
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public k(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.g(this.b, this.c);
        }
    }

    public static final class l extends d {
        public final /* synthetic */ int b;

        public l(int i) {
            this.b = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            SparseArray<hd0> sparseArray = d9aVar.b;
            int i = this.b;
            sparseArray.remove(i);
            d9aVar.d.remove(i);
        }
    }

    public static final class m extends d {
        public final /* synthetic */ int b;

        public m(int i) {
            this.b = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.h(this.b);
        }
    }

    public static final class n extends d {
        public final /* synthetic */ int b;

        public n(int i) {
            this.b = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.i(this.b);
        }
    }

    public static final class o extends d {
        public final /* synthetic */ int b;
        public final /* synthetic */ Callback c;

        public o(int i, Callback callback) {
            this.b = i;
            this.c = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.k(this.b, this.c);
        }
    }

    public static final class p extends d {
        public final /* synthetic */ int c;
        public final /* synthetic */ ReadableArray d;

        public p(int i, ReadableArray readableArray) {
            this.c = i;
            this.d = readableArray;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            NativeAnimatedModule nativeAnimatedModule = NativeAnimatedModule.this;
            nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
            int i = 0;
            while (i < this.c) {
                int i2 = i + 1;
                ReadableArray readableArray = this.d;
                int i3 = readableArray.getInt(i);
                a.a.getClass();
                a[] aVarArrValues = a.b;
                if (aVarArrValues == null) {
                    aVarArrValues = a.values();
                }
                if (a.b == null) {
                    a.b = aVarArrValues;
                }
                switch (aVarArrValues[i3 - 1].ordinal()) {
                    case 0:
                        int i4 = i + 2;
                        int i5 = readableArray.getInt(i2);
                        i += 3;
                        ReadableMap map = readableArray.getMap(i4);
                        if (map == null) {
                            r6.g("Required value was null.");
                            return;
                        }
                        d9aVar.e(i5, map);
                        break;
                    case 1:
                        int i6 = i + 2;
                        int i7 = readableArray.getInt(i2);
                        i += 3;
                        ReadableMap map2 = readableArray.getMap(i6);
                        if (map2 == null) {
                            r6.g("Required value was null.");
                            return;
                        }
                        d9aVar.w(i7, map2);
                        break;
                    case 2:
                        i += 2;
                        d9aVar.k(readableArray.getInt(i2), null);
                        break;
                    case 3:
                        i += 2;
                        int i8 = readableArray.getInt(i2);
                        d9aVar.s(i8, new xl9(nativeAnimatedModule, i8));
                        break;
                    case 4:
                        i += 2;
                        d9aVar.v(readableArray.getInt(i2));
                        break;
                    case 5:
                        int i9 = i + 2;
                        i += 3;
                        d9aVar.d(readableArray.getInt(i2), readableArray.getInt(i9));
                        break;
                    case 6:
                        int i10 = i + 2;
                        i += 3;
                        d9aVar.g(readableArray.getInt(i2), readableArray.getInt(i10));
                        break;
                    case 7:
                        int i11 = readableArray.getInt(i2);
                        int i12 = i + 3;
                        int i13 = readableArray.getInt(i + 2);
                        i += 4;
                        ReadableMap map3 = readableArray.getMap(i12);
                        if (map3 == null) {
                            r6.g("Required value was null.");
                            return;
                        }
                        d9aVar.r(i11, map3, null, i13);
                        break;
                    case 8:
                        i += 2;
                        d9aVar.t(readableArray.getInt(i2));
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        int i14 = i + 2;
                        i += 3;
                        d9aVar.q(readableArray.getInt(i2), readableArray.getDouble(i14));
                        break;
                    case 10:
                        int i15 = i + 2;
                        i += 3;
                        d9aVar.p(readableArray.getInt(i2), readableArray.getDouble(i15));
                        break;
                    case 11:
                        i += 2;
                        d9aVar.i(readableArray.getInt(i2));
                        break;
                    case 12:
                        i += 2;
                        d9aVar.h(readableArray.getInt(i2));
                        break;
                    case 13:
                        int i16 = i + 2;
                        i += 3;
                        d9aVar.c(readableArray.getInt(i2), readableArray.getInt(i16));
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        int i17 = i + 2;
                        int i18 = readableArray.getInt(i2);
                        i += 3;
                        int i19 = readableArray.getInt(i17);
                        nativeAnimatedModule.decrementInFlightAnimationsForViewTag(i19);
                        d9aVar.f(i18, i19);
                        break;
                    case 15:
                        i += 2;
                        d9aVar.n(readableArray.getInt(i2));
                        break;
                    case 16:
                        i += 2;
                        int i20 = readableArray.getInt(i2);
                        d9aVar.b.remove(i20);
                        d9aVar.d.remove(i20);
                        break;
                    case 17:
                        int i21 = readableArray.getInt(i2);
                        int i22 = i + 3;
                        String string = readableArray.getString(i + 2);
                        if (string == null) {
                            r6.g("Required value was null.");
                            return;
                        }
                        i += 4;
                        ReadableMap map4 = readableArray.getMap(i22);
                        if (map4 == null) {
                            r6.g("Required value was null.");
                            return;
                        }
                        d9aVar.b(i21, string, map4);
                        break;
                        break;
                    case 18:
                        int i23 = readableArray.getInt(i2);
                        nativeAnimatedModule.decrementInFlightAnimationsForViewTag(i23);
                        int i24 = i + 3;
                        String string2 = readableArray.getString(i + 2);
                        if (string2 == null) {
                            r6.g("Required value was null.");
                            return;
                        } else {
                            i += 4;
                            d9aVar.m(i23, readableArray.getInt(i24), string2);
                        }
                        break;
                    case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    case 20:
                        i += 2;
                        break;
                    default:
                        defpackage.l.g();
                        return;
                }
            }
        }
    }

    public static final class q extends d {
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        public q(int i, int i2, String str) {
            this.b = i;
            this.c = str;
            this.d = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            String str = this.c;
            d9aVar.m(this.b, this.d, str);
        }
    }

    public static final class r extends d {
        public final /* synthetic */ int b;

        public r(int i) {
            this.b = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.n(this.b);
        }
    }

    public static final class s extends d {
        public final /* synthetic */ int b;
        public final /* synthetic */ double c;

        public s(int i, double d) {
            this.b = i;
            this.c = d;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.p(this.b, this.c);
        }
    }

    public static final class t extends d {
        public final /* synthetic */ int b;
        public final /* synthetic */ double c;

        public t(int i, double d) {
            this.b = i;
            this.c = d;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.q(this.b, this.c);
        }
    }

    public static final class u extends d {
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ ReadableMap d;
        public final /* synthetic */ Callback e;

        public u(int i, ReadableMap readableMap, Callback callback, int i2) {
            this.b = i;
            this.c = i2;
            this.d = readableMap;
            this.e = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.r(this.b, this.d, this.e, this.c);
        }
    }

    public static final class v extends d {
        public final /* synthetic */ int b;
        public final /* synthetic */ b9a c;

        public v(int i, b9a b9aVar) {
            this.b = i;
            this.c = b9aVar;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.s(this.b, this.c);
        }
    }

    public static final class w extends d {
        public final /* synthetic */ int b;

        public w(int i) {
            this.b = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.t(this.b);
        }
    }

    public static final class x extends d {
        public final /* synthetic */ int b;

        public x(int i) {
            this.b = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.v(this.b);
        }
    }

    public static final class y extends d {
        public final /* synthetic */ int b;
        public final /* synthetic */ ReadableMap c;

        public y(int i, ReadableMap readableMap) {
            this.b = i;
            this.c = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public final void a(d9a d9aVar) {
            d9aVar.getClass();
            d9aVar.w(this.b, this.c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        com.facebook.react.modules.core.a aVar = com.facebook.react.modules.core.a.f;
        if (aVar == null) {
            r6.g("ReactChoreographer needs to be initialized.");
            throw null;
        }
        this.reactChoreographer = aVar;
        this.operations = new c();
        this.preOperations = new c();
        this.nodesManagerRef = new AtomicReference<>();
        this.uiManagerType = 1;
        this.animatedFrameCallback = new f(reactApplicationContext, this);
    }

    private final void addOperation(d operation) {
        operation.a = this.currentBatchNumber;
        this.operations.a.add(operation);
    }

    private final void addPreOperation(d operation) {
        operation.a = this.currentBatchNumber;
        this.preOperations.a.add(operation);
    }

    private final void addUnbatchedOperation(d operation) {
        operation.a = -1L;
        this.operations.a.add(operation);
    }

    private final void clearFrameCallback() {
        this.reactChoreographer.c(a.EnumC0132a.b, this.animatedFrameCallback);
        this.enqueuedAnimationOnFrame = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decrementInFlightAnimationsForViewTag(int viewTag) {
        if (msb.e(viewTag) == 2) {
            this.numFabricAnimations--;
        } else {
            this.numNonFabricAnimations--;
        }
        int i2 = this.numNonFabricAnimations;
        if (i2 == 0 && this.numFabricAnimations > 0 && this.uiManagerType != 2) {
            this.uiManagerType = 2;
        } else {
            if (this.numFabricAnimations != 0 || i2 <= 0 || this.uiManagerType == 1) {
                return;
            }
            this.uiManagerType = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueFrameCallback() {
        if (this.enqueuedAnimationOnFrame) {
            return;
        }
        this.reactChoreographer.b(a.EnumC0132a.b, this.animatedFrameCallback);
        this.enqueuedAnimationOnFrame = true;
    }

    private static /* synthetic */ void getUiManagerType$annotations() {
    }

    private final void initializeLifecycleEventListenersForViewTag(int viewTag) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        UIManager uIManagerJ;
        UIManager uIManagerJ2;
        int iE = msb.e(viewTag);
        this.uiManagerType = iE;
        if (iE == 2) {
            this.numFabricAnimations++;
        } else {
            this.numNonFabricAnimations++;
        }
        d9a nodesManager = getNodesManager();
        if (nodesManager != null) {
            int i2 = this.uiManagerType;
            if (!(i2 == 2 ? nodesManager.h : nodesManager.i) && (uIManagerJ2 = dmc.j(nodesManager.a, i2, true)) != null) {
                uIManagerJ2.getEventDispatcher().d(nodesManager);
                if (i2 == 2) {
                    nodesManager.h = true;
                } else {
                    nodesManager.i = true;
                }
            }
        } else {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedModule", new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if ((this.uiManagerType == 2 ? this.initializedForFabric : this.initializedForNonFabric) || (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) == null || (uIManagerJ = dmc.j(reactApplicationContextIfActiveOrWarn, this.uiManagerType, true)) == null) {
            return;
        }
        uIManagerJ.addUIManagerEventListener(this);
        if (this.uiManagerType == 2) {
            this.initializedForFabric = true;
        } else {
            this.initializedForNonFabric = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startListeningToAnimatedNodeValue$lambda$6(NativeAnimatedModule nativeAnimatedModule, int i2, double d2, double d3) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("tag", i2);
        readableMapBuilder.put("value", d2);
        readableMapBuilder.put("offset", d3);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g userDrivenScrollEnded$lambda$2$lambda$1(Set set, ReadableArrayBuilder readableArrayBuilder) {
        readableArrayBuilder.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            readableArrayBuilder.add(((Number) it.next()).intValue());
        }
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void willDispatchViewUpdates$lambda$3(NativeAnimatedModule nativeAnimatedModule, long j2, haa haaVar) {
        haaVar.getClass();
        nativeAnimatedModule.preOperations.a(j2, nativeAnimatedModule.getNodesManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void willDispatchViewUpdates$lambda$4(NativeAnimatedModule nativeAnimatedModule, long j2, haa haaVar) {
        haaVar.getClass();
        nativeAnimatedModule.operations.a(j2, nativeAnimatedModule.getNodesManager());
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double viewTagDouble, String eventName, ReadableMap eventMapping) {
        eventName.getClass();
        eventMapping.getClass();
        int i2 = (int) viewTagDouble;
        initializeLifecycleEventListenersForViewTag(i2);
        addOperation(new e(i2, eventName, eventMapping));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String eventName) {
        eventName.getClass();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double animatedNodeTagDouble, double viewTagDouble) {
        int i2 = (int) viewTagDouble;
        initializeLifecycleEventListenersForViewTag(i2);
        addOperation(new g((int) animatedNodeTagDouble, i2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double parentNodeTagDouble, double childNodeTagDouble) {
        addOperation(new h((int) parentNodeTagDouble, (int) childNodeTagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double tagDouble, ReadableMap config) {
        config.getClass();
        addOperation(new i((int) tagDouble, config));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        uiManager.getClass();
        if (this.uiManagerType != 2) {
            return;
        }
        long j2 = this.currentBatchNumber - 1;
        if (!this.batchingControlledByJS) {
            this.currentFrameNumber++;
            if (this.currentFrameNumber - this.currentBatchNumber > 2) {
                this.currentBatchNumber = this.currentFrameNumber;
                j2 = this.currentBatchNumber;
            }
        }
        this.preOperations.a(j2, getNodesManager());
        this.operations.a(j2, getNodesManager());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        uiManager.getClass();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        uiManager.getClass();
        this.currentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double animatedNodeTagDouble, double viewTagDouble) {
        int i2 = (int) viewTagDouble;
        decrementInFlightAnimationsForViewTag(i2);
        addOperation(new j((int) animatedNodeTagDouble, i2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double parentNodeTagDouble, double childNodeTagDouble) {
        addOperation(new k((int) parentNodeTagDouble, (int) childNodeTagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double tagDouble) {
        addOperation(new l((int) tagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double tagDouble) {
        addOperation(new m((int) tagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.batchingControlledByJS = false;
        this.currentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double tagDouble) {
        addOperation(new n((int) tagDouble));
    }

    public final d9a getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.nodesManagerRef.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            AtomicReference<d9a> atomicReference = this.nodesManagerRef;
            d9a d9aVar = new d9a(reactApplicationContextIfActiveOrWarn);
            while (!atomicReference.compareAndSet(null, d9aVar) && atomicReference.get() == null) {
            }
        }
        return this.nodesManagerRef.get();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double animatedValueNodeTagDouble, Callback callback) {
        callback.getClass();
        addOperation(new o((int) animatedValueNodeTagDouble, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(ReadableArray opsAndArgs) {
        opsAndArgs.getClass();
        int size = opsAndArgs.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            int i4 = opsAndArgs.getInt(i2);
            a.a.getClass();
            a[] aVarArrValues = a.b;
            if (aVarArrValues == null) {
                aVarArrValues = a.values();
            }
            if (a.b == null) {
                a.b = aVarArrValues;
            }
            switch (aVarArrValues[i4 - 1].ordinal()) {
                case 0:
                case 1:
                case 5:
                case 6:
                case DatadogLogGenerator.CRASH /* 9 */:
                case 10:
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    i2 += 3;
                    continue;
                case 2:
                case 3:
                case 4:
                case 8:
                case 11:
                case 12:
                case 15:
                case 16:
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                case 20:
                    i2 += 2;
                    continue;
                case 7:
                case 18:
                    break;
                case 13:
                    int i5 = i2 + 2;
                    i2 += 3;
                    initializeLifecycleEventListenersForViewTag(opsAndArgs.getInt(i5));
                    continue;
                case 17:
                    initializeLifecycleEventListenersForViewTag(opsAndArgs.getInt(i3));
                    break;
                default:
                    defpackage.l.g();
                    return;
            }
            i2 += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new p(size, opsAndArgs));
        finishOperationBatch();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double viewTagDouble, String eventName, double animatedValueTagDouble) {
        eventName.getClass();
        int i2 = (int) viewTagDouble;
        decrementInFlightAnimationsForViewTag(i2);
        addOperation(new q(i2, (int) animatedValueTagDouble, eventName));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double animatedNodeTagDouble) {
        addPreOperation(new r((int) animatedNodeTagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double tagDouble, double value) {
        addOperation(new s((int) tagDouble, value));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double tagDouble, double value) {
        addOperation(new t((int) tagDouble, value));
    }

    public final void setNodesManager(d9a d9aVar) {
        this.nodesManagerRef.set(d9aVar);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double animationIdDouble, double animatedNodeTagDouble, ReadableMap animationConfig, Callback endCallback) {
        animationConfig.getClass();
        endCallback.getClass();
        addUnbatchedOperation(new u((int) animationIdDouble, animationConfig, endCallback, (int) animatedNodeTagDouble));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [b9a] */
    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double tagDouble) {
        final int i2 = (int) tagDouble;
        addOperation(new v(i2, new id0() { // from class: b9a
            @Override // defpackage.id0
            public final void a(double d2, double d3) {
                NativeAnimatedModule.startListeningToAnimatedNodeValue$lambda$6(this.a, i2, d2, d3);
            }
        }));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.batchingControlledByJS = true;
        this.currentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double animationIdDouble) {
        addOperation(new w((int) animationIdDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double tagDouble) {
        addOperation(new x((int) tagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double tagDouble, ReadableMap config) {
        config.getClass();
        addOperation(new y((int) tagDouble, config));
    }

    public final void userDrivenScrollEnded(int viewTag) {
        int i2;
        d9a d9aVar = this.nodesManagerRef.get();
        if (d9aVar == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (EventAnimationDriver eventAnimationDriver : d9aVar.e) {
            if ("topScrollEnded".equals(eventAnimationDriver.eventName) && viewTag == (i2 = eventAnimationDriver.viewTag)) {
                hashSet.add(Integer.valueOf(i2));
                ArrayList arrayList = eventAnimationDriver.valueNode.a;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        hashSet.add(Integer.valueOf(((hd0) it.next()).d));
                    }
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        new ReadableMapBuilder(writableMapCreateMap).putArray("tags", new m91(hashSet, 7));
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onUserDrivenAnimationEnded", writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uiManager) {
        uiManager.getClass();
        if ((this.operations.b() && this.preOperations.b()) || this.uiManagerType == 2) {
            return;
        }
        final long j2 = this.currentBatchNumber;
        this.currentBatchNumber = 1 + j2;
        h0g h0gVar = new h0g() { // from class: c9a
            @Override // defpackage.h0g
            public final void b(haa haaVar) {
                NativeAnimatedModule.willDispatchViewUpdates$lambda$3(this.a, j2, haaVar);
            }
        };
        sk9 sk9Var = new sk9(this, j2);
        UIManagerModule uIManagerModule = (UIManagerModule) uiManager;
        uIManagerModule.prependUIBlock(h0gVar);
        uIManagerModule.addUIBlock(sk9Var);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uiManager) {
        uiManager.getClass();
    }
}
