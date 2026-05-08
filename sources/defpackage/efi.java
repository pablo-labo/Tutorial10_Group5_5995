package defpackage;

import com.google.android.gms.internal.firebase_remote_config.zzhq;
import com.google.android.gms.internal.firebase_remote_config.zzjy;
import defpackage.a5i;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class efi extends a5i<efi, a> implements a9i {
    private static final efi zzaac;
    private static volatile t9i<efi> zzml;
    private int zzaaa;
    private long zzzr;
    private long zzzt;
    private long zzzu;
    private String zzzo = "";
    private String zzzq = "";
    private String zzzs = "";
    private String zzzv = "";
    private String zzzw = "";
    private String zzzx = "";
    private String zzzy = "";
    private String zzzz = "";
    private s5i<dfi> zzaab = yai.c;

    public static final class a extends a5i.b<efi, a> {
    }

    static {
        efi efiVar = new efi();
        zzaac = efiVar;
        a5i.b(efi.class, efiVar);
    }

    public static efi i(byte[] bArr) throws zzhq {
        efi efiVar = zzaac;
        int length = bArr.length;
        m3i m3iVarA = m3i.a();
        a5i a5iVar = (a5i) efiVar.g(4);
        try {
            oai oaiVar = oai.c;
            oaiVar.getClass();
            oaiVar.a(a5iVar.getClass()).e(a5iVar, bArr, 0, length, new d0i(m3iVarA));
            oaiVar.getClass();
            oaiVar.a(a5iVar.getClass()).f(a5iVar);
            if (a5iVar.zzoj != 0) {
                throw new RuntimeException();
            }
            if (a5iVar.d()) {
                return (efi) a5iVar;
            }
            zzhq zzhqVar = new zzhq(new zzjy().getMessage());
            zzhqVar.a(a5iVar);
            throw zzhqVar;
        } catch (IOException e) {
            if (e.getCause() instanceof zzhq) {
                throw ((zzhq) e.getCause());
            }
            zzhq zzhqVar2 = new zzhq(e.getMessage());
            zzhqVar2.a(a5iVar);
            throw zzhqVar2;
        } catch (IndexOutOfBoundsException unused) {
            zzhq zzhqVarB = zzhq.b();
            zzhqVarB.a(a5iVar);
            throw zzhqVarB;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, t9i<efi>] */
    @Override // defpackage.a5i
    public final Object g(int i) {
        Object obj;
        switch (ifi.a[i - 1]) {
            case 1:
                return new efi();
            case 2:
                return new a(zzaac);
            case 3:
                return new vai(zzaac, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\f\r\u001b", new Object[]{"zzzo", "zzzq", "zzzr", "zzzs", "zzzt", "zzzu", "zzzv", "zzzw", "zzzx", "zzzy", "zzzz", "zzaaa", "zzaab", dfi.class});
            case 4:
                return zzaac;
            case 5:
                t9i<efi> t9iVar = zzml;
                if (t9iVar != null) {
                    return t9iVar;
                }
                synchronized (efi.class) {
                    try {
                        t9i<efi> t9iVar2 = zzml;
                        obj = t9iVar2;
                        if (t9iVar2 == null) {
                            ?? aVar = new a5i.a();
                            zzml = aVar;
                            obj = aVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return obj;
            case 6:
                return (byte) 1;
            default:
                b0.l();
            case 7:
                return null;
        }
    }

    public final String j() {
        return this.zzzo;
    }

    public final String k() {
        return this.zzzq;
    }

    public final long l() {
        return this.zzzr;
    }

    public final String m() {
        return this.zzzs;
    }

    public final long n() {
        return this.zzzt;
    }

    public final long o() {
        return this.zzzu;
    }
}
