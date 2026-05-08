package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.j6g;
import defpackage.lu2;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfq {
    private final SharedPreferences zza;

    public zzfq(Context context) {
        this.zza = context.getSharedPreferences("_GRECAPTCHA", 0);
    }

    public final Object zza(String str, lu2 lu2Var) {
        return this.zza.getString("_GRECAPTCHA_KC", null);
    }

    public final Object zzb(Map map, lu2 lu2Var) {
        SharedPreferences.Editor editorEdit = this.zza.edit();
        for (Map.Entry entry : map.entrySet()) {
            editorEdit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        editorEdit.commit();
        return j6g.a;
    }
}
