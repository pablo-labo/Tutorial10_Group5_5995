package defpackage;

import defpackage.knh;

/* JADX INFO: loaded from: classes2.dex */
public final class ioh implements qzh {
    public static final ioh a = new ioh();

    @Override // defpackage.qzh
    public final boolean zza(int i) {
        knh.b bVar;
        switch (i) {
            case 0:
                bVar = knh.b.UNKNOWN_MATCH_TYPE;
                break;
            case 1:
                bVar = knh.b.REGEXP;
                break;
            case 2:
                bVar = knh.b.BEGINS_WITH;
                break;
            case 3:
                bVar = knh.b.ENDS_WITH;
                break;
            case 4:
                bVar = knh.b.PARTIAL;
                break;
            case 5:
                bVar = knh.b.EXACT;
                break;
            case 6:
                bVar = knh.b.IN_LIST;
                break;
            default:
                bVar = null;
                break;
        }
        return bVar != null;
    }
}
