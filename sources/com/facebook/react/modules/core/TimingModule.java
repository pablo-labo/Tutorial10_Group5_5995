package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.core.a;
import defpackage.cw7;
import defpackage.dh6;
import defpackage.j6g;
import defpackage.nmc;
import defpackage.r6;
import defpackage.w24;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "Timing")
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001,B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u0014J\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/facebook/react/modules/core/TimingModule;", "Lcom/facebook/fbreact/specs/NativeTimingSpec;", "Lcw7;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lw24;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lw24;)V", "", "callbackIDDouble", "durationDouble", "jsSchedulingTime", "", "repeat", "Lj6g;", "createTimer", "(DDDZ)V", "timerIdDouble", "deleteTimer", "(D)V", "sendIdleEvents", "setSendIdleEvents", "(Z)V", "Lcom/facebook/react/bridge/WritableArray;", "timerIDs", "callTimers", "(Lcom/facebook/react/bridge/WritableArray;)V", "frameTime", "callIdleCallbacks", "", "warningMessage", "emitTimeDriftWarning", "(Ljava/lang/String;)V", "invalidate", "()V", "", "rangeMs", "hasActiveTimersInRange", "(J)Z", "Lcom/facebook/react/modules/core/JavaTimerManager;", "javaTimerManager", "Lcom/facebook/react/modules/core/JavaTimerManager;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TimingModule extends NativeTimingSpec implements cw7 {
    public static final String NAME = "Timing";
    private final JavaTimerManager javaTimerManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimingModule(ReactApplicationContext reactApplicationContext, w24 w24Var) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        w24Var.getClass();
        a aVar = a.f;
        if (aVar != null) {
            this.javaTimerManager = new JavaTimerManager(reactApplicationContext, this, aVar, w24Var);
        } else {
            r6.g("ReactChoreographer needs to be initialized.");
            throw null;
        }
    }

    @Override // defpackage.cw7
    public void callIdleCallbacks(double frameTime) {
        JSTimers jSTimers;
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn == null || (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)) == null) {
            return;
        }
        jSTimers.callIdleCallbacks(frameTime);
    }

    @Override // defpackage.cw7
    public void callTimers(WritableArray timerIDs) {
        JSTimers jSTimers;
        timerIDs.getClass();
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn == null || (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)) == null) {
            return;
        }
        jSTimers.callTimers(timerIDs);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void createTimer(double callbackIDDouble, double durationDouble, double jsSchedulingTime, boolean repeat) {
        int i = (int) callbackIDDouble;
        int i2 = (int) durationDouble;
        JavaTimerManager javaTimerManager = this.javaTimerManager;
        cw7 cw7Var = javaTimerManager.b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = (long) jsSchedulingTime;
        if (javaTimerManager.d.f() && Math.abs(j - jCurrentTimeMillis) > 60000) {
            cw7Var.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long jMax = Math.max(0L, (j - jCurrentTimeMillis) + ((long) i2));
        if (i2 != 0 || repeat) {
            javaTimerManager.createTimer(i, jMax, repeat);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.getClass();
        writableArrayCreateArray.pushInt(i);
        cw7Var.callTimers(writableArrayCreateArray);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void deleteTimer(double timerIdDouble) {
        this.javaTimerManager.deleteTimer((int) timerIdDouble);
    }

    @Override // defpackage.cw7
    public void emitTimeDriftWarning(String warningMessage) {
        JSTimers jSTimers;
        warningMessage.getClass();
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn == null || (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)) == null) {
            return;
        }
        jSTimers.emitTimeDriftWarning(warningMessage);
    }

    public final boolean hasActiveTimersInRange(long rangeMs) {
        JavaTimerManager javaTimerManager = this.javaTimerManager;
        synchronized (javaTimerManager.e) {
            JavaTimerManager.c cVarPeek = javaTimerManager.e0.peek();
            if (cVarPeek == null) {
                return false;
            }
            if (!cVarPeek.d && cVarPeek.c < rangeMs) {
                return true;
            }
            Iterator<JavaTimerManager.c> it = javaTimerManager.e0.iterator();
            it.getClass();
            while (it.hasNext()) {
                JavaTimerManager.c next = it.next();
                next.getClass();
                if (!next.d && next.c < rangeMs) {
                    return true;
                }
            }
            j6g j6gVar = j6g.a;
            return false;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        JavaTimerManager javaTimerManager = this.javaTimerManager;
        javaTimerManager.getClass();
        WeakHashMap<ReactContext, dh6> weakHashMap = dh6.e;
        ReactApplicationContext reactApplicationContext = javaTimerManager.a;
        dh6.a.a(reactApplicationContext).a.remove(javaTimerManager);
        reactApplicationContext.removeLifecycleEventListener(javaTimerManager);
        javaTimerManager.b();
        if (javaTimerManager.c0) {
            javaTimerManager.c.c(a.EnumC0132a.d, javaTimerManager.Z);
            javaTimerManager.c0 = false;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void setSendIdleEvents(boolean sendIdleEvents) {
        this.javaTimerManager.setSendIdleEvents(sendIdleEvents);
    }
}
