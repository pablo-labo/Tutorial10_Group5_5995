package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.TrafficStats;
import defpackage.r05;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jpa implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jpa(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        r05 r05Var;
        switch (this.a) {
            case 0:
                kpa kpaVar = (kpa) this.b;
                Request request = (Request) this.c;
                String str = kpaVar.a;
                int i = -1;
                try {
                    c49.e(str, "Sending request: %s", request);
                    TrafficStats.setThreadStatsTag(1);
                    OkHttpClient okHttpClient = kpaVar.g;
                    Response responseB = okHttpClient != null ? new RealCall(okHttpClient, request, false).b() : null;
                    if (responseB != null) {
                        ResponseBody responseBody = responseB.V;
                        if (responseBody != null) {
                            responseBody.close();
                        }
                        i = responseB.d;
                    }
                    break;
                } catch (IOException e) {
                    c49.b(str, "Request sending failed: %s", e.toString());
                }
                return Integer.valueOf(i);
            default:
                gid gidVar = (gid) this.b;
                Context context = (Context) this.c;
                context.getClass();
                synchronized (r05.a) {
                    HashMap<String, r05> map = r05.b;
                    if (map.containsKey("appTracker")) {
                        r05 r05Var2 = map.get("appTracker");
                        r05Var2.getClass();
                        r05Var = r05Var2;
                    } else {
                        String str2 = "snowplowEvents-" + new pxc("[^a-zA-Z0-9_]+").e("appTracker", "-") + ".sqlite";
                        r05.a.a(context, str2);
                        Context applicationContext = context.getApplicationContext();
                        applicationContext.getClass();
                        r05 r05Var3 = new r05(applicationContext, str2, null, 1);
                        map.put("appTracker", r05Var3);
                        r05Var = r05Var3;
                    }
                }
                gidVar.c = r05Var;
                if (!gidVar.e()) {
                    r05 r05Var4 = gidVar.c;
                    SQLiteDatabase writableDatabase = r05Var4 != null ? r05Var4.getWritableDatabase() : null;
                    gidVar.b = writableDatabase;
                    if (writableDatabase != null) {
                        writableDatabase.enableWriteAheadLogging();
                    }
                }
                SQLiteDatabase sQLiteDatabase = gidVar.b;
                c49.a("gid", "DB Path: %s", sQLiteDatabase != null ? sQLiteDatabase.getPath() : null);
                return null;
        }
    }
}
