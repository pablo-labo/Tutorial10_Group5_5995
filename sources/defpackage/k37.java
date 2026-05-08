package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class k37 implements ntc {
    public final /* synthetic */ int a = 1;
    public int b;

    public k37(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        r2 = (com.facebook.soloader.a) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        android.util.Log.e("SoLoader", "Preparing BackupSoSource for the first time BackupSoSource");
        r2.e(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        r8 = r10.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r1 >= r8) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        r9 = r10[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if ((r9 instanceof defpackage.p54) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        if ((r9 instanceof com.facebook.soloader.a) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        ((defpackage.p54) r9).b |= 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        android.util.Log.e("SoLoader", "Encountered an exception while reunpacking BackupSoSource BackupSoSource for library " + r0 + ": ", r8);
     */
    @Override // defpackage.ntc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.lang.UnsatisfiedLinkError r9, defpackage.ene[] r10) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k37.b(java.lang.UnsatisfiedLinkError, ene[]):boolean");
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.b)}, 1));
            default:
                return super.toString();
        }
    }

    public /* synthetic */ k37() {
    }
}
