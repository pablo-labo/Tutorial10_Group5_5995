package defpackage;

import androidx.datastore.preferences.protobuf.n;

/* JADX INFO: loaded from: classes.dex */
public final class zic implements pp9 {
    public final sp9 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public zic(n nVar, String str, Object[] objArr) {
        this.a = nVar;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // defpackage.pp9
    public final boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.pp9
    public final sp9 b() {
        return this.a;
    }

    @Override // defpackage.pp9
    public final x5c c() {
        return (this.d & 1) == 1 ? x5c.a : x5c.b;
    }
}
