package defpackage;

import android.os.Bundle;
import defpackage.qa5;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ra5 extends fq5 {
    public long b;
    public final /* synthetic */ qa5.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra5(to1 to1Var, qa5.c cVar) {
        super(to1Var);
        this.c = cVar;
    }

    @Override // defpackage.fq5, defpackage.pne
    public final long f1(zn1 zn1Var, long j) {
        zn1Var.getClass();
        long jF1 = this.a.f1(zn1Var, j);
        long j2 = this.b + (jF1 != -1 ? jF1 : 0L);
        this.b = j2;
        qa5.c cVar = this.c;
        qa5.m mVar = cVar.d;
        ResponseBody responseBody = cVar.c;
        long d = responseBody != null ? responseBody.getD() : -1L;
        mVar.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        String str = mVar.b;
        long j3 = j2 + (str != null ? Long.parseLong(str) : 0L);
        long j4 = d + (str != null ? Long.parseLong(str) : 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis <= mVar.a + 100 && j3 != j4) {
            return jF1;
        }
        mVar.a = jCurrentTimeMillis;
        bundle2.putDouble("totalBytesWritten", j3);
        bundle2.putDouble("totalBytesExpectedToWrite", j4);
        bundle.putString("uuid", mVar.c);
        bundle.putBundle("data", bundle2);
        mVar.d.d("expo-file-system.downloadProgress", bundle);
        return jF1;
    }
}
