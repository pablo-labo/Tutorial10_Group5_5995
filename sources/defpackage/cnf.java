package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class cnf {
    public static final cnf V;
    public static final cnf W;
    public static final cnf X;
    public static final cnf Y;
    public static final cnf Z;
    public static final cnf a;
    public static final cnf a0;
    public static final cnf b;
    public static final cnf b0;
    public static final cnf c;
    public static final cnf c0;
    public static final cnf d;
    public static final /* synthetic */ cnf[] d0;
    public static final cnf e;
    public static final cnf f;

    static {
        cnf cnfVar = new cnf("ARCHIVE_UNDO", 0);
        a = cnfVar;
        cnf cnfVar2 = new cnf("ARCHIVE_RETRY", 1);
        b = cnfVar2;
        cnf cnfVar3 = new cnf("RESTORE_UNDO", 2);
        c = cnfVar3;
        cnf cnfVar4 = new cnf("RESTORE_RETRY", 3);
        d = cnfVar4;
        cnf cnfVar5 = new cnf("ATTACHMENT_TOO_LARGE", 4);
        e = cnfVar5;
        cnf cnfVar6 = new cnf("ATTACHMENT_TOTAL_SIZE_LIMIT", 5);
        f = cnfVar6;
        cnf cnfVar7 = new cnf("ATTACHMENT_LIMIT_REACHED", 6);
        V = cnfVar7;
        cnf cnfVar8 = new cnf("ATTACHMENT_FILE_UPLOAD_FAILED", 7);
        W = cnfVar8;
        cnf cnfVar9 = new cnf("ATTACHMENT_PHOTO_UPLOAD_FAILED", 8);
        X = cnfVar9;
        cnf cnfVar10 = new cnf("ATTACHMENT_MULTI_UPLOAD_FAILED", 9);
        Y = cnfVar10;
        cnf cnfVar11 = new cnf("ATTACHMENT_DOWNLOAD_PREVIEW_FAILED", 10);
        Z = cnfVar11;
        cnf cnfVar12 = new cnf("SPAM_MOVED", 11);
        a0 = cnfVar12;
        cnf cnfVar13 = new cnf("SPAM_MOVE_FAILED", 12);
        cnf cnfVar14 = new cnf("SPAM_REPORTED_FAILED", 13);
        b0 = cnfVar14;
        cnf cnfVar15 = new cnf("CAMERA_PERMISSION_DENIED", 14);
        c0 = cnfVar15;
        d0 = new cnf[]{cnfVar, cnfVar2, cnfVar3, cnfVar4, cnfVar5, cnfVar6, cnfVar7, cnfVar8, cnfVar9, cnfVar10, cnfVar11, cnfVar12, cnfVar13, cnfVar14, cnfVar15};
    }

    public cnf() {
        throw null;
    }

    public static cnf valueOf(String str) {
        return (cnf) Enum.valueOf(cnf.class, str);
    }

    public static cnf[] values() {
        return (cnf[]) d0.clone();
    }
}
