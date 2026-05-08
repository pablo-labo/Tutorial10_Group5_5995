package defpackage;

import com.indeed.android.backendservices.data.IndeedAppDatabase_Impl;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class ida implements Callable<j6g> {
    public final /* synthetic */ wda a;

    public ida(wda wdaVar) {
        this.a = wdaVar;
    }

    @Override // java.util.concurrent.Callable
    public final j6g call() {
        wda wdaVar = this.a;
        vda vdaVar = wdaVar.j;
        IndeedAppDatabase_Impl indeedAppDatabase_Impl = wdaVar.a;
        zze zzeVarC = vdaVar.c();
        try {
            indeedAppDatabase_Impl.c();
            try {
                zzeVarC.J();
                indeedAppDatabase_Impl.w();
                return j6g.a;
            } finally {
                indeedAppDatabase_Impl.s();
            }
        } finally {
            vdaVar.g(zzeVarC);
        }
    }
}
