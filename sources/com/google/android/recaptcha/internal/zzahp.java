package com.google.android.recaptcha.internal;

import defpackage.r6;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzahp implements zzahz {
    private final zzahl zza;
    private final zzaio zzb;
    private final boolean zzc;
    private final zzafs zzd;

    private zzahp(zzaio zzaioVar, zzafs zzafsVar, zzahl zzahlVar) {
        this.zzb = zzaioVar;
        this.zzc = zzahlVar instanceof zzagd;
        this.zzd = zzafsVar;
        this.zza = zzahlVar;
    }

    public static zzahp zzc(zzaio zzaioVar, zzafs zzafsVar, zzahl zzahlVar) {
        return new zzahp(zzaioVar, zzafsVar, zzahlVar);
    }

    @Override // com.google.android.recaptcha.internal.zzahz
    public final int zza(Object obj) {
        int iZzb = ((zzagg) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzagd) obj).zza.zzb() : iZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzahz
    public final int zzb(Object obj) {
        int iHashCode = ((zzagg) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzagd) obj).zza.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzahz
    public final Object zze() {
        zzahl zzahlVar = this.zza;
        return zzahlVar instanceof zzagg ? ((zzagg) zzahlVar).zzG() : zzahlVar.zzR().zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzahz
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzahz
    public final void zzg(Object obj, Object obj2) {
        zzaib.zzr(this.zzb, obj, obj2);
        if (this.zzc) {
            zzaib.zzq(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzahz
    public final void zzh(Object obj, zzahy zzahyVar, zzafr zzafrVar) {
        boolean zZzO;
        zzaio zzaioVar = this.zzb;
        Object objZza = zzaioVar.zza(obj);
        ((zzagd) obj).zzc();
        while (zzahyVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzahyVar.zzd();
                int iZzj = 0;
                if (iZzd != 11) {
                    if ((iZzd & 7) != 2) {
                        zZzO = zzahyVar.zzO();
                    } else {
                        if (zzafrVar.zzb(this.zza, iZzd >>> 3) != null) {
                            throw null;
                        }
                        zZzO = zzaioVar.zzk(objZza, zzahyVar, 0);
                    }
                    if (!zZzO) {
                        break;
                    }
                } else {
                    zzagf zzagfVarZzb = null;
                    zzaef zzaefVarZzp = null;
                    while (zzahyVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzahyVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzahyVar.zzj();
                            zzagfVarZzb = zzafrVar.zzb(this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (zzagfVarZzb != null) {
                                throw null;
                            }
                            zzaefVarZzp = zzahyVar.zzp();
                        } else if (iZzd2 == 12 || !zzahyVar.zzO()) {
                            break;
                        }
                    }
                    if (zzahyVar.zzd() != 12) {
                        throw new zzagq("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzaefVarZzp == null) {
                        continue;
                    } else {
                        if (zzagfVarZzb != null) {
                            throw null;
                        }
                        zzaioVar.zzg(objZza, iZzj, zzaefVarZzp);
                    }
                }
            } finally {
                zzaioVar.zzj(obj, objZza);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r12 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        r6.zzj((r11 << 3) | 2, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        r12 = r13;
        r11 = r3;
        r13 = r5;
        r14 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008b A[EDGE_INSN: B:58:0x008b->B:35:0x008b BREAK  A[LOOP:1: B:18:0x004e->B:63:0x004e], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzahz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r10, byte[] r11, int r12, int r13, com.google.android.recaptcha.internal.zzadu r14) throws com.google.android.recaptcha.internal.zzagq {
        /*
            r9 = this;
            r0 = r10
            com.google.android.recaptcha.internal.zzagg r0 = (com.google.android.recaptcha.internal.zzagg) r0
            com.google.android.recaptcha.internal.zzaip r1 = r0.zzc
            com.google.android.recaptcha.internal.zzaip r2 = com.google.android.recaptcha.internal.zzaip.zzc()
            if (r1 != r2) goto L11
            com.google.android.recaptcha.internal.zzaip r1 = com.google.android.recaptcha.internal.zzaip.zzf()
            r0.zzc = r1
        L11:
            r6 = r1
            com.google.android.recaptcha.internal.zzagd r10 = (com.google.android.recaptcha.internal.zzagd) r10
            r10.zzc()
            r10 = 0
            r0 = r10
        L19:
            if (r12 >= r13) goto L98
            int r4 = com.google.android.recaptcha.internal.zzadv.zzi(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r1 = 2
            if (r2 == r12) goto L49
            r12 = r2 & 7
            if (r12 != r1) goto L41
            com.google.android.recaptcha.internal.zzafr r12 = r14.zzd
            com.google.android.recaptcha.internal.zzahl r0 = r9.zza
            int r1 = r2 >>> 3
            com.google.android.recaptcha.internal.zzagf r0 = r12.zzb(r0, r1)
            if (r0 != 0) goto L3e
            r3 = r11
            r5 = r13
            r7 = r14
            int r12 = com.google.android.recaptcha.internal.zzadv.zzh(r2, r3, r4, r5, r6, r7)
            goto L19
        L3e:
            int r9 = com.google.android.recaptcha.internal.zzahv.zza
            throw r10
        L41:
            r3 = r11
            r5 = r13
            r7 = r14
            int r12 = com.google.android.recaptcha.internal.zzadv.zzo(r2, r3, r4, r5, r7)
            goto L19
        L49:
            r3 = r11
            r5 = r13
            r7 = r14
            r11 = 0
            r12 = r10
        L4e:
            if (r4 >= r5) goto L8a
            int r13 = com.google.android.recaptcha.internal.zzadv.zzi(r3, r4, r7)
            int r14 = r7.zza
            int r2 = r14 >>> 3
            r4 = r14 & 7
            if (r2 == r1) goto L70
            r8 = 3
            if (r2 == r8) goto L60
            goto L81
        L60:
            if (r0 != 0) goto L6d
            if (r4 != r1) goto L81
            int r4 = com.google.android.recaptcha.internal.zzadv.zza(r3, r13, r7)
            java.lang.Object r12 = r7.zzc
            com.google.android.recaptcha.internal.zzaef r12 = (com.google.android.recaptcha.internal.zzaef) r12
            goto L4e
        L6d:
            int r9 = com.google.android.recaptcha.internal.zzahv.zza
            throw r10
        L70:
            if (r4 != 0) goto L81
            int r4 = com.google.android.recaptcha.internal.zzadv.zzi(r3, r13, r7)
            int r11 = r7.zza
            com.google.android.recaptcha.internal.zzafr r13 = r7.zzd
            com.google.android.recaptcha.internal.zzahl r14 = r9.zza
            com.google.android.recaptcha.internal.zzagf r0 = r13.zzb(r14, r11)
            goto L4e
        L81:
            r2 = 12
            if (r14 == r2) goto L8b
            int r4 = com.google.android.recaptcha.internal.zzadv.zzo(r14, r3, r13, r5, r7)
            goto L4e
        L8a:
            r13 = r4
        L8b:
            if (r12 == 0) goto L93
            int r11 = r11 << 3
            r11 = r11 | r1
            r6.zzj(r11, r12)
        L93:
            r12 = r13
            r11 = r3
            r13 = r5
            r14 = r7
            goto L19
        L98:
            r5 = r13
            if (r12 != r5) goto L9c
            return
        L9c:
            java.lang.String r9 = "Failed to parse the message."
            defpackage.ia.p(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzahp.zzi(java.lang.Object, byte[], int, int, com.google.android.recaptcha.internal.zzadu):void");
    }

    @Override // com.google.android.recaptcha.internal.zzahz
    public final void zzj(Object obj, zzajb zzajbVar) {
        Iterator itZzf = ((zzagd) obj).zza.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzafv zzafvVar = (zzafv) entry.getKey();
            if (zzafvVar.zzc() != zzaja.MESSAGE) {
                r6.g("Found invalid MessageSet item.");
                return;
            }
            zzafvVar.zzg();
            zzafvVar.zzf();
            if (entry instanceof zzags) {
                zzajbVar.zzw(zzafvVar.zza(), ((zzags) entry).zza().zzb());
            } else {
                zzajbVar.zzw(zzafvVar.zza(), entry.getValue());
            }
        }
        ((zzagg) obj).zzc.zzk(zzajbVar);
    }

    @Override // com.google.android.recaptcha.internal.zzahz
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzagg) obj).zzc.equals(((zzagg) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzagd) obj).zza.equals(((zzagd) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzahz
    public final boolean zzl(Object obj) {
        return ((zzagd) obj).zza.zzj();
    }
}
