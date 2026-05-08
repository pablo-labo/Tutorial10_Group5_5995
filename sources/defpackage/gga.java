package defpackage;

import android.content.Context;
import java.io.InputStream;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class gga implements zfe {
    public final Object a;

    public gga(int i) {
        this.a = new ReentrantLock();
    }

    public p79 a(Context context, InputStream inputStream, String str, String str2) {
        if (str == null) {
            str = "application/json";
        }
        if (!str.contains("application/zip") && !str.contains("application/x-zip") && !str.contains("application/x-zip-compressed")) {
            throw null;
        }
        a49.a();
        n95 n95Var = n95.ZIP;
        if (str2 != null) {
            nfa.d(n95Var, true);
            throw null;
        }
        p79<s69> p79VarE = z69.e(context, new ZipInputStream(inputStream), null);
        if (str2 == null || p79VarE.a == null) {
            return p79VarE;
        }
        nfa.d(n95Var, true);
        throw null;
    }

    @Override // defpackage.zfe
    public void lock() {
        ((ReentrantLock) this.a).lock();
    }

    @Override // defpackage.zfe
    public void unlock() {
        ((ReentrantLock) this.a).unlock();
    }

    public gga(nfa nfaVar, q92 q92Var) {
        this.a = nfaVar;
    }
}
