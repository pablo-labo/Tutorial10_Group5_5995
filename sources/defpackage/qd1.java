package defpackage;

import android.os.Trace;
import com.datadog.android.api.storage.datastore.DataStoreReadCallback;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.datadog.android.core.internal.persistence.datastore.DataStoreFileHandler;
import defpackage.pn5;
import defpackage.wle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qd1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qd1(tjf tjfVar, vl8 vl8Var, String str, iy3 iy3Var, pn5.a aVar) {
        this.c = tjfVar;
        this.d = vl8Var;
        this.b = str;
        this.e = iy3Var;
        this.f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                tjf tjfVar = (tjf) obj4;
                vl8 vl8Var = (vl8) obj3;
                String str = this.b;
                iy3 iy3Var = (iy3) obj2;
                pn5.a aVar = (pn5.a) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    wle.e.getClass();
                    d4a d4aVarG = wle.a.g(null, null);
                    try {
                        wle wleVarJ = d4aVarG.j();
                        try {
                            tjf tjfVarY = web.y(tjfVar, vl8Var);
                            zr4 zr4Var = zr4.a;
                            new k80(str, tjfVarY, zr4Var, zr4Var, aVar, iy3Var).b();
                            j6g j6gVar = j6g.a;
                            d4aVarG.w().a();
                            return;
                        } finally {
                            wle.q(wleVarJ);
                        }
                    } finally {
                    }
                } finally {
                    Trace.endSection();
                }
            default:
                DataStoreFileHandler.value$lambda$3((DataStoreFileHandler) obj4, this.b, (Deserializer) obj3, (Integer) obj2, (DataStoreReadCallback) obj);
                return;
        }
    }

    public /* synthetic */ qd1(DataStoreFileHandler dataStoreFileHandler, String str, Deserializer deserializer, Integer num, DataStoreReadCallback dataStoreReadCallback) {
        this.c = dataStoreFileHandler;
        this.b = str;
        this.d = deserializer;
        this.e = num;
        this.f = dataStoreReadCallback;
    }
}
