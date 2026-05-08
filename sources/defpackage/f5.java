package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import org.webrtc.VideoCapturer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f5 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final int f;
    public VideoCapturer g;
    public ln2 h;

    public f5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public void a(ReadableMap readableMap, o66 o66Var) {
        o66Var.accept(new UnsupportedOperationException("This video track does not support applyConstraints."));
    }

    public abstract VideoCapturer b();

    public void c() {
        VideoCapturer videoCapturer = this.g;
        if (videoCapturer != null) {
            videoCapturer.dispose();
            this.g = null;
        }
    }

    public abstract String d();

    public WritableMap e() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("deviceId", d());
        writableMapCreateMap.putString("groupId", "");
        writableMapCreateMap.putInt("height", this.e);
        writableMapCreateMap.putInt("width", this.d);
        writableMapCreateMap.putInt("frameRate", this.f);
        return writableMapCreateMap;
    }

    public void f() {
        try {
            this.g.startCapture(this.a, this.b, this.c);
        } catch (RuntimeException unused) {
        }
    }

    public boolean g() {
        try {
            this.g.stopCapture();
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }
}
