package com.google.android.recaptcha.internal;

import defpackage.b0;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmb implements zzme {
    private static final boolean zzb(int i) throws IOException {
        try {
            new Socket("localhost", i).close();
            return true;
        } catch (ConnectException unused) {
            return false;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzme
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzmd.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzme
    public final Object zza(Object... objArr) throws zzeu {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (true != (obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num == null) {
                b0.n(4, 5, null);
                return null;
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (zzb(iIntValue)) {
                arrayList2.add(Integer.valueOf(iIntValue));
            }
        }
        return arrayList2;
    }
}
