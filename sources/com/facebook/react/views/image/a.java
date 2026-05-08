package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.horcrux.svg.events.SvgLoadEvent;
import defpackage.ox4;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends ox4<a> {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: com.facebook.react.views.image.a$a, reason: collision with other inner class name */
    public static final class C0139a {
        public static String a(int i) {
            if (i == 1) {
                return "topError";
            }
            if (i == 2) {
                return SvgLoadEvent.EVENT_NAME;
            }
            if (i == 3) {
                return "topLoadEnd";
            }
            if (i == 4) {
                return "topLoadStart";
            }
            if (i == 5) {
                return "topProgress";
            }
            throw new IllegalStateException(("Invalid image event: " + i).toString());
        }
    }

    public a(int i, int i2, int i3, String str, String str2, int i4, int i5, int i6, int i7) {
        super(i, i2);
        this.a = i3;
        this.b = str;
        this.c = str2;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    @Override // defpackage.ox4
    public final short getCoalescingKey() {
        return (short) this.a;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        int i = this.a;
        if (i == 1) {
            writableMapCreateMap.putString("error", this.b);
            return writableMapCreateMap;
        }
        if (i == 2) {
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.getClass();
            writableMapCreateMap2.putString("uri", this.c);
            writableMapCreateMap2.putDouble("width", this.d);
            writableMapCreateMap2.putDouble("height", this.e);
            writableMapCreateMap.putMap("source", writableMapCreateMap2);
            return writableMapCreateMap;
        }
        if (i != 5) {
            return writableMapCreateMap;
        }
        int i2 = this.f;
        writableMapCreateMap.putInt("loaded", i2);
        int i3 = this.g;
        writableMapCreateMap.putInt("total", i3);
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, ((double) i2) / ((double) i3));
        return writableMapCreateMap;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return C0139a.a(this.a);
    }

    public /* synthetic */ a(int i, int i2, int i3) {
        this(i, i2, i3, null, null, 0, 0, 0, 0);
    }
}
