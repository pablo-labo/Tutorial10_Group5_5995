package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzaeq implements zzagk {
    static final zzagk zza = new zzaeq();

    private zzaeq() {
    }

    @Override // com.google.android.recaptcha.internal.zzagk
    public final boolean zza(int i) {
        zzaer zzaerVar;
        zzaer zzaerVar2 = zzaer.EDITION_UNKNOWN;
        if (i == 0) {
            zzaerVar = zzaer.EDITION_UNKNOWN;
        } else if (i == 1) {
            zzaerVar = zzaer.EDITION_1_TEST_ONLY;
        } else if (i == 2) {
            zzaerVar = zzaer.EDITION_2_TEST_ONLY;
        } else if (i == 900) {
            zzaerVar = zzaer.EDITION_LEGACY;
        } else if (i != Integer.MAX_VALUE) {
            switch (i) {
                case 998:
                    zzaerVar = zzaer.EDITION_PROTO2;
                    break;
                case 999:
                    zzaerVar = zzaer.EDITION_PROTO3;
                    break;
                case 1000:
                    zzaerVar = zzaer.EDITION_2023;
                    break;
                case 1001:
                    zzaerVar = zzaer.EDITION_2024;
                    break;
                default:
                    switch (i) {
                        case 99997:
                            zzaerVar = zzaer.EDITION_99997_TEST_ONLY;
                            break;
                        case 99998:
                            zzaerVar = zzaer.EDITION_99998_TEST_ONLY;
                            break;
                        case 99999:
                            zzaerVar = zzaer.EDITION_99999_TEST_ONLY;
                            break;
                        default:
                            zzaerVar = null;
                            break;
                    }
                    break;
            }
        } else {
            zzaerVar = zzaer.EDITION_MAX;
        }
        return zzaerVar != null;
    }
}
