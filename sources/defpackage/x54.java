package defpackage;

import android.os.StatFs;
import defpackage.vqc;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface x54 {

    public static final class a {
        public w5b a;
        public final qd8 b = pa5.a;
        public final double c = 0.02d;
        public final long d = 10485760;
        public final long e = 262144000;
        public final no3 f;

        public a() {
            eq3 eq3Var = a74.a;
            this.f = no3.c;
        }

        public final vqc a() {
            long jE;
            w5b w5bVar = this.a;
            if (w5bVar == null) {
                r6.g("directory == null");
                return null;
            }
            double d = this.c;
            if (d > 0.0d) {
                try {
                    StatFs statFs = new StatFs(w5bVar.toFile().getAbsolutePath());
                    jE = nic.E((long) (d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.d, this.e);
                } catch (Exception unused) {
                    jE = this.d;
                }
            } else {
                jE = 0;
            }
            return new vqc(jE, this.f, this.b, w5bVar);
        }
    }

    public interface b extends Closeable {
        w5b getData();

        w5b getMetadata();

        vqc.a p1();
    }

    vqc.b a(String str);

    vqc.a b(String str);

    pa5 getFileSystem();
}
