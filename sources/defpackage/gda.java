package defpackage;

import com.indeed.android.backendservices.data.IndeedAppDatabase_Impl;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class gda implements Callable<j6g> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ wda c;

    public gda(wda wdaVar, boolean z, String str) {
        this.c = wdaVar;
        this.a = z;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final j6g call() {
        wda wdaVar = this.c;
        uda udaVar = wdaVar.i;
        IndeedAppDatabase_Impl indeedAppDatabase_Impl = wdaVar.a;
        zze zzeVarC = udaVar.c();
        zzeVarC.q(1, this.a ? 1L : 0L);
        zzeVarC.n(2, this.b);
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
            udaVar.g(zzeVarC);
        }
    }
}
