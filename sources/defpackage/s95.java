package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import defpackage.xo7;
import java.io.FileInputStream;
import java.util.LinkedHashMap;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class s95 implements Runnable {
    public static final String e = xo7.class.getSimpleName();
    public int a = 1;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d;

    public static final class a extends ula {
        public a() {
        }

        @Override // defpackage.ula, defpackage.d4d
        public final void b(Object obj, xo7.a aVar) {
            JSONObject jSONObject;
            s95 s95Var = s95.this;
            synchronized (s95Var.c) {
                try {
                    try {
                        jSONObject = (JSONObject) obj;
                    } catch (Exception e) {
                        aVar.a(e.toString());
                    }
                    if (jSONObject == null) {
                        throw new Exception("params must be an object { mode: string, filename: string }");
                    }
                    String strOptString = jSONObject.optString("mode");
                    if (strOptString == null) {
                        throw new Exception("missing params.mode");
                    }
                    String strOptString2 = jSONObject.optString(BatchMetricsDispatcher.FILE_NAME);
                    if (strOptString2 == null) {
                        throw new Exception("missing params.filename");
                    }
                    if (!strOptString.equals("r")) {
                        throw new IllegalArgumentException("unsupported mode: ".concat(strOptString).toString());
                    }
                    aVar.b(Integer.valueOf(s95.a(s95Var, strOptString2)));
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class b extends ula {
        public b() {
        }

        @Override // defpackage.ula, defpackage.d4d
        public final void b(Object obj, xo7.a aVar) {
            s95 s95Var = s95.this;
            synchronized (s95Var.c) {
                try {
                    try {
                    } catch (Exception e) {
                        aVar.a(e.toString());
                    }
                    if (!(obj instanceof Number)) {
                        throw new Exception("params must be a file handle");
                    }
                    d dVar = (d) s95Var.c.get(obj);
                    if (dVar == null) {
                        throw new Exception("invalid file handle, it might have timed out");
                    }
                    pxf.b(s95Var.c).remove(obj);
                    dVar.a.close();
                    aVar.b("");
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class c extends ula {
        public c() {
        }

        @Override // defpackage.ula, defpackage.d4d
        public final void b(Object obj, xo7.a aVar) {
            JSONObject jSONObject;
            s95 s95Var = s95.this;
            synchronized (s95Var.c) {
                try {
                    try {
                        jSONObject = (JSONObject) obj;
                    } catch (Exception e) {
                        aVar.a(e.toString());
                    }
                    if (jSONObject == null) {
                        throw new Exception("params must be an object { file: handle, size: number }");
                    }
                    int iOptInt = jSONObject.optInt("file");
                    if (iOptInt == 0) {
                        throw new Exception("invalid or missing file handle");
                    }
                    int iOptInt2 = jSONObject.optInt("size");
                    if (iOptInt2 == 0) {
                        throw new Exception("invalid or missing read size");
                    }
                    d dVar = (d) s95Var.c.get(Integer.valueOf(iOptInt));
                    if (dVar == null) {
                        throw new Exception("invalid file handle, it might have timed out");
                    }
                    dVar.b = System.currentTimeMillis() + 30000;
                    byte[] bArr = new byte[iOptInt2];
                    String strEncodeToString = Base64.encodeToString(bArr, 0, dVar.a.read(bArr), 0);
                    strEncodeToString.getClass();
                    aVar.b(strEncodeToString);
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class d {
        public final FileInputStream a;
        public long b = System.currentTimeMillis() + 30000;

        public d(String str) {
            this.a = new FileInputStream(str);
        }
    }

    public s95() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.d = linkedHashMap;
        linkedHashMap.put("fopen", new a());
        linkedHashMap.put("fclose", new b());
        linkedHashMap.put("fread", new c());
    }

    public static final int a(s95 s95Var, String str) {
        int i = s95Var.a;
        s95Var.a = i + 1;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = s95Var.c;
        linkedHashMap.put(numValueOf, new d(str));
        if (linkedHashMap.size() == 1) {
            s95Var.b.postDelayed(s95Var, 30000L);
        }
        return i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            try {
                Set setEntrySet = this.c.entrySet();
                vg vgVar = new vg(8);
                setEntrySet.getClass();
                w92.A0(setEntrySet, vgVar, true);
                if (!this.c.isEmpty()) {
                    this.b.postDelayed(this, 30000L);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
