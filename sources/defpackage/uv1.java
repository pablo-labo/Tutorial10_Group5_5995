package defpackage;

import org.webrtc.CameraVideoCapturer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uv1 implements Runnable {
    public final /* synthetic */ String V;
    public final /* synthetic */ CameraVideoCapturer W;
    public final /* synthetic */ o66 X;
    public final /* synthetic */ wv1 a;
    public final /* synthetic */ y71 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ uv1(wv1 wv1Var, y71 y71Var, int i, int i2, int i3, int i4, String str, CameraVideoCapturer cameraVideoCapturer, o66 o66Var) {
        this.a = wv1Var;
        this.b = y71Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.V = str;
        this.W = cameraVideoCapturer;
        this.X = o66Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.run();
        wv1 wv1Var = this.a;
        if (wv1Var.a != this.c || wv1Var.b != this.d || wv1Var.c != this.e) {
            wv1Var.i(this.f, this.V, wv1Var.g);
            this.W.changeCaptureFormat(wv1Var.a, wv1Var.b, wv1Var.c);
        }
        this.X.accept(null);
    }
}
