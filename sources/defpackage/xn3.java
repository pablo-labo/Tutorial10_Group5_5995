package defpackage;

import android.content.Context;
import android.os.UserManager;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.hh6;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class xn3 implements gh6, hh6 {
    public final wn3 a;
    public final Context b;
    public final j6c<bjg> c;
    public final Set<fh6> d;
    public final Executor e;

    public xn3() {
        throw null;
    }

    public xn3(Context context, String str, Set<fh6> set, j6c<bjg> j6cVar, Executor executor) {
        this.a = new wn3(context, str);
        this.d = set;
        this.e = executor;
        this.c = j6cVar;
        this.b = context;
    }

    @Override // defpackage.gh6
    public final Task<String> a() {
        if (!((UserManager) this.b.getSystemService(UserManager.class)).isUserUnlocked()) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new Callable() { // from class: vn3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                xn3 xn3Var = this.a;
                synchronized (xn3Var) {
                    try {
                        ih6 ih6Var = (ih6) xn3Var.a.get();
                        ArrayList arrayListC = ih6Var.c();
                        ih6Var.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListC.size(); i++) {
                            jh6 jh6Var = (jh6) arrayListC.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", jh6Var.b());
                            jSONObject.put("dates", new JSONArray((Collection) jh6Var.a()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return string;
            }
        });
    }

    @Override // defpackage.hh6
    public final synchronized hh6.a b() {
        boolean zG;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ih6 ih6Var = (ih6) this.a.get();
        synchronized (ih6Var) {
            zG = ih6Var.g(jCurrentTimeMillis);
        }
        if (!zG) {
            return hh6.a.NONE;
        }
        synchronized (ih6Var) {
            String strD = ih6Var.d(System.currentTimeMillis());
            ih6Var.a.edit().putString("last-used-date", strD).commit();
            ih6Var.f(strD);
        }
        return hh6.a.GLOBAL;
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!((UserManager) this.b.getSystemService(UserManager.class)).isUserUnlocked()) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new Callable() { // from class: un3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    xn3 xn3Var = this.a;
                    synchronized (xn3Var) {
                        ((ih6) xn3Var.a.get()).h(System.currentTimeMillis(), xn3Var.c.get().a());
                    }
                    return null;
                }
            });
        }
    }
}
