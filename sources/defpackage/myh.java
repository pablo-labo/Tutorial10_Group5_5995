package defpackage;

import com.google.android.gms.internal.firebase_remote_config.zzhq;
import com.google.android.gms.internal.firebase_remote_config.zzjy;
import defpackage.a5i;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class myh extends a5i<myh, a> implements a9i {
    private static volatile t9i<myh> zzml;
    private static final myh zznb;
    private int zzmg;
    private iyh zzmw;
    private iyh zzmx;
    private iyh zzmy;
    private kyh zzmz;
    private s5i<nyh> zzna = yai.c;

    public static final class a extends a5i.b<myh, a> {
    }

    static {
        myh myhVar = new myh();
        zznb = myhVar;
        a5i.b(myh.class, myhVar);
    }

    public static myh i(FileInputStream fileInputStream) throws zzhq {
        a2i q2iVar;
        myh myhVar = zznb;
        if (fileInputStream == null) {
            byte[] bArr = p5i.b;
            int length = bArr.length;
            q2iVar = new h2i(bArr, length);
            try {
                q2iVar.d(length);
            } catch (zzhq e) {
                b0.s(e);
                return null;
            }
        } else {
            q2iVar = new q2i(fileInputStream);
        }
        m3i m3iVarA = m3i.a();
        a5i a5iVar = (a5i) myhVar.g(4);
        try {
            oai oaiVar = oai.c;
            oaiVar.getClass();
            cbi cbiVarA = oaiVar.a(a5iVar.getClass());
            f4b f4bVar = q2iVar.d;
            if (f4bVar == null) {
                f4bVar = new f4b();
                f4bVar.c = 0;
                Charset charset = p5i.a;
                f4bVar.d = q2iVar;
                q2iVar.d = f4bVar;
            }
            cbiVarA.g(a5iVar, f4bVar, m3iVarA);
            oaiVar.getClass();
            oaiVar.a(a5iVar.getClass()).f(a5iVar);
            if (a5iVar.d()) {
                return (myh) a5iVar;
            }
            zzhq zzhqVar = new zzhq(new zzjy().getMessage());
            zzhqVar.a(a5iVar);
            throw zzhqVar;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzhq) {
                throw ((zzhq) e2.getCause());
            }
            zzhq zzhqVar2 = new zzhq(e2.getMessage());
            zzhqVar2.a(a5iVar);
            throw zzhqVar2;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof zzhq) {
                throw ((zzhq) e3.getCause());
            }
            throw e3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, t9i<myh>] */
    @Override // defpackage.a5i
    public final Object g(int i) {
        Object obj;
        switch (hyh.a[i - 1]) {
            case 1:
                return new myh();
            case 2:
                return new a(zznb);
            case 3:
                return new vai(zznb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u001b", new Object[]{"zzmg", "zzmw", "zzmx", "zzmy", "zzmz", "zzna", nyh.class});
            case 4:
                return zznb;
            case 5:
                t9i<myh> t9iVar = zzml;
                if (t9iVar != null) {
                    return t9iVar;
                }
                synchronized (myh.class) {
                    try {
                        t9i<myh> t9iVar2 = zzml;
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

    public final iyh j() {
        iyh iyhVar = this.zzmw;
        return iyhVar == null ? iyh.l() : iyhVar;
    }

    public final iyh k() {
        iyh iyhVar = this.zzmx;
        return iyhVar == null ? iyh.l() : iyhVar;
    }

    public final iyh l() {
        iyh iyhVar = this.zzmy;
        return iyhVar == null ? iyh.l() : iyhVar;
    }
}
