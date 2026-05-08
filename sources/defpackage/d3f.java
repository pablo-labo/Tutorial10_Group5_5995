package defpackage;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;
import com.facebook.soloader.SysUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class d3f extends ene {
    @Override // defpackage.ene
    public final String c() {
        return "SystemLoadWrapperSoSource";
    }

    @Override // defpackage.ene
    @SuppressLint({"CatchGeneralException"})
    public final int d(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception e) {
            Log.e("SoLoader", "Error loading library: " + str, e);
            return 0;
        }
    }

    @Override // defpackage.ene
    public final String toString() {
        return "SystemLoadWrapperSoSource[" + SysUtil.getClassLoaderLdLoadLibrary() + "]";
    }
}
