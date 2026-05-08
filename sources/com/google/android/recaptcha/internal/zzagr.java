package com.google.android.recaptcha.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class zzagr {
    public static final zzagr zza;
    public static final zzagr zzb;
    public static final zzagr zzc;
    public static final zzagr zzd;
    public static final zzagr zze;
    public static final zzagr zzf;
    public static final zzagr zzg;
    public static final zzagr zzh;
    public static final zzagr zzi;
    public static final zzagr zzj;
    private static final /* synthetic */ zzagr[] zzk;
    private final Class zzl;

    static {
        zzagr zzagrVar = new zzagr("VOID", 0, Void.class, Void.class, null);
        zza = zzagrVar;
        Class cls = Integer.TYPE;
        zzagr zzagrVar2 = new zzagr("INT", 1, cls, Integer.class, 0);
        zzb = zzagrVar2;
        zzagr zzagrVar3 = new zzagr("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzagrVar3;
        zzagr zzagrVar4 = new zzagr("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzagrVar4;
        zzagr zzagrVar5 = new zzagr("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzagrVar5;
        zzagr zzagrVar6 = new zzagr("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzagrVar6;
        zzagr zzagrVar7 = new zzagr("STRING", 6, String.class, String.class, "");
        zzg = zzagrVar7;
        zzagr zzagrVar8 = new zzagr("BYTE_STRING", 7, zzaef.class, zzaef.class, zzaef.zzb);
        zzh = zzagrVar8;
        zzagr zzagrVar9 = new zzagr("ENUM", 8, cls, Integer.class, null);
        zzi = zzagrVar9;
        zzagr zzagrVar10 = new zzagr("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzagrVar10;
        zzk = new zzagr[]{zzagrVar, zzagrVar2, zzagrVar3, zzagrVar4, zzagrVar5, zzagrVar6, zzagrVar7, zzagrVar8, zzagrVar9, zzagrVar10};
    }

    private zzagr(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzagr[] values() {
        return (zzagr[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
