package defpackage;

import android.os.AsyncTask;
import defpackage.i34;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class t24 extends AsyncTask<Void, Void, Void> {
    public final /* synthetic */ i34.b a;
    public final /* synthetic */ String b;
    public final /* synthetic */ m24 c;

    public t24(i34.b bVar, String str, m24 m24Var) {
        this.a = bVar;
        this.b = str;
        this.c = m24Var;
    }

    @Override // android.os.AsyncTask
    public final Void doInBackground(Void[] voidArr) {
        voidArr.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i34.b bVar = this.a;
        linkedHashMap.put("reload", new r24(bVar));
        linkedHashMap.put("devMenu", new s24(bVar));
        linkedHashMap.putAll(new s95().d);
        hh2 hh2Var = new hh2(bVar);
        m24 m24Var = this.c;
        xo7 xo7Var = new xo7(this.b, m24Var.c, linkedHashMap, hh2Var);
        xo7Var.b.g();
        m24Var.h = xo7Var;
        return null;
    }
}
