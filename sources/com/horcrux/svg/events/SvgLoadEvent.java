package com.horcrux.svg.events;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import defpackage.m5d;
import defpackage.ox4;
import defpackage.q07;

/* JADX INFO: loaded from: classes2.dex */
public class SvgLoadEvent extends ox4<SvgLoadEvent> {
    public static final String EVENT_NAME = "topLoad";
    private final float height;
    private final String uri;
    private final float width;

    public SvgLoadEvent(int i, int i2, ReactContext reactContext, String str, float f, float f2) {
        super(i, i2);
        reactContext.getClass();
        ((28 & 16) != 0 ? q07.a : null).getClass();
        try {
            if (Uri.parse(str).getScheme() == null) {
                m5d.b(reactContext, str);
            }
        } catch (NullPointerException unused) {
            m5d.b(reactContext, str);
        }
        this.uri = str;
        this.width = f;
        this.height = f2;
    }

    @Override // defpackage.ox4
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), getEventData());
    }

    @Override // defpackage.ox4
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.ox4
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("width", this.width);
        writableMapCreateMap.putDouble("height", this.height);
        writableMapCreateMap.putString("uri", this.uri);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("source", writableMapCreateMap);
        return writableMapCreateMap2;
    }

    @Override // defpackage.ox4
    public String getEventName() {
        return EVENT_NAME;
    }
}
