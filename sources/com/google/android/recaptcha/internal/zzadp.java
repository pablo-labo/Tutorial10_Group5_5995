package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzadp;
import com.google.android.recaptcha.internal.zzadq;
import defpackage.bg;
import defpackage.ja;
import defpackage.l5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzadp<MessageType extends zzadq<MessageType, BuilderType>, BuilderType extends zzadp<MessageType, BuilderType>> implements zzahk {
    private static void zza(List list, int i) {
        String strD = bg.d(list.size() - i, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(strD);
            }
            list.remove(size);
        }
    }

    public static void zzl(Iterable iterable, List list) {
        byte[] bArr = zzago.zzb;
        iterable.getClass();
        if (iterable instanceof zzagx) {
            List listZza = ((zzagx) iterable).zza();
            zzagx zzagxVar = (zzagx) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    String strD = bg.d(zzagxVar.size() - size, "Element at index ", " is null.");
                    int size2 = zzagxVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            ja.k(strD);
                            return;
                        }
                        zzagxVar.remove(size2);
                    }
                } else if (obj instanceof zzaef) {
                    zzagxVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    zzaef.zzm(bArr2, 0, bArr2.length);
                    zzagxVar.zzb();
                } else {
                    zzagxVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzahu) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof zzahw) {
                ((zzahw) list).zzf(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    zza(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i = 0; i < size5; i++) {
            Object obj3 = list2.get(i);
            if (obj3 == null) {
                zza(list, size4);
            }
            list.add(obj3);
        }
    }

    @Override // 
    public abstract zzadp zzi();

    public abstract zzadp zzj(zzadq zzadqVar);

    @Override // com.google.android.recaptcha.internal.zzahk
    public final /* bridge */ /* synthetic */ zzahk zzk(zzahl zzahlVar) {
        if (zzak().getClass().isInstance(zzahlVar)) {
            return zzj((zzadq) zzahlVar);
        }
        l5.q("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }
}
