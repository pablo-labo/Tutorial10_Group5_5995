package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
public final class mwh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ewh f;

    public mwh(ewh ewhVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f = ewhVar;
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eyh eyhVar = this.f.a.W;
        i0i.c(eyhVar);
        boolean z = eyhVar.b;
        ewh ewhVar = this.f;
        if (!z) {
            Log.println(6, ewhVar.o(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (ewhVar.c == 0) {
            wmi wmiVar = ewhVar.a.V;
            if (wmiVar.d == null) {
                synchronized (wmiVar) {
                    try {
                        if (wmiVar.d == null) {
                            ApplicationInfo applicationInfo = wmiVar.a.a.getApplicationInfo();
                            String strA = hob.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                wmiVar.d = Boolean.valueOf(str != null && str.equals(strA));
                            }
                            if (wmiVar.d == null) {
                                wmiVar.d = Boolean.TRUE;
                                wmiVar.zzr().f.b("My process not in the list of running processes");
                            }
                        }
                    } finally {
                    }
                }
            }
            boolean zBooleanValue = wmiVar.d.booleanValue();
            ewh ewhVar2 = this.f;
            i0i i0iVar = ewhVar2.a;
            if (zBooleanValue) {
                awd awdVar = i0iVar.f;
                ewhVar2.c = 'C';
            } else {
                awd awdVar2 = i0iVar.f;
                ewhVar2.c = 'c';
            }
        }
        ewh ewhVar3 = this.f;
        if (ewhVar3.d < 0) {
            ewhVar3.a.V.o();
            ewhVar3.d = 29000L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.a);
        ewh ewhVar4 = this.f;
        char c = ewhVar4.c;
        long j = ewhVar4.d;
        String strK = ewh.k(true, this.b, this.c, this.d, this.e);
        StringBuilder sb = new StringBuilder(strK.length() + 24);
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c);
        sb.append(j);
        sb.append(":");
        sb.append(strK);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = this.b.substring(0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
        bzh bzhVar = eyhVar.d;
        String str2 = bzhVar.c;
        String str3 = bzhVar.b;
        eyh eyhVar2 = bzhVar.e;
        eyhVar2.b();
        if (bzhVar.e.n().getLong(bzhVar.a, 0L) == 0) {
            bzhVar.a();
        }
        long j2 = eyhVar2.n().getLong(str3, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor editorEdit = eyhVar2.n().edit();
            editorEdit.putString(str2, string);
            editorEdit.putLong(str3, 1L);
            editorEdit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z2 = (eyhVar2.e().j0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor editorEdit2 = eyhVar2.n().edit();
        if (z2) {
            editorEdit2.putString(str2, string);
        }
        editorEdit2.putLong(str3, j3);
        editorEdit2.apply();
    }
}
