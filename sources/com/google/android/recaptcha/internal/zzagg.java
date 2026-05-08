package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzaga;
import com.google.android.recaptcha.internal.zzagg;
import defpackage.bg;
import defpackage.ia;
import defpackage.ja;
import defpackage.l6;
import defpackage.p6;
import defpackage.r6;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzagg<MessageType extends zzagg<MessageType, BuilderType>, BuilderType extends zzaga<MessageType, BuilderType>> extends zzadq<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzaip zzc = zzaip.zzc();

    public static zzagf zzD(zzahl zzahlVar, Object obj, zzahl zzahlVar2, zzagj zzagjVar, int i, zzaiz zzaizVar, Class cls) {
        return new zzagf(zzahlVar, "", null, new zzage(null, i, zzaizVar, false, false), cls);
    }

    public static zzagg zzF(Class cls) {
        Map map = zza;
        zzagg zzaggVar = (zzagg) map.get(cls);
        if (zzaggVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaggVar = (zzagg) map.get(cls);
            } catch (ClassNotFoundException e) {
                ja.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzaggVar != null) {
            return zzaggVar;
        }
        zzagg zzaggVar2 = (zzagg) ((zzagg) zzaiv.zze(cls)).zzf(6, null, null);
        if (zzaggVar2 != null) {
            map.put(cls, zzaggVar2);
            return zzaggVar2;
        }
        bg.h();
        return null;
    }

    public static zzagg zzH(zzagg zzaggVar, zzaef zzaefVar) throws zzagq {
        int i = zzafr.zzb;
        int i2 = zzadt.zza;
        zzafr zzafrVar = zzafr.zza;
        zzaej zzaejVarZzh = zzaefVar.zzh();
        zzagg zzaggVarZzG = zzaggVar.zzG();
        try {
            zzahz zzahzVarZzb = zzahv.zza().zzb(zzaggVarZzG.getClass());
            zzahzVarZzb.zzh(zzaggVarZzG, zzaek.zzq(zzaejVarZzh), zzafrVar);
            zzahzVarZzb.zzf(zzaggVarZzG);
            zzaejVarZzh.zzz(0);
            zzb(zzaggVarZzG);
            zzb(zzaggVarZzG);
            return zzaggVarZzG;
        } catch (zzagq e) {
            if (e.zzb()) {
                throw new zzagq(e);
            }
            throw e;
        } catch (zzain e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzagq) {
                throw ((zzagq) e3.getCause());
            }
            throw new zzagq(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzagq) {
                throw ((zzagq) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzagg zzI(zzagg zzaggVar, InputStream inputStream) throws zzagq {
        zzaej zzaehVar;
        if (inputStream == null) {
            byte[] bArr = zzago.zzb;
            int length = bArr.length;
            zzaehVar = zzaej.zzH(bArr, 0, 0, false);
        } else {
            zzaehVar = new zzaeh(inputStream, 4096, null);
        }
        int i = zzafr.zzb;
        int i2 = zzadt.zza;
        zzafr zzafrVar = zzafr.zza;
        zzagg zzaggVarZzG = zzaggVar.zzG();
        try {
            zzahz zzahzVarZzb = zzahv.zza().zzb(zzaggVarZzG.getClass());
            zzahzVarZzb.zzh(zzaggVarZzG, zzaek.zzq(zzaehVar), zzafrVar);
            zzahzVarZzb.zzf(zzaggVarZzG);
            zzb(zzaggVarZzG);
            return zzaggVarZzG;
        } catch (zzagq e) {
            if (e.zzb()) {
                throw new zzagq(e);
            }
            throw e;
        } catch (zzain e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzagq) {
                throw ((zzagq) e3.getCause());
            }
            throw new zzagq(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzagq) {
                throw ((zzagq) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzagg zzJ(zzagg zzaggVar, byte[] bArr) throws zzagq {
        int length = bArr.length;
        int i = zzafr.zzb;
        int i2 = zzadt.zza;
        zzagg zzaggVarZzc = zzc(zzaggVar, bArr, 0, length, zzafr.zza);
        zzb(zzaggVarZzc);
        return zzaggVarZzc;
    }

    public static zzagg zzK(zzagg zzaggVar, zzaef zzaefVar, zzafr zzafrVar) throws zzagq {
        zzaej zzaejVarZzh = zzaefVar.zzh();
        zzagg zzaggVarZzG = zzaggVar.zzG();
        try {
            zzahz zzahzVarZzb = zzahv.zza().zzb(zzaggVarZzG.getClass());
            zzahzVarZzb.zzh(zzaggVarZzG, zzaek.zzq(zzaejVarZzh), zzafrVar);
            zzahzVarZzb.zzf(zzaggVarZzG);
            zzaejVarZzh.zzz(0);
            zzb(zzaggVarZzG);
            return zzaggVarZzG;
        } catch (zzagq e) {
            if (e.zzb()) {
                throw new zzagq(e);
            }
            throw e;
        } catch (zzain e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzagq) {
                throw ((zzagq) e3.getCause());
            }
            throw new zzagq(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzagq) {
                throw ((zzagq) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzagg zzL(zzagg zzaggVar, byte[] bArr, zzafr zzafrVar) throws zzagq {
        zzagg zzaggVarZzc = zzc(zzaggVar, bArr, 0, bArr.length, zzafrVar);
        zzb(zzaggVarZzc);
        return zzaggVarZzc;
    }

    public static zzagl zzM() {
        return zzagh.zzf();
    }

    public static zzagl zzN(zzagl zzaglVar) {
        int size = zzaglVar.size();
        return zzaglVar.zzd(size + size);
    }

    public static zzagm zzO() {
        return zzaha.zzf();
    }

    public static zzagn zzP() {
        return zzahw.zze();
    }

    public static zzagn zzQ(zzagn zzagnVar) {
        int size = zzagnVar.size();
        return zzagnVar.zzd(size + size);
    }

    public static Object zzU(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            l6.p("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            l6.p("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static Object zzV(zzahl zzahlVar, String str, Object[] objArr) {
        return new zzahx(zzahlVar, str, objArr);
    }

    public static void zzY(Class cls, zzagg zzaggVar) {
        zzaggVar.zzX();
        zza.put(cls, zzaggVar);
    }

    private final int zza(zzahz zzahzVar) {
        return zzahv.zza().zzb(getClass()).zza(this);
    }

    private static zzagg zzb(zzagg zzaggVar) throws zzagq {
        if (zzaggVar == null || zzd(zzaggVar, true)) {
            return zzaggVar;
        }
        throw new zzain(zzaggVar).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzagg zzc(zzagg zzaggVar, byte[] bArr, int i, int i2, zzafr zzafrVar) throws zzagq {
        if (i2 == 0) {
            return zzaggVar;
        }
        zzagg zzaggVarZzG = zzaggVar.zzG();
        try {
            zzahz zzahzVarZzb = zzahv.zza().zzb(zzaggVarZzG.getClass());
            zzahzVarZzb.zzi(zzaggVarZzG, bArr, 0, i2, new zzadu(zzafrVar));
            zzahzVarZzb.zzf(zzaggVarZzG);
            return zzaggVarZzG;
        } catch (zzagq e) {
            if (e.zzb()) {
                throw new zzagq(e);
            }
            throw e;
        } catch (zzain e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzagq) {
                throw ((zzagq) e3.getCause());
            }
            throw new zzagq(e3);
        } catch (IndexOutOfBoundsException unused) {
            ia.p("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzd(zzagg zzaggVar, boolean z) {
        byte bByteValue = ((Byte) zzaggVar.zzf(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzahv.zza().zzb(zzaggVar.getClass()).zzl(zzaggVar);
        if (z) {
            zzaggVar.zzf(2, true != zZzl ? null : zzaggVar, null);
        }
        return zZzl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzahv.zza().zzb(getClass()).zzk(this, (zzagg) obj);
    }

    public final int hashCode() {
        if (zzac()) {
            return zzz();
        }
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int iZzz = zzz();
        this.zzb = iZzz;
        return iZzz;
    }

    public final String toString() {
        return zzahn.zza(this, super.toString());
    }

    @Override // com.google.android.recaptcha.internal.zzahl
    public final int zzA() {
        if (zzac()) {
            int iZza = zza(null);
            if (iZza >= 0) {
                return iZza;
            }
            r6.g(p6.c(iZza, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zza(null);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        r6.g(p6.c(iZza2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final zzaga zzB() {
        return (zzaga) zzf(5, null, null);
    }

    public final zzaga zzC() {
        zzaga zzagaVar = (zzaga) zzf(5, null, null);
        zzagaVar.zzn(this);
        return zzagaVar;
    }

    public final zzagg zzG() {
        return (zzagg) zzf(4, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzahl
    public final /* synthetic */ zzahk zzR() {
        return (zzaga) zzf(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzahl
    public final /* synthetic */ zzahk zzS() {
        zzaga zzagaVar = (zzaga) zzf(5, null, null);
        zzagaVar.zzn(this);
        return zzagaVar;
    }

    @Override // com.google.android.recaptcha.internal.zzahl
    public final zzaht zzT() {
        return (zzaht) zzf(7, null, null);
    }

    public final void zzW() {
        zzahv.zza().zzb(getClass()).zzf(this);
        zzX();
    }

    public final void zzX() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzZ(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.recaptcha.internal.zzahl
    public final void zzaa(zzaeo zzaeoVar) {
        zzahv.zza().zzb(getClass()).zzj(this, zzaep.zza(zzaeoVar));
    }

    public final boolean zzac() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzahm
    public final boolean zzaj() {
        return zzd(this, true);
    }

    @Override // com.google.android.recaptcha.internal.zzahm
    public final /* synthetic */ zzahl zzak() {
        return (zzagg) zzf(6, null, null);
    }

    public abstract Object zzf(int i, Object obj, Object obj2);

    @Override // com.google.android.recaptcha.internal.zzadq
    public final int zzv(zzahz zzahzVar) {
        if (zzac()) {
            int iZza = zzahzVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            r6.g(p6.c(iZza, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zzahzVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        r6.g(p6.c(iZza2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final int zzz() {
        return zzahv.zza().zzb(getClass()).zzb(this);
    }
}
