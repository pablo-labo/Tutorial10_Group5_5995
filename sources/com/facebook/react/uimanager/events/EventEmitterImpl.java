package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import defpackage.msb;
import defpackage.r6;
import defpackage.sy3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJI\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/facebook/react/uimanager/events/EventEmitterImpl;", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "ensureLegacyEventEmitter", "()Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "eventEmitter", "Lj6g;", "registerFabricEventEmitter", "(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V", "", "targetTag", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "receiveEvent", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "surfaceId", "(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/bridge/WritableArray;", "touches", "changedIndices", "receiveTouches", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V", "", "canCoalesceEvent", "customCoalesceKey", "category", "(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "legacyEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "fabricEventEmitter", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EventEmitterImpl implements RCTModernEventEmitter {
    private static final String TAG = "ReactEventEmitter";
    private RCTModernEventEmitter fabricEventEmitter;
    private RCTEventEmitter legacyEventEmitter;
    private final ReactApplicationContext reactContext;

    public EventEmitterImpl(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
    }

    private final RCTEventEmitter ensureLegacyEventEmitter() {
        if (this.legacyEventEmitter == null) {
            if (this.reactContext.hasActiveReactInstance()) {
                this.legacyEventEmitter = (RCTEventEmitter) this.reactContext.getJSModule(RCTEventEmitter.class);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter without active Catalyst instance!"));
            }
        }
        return this.legacyEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int surfaceId, int targetTag, String eventName, boolean canCoalesceEvent, int customCoalesceKey, WritableMap params, int category) {
        eventName.getClass();
        char c = surfaceId == -1 ? (char) 1 : (char) 2;
        if (c == 1 && targetTag % 10 != 1 && targetTag % 2 == 0) {
            c = 2;
        }
        if (c == 1) {
            RCTEventEmitter rCTEventEmitterEnsureLegacyEventEmitter = ensureLegacyEventEmitter();
            if (rCTEventEmitterEnsureLegacyEventEmitter != null) {
                rCTEventEmitterEnsureLegacyEventEmitter.receiveEvent(targetTag, eventName, params);
                return;
            }
            return;
        }
        if (c != 2) {
            return;
        }
        RCTModernEventEmitter rCTModernEventEmitter = this.fabricEventEmitter;
        if (rCTModernEventEmitter == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("No fabricEventEmitter registered, cannot dispatch event"));
        } else {
            rCTModernEventEmitter.receiveEvent(surfaceId, targetTag, eventName, canCoalesceEvent, customCoalesceKey, params, category);
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @sy3
    public void receiveTouches(String eventName, WritableArray touches, WritableArray changedIndices) {
        RCTEventEmitter rCTEventEmitterEnsureLegacyEventEmitter;
        eventName.getClass();
        touches.getClass();
        changedIndices.getClass();
        if (touches.size() <= 0) {
            r6.g("Check failed.");
            return;
        }
        ReadableMap map = touches.getMap(0);
        if (msb.e(map != null ? map.getInt("target") : 0) != 1 || (rCTEventEmitterEnsureLegacyEventEmitter = ensureLegacyEventEmitter()) == null) {
            return;
        }
        rCTEventEmitterEnsureLegacyEventEmitter.receiveTouches(eventName, touches, changedIndices);
    }

    public final void registerFabricEventEmitter(RCTModernEventEmitter eventEmitter) {
        this.fabricEventEmitter = eventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int surfaceId, int targetTag, String eventName, WritableMap params) {
        eventName.getClass();
        receiveEvent(surfaceId, targetTag, eventName, false, 0, params, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @sy3
    public void receiveEvent(int targetTag, String eventName, WritableMap params) {
        eventName.getClass();
        receiveEvent(-1, targetTag, eventName, params);
    }
}
