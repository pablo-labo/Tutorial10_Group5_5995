package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzaga;
import com.google.android.recaptcha.internal.zzagg;
import defpackage.l5;

/* JADX INFO: loaded from: classes2.dex */
public class zzaga<MessageType extends zzagg<MessageType, BuilderType>, BuilderType extends zzaga<MessageType, BuilderType>> extends zzadp<MessageType, BuilderType> {
    protected zzagg zza;
    private final zzagg zzb;

    public zzaga(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzac()) {
            l5.q("Default instance must be immutable.");
            throw null;
        }
        this.zza = messagetype.zzG();
    }

    private static void zza(Object obj, Object obj2) {
        zzahv.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzahm
    public final boolean zzaj() {
        return zzagg.zzd(this.zza, false);
    }

    @Override // com.google.android.recaptcha.internal.zzahm
    public final /* synthetic */ zzahl zzak() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzadp
    public final /* synthetic */ zzadp zzj(zzadq zzadqVar) {
        zzn((zzagg) zzadqVar);
        return this;
    }

    @Override // com.google.android.recaptcha.internal.zzadp
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzaga zzi() {
        zzaga zzagaVar = (zzaga) this.zzb.zzf(5, null, null);
        zzagaVar.zza = zzr();
        return zzagaVar;
    }

    public final zzaga zzn(zzagg zzaggVar) {
        if (!this.zzb.equals(zzaggVar)) {
            if (!this.zza.zzac()) {
                zzu();
            }
            zza(this.zza, zzaggVar);
        }
        return this;
    }

    @Override // com.google.android.recaptcha.internal.zzahk
    /* JADX INFO: renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final MessageType zzq() {
        MessageType messagetype = (MessageType) zzr();
        if (messagetype.zzaj()) {
            return messagetype;
        }
        throw new zzain(messagetype);
    }

    @Override // com.google.android.recaptcha.internal.zzahk
    /* JADX INFO: renamed from: zzp, reason: merged with bridge method [inline-methods] */
    public MessageType zzr() {
        boolean zZzac = this.zza.zzac();
        MessageType messagetype = (MessageType) this.zza;
        if (!zZzac) {
            return messagetype;
        }
        messagetype.zzW();
        return (MessageType) this.zza;
    }

    public final void zzt() {
        if (this.zza.zzac()) {
            return;
        }
        zzu();
    }

    public void zzu() {
        zzagg zzaggVarZzG = this.zzb.zzG();
        zza(zzaggVarZzG, this.zza);
        this.zza = zzaggVarZzG;
    }
}
