package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gai extends hlh implements jmi {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public gai(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        fib.b(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] h(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            g7.l(e);
            return null;
        }
    }

    @Override // defpackage.hlh
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            tn6 tn6VarZzd = zzd();
            parcel2.writeNoException();
            koh.b(parcel2, tn6VarZzd);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.a);
        return true;
    }

    public abstract byte[] e();

    public final boolean equals(Object obj) {
        tn6 tn6VarZzd;
        if (obj instanceof jmi) {
            try {
                jmi jmiVar = (jmi) obj;
                if (jmiVar.zze() == this.a && (tn6VarZzd = jmiVar.zzd()) != null) {
                    return Arrays.equals(e(), (byte[]) vna.h(tn6VarZzd));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // defpackage.jmi
    public final tn6 zzd() {
        return new vna(e());
    }

    @Override // defpackage.jmi
    public final int zze() {
        return this.a;
    }
}
