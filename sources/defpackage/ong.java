package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.b;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class ong extends GLSurfaceView implements qng {
    public static final /* synthetic */ int b = 0;
    public final a a;

    public static final class a implements GLSurfaceView.Renderer {
        public static final float[] Y = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        public static final String[] Z = {"y_tex", "u_tex", "v_tex"};
        public static final FloatBuffer a0 = GlUtil.d(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        public b V;
        public int W;
        public png X;
        public final ong a;
        public final int[] b = new int[3];
        public final int[] c = new int[3];
        public final int[] d = new int[3];
        public final int[] e = new int[3];
        public final AtomicReference<png> f = new AtomicReference<>();

        public a(ong ongVar) {
            this.a = ongVar;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.d;
                this.e[i] = -1;
                iArr[i] = -1;
            }
        }

        @RequiresNonNull({"program"})
        public final void a() {
            int[] iArr = this.b;
            try {
                GLES20.glGenTextures(3, iArr, 0);
                for (int i = 0; i < 3; i++) {
                    b bVar = this.V;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(bVar.a, Z[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    GlUtil.a(3553, iArr[i]);
                }
                GlUtil.b();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            png andSet = this.f.getAndSet(null);
            if (andSet == null && this.X == null) {
                return;
            }
            if (andSet != null) {
                png pngVar = this.X;
                if (pngVar != null) {
                    pngVar.getClass();
                    throw null;
                }
                this.X = andSet;
            }
            this.X.getClass();
            GLES20.glUniformMatrix3fv(this.W, 1, false, Y, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.c;
            try {
                b bVar = new b("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.V = bVar;
                GLES20.glVertexAttribPointer(bVar.b("in_pos"), 2, 5126, false, 0, (Buffer) a0);
                iArr[0] = this.V.b("in_tc_y");
                iArr[1] = this.V.b("in_tc_u");
                iArr[2] = this.V.b("in_tc_v");
                this.W = GLES20.glGetUniformLocation(this.V.a, "mColorConversion");
                GlUtil.b();
                a();
                GlUtil.b();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e);
            }
        }
    }

    public ong(Context context) {
        super(context, null);
        a aVar = new a(this);
        this.a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public qng getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(png pngVar) {
        a aVar = this.a;
        if (aVar.f.getAndSet(pngVar) != null) {
            throw null;
        }
        aVar.a.requestRender();
    }
}
