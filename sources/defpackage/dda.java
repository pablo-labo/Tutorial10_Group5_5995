package defpackage;

import com.indeed.android.backendservices.data.IndeedAppDatabase_Impl;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class dda implements Callable<j6g> {
    public final /* synthetic */ List a;
    public final /* synthetic */ wda b;

    public dda(wda wdaVar, List list) {
        this.b = wdaVar;
        this.a = list;
    }

    @Override // java.util.concurrent.Callable
    public final j6g call() throws Throwable {
        wda wdaVar = this.b;
        IndeedAppDatabase_Impl indeedAppDatabase_Impl = wdaVar.a;
        indeedAppDatabase_Impl.c();
        try {
            wdaVar.f.i(this.a);
            indeedAppDatabase_Impl.w();
            return j6g.a;
        } finally {
            indeedAppDatabase_Impl.s();
        }
    }
}
