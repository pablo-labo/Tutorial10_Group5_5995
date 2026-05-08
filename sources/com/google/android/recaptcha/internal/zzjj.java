package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import defpackage.t92;
import defpackage.u63;
import defpackage.wve;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjj {
    private final List zza;

    public zzjj(boolean z) {
        this.zza = zzf(u63.a0("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));
    }

    public static final boolean zzc(Uri uri) {
        return zze(uri);
    }

    private final boolean zzd(String str) {
        List list = this.zza;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (wve.K(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean zze(Uri uri) {
        return (TextUtils.isEmpty(uri.toString()) || !"https".equals(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) ? false : true;
    }

    private static final List zzf(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }

    public final boolean zza(Uri uri) {
        return zze(uri) && zzd(uri.toString());
    }

    public final boolean zzb(String str) {
        Uri uri = Uri.parse(str);
        uri.getClass();
        return zze(uri) && zzd(uri.toString());
    }

    public zzjj() {
        this(true);
    }
}
