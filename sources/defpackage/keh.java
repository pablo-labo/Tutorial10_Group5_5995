package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class keh {
    public static keh d;
    public final yte a;
    public GoogleSignInAccount b;
    public GoogleSignInOptions c;

    public keh(Context context) {
        String strD;
        yte yteVarA = yte.a(context);
        this.a = yteVarA;
        this.b = yteVarA.b();
        String strD2 = yteVarA.d("defaultGoogleSignInAccount");
        GoogleSignInOptions googleSignInOptionsS0 = null;
        if (!TextUtils.isEmpty(strD2) && (strD = yteVarA.d(yte.f("googleSignInOptions", strD2))) != null) {
            try {
                googleSignInOptionsS0 = GoogleSignInOptions.s0(strD);
            } catch (JSONException unused) {
            }
        }
        this.c = googleSignInOptionsS0;
    }

    public static synchronized keh a(Context context) {
        keh kehVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (keh.class) {
            kehVar = d;
            if (kehVar == null) {
                kehVar = new keh(applicationContext);
                d = kehVar;
            }
        }
        return kehVar;
        return kehVar;
    }

    public final synchronized void b() {
        yte yteVar = this.a;
        ReentrantLock reentrantLock = yteVar.a;
        reentrantLock.lock();
        try {
            yteVar.b.edit().clear().apply();
            reentrantLock.unlock();
            this.b = null;
            this.c = null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
