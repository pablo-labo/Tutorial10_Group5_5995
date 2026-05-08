package defpackage;

import com.indeed.android.backendservices.data.IndeedAppDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class bda implements Callable<j6g> {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ wda b;

    public bda(wda wdaVar, ArrayList arrayList) {
        this.b = wdaVar;
        this.a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final j6g call() throws Throwable {
        wda wdaVar = this.b;
        IndeedAppDatabase_Impl indeedAppDatabase_Impl = wdaVar.a;
        indeedAppDatabase_Impl.c();
        try {
            wdaVar.d.i(this.a);
            indeedAppDatabase_Impl.w();
            return j6g.a;
        } finally {
            indeedAppDatabase_Impl.s();
        }
    }
}
