package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum bv8 {
    NURSE("nurse"),
    NURSERY("nursery"),
    NURSING("nursing"),
    CNA("cna"),
    RN("rn"),
    LPN("lpn"),
    ACCOUNTANT("accountant"),
    ACCOUNTING("accounting"),
    ACCOUNTS_PAYABLE("accounts payable"),
    ACCOUNTS_RECEIVABLE("accounts receivable"),
    CPA("cpa"),
    DRIVER("driver"),
    BUS_OPERATOR("bus operator"),
    FORK_LIFT_OPERATOR("fork lift operator");

    private final String keyword;

    bv8(String str) {
        this.keyword = str;
    }

    public final String a() {
        return this.keyword;
    }
}
