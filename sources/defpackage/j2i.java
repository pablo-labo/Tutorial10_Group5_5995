package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.measurement.internal.zzao;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class j2i implements Callable {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public j2i(txh txhVar) {
        this.b = txhVar;
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0037: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:17:0x0037 */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStreamOpenFileInput;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fei feiVar = ((h1i) obj).a;
                feiVar.F();
                fei.v(feiVar.W);
                a8i a8iVar = feiVar.W;
                a8iVar.b();
                a8iVar.a.getClass();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                txh txhVar = (txh) obj;
                String str = txhVar.b;
                Context context = txhVar.a;
                SharedPreferences sharedPreferences = txhVar.c;
                boolean z = true;
                if (sharedPreferences.getBoolean("save_legacy_configs", true)) {
                    myh myhVarI = null;
                    myhVarI = null;
                    myhVarI = null;
                    myhVarI = null;
                    myhVarI = null;
                    myhVarI = null;
                    myhVarI = null;
                    FileInputStream fileInputStream2 = null;
                    try {
                        if (context != null) {
                            try {
                                fileInputStreamOpenFileInput = context.openFileInput("persisted_config");
                            } catch (FileNotFoundException e) {
                                e = e;
                                fileInputStreamOpenFileInput = null;
                            } catch (IOException e2) {
                                e = e2;
                                fileInputStreamOpenFileInput = null;
                            } catch (Throwable th) {
                                th = th;
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException e3) {
                                        Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e3);
                                    }
                                    break;
                                }
                                throw th;
                            }
                            try {
                                myhVarI = myh.i(fileInputStreamOpenFileInput);
                                if (fileInputStreamOpenFileInput != null) {
                                    try {
                                        fileInputStreamOpenFileInput.close();
                                    } catch (IOException e4) {
                                        Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e4);
                                    }
                                }
                            } catch (FileNotFoundException e5) {
                                e = e5;
                                if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                                    Log.d("FirebaseRemoteConfig", "Persisted config file was not found.", e);
                                }
                                if (fileInputStreamOpenFileInput != null) {
                                    try {
                                        fileInputStreamOpenFileInput.close();
                                    } catch (IOException e6) {
                                        Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e6);
                                    }
                                }
                            } catch (IOException e7) {
                                e = e7;
                                Log.e("FirebaseRemoteConfig", "Cannot initialize from persisted config.", e);
                                if (fileInputStreamOpenFileInput != null) {
                                    try {
                                        fileInputStreamOpenFileInput.close();
                                    } catch (IOException e8) {
                                        Log.e("FirebaseRemoteConfig", "Failed to close persisted config file.", e8);
                                    }
                                }
                            }
                        }
                        HashMap map = new HashMap();
                        if (myhVarI != null) {
                            HashMap mapA = txh.a(myhVarI.k());
                            HashMap mapA2 = txh.a(myhVarI.j());
                            HashMap mapA3 = txh.a(myhVarI.l());
                            HashSet<String> hashSet = new HashSet();
                            hashSet.addAll(mapA.keySet());
                            hashSet.addAll(mapA2.keySet());
                            hashSet.addAll(mapA3.keySet());
                            for (String str2 : hashSet) {
                                byh byhVar = new byh();
                                if (mapA.containsKey(str2)) {
                                    byhVar.b = (tvh) mapA.get(str2);
                                }
                                if (mapA2.containsKey(str2)) {
                                    byhVar.a = (tvh) mapA2.get(str2);
                                }
                                if (mapA3.containsKey(str2)) {
                                    byhVar.c = (tvh) mapA3.get(str2);
                                }
                                map.put(str2, byhVar);
                            }
                        }
                        for (Map.Entry entry : map.entrySet()) {
                            String str3 = (String) entry.getKey();
                            byh byhVar2 = (byh) entry.getValue();
                            jvh jvhVarD = o0d.d(context, str, str3, "fetch");
                            jvh jvhVarD2 = o0d.d(context, str, str3, "activate");
                            jvh jvhVarD3 = o0d.d(context, str, str3, "defaults");
                            tvh tvhVar = byhVar2.a;
                            if (tvhVar != null) {
                                jvhVarD.b(tvhVar);
                            }
                            tvh tvhVar2 = byhVar2.b;
                            if (tvhVar2 != null) {
                                jvhVarD2.b(tvhVar2);
                            }
                            tvh tvhVar3 = byhVar2.c;
                            if (tvhVar3 != null) {
                                jvhVarD3.b(tvhVar3);
                            }
                        }
                        sharedPreferences.edit().putBoolean("save_legacy_configs", false).commit();
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                    }
                    break;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public j2i(h1i h1iVar, zzao zzaoVar, String str) {
        this.b = h1iVar;
    }
}
