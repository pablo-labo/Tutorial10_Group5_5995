package defpackage;

import android.os.StrictMode;
import com.facebook.soloader.SoLoader;
import com.facebook.soloader.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class p54 extends ene {
    public final File a;
    public int b;
    public final List<String> c = Arrays.asList(new String[0]);

    public p54(File file, int i) {
        this.a = file;
        this.b = i;
    }

    @Override // defpackage.ene
    public String c() {
        return "DirectorySoSource";
    }

    @Override // defpackage.ene
    public int d(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.b == null) {
            r6.g("SoLoader.init() not yet called");
            return 0;
        }
        boolean zContains = this.c.contains(str);
        File file = this.a;
        if (zContains) {
            StringBuilder sbG = h5.g(str, " is on the denyList, skip loading from ");
            sbG.append(file.getCanonicalPath());
            p39.a(sbG.toString());
            return 0;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2 = null;
        }
        if (file2 == null) {
            StringBuilder sbG2 = h5.g(str, " file not found on ");
            sbG2.append(file.getCanonicalPath());
            p39.b("SoLoader", sbG2.toString());
            return 0;
        }
        String canonicalPath = file2.getCanonicalPath();
        p39.a(str + " file found at " + canonicalPath);
        if ((i & 1) != 0 && (this.b & 2) != 0) {
            p39.a(str + " loaded implicitly");
            return 2;
        }
        if ((this.b & 1) != 0) {
            wp4 wp4Var = new wp4();
            wp4Var.a = file2;
            FileInputStream fileInputStream = new FileInputStream(file2);
            wp4Var.b = fileInputStream;
            wp4Var.c = fileInputStream.getChannel();
            try {
                f.b(str, wp4Var, i, threadPolicy);
                wp4Var.close();
            } catch (Throwable th) {
                try {
                    wp4Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            p39.a("Not resolving dependencies for " + str);
        }
        try {
            SoLoader.b.h(i, canonicalPath);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            throw ewa.r(str, e);
        }
    }

    @Override // defpackage.ene
    public String toString() {
        String name;
        File file = this.a;
        try {
            name = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            name = file.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c());
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        return k6.h(sb, this.b, ']');
    }
}
