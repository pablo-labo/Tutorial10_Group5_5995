package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.media3.common.util.GlUtil;
import defpackage.fwa;
import defpackage.m3c;
import defpackage.o3c;
import java.nio.Buffer;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class fpe extends GLSurfaceView {
    public static final /* synthetic */ int d0 = 0;
    public SurfaceTexture V;
    public Surface W;
    public final CopyOnWriteArrayList<b> a;
    public boolean a0;
    public final SensorManager b;
    public boolean b0;
    public final Sensor c;
    public boolean c0;
    public final fwa d;
    public final Handler e;
    public final rnd f;

    public final class a implements GLSurfaceView.Renderer, fwa.a {
        public float V;
        public float W;
        public final rnd a;
        public final float[] d;
        public final float[] e;
        public final float[] f;
        public final float[] b = new float[16];
        public final float[] c = new float[16];
        public final float[] X = new float[16];
        public final float[] Y = new float[16];

        public a(rnd rndVar) {
            float[] fArr = new float[16];
            this.d = fArr;
            float[] fArr2 = new float[16];
            this.e = fArr2;
            float[] fArr3 = new float[16];
            this.f = fArr3;
            this.a = rndVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.W = 3.1415927f;
        }

        @Override // fwa.a
        public final synchronized void a(float f, float[] fArr) {
            float[] fArr2 = this.d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.W = f2;
            Matrix.setRotateM(this.e, 0, -this.V, (float) Math.cos(f2), (float) Math.sin(this.W), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            Long lD;
            synchronized (this) {
                Matrix.multiplyMM(this.Y, 0, this.d, 0, this.f, 0);
                Matrix.multiplyMM(this.X, 0, this.e, 0, this.Y, 0);
            }
            Matrix.multiplyMM(this.c, 0, this.b, 0, this.X, 0);
            rnd rndVar = this.a;
            float[] fArr = this.c;
            GLES20.glClear(16384);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e) {
                zkd.x("SceneRenderer", "Failed to draw a frame", e);
            }
            if (rndVar.a.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = rndVar.Y;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    GlUtil.b();
                } catch (GlUtil.GlException e2) {
                    zkd.x("SceneRenderer", "Failed to draw a frame", e2);
                }
                if (rndVar.b.compareAndSet(true, false)) {
                    Matrix.setIdentityM(rndVar.V, 0);
                }
                long timestamp = rndVar.Y.getTimestamp();
                dmf<Long> dmfVar = rndVar.e;
                synchronized (dmfVar) {
                    lD = dmfVar.d(timestamp, false);
                }
                Long l = lD;
                if (l != null) {
                    us5 us5Var = rndVar.d;
                    float[] fArr2 = rndVar.V;
                    float[] fArrF = us5Var.c.f(l.longValue());
                    if (fArrF != null) {
                        float[] fArr3 = us5Var.b;
                        float f = fArrF[0];
                        float f2 = -fArrF[1];
                        float f3 = -fArrF[2];
                        float length = Matrix.length(f, f2, f3);
                        if (length != 0.0f) {
                            Matrix.setRotateM(fArr3, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                        } else {
                            Matrix.setIdentityM(fArr3, 0);
                        }
                        if (!us5Var.d) {
                            us5.a(us5Var.a, us5Var.b);
                            us5Var.d = true;
                        }
                        Matrix.multiplyMM(fArr2, 0, us5Var.a, 0, us5Var.b, 0);
                    }
                }
                m3c m3cVarF = rndVar.f.f(timestamp);
                if (m3cVarF != null) {
                    o3c o3cVar = rndVar.c;
                    o3cVar.getClass();
                    if (o3c.b(m3cVarF)) {
                        o3cVar.a = m3cVarF.c;
                        o3cVar.b = new o3c.a(m3cVarF.a.a[0]);
                        if (!m3cVarF.d) {
                            m3c.b bVar = m3cVarF.b.a[0];
                            float[] fArr4 = bVar.c;
                            int length2 = fArr4.length;
                            GlUtil.d(fArr4);
                            GlUtil.d(bVar.d);
                        }
                    }
                }
            }
            Matrix.multiplyMM(rndVar.W, 0, fArr, 0, rndVar.V, 0);
            o3c o3cVar2 = rndVar.c;
            int i = rndVar.X;
            float[] fArr5 = rndVar.W;
            o3c.a aVar = o3cVar2.b;
            if (aVar == null) {
                return;
            }
            int i2 = o3cVar2.a;
            GLES20.glUniformMatrix3fv(o3cVar2.e, 1, false, i2 == 1 ? o3c.j : i2 == 2 ? o3c.k : o3c.i, 0);
            GLES20.glUniformMatrix4fv(o3cVar2.d, 1, false, fArr5, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(o3cVar2.h, 0);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e3) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(o3cVar2.f, 3, 5126, false, 12, (Buffer) aVar.b);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e4) {
                Log.e("ProjectionRenderer", "Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(o3cVar2.g, 2, 5126, false, 8, (Buffer) aVar.c);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e5) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(aVar.d, 0, aVar.a);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e6) {
                Log.e("ProjectionRenderer", "Failed to render", e6);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            fpe fpeVar = fpe.this;
            fpeVar.e.post(new eq2(2, fpeVar, this.a.b()));
        }
    }

    public interface b {
        void g(Surface surface);

        void m();
    }

    public fpe(Context context) {
        super(context, null);
        this.a = new CopyOnWriteArrayList<>();
        this.e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        rnd rndVar = new rnd();
        this.f = rndVar;
        a aVar = new a(rndVar);
        View.OnTouchListener hpfVar = new hpf(context, aVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.d = new fwa(windowManager.getDefaultDisplay(), hpfVar, aVar);
        this.a0 = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(hpfVar);
    }

    public final void a() {
        boolean z = this.a0 && this.b0;
        Sensor sensor = this.c;
        if (sensor == null || z == this.c0) {
            return;
        }
        fwa fwaVar = this.d;
        SensorManager sensorManager = this.b;
        if (z) {
            sensorManager.registerListener(fwaVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(fwaVar);
        }
        this.c0 = z;
    }

    public cw1 getCameraMotionListener() {
        return this.f;
    }

    public rng getVideoFrameMetadataListener() {
        return this.f;
    }

    public Surface getVideoSurface() {
        return this.W;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new dq2(this, 4));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.b0 = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.b0 = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.f.Z = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.a0 = z;
        a();
    }
}
