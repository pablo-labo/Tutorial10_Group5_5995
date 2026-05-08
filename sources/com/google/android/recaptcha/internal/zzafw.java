package com.google.android.recaptcha.internal;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.b0;
import defpackage.l5;
import defpackage.m6;
import defpackage.r6;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzafw {
    private static final zzafw zzd = new zzafw(true);
    final zzaih zza = new zzaic();
    boolean zzb;
    boolean zzc;

    private zzafw(boolean z) {
        zzg();
        zzg();
    }

    public static int zza(zzafv zzafvVar, Object obj) {
        int iZzd;
        int iZzx;
        zzaiz zzaizVarZzb = zzafvVar.zzb();
        int iZza = zzafvVar.zza();
        zzafvVar.zzg();
        int iZzx2 = zzaeo.zzx(iZza << 3);
        if (zzaizVarZzb == zzaiz.zzj) {
            iZzx2 += iZzx2;
        }
        zzaja zzajaVar = zzaja.INT;
        int iZzy = 4;
        switch (zzaizVarZzb.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iZzy = 8;
                return iZzx2 + iZzy;
            case 1:
                ((Float) obj).getClass();
                return iZzx2 + iZzy;
            case 2:
                iZzy = zzaeo.zzy(((Long) obj).longValue());
                return iZzx2 + iZzy;
            case 3:
                iZzy = zzaeo.zzy(((Long) obj).longValue());
                return iZzx2 + iZzy;
            case 4:
                iZzy = zzaeo.zzy(((Integer) obj).intValue());
                return iZzx2 + iZzy;
            case 5:
                ((Long) obj).getClass();
                iZzy = 8;
                return iZzx2 + iZzy;
            case 6:
                ((Integer) obj).getClass();
                return iZzx2 + iZzy;
            case 7:
                ((Boolean) obj).getClass();
                iZzy = 1;
                return iZzx2 + iZzy;
            case 8:
                if (!(obj instanceof zzaef)) {
                    iZzy = zzaeo.zzw((String) obj);
                    return iZzx2 + iZzy;
                }
                iZzd = ((zzaef) obj).zzd();
                iZzx = zzaeo.zzx(iZzd);
                iZzy = iZzx + iZzd;
                return iZzx2 + iZzy;
            case DatadogLogGenerator.CRASH /* 9 */:
                iZzy = ((zzahl) obj).zzA();
                return iZzx2 + iZzy;
            case 10:
                if (!(obj instanceof zzagv)) {
                    iZzy = zzaeo.zzv((zzahl) obj);
                    return iZzx2 + iZzy;
                }
                iZzd = ((zzagv) obj).zza();
                iZzx = zzaeo.zzx(iZzd);
                iZzy = iZzx + iZzd;
                return iZzx2 + iZzy;
            case 11:
                if (obj instanceof zzaef) {
                    iZzd = ((zzaef) obj).zzd();
                    iZzx = zzaeo.zzx(iZzd);
                } else {
                    iZzd = ((byte[]) obj).length;
                    iZzx = zzaeo.zzx(iZzd);
                }
                iZzy = iZzx + iZzd;
                return iZzx2 + iZzy;
            case 12:
                iZzy = zzaeo.zzx(((Integer) obj).intValue());
                return iZzx2 + iZzy;
            case 13:
                iZzy = obj instanceof zzagi ? zzaeo.zzy(((zzagi) obj).zza()) : zzaeo.zzy(((Integer) obj).intValue());
                return iZzx2 + iZzy;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((Integer) obj).getClass();
                return iZzx2 + iZzy;
            case 15:
                ((Long) obj).getClass();
                iZzy = 8;
                return iZzx2 + iZzy;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iZzy = zzaeo.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzx2 + iZzy;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iZzy = zzaeo.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzx2 + iZzy;
            default:
                b0.o("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static zzafw zzd() {
        return zzd;
    }

    private static Object zzk(Object obj) {
        if (obj instanceof zzahq) {
            return ((zzahq) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void zzl(Map.Entry entry) {
        zzafv zzafvVar = (zzafv) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzagv;
        zzafvVar.zzg();
        if (zzafvVar.zzc() != zzaja.MESSAGE) {
            if (z) {
                r6.g("Lazy fields must be message-valued");
                return;
            } else {
                this.zza.put(zzafvVar, zzk(value));
                return;
            }
        }
        Object objZze = zze(zzafvVar);
        if (objZze == null) {
            this.zza.put(zzafvVar, zzk(value));
            if (z) {
                this.zzc = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (!zzafvVar.zze(objZze)) {
            zzafvVar.zzd(objZze, value);
            return;
        }
        zzahk zzahkVarZzS = ((zzahl) objZze).zzS();
        zzafvVar.zzd(zzahkVarZzS, value);
        this.zza.put(zzafvVar, zzahkVarZzS.zzq());
    }

    private static boolean zzm(Map.Entry entry) {
        zzafv zzafvVar = (zzafv) entry.getKey();
        if (zzafvVar.zzc() != zzaja.MESSAGE) {
            return true;
        }
        zzafvVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzahm) {
            return ((zzahm) value).zzaj();
        }
        if (value instanceof zzagv) {
            return true;
        }
        l5.q("Wrong object type used with protocol message reflection.");
        return false;
    }

    private static final int zzn(Map.Entry entry) {
        int i;
        int iZzx;
        int iZzv;
        zzafv zzafvVar = (zzafv) entry.getKey();
        Object value = entry.getValue();
        if (zzafvVar.zzc() != zzaja.MESSAGE) {
            return zza(zzafvVar, value);
        }
        zzafvVar.zzg();
        zzafvVar.zzf();
        if (value instanceof zzagv) {
            int iZza = ((zzafv) entry.getKey()).zza();
            int iZzx2 = zzaeo.zzx(8);
            i = iZzx2 + iZzx2;
            iZzx = zzaeo.zzx(iZza) + zzaeo.zzx(16);
            int iZzx3 = zzaeo.zzx(24);
            int iZza2 = ((zzagv) value).zza();
            iZzv = m6.a(iZza2, iZza2, iZzx3);
        } else {
            int iZza3 = ((zzafv) entry.getKey()).zza();
            int iZzx4 = zzaeo.zzx(8);
            i = iZzx4 + iZzx4;
            iZzx = zzaeo.zzx(iZza3) + zzaeo.zzx(16);
            iZzv = zzaeo.zzv((zzahl) value) + zzaeo.zzx(24);
        }
        return i + iZzx + iZzv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzafw) {
            return this.zza.equals(((zzafw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        zzaih zzaihVar = this.zza;
        int iZzc = zzaihVar.zzc();
        int iZzn = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzn += zzn(zzaihVar.zzg(i));
        }
        Iterator it = zzaihVar.zzd().iterator();
        while (it.hasNext()) {
            iZzn += zzn((Map.Entry) it.next());
        }
        return iZzn;
    }

    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzafw clone() {
        zzafw zzafwVar = new zzafw();
        zzaih zzaihVar = this.zza;
        int iZzc = zzaihVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzg = zzaihVar.zzg(i);
            zzafwVar.zzi((zzafv) ((zzaid) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : zzaihVar.zzd()) {
            zzafwVar.zzi((zzafv) entry.getKey(), entry.getValue());
        }
        zzafwVar.zzc = this.zzc;
        return zzafwVar;
    }

    public final Object zze(zzafv zzafvVar) {
        Object obj = this.zza.get(zzafvVar);
        if (obj instanceof zzagv) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        zzaih zzaihVar = this.zza;
        return zzaihVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzagt(zzaihVar.entrySet().iterator()) : zzaihVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzb) {
            return;
        }
        zzaih zzaihVar = this.zza;
        int iZzc = zzaihVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            Object value = zzaihVar.zzg(i).getValue();
            if (value instanceof zzagg) {
                ((zzagg) value).zzW();
            }
        }
        Iterator it = zzaihVar.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzagg) {
                ((zzagg) value2).zzW();
            }
        }
        zzaihVar.zza();
        this.zzb = true;
    }

    public final void zzh(zzafw zzafwVar) {
        zzaih zzaihVar = zzafwVar.zza;
        int iZzc = zzaihVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            zzl(zzaihVar.zzg(i));
        }
        Iterator it = zzaihVar.zzd().iterator();
        while (it.hasNext()) {
            zzl((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzagi) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzagv) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.recaptcha.internal.zzafv r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.zzg()
            com.google.android.recaptcha.internal.zzaiz r0 = r3.zzb()
            byte[] r1 = com.google.android.recaptcha.internal.zzago.zzb
            r4.getClass()
            com.google.android.recaptcha.internal.zzaiz r1 = com.google.android.recaptcha.internal.zzaiz.zza
            com.google.android.recaptcha.internal.zzaja r1 = com.google.android.recaptcha.internal.zzaja.INT
            com.google.android.recaptcha.internal.zzaja r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L46;
                case 1: goto L43;
                case 2: goto L40;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L37;
                case 6: goto L2e;
                case 7: goto L25;
                case 8: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L57
        L1c:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzahl
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzagv
            if (r0 == 0) goto L57
            goto L4a
        L25:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzagi
            if (r0 == 0) goto L57
            goto L4a
        L2e:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzaef
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4a
        L37:
            boolean r0 = r4 instanceof java.lang.String
            goto L48
        L3a:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L48
        L3d:
            boolean r0 = r4 instanceof java.lang.Double
            goto L48
        L40:
            boolean r0 = r4 instanceof java.lang.Float
            goto L48
        L43:
            boolean r0 = r4 instanceof java.lang.Long
            goto L48
        L46:
            boolean r0 = r4 instanceof java.lang.Integer
        L48:
            if (r0 == 0) goto L57
        L4a:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzagv
            if (r0 == 0) goto L51
            r0 = 1
            r2.zzc = r0
        L51:
            com.google.android.recaptcha.internal.zzaih r2 = r2.zza
            r2.put(r3, r4)
            return
        L57:
            int r2 = r3.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.recaptcha.internal.zzaiz r3 = r3.zzb()
            com.google.android.recaptcha.internal.zzaja r3 = r3.zza()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            defpackage.t40.q(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzafw.zzi(com.google.android.recaptcha.internal.zzafv, java.lang.Object):void");
    }

    public final boolean zzj() {
        zzaih zzaihVar = this.zza;
        int iZzc = zzaihVar.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzm(zzaihVar.zzg(i))) {
                return false;
            }
        }
        Iterator it = zzaihVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzm((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzafw() {
    }
}
