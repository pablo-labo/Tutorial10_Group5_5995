package defpackage;

import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;
import org.webrtc.Camera1Capturer;
import org.webrtc.Camera1Helper;
import org.webrtc.Camera2Capturer;
import org.webrtc.Camera2Helper;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.Size;
import org.webrtc.VideoCapturer;

/* JADX INFO: loaded from: classes3.dex */
public final class wv1 extends f5 {
    public static final /* synthetic */ int q = 0;
    public boolean i;
    public boolean j;
    public String k;
    public String l;
    public final Context m;
    public final CameraEnumerator n;
    public ReadableMap o;
    public final a p;

    public class a extends com.oney.WebRTCModule.a {
        public a() {
        }

        @Override // com.oney.WebRTCModule.a, org.webrtc.CameraVideoCapturer.CameraEventsHandler
        public final void onCameraOpening(String str) {
            super.onCameraOpening(str);
            final wv1 wv1Var = wv1.this;
            CameraEnumerator cameraEnumerator = wv1Var.n;
            String[] deviceNames = cameraEnumerator.getDeviceNames();
            int i = 0;
            while (true) {
                if (i >= deviceNames.length) {
                    i = -1;
                    break;
                } else if (Objects.equals(deviceNames[i], str)) {
                    break;
                } else {
                    i++;
                }
            }
            wv1Var.i(i, str, wv1Var.g);
            wv1Var.l = i == -1 ? null : String.valueOf(i);
            Log.d("wv1", "onCameraOpening, facing mode when has stopped capture: " + wv1Var.k + " ,current: " + wv1Var.h());
            if (wv1Var.k != null && !wv1Var.h().equals(wv1Var.k)) {
                Log.d("wv1", "Will restore to facing mode ".concat(wv1Var.h()));
                String str2 = (String) Arrays.stream(cameraEnumerator.getDeviceNames()).filter(new Predicate() { // from class: vv1
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        String str3 = (String) obj;
                        StringBuilder sbM = akb.m("Filtering ", str3, " isFrontFacing ");
                        wv1 wv1Var2 = wv1Var;
                        CameraEnumerator cameraEnumerator2 = wv1Var2.n;
                        sbM.append(cameraEnumerator2.isFrontFacing(str3));
                        Log.d("wv1", sbM.toString());
                        return cameraEnumerator2.isFrontFacing(str3) == wv1Var2.i;
                    }
                }).findFirst().get();
                Log.d("wv1", "Invoked restoreTheSelectedCamera, will switch to device:" + str2);
                VideoCapturer videoCapturer = wv1Var.g;
                if (videoCapturer instanceof CameraVideoCapturer) {
                    ((CameraVideoCapturer) videoCapturer).switchCamera(new yv1(wv1Var), str2);
                }
            }
            wv1Var.k = null;
        }
    }

    public static class b {
        public final int a;
        public final String b;
        public final CameraVideoCapturer c;

        public b(int i, String str, CameraVideoCapturer cameraVideoCapturer) {
            this.a = i;
            this.b = str;
            this.c = cameraVideoCapturer;
        }
    }

    public wv1(Activity activity, CameraEnumerator cameraEnumerator, ReadableMap readableMap) {
        super(readableMap.getInt("width"), readableMap.getInt("height"), readableMap.getInt("frameRate"));
        this.j = false;
        this.k = null;
        this.p = new a();
        this.m = activity;
        this.n = cameraEnumerator;
        this.o = readableMap;
    }

    @Override // defpackage.f5
    public final void a(ReadableMap readableMap, o66 o66Var) {
        int i;
        y71 y71Var;
        int i2;
        String str;
        int i3;
        int i4 = this.a;
        int i5 = this.b;
        int i6 = this.c;
        y71 y71Var2 = new y71(1, this, readableMap);
        String str2 = null;
        if (this.g == null) {
            y71Var2.run();
            o66Var.accept(null);
            return;
        }
        CameraEnumerator cameraEnumerator = this.n;
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        String strA = sjc.a(readableMap, "deviceId");
        String strA2 = sjc.a(readableMap, "facingMode");
        int i7 = -1;
        if (strA != null) {
            try {
                i = Integer.parseInt(strA);
            } catch (Exception unused) {
                i = -1;
            }
            try {
                str2 = deviceNames[i];
            } catch (Exception unused2) {
                Log.d("wv1", "failed to find device with id: ".concat(strA));
            }
        } else {
            i = -1;
        }
        if (str2 == null) {
            boolean z = strA2 == null || strA2.equals("user");
            int length = deviceNames.length;
            int i8 = 0;
            while (true) {
                y71Var = y71Var2;
                if (i8 >= length) {
                    i2 = i4;
                    str = str2;
                    break;
                }
                String str3 = deviceNames[i8];
                i7++;
                i2 = i4;
                if (cameraEnumerator.isFrontFacing(str3) == z) {
                    str = str3;
                    break;
                } else {
                    i8++;
                    y71Var2 = y71Var;
                    i4 = i2;
                }
            }
            i3 = i7;
        } else {
            y71Var = y71Var2;
            i2 = i4;
            str = str2;
            i3 = i;
        }
        if (str == null) {
            o66Var.accept(new Exception(t40.l("OverconstrainedError: could not find camera with deviceId: ", strA, " or facingMode: ", strA2)));
            return;
        }
        try {
        } catch (Exception unused3) {
            Log.d("wv1", "Forcing camera switch, couldn't parse current device id: " + this.l);
        }
        boolean z2 = i3 != Integer.parseInt(this.l);
        CameraVideoCapturer cameraVideoCapturer = (CameraVideoCapturer) this.g;
        uv1 uv1Var = new uv1(this, y71Var, i2, i5, i6, i3, str, cameraVideoCapturer, o66Var);
        if (z2) {
            cameraVideoCapturer.switchCamera(new xv1(this, uv1Var, o66Var), str);
        } else {
            uv1Var.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf A[SYNTHETIC] */
    @Override // defpackage.f5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.webrtc.VideoCapturer b() {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv1.b():org.webrtc.VideoCapturer");
    }

    @Override // defpackage.f5
    public final String d() {
        return this.l;
    }

    @Override // defpackage.f5
    public final WritableMap e() {
        WritableMap writableMapE = super.e();
        writableMapE.putString("facingMode", this.i ? "user" : "environment");
        return writableMapE;
    }

    @Override // defpackage.f5
    public final void f() {
        Log.d("wv1", "Invoking to startCapture, facing mode when has stopped capture: " + this.k + " ,current: " + h());
        super.f();
        this.j = true;
    }

    @Override // defpackage.f5
    public final boolean g() {
        this.j = false;
        this.k = h();
        Log.d("wv1", "Will stopCapture, current facingMode is " + this.k);
        return super.g();
    }

    public final String h() {
        return this.i ? "user" : "environment";
    }

    public final void i(int i, String str, VideoCapturer videoCapturer) {
        Size sizeFindClosestCaptureFormat = videoCapturer instanceof Camera1Capturer ? Camera1Helper.findClosestCaptureFormat(i, this.a, this.b) : videoCapturer instanceof Camera2Capturer ? Camera2Helper.findClosestCaptureFormat((CameraManager) this.m.getSystemService("camera"), str, this.a, this.b) : null;
        if (sizeFindClosestCaptureFormat != null) {
            this.d = sizeFindClosestCaptureFormat.width;
            this.e = sizeFindClosestCaptureFormat.height;
        }
    }
}
