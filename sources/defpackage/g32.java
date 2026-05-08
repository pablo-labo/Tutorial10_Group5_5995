package defpackage;

import android.content.Context;
import android.util.Log;
import com.facebook.soloader.a;
import com.facebook.soloader.g;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class g32 implements ntc {
    public final Context a;

    public g32(Context context) {
        this.a = context;
    }

    @Override // defpackage.ntc
    public final boolean b(UnsatisfiedLinkError unsatisfiedLinkError, ene[] eneVarArr) {
        if (!(unsatisfiedLinkError instanceof dne)) {
            return false;
        }
        Log.e("SoLoader", "Checking /data/app missing libraries.");
        File file = new File(this.a.getApplicationInfo().nativeLibraryDir);
        if (!file.exists()) {
            Log.e("SoLoader", "Native library directory " + file + " does not exist, exiting /data/app recovery.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int length = eneVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            ene eneVar = eneVarArr[i];
            if (eneVar instanceof a) {
                a aVar = (a) eneVar;
                try {
                    for (g.b bVar : aVar.g()) {
                        if (!new File(file, bVar.a).exists()) {
                            arrayList.add(bVar.a);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        Log.e("SoLoader", "No libraries missing from " + file);
                        return false;
                    }
                    Log.e("SoLoader", "Missing libraries from " + file + ": " + arrayList.toString() + ", will run prepare on tbe backup so source");
                    aVar.e(0);
                } catch (Exception e) {
                    Log.e("SoLoader", "Encountered an exception while recovering from /data/app failure ", e);
                    return false;
                }
            } else {
                i++;
            }
        }
        for (ene eneVar2 : eneVarArr) {
            if ((eneVar2 instanceof p54) && !(eneVar2 instanceof a)) {
                p54 p54Var = (p54) eneVar2;
                p54Var.b = 1 | p54Var.b;
            }
        }
        Log.e("SoLoader", "Successfully recovered from /data/app disk failure.");
        return true;
    }
}
