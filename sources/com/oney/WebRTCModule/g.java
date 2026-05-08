package com.oney.WebRTCModule;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.oney.WebRTCModule.g;
import defpackage.bp4;
import defpackage.cp4;
import defpackage.dlf;
import defpackage.epg;
import defpackage.mkf;
import defpackage.pn0;
import defpackage.prg;
import defpackage.v7;
import java.util.WeakHashMap;
import org.webrtc.EglBase;
import org.webrtc.Logging;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends ViewGroup {
    public static final RendererCommon.ScalingType f0 = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
    public static final String g0 = WebRTCModule.TAG;
    public static int h0;
    public final a V;
    public final b W;
    public int a;
    public RendererCommon.ScalingType a0;
    public int b;
    public String b0;
    public int c;
    public final SurfaceViewRenderer c0;
    public final Object d;
    public VideoTrack d0;
    public boolean e;
    public boolean e0;
    public boolean f;

    public class a implements RendererCommon.RendererEvents {
        public a() {
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public final void onFirstFrameRendered() {
            g gVar = g.this;
            gVar.post(new v7(gVar, 7));
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public final void onFrameResolutionChanged(final int i, final int i2, int i3) {
            boolean z;
            boolean z2;
            final g gVar = g.this;
            synchronized (gVar.d) {
                try {
                    z = true;
                    if (gVar.a != i2) {
                        gVar.a = i2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (gVar.b != i3) {
                        gVar.b = i3;
                        z2 = true;
                    }
                    if (gVar.c != i) {
                        gVar.c = i;
                    } else {
                        z = z2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                gVar.post(gVar.W);
                if (gVar.e0) {
                    gVar.post(new Runnable() { // from class: bwg
                        @Override // java.lang.Runnable
                        public final void run() {
                            g gVar2 = gVar;
                            int i4 = i;
                            int i5 = i2;
                            try {
                                ReactContext reactContext = (ReactContext) gVar2.getContext();
                                WritableMap writableMapCreateMap = Arguments.createMap();
                                writableMapCreateMap.putInt("width", i4);
                                writableMapCreateMap.putInt("height", i5);
                                ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(gVar2.getId(), "onDimensionsChange", writableMapCreateMap);
                            } catch (Exception e) {
                                Log.e(g.g0, "Error calling onDimensionsChange callback", e);
                            }
                        }
                    });
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.b();
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RendererCommon.ScalingType.values().length];
            a = iArr;
            try {
                iArr[RendererCommon.ScalingType.SCALE_ASPECT_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RendererCommon.ScalingType.SCALE_ASPECT_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g(mkf mkfVar) {
        super(mkfVar);
        this.d = new Object();
        this.V = new a();
        this.W = new b();
        this.e0 = false;
        SurfaceViewRenderer surfaceViewRenderer = new SurfaceViewRenderer(mkfVar);
        this.c0 = surfaceViewRenderer;
        addView(surfaceViewRenderer);
        setMirror(false);
        setScalingType(f0);
    }

    private void setScalingType(RendererCommon.ScalingType scalingType) {
        synchronized (this.d) {
            try {
                if (this.a0 == scalingType) {
                    return;
                }
                this.a0 = scalingType;
                this.c0.setScalingType(scalingType);
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void setVideoTrack(VideoTrack videoTrack) {
        VideoTrack videoTrack2 = this.d0;
        if (videoTrack2 != videoTrack) {
            SurfaceViewRenderer surfaceViewRenderer = this.c0;
            if (videoTrack2 != null) {
                if (videoTrack == null) {
                    surfaceViewRenderer.setBackgroundColor(-16777216);
                    surfaceViewRenderer.clearImage();
                }
                a();
            }
            this.d0 = videoTrack;
            if (videoTrack != null) {
                c();
                if (videoTrack2 == null) {
                    surfaceViewRenderer.setBackgroundColor(-16777216);
                    surfaceViewRenderer.clearImage();
                }
            }
        }
    }

    public final void a() {
        if (this.f) {
            if (this.d0 != null) {
                dlf.a(new pn0(this, 5));
            }
            this.c0.release();
            h0--;
            this.f = false;
            synchronized (this.d) {
                this.a = 0;
                this.b = 0;
                this.c = 0;
            }
            b();
        }
    }

    @SuppressLint({"WrongCall"})
    public final void b() {
        this.c0.requestLayout();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        if (isInLayout()) {
            return;
        }
        onLayout(false, getLeft(), getTop(), getRight(), getBottom());
    }

    public final void c() {
        if (this.f || this.d0 == null) {
            return;
        }
        WeakHashMap<View, prg> weakHashMap = epg.a;
        if (isAttachedToWindow()) {
            EglBase.Context contextA = cp4.a();
            String str = g0;
            if (contextA == null) {
                Log.e(str, "Failed to render a VideoTrack!");
                return;
            }
            try {
                this.c0.init(contextA, this.V);
                h0++;
                dlf.a(new bp4(this, 4));
                this.f = true;
            } catch (Exception e) {
                Logging.e(str, "Failed to initialize surfaceViewRenderer on instance " + h0, e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        try {
            c();
        } finally {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        try {
            a();
        } finally {
            super.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            int r9 = r9 - r7
            int r8 = r8 - r6
            r5 = 0
            if (r9 == 0) goto L42
            if (r8 != 0) goto L8
            goto L42
        L8:
            java.lang.Object r6 = r4.d
            monitor-enter(r6)
            int r7 = r4.a     // Catch: java.lang.Throwable -> L49
            int r0 = r4.b     // Catch: java.lang.Throwable -> L49
            int r1 = r4.c     // Catch: java.lang.Throwable -> L49
            org.webrtc.RendererCommon$ScalingType r2 = r4.a0     // Catch: java.lang.Throwable -> L49
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L49
            int[] r6 = com.oney.WebRTCModule.g.c.a
            int r3 = r2.ordinal()
            r6 = r6[r3]
            r3 = 1
            if (r6 == r3) goto L46
            if (r7 == 0) goto L42
            if (r1 != 0) goto L24
            goto L42
        L24:
            int r0 = r0 % 180
            if (r0 != 0) goto L2c
            float r5 = (float) r1
            float r6 = (float) r7
        L2a:
            float r5 = r5 / r6
            goto L2f
        L2c:
            float r5 = (float) r7
            float r6 = (float) r1
            goto L2a
        L2f:
            android.graphics.Point r5 = org.webrtc.RendererCommon.getDisplaySize(r2, r5, r8, r9)
            int r6 = r5.x
            int r8 = r8 - r6
            int r7 = r8 / 2
            int r5 = r5.y
            int r9 = r9 - r5
            int r8 = r9 / 2
            int r6 = r6 + r7
            int r9 = r8 + r5
            r5 = r7
            goto L4c
        L42:
            r6 = r5
            r8 = r6
            r9 = r8
            goto L4c
        L46:
            r6 = r8
            r8 = r5
            goto L4c
        L49:
            r4 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L49
            throw r4
        L4c:
            org.webrtc.SurfaceViewRenderer r4 = r4.c0
            r4.layout(r5, r8, r6, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oney.WebRTCModule.g.onLayout(boolean, int, int, int, int):void");
    }

    public void setMirror(boolean z) {
        if (this.e != z) {
            this.e = z;
            this.c0.setMirror(z);
            b();
        }
    }

    public void setObjectFit(String str) {
        setScalingType("cover".equals(str) ? RendererCommon.ScalingType.SCALE_ASPECT_FILL : RendererCommon.ScalingType.SCALE_ASPECT_FIT);
    }

    public void setOnDimensionsChange(boolean z) {
        this.e0 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStreamURL(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.b0
            boolean r0 = java.util.Objects.equals(r5, r0)
            if (r0 != 0) goto L4b
            r0 = 0
            if (r5 == 0) goto L3e
            android.content.Context r1 = r4.getContext()
            com.facebook.react.bridge.ReactContext r1 = (com.facebook.react.bridge.ReactContext) r1
            java.lang.Class<com.oney.WebRTCModule.WebRTCModule> r2 = com.oney.WebRTCModule.WebRTCModule.class
            com.facebook.react.bridge.NativeModule r1 = r1.getNativeModule(r2)
            com.oney.WebRTCModule.WebRTCModule r1 = (com.oney.WebRTCModule.WebRTCModule) r1
            org.webrtc.MediaStream r1 = r1.getStreamForReactTag(r5)
            if (r1 == 0) goto L2f
            java.util.List<org.webrtc.VideoTrack> r1 = r1.videoTracks
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L2f
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            org.webrtc.VideoTrack r1 = (org.webrtc.VideoTrack) r1
            goto L30
        L2f:
            r1 = r0
        L30:
            if (r1 != 0) goto L3f
            java.lang.String r2 = "No video stream for react tag: "
            java.lang.String r2 = r2.concat(r5)
            java.lang.String r3 = com.oney.WebRTCModule.g.g0
            android.util.Log.w(r3, r2)
            goto L3f
        L3e:
            r1 = r0
        L3f:
            org.webrtc.VideoTrack r2 = r4.d0
            if (r2 == r1) goto L46
            r4.setVideoTrack(r0)
        L46:
            r4.b0 = r5
            r4.setVideoTrack(r1)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oney.WebRTCModule.g.setStreamURL(java.lang.String):void");
    }

    public void setZOrder(int i) {
        SurfaceViewRenderer surfaceViewRenderer = this.c0;
        if (i == 0) {
            surfaceViewRenderer.setZOrderMediaOverlay(false);
        } else if (i == 1) {
            surfaceViewRenderer.setZOrderMediaOverlay(true);
        } else {
            if (i != 2) {
                return;
            }
            surfaceViewRenderer.setZOrderOnTop(true);
        }
    }
}
