package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class rji extends bei {
    public Long V;
    public Long W;
    public String d;
    public HashSet e;
    public ht0 f;

    @Override // defpackage.bei
    public final boolean i() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:378:0x0974, code lost:
    
        r0 = zzr().X;
        r2 = defpackage.ewh.l(r40.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0984, code lost:
    
        if (r12.s() == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0986, code lost:
    
        r3 = java.lang.Integer.valueOf(r12.t());
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x098f, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0990, code lost:
    
        r0.c("Invalid property filter ID. appId, id", r2, java.lang.String.valueOf(r3));
        r10 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0259 A[Catch: all -> 0x01ae, TRY_LEAVE, TryCatch #12 {all -> 0x01ae, blocks: (B:57:0x0197, B:59:0x01a4, B:69:0x01d0, B:70:0x01e0, B:100:0x023d, B:102:0x0259), top: B:420:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0197 A[Catch: all -> 0x01ae, SQLiteException -> 0x01b2, TRY_ENTER, TryCatch #12 {all -> 0x01ae, blocks: (B:57:0x0197, B:59:0x01a4, B:69:0x01d0, B:70:0x01e0, B:100:0x023d, B:102:0x0259), top: B:420:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1 A[Catch: all -> 0x0223, SQLiteException -> 0x022f, TRY_ENTER, TryCatch #1 {all -> 0x0223, blocks: (B:55:0x0191, B:67:0x01c1, B:68:0x01c6, B:73:0x01ef, B:77:0x01fb), top: B:406:0x0191 }] */
    /* JADX WARN: Type inference failed for: r0v183, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r5v44, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v60, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList l(java.lang.String r41, java.util.List r42, java.util.List r43, java.lang.Long r44, java.lang.Long r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rji.l(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mki m(int i) {
        if (this.f.containsKey(Integer.valueOf(i))) {
            return (mki) this.f.get(Integer.valueOf(i));
        }
        mki mkiVar = new mki(this, this.d);
        this.f.put(Integer.valueOf(i), mkiVar);
        return mkiVar;
    }
}
