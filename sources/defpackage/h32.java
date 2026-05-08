package defpackage;

import android.util.Log;
import com.facebook.soloader.a;
import com.facebook.soloader.g;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class h32 implements ntc {
    @Override // defpackage.ntc
    public final boolean b(UnsatisfiedLinkError unsatisfiedLinkError, ene[] eneVarArr) {
        if (!(unsatisfiedLinkError instanceof dne)) {
            return false;
        }
        Log.e("SoLoader", "Checking /data/data missing libraries.");
        boolean z = false;
        for (ene eneVar : eneVarArr) {
            if ((eneVar instanceof g) && !(eneVar instanceof a)) {
                g gVar = (g) eneVar;
                try {
                    g.b[] bVarArrG = gVar.g();
                    int length = bVarArrG.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            g.b bVar = bVarArrG[i];
                            File file = new File(gVar.a, bVar.a);
                            if (!file.exists()) {
                                file = null;
                            }
                            if (file == null) {
                                Log.e("SoLoader", "Missing " + bVar.a + " from " + gVar.c() + ", will force prepare.");
                                gVar.e(2);
                                z = true;
                                break;
                            }
                            i++;
                        }
                    }
                } catch (Exception e) {
                    Log.e("SoLoader", "Encountered an exception while recovering from /data/data failure ", e);
                    return false;
                }
            }
        }
        if (z) {
            Log.e("SoLoader", "Successfully recovered from /data/data disk failure.");
            return true;
        }
        Log.e("SoLoader", "No libraries missing from unpacking so paths while recovering /data/data failure");
        return false;
    }
}
