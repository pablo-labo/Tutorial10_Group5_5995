package defpackage;

import com.google.android.gms.fido.fido2.api.common.a;

/* JADX INFO: loaded from: classes2.dex */
public enum se4 implements a {
    /* JADX INFO: Fake field, exist only in values array */
    ED256(-260),
    /* JADX INFO: Fake field, exist only in values array */
    ED512(-261),
    /* JADX INFO: Fake field, exist only in values array */
    ED25519(-8),
    /* JADX INFO: Fake field, exist only in values array */
    ES256(-7),
    /* JADX INFO: Fake field, exist only in values array */
    ECDH_HKDF_256(-25),
    /* JADX INFO: Fake field, exist only in values array */
    ES384(-35),
    /* JADX INFO: Fake field, exist only in values array */
    ES512(-36);

    private final int zzb;

    se4(int i) {
        this.zzb = i;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.a
    public final int a() {
        return this.zzb;
    }
}
