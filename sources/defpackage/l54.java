package defpackage;

import android.os.StrictMode;
import com.facebook.soloader.SoLoader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l54 extends ene {
    public ua9 b = null;
    public HashSet c = null;
    public final String a = "base";

    @Override // defpackage.ene
    public final String c() {
        return "DirectSplitSoSource";
    }

    @Override // defpackage.ene
    public final int d(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        String strH;
        String str2;
        HashSet hashSet = this.c;
        if (hashSet == null) {
            r6.g("prepare not called");
            return 0;
        }
        if (hashSet.contains(str)) {
            HashSet hashSet2 = this.c;
            if (hashSet2 != null && this.b != null) {
                if (hashSet2.contains(str)) {
                    StringBuilder sb = new StringBuilder();
                    String str3 = this.a;
                    if (!"base".equals(str3)) {
                        String[] strArr = SoLoader.d.getApplicationInfo().splitSourceDirs;
                        if (strArr == null) {
                            r6.g("No splits avaiable");
                            return 0;
                        }
                        String strM = l5.m("split_", str3, ".apk");
                        for (String str4 : strArr) {
                            if (str4.endsWith(strM)) {
                                str2 = str4;
                            }
                        }
                        r6.g(l5.m("Could not find ", str3, " split"));
                        return 0;
                    }
                    str2 = SoLoader.d.getApplicationInfo().sourceDir;
                    sb.append(str2);
                    sb.append("!/lib/");
                    strH = m6.h(sb, (String) this.b.b, "/", str);
                } else {
                    strH = null;
                }
                strH.getClass();
                System.load(strH);
                return 1;
            }
            r6.g("prepare not called");
        }
        return 0;
    }

    @Override // defpackage.ene
    public final void e(int i) throws IOException {
        InputStream inputStreamOpen = SoLoader.d.getAssets().open(this.a + ".soloader-manifest");
        try {
            this.b = ua9.b(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            this.c = new HashSet((List) this.b.a);
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
