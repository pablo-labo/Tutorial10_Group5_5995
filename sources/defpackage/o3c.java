package defpackage;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.b;
import defpackage.m3c;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class o3c {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public a b;
    public b c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public static class a {
        public final int a;
        public final FloatBuffer b;
        public final FloatBuffer c;
        public final int d;

        public a(m3c.b bVar) {
            float[] fArr = bVar.c;
            this.a = fArr.length / 3;
            this.b = GlUtil.d(fArr);
            this.c = GlUtil.d(bVar.d);
            int i = bVar.b;
            if (i == 1) {
                this.d = 5;
            } else if (i != 2) {
                this.d = 4;
            } else {
                this.d = 6;
            }
        }
    }

    public static boolean b(m3c m3cVar) {
        m3c.a aVar = m3cVar.a;
        m3c.a aVar2 = m3cVar.b;
        m3c.b[] bVarArr = aVar.a;
        if (bVarArr.length == 1 && bVarArr[0].a == 0) {
            m3c.b[] bVarArr2 = aVar2.a;
            if (bVarArr2.length == 1 && bVarArr2[0].a == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            b bVar = new b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.c = bVar;
            this.d = GLES20.glGetUniformLocation(bVar.a, "uMvpMatrix");
            this.e = GLES20.glGetUniformLocation(this.c.a, "uTexMatrix");
            this.f = this.c.b("aPosition");
            this.g = this.c.b("aTexCoords");
            this.h = GLES20.glGetUniformLocation(this.c.a, "uTexture");
        } catch (GlUtil.GlException e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
