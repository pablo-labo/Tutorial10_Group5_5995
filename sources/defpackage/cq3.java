package defpackage;

import android.graphics.Bitmap;
import androidx.media3.session.LegacyConversions;
import androidx.media3.session.n;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cq3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cq3(fq3 fq3Var, v31 v31Var, htf htfVar, y21 y21Var) {
        this.b = fq3Var;
        this.c = v31Var;
        this.d = htfVar;
        this.e = y21Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                fq3 fq3Var = (fq3) obj4;
                v31 v31Var = (v31) obj3;
                String str = v31Var.a;
                htf htfVar = (htf) obj2;
                y21 y21Var = (y21) obj;
                Logger logger = fq3.f;
                try {
                    zsf zsfVarA = fq3Var.c.a(str);
                    if (zsfVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        htfVar.b(new IllegalArgumentException(str2));
                    } else {
                        fq3Var.e.h(new dq3(fq3Var, v31Var, zsfVarA.a(y21Var)));
                        htfVar.b(null);
                    }
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    htfVar.b(e);
                    return;
                }
                break;
            default:
                e47 e47Var = (e47) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ebe ebeVar = (ebe) obj;
                if (((AtomicInteger) obj4).incrementAndGet() == e47Var.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        hz8 hz8Var = (hz8) arrayList.get(i2);
                        if (hz8Var != null) {
                            try {
                                bitmap = (Bitmap) aw5.J1(hz8Var);
                            } catch (CancellationException | ExecutionException e2) {
                                zkd.v("MLSLegacyStub", "Failed to get bitmap", e2);
                                bitmap = null;
                            }
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(LegacyConversions.a((ij9) e47Var.get(i2), bitmap));
                    }
                    ebeVar.l(arrayList2);
                }
                break;
        }
    }

    public /* synthetic */ cq3(n nVar, AtomicInteger atomicInteger, e47 e47Var, ArrayList arrayList, ebe ebeVar) {
        this.b = atomicInteger;
        this.c = e47Var;
        this.d = arrayList;
        this.e = ebeVar;
    }
}
