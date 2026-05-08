package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.t92;
import defpackage.u22;
import defpackage.v22;
import defpackage.wl7;
import defpackage.wve;
import defpackage.z92;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfr implements zzfn {
    private final Context zza;
    private final String zzb = "rce_";

    public zzfr(Context context, zzfs zzfsVar) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzfn
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(str));
        if (file.exists()) {
            return new String(zzfs.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzfn
    public final void zzb(String str) {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (wve.K(file.getName(), this.zzb + "js_", false)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzfn
    public final void zzc(String str, String str2) throws IOException {
        v22 v22Var = new v22('A', 'z');
        ArrayList arrayList = new ArrayList(t92.r0(v22Var, 10));
        Iterator<Character> it = v22Var.iterator();
        while (((u22) it).c) {
            arrayList.add(Character.valueOf(((u22) it).a()));
        }
        List listC1 = z92.C1(arrayList);
        Collections.shuffle(listC1);
        String strW0 = z92.W0(((ArrayList) listC1).subList(0, 8), "", null, null, null, 62);
        Context context = this.zza;
        String str3 = this.zzb;
        File file = new File(context.getCacheDir(), str3.concat(strW0));
        zzfs.zzb(file, str2.getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(context.getCacheDir(), str3.concat(str)));
    }

    @Override // com.google.android.recaptcha.internal.zzfn
    public final boolean zzd(String str) {
        try {
            File file = new File(this.zza.getCacheDir(), this.zzb + "orcas_verification_key");
            if (file.exists()) {
                if (file.delete()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzfn
    public final boolean zze(String str) {
        File file;
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            file = null;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i];
                    if (wl7.b(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i++;
                }
            }
        } catch (Exception unused) {
        }
        return file != null;
    }
}
