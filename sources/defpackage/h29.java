package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum h29 {
    /* JADX INFO: Fake field, exist only in values array */
    COUNTRY("COUNTRY"),
    /* JADX INFO: Fake field, exist only in values array */
    ADMIN1("ADMIN1"),
    /* JADX INFO: Fake field, exist only in values array */
    ADMIN2("ADMIN2"),
    /* JADX INFO: Fake field, exist only in values array */
    ADMIN3("ADMIN3"),
    /* JADX INFO: Fake field, exist only in values array */
    ADMIN4("ADMIN4"),
    CITY("CITY"),
    /* JADX INFO: Fake field, exist only in values array */
    POSTAL_CODE("POSTAL_CODE"),
    /* JADX INFO: Fake field, exist only in values array */
    STATION("STATION"),
    /* JADX INFO: Fake field, exist only in values array */
    AIRPORT("AIRPORT"),
    /* JADX INFO: Fake field, exist only in values array */
    WATER("WATER"),
    /* JADX INFO: Fake field, exist only in values array */
    POSTAL_PLACE("POSTAL_PLACE"),
    /* JADX INFO: Fake field, exist only in values array */
    MISC("MISC"),
    /* JADX INFO: Fake field, exist only in values array */
    PRECISE_LOCATION("PRECISE_LOCATION"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");

    private final String rawValue;

    static {
        new bw4("LocationType", u63.a0("COUNTRY", "ADMIN1", "ADMIN2", "ADMIN3", "ADMIN4", "CITY", "POSTAL_CODE", "STATION", "AIRPORT", "WATER", "POSTAL_PLACE", "MISC", "PRECISE_LOCATION"));
    }

    h29(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
