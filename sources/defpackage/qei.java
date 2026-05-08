package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Parcel;
import android.util.Log;
import coil.memory.MemoryCache;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.hi7;
import defpackage.u3b;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class qei implements n0d {
    public final Object a;

    @VisibleForTesting
    public qei(Context context) {
        fib.i(context);
        Context applicationContext = context.getApplicationContext();
        fib.i(applicationContext);
        this.a = applicationContext;
    }

    public static nye c(hi7.a aVar, v27 v27Var, MemoryCache.Key key, MemoryCache.a aVar2) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(v27Var.a.getResources(), aVar2.a);
        Map<String, Object> map = aVar2.b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = m.a;
        if ((aVar instanceof mrc) && ((mrc) aVar).g) {
            z = true;
        }
        return new nye(bitmapDrawable, v27Var, ze3.a, key, str, zBooleanValue, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4 A[PHI: r17
  0x00e4: PHI (r17v2 double) = (r17v1 double), (r17v1 double), (r17v3 double) binds: [B:60:0x00e1, B:55:0x00d5, B:48:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public coil.memory.MemoryCache.a a(defpackage.v27 r17, coil.memory.MemoryCache.Key r18, defpackage.hie r19, defpackage.tmd r20) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qei.a(v27, coil.memory.MemoryCache$Key, hie, tmd):coil.memory.MemoryCache$a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n0d
    public void accept(Object obj, Object obj2) {
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) this.a;
        cdh cdhVar = new cdh((TaskCompletionSource) obj2);
        xch xchVar = (xch) ((cfh) obj).i();
        Parcel parcelC = xchVar.c();
        int i = rdh.a;
        parcelC.writeStrongBinder(cdhVar);
        rdh.c(parcelC, savePasswordRequest);
        xchVar.e(parcelC, 2);
    }

    public MemoryCache.Key b(v27 v27Var, Object obj, qva qvaVar, bz4 bz4Var) {
        String strA;
        Map linkedHashMap;
        List<qrf> list = v27Var.e;
        List<Pair<kh8<? extends Object>, Class<? extends Object>>> list2 = ((frc) this.a).e.c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strA = null;
                break;
            }
            Pair<kh8<? extends Object>, Class<? extends Object>> pair = list2.get(i);
            kh8<? extends Object> kh8VarA = pair.a();
            if (pair.b().isAssignableFrom(obj.getClass())) {
                kh8VarA.getClass();
                strA = kh8VarA.a(obj, qvaVar);
                if (strA != null) {
                    break;
                }
            }
            i++;
        }
        if (strA == null) {
            return null;
        }
        Map<String, u3b.b> map = v27Var.w.a;
        boolean zIsEmpty = map.isEmpty();
        bs4 bs4Var = bs4.a;
        if (zIsEmpty) {
            linkedHashMap = bs4Var;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<String, u3b.b>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().getClass();
            }
        }
        if (list.isEmpty() && linkedHashMap.isEmpty()) {
            return new MemoryCache.Key(strA, bs4Var);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        if (!list.isEmpty()) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedHashMap2.put(p6.c(i2, "coil#transformation_"), list.get(i2).a());
            }
            linkedHashMap2.put("coil#transformation_size", qvaVar.c.toString());
        }
        return new MemoryCache.Key(strA, linkedHashMap2);
    }

    public JSONObject d() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(wc2.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        wc2.b(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    wc2.b(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            wc2.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            wc2.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public /* synthetic */ qei(ddh ddhVar, SavePasswordRequest savePasswordRequest) {
        this.a = savePasswordRequest;
    }

    public qei(frc frcVar, r33 r33Var) {
        this.a = frcVar;
    }

    public qei(oa5 oa5Var) {
        this.a = new File(oa5Var.b, "com.crashlytics.settings.json");
    }
}
