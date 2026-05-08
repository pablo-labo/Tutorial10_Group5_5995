package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.indeed.android.backendservices.data.IndeedAppDatabase_Impl;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class jda implements Callable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ jda(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                wda wdaVar = (wda) this.b;
                xca xcaVar = wdaVar.k;
                IndeedAppDatabase_Impl indeedAppDatabase_Impl = wdaVar.a;
                zze zzeVarC = xcaVar.c();
                try {
                    indeedAppDatabase_Impl.c();
                    try {
                        zzeVarC.J();
                        indeedAppDatabase_Impl.w();
                        return j6g.a;
                    } finally {
                        indeedAppDatabase_Impl.s();
                    }
                } finally {
                    xcaVar.g(zzeVarC);
                }
            default:
                Intent intent = (Intent) this.b;
                String stringExtra = intent.getStringExtra("CMD");
                if (stringExtra != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String strValueOf = String.valueOf(intent.getExtras());
                        StringBuilder sb = new StringBuilder(strValueOf.length() + stringExtra.length() + 21);
                        sb.append("Received command: ");
                        sb.append(stringExtra);
                        sb.append(" - ");
                        sb.append(strValueOf);
                        Log.d("FirebaseInstanceId", sb.toString());
                    }
                    if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                        ikh ikhVar = FirebaseInstanceId.i;
                        FirebaseInstanceId.getInstance(pf5.c()).h();
                    } else if ("SYNC".equals(stringExtra)) {
                        ikh ikhVar2 = FirebaseInstanceId.i;
                        FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.getInstance(pf5.c());
                        ikh ikhVar3 = FirebaseInstanceId.i;
                        String strK = firebaseInstanceId.k();
                        synchronized (ikhVar3) {
                            try {
                                String strConcat = strK.concat("|T|");
                                SharedPreferences.Editor editorEdit = ikhVar3.a.edit();
                                for (String str : ikhVar3.a.getAll().keySet()) {
                                    if (str.startsWith(strConcat)) {
                                        editorEdit.remove(str);
                                    }
                                }
                                editorEdit.commit();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        firebaseInstanceId.i();
                    }
                }
                return -1;
        }
    }
}
