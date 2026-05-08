package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import defpackage.elg;
import defpackage.l5;
import defpackage.sy3;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0013J'\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u001dR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\t\u0010!¨\u0006\""}, d2 = {"Lcom/facebook/react/animated/EventAnimationDriver;", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "", "eventName", "", "viewTag", "", "eventPath", "Lelg;", "valueNode", "<init>", "(Ljava/lang/String;ILjava/util/List;Lelg;)V", "targetTag", "Lcom/facebook/react/bridge/WritableMap;", "params", "Lj6g;", "receiveEvent", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "surfaceId", "(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/bridge/WritableArray;", "touches", "changedIndices", "receiveTouches", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V", "", "canCoalesceEvent", "customCoalesceKey", "category", "(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V", "Ljava/lang/String;", "I", "Ljava/util/List;", "Lelg;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EventAnimationDriver implements RCTModernEventEmitter {
    public String eventName;
    private final List<String> eventPath;
    public elg valueNode;
    public int viewTag;

    public EventAnimationDriver(String str, int i, List<String> list, elg elgVar) {
        str.getClass();
        list.getClass();
        elgVar.getClass();
        this.eventName = str;
        this.viewTag = i;
        this.eventPath = list;
        this.valueNode = elgVar;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int surfaceId, int targetTag, String eventName, boolean canCoalesceEvent, int customCoalesceKey, WritableMap params, int category) {
        ReadableMap map;
        ReadableMap readableMap;
        eventName.getClass();
        if (params == null) {
            l5.q("Native animated events must have event data.");
            return;
        }
        int size = this.eventPath.size() - 1;
        int i = 0;
        ReadableArray array = null;
        ReadableMap readableMap2 = params;
        while (i < size) {
            List<String> list = this.eventPath;
            if (readableMap2 != null) {
                String str = list.get(i);
                ReadableType type = readableMap2.getType(str);
                if (type == ReadableType.Map) {
                    map = readableMap2.getMap(str);
                    readableMap = map;
                    array = null;
                } else {
                    if (type != ReadableType.Array) {
                        throw new UnexpectedNativeTypeException("Unexpected type " + type + " for key '" + str + "'");
                    }
                    array = readableMap2.getArray(str);
                    readableMap = null;
                }
            } else {
                int i2 = Integer.parseInt(list.get(i));
                ReadableType type2 = array != null ? array.getType(i2) : null;
                if (type2 == ReadableType.Map) {
                    map = array.getMap(i2);
                    readableMap = map;
                    array = null;
                } else {
                    if (type2 != ReadableType.Array) {
                        throw new UnexpectedNativeTypeException("Unexpected type " + type2 + " for index '" + i2 + "'");
                    }
                    array = array.getArray(i2);
                    readableMap = null;
                }
            }
            i++;
            readableMap2 = readableMap;
        }
        String str2 = this.eventPath.get(r3.size() - 1);
        if (readableMap2 != null) {
            this.valueNode.e = readableMap2.getDouble(str2);
            return;
        }
        this.valueNode.e = array != null ? array.getDouble(Integer.parseInt(str2)) : 0.0d;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @sy3
    public void receiveTouches(String eventName, WritableArray touches, WritableArray changedIndices) {
        eventName.getClass();
        touches.getClass();
        changedIndices.getClass();
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
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
