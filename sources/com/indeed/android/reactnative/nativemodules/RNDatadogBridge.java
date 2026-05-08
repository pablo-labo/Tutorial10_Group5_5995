package com.indeed.android.reactnative.nativemodules;

import com.datadog.android.log.Logger;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNDatadogBridge;
import defpackage.bs4;
import defpackage.gu5;
import defpackage.lz2;
import defpackage.nmc;
import defpackage.tf3;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseRNDatadogBridge.MODULE_NAME)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0019\u0010\u0018JG\u0010\u001d\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010\u001f\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001f\u0010\u001eJ3\u0010\"\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\"\u0010#J)\u0010$\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b$\u0010\u0018J9\u0010&\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/indeed/android/reactnative/nativemodules/RNDatadogBridge;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseRNDatadogBridge;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lkotlin/Function0;", "Lcom/datadog/android/log/Logger;", "loggerProvider", "Lcom/datadog/android/rum/RumMonitor;", "rumMonitorProvider", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lgu5;Lgu5;)V", "", "type", "message", "stack", "", "createCustomError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Throwable;", "Lcom/facebook/react/bridge/ReadableMap;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "logDebug", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "logInfo", "errorKind", "errorMessage", "stacktrace", "logWarn", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "logError", "key", "name", "startView", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "stopView", "source", "addError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "Lgu5;", "getRnLogger", "()Lcom/datadog/android/log/Logger;", "rnLogger", "getRumMonitor", "()Lcom/datadog/android/rum/RumMonitor;", "rumMonitor", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNDatadogBridge extends IndeedRNBridgeBaseRNDatadogBridge {
    public static final int $stable = 8;
    private final gu5<Logger> loggerProvider;
    private final gu5<RumMonitor> rumMonitorProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RNDatadogBridge(ReactApplicationContext reactApplicationContext, gu5<Logger> gu5Var, gu5<? extends RumMonitor> gu5Var2) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        this.loggerProvider = gu5Var;
        this.rumMonitorProvider = gu5Var2;
    }

    private final Throwable createCustomError(String type, String message, String stack) {
        return new tf3(type, message, stack);
    }

    private final Logger getRnLogger() {
        try {
            return this.loggerProvider.invoke();
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.h(IndeedRNBridgeBaseRNDatadogBridge.MODULE_NAME, "Failed to get logger: " + e.getMessage(), null, 12);
            return null;
        }
    }

    private final RumMonitor getRumMonitor() {
        try {
            return this.rumMonitorProvider.invoke();
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.h(IndeedRNBridgeBaseRNDatadogBridge.MODULE_NAME, "Failed to get RUM monitor: " + e.getMessage(), null, 12);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:3:0x000d, B:5:0x0013, B:9:0x001a, B:10:0x0027, B:29:0x0062, B:32:0x0069, B:36:0x0072, B:35:0x0070, B:12:0x002b, B:14:0x0033, B:15:0x0036, B:18:0x003f, B:19:0x0042, B:22:0x004b, B:23:0x004e, B:26:0x0057, B:27:0x005a, B:30:0x0065), top: B:40:0x000d }] */
    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNDatadogBridge
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addError(java.lang.String r4, java.lang.String r5, java.lang.String r6, com.facebook.react.bridge.ReadableMap r7, com.facebook.react.bridge.Promise r8) {
        /*
            r3 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r8.getClass()
            r0 = 0
            com.datadog.android.rum.RumMonitor r3 = r3.getRumMonitor()     // Catch: java.lang.Exception -> L17
            if (r3 != 0) goto L1a
            r8.resolve(r0)     // Catch: java.lang.Exception -> L17
            return
        L17:
            r3 = move-exception
            goto L80
        L1a:
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Exception -> L17
            java.lang.String r5 = r5.toLowerCase(r1)     // Catch: java.lang.Exception -> L17
            r5.getClass()     // Catch: java.lang.Exception -> L17
            int r1 = r5.hashCode()     // Catch: java.lang.Exception -> L17
            switch(r1) {
                case -1349088399: goto L5a;
                case -896505829: goto L4e;
                case 951510359: goto L42;
                case 1224424441: goto L36;
                case 1843485230: goto L2b;
                default: goto L2a;
            }     // Catch: java.lang.Exception -> L17
        L2a:
            goto L62
        L2b:
            java.lang.String r1 = "network"
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Exception -> L17
            if (r5 == 0) goto L62
            com.datadog.android.rum.RumErrorSource r5 = com.datadog.android.rum.RumErrorSource.NETWORK     // Catch: java.lang.Exception -> L17
            goto L67
        L36:
            java.lang.String r1 = "webview"
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Exception -> L17
            if (r5 != 0) goto L3f
            goto L62
        L3f:
            com.datadog.android.rum.RumErrorSource r5 = com.datadog.android.rum.RumErrorSource.WEBVIEW     // Catch: java.lang.Exception -> L17
            goto L67
        L42:
            java.lang.String r1 = "console"
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Exception -> L17
            if (r5 != 0) goto L4b
            goto L62
        L4b:
            com.datadog.android.rum.RumErrorSource r5 = com.datadog.android.rum.RumErrorSource.CONSOLE     // Catch: java.lang.Exception -> L17
            goto L67
        L4e:
            java.lang.String r1 = "source"
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Exception -> L17
            if (r5 != 0) goto L57
            goto L62
        L57:
            com.datadog.android.rum.RumErrorSource r5 = com.datadog.android.rum.RumErrorSource.SOURCE     // Catch: java.lang.Exception -> L17
            goto L67
        L5a:
            java.lang.String r1 = "custom"
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Exception -> L17
            if (r5 != 0) goto L65
        L62:
            com.datadog.android.rum.RumErrorSource r5 = com.datadog.android.rum.RumErrorSource.SOURCE     // Catch: java.lang.Exception -> L17
            goto L67
        L65:
            com.datadog.android.rum.RumErrorSource r5 = com.datadog.android.rum.RumErrorSource.CUSTOM     // Catch: java.lang.Exception -> L17
        L67:
            if (r7 == 0) goto L70
            java.util.HashMap r7 = r7.toHashMap()     // Catch: java.lang.Exception -> L17
            if (r7 == 0) goto L70
            goto L72
        L70:
            bs4 r7 = defpackage.bs4.a     // Catch: java.lang.Exception -> L17
        L72:
            tf3 r1 = new tf3     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "RNError"
            r1.<init>(r2, r4, r6)     // Catch: java.lang.Exception -> L17
            r3.addError(r4, r5, r1, r7)     // Catch: java.lang.Exception -> L17
            r8.resolve(r0)     // Catch: java.lang.Exception -> L17
            return
        L80:
            java.util.ArrayList r4 = defpackage.lz2.a
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "addError failed: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 12
            java.lang.String r5 = "RNDatadogBridge"
            defpackage.lz2.h(r5, r3, r0, r4)
            r8.resolve(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.reactnative.nativemodules.RNDatadogBridge.addError(java.lang.String, java.lang.String, java.lang.String, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0009, B:10:0x0017, B:12:0x001d, B:13:0x0024, B:9:0x0014), top: B:17:0x0009 }] */
    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNDatadogBridge
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void logDebug(java.lang.String r9, com.facebook.react.bridge.ReadableMap r10, com.facebook.react.bridge.Promise r11) {
        /*
            r8 = this;
            r9.getClass()
            r11.getClass()
            r1 = 0
            if (r10 == 0) goto L14
            java.util.HashMap r10 = r10.toHashMap()     // Catch: java.lang.Exception -> L11
            if (r10 == 0) goto L14
        Lf:
            r5 = r10
            goto L17
        L11:
            r0 = move-exception
            r8 = r0
            goto L28
        L14:
            bs4 r10 = defpackage.bs4.a     // Catch: java.lang.Exception -> L11
            goto Lf
        L17:
            com.datadog.android.log.Logger r2 = r8.getRnLogger()     // Catch: java.lang.Exception -> L11
            if (r2 == 0) goto L24
            r6 = 2
            r7 = 0
            r4 = 0
            r3 = r9
            com.datadog.android.log.Logger.d$default(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L11
        L24:
            r11.resolve(r1)     // Catch: java.lang.Exception -> L11
            return
        L28:
            java.util.ArrayList r9 = defpackage.lz2.a
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "logDebug failed: "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = 12
            java.lang.String r10 = "RNDatadogBridge"
            defpackage.lz2.h(r10, r8, r1, r9)
            r11.resolve(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.reactnative.nativemodules.RNDatadogBridge.logDebug(java.lang.String, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0009, B:13:0x001d, B:15:0x0027, B:19:0x0038, B:16:0x002b, B:18:0x0031, B:9:0x0014), top: B:23:0x0009 }] */
    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNDatadogBridge
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void logError(java.lang.String r9, com.facebook.react.bridge.ReadableMap r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.facebook.react.bridge.Promise r14) {
        /*
            r8 = this;
            r9.getClass()
            r14.getClass()
            r1 = 0
            if (r10 == 0) goto L14
            java.util.HashMap r10 = r10.toHashMap()     // Catch: java.lang.Exception -> L11
            if (r10 == 0) goto L14
        Lf:
            r5 = r10
            goto L17
        L11:
            r0 = move-exception
            r8 = r0
            goto L3c
        L14:
            bs4 r10 = defpackage.bs4.a     // Catch: java.lang.Exception -> L11
            goto Lf
        L17:
            if (r11 == 0) goto L2b
            if (r12 == 0) goto L2b
            if (r13 == 0) goto L2b
            java.lang.Throwable r10 = r8.createCustomError(r11, r12, r13)     // Catch: java.lang.Exception -> L11
            com.datadog.android.log.Logger r8 = r8.getRnLogger()     // Catch: java.lang.Exception -> L11
            if (r8 == 0) goto L38
            r8.e(r9, r10, r5)     // Catch: java.lang.Exception -> L11
            goto L38
        L2b:
            com.datadog.android.log.Logger r2 = r8.getRnLogger()     // Catch: java.lang.Exception -> L11
            if (r2 == 0) goto L38
            r6 = 2
            r7 = 0
            r4 = 0
            r3 = r9
            com.datadog.android.log.Logger.e$default(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L11
        L38:
            r14.resolve(r1)     // Catch: java.lang.Exception -> L11
            return
        L3c:
            java.util.ArrayList r9 = defpackage.lz2.a
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "logError failed: "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = 12
            java.lang.String r10 = "RNDatadogBridge"
            defpackage.lz2.h(r10, r8, r1, r9)
            r14.resolve(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.reactnative.nativemodules.RNDatadogBridge.logError(java.lang.String, com.facebook.react.bridge.ReadableMap, java.lang.String, java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0009, B:10:0x0017, B:12:0x001d, B:13:0x0024, B:9:0x0014), top: B:17:0x0009 }] */
    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNDatadogBridge
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void logInfo(java.lang.String r9, com.facebook.react.bridge.ReadableMap r10, com.facebook.react.bridge.Promise r11) {
        /*
            r8 = this;
            r9.getClass()
            r11.getClass()
            r1 = 0
            if (r10 == 0) goto L14
            java.util.HashMap r10 = r10.toHashMap()     // Catch: java.lang.Exception -> L11
            if (r10 == 0) goto L14
        Lf:
            r5 = r10
            goto L17
        L11:
            r0 = move-exception
            r8 = r0
            goto L28
        L14:
            bs4 r10 = defpackage.bs4.a     // Catch: java.lang.Exception -> L11
            goto Lf
        L17:
            com.datadog.android.log.Logger r2 = r8.getRnLogger()     // Catch: java.lang.Exception -> L11
            if (r2 == 0) goto L24
            r6 = 2
            r7 = 0
            r4 = 0
            r3 = r9
            com.datadog.android.log.Logger.i$default(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L11
        L24:
            r11.resolve(r1)     // Catch: java.lang.Exception -> L11
            return
        L28:
            java.util.ArrayList r9 = defpackage.lz2.a
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "logInfo failed: "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = 12
            java.lang.String r10 = "RNDatadogBridge"
            defpackage.lz2.h(r10, r8, r1, r9)
            r11.resolve(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.reactnative.nativemodules.RNDatadogBridge.logInfo(java.lang.String, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0009, B:13:0x001d, B:15:0x0027, B:19:0x0038, B:16:0x002b, B:18:0x0031, B:9:0x0014), top: B:23:0x0009 }] */
    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNDatadogBridge
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void logWarn(java.lang.String r9, com.facebook.react.bridge.ReadableMap r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.facebook.react.bridge.Promise r14) {
        /*
            r8 = this;
            r9.getClass()
            r14.getClass()
            r1 = 0
            if (r10 == 0) goto L14
            java.util.HashMap r10 = r10.toHashMap()     // Catch: java.lang.Exception -> L11
            if (r10 == 0) goto L14
        Lf:
            r5 = r10
            goto L17
        L11:
            r0 = move-exception
            r8 = r0
            goto L3c
        L14:
            bs4 r10 = defpackage.bs4.a     // Catch: java.lang.Exception -> L11
            goto Lf
        L17:
            if (r11 == 0) goto L2b
            if (r12 == 0) goto L2b
            if (r13 == 0) goto L2b
            java.lang.Throwable r10 = r8.createCustomError(r11, r12, r13)     // Catch: java.lang.Exception -> L11
            com.datadog.android.log.Logger r8 = r8.getRnLogger()     // Catch: java.lang.Exception -> L11
            if (r8 == 0) goto L38
            r8.w(r9, r10, r5)     // Catch: java.lang.Exception -> L11
            goto L38
        L2b:
            com.datadog.android.log.Logger r2 = r8.getRnLogger()     // Catch: java.lang.Exception -> L11
            if (r2 == 0) goto L38
            r6 = 2
            r7 = 0
            r4 = 0
            r3 = r9
            com.datadog.android.log.Logger.w$default(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L11
        L38:
            r14.resolve(r1)     // Catch: java.lang.Exception -> L11
            return
        L3c:
            java.util.ArrayList r9 = defpackage.lz2.a
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "logWarn failed: "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = 12
            java.lang.String r10 = "RNDatadogBridge"
            defpackage.lz2.h(r10, r8, r1, r9)
            r14.resolve(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.reactnative.nativemodules.RNDatadogBridge.logWarn(java.lang.String, com.facebook.react.bridge.ReadableMap, java.lang.String, java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNDatadogBridge
    @ReactMethod
    public void startView(String key, String name, ReadableMap context, Promise promise) {
        Map<String, ? extends Object> hashMap;
        key.getClass();
        promise.getClass();
        try {
            RumMonitor rumMonitor = getRumMonitor();
            if (rumMonitor == null) {
                promise.resolve(null);
                return;
            }
            if (context == null || (hashMap = context.toHashMap()) == null) {
                hashMap = bs4.a;
            }
            if (name == null) {
                name = key;
            }
            rumMonitor.startView(key, name, hashMap);
            promise.resolve(null);
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.h(IndeedRNBridgeBaseRNDatadogBridge.MODULE_NAME, "startView failed: " + e.getMessage(), null, 12);
            promise.resolve(null);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNDatadogBridge
    @ReactMethod
    public void stopView(String key, ReadableMap context, Promise promise) {
        Map<String, ? extends Object> hashMap;
        key.getClass();
        promise.getClass();
        try {
            RumMonitor rumMonitor = getRumMonitor();
            if (rumMonitor == null) {
                promise.resolve(null);
                return;
            }
            if (context == null || (hashMap = context.toHashMap()) == null) {
                hashMap = bs4.a;
            }
            rumMonitor.stopView(key, hashMap);
            promise.resolve(null);
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.h(IndeedRNBridgeBaseRNDatadogBridge.MODULE_NAME, "stopView failed: " + e.getMessage(), null, 12);
            promise.resolve(null);
        }
    }
}
