package defpackage;

import defpackage.zpf;

/* JADX INFO: loaded from: classes.dex */
public final class upf {
    public final boolean a;
    public final String b;
    public final zpf.a c;
    public final int d;
    public final byte[] e;

    public upf(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4 = 1;
        ka2.l((i == 0) ^ (bArr2 == null));
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            switch (str) {
                case "cbc1":
                case "cbcs":
                    i4 = 2;
                    break;
                case "cenc":
                case "cens":
                    break;
                default:
                    zkd.T("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.c = new zpf.a(i4, i2, i3, bArr);
    }
}
