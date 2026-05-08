package defpackage;

import android.content.Context;
import android.util.Log;
import com.facebook.soloader.NoBaseApkException;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class c32 implements ntc {
    public final Context a;
    public final q81 b;

    public c32(Context context, q81 q81Var) {
        this.a = context;
        this.b = q81Var;
    }

    @Override // defpackage.ntc
    public final boolean b(UnsatisfiedLinkError unsatisfiedLinkError, ene[] eneVarArr) {
        String str = this.a.getApplicationInfo().sourceDir;
        if (!new File(str).exists()) {
            StringBuilder sbM = akb.m("Base apk does not exist: ", str, ". ");
            this.b.b(sbM);
            throw new NoBaseApkException(sbM.toString(), unsatisfiedLinkError);
        }
        Log.w("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
        return false;
    }
}
