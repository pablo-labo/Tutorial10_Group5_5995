package com.facebook.react.internal.interop;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import defpackage.dmc;
import defpackage.ej7;
import defpackage.sy3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/internal/interop/InteropEventEmitter;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "targetTag", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "Lj6g;", "receiveEvent", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/bridge/WritableArray;", "touches", "changedIndices", "receiveTouches", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcherOverride", "overrideEventDispatcher", "(Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InteropEventEmitter implements RCTEventEmitter {
    private static final a Companion = new a();
    private EventDispatcher eventDispatcherOverride;
    private final ReactContext reactContext;

    public static final class a {
    }

    public InteropEventEmitter(ReactContext reactContext) {
        reactContext.getClass();
        this.reactContext = reactContext;
    }

    public final void overrideEventDispatcher(EventDispatcher eventDispatcherOverride) {
        this.eventDispatcherOverride = eventDispatcherOverride;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @sy3
    public void receiveEvent(int targetTag, String eventName, WritableMap params) {
        eventName.getClass();
        EventDispatcher eventDispatcherE = this.eventDispatcherOverride;
        if (eventDispatcherE == null) {
            eventDispatcherE = dmc.e(this.reactContext, targetTag);
        }
        int iG = dmc.g(this.reactContext);
        if (eventDispatcherE != null) {
            eventDispatcherE.a(new ej7(iG, targetTag, eventName, params));
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @sy3
    public void receiveTouches(String eventName, WritableArray touches, WritableArray changedIndices) {
        eventName.getClass();
        touches.getClass();
        changedIndices.getClass();
        throw new UnsupportedOperationException("EventEmitter#receiveTouches is not supported by the Fabric Interop Layer");
    }
}
