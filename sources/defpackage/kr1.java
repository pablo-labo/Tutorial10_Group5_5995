package defpackage;

import android.util.Log;
import defpackage.fx9;
import defpackage.ke3;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class kr1 implements fx9<File, ByteBuffer> {

    public static final class a implements ke3<ByteBuffer> {
        public final File a;

        public a(File file) {
            this.a = file;
        }

        @Override // defpackage.ke3
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // defpackage.ke3
        public final void b() {
        }

        @Override // defpackage.ke3
        public final void cancel() {
        }

        @Override // defpackage.ke3
        public final void d(knb knbVar, ke3.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(pr1.a(this.a));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.c(e);
            }
        }

        @Override // defpackage.ke3
        public final xe3 e() {
            return xe3.a;
        }
    }

    public static class b implements gx9<File, ByteBuffer> {
        @Override // defpackage.gx9
        public final fx9<File, ByteBuffer> c(n1a n1aVar) {
            return new kr1();
        }
    }

    @Override // defpackage.fx9
    public final fx9.a<ByteBuffer> a(File file, int i, int i2, ova ovaVar) {
        File file2 = file;
        return new fx9.a<>(new nna(file2), new a(file2));
    }

    @Override // defpackage.fx9
    public final /* bridge */ /* synthetic */ boolean b(File file) {
        return true;
    }
}
