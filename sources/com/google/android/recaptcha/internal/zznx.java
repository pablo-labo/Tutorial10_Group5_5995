package com.google.android.recaptcha.internal;

import defpackage.l5;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class zznx extends zzob implements Serializable {
    final int zza;
    private final Queue zzb;

    private zznx(int i) {
        if (i < 0) {
            l5.q(zznc.zza("maxSize (%s) must >= 0", Integer.valueOf(i)));
            throw null;
        }
        this.zzb = new ArrayDeque(i);
        this.zza = i;
    }

    public static zznx zza(int i) {
        return new zznx(i);
    }

    @Override // com.google.android.recaptcha.internal.zznz, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        int i = this.zza;
        if (i == 0) {
            return true;
        }
        if (size() == i) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zznz, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        int i = this.zza;
        if (size < i) {
            return zzoz.zza(this, collection.iterator());
        }
        clear();
        int i2 = size - i;
        zzmz.zzd(i2 >= 0, "number to skip cannot be negative");
        return zzoz.zza(this, new zzov(collection, i2).iterator());
    }

    @Override // com.google.android.recaptcha.internal.zzob, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zznz, com.google.android.recaptcha.internal.zzoa
    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzob, com.google.android.recaptcha.internal.zznz
    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzob
    public final Queue zzd() {
        return this.zzb;
    }
}
